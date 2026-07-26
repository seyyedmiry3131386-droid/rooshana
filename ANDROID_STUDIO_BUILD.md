# آموزش ساخت APK با Android Studio (ویندوز / لینوکس)

## پیش‌نیاز
- Android Studio نصب شده (با SDK و Build Tools)
- فایل‌های پروژه اصلاح‌شده:
  - `custom/resources/res/values/` (منابع شخصی‌سازی شده)
  - `fixed_sources/activity/MainActivity.java` (کد اصلاح‌شده فنی)
  - `custom/sources/activity/MainActivity.java` (کد با فصل‌ها و مراحل حرم)
  - `dist/rooshana_keystore.p12` (Keystore امضای دیجیتال)

---

## مرحله ۱: ایجاد پروژه جدید در Android Studio
۱. `File → New → New Project`
۲. انتخاب `Empty Activity`
۳. نام پروژه: `Rooshana`
۴. زبان: `Java`
۵. `Minimum SDK`: همان نسخه APK اصلی (`23` یا بالاتر)

---

## مرحله ۲: جایگزینی منابع شخصی‌سازی‌شده (`custom/`)
۱. در Android Studio، به نمای `Project` بروید.
۲. پوشه `app/src/main/res/values/` را پیدا کنید.
۳. فایل‌های زیر را از `custom/resources/res/values/` کپی و جایگزین کنید:
   - `strings.xml` (نام برنامه: روشنا + متن فصل‌ها و مراحل)
   - `colors.xml` (رنگ طلایی `#c8a84d` و آبی تیره `#0d2b4e`)
   - `arrays.xml` (آرایه فصل‌ها و مراحل حرم)
   - `styles.xml` (تم `Theme.Rooshana`)

---

## مرحله ۳: جایگزینی کد منبع (`fixed_sources/` یا `custom/`)
۱. در پروژه، `app/src/main/java/activity/` بسازید (یا پوشه موجود را استفاده کنید).
۲. `fixed_sources/activity/MainActivity.java` را به `app/src/main/java/activity/MainActivity.java` کپی کنید.
   - این نسخه خطاهای `UnsupportedOperationException` و `NullPointerException` را رفع کرده است.
۳. اگر می‌خواهید فصل‌ها و مراحل حرم (`CHAPTERS` و `CHAPTER_1_STAGES`) در کد فعال باشد:
   - از `custom/sources/activity/MainActivity.java` به جای آن استفاده کنید.

---

## مرحله ۴: تنظیم امضای دیجیتال با Keystore (`dist/`)
۱. `Build → Generate Signed Bundle / APK`
۲. `APK` را انتخاب کنید.
۳. `Create new...` یا `Choose existing...`
۴. مسیر Keystore: `dist/rooshana_keystore.p12`
۵. رمز (`Keystore password`): `rooshana123`
۶. `Alias`: `rooshana_alias`
۷. `Key password`: `rooshana123`
۸. `Signature versions`: `V1 (Jar Signature)` و `V2 (Full APK Signature)` هر دو را تیک بزنید.

---

## مرحله ۵: کامپایل و ساخت APK نهایی
۱. `Build → Build Bundle(s) / APK(s) → Build APK(s)`
۲. Android Studio خودکار مراحل زیر را انجام می‌دهد:
   - `aapt` / `aapt2` → کامپایل منابع به `resources.arsc`
   - `javac` → `.class`
   - `d8` / `r8` → `.dex` (`classes.dex`)
   - `zip` / `zipalign` → بسته `.apk`
   - `apksigner` → امضای دیجیتال با Keystore

---

## مرحله ۶: خروجی نهایی
- مسیر APK امضا شده و قابل نصب:
  `app/build/outputs/apk/release/app-release.apk`
- این فایل `.apk` کاملاً قابل اجرا و نصب روی دستگاه Android است.

---

## نکته فنی مهم
منابع اصلاح‌شده (`custom/`) فقط فایل‌های متنی هستند (`XML`، `Java`). Android Studio با `Build → Make Project` آن‌ها را به باینری کامپایل می‌کند (`.dex` + `.arsc`). بدون Android Studio (یا `aapt` + `d8` در محیط Linux)، `.apk` قابل اجرا ساخته نمی‌شود.
