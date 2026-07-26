package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j05 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qx6 b;

    public /* synthetic */ j05(qx6 qx6Var, int i) {
        this.a = i;
        this.b = qx6Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        ex4 ex4Var = ex4.b;
        qx6 qx6Var = this.b;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$Card");
                if (!qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qz0Var.U();
                } else {
                    String str = qx6Var.e;
                    hx4 hx4VarS = zk8.s(b.d(b.c(ex4Var, 1.0f), ml9.q(hq6.movie_card_image_height, qz0Var)), la7.a(ml9.q(hq6.radius_8, qz0Var)));
                    float fQ = ml9.q(hq6.size_4, qz0Var);
                    u58 u58Var = uj8.a;
                    Object objJ = qz0Var.j(u58Var);
                    js3.m(objJ);
                    long j = ((tj8) objJ).J.d;
                    Object objJ2 = qz0Var.j(u58Var);
                    js3.m(objJ2);
                    cc7.a(str, j97.e(hx4VarS, fQ, null, ((tj8) objJ2).J.d, j, 6), p41.a, null, qz0Var, 1572912, 1976);
                    z27.a(qz0Var, b.d(ex4Var, ml9.q(hq6.size_8, qz0Var)));
                    mi8.b(qx6Var.b, null, 0L, 0L, 0L, null, 0L, 2, false, 2, 0, ((wf5) qz0Var.j(aw8.a)).i, qz0Var, 0, 24960, 110590);
                }
                break;
            default:
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$Card");
                if (!qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qz0Var2.U();
                } else {
                    hx4 hx4VarZ = yh0.z(b.c(ex4Var, 1.0f), ml9.q(hq6.space_4, qz0Var2));
                    fv fvVar = jv.a;
                    cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), eq.l, qz0Var2, 0);
                    long j2 = qz0Var2.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    j56 j56VarL = qz0Var2.l();
                    hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
                    hz0.d0.getClass();
                    bp2 bp2Var = d.b;
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var);
                    } else {
                        qz0Var2.o0();
                    }
                    qp2 qp2Var = d.f;
                    ia7.o(qz0Var2, qp2Var, cb7VarA);
                    qp2 qp2Var2 = d.e;
                    ia7.o(qz0Var2, qp2Var2, j56VarL);
                    Integer numValueOf = Integer.valueOf(i2);
                    qp2 qp2Var3 = d.g;
                    ia7.g(qz0Var2, numValueOf, qp2Var3);
                    dp2 dp2Var = d.h;
                    ia7.n(qz0Var2, dp2Var);
                    qp2 qp2Var4 = d.d;
                    ia7.o(qz0Var2, qp2Var4, hx4VarC);
                    cc7.a(qx6Var.e, zk8.s(b.j(ex4Var, ml9.q(hq6.recommendation_card_image_width, qz0Var2), ml9.q(hq6.recommendation_card_image_height, qz0Var2)), la7.a(ml9.q(hq6.radius_4, qz0Var2))), p41.a, null, qz0Var2, 1572912, 1976);
                    hx4 hx4VarD = b.d(ex4Var, ml9.q(hq6.recommendation_card_image_height, qz0Var2));
                    vv0 vv0VarA = tv0.a(new ev(ml9.q(hq6.space_8, qz0Var2), false, new ae(5)), eq.o, qz0Var2, 0);
                    long j3 = qz0Var2.T;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    j56 j56VarL2 = qz0Var2.l();
                    hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarD);
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var);
                    } else {
                        qz0Var2.o0();
                    }
                    ia7.o(qz0Var2, qp2Var, vv0VarA);
                    ia7.o(qz0Var2, qp2Var2, j56VarL2);
                    ia7.g(qz0Var2, Integer.valueOf(i3), qp2Var3);
                    ia7.n(qz0Var2, dp2Var);
                    ia7.o(qz0Var2, qp2Var4, hx4VarC2);
                    String str2 = qx6Var.b;
                    u58 u58Var2 = aw8.a;
                    gj8 gj8Var = ((wf5) qz0Var2.j(u58Var2)).h;
                    u58 u58Var3 = uj8.a;
                    Object objJ3 = qz0Var2.j(u58Var3);
                    js3.m(objJ3);
                    mi8.b(str2, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 2, false, 2, 0, gj8Var, qz0Var2, 0, 24960, 110586);
                    String str3 = qx6Var.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    gj8 gj8Var2 = ((wf5) qz0Var2.j(u58Var2)).i;
                    Object objJ4 = qz0Var2.j(u58Var3);
                    js3.m(objJ4);
                    mi8.b(str4, null, ((tj8) objJ4).k, 0L, 0L, null, 0L, 2, false, 1, 0, gj8Var2, qz0Var2, 0, 24960, 110586);
                    qz0Var2.q(true);
                    qz0Var2.q(true);
                }
                break;
        }
        return tx8Var;
    }
}
