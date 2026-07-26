/**
 * features.js — اجزای کاراکتر، هرکدام یک تابع خالص که رشته‌ی SVG برمی‌گرداند.
 *
 * سیستم مختصات: بوم 400×400، محور تقارن صورت x = 200.
 * هر جزء «پارامتریک» است: با تغییر عددها، شخصیت عوض می‌شود، نه اینکه بشکند.
 */

import { g, path, circle, ellipse, tag } from '../core/svg.js';
import {
  P, smoothClosedPath, smoothOpenPath, symmetricShape, ellipsePath, arcBetween, n,
} from '../core/path.js';
import { shade, tint, mix, alpha } from '../core/color.js';

const AXIS = 200;

/* ------------------------------------------------------------------ *
 * سر و گردن
 * ------------------------------------------------------------------ */

/**
 * ساخت مسیر صورت. faceShape بین 0 (بیضی کشیده) تا 1 (گرد و پهن) تغییر می‌کند،
 * jaw فکِ زاویه‌دار در برابر گرد را کنترل می‌کند.
 */
export function buildFacePath({ faceShape = 0.5, jaw = 0.5, cy = 178, size = 1 } = {}) {
  const w = (74 + faceShape * 16) * size;   // نیم‌عرض گونه
  const h = (92 + (1 - faceShape) * 12) * size; // نیم‌ارتفاع
  const jawW = w * (0.52 + jaw * 0.3);      // عرض فک
  const chinW = w * (0.2 + jaw * 0.16);     // پهنای چانه

  // نیمه‌ی راستِ صورت، از بالای سر تا نوکِ چانه
  const rightHalf = [
    P(AXIS, cy - h),                       // فرق سر
    P(AXIS + w * 0.62, cy - h * 0.86),     // پیشانی
    P(AXIS + w * 0.96, cy - h * 0.4),      // شقیقه
    P(AXIS + w, cy - h * 0.02),            // گونه (پهن‌ترین نقطه)
    P(AXIS + w * 0.93, cy + h * 0.3),      // زیر گونه
    P(AXIS + jawW, cy + h * 0.62),         // زاویه‌ی فک
    P(AXIS + chinW, cy + h * 0.93),        // کنار چانه
    P(AXIS, cy + h),                       // نوک چانه
  ];
  return symmetricShape(rightHalf, AXIS, 1);
}

/** گردن + سایه‌ی زیرِ چانه (سایه، عمق می‌سازد) */
export function neck({ skin, cy = 178, size = 1, width = 30 }) {
  const top = cy + 66 * size;
  const bottom = cy + 128 * size;
  const w = width * size;
  const d = smoothClosedPath([
    P(AXIS - w, top),
    P(AXIS - w * 1.05, bottom),
    P(AXIS + w * 1.05, bottom),
    P(AXIS + w, top),
  ], 0.6);

  return g({ 'data-part': 'neck' }, [
    path(d, { fill: shade(skin, 0.06) }),
    // سایه‌ی پرتاب‌شده‌ی چانه روی گردن
    path(
      smoothClosedPath([
        P(AXIS - w * 1.02, top - 4),
        P(AXIS - w * 0.7, top + 20 * size),
        P(AXIS, top + 27 * size),
        P(AXIS + w * 0.7, top + 20 * size),
        P(AXIS + w * 1.02, top - 4),
      ], 0.9),
      { fill: shade(skin, 0.16), opacity: 0.85 },
    ),
  ]);
}

/** گوش‌ها */
export function ears({ skin, cy = 178, size = 1, faceShape = 0.5 }) {
  const w = (74 + faceShape * 16) * size;
  const y = cy + 4 * size;
  const r = 13 * size;
  const one = (sign) =>
    g({ transform: `translate(${n(AXIS + sign * w * 0.97)} ${n(y)})` }, [
      path(ellipsePath(0, 0, r * 0.78, r * 1.12), { fill: skin }),
      path(ellipsePath(sign * 1.5, 1, r * 0.4, r * 0.66), {
        fill: shade(skin, 0.14),
        opacity: 0.75,
      }),
    ]);
  return g({ 'data-part': 'ears' }, [one(-1), one(1)]);
}

