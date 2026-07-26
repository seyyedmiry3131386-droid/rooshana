package com.microsoft.clarity.models.ingest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SessionEvent {
    private final long timestamp;

    public SessionEvent(long j) {
        this.timestamp = j;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public abstract EventType getType();

    public final long relativeTimestamp(long j) {
        return this.timestamp - j;
    }

    public abstract String serialize(long j);
}
