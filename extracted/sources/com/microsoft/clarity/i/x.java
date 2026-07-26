package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import com.microsoft.clarity.models.ingest.analytics.ConsentEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends Lambda implements bp2 {
    public final /* synthetic */ P a;
    public final /* synthetic */ ConsentStatus b;
    public final /* synthetic */ s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(P p, ConsentStatus consentStatus, s sVar) {
        super(0);
        this.a = p;
        this.b = consentStatus;
        this.c = sVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        ConsentStatus consentStatusC = this.a.c();
        this.a.B.a(this.b);
        if (consentStatusC.getAnalyticsStorage() && !this.b.getAnalyticsStorage()) {
            this.c.invoke();
        }
        if (this.a.v != null) {
            if (!js3.i(this.b, consentStatusC)) {
                P p = this.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ScreenMetadata screenMetadata = this.a.v;
                js3.m(screenMetadata);
                p.a((AnalyticsEvent) new ConsentEvent(jCurrentTimeMillis, screenMetadata, this.b));
            }
            if (consentStatusC.getAdsStorage() != this.b.getAdsStorage()) {
                P p2 = this.a;
                ScreenMetadata screenMetadata2 = p2.v;
                js3.m(screenMetadata2);
                p2.a(screenMetadata2);
            }
        }
        return tx8.a;
    }
}
