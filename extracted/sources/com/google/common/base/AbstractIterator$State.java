package com.google.common.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class AbstractIterator$State {
    public static final AbstractIterator$State a;
    public static final AbstractIterator$State b;
    public static final AbstractIterator$State c;
    public static final AbstractIterator$State d;
    public static final /* synthetic */ AbstractIterator$State[] e;

    static {
        AbstractIterator$State abstractIterator$State = new AbstractIterator$State("READY", 0);
        a = abstractIterator$State;
        AbstractIterator$State abstractIterator$State2 = new AbstractIterator$State("NOT_READY", 1);
        b = abstractIterator$State2;
        AbstractIterator$State abstractIterator$State3 = new AbstractIterator$State("DONE", 2);
        c = abstractIterator$State3;
        AbstractIterator$State abstractIterator$State4 = new AbstractIterator$State("FAILED", 3);
        d = abstractIterator$State4;
        e = new AbstractIterator$State[]{abstractIterator$State, abstractIterator$State2, abstractIterator$State3, abstractIterator$State4};
    }

    public static AbstractIterator$State valueOf(String str) {
        return (AbstractIterator$State) Enum.valueOf(AbstractIterator$State.class, str);
    }

    public static AbstractIterator$State[] values() {
        return (AbstractIterator$State[]) e.clone();
    }
}
