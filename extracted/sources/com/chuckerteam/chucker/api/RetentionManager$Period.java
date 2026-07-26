package com.chuckerteam.chucker.api;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RetentionManager$Period {
    public static final /* synthetic */ RetentionManager$Period[] a;

    static {
        RetentionManager$Period[] retentionManager$PeriodArr = {new RetentionManager$Period("ONE_HOUR", 0), new RetentionManager$Period("ONE_DAY", 1), new RetentionManager$Period("ONE_WEEK", 2), new RetentionManager$Period("FOREVER", 3)};
        a = retentionManager$PeriodArr;
        a.a(retentionManager$PeriodArr);
    }

    public static RetentionManager$Period valueOf(String str) {
        return (RetentionManager$Period) Enum.valueOf(RetentionManager$Period.class, str);
    }

    public static RetentionManager$Period[] values() {
        return (RetentionManager$Period[]) a.clone();
    }
}
