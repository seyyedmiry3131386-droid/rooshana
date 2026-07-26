package com.microsoft.clarity.models.viewhierarchy;

import android.webkit.WebView;
import defpackage.js3;
import defpackage.yd1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewData {
    private boolean foundInDisplayList;
    private final int hashCode;
    private final boolean masked;
    private final long renderNodeId;
    private final WeakReference<WebView> webView;

    public WebViewData(WeakReference<WebView> weakReference, int i, long j, boolean z, boolean z2) {
        js3.p(weakReference, "webView");
        this.webView = weakReference;
        this.hashCode = i;
        this.renderNodeId = j;
        this.masked = z;
        this.foundInDisplayList = z2;
    }

    public final boolean getFoundInDisplayList() {
        return this.foundInDisplayList;
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final boolean getMasked() {
        return this.masked;
    }

    public final long getRenderNodeId() {
        return this.renderNodeId;
    }

    public final WeakReference<WebView> getWebView() {
        return this.webView;
    }

    public final void setFoundInDisplayList(boolean z) {
        this.foundInDisplayList = z;
    }

    public /* synthetic */ WebViewData(WeakReference weakReference, int i, long j, boolean z, boolean z2, int i2, yd1 yd1Var) {
        this(weakReference, i, j, z, (i2 & 16) != 0 ? false : z2);
    }
}
