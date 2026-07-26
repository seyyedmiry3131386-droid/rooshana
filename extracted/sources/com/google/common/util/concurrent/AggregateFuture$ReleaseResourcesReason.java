package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class AggregateFuture$ReleaseResourcesReason {
    public static final /* synthetic */ AggregateFuture$ReleaseResourcesReason[] a = {new AggregateFuture$ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0), new AggregateFuture$ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    AggregateFuture$ReleaseResourcesReason EF5;

    public static AggregateFuture$ReleaseResourcesReason valueOf(String str) {
        return (AggregateFuture$ReleaseResourcesReason) Enum.valueOf(AggregateFuture$ReleaseResourcesReason.class, str);
    }

    public static AggregateFuture$ReleaseResourcesReason[] values() {
        return (AggregateFuture$ReleaseResourcesReason[]) a.clone();
    }
}