/* ------------------------------------------------------------------ *
 * چشم‌ها
 * ------------------------------------------------------------------ */

/**
 * چشم بادامی با: سفیدی، عنبیه‌ی گرادیانی، مردمک، دو هایلایت، پلک بالا و مژه.
 * دو هایلایت (یکی بزرگ، یکی ریز در جهت مخالف) حسِ «زنده بودن» می‌دهد.
 */
export function eye({
  x, y, size = 1, iris, sclera = '#fdfbf7', lash = '#2a2028',
  openness = 1, irisScale = 1, ids,
}) {
  const w = 21 * size;
  const h = 13 * size * openness;

  const lidPath = smoothClosedPath([
    P(x - w, y + 1),
    P(x - w * 0.5, y - h),
    P(x + w * 0.45, y - h * 0.92),
    P(x + w, y + 1),
    P(x + w * 0.45, y + h * 0.86),
    P(x - w * 0.5, y + h * 0.92),
  ], 1);

  const irisR = 8.4 * size * irisScale;
  const clipId = `${ids}-eyeclip-${Math.round(x)}`;

  return g({ 'data-part': 'eye' }, [
    tag('clipPath', { id: clipId }, path(lidPath)),
    path(lidPath, { fill: sclera }),
    g({ 'clip-path': `url(#${clipId})` }, [
      // سایه‌ی پلک روی سفیدی چشم — بدون این، چشم «چسبانده‌شده» به نظر می‌رسد
      path(
        smoothClosedPath([
          P(x - w, y - 2), P(x - w * 0.5, y - h * 1.2),
          P(x + w * 0.45, y - h * 1.1), P(x + w, y - 2),
          P(x + w * 0.4, y - h * 0.25), P(x - w * 0.45, y - h * 0.2),
        ], 1),
        { fill: alpha('#3a2b33', 0.16) },
      ),
      circle(x, y + 0.5, irisR, { fill: `url(#${ids}-iris)` }),
      circle(x, y + 0.5, irisR, { fill: 'none', stroke: shade(iris, 0.22), 'stroke-width': 1.1 * size }),
      circle(x, y + 0.5, irisR * 0.44, { fill: '#160f14' }),
      // هایلایت اصلی (بالا-چپ) + هایلایت ثانویه (پایین-راست)
      circle(x - irisR * 0.36, y - irisR * 0.38, irisR * 0.3, { fill: '#ffffff', opacity: 0.95 }),
      circle(x + irisR * 0.42, y + irisR * 0.4, irisR * 0.15, { fill: '#ffffff', opacity: 0.6 }),
    ]),
    // خط پلک بالا؛ ضخیم‌تر در گوشه‌ی بیرونی = ظرافت
    path(
      smoothOpenPath([
        P(x - w, y + 0.5), P(x - w * 0.5, y - h), P(x + w * 0.45, y - h * 0.92), P(x + w, y + 1),
      ], 1),
      { fill: 'none', stroke: lash, 'stroke-width': 2.6 * size, 'stroke-linecap': 'round' },
    ),
    // مژه‌ی گوشه‌ی بیرونی
    path(
      smoothOpenPath([P(x + w * 0.72, y - h * 0.62), P(x + w * 1.12, y - h * 0.95)], 1),
      { fill: 'none', stroke: lash, 'stroke-width': 2.1 * size, 'stroke-linecap': 'round' },
    ),
  ]);
}

/**
 * ابرو — مستقیم‌ترین ابزار بیان احساس.
 *
 * دو درسِ مهم که در رندر اول یاد گرفتیم:
 *  ۱) اگر سرِ داخلی ابرو پایین‌تر از دُم باشد، چهره «همیشه‌عصبانی» می‌شود.
 *     پس در حالت خنثی، سر و دُم تقریباً هم‌ارتفاع‌اند و فقط قوس بالا می‌رود.
 *  ۲) ابروی «خط با ضخامت ثابت» مصنوعی است. ابروی واقعی نوار باریک‌شونده است:
 *     سرِ ضخیم → قوس → دُمِ نازک. اینجا با یک مسیر پرشده (ribbon) می‌سازیمش.
 *
 * @param {number} lift   بالا بردن کل ابرو (تعجب)
 * @param {number} furrow پایین آوردنِ فقط سرِ داخلی (اخم/تمرکز)
 */
