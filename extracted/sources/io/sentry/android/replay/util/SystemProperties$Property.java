package io.sentry.android.replay.util;

import defpackage.r22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SystemProperties$Property {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ SystemProperties$Property[] $VALUES;
    public static final SystemProperties$Property SOC_MODEL = new SystemProperties$Property("SOC_MODEL", 0);
    public static final SystemProperties$Property SOC_MANUFACTURER = new SystemProperties$Property("SOC_MANUFACTURER", 1);

    private static final /* synthetic */ SystemProperties$Property[] $values() {
        return new SystemProperties$Property[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        SystemProperties$Property[] systemProperties$PropertyArr$values = $values();
        $VALUES = systemProperties$PropertyArr$values;
        $ENTRIES = kotlin.enums.a.a(systemProperties$PropertyArr$values);
    }

    private SystemProperties$Property(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static SystemProperties$Property valueOf(String str) {
        return (SystemProperties$Property) Enum.valueOf(SystemProperties$Property.class, str);
    }

    public static SystemProperties$Property[] values() {
        return (SystemProperties$Property[]) $VALUES.clone();
    }
}
