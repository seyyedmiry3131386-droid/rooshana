package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.p;
import androidx.compose.runtime.g;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import com.bumptech.glide.a;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.bt2;
import defpackage.tx8;
import defpackage.ug2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.t0;
import io.sentry.h4;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.myket.core.loggers.SuppressedException;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zk8 {
    public static Handler a = null;
    public static volatile long b = -1;
    public static ox4 i = null;
    public static boolean k = false;
    public static hf5 l;
    public static ee5 m;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final zp1 g = new zp1();
    public static final ox4 h = new ox4(null, null, null);
    public static final int[] j = {R.attr.stateListAnimator};

    public static final d A(d dVar) {
        d dVarF = ((c) y40.I(dVar).getFocusOwner()).f();
        if (dVarF == null || !dVarF.n) {
            return null;
        }
        return dVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:41:0x0092 BREAK  A[LOOP:0: B:11:0x001a->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List B(defpackage.t15 r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.js3.p(r9, r0)
            java.lang.Object r9 = r9.b
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            if (r10 != r11) goto Le
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.a
            return r9
        Le:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto L14
            r2 = r1
            goto L15
        L14:
            r2 = r0
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            if (r2 == 0) goto L1f
            if (r10 >= r11) goto L93
            goto L21
        L1f:
            if (r10 <= r11) goto L93
        L21:
            r4 = 0
            if (r2 == 0) goto L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L32
        L30:
            r7 = r4
            goto L52
        L32:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            goto L52
        L3c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L49
            goto L30
        L49:
            java.util.Set r6 = r5.keySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
        L52:
            if (r7 != 0) goto L55
            goto L92
        L55:
            java.lang.Object r5 = r7.a
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L7a
            int r8 = r10 + 1
            if (r8 > r7) goto L61
            if (r7 > r11) goto L61
            goto L7e
        L7a:
            if (r11 > r7) goto L61
            if (r7 >= r10) goto L61
        L7e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            defpackage.js3.m(r10)
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L90
        L8f:
            r5 = r0
        L90:
            if (r5 != 0) goto L1a
        L92:
            return r4
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.B(t15, int, int):java.util.List");
    }

    public static final sy6 C(d dVar) {
        m mVar;
        if (dVar.n && (mVar = dVar.h) != null) {
            v04 v04VarT = c26.t(mVar);
            if (!v04VarT.h()) {
                v04VarT = null;
            }
            if (v04VarT != null) {
                return dVar.F0(v04VarT);
            }
        }
        return sy6.e;
    }

    public static long D(long j2, long j3) {
        xq2.k(j2, "a");
        xq2.k(j3, "b");
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.d E(androidx.compose.ui.focus.d r9) {
        /*
            gx4 r0 = r9.a
            boolean r0 = r0.n
            r1 = 0
            if (r0 != 0) goto L9
            goto Lad
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.rn3.b(r0)
        L10:
            zb5 r0 = new zb5
            r2 = 16
            gx4[] r3 = new defpackage.gx4[r2]
            r4 = 0
            r0.<init>(r4, r3)
            gx4 r9 = r9.a
            gx4 r3 = r9.f
            if (r3 != 0) goto L24
            defpackage.y40.g(r0, r9)
            goto L27
        L24:
            r0.b(r3)
        L27:
            int r9 = r0.c
            if (r9 == 0) goto Lad
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.l(r9)
            gx4 r9 = (defpackage.gx4) r9
            int r3 = r9.d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            defpackage.y40.g(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Laa
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof androidx.compose.ui.focus.d
            r6 = 1
            if (r5 == 0) goto L6f
            androidx.compose.ui.focus.d r9 = (androidx.compose.ui.focus.d) r9
            gx4 r5 = r9.a
            boolean r5 = r5.n
            if (r5 == 0) goto La5
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.H0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L6e
            if (r5 == r6) goto L6e
            r6 = 2
            if (r5 == r6) goto L6e
            r9 = 3
            if (r5 != r9) goto L68
            goto La5
        L68:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L6e:
            return r9
        L6f:
            int r5 = r9.c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La5
            boolean r5 = r9 instanceof defpackage.ti1
            if (r5 == 0) goto La5
            r5 = r9
            ti1 r5 = (defpackage.ti1) r5
            gx4 r5 = r5.p
            r7 = r4
        L7f:
            if (r5 == 0) goto La2
            int r8 = r5.c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9f
            int r7 = r7 + 1
            if (r7 != r6) goto L8d
            r9 = r5
            goto L9f
        L8d:
            if (r3 != 0) goto L96
            zb5 r3 = new zb5
            gx4[] r8 = new defpackage.gx4[r2]
            r3.<init>(r4, r8)
        L96:
            if (r9 == 0) goto L9c
            r3.b(r9)
            r9 = r1
        L9c:
            r3.b(r5)
        L9f:
            gx4 r5 = r5.f
            goto L7f
        La2:
            if (r7 != r6) goto La5
            goto L46
        La5:
            gx4 r9 = defpackage.y40.j(r3)
            goto L46
        Laa:
            gx4 r9 = r9.f
            goto L3d
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.E(androidx.compose.ui.focus.d):androidx.compose.ui.focus.d");
    }

    public static int I(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return sv0.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final void J(f14 f14Var) {
        y40.H(f14Var).Q();
    }

    public static final boolean L(d dVar) {
        h hVar;
        m mVar;
        h hVar2;
        m mVar2 = dVar.h;
        return (mVar2 == null || (hVar = mVar2.p) == null || !hVar.V() || (mVar = dVar.h) == null || (hVar2 = mVar.p) == null || !hVar2.U()) ? false : true;
    }

    public static final boolean M(gh0 gh0Var) {
        js3.p(gh0Var, "<this>");
        try {
            tv6 tv6VarPeek = gh0Var.peek();
            for (long j2 = 0; j2 < 16; j2++) {
                if (tv6VarPeek.b()) {
                    return true;
                }
                tv6VarPeek.g1(1L);
                gh0 gh0Var2 = tv6VarPeek.b;
                byte bY = gh0Var2.y(0L);
                if ((bY & 224) == 192) {
                    tv6VarPeek.g1(2L);
                } else if ((bY & 240) == 224) {
                    tv6VarPeek.g1(3L);
                } else if ((bY & 248) == 240) {
                    tv6VarPeek.g1(4L);
                }
                int iC0 = gh0Var2.C0();
                if (Character.isISOControl(iC0) && !Character.isWhitespace(iC0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static float N(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static f57 O(Context context, String str) {
        if (str == null || f88.n0(str)) {
            lw.g(null, "url is empty", null);
            str = "empty_url";
        }
        try {
            f57 f57VarQ = a.b(context).c(context).q(new ne5(str, null));
            js3.m(f57VarQ);
            return f57VarQ;
        } catch (Exception unused) {
            return t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
    }

    public static f57 P(View view, String str) {
        js3.p(view, "view");
        if (str == null || f88.n0(str)) {
            lw.g(null, "url is empty", null);
            str = "empty_url";
        }
        try {
            f57 f57VarQ = a.f(view).q(new ne5(str, null));
            js3.m(f57VarQ);
            return f57VarQ;
        } catch (Exception unused) {
            return t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
    }

    public static f57 Q(androidx.fragment.app.d dVar, String str) {
        js3.p(dVar, "fragment");
        if (str == null || f88.n0(str)) {
            lw.g(null, "url is empty", null);
            str = "empty_url";
        }
        try {
            f57 f57VarQ = a.b(dVar.H()).d(dVar).q(new ne5(str, null));
            js3.m(f57VarQ);
            return f57VarQ;
        } catch (Exception unused) {
            return t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
    }

    public static ym5 W(tv6 tv6Var) {
        int i2 = Integer.parseInt(tv6Var.Y(Long.MAX_VALUE));
        long j2 = Long.parseLong(tv6Var.Y(Long.MAX_VALUE));
        long j3 = Long.parseLong(tv6Var.Y(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(tv6Var.Y(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strY = tv6Var.Y(Long.MAX_VALUE);
            int iK0 = f88.k0(':', 0, 6, strY);
            if (iK0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strY).toString());
            }
            String strSubstring = strY.substring(0, iK0);
            js3.o(strSubstring, "substring(...)");
            String string = f88.J0(strSubstring).toString();
            String strSubstring2 = strY.substring(iK0 + 1);
            js3.o(strSubstring2, "substring(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring2);
        }
        return new ym5(i2, j2, j3, new rm5(b.T(linkedHashMap)), null, null);
    }

    public static void X(Throwable th, boolean z) {
        m.getClass();
        if (k) {
            if (z && !(th instanceof SuppressedException)) {
                th = new SuppressedException(th);
            }
            Z(th);
        }
    }

    public static long Y(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j2 < 0)))) {
            long j5 = j2 * j3;
            if (j2 == 0 || j5 / j2 == j3) {
                return j5;
            }
        }
        return j4;
    }

    public static void Z(Throwable th) {
        if (b <= 0) {
            b = Looper.getMainLooper().getThread().getId();
        }
        if (Thread.currentThread().getId() == b) {
            new n32(th).b(lx.g, new Void[0]);
            return;
        }
        try {
            hf5 hf5Var = l;
            if (hf5Var == null) {
                h4.b().y(th);
                return;
            }
            SentryAndroidOptions sentryAndroidOptions = hf5Var.a;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.setAttachScreenshot(false);
            }
            h4.b().y(th);
            SentryAndroidOptions sentryAndroidOptions2 = l.a;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.setAttachScreenshot(true);
            }
        } catch (Exception e2) {
            lw.g(e2, "Could not save suppressed error", null);
        }
    }

    public static final void a(fi6 fi6Var, androidx.compose.runtime.internal.a aVar, p pVar, androidx.compose.runtime.internal.a aVar2, qz0 qz0Var, int i2) {
        fi6 fi6Var2;
        int i3;
        wb5 wb5Var;
        boolean z;
        qz0Var.c0(-1221877520);
        if ((i2 & 6) == 0) {
            fi6Var2 = fi6Var;
            i3 = (qz0Var.f(fi6Var2) ? 4 : 2) | i2;
        } else {
            fi6Var2 = fi6Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? qz0Var.f(pVar) : qz0Var.h(pVar) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        ex4 ex4Var = ex4.b;
        if (i4 == 0) {
            i3 |= qz0Var.f(ex4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= qz0Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= qz0Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= qz0Var.h(aVar2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (qz0Var.R(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            e71 e71Var = (e71) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == obj) {
                objM2 = g.h(Boolean.FALSE);
                qz0Var.l0(objM2);
            }
            wb5 wb5Var2 = (wb5) objM2;
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, ex4Var);
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
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            if (pVar.b()) {
                qz0Var.a0(-1891243071);
                wb5Var = wb5Var2;
                l(fi6Var2, pVar, e71Var, false, wb5Var, aVar, qz0Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                z = false;
                qz0Var.q(false);
            } else {
                wb5Var = wb5Var2;
                z = false;
                qz0Var.a0(-1890863476);
                qz0Var.q(false);
            }
            m(pVar, wb5Var, aVar2, qz0Var, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            qz0Var.q(true);
            boolean z2 = ((i5 & 896) == 256 || ((i5 & 512) != 0 && qz0Var.h(pVar))) ? true : z;
            Object objM3 = qz0Var.M();
            if (z2 || objM3 == obj) {
                objM3 = new n(19, pVar);
                qz0Var.l0(objM3);
            }
            d(pVar, (dp2) objM3, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(fi6Var, aVar, pVar, aVar2, i2, 3);
        }
    }

    public static hx4 a0(hx4 hx4Var, bh7 bh7Var, Orientation orientation, androidx.compose.foundation.c cVar, boolean z, qe1 qe1Var, ab5 ab5Var) {
        float f2 = ot0.a;
        Orientation orientation2 = Orientation.a;
        ex4 ex4Var = ex4.b;
        return hx4Var.d(orientation == orientation2 ? s(ex4Var, uc3.c) : s(ex4Var, uc3.b)).d(new vg7(qe1Var, ab5Var, bh7Var, cVar, orientation, z, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.um r11, defpackage.qp2 r12, defpackage.qz0 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.b(um, qp2, qz0, int):void");
    }

    public static void b0(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(cs6.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, vp6.state_liftable, -vp6.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.um[] r8, defpackage.qp2 r9, defpackage.qz0 r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.c0(r0)
            ar3 r0 = r10.x
            j56 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            yt5 r3 = defpackage.sz0.b
            r10.X(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            i56 r2 = defpackage.i56.d
            i56 r2 = defpackage.wu8.N(r8, r1, r2)
            i56 r1 = r10.k0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L74
        L27:
            bz7 r2 = r10.G
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            defpackage.js3.n(r2, r5)
            j56 r2 = (defpackage.j56) r2
            bz7 r6 = r10.G
            int r7 = r6.g
            java.lang.Object r6 = r6.h(r7, r3)
            defpackage.js3.n(r6, r5)
            j56 r6 = (defpackage.j56) r6
            i56 r5 = defpackage.wu8.N(r8, r1, r6)
            boolean r7 = r10.B()
            if (r7 == 0) goto L65
            boolean r7 = r10.y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.l
            bz7 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.l = r5
            r1 = r2
            goto L25
        L65:
            i56 r1 = r10.k0(r1, r5)
            boolean r5 = r10.y
            if (r5 != 0) goto L73
            boolean r2 = defpackage.js3.i(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.K(r1)
        L7d:
            boolean r5 = r10.w
            r0.c(r5)
            r10.w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            yt5 r5 = defpackage.sz0.c
            r10.V(r5, r2, r1, r4)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.q(r4)
            r10.q(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.w = r3
            r0 = 0
            r10.K = r0
            my6 r10 = r10.s()
            if (r10 == 0) goto Lb9
            a6 r0 = new a6
            r1 = 5
            r0.<init>(r8, r9, r11, r1)
            r10.d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.c(um[], qp2, qz0, int):void");
    }

    public static final void d(Object obj, dp2 dp2Var, qz0 qz0Var) {
        boolean zF = qz0Var.f(obj);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new xp1(dp2Var);
            qz0Var.l0(objM);
        }
    }

    public static final void e(Object obj, Object obj2, dp2 dp2Var, qz0 qz0Var) {
        boolean zF = qz0Var.f(obj) | qz0Var.f(obj2);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new xp1(dp2Var);
            qz0Var.l0(objM);
        }
    }

    public static final void f(Object[] objArr, dp2 dp2Var, qz0 qz0Var) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= qz0Var.f(obj);
        }
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            qz0Var.l0(new xp1(dp2Var));
        }
    }

    public static final void g(hx4 hx4Var, String str, boolean z, bp2 bp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        qz0 qz0Var2 = qz0Var;
        js3.p(str, "seasonTitle");
        qz0Var2.c0(2001448986);
        int i3 = i2 | 6 | (qz0Var2.f(str) ? 32 : 16) | (qz0Var2.g(z) ? 256 : 128) | (qz0Var2.h(bp2Var) ? 2048 : 1024);
        if (qz0Var2.R(i3 & 1, (i3 & 1171) != 1170)) {
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            ex4 ex4Var = ex4.b;
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, ex4Var);
            hz0.d0.getClass();
            bp2 bp2Var2 = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = androidx.compose.ui.node.d.f;
            ia7.o(qz0Var2, qp2Var, vv0VarA);
            qp2 qp2Var2 = androidx.compose.ui.node.d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var3 = androidx.compose.ui.node.d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var = androidx.compose.ui.node.d.h;
            ia7.n(qz0Var2, dp2Var);
            qp2 qp2Var4 = androidx.compose.ui.node.d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            hx4 hx4VarS = s(ex4Var, la7.a);
            boolean z2 = !z;
            Object objM = qz0Var2.M();
            if (objM == jz0.a) {
                objM = o40.r(qz0Var2);
            }
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarZ = yh0.z(ix4.b(hx4VarS, z2, f.a(ex4Var, (ab5) objM, r97.a(0.0f, 3, ((tj8) objJ).z), false, null, bp2Var, 28)), ml9.q(hq6.space_16, qz0Var2));
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), eq.m, qz0Var2, 48);
            long j3 = qz0Var2.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
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
            ia7.o(qz0Var2, qp2Var4, hx4VarC2);
            String strG = ln2.g(vs6.player_movie_other_season_title, new Object[]{str}, qz0Var2);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).c;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            mi8.b(strG, null, ((tj8) objJ2).k, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
            qz0Var2 = qz0Var;
            if (z) {
                qz0Var2.a0(729023906);
            } else {
                qz0Var2.a0(731842705);
                g16 g16VarG = rf0.G(br6.player_ic_arrow_down, qz0Var2);
                hx4 hx4VarI = androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.size_16, qz0Var2));
                Object objJ3 = qz0Var2.j(u58Var);
                js3.m(objJ3);
                kh3.a(g16VarG, hx4VarI, ((tj8) objJ3).k, qz0Var2, 56, 0);
            }
            qz0Var2.q(false);
            qz0Var2.q(true);
            float fQ = ml9.q(hq6.size_1, qz0Var2);
            Object objJ4 = qz0Var2.j(u58Var);
            js3.m(objJ4);
            tt3.b(null, fQ, ((tj8) objJ4).r, qz0Var2, 0, 1);
            qz0Var2.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new vx2(hx4Var2, str, z, bp2Var, i2, 0);
        }
    }

    public static final void h(qz0 qz0Var, qp2 qp2Var, Object obj) {
        w61 w61Var = qz0Var.R;
        boolean zF = qz0Var.f(obj);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new androidx.compose.runtime.c(w61Var, qp2Var);
            qz0Var.l0(objM);
        }
    }

    public static final void i(Object obj, Object obj2, qp2 qp2Var, qz0 qz0Var) {
        w61 w61Var = qz0Var.R;
        boolean zF = qz0Var.f(obj) | qz0Var.f(obj2);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new androidx.compose.runtime.c(w61Var, qp2Var);
            qz0Var.l0(objM);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(final defpackage.hx4 r19, final defpackage.wd6 r20, final defpackage.dp2 r21, boolean r22, defpackage.qz0 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.j(hx4, wd6, dp2, boolean, qz0, int, int):void");
    }

    public static void j0(w21 w21Var, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + w21Var.b;
        try {
            int iOrdinal = w21Var.c.ordinal();
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((r((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (r((int) (fArr[3] * 255.0f)) << 24) | (r((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | r((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iR = (r((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (r((int) (fArr[3] * 255.0f)) << 24) | (r((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | r((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iR);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + w21Var.b);
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            StringBuilder sbN = t61.n("Cannot access method ", str, " on View \"");
            sbN.append(vy2.F(view));
            sbN.append("\"");
            t0.e("CustomSupport", sbN.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sbN2 = t61.n("No method ", str, " on View \"");
            sbN2.append(vy2.F(view));
            sbN2.append("\"");
            t0.e("CustomSupport", sbN2.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sbN3 = t61.n("Cannot invoke method ", str, " on View \"");
            sbN3.append(vy2.F(view));
            sbN3.append("\"");
            t0.e("CustomSupport", sbN3.toString(), e4);
        }
    }

    public static final void k(bp2 bp2Var, qz0 qz0Var) {
        mv5 mv5Var = qz0Var.M.b.g;
        mv5Var.D0(dv5.d);
        xq2.G(mv5Var, 0, bp2Var);
    }

    public static final void l(fi6 fi6Var, final p pVar, final e71 e71Var, boolean z, final wb5 wb5Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        fi6 fi6Var2;
        int i3;
        qz0Var.c0(-1413720282);
        if ((i2 & 6) == 0) {
            fi6Var2 = fi6Var;
            i3 = (qz0Var.f(fi6Var2) ? 4 : 2) | i2;
        } else {
            fi6Var2 = fi6Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? qz0Var.f(pVar) : qz0Var.h(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(e71Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var.f(wb5Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var.h(aVar) ? 1048576 : 524288;
        }
        if (qz0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            String strF = ln2.f(xs6.tooltip_description, qz0Var);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && qz0Var.h(pVar))) | ((i3 & 896) == 256) | qz0Var.h(e71Var) | ((458752 & i3) == 131072);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new bp2() { // from class: androidx.compose.material3.internal.e
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        p pVar2 = pVar;
                        if (pVar2.b()) {
                            bt2.G(e71Var, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(pVar2, null), 3);
                            wb5Var.setValue(Boolean.FALSE);
                        }
                        return tx8.a;
                    }
                };
                qz0Var.l0(objM);
            }
            androidx.compose.ui.window.d.a(fi6Var2, (bp2) objM, new gi6(14, z), s7.X(-1287705660, new qa0(strF, aVar, 0), qz0Var), qz0Var, (i3 & 14) | 3072, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new pa0(fi6Var, pVar, e71Var, z, wb5Var, aVar, i2);
        }
    }

    public static final void m(final p pVar, wb5 wb5Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(1873232064);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? qz0Var.f(pVar) : qz0Var.h(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.f(wb5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.g(false) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        ex4 ex4Var = ex4.b;
        if (i4 == 0) {
            i3 |= qz0Var.f(ex4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var.h(aVar) ? 131072 : 65536;
        }
        if (qz0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            final e71 e71Var = (e71) objM;
            hx4 hx4VarT = ct2.t(gu9.y(bd8.a(bd8.a(ex4Var, pVar, new androidx.compose.material3.internal.h(pVar, 0)), pVar, new androidx.compose.material3.internal.h(pVar, 1)).d(new g26(new vt(ln2.f(xs6.tooltip_label, qz0Var), e71Var, pVar))), new dp2() { // from class: androidx.compose.material3.internal.f
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    bt2.G(e71Var, null, null, new BasicTooltipKt$keyboardBehavior$1$1((ug2) obj, pVar, null), 3);
                    return tx8.a;
                }
            }), new wb(pVar, wb5Var, 1));
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarT);
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
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            aVar.invoke(qz0Var, Integer.valueOf((i3 >> 15) & 14));
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i2, 4, pVar, wb5Var, aVar);
        }
    }

    public static final Drawable n(wh3 wh3Var, Resources resources) {
        return wh3Var instanceof qv1 ? ((qv1) wh3Var).a : wh3Var instanceof mc0 ? new BitmapDrawable(resources, ((mc0) wh3Var).a) : new q5(1, wh3Var);
    }

    public static final wh3 o(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new mc0(((BitmapDrawable) drawable).getBitmap()) : new qv1(drawable);
    }

    public static final String o0(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j2);
        long j3 = 60;
        long minutes = timeUnit.toMinutes(j2) % j3;
        long seconds = timeUnit.toSeconds(j2) % j3;
        return hours > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3)) : String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
    }

    public static void p(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void p0(ym5 ym5Var, sv6 sv6Var) {
        sv6Var.i1(ym5Var.a);
        sv6Var.writeByte(10);
        sv6Var.i1(ym5Var.b);
        sv6Var.writeByte(10);
        sv6Var.i1(ym5Var.c);
        sv6Var.writeByte(10);
        Set<Map.Entry> setEntrySet = ym5Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sv6Var.i1(size);
        sv6Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                sv6Var.n0((String) entry.getKey());
                sv6Var.n0(":");
                sv6Var.n0(str);
                sv6Var.writeByte(10);
            }
        }
    }

    public static long q(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j3) < 0) || ((j2 ^ j4) >= 0)) {
            return j4;
        }
        throw new ArithmeticException(bl4.s(j3, ")", rm7.s(j2, "overflow: checkedAdd(", ", ")));
    }

    public static float q0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static int r(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static final hx4 s(hx4 hx4Var, xr7 xr7Var) {
        return androidx.compose.ui.graphics.d.c(hx4Var, 0.0f, xr7Var, 518143);
    }

    public static final hx4 t(hx4 hx4Var) {
        return androidx.compose.ui.graphics.d.c(hx4Var, 0.0f, null, 520191);
    }

    public static final void w(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static final e71 x(w61 w61Var, qz0 qz0Var) {
        if (w61Var.r0(th0.n) == null) {
            return new androidx.compose.runtime.m(qz0Var.R, w61Var);
        }
        xt3 xt3VarA = kotlinx.coroutines.a.a();
        xt3VarA.V(new rx0(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return js3.a(xt3VarA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long z(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = defpackage.he4.a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.z(long, long, java.math.RoundingMode):long");
    }

    public abstract int F();

    public abstract Context G();

    public abstract void H();

    public boolean K() {
        return false;
    }

    public abstract void R();

    public abstract boolean T(int i2, KeyEvent keyEvent);

    public boolean U(KeyEvent keyEvent) {
        return false;
    }

    public boolean V() {
        return false;
    }

    public abstract void c0(boolean z);

    public abstract void d0(boolean z);

    public abstract void e0();

    public abstract void f0();

    public abstract void g0(Drawable drawable);

    public abstract void h0();

    public abstract void i0();

    public abstract void k0(boolean z);

    public abstract void l0(CharSequence charSequence);

    public abstract void m0();

    public k6 n0(do3 do3Var) {
        return null;
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    public abstract void y(boolean z);

    public void S() {
    }
}
