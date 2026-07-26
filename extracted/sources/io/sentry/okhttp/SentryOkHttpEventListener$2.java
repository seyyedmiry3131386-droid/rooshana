package io.sentry.okhttp;

import defpackage.dp2;
import defpackage.f09;
import defpackage.js3;
import defpackage.xv6;
import defpackage.z32;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
final class SentryOkHttpEventListener$2 extends Lambda implements dp2 {
    public final /* synthetic */ f09 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryOkHttpEventListener$2(f09 f09Var) {
        super(1);
        this.g = f09Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        js3.p((xv6) obj, "it");
        return (z32) this.g.b;
    }
}
