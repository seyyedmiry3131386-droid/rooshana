package com.microsoft.clarity.models.ingest;

import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.f88;
import defpackage.js3;
import defpackage.ok4;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewMutationEvent extends BaseWebViewEvent {
    private final String pageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewMutationEvent(long j, String str, int i, ScreenMetadata screenMetadata, int i2, String str2) {
        super(j, str, i, screenMetadata, i2);
        js3.p(str, "event");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(str2, "pageUrl");
        this.pageUrl = str2;
    }

    public final WebViewMutationEvent copyWithNewData(long j, String str) {
        js3.p(str, "data");
        if (j == getTimestamp() && str.equals(getData())) {
            return this;
        }
        if (Long.parseLong(f88.B0(str, ok4.Z(f88.k0('[', 0, 6, str) + 1, f88.k0(',', 0, 6, str)))) == j) {
            return new WebViewMutationEvent(j, str, getWebViewHashCode(), getScreenMetadata(), getType().getCustomOrdinal(), this.pageUrl);
        }
        throw new IllegalArgumentException("timestamp value must match the one encoded in the data value");
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    @Override // com.microsoft.clarity.models.ingest.BaseWebViewEvent
    public WebViewMutationEvent copyWithNewTimestamp(long j) {
        return j == getTimestamp() ? this : new WebViewMutationEvent(j, copyDataWithNewTimestamp(j), getWebViewHashCode(), getScreenMetadata(), getType().getCustomOrdinal(), this.pageUrl);
    }
}
