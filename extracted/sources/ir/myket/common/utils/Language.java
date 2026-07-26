package ir.myket.common.utils;

import defpackage.r22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Language {
    public static final Language a;
    public static final /* synthetic */ Language[] b;
    public static final /* synthetic */ r22 c;

    static {
        Language language = new Language("EN", 0);
        Language language2 = new Language("FA", 1);
        a = language2;
        Language[] languageArr = {language, language2};
        b = languageArr;
        c = kotlin.enums.a.a(languageArr);
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) b.clone();
    }
}