export function brow({
  x, y, size = 1, color, lift = 0, furrow = 0, thickness = 1, mirror = false,
}) {
  const s = mirror ? -1 : 1;          // s = -1 → ابروی سمت چپ (قرینه)
  const w = 23 * size;
  const base = y - lift * 5 * size;
  const drop = furrow * 7 * size;     // فقط روی سرِ داخلی اثر می‌گذارد

  // خط مرکزی از سرِ داخلی (نزدیک بینی) تا دُمِ بیرونی
  const spine = [
    P(x - s * w * 1.0,  base - 2.4 * size + drop),        // سر (کمی بالاتر از دُم = چهره‌ی آرام)
    P(x - s * w * 0.36, base - 4.4 * size + drop * 0.3),
    P(x + s * w * 0.34, base - 5.8 * size),               // قوس
    P(x + s * w * 0.78, base - 3.4 * size),
    P(x + s * w * 1.06, base - 0.2 * size),               // دُم
  ];
  // ضخامت در هر نقطه — نوار به سمت دُم نازک می‌شود
  const widths = [3.5, 4.0, 3.4, 2.2, 0.9].map((t) => t * size * thickness);

  const top = spine.map((p, i) => P(p.x, p.y - widths[i]));
  const bottom = spine.map((p, i) => P(p.x, p.y + widths[i])).reverse();

  const ribbon = `${smoothOpenPath(top, 1)} L ${n(bottom[0].x)} ${n(bottom[0].y)} ${
    smoothOpenPath(bottom, 1).replace(/^M [^C]*/, '')} Z`;

  return g({ 'data-part': 'brow' }, [
    // هاله‌ی نرم زیر ابرو: مرز مو و پوست را نرم می‌کند
    path(ribbon, { fill: color, opacity: 0.22, transform: `translate(0 ${n(0.8 * size)})` }),
    path(ribbon, { fill: color }),
  ]);
}

/* ------------------------------------------------------------------ *
 * بینی و دهان
 * ------------------------------------------------------------------ */

/**
 * بینی مینیمال. قانون: بینی را دورگیری نکن.
 * فقط سایه‌ی نرمِ زیرِ نوک + یک هایلایت روی تیغه. خط تیز = چهره‌ی خشن.
 */
export function nose({ x = AXIS, y, size = 1, skin }) {
  const w = 9 * size;
  const h = 12 * size;
  const shadow = shade(skin, 0.13, -4);

  return g({ 'data-part': 'nose' }, [
    // سایه‌ی زیرِ نوک بینی (پخش‌شده، بدون لبه‌ی تیز)
    path(
      smoothClosedPath([
        P(x - w * 0.62, y + h * 0.42),
        P(x - w * 0.2, y + h * 0.08),
        P(x + w * 0.28, y + h * 0.2),
        P(x + w * 0.5, y + h * 0.55),
        P(x, y + h * 0.78),
        P(x - w * 0.42, y + h * 0.68),
      ], 1),
      { fill: shadow, opacity: 0.5 },
    ),
    // پره‌های بینی — دو نقطه‌ی کوچک، نه خط
    ellipse(x - w * 0.5, y + h * 0.5, w * 0.19, h * 0.13, { fill: shadow, opacity: 0.6 }),
    ellipse(x + w * 0.5, y + h * 0.5, w * 0.19, h * 0.13, { fill: shadow, opacity: 0.6 }),
    // هایلایت روی تیغه — باید «حس» شود نه «دیده» شود.
    // روی پوست تیره، هایلایتِ پررنگ به لکه‌ی روشن تبدیل می‌شود؛ پس نازک و کم‌شفاف.
    ellipse(x - w * 0.08, y - h * 0.2, w * 0.15, h * 0.4, {
      fill: tint(skin, 0.1), opacity: 0.28,
    }),
  ]);
}

