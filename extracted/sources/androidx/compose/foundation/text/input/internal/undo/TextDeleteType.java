package androidx.compose.foundation.text.input.internal.undo;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextDeleteType {
    public static final /* synthetic */ TextDeleteType[] a;

    static {
        TextDeleteType[] textDeleteTypeArr = {new TextDeleteType("Start", 0), new TextDeleteType("End", 1), new TextDeleteType("Inner", 2), new TextDeleteType("NotByUser", 3)};
        a = textDeleteTypeArr;
        a.a(textDeleteTypeArr);
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) a.clone();
    }
}
