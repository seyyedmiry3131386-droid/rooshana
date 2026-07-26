package androidx.constraintlayout.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAttribute$AttributeType {
    public static final ConstraintAttribute$AttributeType a;
    public static final ConstraintAttribute$AttributeType b;
    public static final ConstraintAttribute$AttributeType c;
    public static final ConstraintAttribute$AttributeType d;
    public static final ConstraintAttribute$AttributeType e;
    public static final ConstraintAttribute$AttributeType f;
    public static final ConstraintAttribute$AttributeType g;
    public static final ConstraintAttribute$AttributeType h;
    public static final /* synthetic */ ConstraintAttribute$AttributeType[] i;

    static {
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType = new ConstraintAttribute$AttributeType("INT_TYPE", 0);
        a = constraintAttribute$AttributeType;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType2 = new ConstraintAttribute$AttributeType("FLOAT_TYPE", 1);
        b = constraintAttribute$AttributeType2;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType3 = new ConstraintAttribute$AttributeType("COLOR_TYPE", 2);
        c = constraintAttribute$AttributeType3;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType4 = new ConstraintAttribute$AttributeType("COLOR_DRAWABLE_TYPE", 3);
        d = constraintAttribute$AttributeType4;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType5 = new ConstraintAttribute$AttributeType("STRING_TYPE", 4);
        e = constraintAttribute$AttributeType5;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType6 = new ConstraintAttribute$AttributeType("BOOLEAN_TYPE", 5);
        f = constraintAttribute$AttributeType6;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType7 = new ConstraintAttribute$AttributeType("DIMENSION_TYPE", 6);
        g = constraintAttribute$AttributeType7;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType8 = new ConstraintAttribute$AttributeType("REFERENCE_TYPE", 7);
        h = constraintAttribute$AttributeType8;
        i = new ConstraintAttribute$AttributeType[]{constraintAttribute$AttributeType, constraintAttribute$AttributeType2, constraintAttribute$AttributeType3, constraintAttribute$AttributeType4, constraintAttribute$AttributeType5, constraintAttribute$AttributeType6, constraintAttribute$AttributeType7, constraintAttribute$AttributeType8};
    }

    public static ConstraintAttribute$AttributeType valueOf(String str) {
        return (ConstraintAttribute$AttributeType) Enum.valueOf(ConstraintAttribute$AttributeType.class, str);
    }

    public static ConstraintAttribute$AttributeType[] values() {
        return (ConstraintAttribute$AttributeType[]) i.clone();
    }
}
