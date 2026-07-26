package com.google.firebase.messaging.threads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadPriority {
    public static final /* synthetic */ ThreadPriority[] a = {new ThreadPriority("LOW_POWER", 0), new ThreadPriority("HIGH_SPEED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ThreadPriority EF5;

    public static ThreadPriority valueOf(String str) {
        return (ThreadPriority) Enum.valueOf(ThreadPriority.class, str);
    }

    public static ThreadPriority[] values() {
        return (ThreadPriority[]) a.clone();
    }
}
