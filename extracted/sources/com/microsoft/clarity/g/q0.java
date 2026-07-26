package com.microsoft.clarity.g;

import com.microsoft.clarity.models.ingest.WebViewMutationEvent;
import defpackage.bp2;
import java.net.URL;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends Lambda implements bp2 {
    public final /* synthetic */ WebViewMutationEvent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(WebViewMutationEvent webViewMutationEvent) {
        super(0);
        this.a = webViewMutationEvent;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        return new URL(this.a.getPageUrl());
    }
}
