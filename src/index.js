/**
 * rooshana — تولید کاراکتر SVG فقط با کد.
 * نقطه‌ی ورود عمومی کتابخانه.
 */
export { createCharacter, EXPRESSIONS, HAIR_STYLES, GARMENT_STYLES } from './character/generate.js';
export { THEMES, THEME_NAMES, SKIN_TONES, HAIR_COLORS, EYE_COLORS } from './character/palettes.js';
export { animationCss, withAnimation } from './character/animate.js';
export * as svg from './core/svg.js';
export * as pathUtils from './core/path.js';
export * as color from './core/color.js';
export { createRng } from './core/rng.js';
