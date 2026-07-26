package defpackage;

import androidx.media3.common.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cm7 {
    public final /* synthetic */ int a;
    public final List b;
    public final cp8[] c;
    public final yb d;

    public cm7(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new cp8[list.size()];
                yb ybVar = new yb(new f09(2, this));
                this.d = ybVar;
                ybVar.w(3);
                break;
            default:
                this.b = list;
                this.c = new cp8[list.size()];
                this.d = new yb(new ts5(15, this));
                break;
        }
    }

    public void a(long j, h26 h26Var) {
        if (h26Var.a() < 9) {
            return;
        }
        int iJ = h26Var.j();
        int iJ2 = h26Var.j();
        int iX = h26Var.x();
        if (iJ == 434 && iJ2 == 1195456820 && iX == 3) {
            this.d.a(j, h26Var);
        }
    }

    public final void b(x72 x72Var, ft8 ft8Var) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    cp8[] cp8VarArr = this.c;
                    if (i < cp8VarArr.length) {
                        ft8Var.a();
                        ft8Var.b();
                        cp8 cp8VarO = x72Var.o(ft8Var.d, 3);
                        b bVar = (b) this.b.get(i);
                        String str = bVar.n;
                        vy2.i("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = bVar.a;
                        if (str2 == null) {
                            ft8Var.b();
                            str2 = ft8Var.e;
                        }
                        rj2 rj2Var = new rj2();
                        rj2Var.a = str2;
                        rj2Var.l = tv4.m("video/mp2t");
                        rj2Var.m = tv4.m(str);
                        rj2Var.e = bVar.e;
                        rj2Var.d = bVar.d;
                        rj2Var.J = bVar.K;
                        rj2Var.p = bVar.q;
                        rm7.w(rj2Var, cp8VarO);
                        cp8VarArr[i] = cp8VarO;
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i2 = 0;
                while (true) {
                    cp8[] cp8VarArr2 = this.c;
                    if (i2 < cp8VarArr2.length) {
                        ft8Var.a();
                        ft8Var.b();
                        cp8 cp8VarO2 = x72Var.o(ft8Var.d, 3);
                        b bVar2 = (b) this.b.get(i2);
                        String str3 = bVar2.n;
                        vy2.i("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        rj2 rj2Var2 = new rj2();
                        ft8Var.b();
                        rj2Var2.a = ft8Var.e;
                        rj2Var2.l = tv4.m("video/mp2t");
                        rj2Var2.m = tv4.m(str3);
                        rj2Var2.e = bVar2.e;
                        rj2Var2.d = bVar2.d;
                        rj2Var2.J = bVar2.K;
                        rj2Var2.p = bVar2.q;
                        rm7.w(rj2Var2, cp8VarO2);
                        cp8VarArr2[i2] = cp8VarO2;
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
