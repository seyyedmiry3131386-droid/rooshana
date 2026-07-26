package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.material3.a;
import androidx.compose.runtime.g;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x5 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.a;
        int i2 = 6;
        int i3 = 2;
        ex4 ex4Var = ex4.b;
        av avVar = jz0.a;
        int i4 = 1;
        tx8 tx8Var = tx8.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                Integer num = (Integer) obj4;
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    cb7 cb7VarA = bb7.a(new ev(ml9.q(hq6.space_8, qz0Var), false, new ae(i2)), eq.m, qz0Var, 48);
                    long j = qz0Var.T;
                    int i5 = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = b.c(qz0Var, ex4Var);
                    hz0.d0.getClass();
                    bp2 bp2Var = d.b;
                    qz0Var.e0();
                    if (qz0Var.S) {
                        qz0Var.k(bp2Var);
                    } else {
                        qz0Var.o0();
                    }
                    ia7.o(qz0Var, d.f, cb7VarA);
                    ia7.o(qz0Var, d.e, j56VarL);
                    ia7.g(qz0Var, Integer.valueOf(i5), d.g);
                    ia7.n(qz0Var, d.h);
                    ia7.o(qz0Var, d.d, hx4VarC);
                    mi8.b(str, null, 0L, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, ((wf5) qz0Var.j(aw8.a)).k, qz0Var, 0, 0, 130046);
                    if (num == null) {
                        qz0Var.a0(-1110692722);
                    } else {
                        qz0Var.a0(-1110692721);
                        kh3.a(rf0.G(num.intValue(), qz0Var), androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.icon_size_medium, qz0Var)), 0L, qz0Var, 56, 8);
                    }
                    qz0Var.q(false);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                return tx8Var;
            case 1:
                Context context = (Context) obj5;
                m8 m8Var = (m8) obj4;
                qz0 qz0Var2 = (qz0) obj2;
                ((Integer) obj3).getClass();
                js3.p((ik) obj, "$this$AnimatedVisibility");
                cb7 cb7VarA2 = bb7.a(jv.a, eq.m, qz0Var2, 48);
                long j2 = qz0Var2.T;
                int i6 = (int) (j2 ^ (j2 >>> 32));
                j56 j56VarL2 = qz0Var2.l();
                hx4 hx4VarC2 = b.c(qz0Var2, ex4Var);
                hz0.d0.getClass();
                bp2 bp2Var2 = d.b;
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var2);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, d.f, cb7VarA2);
                ia7.o(qz0Var2, d.e, j56VarL2);
                ia7.g(qz0Var2, Integer.valueOf(i6), d.g);
                ia7.n(qz0Var2, d.h);
                ia7.o(qz0Var2, d.d, hx4VarC2);
                z27.a(qz0Var2, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_4, qz0Var2)));
                hx4 hx4VarF = androidx.compose.foundation.layout.b.f(ml9.q(hq6.size_32, qz0Var2));
                ka7 ka7Var = la7.a;
                wy5 wy5Var = ci0.a;
                u58 u58Var = uj8.a;
                Object objJ = qz0Var2.j(u58Var);
                js3.m(objJ);
                long j3 = ((tj8) objJ).a;
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                bi0 bi0VarA = ci0.a(j3, ((tj8) objJ2).b, 0L, 0L, qz0Var2, 12);
                wy5 wy5VarD = yh0.d(ml9.q(hq6.space_16, qz0Var2), 0.0f, 2);
                boolean zH = qz0Var2.h(context) | qz0Var2.h(m8Var);
                Object objM = qz0Var2.M();
                if (zH || objM == avVar) {
                    objM = new d(context, m8Var, 2);
                    qz0Var2.l0(objM);
                }
                a.a((bp2) objM, hx4VarF, false, ka7Var, bi0VarA, null, null, wy5VarD, vy2.c, qz0Var2, 805306368, 356);
                z27.a(qz0Var2, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_20, qz0Var2)));
                String str2 = m8Var.b;
                gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).k;
                Object objJ3 = qz0Var2.j(u58Var);
                js3.m(objJ3);
                mi8.b(str2, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 2, false, 2, 0, gj8Var, qz0Var2, 0, 24960, 110586);
                z27.a(qz0Var2, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_8, qz0Var2)));
                qz0Var2.q(true);
                return tx8Var;
            case 2:
                String str3 = (String) obj5;
                x9 x9Var = (x9) obj4;
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mi8.b(str3, null, 0L, 0L, 0L, null, 0L, 0, false, 1, 0, ((wf5) qz0Var3.j(aw8.a)).c, qz0Var3, 0, 24576, 114686);
                    if (x9Var.a() instanceof v9) {
                        qz0Var3.a0(1914670084);
                        z27.a(qz0Var3, androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.size_4, qz0Var3)));
                        kh3.a(rf0.G(br6.player_ic_external_link, qz0Var3), androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.size_20, qz0Var3)), 0L, qz0Var3, 56, 8);
                    } else {
                        qz0Var3.a0(1907602673);
                    }
                    qz0Var3.q(false);
                } else {
                    qz0Var3.U();
                }
                return tx8Var;
            case 3:
                dp2 dp2Var = (dp2) obj5;
                a51 a51Var = (a51) obj4;
                qz0 qz0Var4 = (qz0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (qz0Var4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objM2 = qz0Var4.M();
                    if (objM2 == avVar) {
                        objM2 = new b51();
                        qz0Var4.l0(objM2);
                    }
                    b51 b51Var = (b51) objM2;
                    b51Var.a.clear();
                    dp2Var.invoke(b51Var);
                    b51Var.a(a51Var, qz0Var4, 0);
                } else {
                    qz0Var4.U();
                }
                return tx8Var;
            case 4:
                ah4 ah4Var = (ah4) obj5;
                androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) obj4;
                qz0 qz0Var5 = (qz0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var5.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    g16 g16VarG = rf0.G(ah4Var.a, qz0Var5);
                    hx4 hx4VarI = androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.icon_size_large, qz0Var5));
                    boolean zH2 = qz0Var5.h(aVar);
                    Object objM3 = qz0Var5.M();
                    if (zH2 || objM3 == avVar) {
                        objM3 = new j51(aVar, i4);
                        qz0Var5.l0(objM3);
                    }
                    kh3.a(g16VarG, androidx.compose.ui.graphics.d.a(hx4VarI, (dp2) objM3), 0L, qz0Var5, 56, 8);
                } else {
                    qz0Var5.U();
                }
                return tx8Var;
            case 5:
                ej5 ej5Var = (ej5) obj5;
                dj5 dj5Var = (dj5) obj4;
                qz0 qz0Var6 = (qz0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (qz0Var6.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ej5Var.b.a(dj5Var, qz0Var6, 0);
                } else {
                    qz0Var6.U();
                }
                return tx8Var;
            case 6:
                pj3 pj3Var = (pj3) obj5;
                androidx.compose.runtime.internal.a aVar2 = (androidx.compose.runtime.internal.a) obj4;
                qz0 qz0Var7 = (qz0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$BottomSheetScaffold");
                if (qz0Var7.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    wy5 wy5VarD2 = yh0.d(0.0f, ml9.q(hq6.space_8, qz0Var7), 1);
                    boolean zH3 = qz0Var7.h(pj3Var) | qz0Var7.f(aVar2);
                    Object objM4 = qz0Var7.M();
                    if (zH3 || objM4 == avVar) {
                        objM4 = new m(pj3Var, aVar2, 25);
                        qz0Var7.l0(objM4);
                    }
                    vy2.b(0, 507, null, null, qz0Var7, null, (dp2) objM4, null, wy5VarD2, null, null, false);
                } else {
                    qz0Var7.U();
                }
                return tx8Var;
            case 7:
                qz0 qz0Var8 = (qz0) obj2;
                ((Integer) obj3).getClass();
                js3.p((ik) obj, "$this$AnimatedVisibility");
                wy5 wy5Var2 = ci0.a;
                u58 u58Var2 = uj8.a;
                Object objJ4 = qz0Var8.j(u58Var2);
                js3.m(objJ4);
                long j4 = ((tj8) objJ4).J.a;
                Object objJ5 = qz0Var8.j(u58Var2);
                js3.m(objJ5);
                wu8.a(null, (String) obj5, ci0.a(((tj8) objJ5).I.a, j4, 0L, 0L, qz0Var8, 12), null, (bp2) obj4, qz0Var8, 0, 9);
                return tx8Var;
            case 8:
                Spannable spannable = (Spannable) obj5;
                bh bhVar = (bh) obj4;
                c28 c28Var = (c28) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int iIntValue8 = ((Integer) obj3).intValue();
                ph2 ph2Var = c28Var.f;
                fj2 fj2Var = c28Var.c;
                if (fj2Var == null) {
                    fj2Var = fj2.e;
                }
                si2 si2Var = c28Var.d;
                int i7 = si2Var != null ? si2Var.a : 0;
                cj2 cj2Var = c28Var.e;
                int i8 = cj2Var != null ? cj2Var.a : 65535;
                ch chVar = (ch) bhVar.b;
                qv8 qv8VarB = ((qh2) chVar.e).b(ph2Var, fj2Var, i7, i8);
                if (qv8VarB instanceof pv8) {
                    Object obj6 = ((pv8) qv8VarB).a;
                    js3.n(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    sk6 sk6Var = new sk6(qv8VarB, chVar.j);
                    chVar.j = sk6Var;
                    Object obj7 = sk6Var.d;
                    js3.n(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new ju0(i3, typeface), iIntValue7, iIntValue8, 33);
                return tx8Var;
            default:
                dp2 dp2Var2 = (dp2) obj5;
                ab5 ab5Var = (ab5) obj4;
                qz0 qz0Var9 = (qz0) obj2;
                ((Integer) obj3).getClass();
                qz0Var9.a0(-102778667);
                Object objM5 = qz0Var9.M();
                Object obj8 = objM5;
                if (objM5 == avVar) {
                    e71 e71VarX = zk8.x(EmptyCoroutineContext.a, qz0Var9);
                    qz0Var9.l0(e71VarX);
                    obj8 = e71VarX;
                }
                e71 e71Var = (e71) obj8;
                Object objM6 = qz0Var9.M();
                Object obj9 = objM6;
                if (objM6 == avVar) {
                    wb5 wb5VarH = g.h(null);
                    qz0Var9.l0(wb5VarH);
                    obj9 = wb5VarH;
                }
                wb5 wb5Var = (wb5) obj9;
                wb5 wb5VarK = g.k(dp2Var2, qz0Var9);
                boolean zF = qz0Var9.f(ab5Var);
                Object objM7 = qz0Var9.M();
                Object obj10 = objM7;
                if (zF || objM7 == avVar) {
                    v25 v25Var = new v25(wb5Var, ab5Var, 27);
                    qz0Var9.l0(v25Var);
                    obj10 = v25Var;
                }
                zk8.d(ab5Var, (dp2) obj10, qz0Var9);
                boolean zH4 = qz0Var9.h(e71Var) | qz0Var9.f(ab5Var) | qz0Var9.f(wb5VarK);
                Object objM8 = qz0Var9.M();
                Object obj11 = objM8;
                if (zH4 || objM8 == avVar) {
                    androidx.compose.foundation.text.g gVar = new androidx.compose.foundation.text.g(e71Var, wb5Var, ab5Var, wb5VarK);
                    qz0Var9.l0(gVar);
                    obj11 = gVar;
                }
                zc8 zc8Var = new zc8(ab5Var, null, (PointerInputEventHandler) obj11, 6);
                qz0Var9.q(false);
                return zc8Var;
        }
    }
}
