package androidx.constraintlayout.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable$Type {
    public static final SolverVariable$Type a;
    public static final SolverVariable$Type b;
    public static final SolverVariable$Type c;
    public static final SolverVariable$Type d;
    public static final /* synthetic */ SolverVariable$Type[] e;

    static {
        SolverVariable$Type solverVariable$Type = new SolverVariable$Type("UNRESTRICTED", 0);
        a = solverVariable$Type;
        SolverVariable$Type solverVariable$Type2 = new SolverVariable$Type("CONSTANT", 1);
        SolverVariable$Type solverVariable$Type3 = new SolverVariable$Type("SLACK", 2);
        b = solverVariable$Type3;
        SolverVariable$Type solverVariable$Type4 = new SolverVariable$Type("ERROR", 3);
        c = solverVariable$Type4;
        SolverVariable$Type solverVariable$Type5 = new SolverVariable$Type("UNKNOWN", 4);
        d = solverVariable$Type5;
        e = new SolverVariable$Type[]{solverVariable$Type, solverVariable$Type2, solverVariable$Type3, solverVariable$Type4, solverVariable$Type5};
    }

    public static SolverVariable$Type valueOf(String str) {
        return (SolverVariable$Type) Enum.valueOf(SolverVariable$Type.class, str);
    }

    public static SolverVariable$Type[] values() {
        return (SolverVariable$Type[]) e.clone();
    }
}
