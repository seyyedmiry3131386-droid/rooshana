package com.microsoft.clarity.k;

import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.observers.WebViewStatus;
import defpackage.js3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public final WeakReference a;
    public final ScreenMetadata b;
    public WebViewStatus c;

    public u(WeakReference weakReference, ScreenMetadata screenMetadata) {
        js3.p(weakReference, "webViewRef");
        js3.p(screenMetadata, "screenMetadata");
        this.a = weakReference;
        this.b = screenMetadata;
    }
}
