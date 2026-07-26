/**
 * animate.js — جان دادن به کاراکتر، فقط با CSS داخل خودِ SVG.
 *
 * چرا CSS و نه JavaScript؟ چون فایل SVG آنگاه «خودکفا» است: در تگ <img>،
 * در background-image و حتی در README گیت‌هاب هم انیمیشن دارد و نیاز به
 * هیچ کتابخانه‌ای ندارد. برای انیمیشن‌های تعاملی (دنبال کردن ماوس با چشم)
 * سراغ GSAP/anime.js می‌رویم؛ برای «زنده بودن» همین کافی است.
 *
 * نکته‌ی دسترس‌پذیری: prefers-reduced-motion را حتماً رعایت می‌کنیم.
 */

/**
 * تولید CSS انیمیشن‌ها.
 * @param {object} opts
 * @param {boolean} opts.blink پلک زدن
 * @param {boolean} opts.breathe تنفس (بالا/پایین شدن نامحسوس)
 * @param {boolean} opts.sway تاب خوردن ملایم سر
 * @param {boolean} opts.sparkle چشمک زدن ذرات پس‌زمینه
 * @param {number} opts.speed ضریب سرعت (1 = عادی)
 */
export function animationCss({
  blink = true,
  breathe = true,
  sway = true,
  sparkle = true,
  speed = 1,
} = {}) {
  const t = (v) => `${(v / speed).toFixed(2)}s`;
  const rules = [];

  if (breathe || sway) {
    // کل کاراکتر: تنفس عمودی + تاب افقی، با دوره‌های متفاوت تا الگو تکراری نشود
    const anims = [
      breathe ? `breathe ${t(4.2)} ease-in-out infinite` : '',
      sway ? `sway ${t(6.8)} ease-in-out infinite` : '',
    ].filter(Boolean).join(', ');
    rules.push(`
[data-part="character"] {
  transform-box: fill-box;
  transform-origin: 50% 92%;
  animation: ${anims};
}`);
    if (breathe) {
      rules.push(`
@keyframes breathe {
  0%, 100% { transform: translateY(0) scale(1); }
  50%      { transform: translateY(-2.4px) scale(1.006); }
}`);
    }
    if (sway) {
      rules.push(`
@keyframes sway {
  0%, 100% { rotate: -0.7deg; }
  50%      { rotate: 0.7deg; }
}`);
    }
  }

  if (blink) {
    // پلک با scaleY روی خودِ گروه چشم. مکث طولانی + بستنِ سریع = طبیعی
    rules.push(`
[data-part="eye"] {
  transform-box: fill-box;
  transform-origin: 50% 55%;
  animation: blink ${t(5.4)} ease-in-out infinite;
}
[data-part="eye"]:nth-of-type(2) { animation-delay: ${t(0.04)}; }
@keyframes blink {
  0%, 92%, 100% { transform: scaleY(1); }
  95%           { transform: scaleY(0.08); }
  97%           { transform: scaleY(1); }
}`);
  }

  if (sparkle) {
    rules.push(`
[data-part="sparkles"] circle {
  animation: twinkle ${t(3.6)} ease-in-out infinite;
}
[data-part="sparkles"] circle:nth-child(3n)   { animation-delay: ${t(0.7)}; }
[data-part="sparkles"] circle:nth-child(3n+1) { animation-delay: ${t(1.5)}; }
@keyframes twinkle {
  0%, 100% { opacity: 0.18; }
  50%      { opacity: 0.65; }
}`);
  }

  // احترام به تنظیمات کاربر — یک خط کد، تفاوت بین حرفه‌ای و غیرحرفه‌ای
  rules.push(`
@media (prefers-reduced-motion: reduce) {
  [data-part="character"],
  [data-part="eye"],
  [data-part="sparkles"] circle { animation: none !important; }
}`);

  return rules.join('\n');
}

/**
 * تزریق CSS به یک رشته‌ی SVG موجود (بعد از تگ <svg ...>).
 */
export function withAnimation(svgString, options) {
  const css = animationCss(options);
  const styleTag = `<style>\n${css}\n</style>`;
  return svgString.replace(/(<svg[^>]*>)/, `$1\n${styleTag}`);
}
