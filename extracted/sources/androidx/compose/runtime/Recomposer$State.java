package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$State {
    public static final Recomposer$State a;
    public static final Recomposer$State b;
    public static final Recomposer$State c;
    public static final Recomposer$State d;
    public static final Recomposer$State e;
    public static final Recomposer$State f;
    public static final /* synthetic */ Recomposer$State[] g;

    static {
        Recomposer$State recomposer$State = new Recomposer$State("ShutDown", 0);
        a = recomposer$State;
        Recomposer$State recomposer$State2 = new Recomposer$State("ShuttingDown", 1);
        b = recomposer$State2;
        Recomposer$State recomposer$State3 = new Recomposer$State("Inactive", 2);
        c = recomposer$State3;
        Recomposer$State recomposer$State4 = new Recomposer$State("InactivePendingWork", 3);
        d = recomposer$State4;
        Recomposer$State recomposer$State5 = new Recomposer$State("Idle", 4);
        e = recomposer$State5;
        Recomposer$State recomposer$State6 = new Recomposer$State("PendingWork", 5);
        f = recomposer$State6;
        Recomposer$State[] recomposer$StateArr = {recomposer$State, recomposer$State2, recomposer$State3, recomposer$State4, recomposer$State5, recomposer$State6};
        g = recomposer$StateArr;
        kotlin.enums.a.a(recomposer$StateArr);
    }

    public static Recomposer$State valueOf(String str) {
        return (Recomposer$State) Enum.valueOf(Recomposer$State.class, str);
    }

    public static Recomposer$State[] values() {
        return (Recomposer$State[]) g.clone();
    }
}
