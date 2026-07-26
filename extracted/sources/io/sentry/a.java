package io.sentry;

import defpackage.za1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final byte[] a;
    public final io.sentry.protocol.h0 b;
    public final za1 c;
    public final String d;
    public final String e;
    public final String f;

    public a(byte[] bArr, String str, String str2) {
        this(str, bArr, str2, "event.attachment");
    }

    public a(String str, byte[] bArr, String str2, String str3) {
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public a(io.sentry.protocol.h0 h0Var) {
        this.a = null;
        this.b = h0Var;
        this.c = null;
        this.d = "view-hierarchy.json";
        this.e = "application/json";
        this.f = "event.view_hierarchy";
    }

    public a(za1 za1Var) {
        this.a = null;
        this.b = null;
        this.c = za1Var;
        this.d = "screenshot.png";
        this.e = "image/png";
        this.f = "event.attachment";
    }
}
