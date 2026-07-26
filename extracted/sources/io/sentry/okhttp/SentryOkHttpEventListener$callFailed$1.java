package io.sentry.okhttp;

import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import io.sentry.SpanStatus;
import io.sentry.k1;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
final class SentryOkHttpEventListener$callFailed$1 extends Lambda implements dp2 {
    public final /* synthetic */ IOException g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryOkHttpEventListener$callFailed$1(IOException iOException) {
        super(1);
        this.g = iOException;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        k1 k1Var = (k1) obj;
        js3.p(k1Var, "it");
        k1Var.a(SpanStatus.INTERNAL_ERROR);
        k1Var.i(this.g);
        return tx8.a;
    }
}
