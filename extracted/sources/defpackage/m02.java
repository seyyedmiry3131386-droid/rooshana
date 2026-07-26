package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m02 {
    public int a = 1;
    public final qv4 b;
    public qv4 c;
    public qv4 d;
    public int e;
    public int f;

    public m02(qv4 qv4Var) {
        this.b = qv4Var;
        this.c = qv4Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        nv4 nv4VarB = this.c.b.b();
        int iA = nv4VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) nv4VarB.d).get(iA + nv4VarB.a) == 0) || this.e == 65039;
    }
}
