#!/usr/bin/env node
/**
 * sheet.js — ساخت یک «شیت نمونه» HTML از چند کاراکتر تصادفی.
 * استفاده: node scripts/sheet.js [تعداد]
 */
import { writeFileSync, mkdirSync } from 'node:fs';
import { createCharacter, withAnimation, THEME_NAMES } from '../src/index.js';

const count = Number(process.argv[2] || 12);
const cards = [];
mkdirSync('out', { recursive: true });

for (let i = 0; i < count; i += 1) {
  const seed = `rooshana-${i + 1}`;
  const { svg, spec } = createCharacter({ seed, size: 220 });
  cards.push(`<figure><div class="card">${withAnimation(svg)}</div>
    <figcaption>${seed}<br><small>${spec.theme} · ${spec.hairStyle} · ${spec.expression}</small></figcaption></figure>`);
}

const html = `<!doctype html>
<html lang="fa" dir="rtl"><head><meta charset="utf-8">
<title>rooshana — نمونه کاراکترها</title>
<style>
  body { font-family: system-ui, "Segoe UI", Tahoma, sans-serif; background:#f6f7fb; color:#26303d; margin:0; padding:32px; }
  h1 { font-size:22px; margin:0 0 6px; }
  p.sub { color:#6b7684; margin:0 0 28px; font-size:14px; }
  .grid { display:grid; grid-template-columns:repeat(auto-fill,minmax(200px,1fr)); gap:22px; }
  figure { margin:0; text-align:center; }
  .card { background:#fff; border-radius:18px; overflow:hidden; box-shadow:0 8px 24px rgba(20,30,50,.09); line-height:0; }
  .card svg { width:100%; height:auto; }
  figcaption { font-size:13px; color:#48566a; margin-top:10px; line-height:1.6; }
  small { color:#8a95a5; }
</style></head>
<body>
  <h1>rooshana — کاراکترهای تولیدشده با کد</h1>
  <p class="sub">هر کاراکتر فقط از یک رشته‌ی seed ساخته شده؛ هیچ فایل تصویری در کار نیست.</p>
  <div class="grid">${cards.join('\n')}</div>
</body></html>`;

writeFileSync('out/sheet.html', html, 'utf8');
console.log(`✔ out/sheet.html (${count} characters)`);