/**
 * دهان. smile از -1 (اخم) تا 1 (لبخند پهن).
 * open برای باز بودن دهان (نمایش دندان/داخل دهان).
 */
export function mouth({ x = AXIS, y, size = 1, lip, smile = 0.6, open = 0, skin }) {
  const w = 17 * size * (0.85 + Math.abs(smile) * 0.3);
  const curve = smile * 9 * size;

  if (open > 0.05) {
    const oh = 20 * size * open;          // ارتفاع دهانِ باز
    const ow = w * 0.92;                  // دهانِ باز کمی باریک‌تر از خط لب
    // حفره‌ی دهان: بالا تختِ کمی قوس‌دار، پایین کاملاً گرد
    const inner = smoothClosedPath([
      P(x - ow, y),
      P(x - ow * 0.45, y - 1.2 * size),
      P(x + ow * 0.45, y - 1.2 * size),
      P(x + ow, y),
      P(x + ow * 0.62, y + oh * 0.86),
      P(x, y + oh),
      P(x - ow * 0.62, y + oh * 0.86),
    ], 1);

    return g({ 'data-part': 'mouth' }, [
      path(inner, { fill: shade(lip, 0.42, -10) }),
      // ردیف دندانِ بالا — چسبیده به لبه‌ی بالایی حفره
      path(
        smoothClosedPath([
          P(x - ow * 0.86, y - 0.4 * size),
          P(x, y - 1.4 * size),
          P(x + ow * 0.86, y - 0.4 * size),
          P(x + ow * 0.66, y + oh * 0.3),
          P(x, y + oh * 0.36),
          P(x - ow * 0.66, y + oh * 0.3),
        ], 0.8),
        { fill: '#fffaf4' },
      ),
      // زبان، ته دهان
      ellipse(x, y + oh * 0.82, ow * 0.42, oh * 0.24, { fill: mix(lip, '#d9707f', 0.5), opacity: 0.9 }),
      // لبِ بالا و پایین به‌صورت خط ضخیم دور حفره
      path(inner, {
        fill: 'none',
        stroke: shade(lip, 0.24),
        'stroke-width': 2.6 * size,
        'stroke-linejoin': 'round',
      }),
      // سایه‌ی زیر لبِ پایین
      path(
        arcBetween(x - ow * 0.5, y + oh + 7 * size, x + ow * 0.5, y + oh + 7 * size, 0.2, 1),
        { fill: 'none', stroke: shade(skin, 0.1), 'stroke-width': 2 * size, 'stroke-linecap': 'round', opacity: 0.45 },
      ),
    ]);
  }

  // دهان بسته: خط لب + لبِ پایینِ پرتر + هایلایت
  return g({ 'data-part': 'mouth' }, [
    path(
      smoothOpenPath([
        P(x - w, y - curve * 0.25),
        P(x - w * 0.4, y + curve * 0.55),
        P(x + w * 0.4, y + curve * 0.55),
        P(x + w, y - curve * 0.25),
      ], 1),
      { fill: 'none', stroke: shade(lip, 0.22), 'stroke-width': 3 * size, 'stroke-linecap': 'round' },
    ),
    path(
      smoothClosedPath([
        P(x - w * 0.72, y + curve * 0.45),
        P(x, y + curve * 0.5 + 5.5 * size),
        P(x + w * 0.72, y + curve * 0.45),
        P(x, y + curve * 0.5 + 1.2 * size),
      ], 1),
      { fill: lip, opacity: 0.9 },
    ),
    ellipse(x + w * 0.18, y + curve * 0.5 + 2.6 * size, w * 0.22, 1.5 * size, {
      fill: '#ffffff', opacity: 0.35,
    }),
    // سایه‌ی زیر لب = برجستگی چانه
    path(
      arcBetween(x - w * 0.5, y + 12 * size, x + w * 0.5, y + 12 * size, 0.18, 1),
      { fill: 'none', stroke: shade(skin, 0.1), 'stroke-width': 2 * size, 'stroke-linecap': 'round', opacity: 0.5 },
    ),
  ]);
}

