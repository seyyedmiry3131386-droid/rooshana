package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextToolbarStatus {
    public static final /* synthetic */ TextToolbarStatus[] a;

    static {
        TextToolbarStatus[] textToolbarStatusArr = {new TextToolbarStatus("Shown", 0), new TextToolbarStatus("Hidden", 1)};
        a = textToolbarStatusArr;
        kotlin.enums.a.a(textToolbarStatusArr);
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) a.clone();
    }
}
