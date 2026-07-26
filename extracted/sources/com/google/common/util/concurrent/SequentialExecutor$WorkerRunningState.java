package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class SequentialExecutor$WorkerRunningState {
    public static final /* synthetic */ SequentialExecutor$WorkerRunningState[] a = {new SequentialExecutor$WorkerRunningState("IDLE", 0), new SequentialExecutor$WorkerRunningState("QUEUING", 1), new SequentialExecutor$WorkerRunningState("QUEUED", 2), new SequentialExecutor$WorkerRunningState("RUNNING", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    SequentialExecutor$WorkerRunningState EF5;

    public static SequentialExecutor$WorkerRunningState valueOf(String str) {
        return (SequentialExecutor$WorkerRunningState) Enum.valueOf(SequentialExecutor$WorkerRunningState.class, str);
    }

    public static SequentialExecutor$WorkerRunningState[] values() {
        return (SequentialExecutor$WorkerRunningState[]) a.clone();
    }
}
