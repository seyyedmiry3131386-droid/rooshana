package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.animation.core.c;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.content.ContextCompat;
import ir.myket.player.domain.models.PlayerMovieData;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ja1 implements yp2 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final a g = new a(-51699941, new yf(12), false);
    public static final yd9 h = new yd9(0.31006f, 0.31616f);
    public static final yd9 i = new yd9(0.34567f, 0.3585f);
    public static final yd9 j = new yd9(0.32168f, 0.33767f);
    public static final yd9 k = new yd9(0.31271f, 0.32902f);
    public static final float[] l = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] m = new StackTraceElement[0];
    public static final mu3 n;
    public static final mu3 o;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static boolean t = false;
    public static Method u = null;
    public static boolean v = false;
    public static Field w;
    public static final /* synthetic */ int x = 0;
    public static final /* synthetic */ int y = 0;

    static {
        int i2 = 1;
        n = new mu3("NONE", i2);
        o = new mu3("PENDING", i2);
    }

    public static void A(ta8 ta8Var, int i2, n31 n31Var) {
        long jE = ta8Var.e(i2);
        List listH = ta8Var.h(jE);
        if (listH.isEmpty()) {
            return;
        }
        if (i2 == ta8Var.k() - 1) {
            throw new IllegalStateException();
        }
        long jE2 = ta8Var.e(i2 + 1) - ta8Var.e(i2);
        if (jE2 > 0) {
            n31Var.accept(new o81(listH, jE, jE2));
        }
    }

    public static final b26 B(Object... objArr) {
        return new b26(2, ew.a1(objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(defpackage.ta8 r12, defpackage.bb8 r13, defpackage.n31 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.k()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.e(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.k()
            if (r4 >= r2) goto L51
            java.util.List r7 = r12.h(r0)
            long r2 = r12.e(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L51
            long r8 = r13.b
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            o81 r6 = new o81
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.k()
            if (r3 >= r6) goto L5f
            A(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            A(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            o81 r6 = new o81
            java.util.List r7 = r12.h(r0)
            long r8 = r12.e(r4)
            long r12 = r12.e(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja1.C(ta8, bb8, n31):void");
    }

    public static final o38 E(MotionSchemeKeyTokens motionSchemeKeyTokens, qz0 qz0Var) {
        dz4 dz4Var = (dz4) qz0Var.j(lk4.a);
        int iOrdinal = motionSchemeKeyTokens.ordinal();
        if (iOrdinal == 0) {
            ((cz4) dz4Var).getClass();
            o38 o38Var = cz4.b;
            js3.n(o38Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return o38Var;
        }
        if (iOrdinal == 1) {
            ((cz4) dz4Var).getClass();
            o38 o38Var2 = cz4.c;
            js3.n(o38Var2, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return o38Var2;
        }
        if (iOrdinal == 2) {
            ((cz4) dz4Var).getClass();
            o38 o38Var3 = cz4.d;
            js3.n(o38Var3, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return o38Var3;
        }
        if (iOrdinal == 3) {
            ((cz4) dz4Var).getClass();
            o38 o38Var4 = cz4.e;
            js3.n(o38Var4, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return o38Var4;
        }
        if (iOrdinal == 4) {
            ((cz4) dz4Var).getClass();
            o38 o38Var5 = cz4.f;
            js3.n(o38Var5, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return o38Var5;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        ((cz4) dz4Var).getClass();
        o38 o38Var6 = cz4.g;
        js3.n(o38Var6, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return o38Var6;
    }

    public static final ne0 a(float f2, long j2) {
        return new ne0(f2, new k18(j2));
    }

    public static final l b(Object obj) {
        if (obj == null) {
            obj = vy2.f;
        }
        return new l(obj);
    }

    public static final void c(hx4 hx4Var, PlayerMovieData playerMovieData, wd6 wd6Var, String str, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2, int i3) {
        hx4 hx4Var2;
        int i4;
        dp2 dp2Var3;
        int i5;
        int i6;
        wd6 wd6Var2;
        dp2 dp2Var4;
        dp2 dp2Var5;
        dp2 dp2Var6;
        int i7;
        dp2 dp2Var7;
        boolean z;
        qz0 qz0Var2 = qz0Var;
        cb0 cb0Var = eq.g;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(wd6Var, "playerControllerState");
        js3.p(str, "topBarTitle");
        qz0Var2.c0(1263067484);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            hx4Var2 = hx4Var;
        } else if ((i2 & 6) == 0) {
            hx4Var2 = hx4Var;
            i4 = i2 | (qz0Var2.f(hx4Var2) ? 4 : 2);
        } else {
            hx4Var2 = hx4Var;
            i4 = i2;
        }
        int i9 = i4 | (qz0Var2.h(playerMovieData) ? 32 : 16) | (qz0Var2.f(wd6Var) ? 256 : 128) | (qz0Var2.f(str) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
            dp2Var3 = dp2Var;
        } else {
            dp2Var3 = dp2Var;
            i5 = i9 | (qz0Var2.h(dp2Var3) ? 16384 : 8192);
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i6 = i5 | 196608;
        } else {
            i6 = i5 | (qz0Var2.h(dp2Var2) ? 131072 : 65536);
        }
        int i12 = i6;
        if (qz0Var2.R(i12 & 1, (74899 & i12) != 74898)) {
            ex4 ex4Var = ex4.b;
            hx4 hx4Var3 = i8 != 0 ? ex4Var : hx4Var2;
            av avVar = jz0.a;
            if (i10 != 0) {
                Object objM = qz0Var2.M();
                if (objM == avVar) {
                    objM = new sm5(19);
                    qz0Var2.l0(objM);
                }
                dp2Var5 = (dp2) objM;
            } else {
                dp2Var5 = dp2Var3;
            }
            if (i11 != 0) {
                Object objM2 = qz0Var2.M();
                if (objM2 == avVar) {
                    objM2 = new sm5(20);
                    qz0Var2.l0(objM2);
                }
                dp2Var6 = (dp2) objM2;
            } else {
                dp2Var6 = dp2Var2;
            }
            hx4 hx4VarD = hx4Var3.d(b.c);
            long j2 = zu0.g;
            hx4 hx4VarF = rq4.f(hx4VarD, j2, tt3.d);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j3 = qz0Var2.T;
            int i13 = (int) (j3 ^ (j3 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarF);
            hz0.d0.getClass();
            hx4 hx4Var4 = hx4Var3;
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var2, qp2Var, cl4VarD);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i13);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var8 = d.h;
            ia7.n(qz0Var2, dp2Var8);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            hx4 hx4VarC2 = b.c(ex4Var, 1.0f);
            cb0 cb0Var2 = eq.d;
            dp2 dp2Var9 = dp2Var6;
            ng0 ng0Var = ng0.a;
            hx4 hx4VarA = ng0Var.a(hx4VarC2, cb0Var2);
            dp2 dp2Var10 = dp2Var5;
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
            long j4 = qz0Var2.T;
            int i14 = (int) (j4 ^ (j4 >>> 32));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC3 = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, qp2Var, vv0VarA);
            ia7.o(qz0Var2, qp2Var2, j56VarL2);
            ia7.g(qz0Var2, Integer.valueOf(i14), qp2Var3);
            ia7.n(qz0Var2, dp2Var8);
            ia7.o(qz0Var2, qp2Var4, hx4VarC3);
            int i15 = i12 >> 6;
            l87.c(null, str, dp2Var10, qz0Var2, i15 & 1008, 1);
            String str2 = playerMovieData.a.g;
            if (str2 == null) {
                qz0Var2.a0(-821534444);
                qz0Var2.q(false);
                wd6Var2 = wd6Var;
                dp2Var7 = dp2Var9;
                i7 = i12;
            } else {
                qz0Var2.a0(-821534443);
                i7 = i12;
                tt3.e(null, str2, wd6Var, dp2Var9, qz0Var2, (i7 & 896) | (i15 & 7168));
                wd6Var2 = wd6Var;
                dp2Var7 = dp2Var9;
                qz0Var2.q(false);
            }
            qz0Var2.q(true);
            if (wd6Var2.d) {
                qz0Var2.a0(308256679);
                hx4 hx4VarA2 = ng0Var.a(ex4Var, cb0Var);
                boolean z2 = (458752 & i7) == 131072;
                Object objM3 = qz0Var2.M();
                if (z2 || objM3 == avVar) {
                    objM3 = new ba(11, dp2Var7);
                    qz0Var2.l0(objM3);
                }
                z = false;
                l87.a(hx4VarA2, (bp2) objM3, qz0Var2, 0);
                qz0Var2.q(false);
            } else {
                z = false;
                if (wd6Var2.c) {
                    qz0Var2.a0(308446275);
                    rq4.b(ng0Var.a(ex4Var, cb0Var), qz0Var2, 0);
                    qz0Var2.q(false);
                } else {
                    qz0Var2.a0(308553876);
                    ir.myket.player.ui.client.controllers.common.a.b(ng0Var.a(ex4Var, cb0Var), wd6Var2.h, qz0Var2, 64, 0);
                    qz0Var2.q(false);
                }
            }
            hx4 hx4VarA3 = ng0Var.a(ex4Var, eq.i);
            wy5 wy5Var = ci0.a;
            Object objJ = qz0Var2.j(uj8.a);
            js3.m(objJ);
            boolean z3 = z;
            dp2 dp2Var11 = dp2Var7;
            bi0 bi0VarA = ci0.a(j2, ((tj8) objJ).j, 0L, 0L, qz0Var, 12);
            float fQ = ml9.q(hq6.space_24, qz0Var);
            wy5 wy5Var2 = new wy5(fQ, fQ, fQ, fQ);
            if ((i7 & 57344) == 16384) {
                z3 = true;
            }
            Object objM4 = qz0Var.M();
            if (z3 || objM4 == avVar) {
                objM4 = new ba(12, dp2Var10);
                qz0Var.l0(objM4);
            }
            androidx.compose.material3.a.a((bp2) objM4, hx4VarA3, false, null, bi0VarA, null, null, wy5Var2, yh0.i, qz0Var, 805306368, 364);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
            dp2Var3 = dp2Var10;
            dp2Var4 = dp2Var11;
            hx4Var2 = hx4Var4;
        } else {
            wd6Var2 = wd6Var;
            qz0Var2.U();
            dp2Var4 = dp2Var2;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new vw(hx4Var2, playerMovieData, wd6Var2, str, dp2Var3, dp2Var4, i2, i3, 2);
        }
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final int f(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void g(n94 n94Var, dq2 dq2Var, Executor executor) {
        n94Var.e(new g6(14, n94Var, dq2Var, false), executor);
    }

    public static final jn3 h(c cVar, float f2, float f3, in3 in3Var, qz0 qz0Var) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = new jn3(cVar, fValueOf, fValueOf2, in3Var);
            qz0Var.l0(objM);
        }
        jn3 jn3Var = (jn3) objM;
        boolean zH = qz0Var.h(in3Var);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == avVar) {
            objM2 = new pp(fValueOf, jn3Var, fValueOf2, in3Var, 2);
            qz0Var.l0(objM2);
        }
        zk8.k((bp2) objM2, qz0Var);
        boolean zH2 = qz0Var.h(cVar);
        Object objM3 = qz0Var.M();
        if (zH2 || objM3 == avVar) {
            objM3 = new m(cVar, jn3Var, 24);
            qz0Var.l0(objM3);
        }
        zk8.d(jn3Var, (dp2) objM3, qz0Var);
        return jn3Var;
    }

    public static final void i(dp2 dp2Var, Object obj, w61 w61Var) {
        UndeliveredElementException undeliveredElementException = null;
        try {
            dp2Var.invoke(obj);
        } catch (Throwable th) {
            undeliveredElementException = new UndeliveredElementException(o40.x(obj, "Exception in undelivered element handler for "), th);
        }
        if (undeliveredElementException != null) {
            is3.w(w61Var, undeliveredElementException);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (defpackage.ml9.l(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap j(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, defpackage.dy7 r10, coil3.size.Scale r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = defpackage.fz.n(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            dy7 r5 = defpackage.dy7.c
            long r4 = defpackage.ml9.k(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = defpackage.ml9.l(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = defpackage.s29.b(r8)
            r0 = 512(0x200, float:7.17E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = defpackage.s29.a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            dy7 r4 = defpackage.dy7.c
            long r4 = defpackage.ml9.k(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = defpackage.ml9.l(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = defpackage.ok4.T(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = defpackage.ok4.T(r10)
            if (r9 == 0) goto L86
            boolean r11 = defpackage.fz.n(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja1.j(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, dy7, coil3.size.Scale, boolean):android.graphics.Bitmap");
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = q69.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = p69.d;
        p69 p69Var = (p69) view.getTag(xr6.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (p69Var == null) {
            p69Var = new p69();
            p69Var.a = null;
            p69Var.b = null;
            p69Var.c = null;
            view.setTag(xr6.tag_unhandled_key_event_manager, p69Var);
        }
        WeakReference weakReference2 = p69Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        p69Var.c = new WeakReference(keyEvent);
        if (p69Var.b == null) {
            p69Var.b = new SparseArray();
        }
        SparseArray sparseArray = p69Var.b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(xr6.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw rm7.l(size, arrayList);
    }

    public static boolean m(cy3 cy3Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (cy3Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return cy3Var.t(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity2 = (Activity) callback;
                activity2.onUserInteraction();
                Window window = activity2.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity2.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!t) {
                            try {
                                u = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            t = true;
                        }
                        Method method = u;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (q69.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity2, decorView != null ? decorView.getKeyDispatcherState() : null, activity2);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!v) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        w = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    v = true;
                }
                Field field = w;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (q69.d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && q69.d(view, keyEvent)) || cy3Var.t(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static wi5 o(fj5 fj5Var) {
        return (wi5) mo7.u(mo7.s(new i25(26), fj5Var));
    }

    public static int p(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static ColorStateList q(Context context, sk6 sk6Var, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) sk6Var.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) ? sk6Var.t(i2) : colorStateList;
    }

    public static ColorStateList r(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public static int s(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Object t(Future future) {
        Object obj;
        wn5.q(future, "Future was expected to be done: %s", future.isDone());
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Drawable v(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableV;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableV = rf0.v(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableV;
    }

    public static boolean w() {
        try {
            if (AndroidComposeView.h1 == null) {
                AndroidComposeView.h1 = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.i1 == null) {
                Class cls = AndroidComposeView.h1;
                AndroidComposeView.i1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.i1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return js3.i(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int x(Context context, int i2) {
        if (i2 == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, yt6.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(yt6.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(yt6.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static ij3 y(Object obj) {
        return obj == null ? ij3.b : new ij3(obj);
    }

    public static boolean z(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public abstract void D(ArrayList arrayList);

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        return k(obj);
    }

    public Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objN = n(obj);
        objN.getClass();
        return objN;
    }

    public abstract Object n(Object obj);
}