/** گونه‌ی گلگون — با فیلتر بلور، ملایم و باورپذیر */
export function blush({ x, y, size = 1, color, blurId }) {
  return ellipse(x, y, 13 * size, 7.5 * size, {
    fill: color,
    opacity: 0.42,
    filter: blurId ? `url(#${blurId})` : undefined,
    'data-part': 'blush',
  });
}

/* ------------------------------------------------------------------ *
 * مو
 * ------------------------------------------------------------------ */

/** مو: پشت سر (لایه‌ی زیرین) */
export function hairBack({ style, color, cy = 178, size = 1, faceShape = 0.5 }) {
  const w = (74 + faceShape * 16) * size;
  const h = (92 + (1 - faceShape) * 12) * size;
  const dark = shade(color, 0.13);

  if (style === 'long' || style === 'wavy') {
    const wave = style === 'wavy' ? 1 : 0.35;
    const d = symmetricShape([
      P(AXIS, cy - h * 1.16),
      P(AXIS + w * 0.8, cy - h * 1.0),
      P(AXIS + w * 1.28, cy - h * 0.3),
      P(AXIS + w * (1.16 + wave * 0.16), cy + h * 0.45),
      P(AXIS + w * (1.3 - wave * 0.24), cy + h * 1.0),
      P(AXIS + w * (1.02 + wave * 0.2), cy + h * 1.5),
      P(AXIS + w * 0.5, cy + h * 1.66),
      P(AXIS, cy + h * 1.7),
    ], AXIS, 1);
    return path(d, { fill: dark, 'data-part': 'hair-back' });
  }

  if (style === 'bun') {
    return g({ 'data-part': 'hair-back' }, [
      circle(AXIS, cy - h * 1.16, 26 * size, { fill: dark }),
      circle(AXIS - 8 * size, cy - h * 1.24, 15 * size, { fill: shade(color, 0.05) }),
      path(
        symmetricShape([
          P(AXIS, cy - h * 1.06),
          P(AXIS + w * 0.86, cy - h * 0.86),
          P(AXIS + w * 1.14, cy - h * 0.1),
          P(AXIS + w * 1.04, cy + h * 0.5),
          P(AXIS + w * 0.55, cy + h * 0.72),
          P(AXIS, cy + h * 0.76),
        ], AXIS, 1),
        { fill: dark },
      ),
    ]);
  }

  if (style === 'curly') {
    const puffs = [];
    const count = 13;
    for (let i = 0; i < count; i += 1) {
      const a = Math.PI * (0.06 + (i / (count - 1)) * 0.88);
      const rx = w * 1.16;
      const ry = h * 1.05;
      puffs.push(
        circle(
          AXIS - Math.cos(a) * rx,
          cy - h * 0.16 - Math.sin(a) * ry,
          (19 + (i % 3) * 4) * size,
          { fill: dark },
        ),
      );
    }
    return g({ 'data-part': 'hair-back' }, puffs);
  }

  // short / bob
  return path(
    symmetricShape([
      P(AXIS, cy - h * 1.12),
      P(AXIS + w * 0.82, cy - h * 0.94),
      P(AXIS + w * 1.16, cy - h * 0.22),
      P(AXIS + w * 1.08, cy + h * 0.34),
      P(AXIS + w * 0.62, cy + h * 0.6),
      P(AXIS, cy + h * 0.64),
    ], AXIS, 1),
    { fill: dark, 'data-part': 'hair-back' },
  );
}

