package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class ExecutionSequencer$RunningState {
    public static final ExecutionSequencer$RunningState a;
    public static final /* synthetic */ ExecutionSequencer$RunningState[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ExecutionSequencer$RunningState EF0;

    static {
        ExecutionSequencer$RunningState executionSequencer$RunningState = new ExecutionSequencer$RunningState("NOT_RUN", 0);
        ExecutionSequencer$RunningState executionSequencer$RunningState2 = new ExecutionSequencer$RunningState("CANCELLED", 1);
        a = executionSequencer$RunningState2;
        b = new ExecutionSequencer$RunningState[]{executionSequencer$RunningState, executionSequencer$RunningState2, new ExecutionSequencer$RunningState("STARTED", 2)};
    }

    public static ExecutionSequencer$RunningState valueOf(String str) {
        return (ExecutionSequencer$RunningState) Enum.valueOf(ExecutionSequencer$RunningState.class, str);
    }

    public static ExecutionSequencer$RunningState[] values() {
        return (ExecutionSequencer$RunningState[]) b.clone();
    }
}
