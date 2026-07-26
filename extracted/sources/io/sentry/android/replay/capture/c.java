package io.sentry.android.replay.capture;

import defpackage.dp2;
import io.sentry.android.replay.r;
import io.sentry.protocol.v;
import java.util.Date;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Date c;
    public final /* synthetic */ v d;
    public final /* synthetic */ r e;
    public final /* synthetic */ Lambda f;
    public final /* synthetic */ b g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(e eVar, long j, Date date, v vVar, r rVar, dp2 dp2Var) {
        this.g = eVar;
        this.b = j;
        this.c = date;
        this.d = vVar;
        this.e = rVar;
        this.f = (Lambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dp2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [dp2, kotlin.jvm.internal.Lambda] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.g;
                int iJ = eVar.j();
                r rVar = this.e;
                this.f.invoke(b.h(eVar, this.b, this.c, this.d, iJ, rVar.b, rVar.a, rVar.e, rVar.f));
                break;
            default:
                m mVar = (m) this.g;
                int iJ2 = mVar.j();
                r rVar2 = this.e;
                this.f.invoke(b.h(mVar, this.b, this.c, this.d, iJ2, rVar2.b, rVar2.a, rVar2.e, rVar2.f));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(m mVar, long j, Date date, v vVar, r rVar, dp2 dp2Var) {
        this.g = mVar;
        this.b = j;
        this.c = date;
        this.d = vVar;
        this.e = rVar;
        this.f = (Lambda) dp2Var;
    }
}
