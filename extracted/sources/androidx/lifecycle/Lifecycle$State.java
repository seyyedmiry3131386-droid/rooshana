package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Lifecycle$State {
    public static final Lifecycle$State a;
    public static final Lifecycle$State b;
    public static final Lifecycle$State c;
    public static final Lifecycle$State d;
    public static final Lifecycle$State e;
    public static final /* synthetic */ Lifecycle$State[] f;

    static {
        Lifecycle$State lifecycle$State = new Lifecycle$State("DESTROYED", 0);
        a = lifecycle$State;
        Lifecycle$State lifecycle$State2 = new Lifecycle$State("INITIALIZED", 1);
        b = lifecycle$State2;
        Lifecycle$State lifecycle$State3 = new Lifecycle$State("CREATED", 2);
        c = lifecycle$State3;
        Lifecycle$State lifecycle$State4 = new Lifecycle$State("STARTED", 3);
        d = lifecycle$State4;
        Lifecycle$State lifecycle$State5 = new Lifecycle$State("RESUMED", 4);
        e = lifecycle$State5;
        Lifecycle$State[] lifecycle$StateArr = {lifecycle$State, lifecycle$State2, lifecycle$State3, lifecycle$State4, lifecycle$State5};
        f = lifecycle$StateArr;
        kotlin.enums.a.a(lifecycle$StateArr);
    }

    public static Lifecycle$State valueOf(String str) {
        return (Lifecycle$State) Enum.valueOf(Lifecycle$State.class, str);
    }

    public static Lifecycle$State[] values() {
        return (Lifecycle$State[]) f.clone();
    }

    public final boolean a(Lifecycle$State lifecycle$State) {
        return compareTo(lifecycle$State) >= 0;
    }
}
