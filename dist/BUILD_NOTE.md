# نکته درباره نسخه APK

این مخزن حاوی خروجی دیکامپایلر (`__محفلستان_myket.apk_Decompiler.com.zip`) است و نه فایل باینری `.apk` اصلی.

برای ساخت مجدد فایل باینری `.apk` از منابع اصلاح‌شده (`custom/` و `fixed_sources/`)، نیاز به ابزارهای زیر است که در این محیط موجود نیست:
- Android SDK (aapt / aapt2)
- apktool یا zipalign / apksigner
- Gradle یا محیط Build Android

**فایل‌های آماده برای بازسازی در پوشه `dist/`:**
- `rooshana_decompiled_package.zip` → بسته اصلی دیکامپایل شده
- `MainActivity_fixed.java` → کد اصلاح‌شده فنی
- `MainActivity_custom.java` → کد با فصل‌ها و مراحل حرم
- `custom/resources/res/values/` → منابع شخصی‌سازی شده

در صورت دسترسی به محیط Android Build، می‌توان با `apktool b` یا `gradlew assemble` این منابع را مجدداً به `.apk` تبدیل کرد.
