package com.microsoft.clarity.i;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends Lambda implements dp2 {
    public final /* synthetic */ P a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(P p) {
        super(1);
        this.a = p;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        P p = this.a;
        ErrorType errorType = ErrorType.EventProcessingTaskExecution;
        p.getClass();
        js3.p(errorType, "errorType");
        p.i.a(exc, errorType, p.a());
        return tx8.a;
    }
}
