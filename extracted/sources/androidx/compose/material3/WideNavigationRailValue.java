package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class WideNavigationRailValue {
    public static final /* synthetic */ WideNavigationRailValue[] a;

    static {
        WideNavigationRailValue[] wideNavigationRailValueArr = {new WideNavigationRailValue("Collapsed", 0), new WideNavigationRailValue("Expanded", 1)};
        a = wideNavigationRailValueArr;
        kotlin.enums.a.a(wideNavigationRailValueArr);
    }

    public static WideNavigationRailValue valueOf(String str) {
        return (WideNavigationRailValue) Enum.valueOf(WideNavigationRailValue.class, str);
    }

    public static WideNavigationRailValue[] values() {
        return (WideNavigationRailValue[]) a.clone();
    }
}
