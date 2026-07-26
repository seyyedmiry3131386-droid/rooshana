package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class LayoutId {
    public static final /* synthetic */ LayoutId[] a;

    static {
        LayoutId[] layoutIdArr = {new LayoutId("Selector", 0), new LayoutId("InnerCircle", 1)};
        a = layoutIdArr;
        kotlin.enums.a.a(layoutIdArr);
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) a.clone();
    }
}
