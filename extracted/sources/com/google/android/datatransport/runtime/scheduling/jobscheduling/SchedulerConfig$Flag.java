package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulerConfig$Flag {
    public static final SchedulerConfig$Flag a;
    public static final SchedulerConfig$Flag b;
    public static final SchedulerConfig$Flag c;
    public static final /* synthetic */ SchedulerConfig$Flag[] d;

    static {
        SchedulerConfig$Flag schedulerConfig$Flag = new SchedulerConfig$Flag("NETWORK_UNMETERED", 0);
        a = schedulerConfig$Flag;
        SchedulerConfig$Flag schedulerConfig$Flag2 = new SchedulerConfig$Flag("DEVICE_IDLE", 1);
        b = schedulerConfig$Flag2;
        SchedulerConfig$Flag schedulerConfig$Flag3 = new SchedulerConfig$Flag("DEVICE_CHARGING", 2);
        c = schedulerConfig$Flag3;
        d = new SchedulerConfig$Flag[]{schedulerConfig$Flag, schedulerConfig$Flag2, schedulerConfig$Flag3};
    }

    public static SchedulerConfig$Flag valueOf(String str) {
        return (SchedulerConfig$Flag) Enum.valueOf(SchedulerConfig$Flag.class, str);
    }

    public static SchedulerConfig$Flag[] values() {
        return (SchedulerConfig$Flag[]) d.clone();
    }
}
