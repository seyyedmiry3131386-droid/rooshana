package defpackage;

import androidx.compose.material3.p;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.ui.client.ad.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ca implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ca(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        tx8 tx8Var = tx8.a;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                br9.c((p9) obj5, (dp2) obj4, (dp2) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b.d((ExoPlayer) obj5, (qz4) obj3, (dp2) obj4, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tt3.a((tr5) obj5, (qd) obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                c26.d((hx4) obj5, (i) obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zk8.m((p) obj5, (wb5) obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 5:
                dp2 dp2Var = (dp2) obj4;
                hx4 hx4Var = (hx4) obj5;
                cy6 cy6Var = (cy6) obj3;
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!qz0Var.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    qz0Var.U();
                } else {
                    j jVarA = xq2.a(ml9.q(hq6.radius_12, qz0Var), ml9.q(hq6.radius_12, qz0Var), 6);
                    wy5 wy5Var = ci0.a;
                    u58 u58Var = uj8.a;
                    Object objJ = qz0Var.j(u58Var);
                    js3.m(objJ);
                    long j = ((tj8) objJ).i;
                    Object objJ2 = qz0Var.j(u58Var);
                    js3.m(objJ2);
                    bi0 bi0VarA = ci0.a(j, ((tj8) objJ2).k, 0L, 0L, qz0Var, 12);
                    float fQ = ml9.q(hq6.space_8, qz0Var);
                    wy5 wy5Var2 = new wy5(fQ, fQ, fQ, fQ);
                    boolean zF = qz0Var.f(dp2Var);
                    Object objM = qz0Var.M();
                    if (zF || objM == jz0.a) {
                        objM = new ba(4, dp2Var);
                        qz0Var.l0(objM);
                    }
                    androidx.compose.material3.a.a((bp2) objM, hx4Var, false, jVarA, bi0VarA, null, null, wy5Var2, s7.X(1519179251, new ou0(i2, cy6Var), qz0Var), qz0Var, 805306368, 356);
                }
                break;
            case 6:
                ((Integer) obj2).intValue();
                ((a) obj5).f(obj4, obj3, (qz0) obj, hs9.W(i2) | 1);
                break;
            case 7:
                ((Integer) obj2).getClass();
                d51.b((hx4) obj5, (a51) obj3, (dp2) obj4, (qz0) obj, hs9.W(1), this.c);
                break;
            case 8:
                ((Integer) obj2).getClass();
                d51.a((a51) obj5, (hx4) obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                oh1.c((mg8) obj5, (ag8) obj4, (bp2) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ct2.c((hx4) obj5, (ih3) obj4, (bp2) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ml9.e((t34) obj5, this.b, this.c, this.e, (qz0) obj, hs9.W(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((c44) obj5).c(obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                at2.H((g64) obj5, (l64) obj3, (dp2) obj4, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                at2.K((g64) obj5, (p64) obj3, (dp2) obj4, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((cd7) obj5).c(obj4, (a) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                sb7.a((hx4) obj5, (nm7) obj4, (bp2) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ir.myket.player.ui.client.dialog.a.a((hx4) obj5, (cf6) obj4, (bp2) obj3, (qz0) obj, hs9.W(i2 | 1));
                break;
        }
        return tx8Var;
    }

    public /* synthetic */ ca(dp2 dp2Var, hx4 hx4Var, int i, cy6 cy6Var) {
        this.a = 5;
        this.b = dp2Var;
        this.d = hx4Var;
        this.c = i;
        this.e = cy6Var;
    }

    public /* synthetic */ ca(t34 t34Var, Object obj, int i, Object obj2, int i2) {
        this.a = 11;
        this.d = t34Var;
        this.b = obj;
        this.c = i;
        this.e = obj2;
    }

    public /* synthetic */ ca(hx4 hx4Var, a51 a51Var, dp2 dp2Var, int i, int i2) {
        this.a = 7;
        this.d = hx4Var;
        this.e = a51Var;
        this.b = dp2Var;
        this.c = i2;
    }

    public /* synthetic */ ca(Object obj, Object obj2, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = dp2Var;
        this.c = i;
    }
}
