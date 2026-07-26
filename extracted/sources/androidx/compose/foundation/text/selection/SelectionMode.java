package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionMode {
    public static final /* synthetic */ SelectionMode[] a;

    static {
        SelectionMode[] selectionModeArr = {new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        }, new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        }};
        a = selectionModeArr;
        kotlin.enums.a.a(selectionModeArr);
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) a.clone();
    }
}
