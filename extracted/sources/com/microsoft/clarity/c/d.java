package com.microsoft.clarity.c;

import defpackage.dw1;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Exception {
    public final String a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3) {
        super(str);
        js3.p(str2, "token");
        js3.p(str3, "module");
        this.a = str2;
        this.b = str3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("Unknown SkPicture token '");
        sb.append(this.a);
        sb.append("' in module '");
        return dw1.s(sb, this.b, "'.");
    }
}
