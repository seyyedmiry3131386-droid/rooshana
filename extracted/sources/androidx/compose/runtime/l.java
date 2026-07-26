package androidx.compose.runtime;

import defpackage.dz0;
import defpackage.js3;
import defpackage.l37;
import defpackage.mb5;
import defpackage.ou;
import defpackage.qp2;
import defpackage.sk6;
import defpackage.sz0;
import defpackage.wu8;
import defpackage.xa5;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ou {
    public final xa5 a = new xa5();
    public final mb5 b = new mb5();
    public final Object c;

    public l(Object obj) {
        this.c = obj;
    }

    public final void a(sk6 sk6Var, l37 l37Var) {
        Exception exc;
        xa5 xa5Var = this.a;
        int i = xa5Var.b;
        mb5 mb5Var = new mb5();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            mb5 mb5Var2 = this.b;
            if (i2 >= i) {
                if (i3 != mb5Var2.b) {
                    sz0.a("Applier operation size mismatch");
                }
                mb5Var2.j();
                xa5Var.b = 0;
                sk6Var.n();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (xa5Var.c(i2)) {
                        case 0:
                            sk6Var.j();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            sk6Var.c(mb5Var2.b(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            sk6Var.g(xa5Var.c(i4), xa5Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    sk6Var.f(xa5Var.c(i4), xa5Var.c(i7), xa5Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            sk6Var.p();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            sk6Var.b(xa5Var.c(i4), mb5Var2.b(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                xa5Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objB = mb5Var2.b(i3);
                            js3.n(objB, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            wu8.i(2, objB);
                            i3 += 2;
                            ((qp2) objB).invoke(sk6Var.u(), mb5Var2.b(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = sk6Var.d;
                            if (obj instanceof dz0) {
                                dz0 dz0Var = (dz0) obj;
                                if (((zb5) l37Var.f).k(dz0Var)) {
                                    dz0Var.b();
                                }
                            }
                            mb5Var.g(obj);
                            sk6Var.d();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                sk6Var.n();
                throw th;
            }
            exc = e3;
            throw new ComposePausableCompositionException(mb5Var2, mb5Var, xa5Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.ou
    public final void b(int i, Object obj) {
        xa5 xa5Var = this.a;
        xa5Var.a(5);
        xa5Var.a(i);
        this.b.g(obj);
    }

    @Override // defpackage.ou
    public final void c(Object obj) {
        this.a.a(1);
        this.b.g(obj);
    }

    @Override // defpackage.ou
    public final void d() {
        this.a.a(8);
    }

    @Override // defpackage.ou
    public final void f(int i, int i2, int i3) {
        xa5 xa5Var = this.a;
        xa5Var.a(3);
        xa5Var.a(i);
        xa5Var.a(i2);
        xa5Var.a(i3);
    }

    @Override // defpackage.ou
    public final void g(int i, int i2) {
        xa5 xa5Var = this.a;
        xa5Var.a(2);
        xa5Var.a(i);
        xa5Var.a(i2);
    }

    @Override // defpackage.ou
    public final void j() {
        this.a.a(0);
    }

    @Override // defpackage.ou
    public final void m(int i, Object obj) {
        xa5 xa5Var = this.a;
        xa5Var.a(6);
        xa5Var.a(i);
        this.b.g(obj);
    }

    @Override // defpackage.ou
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.ou
    public final void o(qp2 qp2Var, Object obj) {
        this.a.a(7);
        mb5 mb5Var = this.b;
        mb5Var.g(qp2Var);
        mb5Var.g(obj);
    }
}
