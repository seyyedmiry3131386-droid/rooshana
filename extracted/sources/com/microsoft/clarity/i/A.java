package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import defpackage.bp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends Lambda implements bp2 {
    public final /* synthetic */ AnalyticsEvent a;
    public final /* synthetic */ P b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AnalyticsEvent analyticsEvent, P p) {
        super(0);
        this.a = analyticsEvent;
        this.b = p;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    @Override // defpackage.bp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            com.microsoft.clarity.models.LogLevel r0 = com.microsoft.clarity.q.l.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "New analytics event "
            r0.<init>(r1)
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r1 = r5.a
            com.microsoft.clarity.models.ingest.EventType r1 = r1.getType()
            r0.append(r1)
            java.lang.String r1 = " received for screen "
            r0.append(r1)
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r1 = r5.a
            com.microsoft.clarity.models.observers.ScreenMetadata r1 = r1.getScreenMetadata()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r1 = r5.a
            com.microsoft.clarity.models.observers.ScreenMetadata r1 = r1.getScreenMetadata()
            int r1 = r1.getActivityHashCode()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.microsoft.clarity.q.l.b(r0)
            com.microsoft.clarity.i.P r0 = r5.b
            com.microsoft.clarity.models.SessionMetadata r0 = r0.p
            if (r0 == 0) goto L7b
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r0 = r5.a
            long r0 = r0.getTimestamp()
            com.microsoft.clarity.i.P r2 = r5.b
            long r3 = r2.r
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7b
            com.microsoft.clarity.models.observers.ScreenMetadata r0 = r2.v
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r1 = r5.a
            com.microsoft.clarity.models.observers.ScreenMetadata r1 = r1.getScreenMetadata()
            boolean r0 = defpackage.js3.i(r0, r1)
            if (r0 != 0) goto L65
            goto L7b
        L65:
            com.microsoft.clarity.i.P r0 = r5.b
            boolean r0 = r0.e()
            if (r0 == 0) goto L73
            java.lang.String r0 = "Dropping Analytics Event because current page payload count limit has been exceeded"
            com.microsoft.clarity.q.l.b(r0)
            goto L80
        L73:
            com.microsoft.clarity.i.P r0 = r5.b
            com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent r1 = r5.a
            r0.b(r1)
            goto L80
        L7b:
            java.lang.String r0 = "Skipping residual analytics event from another page."
            com.microsoft.clarity.q.l.b(r0)
        L80:
            tx8 r0 = defpackage.tx8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.i.A.invoke():java.lang.Object");
    }
}
