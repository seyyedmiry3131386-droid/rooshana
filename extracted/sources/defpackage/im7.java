package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.b;

/* JADX INFO: loaded from: classes3.dex */
public final class im7 {
    public final Object a;
    public final rp2 b;
    public final rp2 c;
    public final Object d;
    public final SuspendLambda e;
    public final rp2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ b i;

    public im7(b bVar, Object obj, rp2 rp2Var, rp2 rp2Var2, mu3 mu3Var, SuspendLambda suspendLambda, rp2 rp2Var3) {
        this.i = bVar;
        this.a = obj;
        this.b = rp2Var;
        this.c = rp2Var2;
        this.d = mu3Var;
        this.e = suspendLambda;
        this.f = rp2Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof wl7) {
            ((wl7) obj).h(this.h, this.i.a);
            return;
        }
        bq1 bq1Var = obj instanceof bq1 ? (bq1) obj : null;
        if (bq1Var != null) {
            bq1Var.a();
        }
    }
}
