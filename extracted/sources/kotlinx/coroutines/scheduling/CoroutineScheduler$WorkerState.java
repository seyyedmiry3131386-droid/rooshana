package kotlinx.coroutines.scheduling;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineScheduler$WorkerState {
    public static final CoroutineScheduler$WorkerState a;
    public static final CoroutineScheduler$WorkerState b;
    public static final CoroutineScheduler$WorkerState c;
    public static final CoroutineScheduler$WorkerState d;
    public static final CoroutineScheduler$WorkerState e;
    public static final /* synthetic */ CoroutineScheduler$WorkerState[] f;

    static {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = new CoroutineScheduler$WorkerState("CPU_ACQUIRED", 0);
        a = coroutineScheduler$WorkerState;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = new CoroutineScheduler$WorkerState("BLOCKING", 1);
        b = coroutineScheduler$WorkerState2;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = new CoroutineScheduler$WorkerState("PARKING", 2);
        c = coroutineScheduler$WorkerState3;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = new CoroutineScheduler$WorkerState("DORMANT", 3);
        d = coroutineScheduler$WorkerState4;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState5 = new CoroutineScheduler$WorkerState("TERMINATED", 4);
        e = coroutineScheduler$WorkerState5;
        CoroutineScheduler$WorkerState[] coroutineScheduler$WorkerStateArr = {coroutineScheduler$WorkerState, coroutineScheduler$WorkerState2, coroutineScheduler$WorkerState3, coroutineScheduler$WorkerState4, coroutineScheduler$WorkerState5};
        f = coroutineScheduler$WorkerStateArr;
        a.a(coroutineScheduler$WorkerStateArr);
    }

    public static CoroutineScheduler$WorkerState valueOf(String str) {
        return (CoroutineScheduler$WorkerState) Enum.valueOf(CoroutineScheduler$WorkerState.class, str);
    }

    public static CoroutineScheduler$WorkerState[] values() {
        return (CoroutineScheduler$WorkerState[]) f.clone();
    }
}
