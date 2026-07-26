package com.microsoft.clarity.g;

import com.microsoft.clarity.i.C0089k;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.js3;
import defpackage.np2;
import defpackage.zp2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements com.microsoft.clarity.l.a, zp2 {
    public final /* synthetic */ C0089k a;

    public Q(C0089k c0089k) {
        js3.p(c0089k, "function");
        this.a = c0089k;
    }

    @Override // com.microsoft.clarity.l.a
    public final /* synthetic */ void a(Exception exc, ErrorType errorType) {
        this.a.invoke(exc, errorType);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.microsoft.clarity.l.a) && (obj instanceof zp2)) {
            return js3.i(this.a, ((zp2) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
