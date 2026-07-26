/**
 * generate.js — ترکیب همه‌ی اجزا در یک کاراکتر کامل.
 *
 * ترتیب لایه‌ها (از عقب به جلو) دقیقاً مثل نقاشی دیجیتال است:
 *   پس‌زمینه → مو(پشت) → بدن → گردن → صورت → سایه‌ها → اجزا → مو(جلو) → نور کلی
 * همین ترتیب، بیشتر از خودِ شکل‌ها، «حرفه‌ای بودن» خروجی را تعیین می‌کند.
 */

import {
  g, path, circle, ellipse, rect, defs, svgDocument,
  linearGradient, radialGradient, blurFilter, grainFilter, tag,
} from '../core/svg.js';
import { P, smoothClosedPath, ellipsePath, onCircle, n } from '../core/path.js';
import { shade, tint, mix, alpha, harmony } from '../core/color.js';
import { createRng } from '../core/rng.js';
import { THEMES, THEME_NAMES, SKIN_TONES, HAIR_COLORS, EYE_COLORS } from './palettes.js';
import {
  buildFacePath, neck, ears, eye, brow, nose, mouth, blush,
  hairBack, hairFront, torso, glasses, freckles, earrings, AXIS,
} from './features.js';

export const HAIR_STYLES = ['short', 'bob', 'long', 'wavy', 'curly', 'bun'];
export const GARMENT_STYLES = ['tee', 'vneck'];

/** حالت‌های احساسی آماده — هرکدام فقط چند عدد را تغییر می‌دهند */
export const EXPRESSIONS = {
  //           لبخند   بالا رفتن ابرو  اخم   بازی چشم  بازی دهان
  calm:      { smile: 0.4,  browLift: 0.15, browFurrow: 0,    openness: 1.0,  mouthOpen: 0 },
  happy:     { smile: 1.0,  browLift: 0.5,  browFurrow: 0,    openness: 0.84, mouthOpen: 0.45 },
  focused:   { smile: 0.12, browLift: 0.0,  browFurrow: 0.75, openness: 0.96, mouthOpen: 0 },
  surprised: { smile: 0.25, browLift: 1.0,  browFurrow: 0,    openness: 1.2,  mouthOpen: 0.75 },
  sly:       { smile: 0.75, browLift: 0.2,  browFurrow: 0.15, openness: 0.7,  mouthOpen: 0 },
};

/**
 * ساخت کاراکتر.
 * @param {object} options
 * @param {string} options.seed رشته‌ی seed — همان seed همیشه همان کاراکتر
 * @returns {{svg: string, spec: object}}
 */
