package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MetricEvent extends AnalyticsEvent {
    private final Map<Metric, Long> metrics;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricEvent(long j, ScreenMetadata screenMetadata, Map<Metric, Long> map) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(map, "metrics");
        this.metrics = map;
        this.type = EventType.Metric;
    }

    public final Map<Metric, Long> getMetrics() {
        return this.metrics;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal());
        for (Map.Entry<Metric, Long> entry : this.metrics.entrySet()) {
            sb.append("," + entry.getKey().ordinal() + ',' + entry.getValue().longValue());
        }
        sb.append("]");
        String string = sb.toString();
        js3.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
