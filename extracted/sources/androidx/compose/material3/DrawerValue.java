package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DrawerValue {
    public static final /* synthetic */ DrawerValue[] a;

    static {
        DrawerValue[] drawerValueArr = {new DrawerValue("Closed", 0), new DrawerValue("Open", 1)};
        a = drawerValueArr;
        kotlin.enums.a.a(drawerValueArr);
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) a.clone();
    }
}
