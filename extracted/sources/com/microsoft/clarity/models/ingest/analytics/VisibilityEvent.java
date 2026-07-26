package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.dw1;

/* JADX INFO: loaded from: classes3.dex */
public class VisibilityEvent extends AnalyticsEvent {
    private final String state;
    private final EventType type;

    public VisibilityEvent(long j, ScreenMetadata screenMetadata, String str) {
        super(j, screenMetadata);
        this.state = str;
        this.type = EventType.Visibility;
    }

    public String getState() {
        return this.state;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(relativeTimestamp(j));
        sb.append(",");
        sb.append(getType().getCustomOrdinal());
        sb.append(",\"");
        return dw1.s(sb, this.state, "\"]");
    }
}
