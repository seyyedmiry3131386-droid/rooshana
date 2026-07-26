package com.microsoft.clarity.o;

import com.microsoft.clarity.models.telemetry.ErrorReport;
import com.microsoft.clarity.q.j;
import com.microsoft.clarity.q.k;
import com.microsoft.clarity.q.r;
import com.microsoft.clarity.q.s;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import java.io.IOException;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Lambda implements bp2 {
    public final /* synthetic */ i a;
    public final /* synthetic */ ErrorReport b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ErrorReport errorReport) {
        super(0);
        this.a = iVar;
        this.b = errorReport;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws IOException {
        HttpURLConnection httpURLConnectionA = k.a(this.a.a, "POST", kotlin.collections.b.I());
        try {
            String json = this.b.toJson();
            js3.p(httpURLConnectionA, "urlConnection");
            js3.p(json, "serializedRequestData");
            k.a(httpURLConnectionA, false, (dp2) new j(json));
            Object sVar = k.b(httpURLConnectionA) ? new s() : new r();
            httpURLConnectionA.disconnect();
            return sVar;
        } catch (Throwable th) {
            httpURLConnectionA.disconnect();
            throw th;
        }
    }
}
