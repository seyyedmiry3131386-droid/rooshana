package com.microsoft.clarity.models.observers;

import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteraction extends ObservedEvent {
    private final AnalyticsEvent analyticsEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInteraction(AnalyticsEvent analyticsEvent) {
        super(analyticsEvent.getTimestamp());
        js3.p(analyticsEvent, "analyticsEvent");
        this.analyticsEvent = analyticsEvent;
    }

    public final AnalyticsEvent getAnalyticsEvent() {
        return this.analyticsEvent;
    }
}
