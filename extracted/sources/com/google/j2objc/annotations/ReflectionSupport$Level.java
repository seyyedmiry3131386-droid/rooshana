package com.google.j2objc.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ReflectionSupport$Level {
    public static final /* synthetic */ ReflectionSupport$Level[] a = {new ReflectionSupport$Level("NATIVE_ONLY", 0), new ReflectionSupport$Level("FULL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ReflectionSupport$Level EF5;

    public static ReflectionSupport$Level valueOf(String str) {
        return (ReflectionSupport$Level) Enum.valueOf(ReflectionSupport$Level.class, str);
    }

    public static ReflectionSupport$Level[] values() {
        return (ReflectionSupport$Level[]) a.clone();
    }
}
