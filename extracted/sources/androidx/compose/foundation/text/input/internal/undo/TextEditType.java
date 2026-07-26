package androidx.compose.foundation.text.input.internal.undo;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextEditType {
    public static final /* synthetic */ TextEditType[] a;

    static {
        TextEditType[] textEditTypeArr = {new TextEditType("Insert", 0), new TextEditType("Delete", 1), new TextEditType("Replace", 2)};
        a = textEditTypeArr;
        a.a(textEditTypeArr);
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) a.clone();
    }
}
