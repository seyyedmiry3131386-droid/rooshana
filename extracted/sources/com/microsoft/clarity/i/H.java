package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import com.microsoft.clarity.models.ingest.analytics.CustomEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P p, String str) {
        super(0);
        this.a = p;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        P p = this.a;
        if (p.v == null) {
            p.E.add(this.b);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ScreenMetadata screenMetadata = this.a.v;
            js3.m(screenMetadata);
            p.a((AnalyticsEvent) new CustomEvent(jCurrentTimeMillis, screenMetadata, this.b));
        }
        return tx8.a;
    }
}
