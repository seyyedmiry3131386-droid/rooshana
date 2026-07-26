package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.g.T;
import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.q.q;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInstallReferrerEvent extends AnalyticsEvent {
    private final T referrerDetails;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstallReferrerEvent(long j, ScreenMetadata screenMetadata, T t) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(t, "referrerDetails");
        this.referrerDetails = t;
        this.type = EventType.AppInstallReferrer;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ",\"" + q.a(this.referrerDetails.a) + "\"," + this.referrerDetails.b + ',' + this.referrerDetails.c + ',' + this.referrerDetails.d + ',' + this.referrerDetails.e + ',' + (this.referrerDetails.f ? 1 : 0) + ",\"" + q.a(this.referrerDetails.g) + "\"]";
    }
}
