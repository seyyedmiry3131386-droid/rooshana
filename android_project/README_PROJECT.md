# پروژه روشنا (Rooshana) — آماده برای ساخت APK

## ساختار
- `app/src/main/java/activity/MainActivity.java` → کد اصلی با فصل‌ها و مراحل حرم
- `app/src/main/res/values/` → منابع شخصی‌سازی شده (نام، رنگ، متن، فصل‌ها)
- `app/src/main/AndroidManifest.xml` → مانیفست اصلی

## مراحل ساخت با Android Studio
1. `File → Open` → انتخاب پوشه `android_project/`
2. `Build → Build Bundle(s) / APK(s) → Build APK(s)`
3. خروجی: `app/build/outputs/apk/release/app-release.apk`

## امضای دیجیتال
- Keystore موجود: `../dist/rooshana_keystore.p12`
- Alias: `rooshana_alias`
- Password: `rooshana123`
- راهنما: `../ANDROID_STUDIO_BUILD.md`
