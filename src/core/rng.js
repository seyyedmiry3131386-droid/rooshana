/**
 * rng.js — تصادفِ «قطعی» (deterministic).
 *
 * قانون طلایی تولید کاراکتر با کد: هر تصادفی باید از یک seed بیاید.
 * با این کار همان seed همیشه همان کاراکتر را می‌سازد (قابل تست، قابل ذخیره،
 * قابل اشتراک‌گذاری) — دقیقاً کاری که DiceBear و boring-avatars می‌کنند.
 */

/** هش رشته → عدد ۳۲ بیتی (xmur3) */
export function xmur3(str) {
  let h = 1779033703 ^ str.length;
  for (let i = 0; i < str.length; i += 1) {
    h = Math.imul(h ^ str.charCodeAt(i), 3432918353);
    h = (h << 13) | (h >>> 19);
  }
  return () => {
    h = Math.imul(h ^ (h >>> 16), 2246822507);
    h = Math.imul(h ^ (h >>> 13), 3266489909);
    h ^= h >>> 16;
    return h >>> 0;
  };
}

/** مولد mulberry32 — سریع، سبک، کیفیت کافی برای گرافیک */
export function mulberry32(a) {
  let t = a >>> 0;
  return () => {
    t = (t + 0x6d2b79f5) >>> 0;
    let x = Math.imul(t ^ (t >>> 15), 1 | t);
    x = (x + Math.imul(x ^ (x >>> 7), 61 | x)) ^ x;
    return ((x ^ (x >>> 14)) >>> 0) / 4294967296;
  };
}

export function createRng(seed = 'rooshana') {
  const next = mulberry32(xmur3(String(seed))());
  const api = {
    next,
    /** عدد اعشاری در بازه */
    float: (min = 0, max = 1) => min + next() * (max - min),
    /** عدد صحیح در بازه‌ی شامل */
    int: (min, max) => Math.floor(min + next() * (max - min + 1)),
    /** انتخاب یک عضو */
    pick: (arr) => arr[Math.floor(next() * arr.length)],
    /** انتخاب وزن‌دار: [[value, weight], ...] */
    weighted(pairs) {
      const total = pairs.reduce((s, [, w]) => s + w, 0);
      let r = next() * total;
      for (const [value, w] of pairs) {
        r -= w;
        if (r <= 0) return value;
      }
      return pairs[pairs.length - 1][0];
    },
    bool: (p = 0.5) => next() < p,
    /** نوسان کوچک حول یک مقدار — برای بی‌قاعدگیِ طبیعی */
    jitter: (value, amount) => value + (next() * 2 - 1) * amount,
    shuffle(arr) {
      const a = [...arr];
      for (let i = a.length - 1; i > 0; i -= 1) {
        const j = Math.floor(next() * (i + 1));
        [a[i], a[j]] = [a[j], a[i]];
      }
      return a;
    },
  };
  return api;
}
