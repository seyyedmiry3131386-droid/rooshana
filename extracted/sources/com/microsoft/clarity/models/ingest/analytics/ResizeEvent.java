package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.dw1;

/* JADX INFO: loaded from: classes3.dex */
public final class ResizeEvent extends AnalyticsEvent {
    private final int height;
    private final EventType type;
    private final int width;

    public ResizeEvent(long j, ScreenMetadata screenMetadata, int i, int i2) {
        super(j, screenMetadata);
        this.width = i;
        this.height = i2;
        this.type = EventType.Resize;
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
        sb.append(",");
        sb.append(this.width);
        sb.append(",");
        return dw1.k(this.height, "]", sb);
    }
}
