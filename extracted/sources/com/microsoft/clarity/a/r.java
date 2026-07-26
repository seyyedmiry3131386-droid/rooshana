package com.microsoft.clarity.a;

import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Lambda implements dp2 {
    public static final r a = new r();

    public r() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        com.microsoft.clarity.i.t tVar = I.a;
        I.a(exc, ErrorType.ResumingClarity);
        return tx8.a;
    }
}
