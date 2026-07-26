package androidx.tv.foundation.text;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TvKeyboardAlignment {
    public static final /* synthetic */ TvKeyboardAlignment[] a;

    static {
        TvKeyboardAlignment[] tvKeyboardAlignmentArr = {new TvKeyboardAlignment("Left", 0), new TvKeyboardAlignment("Right", 1), new TvKeyboardAlignment("Center", 2), new TvKeyboardAlignment("Fullscreen", 3)};
        a = tvKeyboardAlignmentArr;
        a.a(tvKeyboardAlignmentArr);
    }

    public static TvKeyboardAlignment valueOf(String str) {
        return (TvKeyboardAlignment) Enum.valueOf(TvKeyboardAlignment.class, str);
    }

    public static TvKeyboardAlignment[] values() {
        return (TvKeyboardAlignment[]) a.clone();
    }
}
