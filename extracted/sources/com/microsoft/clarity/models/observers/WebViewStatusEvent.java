package com.microsoft.clarity.models.observers;

import android.webkit.WebView;
import com.microsoft.clarity.models.ingest.EventType;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewStatusEvent extends ObservedWebViewEvent {
    private final String data;
    private final ScreenMetadata screenMetadata;
    private final EventType type;
    private final String url;
    private final int webViewHashCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewStatusEvent(WebView webView, long j, ScreenMetadata screenMetadata, String str, WebViewStatus webViewStatus) {
        super(j);
        js3.p(webView, "webView");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(str, "url");
        js3.p(webViewStatus, "status");
        this.screenMetadata = screenMetadata;
        this.url = str;
        EventType eventType = EventType.WebViewStatus;
        this.type = eventType;
        this.data = "[" + j + ',' + eventType.getCustomOrdinal() + ',' + webView.getId() + ',' + webView.getUniqueDrawingId() + ",\"page-url\",\"" + str + "\"," + webViewStatus.ordinal() + ']';
        this.webViewHashCode = webView.hashCode();
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public String getData() {
        return this.data;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public String getPageUrl() {
        return this.url;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    /* JADX INFO: renamed from: getType, reason: collision with other method in class */
    public final EventType m25getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public int getWebViewHashCode() {
        return this.webViewHashCode;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public int getType() {
        return this.type.getCustomOrdinal();
    }
}
