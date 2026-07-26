package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Invalidation {
    public static final Invalidation a;
    public static final Invalidation b;
    public static final Invalidation c;
    public static final Invalidation d;
    public static final /* synthetic */ Invalidation[] e;

    static {
        Invalidation invalidation = new Invalidation("LookaheadMeasurement", 0);
        a = invalidation;
        Invalidation invalidation2 = new Invalidation("LookaheadPlacement", 1);
        b = invalidation2;
        Invalidation invalidation3 = new Invalidation("Measurement", 2);
        c = invalidation3;
        Invalidation invalidation4 = new Invalidation("Placement", 3);
        d = invalidation4;
        Invalidation[] invalidationArr = {invalidation, invalidation2, invalidation3, invalidation4};
        e = invalidationArr;
        kotlin.enums.a.a(invalidationArr);
    }

    public static Invalidation valueOf(String str) {
        return (Invalidation) Enum.valueOf(Invalidation.class, str);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) e.clone();
    }
}
