package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class FirebaseExecutors$DirectExecutor implements Executor {
    public static final /* synthetic */ FirebaseExecutors$DirectExecutor[] a = {new FirebaseExecutors$DirectExecutor("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    FirebaseExecutors$DirectExecutor EF5;

    public static FirebaseExecutors$DirectExecutor valueOf(String str) {
        return (FirebaseExecutors$DirectExecutor) Enum.valueOf(FirebaseExecutors$DirectExecutor.class, str);
    }

    public static FirebaseExecutors$DirectExecutor[] values() {
        return (FirebaseExecutors$DirectExecutor[]) a.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
