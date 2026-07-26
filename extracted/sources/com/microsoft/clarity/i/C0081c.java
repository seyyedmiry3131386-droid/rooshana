package com.microsoft.clarity.i;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.js3;

/* JADX INFO: renamed from: com.microsoft.clarity.i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0081c implements com.microsoft.clarity.l.a {
    public final /* synthetic */ q a;

    public C0081c(q qVar) {
        this.a = qVar;
    }

    @Override // com.microsoft.clarity.l.a
    public final void a(Exception exc, ErrorType errorType) {
        js3.p(exc, "exception");
        js3.p(errorType, "errorType");
        q.a(this.a, exc, errorType);
    }
}
