package androidx.constraintlayout.core.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintWidget$DimensionBehaviour {
    public static final ConstraintWidget$DimensionBehaviour a;
    public static final ConstraintWidget$DimensionBehaviour b;
    public static final ConstraintWidget$DimensionBehaviour c;
    public static final ConstraintWidget$DimensionBehaviour d;
    public static final /* synthetic */ ConstraintWidget$DimensionBehaviour[] e;

    static {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = new ConstraintWidget$DimensionBehaviour("FIXED", 0);
        a = constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = new ConstraintWidget$DimensionBehaviour("WRAP_CONTENT", 1);
        b = constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = new ConstraintWidget$DimensionBehaviour("MATCH_CONSTRAINT", 2);
        c = constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = new ConstraintWidget$DimensionBehaviour("MATCH_PARENT", 3);
        d = constraintWidget$DimensionBehaviour4;
        e = new ConstraintWidget$DimensionBehaviour[]{constraintWidget$DimensionBehaviour, constraintWidget$DimensionBehaviour2, constraintWidget$DimensionBehaviour3, constraintWidget$DimensionBehaviour4};
    }

    public static ConstraintWidget$DimensionBehaviour valueOf(String str) {
        return (ConstraintWidget$DimensionBehaviour) Enum.valueOf(ConstraintWidget$DimensionBehaviour.class, str);
    }

    public static ConstraintWidget$DimensionBehaviour[] values() {
        return (ConstraintWidget$DimensionBehaviour[]) e.clone();
    }
}
