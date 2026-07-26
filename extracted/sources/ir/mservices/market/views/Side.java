package ir.mservices.market.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Side {
    public static final Side a;
    public static final Side b;
    public static final /* synthetic */ Side[] c;

    static {
        Side side = new Side("NONE", 0);
        Side side2 = new Side("TOP", 1);
        Side side3 = new Side("BOTTOM", 2);
        Side side4 = new Side("START", 3);
        Side side5 = new Side("END", 4);
        a = side5;
        Side side6 = new Side("ALL", 5);
        b = side6;
        Side[] sideArr = {side, side2, side3, side4, side5, side6};
        c = sideArr;
        kotlin.enums.a.a(sideArr);
    }

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) c.clone();
    }
}
