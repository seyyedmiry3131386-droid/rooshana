package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsentEvent extends AnalyticsEvent {
    private final ConsentStatus consentStatus;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentEvent(long j, ScreenMetadata screenMetadata, ConsentStatus consentStatus) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(consentStatus, "consentStatus");
        this.consentStatus = consentStatus;
        this.type = EventType.Consent;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ',' + this.consentStatus.getSource().ordinal() + ',' + (this.consentStatus.getAdsStorage() ? 1 : 0) + ',' + (this.consentStatus.getAnalyticsStorage() ? 1 : 0) + ']';
    }
}
