package androidx.constraintlayout.core.state;

import defpackage.rm7;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class State$Wrap {
    public static final /* synthetic */ State$Wrap[] a;

    /* JADX INFO: Fake field, exist only in values array */
    State$Wrap EF0;

    static {
        State$Wrap state$Wrap = new State$Wrap("NONE", 0);
        State$Wrap state$Wrap2 = new State$Wrap("CHAIN", 1);
        State$Wrap state$Wrap3 = new State$Wrap("ALIGNED", 2);
        a = new State$Wrap[]{state$Wrap, state$Wrap2, state$Wrap3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put("none", state$Wrap);
        map.put("chain", state$Wrap2);
        map.put("aligned", state$Wrap3);
        rm7.v(0, map2, "none", 3, "chain");
        map2.put("aligned", 2);
    }

    public static State$Wrap valueOf(String str) {
        return (State$Wrap) Enum.valueOf(State$Wrap.class, str);
    }

    public static State$Wrap[] values() {
        return (State$Wrap[]) a.clone();
    }
}
