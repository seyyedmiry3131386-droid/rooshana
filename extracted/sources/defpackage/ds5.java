package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ds5 extends j77 {
    public final j77 b;
    public final tv6 c;
    public IOException d;

    public ds5(j77 j77Var) {
        this.b = j77Var;
        this.c = rf0.j(new gc0(this, j77Var.d1()));
    }

    @Override // defpackage.j77, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.j77
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.j77
    public final ph0 d1() {
        return this.c;
    }

    @Override // defpackage.j77
    public final dt4 g() {
        return this.b.g();
    }
}
