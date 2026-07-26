package com.microsoft.clarity.o;

import android.net.Uri;
import com.microsoft.clarity.models.ingest.IngestConfigs;
import com.microsoft.clarity.q.k;
import com.microsoft.clarity.q.r;
import com.microsoft.clarity.q.t;
import defpackage.bp2;
import defpackage.js3;
import java.io.IOException;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements bp2 {
    public final /* synthetic */ f a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, String str) {
        super(0);
        this.a = fVar;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws IOException {
        Object tVar;
        String string = Uri.parse("https://www.clarity.ms/").buildUpon().appendPath("tag").appendPath("mobile").appendPath(this.b).build().toString();
        js3.o(string, "parse(BuildConfig.API_BA…)\n            .toString()");
        HttpURLConnection httpURLConnectionA = k.a(string, "GET", kotlin.collections.b.I());
        try {
            httpURLConnectionA.connect();
            String strA = k.a(httpURLConnectionA);
            if (httpURLConnectionA.getResponseCode() != 200) {
                tVar = new r();
            } else {
                this.a.a("Clarity_TagBytes", strA.length());
                tVar = new t(IngestConfigs.Companion.fromJson(strA));
            }
            httpURLConnectionA.disconnect();
            return tVar;
        } catch (Throwable th) {
            httpURLConnectionA.disconnect();
            throw th;
        }
    }
}
