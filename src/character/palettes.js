/**
 * palettes.js — پالت‌های آماده.
 *
 * رنگ، ۸۰٪ کیفیتِ نهایی است. این پالت‌ها دستی تنظیم شده‌اند تا با هم هارمونی
 * داشته باشند: پوست‌های خنثی‌مایل، موهای اشباع‌کنترل‌شده، و پس‌زمینه‌های
 * کم‌کنتراست که چهره را جلو می‌آورند.
 */

export const SKIN_TONES = {
  porcelain: '#ffdfc9',
  ivory: '#f7d3b4',
  sand: '#efc09a',
  honey: '#e3a874',
  amber: '#cf8d5c',
  bronze: '#b0703f',
  chestnut: '#8d5433',
  espresso: '#5f3720',
};

export const HAIR_COLORS = {
  midnight: '#221a2e',
  espresso: '#3b2418',
  chestnut: '#6b3a24',
  auburn: '#8d3b21',
  ginger: '#c1622c',
  honeyBlonde: '#d9a65a',
  platinum: '#e8ddcb',
  ash: '#8b8b93',
  plum: '#5b2a52',
  teal: '#1f6f6b',
  rose: '#c05a72',
};

export const EYE_COLORS = {
  espresso: '#4a2c1c',
  hazel: '#7a5227',
  amber: '#a5701f',
  olive: '#5e6b32',
  emerald: '#2f6b4f',
  ocean: '#2a5f80',
  sky: '#4b87b5',
  slate: '#5c6672',
  violet: '#6a4a8c',
};

/** پالت‌های کامل و آماده‌ی استفاده */
export const THEMES = {
  /** روز آفتابی، گرم و صمیمی */
  sunlit: {
    background: ['#ffe7c7', '#ffc9a3'],
    accent: '#ff8f6b',
    garment: '#3f6f8f',
    garmentAccent: '#f0c05a',
    hair: HAIR_COLORS.espresso,
    skin: SKIN_TONES.honey,
    eye: EYE_COLORS.espresso,
    lip: '#c25f57',
  },
  /** شب آرام، سرد و مدرن */
  midnight: {
    background: ['#2b3350', '#161b2e'],
    accent: '#7fd7d1',
    garment: '#e8e4dd',
    garmentAccent: '#f2a05e',
    hair: HAIR_COLORS.midnight,
    skin: SKIN_TONES.amber,
    eye: EYE_COLORS.sky,
    lip: '#b5555f',
  },
  /** پاستل، ملایم و «برندپسند» */
  pastel: {
    background: ['#f3e9ff', '#dcd0f5'],
    accent: '#b08ae0',
    garment: '#f7a1b0',
    garmentAccent: '#ffe0a3',
    hair: HAIR_COLORS.plum,
    skin: SKIN_TONES.ivory,
    eye: EYE_COLORS.violet,
    lip: '#d16b84',
  },
  /** جنگل، سبزِ خاکی و طبیعی */
  forest: {
    background: ['#dbead0', '#a9c99a'],
    accent: '#4f8b5b',
    garment: '#8a5a3b',
    garmentAccent: '#e4c07a',
    hair: HAIR_COLORS.ginger,
    skin: SKIN_TONES.sand,
    eye: EYE_COLORS.emerald,
    lip: '#bd6a5c',
  },
  /** خاکستری‌های شیک برای UI و آواتار سازمانی */
  slate: {
    background: ['#e9edf2', '#c9d3de'],
    accent: '#5b7fa3',
    garment: '#37485c',
    garmentAccent: '#9fb8cf',
    hair: HAIR_COLORS.ash,
    skin: SKIN_TONES.porcelain,
    eye: EYE_COLORS.slate,
    lip: '#b06a68',
  },
  /** غروب گرم با کنتراست بالا */
  ember: {
    background: ['#ffd0a8', '#f08a6a'],
    accent: '#8c3f56',
    garment: '#2f4858',
    garmentAccent: '#ffca7a',
    hair: HAIR_COLORS.auburn,
    skin: SKIN_TONES.bronze,
    eye: EYE_COLORS.amber,
    lip: '#a34a4a',
  },
  /** آبیِ آرام، مناسب داشبورد و اپ‌های سلامت */
  lagoon: {
    background: ['#d6f2f0', '#9fd8d4'],
    accent: '#2f8f89',
    garment: '#f2f0e6',
    garmentAccent: '#3d7f9c',
    hair: HAIR_COLORS.teal,
    skin: SKIN_TONES.chestnut,
    eye: EYE_COLORS.olive,
    lip: '#9c5450',
  },
};

export const THEME_NAMES = Object.keys(THEMES);