/** مو: جلوی سر (چتری/فرق) + براقیت */
export function hairFront({ style, color, cy = 178, size = 1, faceShape = 0.5, part = 0.35 }) {
  const w = (74 + faceShape * 16) * size;
  const h = (92 + (1 - faceShape) * 12) * size;
  const gloss = tint(color, 0.16);
  const layers = [];

  if (style === 'curly') {
    const puffs = [];
    for (let i = 0; i < 9; i += 1) {
      const a = Math.PI * (0.1 + (i / 8) * 0.8);
      puffs.push(circle(
        AXIS - Math.cos(a) * w * 0.95,
        cy - h * 0.5 - Math.sin(a) * h * 0.55,
        (17 + (i % 2) * 5) * size,
        { fill: color },
      ));
    }
    layers.push(g({}, puffs));
  } else {
    // کلاهکِ مو روی جمجمه
    const cap = smoothClosedPath([
      P(AXIS - w * 1.02, cy - h * 0.28),
      P(AXIS - w * 0.92, cy - h * 0.82),
      P(AXIS - w * 0.34, cy - h * 1.1),
      P(AXIS + w * 0.42, cy - h * 1.08),
      P(AXIS + w * 0.96, cy - h * 0.72),
      P(AXIS + w * 1.04, cy - h * 0.18),
      P(AXIS + w * 0.88, cy - h * 0.46),
      P(AXIS + w * 0.2, cy - h * 0.72),
      P(AXIS - w * 0.5, cy - h * 0.66),
      P(AXIS - w * 0.9, cy - h * 0.3),
    ], 1);
    layers.push(path(cap, { fill: color }));

    // چتری کج (side-swept) — فرق سر با پارامتر part جابه‌جا می‌شود
    const px = AXIS - w * (0.9 - part * 1.5);
    const fringe = smoothClosedPath([
      P(px, cy - h * 1.02),
      P(AXIS + w * 0.72, cy - h * 0.86),
      P(AXIS + w * 1.0, cy - h * 0.3),
      P(AXIS + w * 0.86, cy - h * 0.52),
      P(AXIS + w * 0.2, cy - h * 0.62),
      P(AXIS - w * 0.5, cy - h * 0.42),
      P(AXIS - w * 0.86, cy + h * 0.02),
      P(AXIS - w * 1.0, cy - h * 0.44),
    ], 1);
    layers.push(path(fringe, { fill: mix(color, gloss, 0.25) }));
  }

  // نوارِ براقیت (specular) — کلیدِ حسِ «موی سالم»
  layers.push(path(
    smoothClosedPath([
      P(AXIS - w * 0.62, cy - h * 0.74),
      P(AXIS - w * 0.18, cy - h * 0.94),
      P(AXIS + w * 0.3, cy - h * 0.88),
      P(AXIS + w * 0.26, cy - h * 0.8),
      P(AXIS - w * 0.16, cy - h * 0.84),
      P(AXIS - w * 0.56, cy - h * 0.64),
    ], 1),
    { fill: gloss, opacity: 0.55 },
  ));

  return g({ 'data-part': 'hair-front' }, layers);
}

/* ------------------------------------------------------------------ *
 * بدن و لباس
 * ------------------------------------------------------------------ */

/**
 * تنه و لباس.
 * @param {string} garment رنگِ «رنگ‌آمیزی» (می‌تواند url(#gradient) باشد)
 * @param {string} garmentColor رنگِ پایه به‌صورت hex — برای محاسبه‌ی سایه‌ها لازم است.
 *   نکته‌ی مهم: هرگز shade()/tint() را روی رشته‌ی url(...) صدا نزن؛ نتیجه سیاه می‌شود.
 */
