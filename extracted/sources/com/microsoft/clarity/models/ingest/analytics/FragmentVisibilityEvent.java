package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;
import defpackage.m88;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentVisibilityEvent extends VisibilityEvent {
    private final String fragmentName;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentVisibilityEvent(long j, ScreenMetadata screenMetadata, String str, String str2) {
        super(j, screenMetadata, str);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(str, "state");
        js3.p(str2, "fragmentName");
        this.fragmentName = str2;
        this.type = EventType.FragmentVisibility;
    }

    @Override // com.microsoft.clarity.models.ingest.analytics.VisibilityEvent, com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.analytics.VisibilityEvent, com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        String str = this.fragmentName;
        js3.p(str, "string");
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ",\"" + m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ") + "\",\"" + getState() + "\"]";
    }
}
