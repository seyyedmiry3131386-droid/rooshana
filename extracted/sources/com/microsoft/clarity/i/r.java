package com.microsoft.clarity.i;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements com.microsoft.clarity.l.a {
    public final /* synthetic */ t a;

    public r(t tVar) {
        this.a = tVar;
    }

    @Override // com.microsoft.clarity.l.a
    public final void a(Exception exc, ErrorType errorType) {
        js3.p(exc, "exception");
        js3.p(errorType, "errorType");
        t tVar = this.a;
        tVar.getClass();
        tVar.c.a(exc, errorType, tVar.b.a());
    }
}
