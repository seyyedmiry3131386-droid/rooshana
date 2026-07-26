package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class CycleDetectingLockFactory$Policies {
    public static final /* synthetic */ CycleDetectingLockFactory$Policies[] a = {new CycleDetectingLockFactory$Policies() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies.1
    }, new CycleDetectingLockFactory$Policies() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies.2
    }, new CycleDetectingLockFactory$Policies() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory$Policies.3
    }};

    /* JADX INFO: Fake field, exist only in values array */
    CycleDetectingLockFactory$Policies EF2;

    public static CycleDetectingLockFactory$Policies valueOf(String str) {
        return (CycleDetectingLockFactory$Policies) Enum.valueOf(CycleDetectingLockFactory$Policies.class, str);
    }

    public static CycleDetectingLockFactory$Policies[] values() {
        return (CycleDetectingLockFactory$Policies[]) a.clone();
    }
}
