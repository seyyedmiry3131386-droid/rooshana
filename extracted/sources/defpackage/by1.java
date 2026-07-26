package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class by1 implements mz1 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public by1(List list) {
        this.a = 0;
        this.f = list;
        this.g = new cp8[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.mz1
    public final void a(h26 h26Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (h26Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (h26Var.x() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (h26Var.a() == 0) {
                            z = false;
                        } else {
                            if (h26Var.x() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = h26Var.b;
                    int iA = h26Var.a();
                    for (cp8 cp8Var : (cp8[]) this.g) {
                        h26Var.J(i);
                        cp8Var.d(iA, h26Var);
                    }
                    this.e += iA;
                }
                break;
            default:
                h26 h26Var2 = (h26) this.f;
                vy2.t((cp8) this.g);
                if (this.b) {
                    int iA2 = h26Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(h26Var.a, h26Var.b, h26Var2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            h26Var2.J(0);
                            if (73 == h26Var2.x() && 68 == h26Var2.x() && 51 == h26Var2.x()) {
                                h26Var2.K(3);
                                this.d = h26Var2.w() + 10;
                            } else {
                                wn5.k0("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((cp8) this.g).d(iMin2, h26Var);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz1
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    vy2.s(this.c != -9223372036854775807L);
                    for (cp8 cp8Var : (cp8[]) this.g) {
                        cp8Var.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                vy2.t((cp8) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    vy2.s(this.c != -9223372036854775807L);
                    ((cp8) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        switch (this.a) {
            case 0:
                cp8[] cp8VarArr = (cp8[]) this.g;
                for (int i = 0; i < cp8VarArr.length; i++) {
                    et8 et8Var = (et8) ((List) this.f).get(i);
                    ft8Var.a();
                    ft8Var.b();
                    cp8 cp8VarO = x72Var.o(ft8Var.d, 3);
                    rj2 rj2Var = new rj2();
                    ft8Var.b();
                    rj2Var.a = ft8Var.e;
                    rj2Var.l = tv4.m("video/mp2t");
                    rj2Var.m = tv4.m("application/dvbsubs");
                    rj2Var.p = Collections.singletonList(et8Var.b);
                    rj2Var.d = et8Var.a;
                    rm7.w(rj2Var, cp8VarO);
                    cp8VarArr[i] = cp8VarO;
                }
                break;
            default:
                ft8Var.a();
                ft8Var.b();
                cp8 cp8VarO2 = x72Var.o(ft8Var.d, 5);
                this.g = cp8VarO2;
                rj2 rj2Var2 = new rj2();
                ft8Var.b();
                rj2Var2.a = ft8Var.e;
                rj2Var2.l = tv4.m("video/mp2t");
                rj2Var2.m = tv4.m("application/id3");
                rm7.w(rj2Var2, cp8VarO2);
                break;
        }
    }

    public by1() {
        this.a = 1;
        this.f = new h26(10);
        this.c = -9223372036854775807L;
    }
}
