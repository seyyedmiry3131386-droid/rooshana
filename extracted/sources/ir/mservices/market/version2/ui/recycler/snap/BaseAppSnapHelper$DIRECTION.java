package ir.mservices.market.version2.ui.recycler.snap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseAppSnapHelper$DIRECTION {
    public static final BaseAppSnapHelper$DIRECTION a;
    public static final BaseAppSnapHelper$DIRECTION b;
    public static final BaseAppSnapHelper$DIRECTION c;
    public static final /* synthetic */ BaseAppSnapHelper$DIRECTION[] d;

    static {
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION = new BaseAppSnapHelper$DIRECTION("RIGHT", 0);
        a = baseAppSnapHelper$DIRECTION;
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION2 = new BaseAppSnapHelper$DIRECTION("LEFT", 1);
        b = baseAppSnapHelper$DIRECTION2;
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION3 = new BaseAppSnapHelper$DIRECTION("UP", 2);
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION4 = new BaseAppSnapHelper$DIRECTION("DOWN", 3);
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION5 = new BaseAppSnapHelper$DIRECTION("NONE", 4);
        c = baseAppSnapHelper$DIRECTION5;
        d = new BaseAppSnapHelper$DIRECTION[]{baseAppSnapHelper$DIRECTION, baseAppSnapHelper$DIRECTION2, baseAppSnapHelper$DIRECTION3, baseAppSnapHelper$DIRECTION4, baseAppSnapHelper$DIRECTION5};
    }

    public static BaseAppSnapHelper$DIRECTION valueOf(String str) {
        return (BaseAppSnapHelper$DIRECTION) Enum.valueOf(BaseAppSnapHelper$DIRECTION.class, str);
    }

    public static BaseAppSnapHelper$DIRECTION[] values() {
        return (BaseAppSnapHelper$DIRECTION[]) d.clone();
    }
}
