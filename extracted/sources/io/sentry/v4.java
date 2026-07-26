package io.sentry;

import defpackage.rm7;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 implements g2 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final SentryItemType e;
    public final int f;
    public final Callable g;
    public final String h;
    public HashMap i;

    public v4(SentryItemType sentryItemType, int i, String str, String str2, String str3, String str4, Integer num) {
        this.e = sentryItemType;
        this.a = str;
        this.f = i;
        this.c = str2;
        this.g = null;
        this.h = str3;
        this.d = str4;
        this.b = num;
    }

    public final int a() {
        Callable callable = this.g;
        if (callable == null) {
            return this.f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        String str = this.a;
        if (str != null) {
            cVar.q("content_type");
            cVar.z(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            cVar.q("filename");
            cVar.z(str2);
        }
        cVar.q("type");
        cVar.w(u0Var, this.e);
        String str3 = this.h;
        if (str3 != null) {
            cVar.q("attachment_type");
            cVar.z(str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            cVar.q("platform");
            cVar.z(str4);
        }
        Integer num = this.b;
        if (num != null) {
            cVar.q("item_count");
            cVar.y(num);
        }
        cVar.q("length");
        cVar.v(a());
        HashMap map = this.i;
        if (map != null) {
            for (String str5 : map.keySet()) {
                rm7.y(this.i, str5, cVar, str5, u0Var);
            }
        }
        cVar.n();
    }

    public v4(SentryItemType sentryItemType, Callable callable, String str, String str2, String str3) {
        this(sentryItemType, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public v4(SentryItemType sentryItemType, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        io.sentry.config.a.W(sentryItemType, "type is required");
        this.e = sentryItemType;
        this.a = str;
        this.f = -1;
        this.c = str2;
        this.g = callable;
        this.h = str3;
        this.d = str4;
        this.b = num;
    }
}
