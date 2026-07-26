package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RecyclerView$Adapter$StateRestorationPolicy {
    public static final RecyclerView$Adapter$StateRestorationPolicy a;
    public static final RecyclerView$Adapter$StateRestorationPolicy b;
    public static final RecyclerView$Adapter$StateRestorationPolicy c;
    public static final /* synthetic */ RecyclerView$Adapter$StateRestorationPolicy[] d;

    static {
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy = new RecyclerView$Adapter$StateRestorationPolicy("ALLOW", 0);
        a = recyclerView$Adapter$StateRestorationPolicy;
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2 = new RecyclerView$Adapter$StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
        b = recyclerView$Adapter$StateRestorationPolicy2;
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy3 = new RecyclerView$Adapter$StateRestorationPolicy("PREVENT", 2);
        c = recyclerView$Adapter$StateRestorationPolicy3;
        d = new RecyclerView$Adapter$StateRestorationPolicy[]{recyclerView$Adapter$StateRestorationPolicy, recyclerView$Adapter$StateRestorationPolicy2, recyclerView$Adapter$StateRestorationPolicy3};
    }

    public static RecyclerView$Adapter$StateRestorationPolicy valueOf(String str) {
        return (RecyclerView$Adapter$StateRestorationPolicy) Enum.valueOf(RecyclerView$Adapter$StateRestorationPolicy.class, str);
    }

    public static RecyclerView$Adapter$StateRestorationPolicy[] values() {
        return (RecyclerView$Adapter$StateRestorationPolicy[]) d.clone();
    }
}
