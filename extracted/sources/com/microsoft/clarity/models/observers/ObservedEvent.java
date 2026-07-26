package com.microsoft.clarity.models.observers;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ObservedEvent {
    private final long timestamp;

    public ObservedEvent(long j) {
        this.timestamp = j;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