export function createCharacter(options = {}) {
  const seed = options.seed ?? 'rooshana';
  const rng = createRng(seed);

  // ---- ۱) انتخاب مشخصات: هر مقدارِ نامشخص، از rng می‌آید (قطعی) ----
  const themeName = options.theme ?? rng.pick(THEME_NAMES);
  const theme = THEMES[themeName] ?? THEMES.sunlit;

  const spec = {
    seed,
    theme: themeName,
    size: options.size ?? 400,
    skin: options.skin ?? theme.skin,
    hair: options.hair ?? theme.hair,
    hairStyle: options.hairStyle ?? rng.pick(HAIR_STYLES),
    eyeColor: options.eyeColor ?? theme.eye,
    lip: options.lip ?? theme.lip,
    garment: options.garment ?? theme.garment,
    garmentAccent: options.garmentAccent ?? theme.garmentAccent,
    garmentStyle: options.garmentStyle ?? rng.pick(GARMENT_STYLES),
    background: options.background ?? theme.background,
    accent: options.accent ?? theme.accent,
    expression: options.expression ?? rng.pick(Object.keys(EXPRESSIONS)),
    faceShape: options.faceShape ?? rng.float(0.25, 0.8),
    jaw: options.jaw ?? rng.float(0.3, 0.75),
    eyeSpacing: options.eyeSpacing ?? rng.float(0.92, 1.08),
    irisScale: options.irisScale ?? rng.float(0.9, 1.12),
    glasses: options.glasses ?? rng.bool(0.28),
    freckles: options.freckles ?? rng.bool(0.35),
    earrings: options.earrings ?? rng.bool(0.4),
    blush: options.blush ?? rng.bool(0.75),
    browThickness: options.browThickness ?? rng.float(0.85, 1.15),
    grain: options.grain ?? true,
    backgroundShape: options.backgroundShape ?? rng.pick(['circle', 'blob', 'arch', 'none']),
  };

  const expr = { ...EXPRESSIONS[spec.expression] ?? EXPRESSIONS.calm, ...(options.expressionOverrides ?? {}) };
  const ids = `c${Math.abs(hashCode(seed)).toString(36)}`;
  const S = 1;             // ضریب مقیاس داخلی (بوم همیشه 400×400)
  const cy = 172;          // مرکز عمودی صورت
  const skin = spec.skin;
  // ابرو/مژه هم‌خانواده‌ی مو ولی کمی گرم‌تر — نه سیاهِ مطلق
  const browColor = mix(shade(spec.hair, 0.05), '#3a2b2b', 0.25);

  // ---- ۲) تعریف‌های مشترک (گرادیان‌ها، فیلترها، ماسک‌ها) ----
  const bg = Array.isArray(spec.background) ? spec.background : [spec.background, shade(spec.background, 0.12)];
  const facePath = buildFacePath({ faceShape: spec.faceShape, jaw: spec.jaw, cy, size: S });

  const definitions = defs([
    linearGradient(`${ids}-bg`, [[0, bg[0]], [1, bg[1]]], { x1: '0%', y1: '0%', x2: '30%', y2: '100%' }),
    radialGradient(`${ids}-bgGlow`, [[0, alpha('#ffffff', 0.55)], [1, alpha('#ffffff', 0)]], { cx: '50%', cy: '38%', r: '58%' }),
    linearGradient(`${ids}-skin`, [
      [0, tint(skin, 0.07)],
      [0.55, skin],
      [1, shade(skin, 0.08)],
    ], { x1: '25%', y1: '0%', x2: '75%', y2: '100%' }),
    radialGradient(`${ids}-iris`, [
      [0, tint(spec.eyeColor, 0.26)],
      [0.55, spec.eyeColor],
      [1, shade(spec.eyeColor, 0.28)],
    ], { cx: '50%', cy: '42%', r: '62%' }),
    linearGradient(`${ids}-garment`, [[0, tint(spec.garment, 0.06)], [1, shade(spec.garment, 0.1)]]),
    blurFilter(`${ids}-soft`, 7),
    blurFilter(`${ids}-blush`, 5),
    blurFilter(`${ids}-shadow`, 9),
    grainFilter(`${ids}-grain`, 0.85, 0.16),
    tag('clipPath', { id: `${ids}-face` }, path(facePath)),
    tag('clipPath', { id: `${ids}-frame` }, rect(0, 0, 400, 400, { rx: 0 })),
  ]);

  // ---- ۳) پس‌زمینه ----
  const backdrop = buildBackground({ ids, spec, rng, bg });

  // ---- ۴) موقعیت اجزای صورت (همه نسبت به cy) ----
  const eyeY = cy + 8;
  const eyeDx = 32 * spec.eyeSpacing;
  const browY = eyeY - 24;
  const noseY = cy + 34;
  const mouthY = cy + 58;

  const faceGroup = g({ 'data-part': 'face' }, [
    // سایه‌ی پرتاب‌شده‌ی مو روی پیشانی — عمق‌سازِ اصلی
    path(facePath, { fill: `url(#${ids}-skin)` }),
    g({ 'clip-path': `url(#${ids}-face)` }, [
      // سایه‌ی موها روی پیشانی. نکته: سایه‌ی پوست را «نارنجی‌تر» نکن —
      // اشباع را کم و رنگ‌مایه را کمی بنفش/سرد کن، وگرنه نوارِ نارنجی می‌افتد.
      ellipse(AXIS, cy - 76, 94, 36, {
        fill: mix(shade(skin, 0.1, -26), '#8b6f8f', 0.28),
        opacity: 0.34,
        filter: `url(#${ids}-soft)`,
      }),
      // سایه‌ی کناری (نور از بالا-چپ می‌آید، پس راست تیره‌تر است)
      path(
        smoothClosedPath([
          P(AXIS + 30, cy - 110), P(AXIS + 100, cy - 60),
          P(AXIS + 100, cy + 110), P(AXIS + 40, cy + 96),
          P(AXIS + 62, cy + 10),
        ], 1),
        { fill: mix(shade(skin, 0.09, -22), '#8b6f8f', 0.2), opacity: 0.36, filter: `url(#${ids}-soft)` },
      ),
      // نورِ لبه‌ی چپ
      path(
        smoothClosedPath([
          P(AXIS - 92, cy - 40), P(AXIS - 62, cy - 92),
          P(AXIS - 52, cy - 84), P(AXIS - 80, cy - 34),
          P(AXIS - 70, cy + 50), P(AXIS - 86, cy + 40),
        ], 1),
        { fill: tint(skin, 0.16), opacity: 0.55, filter: `url(#${ids}-soft)` },
      ),
    ]),
  ]);

  const featureGroup = g({ 'data-part': 'features' }, [
    spec.blush ? blush({ x: AXIS - eyeDx - 8, y: eyeY + 26, size: S, color: spec.lip, blurId: `${ids}-blush` }) : '',
    spec.blush ? blush({ x: AXIS + eyeDx + 8, y: eyeY + 26, size: S, color: spec.lip, blurId: `${ids}-blush` }) : '',
    spec.freckles ? freckles({ x: AXIS, y: noseY - 4, size: S, skin, rng }) : '',
    nose({ x: AXIS, y: noseY, size: S, skin }),
    eye({
      x: AXIS - eyeDx, y: eyeY, size: S, iris: spec.eyeColor,
      openness: expr.openness, irisScale: spec.irisScale, ids,
      lash: shade(spec.hair, 0.1),
    }),
    eye({
      x: AXIS + eyeDx, y: eyeY, size: S, iris: spec.eyeColor,
      openness: expr.openness, irisScale: spec.irisScale, ids,
      lash: shade(spec.hair, 0.1),
    }),
    brow({
      x: AXIS - eyeDx, y: browY, size: S, color: browColor,
      lift: expr.browLift, furrow: expr.browFurrow ?? 0, thickness: spec.browThickness, mirror: true,
    }),
    brow({
      x: AXIS + eyeDx, y: browY, size: S, color: browColor,
      lift: expr.browLift, furrow: expr.browFurrow ?? 0, thickness: spec.browThickness,
    }),
    mouth({ x: AXIS, y: mouthY, size: S, lip: spec.lip, smile: expr.smile, open: expr.mouthOpen, skin }),
  ]);

  // ---- ۵) چیدن لایه‌ها ----
  const character = g({ 'data-part': 'character' }, [
    hairBack({ style: spec.hairStyle, color: spec.hair, cy, size: S, faceShape: spec.faceShape }),
    torso({
      garment: `url(#${ids}-garment)`,
      garmentColor: spec.garment,
      accent: spec.garmentAccent, skin,
      cy, size: S, style: spec.garmentStyle,
    }),
    neck({ skin, cy, size: S }),
    ears({ skin, cy, size: S, faceShape: spec.faceShape }),
    spec.earrings ? earrings({ cy, size: S, faceShape: spec.faceShape, color: spec.garmentAccent }) : '',
    faceGroup,
    featureGroup,
    hairFront({ style: spec.hairStyle, color: spec.hair, cy, size: S, faceShape: spec.faceShape, part: rng.float(0.2, 0.5) }),
    spec.glasses ? glasses({ cy, size: S, eyeY, eyeDx, frame: shade(spec.garmentAccent, 0.4) }) : '',
  ]);

  // ---- ۶) نور و بافت نهایی روی کل تصویر ----
  const finish = g({ 'data-part': 'finish', 'pointer-events': 'none' }, [
    // vignette ملایم: گوشه‌ها کمی تیره → تمرکز روی چهره
    rect(0, 0, 400, 400, { fill: `url(#${ids}-vignette)` }),
  ]);

  const vignette = radialGradient(`${ids}-vignette`, [
    [0, alpha('#000000', 0)],
    [0.7, alpha('#000000', 0)],
    [1, alpha(shade(bg[1], 0.3), 0.28)],
  ], { cx: '50%', cy: '45%', r: '72%' });

  const children = [
    definitions,
    tag('defs', {}, vignette),
    g({ 'clip-path': `url(#${ids}-frame)`, filter: spec.grain ? `url(#${ids}-grain)` : undefined }, [
      backdrop,
      character,
      finish,
    ]),
  ];

  const svg = svgDocument({
    width: spec.size,
    height: spec.size,
    viewBox: '0 0 400 400',
    title: `Character portrait (${spec.expression}, ${spec.hairStyle} hair)`,
    desc: `Procedurally generated SVG character from seed "${seed}" using the ${themeName} palette.`,
    idPrefix: ids,
    children,
  });

  return { svg, spec };
}

