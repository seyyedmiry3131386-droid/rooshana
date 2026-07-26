package com.google.j2objc.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LoopTranslation$LoopStyle {
    public static final /* synthetic */ LoopTranslation$LoopStyle[] a = {new LoopTranslation$LoopStyle("JAVA_ITERATOR", 0), new LoopTranslation$LoopStyle("FAST_ENUMERATION", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    LoopTranslation$LoopStyle EF5;

    public static LoopTranslation$LoopStyle valueOf(String str) {
        return (LoopTranslation$LoopStyle) Enum.valueOf(LoopTranslation$LoopStyle.class, str);
    }

    public static LoopTranslation$LoopStyle[] values() {
        return (LoopTranslation$LoopStyle[]) a.clone();
    }
}
