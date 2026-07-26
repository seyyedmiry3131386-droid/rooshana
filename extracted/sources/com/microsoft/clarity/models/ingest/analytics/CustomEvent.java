package com.microsoft.clarity.models.ingest.analytics;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;
import defpackage.m88;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomEvent extends AnalyticsEvent {
    private final EventType type;
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEvent(long j, ScreenMetadata screenMetadata, String str) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.value = str;
        this.type = EventType.Custom;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(relativeTimestamp(j));
        sb.append(',');
        sb.append(getType().getCustomOrdinal());
        sb.append(",\"");
        String str = this.value;
        js3.p(str, "string");
        sb.append(m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " "));
        sb.append("\"]");
        return sb.toString();
    }
}
