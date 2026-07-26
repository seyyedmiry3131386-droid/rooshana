package com.microsoft.clarity.g;

import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Long e;
    public final List f;

    public o0(String str, boolean z, String str2, String str3, String str4, Long l, List list) {
        js3.p(str, "path");
        js3.p(str2, "hash");
        js3.p(str3, "pathWithHash");
        js3.p(str4, "absolutePathWithHash");
        js3.p(list, "dependencies");
        this.a = str;
        this.b = z;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = list;
    }
}
