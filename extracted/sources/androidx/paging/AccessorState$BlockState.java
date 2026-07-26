package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AccessorState$BlockState {
    public static final /* synthetic */ AccessorState$BlockState[] a;

    static {
        AccessorState$BlockState[] accessorState$BlockStateArr = {new AccessorState$BlockState("UNBLOCKED", 0), new AccessorState$BlockState("COMPLETED", 1), new AccessorState$BlockState("REQUIRES_REFRESH", 2)};
        a = accessorState$BlockStateArr;
        kotlin.enums.a.a(accessorState$BlockStateArr);
    }

    public static AccessorState$BlockState valueOf(String str) {
        return (AccessorState$BlockState) Enum.valueOf(AccessorState$BlockState.class, str);
    }

    public static AccessorState$BlockState[] values() {
        return (AccessorState$BlockState[]) a.clone();
    }
}
