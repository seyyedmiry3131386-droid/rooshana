#!/usr/bin/env node
/**
 * render.js — ساخت یک کاراکتر و ذخیره در out/
 * استفاده: node scripts/render.js --seed "Sara" --theme pastel --expression happy
 */
import { writeFileSync, mkdirSync } from 'node:fs';
import { createCharacter } from '../src/index.js';

const argv = process.argv.slice(2);
const arg = (name, fallback) => {
  const i = argv.indexOf(`--${name}`);
  return i >= 0 && argv[i + 1] && !argv[i + 1].startsWith('--') ? argv[i + 1] : fallback;
};
const flag = (name) => argv.includes(`--${name}`);

const options = {
  seed: arg('seed', `seed-${Date.now()}`),
  size: Number(arg('size', 400)),
};
for (const k of ['theme', 'expression', 'hairStyle', 'skin', 'hair', 'eyeColor', 'garment', 'backgroundShape']) {
  const v = arg(k, undefined);
  if (v !== undefined) options[k] = v;
}
if (flag('glasses')) options.glasses = true;
if (flag('no-glasses')) options.glasses = false;
if (flag('no-grain')) options.grain = false;

const { svg, spec } = createCharacter(options);
mkdirSync('out', { recursive: true });
const file = arg('out', `out/${String(spec.seed).replace(/[^\w-]+/g, '_')}.svg`);
writeFileSync(file, svg, 'utf8');
console.log(`✔ ${file}`);
console.log(JSON.stringify(spec, null, 2));
