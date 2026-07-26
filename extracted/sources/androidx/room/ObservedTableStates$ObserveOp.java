package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ObservedTableStates$ObserveOp {
    public static final ObservedTableStates$ObserveOp a;
    public static final ObservedTableStates$ObserveOp b;
    public static final ObservedTableStates$ObserveOp c;
    public static final /* synthetic */ ObservedTableStates$ObserveOp[] d;

    static {
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp = new ObservedTableStates$ObserveOp("NO_OP", 0);
        a = observedTableStates$ObserveOp;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp2 = new ObservedTableStates$ObserveOp("ADD", 1);
        b = observedTableStates$ObserveOp2;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp3 = new ObservedTableStates$ObserveOp("REMOVE", 2);
        c = observedTableStates$ObserveOp3;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr = {observedTableStates$ObserveOp, observedTableStates$ObserveOp2, observedTableStates$ObserveOp3};
        d = observedTableStates$ObserveOpArr;
        kotlin.enums.a.a(observedTableStates$ObserveOpArr);
    }

    public static ObservedTableStates$ObserveOp valueOf(String str) {
        return (ObservedTableStates$ObserveOp) Enum.valueOf(ObservedTableStates$ObserveOp.class, str);
    }

    public static ObservedTableStates$ObserveOp[] values() {
        return (ObservedTableStates$ObserveOp[]) d.clone();
    }
}