/* ------------------------------------------------------------------ */

function buildBackground({ ids, spec, rng, bg }) {
  const layers = [rect(0, 0, 400, 400, { fill: `url(#${ids}-bg)` })];
  const pal = harmony(spec.accent);

  if (spec.backgroundShape === 'circle') {
    layers.push(circle(200, 186, 138, { fill: alpha(pal.analogA, 0.5) }));
    layers.push(circle(200, 186, 138, { fill: 'none', stroke: alpha('#ffffff', 0.35), 'stroke-width': 3 }));
  } else if (spec.backgroundShape === 'blob') {
    const pts = [];
    const count = 8;
    for (let i = 0; i < count; i += 1) {
      const a = (i / count) * 360;
      const r = rng.float(122, 158);
      pts.push(onCircle(200, 190, r, a));
    }
    layers.push(path(smoothClosedPath(pts, 1), { fill: alpha(pal.analogA, 0.55) }));
  } else if (spec.backgroundShape === 'arch') {
    layers.push(path(
      `M 62 400 L 62 190 A 138 138 0 0 1 338 190 L 338 400 Z`,
      { fill: alpha(pal.analogA, 0.5) },
    ));
  }

  // ذرات تزئینی — پراکندگی قطعی از روی seed
  const dots = [];
  for (let i = 0; i < 14; i += 1) {
    const p = onCircle(200, 190, rng.float(150, 200), rng.float(0, 360));
    dots.push(circle(p.x, p.y, rng.float(1.6, 4.6), {
      fill: i % 3 === 0 ? spec.accent : '#ffffff',
      opacity: rng.float(0.18, 0.5),
    }));
  }
  layers.push(g({ 'data-part': 'sparkles' }, dots));

  // درخشش نرم بالای سر (نورِ محیطی)
  layers.push(rect(0, 0, 400, 400, { fill: `url(#${ids}-bgGlow)` }));
  return g({ 'data-part': 'background' }, layers);
}

function hashCode(str) {
  let h = 0;
  for (let i = 0; i < str.length; i += 1) {
    h = (Math.imul(31, h) + str.charCodeAt(i)) | 0;
  }
  return h;
}

export { THEMES, THEME_NAMES, SKIN_TONES, HAIR_COLORS, EYE_COLORS };
