package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.ba6;
import defpackage.bg;
import defpackage.bg0;
import defpackage.bp2;
import defpackage.c08;
import defpackage.cj3;
import defpackage.cl4;
import defpackage.d61;
import defpackage.do3;
import defpackage.dp2;
import defpackage.eh6;
import defpackage.eh8;
import defpackage.eq;
import defpackage.g51;
import defpackage.g8;
import defpackage.h8;
import defpackage.hn7;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.ii8;
import defpackage.j56;
import defpackage.j97;
import defpackage.ji8;
import defpackage.js3;
import defpackage.jz0;
import defpackage.ll;
import defpackage.my6;
import defpackage.ok4;
import defpackage.qj1;
import defpackage.ql3;
import defpackage.qz0;
import defpackage.rh8;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.s08;
import defpackage.si8;
import defpackage.sy6;
import defpackage.tr5;
import defpackage.tx8;
import defpackage.v04;
import defpackage.vt;
import defpackage.w8;
import defpackage.wb5;
import defpackage.wg8;
import defpackage.x44;
import defpackage.x51;
import defpackage.xa7;
import defpackage.yh0;
import defpackage.zc8;
import defpackage.zf;
import defpackage.zh8;
import defpackage.zi8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:209:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05e1 A[PHI: r36
      0x05e1: PHI (r36v10 int) = (r36v5 int), (r36v11 int) binds: [B:273:0x05df, B:270:0x05d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0878 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0a07  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.zh8 r64, final defpackage.dp2 r65, final defpackage.hx4 r66, final defpackage.gj8 r67, final defpackage.wa9 r68, final defpackage.dp2 r69, final defpackage.ab5 r70, final defpackage.k18 r71, final boolean r72, final int r73, final int r74, final defpackage.cj3 r75, final defpackage.sy3 r76, final boolean r77, final androidx.compose.runtime.internal.a r78, defpackage.qz0 r79, final int r80, final int r81) {
        /*
            Method dump skipped, instruction units count: 2719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.c.a(zh8, dp2, hx4, gj8, wa9, dp2, ab5, k18, boolean, int, int, cj3, sy3, boolean, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }

    public static final void b(hx4 hx4Var, androidx.compose.foundation.text.selection.f fVar, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i) {
        qz0Var.c0(2036174316);
        int i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i | (qz0Var.h(fVar) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            cl4 cl4VarD = bg0.d(eq.c, true);
            long j = qz0Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, cl4VarD);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            yh0.b(fVar, aVar, qz0Var, (i2 >> 3) & 126);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new w8(i, 4, hx4Var, fVar, aVar);
        }
    }

    public static final void c(androidx.compose.foundation.text.selection.f fVar, boolean z, qz0 qz0Var, int i) {
        si8 si8VarD;
        qz0Var.c0(626339208);
        int i2 = (qz0Var.h(fVar) ? 4 : 2) | i | (qz0Var.g(z) ? 32 : 16);
        if (!qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            qz0Var.U();
        } else if (z) {
            qz0Var.a0(1530097388);
            x44 x44Var = fVar.d;
            ri8 ri8Var = null;
            if (x44Var != null && (si8VarD = x44Var.d()) != null) {
                ri8 ri8Var2 = si8VarD.a;
                x44 x44Var2 = fVar.d;
                if (!(x44Var2 != null ? x44Var2.p : true)) {
                    ri8Var = ri8Var2;
                }
            }
            if (ri8Var == null) {
                qz0Var.a0(1530097387);
            } else {
                qz0Var.a0(1530097388);
                if (zi8.d(fVar.q().b)) {
                    qz0Var.a0(2062097806);
                } else {
                    qz0Var.a0(2109807302);
                    int iQ = fVar.b.q((int) (fVar.q().b >> 32));
                    int iQ2 = fVar.b.q((int) (fVar.q().b & 4294967295L));
                    ResolvedTextDirection resolvedTextDirectionA = ri8Var.a(iQ);
                    ResolvedTextDirection resolvedTextDirectionA2 = ri8Var.a(Math.max(iQ2 - 1, 0));
                    x44 x44Var3 = fVar.d;
                    if (x44Var3 == null || !((Boolean) ((s08) x44Var3.m).getValue()).booleanValue()) {
                        qz0Var.a0(2062097806);
                    } else {
                        qz0Var.a0(2110225306);
                        xa7.a(true, resolvedTextDirectionA, fVar, qz0Var, ((i2 << 6) & 896) | 6);
                    }
                    qz0Var.q(false);
                    x44 x44Var4 = fVar.d;
                    if (x44Var4 == null || !((Boolean) ((s08) x44Var4.n).getValue()).booleanValue()) {
                        qz0Var.a0(2062097806);
                    } else {
                        qz0Var.a0(2110574459);
                        xa7.a(false, resolvedTextDirectionA2, fVar, qz0Var, ((i2 << 6) & 896) | 6);
                    }
                    qz0Var.q(false);
                }
                qz0Var.q(false);
                x44 x44Var5 = fVar.d;
                if (x44Var5 != null) {
                    wb5 wb5Var = x44Var5.l;
                    if (!js3.i(fVar.t.a.b, fVar.q().a.b)) {
                        ((s08) wb5Var).setValue(Boolean.FALSE);
                    }
                    if (x44Var5.b()) {
                        if (((Boolean) ((s08) wb5Var).getValue()).booleanValue()) {
                            fVar.u();
                        } else {
                            fVar.r();
                        }
                    }
                }
            }
            qz0Var.q(false);
            qz0Var.q(false);
        } else {
            qz0Var.a0(1989076778);
            qz0Var.q(false);
            fVar.r();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new h8(fVar, z, i, 1);
        }
    }

    public static final void d(androidx.compose.foundation.text.selection.f fVar, qz0 qz0Var, int i) {
        ll llVarP;
        qz0Var.c0(-1436003720);
        int i2 = 2;
        int i3 = (qz0Var.h(fVar) ? 4 : 2) | i;
        if (qz0Var.R(i3 & 1, (i3 & 3) != 2)) {
            x44 x44Var = fVar.d;
            if (x44Var == null || !((Boolean) ((s08) x44Var.o).getValue()).booleanValue() || (llVarP = fVar.p()) == null || llVarP.b.length() <= 0) {
                qz0Var.a0(2132946858);
            } else {
                qz0Var.a0(-2112351432);
                boolean zF = qz0Var.f(fVar);
                Object objM = qz0Var.M();
                Object obj = jz0.a;
                if (zF || objM == obj) {
                    objM = new rh8(fVar);
                    qz0Var.l0(objM);
                }
                wg8 wg8Var = (wg8) objM;
                qj1 qj1Var = (qj1) qz0Var.j(l.h);
                rr5 rr5Var = fVar.b;
                long j = fVar.q().b;
                int i4 = zi8.c;
                int iQ = rr5Var.q((int) (j >> 32));
                x44 x44Var2 = fVar.d;
                si8 si8VarD = x44Var2 != null ? x44Var2.d() : null;
                js3.m(si8VarD);
                ri8 ri8Var = si8VarD.a;
                sy6 sy6VarC = ri8Var.c(ok4.t(iQ, 0, ri8Var.a.a.b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((qj1Var.S(eh8.a) / 2) + sy6VarC.a)) << 32) | (((long) Float.floatToRawIntBits(sy6VarC.d)) & 4294967295L);
                boolean zE = qz0Var.e(jFloatToRawIntBits);
                Object objM2 = qz0Var.M();
                if (zE || objM2 == obj) {
                    objM2 = new d61(jFloatToRawIntBits);
                    qz0Var.l0(objM2);
                }
                tr5 tr5Var = (tr5) objM2;
                boolean zH = qz0Var.h(wg8Var) | qz0Var.h(fVar);
                Object objM3 = qz0Var.M();
                if (zH || objM3 == obj) {
                    objM3 = new b(wg8Var, fVar);
                    qz0Var.l0(objM3);
                }
                zc8 zc8Var = new zc8(wg8Var, null, (PointerInputEventHandler) objM3, 6);
                boolean zE2 = qz0Var.e(jFloatToRawIntBits);
                Object objM4 = qz0Var.M();
                if (zE2 || objM4 == obj) {
                    objM4 = new zf(i2, jFloatToRawIntBits);
                    qz0Var.l0(objM4);
                }
                bg.a(tr5Var, hn7.a(zc8Var, false, (dp2) objM4), 0L, qz0Var, 0);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new g8(i, 5, fVar);
        }
    }

    public static final Object e(eh6 eh6Var, wg8 wg8Var, g51 g51Var) {
        Object objV = js3.v(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(eh6Var, wg8Var, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    public static final void f(x44 x44Var) {
        ji8 ji8Var = x44Var.e;
        if (ji8Var != null) {
            x44Var.v.invoke(zh8.a((zh8) x44Var.d.a, null, 0L, 3));
            ii8 ii8Var = ji8Var.a;
            AtomicReference atomicReference = ii8Var.b;
            while (true) {
                if (atomicReference.compareAndSet(ji8Var, null)) {
                    ii8Var.a.c();
                    break;
                } else if (atomicReference.get() != ji8Var) {
                    break;
                }
            }
        }
        x44Var.e = null;
    }

    public static final void g(x44 x44Var, zh8 zh8Var, rr5 rr5Var) {
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            si8 si8VarD = x44Var.d();
            if (si8VarD == null) {
                return;
            }
            ji8 ji8Var = x44Var.e;
            if (ji8Var == null) {
                return;
            }
            v04 v04VarC = x44Var.c();
            if (v04VarC == null) {
                return;
            }
            j97.c(zh8Var, x44Var.a, si8VarD.a, v04VarC, ji8Var, x44Var.b(), rr5Var);
        } finally {
            ql3.u(c08VarK, c08VarM, dp2VarE);
        }
    }

    public static final void h(ii8 ii8Var, x44 x44Var, zh8 zh8Var, cj3 cj3Var, rr5 rr5Var) {
        do3 do3Var = x44Var.d;
        x51 x51Var = x44Var.v;
        x51 x51Var2 = x44Var.w;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        vt vtVar = new vt(do3Var, x51Var, ref$ObjectRef, 23);
        ba6 ba6Var = ii8Var.a;
        ba6Var.d(zh8Var, cj3Var, vtVar, x51Var2);
        ji8 ji8Var = new ji8(ii8Var, ba6Var);
        ii8Var.b.set(ji8Var);
        ref$ObjectRef.a = ji8Var;
        x44Var.e = ji8Var;
        g(x44Var, zh8Var, rr5Var);
    }
}
