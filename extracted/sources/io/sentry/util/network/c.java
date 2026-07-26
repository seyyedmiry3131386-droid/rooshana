package io.sentry.util.network;

import io.sentry.k;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final String a;
    public Integer b;
    public Long c;
    public Long d;
    public k e;
    public k f;

    public c(String str) {
        this.a = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.a + "', statusCode=" + this.b + ", requestBodySize=" + this.c + ", responseBodySize=" + this.d + ", request=" + this.e + ", response=" + this.f + '}';
    }
}
