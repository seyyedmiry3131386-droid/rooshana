package com.microsoft.clarity.h;

import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Lambda implements dp2 {
    public final /* synthetic */ Ref$ObjectRef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref$ObjectRef ref$ObjectRef) {
        super(1);
        this.a = ref$ObjectRef;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        h0 h0Var = (h0) this.a.a;
        if (h0Var != null) {
            h0Var.a(exc, ErrorType.UploadSession, null);
        }
        return tx8.a;
    }
}
