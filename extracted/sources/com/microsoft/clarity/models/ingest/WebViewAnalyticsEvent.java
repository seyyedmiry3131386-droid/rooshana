package com.microsoft.clarity.models.ingest;

import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAnalyticsEvent extends BaseWebViewEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAnalyticsEvent(long j, String str, int i, ScreenMetadata screenMetadata, int i2) {
        super(j, str, i, screenMetadata, i2);
        js3.p(str, "event");
        js3.p(screenMetadata, "screenMetadata");
    }

    @Override // com.microsoft.clarity.models.ingest.BaseWebViewEvent
    public WebViewAnalyticsEvent copyWithNewTimestamp(long j) {
        return j == getTimestamp() ? this : new WebViewAnalyticsEvent(j, copyDataWithNewTimestamp(j), getWebViewHashCode(), getScreenMetadata(), getType().getCustomOrdinal());
    }
}
