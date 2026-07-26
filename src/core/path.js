/**
 * path.js — تولید مسیرهای «ارگانیک» با کد.
 *
 * راز شکل‌های زیبا در SVG: به‌جای نوشتن دستیِ C/Q، نقاط کنترل را تعریف کن و
 * با درون‌یابی Catmull-Rom آن‌ها را به منحنی بِزیه‌ی نرم تبدیل کن.
 * نتیجه: خطوطی که مثل کشیدن با دست نرم‌اند، ولی کاملاً پارامتریک و قابل تغییرند.
 */

/** گرد کردن عدد برای خروجی تمیز و سبک */
export const n = (v, p = 2) => {
  const r = Number(v.toFixed(p));
  return Object.is(r, -0) ? 0 : r;
};

export const P = (x, y) => ({ x, y });

/**
 * تبدیل آرایه‌ی نقاط به مسیر بسته‌ی نرم (Catmull-Rom → Cubic Bézier).
 * @param {{x:number,y:number}[]} pts
 * @param {number} tension 0 = چندضلعی، 1 = نرمِ استاندارد، >1 = اغراق‌شده
 */
export function smoothClosedPath(pts, tension = 1) {
  const len = pts.length;
  if (len < 3) throw new Error('smoothClosedPath needs at least 3 points');
  const at = (i) => pts[(i % len + len) % len];
  let d = `M ${n(pts[0].x)} ${n(pts[0].y)}`;
  for (let i = 0; i < len; i += 1) {
    const p0 = at(i - 1);
    const p1 = at(i);
    const p2 = at(i + 1);
    const p3 = at(i + 2);
    const c1 = { x: p1.x + ((p2.x - p0.x) / 6) * tension, y: p1.y + ((p2.y - p0.y) / 6) * tension };
    const c2 = { x: p2.x - ((p3.x - p1.x) / 6) * tension, y: p2.y - ((p3.y - p1.y) / 6) * tension };
    d += ` C ${n(c1.x)} ${n(c1.y)}, ${n(c2.x)} ${n(c2.y)}, ${n(p2.x)} ${n(p2.y)}`;
  }
  return `${d} Z`;
}

/** نسخه‌ی باز (برای خطوط: ابرو، تار مو، چین لباس) */
export function smoothOpenPath(pts, tension = 1) {
  const len = pts.length;
  if (len < 2) throw new Error('smoothOpenPath needs at least 2 points');
  if (len === 2) return `M ${n(pts[0].x)} ${n(pts[0].y)} L ${n(pts[1].x)} ${n(pts[1].y)}`;
  const at = (i) => pts[Math.min(Math.max(i, 0), len - 1)];
  let d = `M ${n(pts[0].x)} ${n(pts[0].y)}`;
  for (let i = 0; i < len - 1; i += 1) {
    const p0 = at(i - 1);
    const p1 = at(i);
    const p2 = at(i + 1);
    const p3 = at(i + 2);
    const c1 = { x: p1.x + ((p2.x - p0.x) / 6) * tension, y: p1.y + ((p2.y - p0.y) / 6) * tension };
    const c2 = { x: p2.x - ((p3.x - p1.x) / 6) * tension, y: p2.y - ((p3.y - p1.y) / 6) * tension };
    d += ` C ${n(c1.x)} ${n(c1.y)}, ${n(c2.x)} ${n(c2.y)}, ${n(p2.x)} ${n(p2.y)}`;
  }
  return d;
}

/** قرینه کردن نقاط حول محور عمودی x = axis (برای صورت/مو/شانه‌ها) */
export const mirrorPoints = (pts, axis = 200) => pts.map((p) => P(2 * axis - p.x, p.y));

/** ساخت شکل متقارن: نیمه‌ی راست را بده، کل مسیر بسته را بگیر */
export function symmetricShape(rightHalf, axis = 200, tension = 1) {
  const left = mirrorPoints([...rightHalf].reverse(), axis);
  // نقاط بالا/پایینِ دقیقاً روی محور تکراری نشوند
  const merged = [...rightHalf, ...left].filter((p, i, arr) => {
    const prev = arr[(i - 1 + arr.length) % arr.length];
    return Math.abs(p.x - prev.x) > 0.001 || Math.abs(p.y - prev.y) > 0.001;
  });
  return smoothClosedPath(merged, tension);
}

/** مسیر بیضی (بدون نیاز به تگ ellipse؛ وقتی می‌خواهی همه‌چیز path باشد) */
export function ellipsePath(cx, cy, rx, ry) {
  return [
    `M ${n(cx - rx)} ${n(cy)}`,
    `a ${n(rx)} ${n(ry)} 0 1 0 ${n(rx * 2)} 0`,
    `a ${n(rx)} ${n(ry)} 0 1 0 ${n(-rx * 2)} 0`,
    'Z',
  ].join(' ');
}

/** کمان ساده بین دو نقطه با انحنای دلخواه (برای لبخند، پلک، چانه) */
export function arcBetween(x1, y1, x2, y2, bulge = 0.3, sweep = 1) {
  const dx = x2 - x1;
  const dy = y2 - y1;
  const dist = Math.hypot(dx, dy) || 1;
  const r = dist / (2 * Math.max(0.05, Math.min(0.99, bulge)));
  return `M ${n(x1)} ${n(y1)} A ${n(r)} ${n(r)} 0 0 ${sweep} ${n(x2)} ${n(y2)}`;
}

/** درون‌یابی خطی روی مسیر دایره‌ای — برای پخش ذرات پس‌زمینه */
export const onCircle = (cx, cy, r, deg) => {
  const rad = (deg * Math.PI) / 180;
  return P(cx + Math.cos(rad) * r, cy + Math.sin(rad) * r);
};

/** جابه‌جایی و مقیاس یک مجموعه نقطه */
export const translate = (pts, dx = 0, dy = 0) => pts.map((p) => P(p.x + dx, p.y + dy));
export const scaleAbout = (pts, sx, sy, ox = 0, oy = 0) =>
  pts.map((p) => P(ox + (p.x - ox) * sx, oy + (p.y - oy) * sy));