export function torso({ garment, garmentColor, accent, skin, cy = 178, size = 1, style = 'tee' }) {
  const solid = garmentColor ?? (String(garment).startsWith('url(') ? '#8090a0' : garment);
  const top = cy + 118 * size;
  const bottom = 400;
  const w = 118 * size;

  const shoulders = smoothClosedPath([
    P(AXIS - w, bottom),
    P(AXIS - w * 0.92, top + 34 * size),
    P(AXIS - w * 0.34, top - 2 * size),
    P(AXIS, top + 6 * size),
    P(AXIS + w * 0.34, top - 2 * size),
    P(AXIS + w * 0.92, top + 34 * size),
    P(AXIS + w, bottom),
  ], 0.9);

  const collar = style === 'vneck'
    ? smoothClosedPath([
      P(AXIS - 26 * size, top + 2 * size),
      P(AXIS, top + 34 * size),
      P(AXIS + 26 * size, top + 2 * size),
      P(AXIS, top - 6 * size),
    ], 0.85)
    : smoothClosedPath([
      P(AXIS - 30 * size, top + 4 * size),
      P(AXIS - 22 * size, top + 20 * size),
      P(AXIS + 22 * size, top + 20 * size),
      P(AXIS + 30 * size, top + 4 * size),
      P(AXIS, top - 4 * size),
    ], 0.9);

  return g({ 'data-part': 'torso' }, [
    path(shoulders, { fill: garment }),
    // سایه‌ی سمت چپ برای حجم
    path(
      smoothClosedPath([
        P(AXIS - w, bottom),
        P(AXIS - w * 0.92, top + 34 * size),
        P(AXIS - w * 0.42, top + 4 * size),
        P(AXIS - w * 0.5, top + 60 * size),
        P(AXIS - w * 0.62, bottom),
      ], 0.9),
      { fill: shade(solid, 0.1), opacity: 0.7 },
    ),
    path(collar, { fill: shade(skin, 0.05) }),
    path(collar, { fill: 'none', stroke: accent, 'stroke-width': 4 * size, 'stroke-linejoin': 'round' }),
    // چین پارچه
    path(
      smoothOpenPath([
        P(AXIS + w * 0.42, top + 40 * size),
        P(AXIS + w * 0.52, top + 74 * size),
        P(AXIS + w * 0.46, bottom - 6),
      ], 1),
      { fill: 'none', stroke: shade(solid, 0.12), 'stroke-width': 2.4 * size, 'stroke-linecap': 'round', opacity: 0.6 },
    ),
  ]);
}

/* ------------------------------------------------------------------ *
 * لوازم جانبی
 * ------------------------------------------------------------------ */

export function glasses({ cy = 178, size = 1, eyeY, eyeDx, frame = '#2f2a35' }) {
  const r = 25 * size;
  const lens = (sign) =>
    tag('rect', {
      x: n(AXIS + sign * eyeDx - r),
      y: n(eyeY - r * 0.78),
      width: n(r * 2),
      height: n(r * 1.56),
      rx: n(r * 0.62),
      fill: alpha('#cfe6f2', 0.22),
      stroke: frame,
      'stroke-width': 3.4 * size,
    });
  return g({ 'data-part': 'glasses' }, [
    lens(-1),
    lens(1),
    path(
      `M ${n(AXIS - eyeDx + r)} ${n(eyeY - r * 0.1)} Q ${n(AXIS)} ${n(eyeY - r * 0.32)} ${n(AXIS + eyeDx - r)} ${n(eyeY - r * 0.1)}`,
      { fill: 'none', stroke: frame, 'stroke-width': 3.4 * size, 'stroke-linecap': 'round' },
    ),
  ]);
}

export function freckles({ x, y, size = 1, skin, rng }) {
  const dots = [];
  for (let i = 0; i < 7; i += 1) {
    dots.push(circle(
      rng.jitter(x, 11 * size),
      rng.jitter(y, 5 * size),
      rng.float(0.9, 1.7) * size,
      { fill: shade(skin, 0.22, -6), opacity: rng.float(0.35, 0.6) },
    ));
  }
  return g({ 'data-part': 'freckles' }, dots);
}

export function earrings({ cy = 178, size = 1, faceShape = 0.5, color = '#f0c05a' }) {
  const w = (74 + faceShape * 16) * size;
  const y = cy + 18 * size;
  const one = (sign) => g({}, [
    circle(AXIS + sign * w * 0.97, y, 3.2 * size, { fill: color }),
    circle(AXIS + sign * w * 0.97, y + 9 * size, 5.4 * size, { fill: color, opacity: 0.92 }),
    circle(AXIS + sign * w * 0.97 - 1.4 * size, y + 7.6 * size, 1.8 * size, { fill: '#fff', opacity: 0.6 }),
  ]);
  return g({ 'data-part': 'earrings' }, [one(-1), one(1)]);
}

export { AXIS };
