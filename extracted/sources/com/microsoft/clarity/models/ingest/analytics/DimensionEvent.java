package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;
import defpackage.m88;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DimensionEvent extends AnalyticsEvent {
    private final Map<Dimension, String> dimensions;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DimensionEvent(long j, ScreenMetadata screenMetadata, Map<Dimension, String> map) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(map, "dimensions");
        this.dimensions = map;
        this.type = EventType.Dimension;
    }

    public final Map<Dimension, String> getDimensions() {
        return this.dimensions;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal());
        for (Map.Entry<Dimension, String> entry : this.dimensions.entrySet()) {
            String value = entry.getValue();
            js3.p(value, "string");
            sb.append("," + entry.getKey().getCustomOrdinal() + ",[\"" + m88.X(m88.X(m88.X(m88.X(value, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ") + "\"]");
        }
        sb.append("]");
        String string = sb.toString();
        js3.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
