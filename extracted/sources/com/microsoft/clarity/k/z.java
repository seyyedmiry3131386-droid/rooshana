package com.microsoft.clarity.k;

import android.webkit.WebView;
import defpackage.dp2;
import defpackage.js3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends Lambda implements dp2 {
    public final /* synthetic */ WebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(WebView webView) {
        super(1);
        this.a = webView;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        js3.p(weakReference, "it");
        return Boolean.valueOf(js3.i(weakReference.get(), this.a));
    }
}
