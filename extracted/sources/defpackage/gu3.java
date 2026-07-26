package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class gu3 extends eu3 {
    public final c e;
    public final hu3 f;
    public final mq0 g;
    public final Object h;

    public gu3(c cVar, hu3 hu3Var, mq0 mq0Var, Object obj) {
        this.e = cVar;
        this.f = hu3Var;
        this.g = mq0Var;
        this.h = obj;
    }

    @Override // defpackage.eu3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.eu3
    public final void l(Throwable th) {
        mq0 mq0Var = this.g;
        mq0 mq0VarY = c.Y(mq0Var);
        c cVar = this.e;
        hu3 hu3Var = this.f;
        Object obj = this.h;
        if (mq0VarY == null || !cVar.h0(hu3Var, mq0VarY, obj)) {
            hu3Var.a.e(new q84(2), 2);
            mq0 mq0VarY2 = c.Y(mq0Var);
            if (mq0VarY2 == null || !cVar.h0(hu3Var, mq0VarY2, obj)) {
                cVar.q(cVar.C(hu3Var, obj));
            }
        }
    }
}
