package androidx.constraintlayout.core.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor$Type {
    public static final ConstraintAnchor$Type a;
    public static final ConstraintAnchor$Type b;
    public static final ConstraintAnchor$Type c;
    public static final ConstraintAnchor$Type d;
    public static final ConstraintAnchor$Type e;
    public static final ConstraintAnchor$Type f;
    public static final ConstraintAnchor$Type g;
    public static final ConstraintAnchor$Type h;
    public static final /* synthetic */ ConstraintAnchor$Type[] i;

    /* JADX INFO: Fake field, exist only in values array */
    ConstraintAnchor$Type EF0;

    static {
        ConstraintAnchor$Type constraintAnchor$Type = new ConstraintAnchor$Type("NONE", 0);
        ConstraintAnchor$Type constraintAnchor$Type2 = new ConstraintAnchor$Type("LEFT", 1);
        a = constraintAnchor$Type2;
        ConstraintAnchor$Type constraintAnchor$Type3 = new ConstraintAnchor$Type("TOP", 2);
        b = constraintAnchor$Type3;
        ConstraintAnchor$Type constraintAnchor$Type4 = new ConstraintAnchor$Type("RIGHT", 3);
        c = constraintAnchor$Type4;
        ConstraintAnchor$Type constraintAnchor$Type5 = new ConstraintAnchor$Type("BOTTOM", 4);
        d = constraintAnchor$Type5;
        ConstraintAnchor$Type constraintAnchor$Type6 = new ConstraintAnchor$Type("BASELINE", 5);
        e = constraintAnchor$Type6;
        ConstraintAnchor$Type constraintAnchor$Type7 = new ConstraintAnchor$Type("CENTER", 6);
        f = constraintAnchor$Type7;
        ConstraintAnchor$Type constraintAnchor$Type8 = new ConstraintAnchor$Type("CENTER_X", 7);
        g = constraintAnchor$Type8;
        ConstraintAnchor$Type constraintAnchor$Type9 = new ConstraintAnchor$Type("CENTER_Y", 8);
        h = constraintAnchor$Type9;
        i = new ConstraintAnchor$Type[]{constraintAnchor$Type, constraintAnchor$Type2, constraintAnchor$Type3, constraintAnchor$Type4, constraintAnchor$Type5, constraintAnchor$Type6, constraintAnchor$Type7, constraintAnchor$Type8, constraintAnchor$Type9};
    }

    public static ConstraintAnchor$Type valueOf(String str) {
        return (ConstraintAnchor$Type) Enum.valueOf(ConstraintAnchor$Type.class, str);
    }

    public static ConstraintAnchor$Type[] values() {
        return (ConstraintAnchor$Type[]) i.clone();
    }
}
