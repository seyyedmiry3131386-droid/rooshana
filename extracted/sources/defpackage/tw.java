package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tw implements nj1 {
    public final char a;

    public tw(char c) {
        this.a = c;
    }

    @Override // defpackage.nj1
    public final void a(nf8 nf8Var, nf8 nf8Var2, int i) {
        String.valueOf(this.a);
        co5 t02Var = i == 1 ? new t02() : new t88();
        co5 co5Var = nf8Var.e;
        while (co5Var != null && co5Var != nf8Var2) {
            co5 co5Var2 = co5Var.e;
            t02Var.b(co5Var);
            co5Var = co5Var2;
        }
        t02Var.f();
        co5 co5Var3 = nf8Var.e;
        t02Var.e = co5Var3;
        if (co5Var3 != null) {
            co5Var3.d = t02Var;
        }
        t02Var.d = nf8Var;
        nf8Var.e = t02Var;
        co5 co5Var4 = nf8Var.a;
        t02Var.a = co5Var4;
        if (t02Var.e == null) {
            co5Var4.c = t02Var;
        }
    }

    @Override // defpackage.nj1
    public final char b() {
        return this.a;
    }

    @Override // defpackage.nj1
    public final int c() {
        return 1;
    }

    @Override // defpackage.nj1
    public final int d(mj1 mj1Var, mj1 mj1Var2) {
        if (mj1Var.d || mj1Var2.c) {
            int i = mj1Var2.h;
            if (i % 3 != 0 && (mj1Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (mj1Var.g < 2 || mj1Var2.g < 2) ? 1 : 2;
    }

    @Override // defpackage.nj1
    public final char e() {
        return this.a;
    }
}
