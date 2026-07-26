package kotlin.text;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CharCategory {
    public static final /* synthetic */ CharCategory[] a;

    static {
        CharCategory[] charCategoryArr = {new CharCategory("UNASSIGNED", 0), new CharCategory("UPPERCASE_LETTER", 1), new CharCategory("LOWERCASE_LETTER", 2), new CharCategory("TITLECASE_LETTER", 3), new CharCategory("MODIFIER_LETTER", 4), new CharCategory("OTHER_LETTER", 5), new CharCategory("NON_SPACING_MARK", 6), new CharCategory("ENCLOSING_MARK", 7), new CharCategory("COMBINING_SPACING_MARK", 8), new CharCategory("DECIMAL_DIGIT_NUMBER", 9), new CharCategory("LETTER_NUMBER", 10), new CharCategory("OTHER_NUMBER", 11), new CharCategory("SPACE_SEPARATOR", 12), new CharCategory("LINE_SEPARATOR", 13), new CharCategory("PARAGRAPH_SEPARATOR", 14), new CharCategory("CONTROL", 15), new CharCategory("FORMAT", 16), new CharCategory("PRIVATE_USE", 17), new CharCategory("SURROGATE", 18), new CharCategory("DASH_PUNCTUATION", 19), new CharCategory("START_PUNCTUATION", 20), new CharCategory("END_PUNCTUATION", 21), new CharCategory("CONNECTOR_PUNCTUATION", 22), new CharCategory("OTHER_PUNCTUATION", 23), new CharCategory("MATH_SYMBOL", 24), new CharCategory("CURRENCY_SYMBOL", 25), new CharCategory("MODIFIER_SYMBOL", 26), new CharCategory("OTHER_SYMBOL", 27), new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28), new CharCategory("FINAL_QUOTE_PUNCTUATION", 29)};
        a = charCategoryArr;
        a.a(charCategoryArr);
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) a.clone();
    }
}
