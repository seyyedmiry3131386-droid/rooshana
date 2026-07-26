/**
 * svg.js — یک SVG builder کوچک و بدون وابستگی.
 *
 * چرا خودمان بنویسیم؟ چون برای «تولید کاراکتر» فقط به چند تابع خالص نیاز داریم:
 * ساخت تگ، گروه، و defs. این ماژول در Node و مرورگر یکسان کار می‌کند و
 * خروجی‌اش رشته‌ی SVG تمیز و قابل‌کنترل است.
 */

const SELF_CLOSING = new Set([
  'path', 'circle', 'ellipse', 'rect', 'line', 'polyline', 'polygon',
  'stop', 'use', 'image', 'feGaussianBlur', 'feOffset', 'feBlend',
  'feComposite', 'feColorMatrix', 'feturbulence', 'feTurbulence',
  'feDisplacementMap', 'feFlood', 'feMorphology', 'animate', 'animateTransform',
]);

const escapeAttr = (v) =>
  String(v)
    .replace(/&/g, '&amp;')
    .replace(/"/g, '&quot;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;');

export const escapeText = (v) =>
  String(v).replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;');

function attrsToString(attrs = {}) {
  return Object.entries(attrs)
    .filter(([, v]) => v !== undefined && v !== null && v !== false)
    .map(([k, v]) => `${k}="${escapeAttr(v)}"`)
    .join(' ');
}

/**
 * ساخت یک تگ SVG.
 * @param {string} name نام تگ
 * @param {object} attrs ویژگی‌ها
 * @param {string|string[]} children محتوای داخلی
 */
export function tag(name, attrs = {}, children = '') {
  const a = attrsToString(attrs);
  const open = a ? `<${name} ${a}` : `<${name}`;
  const kids = Array.isArray(children) ? children.filter(Boolean).join('\n') : children;
  if (!kids && SELF_CLOSING.has(name)) return `${open} />`;
  return `${open}>${kids ? `\n${indent(kids)}\n` : ''}</${name}>`;
}

export const indent = (s, pad = '  ') =>
  String(s)
    .split('\n')
    .map((line) => (line.trim() ? pad + line : line))
    .join('\n');

export const g = (attrs, children) => tag('g', attrs, children);
export const path = (d, attrs = {}) => tag('path', { d, ...attrs });
export const circle = (cx, cy, r, attrs = {}) => tag('circle', { cx, cy, r, ...attrs });
export const ellipse = (cx, cy, rx, ry, attrs = {}) => tag('ellipse', { cx, cy, rx, ry, ...attrs });
export const rect = (x, y, width, height, attrs = {}) =>
  tag('rect', { x, y, width, height, ...attrs });
export const defs = (children) => tag('defs', {}, children);

/** گرادیان خطی؛ stops = [[offset, color, opacity?], ...] */
export function linearGradient(id, stops, { x1 = '0%', y1 = '0%', x2 = '0%', y2 = '100%', ...rest } = {}) {
  return tag(
    'linearGradient',
    { id, x1, y1, x2, y2, ...rest },
    stops.map(([offset, color, opacity]) =>
      tag('stop', {
        offset: typeof offset === 'number' ? `${offset * 100}%` : offset,
        'stop-color': color,
        'stop-opacity': opacity,
      }),
    ),
  );
}

/** گرادیان شعاعی */
export function radialGradient(id, stops, { cx = '50%', cy = '50%', r = '50%', fx, fy, ...rest } = {}) {
  return tag(
    'radialGradient',
    { id, cx, cy, r, fx, fy, ...rest },
    stops.map(([offset, color, opacity]) =>
      tag('stop', {
        offset: typeof offset === 'number' ? `${offset * 100}%` : offset,
        'stop-color': color,
        'stop-opacity': opacity,
      }),
    ),
  );
}

/** فیلتر بلور نرم — برای سایه‌های محیطی و درخشش */
export const blurFilter = (id, stdDeviation = 6) =>
  tag('filter', { id, x: '-40%', y: '-40%', width: '180%', height: '180%' },
    tag('feGaussianBlur', { in: 'SourceGraphic', stdDeviation }));

/**
 * فیلتر بافت (grain) — امضای تصویری کارهای حرفه‌ای.
 * نویز پاستلی روی سطوح، خروجی را از حالت «فلتِ خشک» درمی‌آورد.
 */
export const grainFilter = (id, baseFrequency = 0.9, opacity = 0.35) =>
  tag('filter', { id, x: '0%', y: '0%', width: '100%', height: '100%' }, [
    tag('feTurbulence', { type: 'fractalNoise', baseFrequency, numOctaves: 3, stitchTiles: 'stitch', result: 'noise' }),
    tag('feColorMatrix', { in: 'noise', type: 'saturate', values: '0', result: 'mono' }),
    tag('feComponentTransfer', { in: 'mono', result: 'faded' },
      tag('feFuncA', { type: 'linear', slope: opacity })),
    tag('feBlend', { in: 'SourceGraphic', in2: 'faded', mode: 'multiply' }),
  ]);

/** ماسک از روی یک مسیر — برای محدود کردن سایه‌ها داخل صورت/لباس */
export const maskFromPath = (id, d, { fill = '#fff' } = {}) =>
  tag('mask', { id, maskUnits: 'userSpaceOnUse' }, path(d, { fill }));

export const clipFromPath = (id, d) =>
  tag('clipPath', { id, clipPathUnits: 'userSpaceOnUse' }, path(d));

/**
 * سند نهایی SVG.
 *
 * نکته‌ی مهم: idهای title/desc باید یکتا باشند. اگر دو SVG در یک صفحه قرار
 * بگیرند و هر دو id="title" داشته باشند، HTML نامعتبر می‌شود و
 * aria-labelledby به عنصر اشتباه اشاره می‌کند. پس با idPrefix یکتاشان می‌کنیم.
 */
export function svgDocument({
  width, height, viewBox, children, title, desc, style = '', idPrefix = 'svg',
}) {
  const titleId = `${idPrefix}-title`;
  const descId = `${idPrefix}-desc`;
  const head = [
    title ? tag('title', { id: titleId }, escapeText(title)) : '',
    desc ? tag('desc', { id: descId }, escapeText(desc)) : '',
    style ? tag('style', {}, `\n${style}\n`) : '',
  ].filter(Boolean);

  return tag(
    'svg',
    {
      xmlns: 'http://www.w3.org/2000/svg',
      width,
      height,
      viewBox,
      role: 'img',
      'aria-labelledby': [title ? titleId : '', desc ? descId : ''].filter(Boolean).join(' ') || undefined,
    },
    [...head, ...(Array.isArray(children) ? children : [children])],
  );
}
