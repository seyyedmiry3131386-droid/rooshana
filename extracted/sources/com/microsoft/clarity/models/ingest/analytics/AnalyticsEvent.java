package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.SessionEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnalyticsEvent extends SessionEvent {
    private final ScreenMetadata screenMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsEvent(long j, ScreenMetadata screenMetadata) {
        super(j);
        js3.p(screenMetadata, "screenMetadata");
        this.screenMetadata = screenMetadata;
    }

    public final ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }
}
