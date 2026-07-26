package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class ClosingFuture$State {
    public static final /* synthetic */ ClosingFuture$State[] a = {new ClosingFuture$State("OPEN", 0), new ClosingFuture$State("SUBSUMED", 1), new ClosingFuture$State("WILL_CLOSE", 2), new ClosingFuture$State("CLOSING", 3), new ClosingFuture$State("CLOSED", 4), new ClosingFuture$State("WILL_CREATE_VALUE_AND_CLOSER", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    ClosingFuture$State EF5;

    public static ClosingFuture$State valueOf(String str) {
        return (ClosingFuture$State) Enum.valueOf(ClosingFuture$State.class, str);
    }

    public static ClosingFuture$State[] values() {
        return (ClosingFuture$State[]) a.clone();
    }
}
