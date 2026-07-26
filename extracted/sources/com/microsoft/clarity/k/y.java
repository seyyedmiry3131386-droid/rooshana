package com.microsoft.clarity.k;

import android.webkit.WebView;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Lambda implements bp2 {
    public final /* synthetic */ G a;
    public final /* synthetic */ WebView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(WebView webView, G g) {
        super(0);
        this.a = g;
        this.b = webView;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        kotlin.collections.a.B0(new x(this.b), this.a.c);
        return tx8.a;
    }
}
