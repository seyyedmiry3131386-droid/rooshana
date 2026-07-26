package androidx.constraintlayout.core.state;

import defpackage.rm7;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class State$Chain {
    public static final /* synthetic */ State$Chain[] a;

    /* JADX INFO: Fake field, exist only in values array */
    State$Chain EF0;

    static {
        State$Chain state$Chain = new State$Chain("SPREAD", 0);
        State$Chain state$Chain2 = new State$Chain("SPREAD_INSIDE", 1);
        State$Chain state$Chain3 = new State$Chain("PACKED", 2);
        a = new State$Chain[]{state$Chain, state$Chain2, state$Chain3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put("packed", state$Chain3);
        map.put("spread_inside", state$Chain2);
        map.put("spread", state$Chain);
        rm7.v(2, map2, "packed", 1, "spread_inside");
        map2.put("spread", 0);
    }

    public static State$Chain valueOf(String str) {
        return (State$Chain) Enum.valueOf(State$Chain.class, str);
    }

    public static State$Chain[] values() {
        return (State$Chain[]) a.clone();
    }
}
