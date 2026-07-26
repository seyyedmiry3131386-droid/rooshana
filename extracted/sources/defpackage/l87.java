package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import androidx.compose.foundation.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l87 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final void a(hx4 hx4Var, bp2 bp2Var, qz0 qz0Var, int i) {
        qz0 qz0Var2;
        qz0Var.c0(-36771308);
        int i2 = i | (qz0Var.f(hx4Var) ? 4 : 2) | (qz0Var.h(bp2Var) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarA = yh0.A(f.a(rq4.f(hx4Var, ((tj8) objJ).i, la7.a), null, null, false, new v97(0), bp2Var, 12), ml9.q(hq6.space_16, qz0Var), ml9.q(hq6.space_8, qz0Var));
            bb0 bb0Var = eq.m;
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var)), bb0Var, qz0Var, 48);
            long j = qz0Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var2);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cb7VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            g16 g16VarG = rf0.G(br6.player_ic_retry, qz0Var);
            hx4 hx4VarI = androidx.compose.foundation.layout.b.i(ex4.b, ml9.q(hq6.size_24, qz0Var));
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            kh3.a(g16VarG, hx4VarI, ((tj8) objJ2).j, qz0Var, 56, 0);
            String strF = ln2.f(vs6.player_retry_button_text, qz0Var);
            gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).h;
            Object objJ3 = qz0Var.j(u58Var);
            js3.m(objJ3);
            mi8.b(strF, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(hx4Var, bp2Var, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.hx4 r40, final defpackage.af6 r41, androidx.compose.material3.n r42, defpackage.dl5 r43, defpackage.bp2 r44, defpackage.dp2 r45, defpackage.qz0 r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l87.b(hx4, af6, androidx.compose.material3.n, dl5, bp2, dp2, qz0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.hx4 r22, java.lang.String r23, defpackage.dp2 r24, defpackage.qz0 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l87.c(hx4, java.lang.String, dp2, qz0, int, int):void");
    }

    public static StateListDrawable d(Resources resources, int i) {
        p3.k(resources, i);
        Drawable drawableK = p3.k(resources, i);
        drawableK.setTint(sj8.b().n);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(StateSet.WILD_CARD, drawableK);
        return stateListDrawable;
    }

    public static final long e(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : zu0.b(zu0.d(j) * f, j);
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long g(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
