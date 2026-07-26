package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class BaselineEvent extends AnalyticsEvent {
    private final EventType type;
    private final boolean visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaselineEvent(long j, ScreenMetadata screenMetadata, boolean z) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        this.visible = z;
        this.type = EventType.Baseline;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ',' + (this.visible ? 1 : 0) + ",0,0,0,0,0,0,0,0,0]";
    }
}
