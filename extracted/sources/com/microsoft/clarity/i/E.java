package com.microsoft.clarity.i;

import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.ingest.WebViewMutationEvent;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends Lambda implements bp2 {
    public final /* synthetic */ WebViewMutationEvent a;
    public final /* synthetic */ P b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(WebViewMutationEvent webViewMutationEvent, P p) {
        super(0);
        this.a = webViewMutationEvent;
        this.b = p;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws Throwable {
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Received web view mutation event " + this.a.getType() + '.');
        P.a(this.b, this.a);
        return tx8.a;
    }
}
