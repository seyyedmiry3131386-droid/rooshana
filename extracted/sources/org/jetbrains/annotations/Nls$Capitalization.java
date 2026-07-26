package org.jetbrains.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Nls$Capitalization {
    public static final /* synthetic */ Nls$Capitalization[] a = {new Nls$Capitalization("NotSpecified", 0), new Nls$Capitalization("Title", 1), new Nls$Capitalization("Sentence", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Nls$Capitalization EF5;

    public static Nls$Capitalization valueOf(String str) {
        return (Nls$Capitalization) Enum.valueOf(Nls$Capitalization.class, str);
    }

    public static Nls$Capitalization[] values() {
        return (Nls$Capitalization[]) a.clone();
    }
}
