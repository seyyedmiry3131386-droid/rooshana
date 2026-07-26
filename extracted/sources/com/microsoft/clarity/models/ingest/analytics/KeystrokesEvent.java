package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.dw1;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystrokesEvent extends AnalyticsEvent {
    private final int count;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeystrokesEvent(long j, ScreenMetadata screenMetadata, int i) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        this.count = i;
        this.type = EventType.Keystrokes;
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
        sb.append(',');
        return dw1.q(sb, this.count, ']');
    }
}
