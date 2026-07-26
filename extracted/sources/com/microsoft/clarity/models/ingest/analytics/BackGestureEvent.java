package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class BackGestureEvent extends AnalyticsEvent {
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackGestureEvent(long j, ScreenMetadata screenMetadata) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        this.type = EventType.BackGesture;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ']';
    }
}
