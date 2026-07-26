package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.q.q;
import defpackage.js3;
import defpackage.o40;

/* JADX INFO: loaded from: classes3.dex */
public final class ScriptErrorEvent extends AnalyticsEvent {
    private final String message;
    private final String stackTrace;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScriptErrorEvent(long j, String str, String str2, ScreenMetadata screenMetadata) {
        super(j, screenMetadata);
        js3.p(str, "message");
        js3.p(str2, "stackTrace");
        js3.p(screenMetadata, "screenMetadata");
        this.message = str;
        this.stackTrace = str2;
        this.type = EventType.ScriptError;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        String strA = q.a(this.message);
        String strA2 = q.a(this.stackTrace);
        StringBuilder sb = new StringBuilder("[");
        sb.append(relativeTimestamp(j));
        sb.append(',');
        sb.append(getType().getCustomOrdinal());
        o40.I(",\"", strA, "\",0,0,\"", strA2, sb);
        sb.append("\",\"");
        sb.append(getScreenMetadata().getName());
        sb.append("\"]");
        return sb.toString();
    }
}
