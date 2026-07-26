/**
 * تست‌ها — با test runner داخلی Node (بدون هیچ وابستگی).
 * اجرا: npm test
 */
import { test } from 'node:test';
import assert from 'node:assert/strict';
import { createCharacter, withAnimation, THEME_NAMES, HAIR_STYLES, EXPRESSIONS } from '../src/index.js';
import { createRng } from '../src/core/rng.js';
import { shade, tint, mix, hexToHsl } from '../src/core/color.js';
import { smoothClosedPath, smoothOpenPath, P } from '../src/core/path.js';

test('همان seed همیشه همان خروجی را می‌دهد (قطعی بودن)', () => {
  const a = createCharacter({ seed: 'ali' }).svg;
  const b = createCharacter({ seed: 'ali' }).svg;
  assert.equal(a, b);
});

test('seedهای متفاوت خروجی متفاوت می‌دهند', () => {
  const a = createCharacter({ seed: 'ali' }).svg;
  const b = createCharacter({ seed: 'sara' }).svg;
  assert.notEqual(a, b);
});

test('خروجی یک سند SVG معتبر است', () => {
  const { svg } = createCharacter({ seed: 'x' });
  assert.match(svg, /^<svg [^>]*xmlns="http:\/\/www\.w3\.org\/2000\/svg"/);
  assert.match(svg, /<\/svg>$/);
  assert.match(svg, /viewBox="0 0 400 400"/);
});

test('هیچ NaN یا undefined در مسیرها نیست', () => {
  for (const seed of ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']) {
    const { svg } = createCharacter({ seed });
    assert.ok(!svg.includes('NaN'), `NaN in seed ${seed}`);
    assert.ok(!svg.includes('undefined'), `undefined in seed ${seed}`);
    assert.ok(!svg.includes('null'), `null in seed ${seed}`);
  }
});

test('تگ‌های SVG متوازن‌اند', () => {
  const { svg } = createCharacter({ seed: 'balance' });
  const opens = (svg.match(/<(?!\/)(?!\?)[a-zA-Z]+/g) || []).length;
  const closes = (svg.match(/<\/[a-zA-Z]+>/g) || []).length;
  const selfClose = (svg.match(/\/>/g) || []).length;
  assert.equal(opens, closes + selfClose);
});

test('همه‌ی تم‌ها بدون خطا رندر می‌شوند', () => {
  for (const theme of THEME_NAMES) {
    const { svg, spec } = createCharacter({ seed: 't', theme });
    assert.equal(spec.theme, theme);
    assert.ok(svg.length > 3000);
  }
});

test('همه‌ی مدل موها بدون خطا رندر می‌شوند', () => {
  for (const hairStyle of HAIR_STYLES) {
    const { svg, spec } = createCharacter({ seed: 'h', hairStyle });
    assert.equal(spec.hairStyle, hairStyle);
    assert.ok(svg.includes('data-part="hair-front"') || svg.includes('data-part="hair-back"'));
  }
});

test('همه‌ی حالت‌های چهره کار می‌کنند', () => {
  for (const expression of Object.keys(EXPRESSIONS)) {
    const { svg, spec } = createCharacter({ seed: 'e', expression });
    assert.equal(spec.expression, expression);
    assert.ok(svg.includes('data-part="mouth"'));
  }
});

test('گزینه‌های صریح بر تصادف اولویت دارند', () => {
  const { spec } = createCharacter({
    seed: 'override', skin: '#123456', hair: '#abcdef', glasses: true, freckles: false,
  });
  assert.equal(spec.skin, '#123456');
  assert.equal(spec.hair, '#abcdef');
  assert.equal(spec.glasses, true);
  assert.equal(spec.freckles, false);
});

test('عینک و کک‌ومک فقط وقتی درخواست شوند ظاهر می‌شوند', () => {
  const on = createCharacter({ seed: 'g', glasses: true, freckles: true }).svg;
  const off = createCharacter({ seed: 'g', glasses: false, freckles: false }).svg;
  assert.ok(on.includes('data-part="glasses"'));
  assert.ok(on.includes('data-part="freckles"'));
  assert.ok(!off.includes('data-part="glasses"'));
  assert.ok(!off.includes('data-part="freckles"'));
});

test('idها بین دو کاراکتر تداخل ندارند (مهم برای قرار دادن چند SVG در یک صفحه)', () => {
  const a = createCharacter({ seed: 'one' }).svg;
  const b = createCharacter({ seed: 'two' }).svg;
  const idsOf = (s) => new Set([...s.matchAll(/id="([^"]+)"/g)].map((m) => m[1]));
  const overlap = [...idsOf(a)].filter((id) => idsOf(b).has(id));
  assert.deepEqual(overlap, []);
});

test('انیمیشن، CSS و prefers-reduced-motion را اضافه می‌کند', () => {
  const animated = withAnimation(createCharacter({ seed: 'anim' }).svg);
  assert.ok(animated.includes('@keyframes blink'));
  assert.ok(animated.includes('prefers-reduced-motion'));
});

test('rng قطعی و در بازه است', () => {
  const r1 = createRng('seed');
  const r2 = createRng('seed');
  for (let i = 0; i < 50; i += 1) {
    const v = r1.next();
    assert.equal(v, r2.next());
    assert.ok(v >= 0 && v < 1);
  }
  const r3 = createRng('ints');
  for (let i = 0; i < 50; i += 1) {
    const v = r3.int(3, 7);
    assert.ok(v >= 3 && v <= 7 && Number.isInteger(v));
  }
});

test('shade تیره‌تر و tint روشن‌تر می‌کند', () => {
  const base = '#4a80c0';
  assert.ok(hexToHsl(shade(base, 0.2)).l < hexToHsl(base).l);
  assert.ok(hexToHsl(tint(base, 0.2)).l > hexToHsl(base).l);
  assert.match(shade(base, 0.2), /^#[0-9a-f]{6}$/);
});

test('mix دو سر بازه را درست برمی‌گرداند', () => {
  assert.equal(mix('#000000', '#ffffff', 0), '#000000');
  assert.equal(mix('#000000', '#ffffff', 1), '#ffffff');
  assert.equal(mix('#000000', '#ffffff', 0.5), '#808080');
});

test('مسیرهای نرم، دستور معتبر تولید می‌کنند', () => {
  const closed = smoothClosedPath([P(0, 0), P(10, 0), P(10, 10), P(0, 10)]);
  assert.match(closed, /^M /);
  assert.match(closed, /Z$/);
  assert.ok(!closed.includes('NaN'));

  const open = smoothOpenPath([P(0, 0), P(5, 8), P(12, 2)]);
  assert.match(open, /^M /);
  assert.ok(!open.includes('Z'));
});

test('اندازه‌ی دلخواه در width/height اعمال می‌شود ولی viewBox ثابت می‌ماند', () => {
  const { svg } = createCharacter({ seed: 's', size: 128 });
  assert.match(svg, /width="128"/);
  assert.match(svg, /height="128"/);
  assert.match(svg, /viewBox="0 0 400 400"/);
});
