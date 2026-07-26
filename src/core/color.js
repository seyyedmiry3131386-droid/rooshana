/**
 * color.js — ابزارهای رنگ برای سایه‌پردازی «هنری» (نه صرفاً تیره/روشن کردن).
 *
 * نکته‌ی کلیدی کیفیت تصویری: سایه فقط تیره‌تر نیست، بلکه رنگ‌مایه (hue) آن
 * به سمت سرد/سرخ می‌چرخد و اشباع بیشتری می‌گیرد؛ هایلایت هم به سمت گرم (زرد)
 * می‌چرخد و اشباعش کم می‌شود. همین دو قانون، تفاوت «کد خشک» و «تصویرسازی» است.
 */

export const clamp = (v, min = 0, max = 1) => Math.min(max, Math.max(min, v));

export function hexToRgb(hex) {
  let h = String(hex).trim().replace('#', '');
  if (h.length === 3) h = h.split('').map((c) => c + c).join('');
  const int = parseInt(h, 16);
  return { r: (int >> 16) & 255, g: (int >> 8) & 255, b: int & 255 };
}

export function rgbToHex({ r, g, b }) {
  const to = (v) => Math.round(clamp(v, 0, 255)).toString(16).padStart(2, '0');
  return `#${to(r)}${to(g)}${to(b)}`;
}

export function rgbToHsl({ r, g, b }) {
  const rn = r / 255;
  const gn = g / 255;
  const bn = b / 255;
  const max = Math.max(rn, gn, bn);
  const min = Math.min(rn, gn, bn);
  const l = (max + min) / 2;
  let h = 0;
  let s = 0;
  if (max !== min) {
    const d = max - min;
    s = l > 0.5 ? d / (2 - max - min) : d / (max + min);
    if (max === rn) h = ((gn - bn) / d + (gn < bn ? 6 : 0));
    else if (max === gn) h = (bn - rn) / d + 2;
    else h = (rn - gn) / d + 4;
    h *= 60;
  }
  return { h, s, l };
}

export function hslToRgb({ h, s, l }) {
  const hh = ((h % 360) + 360) % 360 / 360;
  const ss = clamp(s);
  const ll = clamp(l);
  if (ss === 0) {
    const v = ll * 255;
    return { r: v, g: v, b: v };
  }
  const q = ll < 0.5 ? ll * (1 + ss) : ll + ss - ll * ss;
  const p = 2 * ll - q;
  const hue2rgb = (t) => {
    let tt = t;
    if (tt < 0) tt += 1;
    if (tt > 1) tt -= 1;
    if (tt < 1 / 6) return p + (q - p) * 6 * tt;
    if (tt < 1 / 2) return q;
    if (tt < 2 / 3) return p + (q - p) * (2 / 3 - tt) * 6;
    return p;
  };
  return { r: hue2rgb(hh + 1 / 3) * 255, g: hue2rgb(hh) * 255, b: hue2rgb(hh - 1 / 3) * 255 };
}

export const hexToHsl = (hex) => rgbToHsl(hexToRgb(hex));
export const hslToHex = (hsl) => rgbToHex(hslToRgb(hsl));

/** تغییر نسبی hue/saturation/lightness */
export function adjust(hex, { h = 0, s = 0, l = 0 } = {}) {
  const c = hexToHsl(hex);
  return hslToHex({ h: c.h + h, s: clamp(c.s + s), l: clamp(c.l + l) });
}

/** سایه: تیره‌تر + کمی اشباع‌تر + چرخش hue به سمت سرخ/سرد */
export function shade(hex, amount = 0.12, hueShift = -14) {
  return adjust(hex, { h: hueShift * (amount / 0.12), s: amount * 0.35, l: -amount });
}

/** هایلایت: روشن‌تر + اشباع کمتر + چرخش hue به سمت گرم */
export function tint(hex, amount = 0.12, hueShift = 10) {
  return adjust(hex, { h: hueShift * (amount / 0.12), s: -amount * 0.25, l: amount });
}

/** ترکیب خطی دو رنگ (t=0 → a ، t=1 → b) */
export function mix(a, b, t = 0.5) {
  const ca = hexToRgb(a);
  const cb = hexToRgb(b);
  const k = clamp(t);
  return rgbToHex({
    r: ca.r + (cb.r - ca.r) * k,
    g: ca.g + (cb.g - ca.g) * k,
    b: ca.b + (cb.b - ca.b) * k,
  });
}

/** rgba() برای جاهایی که به شفافیتِ درون‌رنگی نیاز داریم */
export function alpha(hex, a = 1) {
  const { r, g, b } = hexToRgb(hex);
  return `rgba(${Math.round(r)}, ${Math.round(g)}, ${Math.round(b)}, ${Number(a.toFixed(3))})`;
}

/** آیا رنگ روشن است؟ برای انتخاب خودکار رنگ کنتراست */
export const isLight = (hex) => hexToHsl(hex).l > 0.62;

/**
 * یک هارمونی رنگی ساده (analogous + complement) از یک رنگ پایه.
 * برای ساخت پالت پس‌زمینه‌ی هماهنگ با لباس/مو مفید است.
 */
export function harmony(base) {
  const { h, s, l } = hexToHsl(base);
  return {
    base,
    analogA: hslToHex({ h: h - 28, s: clamp(s * 0.9), l: clamp(l + 0.06) }),
    analogB: hslToHex({ h: h + 28, s: clamp(s * 0.9), l: clamp(l - 0.04) }),
    complement: hslToHex({ h: h + 180, s: clamp(s * 0.75), l: clamp(l + 0.08) }),
  };
}
