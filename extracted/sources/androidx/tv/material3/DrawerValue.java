package androidx.tv.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DrawerValue {
    public static final DrawerValue a;
    public static final DrawerValue b;
    public static final /* synthetic */ DrawerValue[] c;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        a = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        b = drawerValue2;
        c = new DrawerValue[]{drawerValue, drawerValue2};
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) c.clone();
    }
}
