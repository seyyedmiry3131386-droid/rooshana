package androidx.compose.foundation.text.input.internal.undo;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    public static final /* synthetic */ TextFieldEditUndoBehavior[] a;

    static {
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = {new TextFieldEditUndoBehavior("MergeIfPossible", 0), new TextFieldEditUndoBehavior("ClearHistory", 1), new TextFieldEditUndoBehavior("NeverMerge", 2)};
        a = textFieldEditUndoBehaviorArr;
        a.a(textFieldEditUndoBehaviorArr);
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) a.clone();
    }
}
