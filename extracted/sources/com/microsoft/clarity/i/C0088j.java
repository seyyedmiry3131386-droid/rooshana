package com.microsoft.clarity.i;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.microsoft.clarity.i.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0088j extends FunctionReferenceImpl implements qp2 {
    public C0088j(q qVar) {
        super(2, qVar, q.class, "processError", "processError(Ljava/lang/Exception;Lcom/microsoft/clarity/models/telemetry/ErrorType;)V", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        Exception exc = (Exception) obj;
        ErrorType errorType = (ErrorType) obj2;
        js3.p(exc, "p0");
        js3.p(errorType, "p1");
        q.a((q) this.receiver, exc, errorType);
        return tx8.a;
    }
}
