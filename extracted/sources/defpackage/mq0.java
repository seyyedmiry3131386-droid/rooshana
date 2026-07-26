package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class mq0 extends eu3 implements lq0 {
    public final c e;

    public mq0(c cVar) {
        this.e = cVar;
    }

    @Override // defpackage.lq0
    public final boolean c(Throwable th) {
        return j().z(th);
    }

    @Override // defpackage.eu3
    public final boolean k() {
        return true;
    }

    @Override // defpackage.eu3
    public final void l(Throwable th) {
        this.e.t(j());
    }
}
