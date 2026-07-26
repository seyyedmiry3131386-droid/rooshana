package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.f;
import androidx.compose.foundation.text.contextmenu.modifier.c;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct2 {
    public static final ui a = new ui();
    public static final ym6 b = new ym6("list-item-type");
    public static final ym6 c = new ym6("bullet-list-item-level");
    public static final ym6 d = new ym6("ordered-list-item-number");
    public static final ym6 e = new ym6("heading-level");
    public static final ym6 f = new ym6("link-destination");
    public static final ym6 g = new ym6("paragraph-is-in-tight-list");
    public static final ym6 h = new ym6("code-block-info");
    public static final sm5 i = new sm5(24);
    public static final uy0 j = new uy0(2);
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ct2(int i2) {
        this(false);
        switch (i2) {
            case 14:
                break;
        }
    }

    public static String A(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public static final ox8 B(g51 g51Var, w61 w61Var, Object obj) {
        ox8 ox8Var = null;
        if ((g51Var instanceof f71) && w61Var.r0(sm0.d) != null) {
            f71 callerFrame = (f71) g51Var;
            while (true) {
                if ((callerFrame instanceof b) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof ox8) {
                    ox8Var = (ox8) callerFrame;
                    break;
                }
            }
            if (ox8Var != null) {
                ox8Var.q0(w61Var, obj);
            }
        }
        return ox8Var;
    }

    public static final Object C(w61 w61Var, Object obj, Object obj2, qp2 qp2Var, g51 g51Var) {
        Object objInvoke;
        Object objP = is3.P(w61Var, obj2);
        try {
            c48 c48Var = new c48(g51Var, w61Var);
            if (o40.O(qp2Var)) {
                wu8.i(2, qp2Var);
                objInvoke = qp2Var.invoke(obj, c48Var);
            } else {
                objInvoke = ok4.a0(qp2Var, obj, c48Var);
            }
            is3.H(w61Var, objP);
            if (objInvoke == CoroutineSingletons.a) {
                js3.p(g51Var, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            is3.H(w61Var, objP);
            throw th;
        }
    }

    public static final void a(int i2, qz0 qz0Var) {
        qz0Var.c0(1493878561);
        if (qz0Var.R(i2 & 1, i2 != 0)) {
            dy3.k = ((Configuration) qz0Var.j(e.a)).orientation == 2;
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new r05(i2);
        }
    }

    public static hx0 b() {
        hx0 hx0Var = new hx0(true);
        hx0Var.Q(null);
        return hx0Var;
    }

    public static final void c(hx4 hx4Var, ih3 ih3Var, bp2 bp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        boolean z;
        ih3 ih3Var2 = ih3Var;
        qz0 qz0Var2 = qz0Var;
        js3.p(ih3Var2, "item");
        qz0Var2.c0(-2036077963);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? qz0Var2.f(ih3Var2) : qz0Var2.h(ih3Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.h(bp2Var) ? 256 : 128;
        }
        if (qz0Var2.R(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) qz0Var2.j(e.b);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarC = androidx.compose.foundation.layout.b.c(ex4Var, 1.0f);
            Object objM = qz0Var2.M();
            if (objM == jz0.a) {
                objM = o40.r(qz0Var2);
            }
            hx4 hx4VarZ = yh0.z(f.a(hx4VarC, (ab5) objM, r97.a(0.0f, 3, wu8.x(qz0Var2).z), false, null, bp2Var, 28), ml9.q(hq6.space_16, qz0Var2));
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var2, qp2Var, cl4VarD);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var = d.h;
            ia7.n(qz0Var2, dp2Var);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC2);
            cb0 cb0Var = eq.f;
            ng0 ng0Var = ng0.a;
            hx4 hx4VarA = ng0Var.a(ex4Var, cb0Var);
            fv fvVar = jv.a;
            ev evVarG = jv.g(ml9.q(hq6.space_8, qz0Var2));
            bb0 bb0Var = eq.m;
            cb7 cb7VarA = bb7.a(evVarG, bb0Var, qz0Var2, 48);
            long j3 = qz0Var2.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC3 = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, qp2Var, cb7VarA);
            ia7.o(qz0Var2, qp2Var2, j56VarL2);
            ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var3);
            ia7.n(qz0Var2, dp2Var);
            ia7.o(qz0Var2, qp2Var4, hx4VarC3);
            kh3.a(rf0.G(ih3Var2.a, qz0Var2), androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.bottom_sheet_item_icon_size, qz0Var2)), wu8.x(qz0Var2).j, qz0Var2, 56, 0);
            mi8.b(ih3Var2.b, null, wu8.x(qz0Var).j, 0L, 0L, new of8(5), 0L, 0, false, 0, 0, wu8.y(qz0Var).g, qz0Var, 0, 0, 130042);
            qz0Var.q(true);
            hx4 hx4VarA2 = ng0Var.a(ex4Var, eq.h);
            cb7 cb7VarA2 = bb7.a(jv.a, bb0Var, qz0Var, 48);
            long j4 = qz0Var.T;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            j56 j56VarL3 = qz0Var.l();
            hx4 hx4VarC4 = androidx.compose.ui.b.c(qz0Var, hx4VarA2);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var2);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, qp2Var, cb7VarA2);
            ia7.o(qz0Var, qp2Var2, j56VarL3);
            ia7.g(qz0Var, Integer.valueOf(i6), qp2Var3);
            ia7.n(qz0Var, dp2Var);
            ia7.o(qz0Var, qp2Var4, hx4VarC4);
            ih3Var2 = ih3Var;
            mi8.b(xa7.f(context, ih3Var2.c), null, wu8.x(qz0Var).j, 0L, 0L, new of8(5), 0L, 0, false, 0, 0, wu8.y(qz0Var).k, qz0Var, 0, 0, 130042);
            qz0Var2 = qz0Var;
            if (ih3Var2.d) {
                qz0Var2.a0(-1434681953);
                kh3.a(rf0.G(br6.player_ic_chevron, qz0Var2), androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.size_16, qz0Var2)), wu8.x(qz0Var2).j, qz0Var2, 56, 0);
                z = false;
            } else {
                z = false;
                qz0Var2.a0(-1437749620);
            }
            qz0Var2.q(z);
            qz0Var2.q(true);
            qz0Var2.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i2, 10, hx4Var2, ih3Var2, bp2Var);
        }
    }

    public static final v74 e(px3 px3Var, px3 px3Var2) {
        js3.p(px3Var, "keySerializer");
        js3.p(px3Var2, "valueSerializer");
        return new v74(px3Var, px3Var2);
    }

    public static final void f(View view, h hVar) {
        long jK = ((androidx.compose.ui.node.e) hVar.H.d).K(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jK >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jK & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    public static final void g(q95 q95Var, tm0 tm0Var, ch0 ch0Var, float f2, ur7 ur7Var, qg8 qg8Var, iv1 iv1Var) {
        ArrayList arrayList = q95Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l16 l16Var = (l16) arrayList.get(i2);
            l16Var.a.g(tm0Var, ch0Var, f2, ur7Var, qg8Var, iv1Var);
            tm0Var.n(0.0f, l16Var.a.b());
        }
    }

    public static final boolean h(long j2, long j3) {
        return j2 == j3;
    }

    public static final w61 i(w61 w61Var, w61 w61Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) w61Var.J(new sy0(5), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) w61Var2.J(new sy0(5), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return w61Var.l0(w61Var2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = w61Var2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        w61 w61Var3 = (w61) w61Var.J(new sy0(6), emptyCoroutineContext);
        if (zBooleanValue2) {
            ref$ObjectRef.a = ((w61) ref$ObjectRef.a).J(new sy0(7), emptyCoroutineContext);
        }
        return w61Var3.l0((w61) ref$ObjectRef.a);
    }

    public static Instant j(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            return j2 > 0 ? Instant.d : Instant.c;
        }
        if (j5 < -31557014167219200L) {
            return Instant.c;
        }
        if (j5 > 31556889864403199L) {
            return Instant.d;
        }
        long j6 = j3 % 1000000000;
        return new Instant((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
    }

    public static final String k() {
        byte[] bArr = new byte[16];
        cl7.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j2 = a77.j(0, bArr);
        long j3 = a77.j(8, bArr);
        return ((j2 == 0 && j3 == 0) ? Uuid.c : new Uuid(j2, j3)).toString();
    }

    public static final ArrayList l(es3 es3Var) {
        js3.n(es3Var, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        h hVarF0 = ((fl4) es3Var).f0();
        boolean zO = o(hVarF0);
        kb5 kb5Var = (kb5) hVarF0.r();
        zb5 zb5Var = (zb5) kb5Var.b;
        ArrayList arrayList = new ArrayList(zb5Var.c);
        int i2 = zb5Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            h hVar = (h) kb5Var.get(i3);
            arrayList.add(zO ? hVar.n() : hVar.o());
        }
        return arrayList;
    }

    public static String m(Class cls) {
        LinkedHashMap linkedHashMap = ll5.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            jl5 jl5Var = (jl5) cls.getAnnotation(jl5.class);
            strValue = jl5Var != null ? jl5Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        js3.m(strValue);
        return strValue;
    }

    public static final px3 n(px3 px3Var) {
        js3.p(px3Var, "<this>");
        return px3Var.getDescriptor().c() ? px3Var : new yp5(px3Var);
    }

    public static final boolean o(h hVar) {
        int iOrdinal = hVar.v().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                h hVarF = hVar.F();
                if (hVarF != null) {
                    return o(hVarF);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final w61 p(e71 e71Var, w61 w61Var) {
        w61 w61VarI = i(e71Var.getCoroutineContext(), w61Var, true);
        ug1 ug1Var = up1.a;
        return (w61VarI == ug1Var || w61VarI.r0(eq.u) != null) ? w61VarI : w61VarI.l0(ug1Var);
    }

    public static final hx4 r(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new gy3(dp2Var, null));
    }

    public static final hx4 t(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new gy3(null, dp2Var));
    }

    public static final void v(Context context, wa waVar, long j2) {
        js3.p(context, "context");
        js3.p(waVar, "adLinkInfo");
        String strJ = js8.j(waVar.a, null, null, null, null, true);
        if (!waVar.g) {
            Intent intentPutExtra = new Intent("ir.myket.player.action.OPEN_URL").setFlags(268435456).putExtra("BUNDLE_KEY_URL", strJ).putExtra("BUNDLE_KEY_TITLE", waVar.b);
            js3.o(intentPutExtra, "putExtra(...)");
            context.startActivity(intentPutExtra);
        } else if (wn5.d(context)) {
            wn5.a0(gu9.E(j2), context, strJ);
        } else {
            js8.t(12, context, strJ, null);
        }
    }

    public static jv4 w(w72 w72Var, boolean z) {
        vv1 vv1Var = z ? null : qh3.d;
        h26 h26Var = new h26(10);
        jv4 jv4VarO = null;
        int i2 = 0;
        while (true) {
            try {
                w72Var.q(h26Var.a, 0, 10);
                h26Var.J(0);
                if (h26Var.A() != 4801587) {
                    break;
                }
                h26Var.K(3);
                int iW = h26Var.w();
                int i3 = iW + 10;
                if (jv4VarO == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(h26Var.a, 0, bArr, 0, 10);
                    w72Var.q(bArr, 10, iW);
                    jv4VarO = new qh3(vv1Var).o(i3, bArr);
                } else {
                    w72Var.g(iW);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        w72Var.m();
        w72Var.g(i2);
        if (jv4VarO == null || jv4VarO.a.length == 0) {
            return null;
        }
        return jv4VarO;
    }

    public static qq4 x(h26 h26Var) {
        h26Var.K(1);
        int iA = h26Var.A();
        long j2 = ((long) h26Var.b) + ((long) iA);
        int i2 = iA / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jR = h26Var.r();
            if (jR == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jR;
            jArrCopyOf2[i3] = h26Var.r();
            h26Var.K(2);
            i3++;
        }
        h26Var.K((int) (j2 - ((long) h26Var.b)));
        return new qq4(jArrCopyOf, jArrCopyOf2);
    }

    public static final wr2 y(qz0 qz0Var) {
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (objM == obj) {
            objM = new wr2();
            qz0Var.l0(objM);
        }
        wr2 wr2Var = (wr2) objM;
        boolean zH = qz0Var.h(wr2Var);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj) {
            objM2 = new m22(5, wr2Var);
            qz0Var.l0(objM2);
        }
        zk8.d(tx8.a, (dp2) objM2, qz0Var);
        return wr2Var;
    }

    public static final hx4 z(hx4 hx4Var, c cVar, dp2 dp2Var, dp2 dp2Var2, t51 t51Var) {
        return hx4Var.d(new og8(cVar, dp2Var, dp2Var2, t51Var));
    }

    public abstract void q(Throwable th);

    public abstract void s(vp7 vp7Var);

    public ct2(boolean z) {
    }
}
