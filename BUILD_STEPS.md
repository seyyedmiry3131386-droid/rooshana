# مراحل کامپایل APK از منابع اصلاح‌شده

## پیش‌نیاز محیط (در این محیط موجود نیست)
- `openjdk-11-jdk` (javac)
- `android-sdk-build-tools` (aapt, d8, apksigner, zipalign)
- `apktool` (برای بازسازی از smali یا بازسازی کامل)

## مراحل دقیق

### ۱. بازسازی با apktool
```bash
apktool d __محفلستان_myket.apk_Decompiler.com.zip -o build_raw/
```

### ۲. جایگزینی منابع شخصی‌سازی‌شده
```bash
cp custom/resources/res/values/*.xml build_raw/res/values/
```

### ۳. جایگزینی کد اصلاح‌شده
اگر خروجی `sources/` باشد (Java text):
```bash
javac -classpath $ANDROID_SDK/platforms/android-36/android.jar \
  -d build_raw/classes/ fixed_sources/activity/MainActivity.java
d8 --release --output build_raw/ build_raw/classes/
```

### ۴. کامپایل منابع
```bash
aapt package -f -m -S build_raw/res/ -J build_raw/gen/ \
  -M build_raw/AndroidManifest.xml \
  -I $ANDROID_SDK/platforms/android-36/android.jar \
  -F build_raw/resources.arsc
```

### ۵. ساخت APK
```bash
zip -r build_raw/app_unsigned.apk \
  build_raw/res/ build_raw/classes.dex \
  build_raw/lib/ META-INF/
```

### ۶. امضای دیجیتال (با keystore موجود)
```bash
apksigner sign --ks dist/rooshana_keystore.p12 \
  --ks-pass pass:rooshana123 \
  --out rooshana_final.apk build_raw/app_unsigned.apk
# یا:
jarsigner -keystore dist/rooshana_keystore.p12 \
  -storepass rooshana123 -sigalg SHA1withRSA -digestalg SHA1 \
  build_raw/app_unsigned.apk rooshana_alias
```

### ۷. تراز کردن
```bash
zipalign -p -f -v 4 rooshana_final.apk rooshana_final_aligned.apk
```

## نکته فنی
این مخزن فقط `sources/` و `resources/` متنی دارد (بدون `classes.dex`). برای `.apk` کاملاً قابل اجرا، `classes.dex` باید از `sources/` با `javac` → `.class` → `d8` تولید شود. بدون `Android SDK` این مرحله امکان‌پذیر نیست.
