# گزارش شخصی‌سازی پروژه «روشنا»

## تغییرات اعمال‌شده

### ۱. نام برنامه
- `app_name`: `Myket` → `روشنا`
- فایل: `custom/resources/res/values/strings.xml`

### ۲. رنگ و استایل جذاب‌تر (طلا و آبی تیره مذهبی)
- `style_color_rooshana_primary`: `#c8a84d` (طلا)
- `style_color_rooshana_secondary`: `#0d2b4e` (آبی تیره)
- `style_color_rooshana_background`: `#f8f4e3` (کرم روشن)
- `style_color_rooshana_text`: `#1a1a2e`
- `Theme.Rooshana` در `styles.xml`

### ۳. فصل‌ها و مراحل جدید (حرم امامان)
- `arrays.xml`: آرایه `game_chapters` و `chapter_1_stages`
- `strings.xml`: متن‌های جدید برای مراحل صحن‌های حرم امام رضا (ع)

### ۴. مراحل فصل اول (حرم امام رضا - ع)
۱. صحن جامع رضوی
۲. صحن آزادی
۳. صحن قدس
۴. صحن جمهوری اسلامی
۵. صحن انقلاب اسلامی
۶. صحن هدایت
۷. صحن کوثر

### ۵. کد منبع اصلاح‌شده
- `fixed_sources/activity/MainActivity.java`: رفع خطاهای فنی و افزودن ارجاع به فصل‌ها و مراحل جدید
- `custom/sources/activity/MainActivity.java`: کد جدید با داده‌های فصل و مرحله

---

## فایل‌های تحویل داده شده
- `rooshana/custom/resources/res/values/strings.xml`
- `rooshana/custom/resources/res/values/colors.xml`
- `rooshana/custom/resources/res/values/arrays.xml`
- `rooshana/custom/resources/res/values/styles.xml`
- `rooshana/custom/sources/activity/MainActivity.java`
- `rooshana/TECHNICAL_REPORT.md`
