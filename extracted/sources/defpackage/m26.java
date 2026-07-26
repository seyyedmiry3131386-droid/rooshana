package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class m26 implements ra4 {
    public final db1 b;
    public final w58 d;
    public final l26 e;
    public volatile Object f;
    public final int c = 4;
    public final long a = da4.d.getAndIncrement();

    public m26(xa1 xa1Var, db1 db1Var, l26 l26Var) {
        this.d = new w58(xa1Var);
        this.b = db1Var;
        this.e = l26Var;
    }

    @Override // defpackage.ra4
    public final void a() {
        this.d.b = 0L;
        bb1 bb1Var = new bb1(this.d, this.b);
        try {
            bb1Var.b();
            Uri uriP = this.d.a.p();
            uriP.getClass();
            this.f = this.e.g(uriP, bb1Var);
        } finally {
            j29.g(bb1Var);
        }
    }

    @Override // defpackage.ra4
    public final void b() {
    }
}
