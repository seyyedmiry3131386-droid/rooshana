package defpackage;

import android.R;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.compose.runtime.g;
import androidx.lifecycle.Lifecycle$Event;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.SerializationException;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class at2 implements q12, uz0 {
    public static final /* synthetic */ int A = 0;
    public static final /* synthetic */ int B = 0;
    public static final /* synthetic */ int C = 0;
    public static final mu3 l;
    public static final mu3 m;
    public static final mu3 n;
    public static final mu3 o;
    public static final mu3 p;
    public static final mu3 q;
    public static final /* synthetic */ int z = 0;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final x02 r = new x02(false);
    public static final x02 s = new x02(true);
    public static final px3[] t = new px3[0];
    public static final Object u = new Object();
    public static final Object v = new Object();
    public static final Object w = new Object();
    public static final Object x = new Object();
    public static final Object y = new Object();

    static {
        int i2 = 1;
        l = new mu3("CLOSED", i2);
        m = new mu3("COMPLETING_ALREADY", i2);
        n = new mu3("COMPLETING_WAITING_CHILDREN", i2);
        o = new mu3("COMPLETING_RETRY", i2);
        p = new mu3("TOO_LATE_TO_CANCEL", i2);
        q = new mu3("SEALED", i2);
    }

    public static final void E(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public static final void F(Lifecycle$Event lifecycle$Event, g64 g64Var, bp2 bp2Var, qz0 qz0Var, int i2) {
        qz0Var.c0(-709389590);
        int i3 = i2 | 16 | (qz0Var.h(bp2Var) ? 256 : 128);
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                g64Var = (g64) qz0Var.j(lc4.a);
            } else {
                qz0Var.U();
            }
            qz0Var.r();
            if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            wb5 wb5VarK = g.k(bp2Var, qz0Var);
            boolean zF = qz0Var.f(wb5VarK) | qz0Var.h(g64Var);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new vt(g64Var, lifecycle$Event, wb5VarK, 12);
                qz0Var.l0(objM);
            }
            zk8.d(g64Var, (dp2) objM, qz0Var);
        } else {
            qz0Var.U();
        }
        g64 g64Var2 = g64Var;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new w8(i2, 5, lifecycle$Event, g64Var2, bp2Var);
        }
    }

    public static final void G(g64 g64Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        qz0Var.c0(1220373486);
        int i3 = i2 | 16;
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                g64Var = (g64) qz0Var.j(lc4.a);
            } else {
                qz0Var.U();
            }
            int i4 = i3 & (-113);
            qz0Var.r();
            boolean zF = qz0Var.f(tx8.a) | qz0Var.f(g64Var);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new l64(g64Var.D());
                qz0Var.l0(objM);
            }
            H(g64Var, (l64) objM, dp2Var, qz0Var, i4 & 896);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new z54(g64Var, dp2Var, i2, 1);
        }
    }

    public static final void H(g64 g64Var, l64 l64Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(912823238);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(g64Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(l64Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = qz0Var.h(l64Var) | ((i3 & 896) == 256) | qz0Var.h(g64Var);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new vt(g64Var, l64Var, dp2Var, 13);
                qz0Var.l0(objM);
            }
            zk8.e(g64Var, l64Var, (dp2) objM, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(g64Var, l64Var, dp2Var, i2, 13);
        }
    }

    public static final void I(g64 g64Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        qz0Var.c0(-1408314671);
        int i3 = i2 | 16;
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                g64Var = (g64) qz0Var.j(lc4.a);
            } else {
                qz0Var.U();
            }
            int i4 = i3 & (-113);
            qz0Var.r();
            boolean zF = qz0Var.f(tx8.a) | qz0Var.f(g64Var);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new p64(g64Var.D());
                qz0Var.l0(objM);
            }
            K(g64Var, (p64) objM, dp2Var, qz0Var, i4 & 896);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new z54(g64Var, dp2Var, i2, 0);
        }
    }

    public static final void J(Boolean bool, Object obj, g64 g64Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(696924721);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (qz0Var.h(obj) ? 32 : 16) | 128 | (qz0Var.h(dp2Var) ? 2048 : 1024);
        if (qz0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                g64Var = (g64) qz0Var.j(lc4.a);
            } else {
                qz0Var.U();
            }
            int i5 = i4 & (-897);
            qz0Var.r();
            boolean zF = qz0Var.f(bool) | qz0Var.f(obj) | qz0Var.f(g64Var);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new p64(g64Var.D());
                qz0Var.l0(objM);
            }
            K(g64Var, (p64) objM, dp2Var, qz0Var, (i5 >> 3) & 896);
        } else {
            qz0Var.U();
        }
        g64 g64Var2 = g64Var;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(bool, obj, g64Var2, dp2Var, i2, 6);
        }
    }

    public static final void K(g64 g64Var, p64 p64Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(228371534);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(g64Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(p64Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = qz0Var.h(p64Var) | ((i3 & 896) == 256) | qz0Var.h(g64Var);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new vt(g64Var, p64Var, dp2Var, 14);
                qz0Var.l0(objM);
            }
            zk8.e(g64Var, p64Var, (dp2) objM, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(g64Var, p64Var, dp2Var, i2, 14);
        }
    }

    public static float L(EdgeEffect edgeEffect, float f2, float f3, qj1 qj1Var) {
        float f4 = dz1.a;
        double density = qj1Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) dz1.a) * density;
        float fExp = (float) (Math.exp((dz1.b / dz1.c) * Math.log(dAbs / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (fExp > (i2 >= 31 ? zc.j(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iV = ok4.V(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(iV);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iV);
        }
        return f2;
    }

    public static void M(long j2, gh0 gh0Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((ByteString) arrayList4.get(i9)).e() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i3);
        ByteString byteString2 = (ByteString) arrayList4.get(i4 - 1);
        if (i8 == byteString.e()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i10);
            i5 = i10;
            i6 = iIntValue;
            byteString = byteString3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (byteString.j(i8) == byteString2.j(i8)) {
            int iMin = Math.min(byteString.e(), byteString2.e());
            int i11 = 0;
            for (int i12 = i8; i12 < iMin && byteString.j(i12) == byteString2.j(i12); i12++) {
                i11++;
            }
            long j4 = 4;
            long j5 = (gh0Var.b / j4) + j2 + ((long) 2) + ((long) i11) + 1;
            gh0Var.a1(-i11);
            gh0Var.a1(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                gh0Var.a1(byteString.j(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 != ((ByteString) arrayList4.get(i5)).e()) {
                    throw new IllegalStateException("Check failed.");
                }
                gh0Var.a1(((Number) arrayList5.get(i5)).intValue());
                return;
            } else {
                gh0 gh0Var2 = new gh0();
                gh0Var.a1(((int) ((gh0Var2.b / j4) + j5)) * (-1));
                M(j5, gh0Var2, i13, arrayList4, i5, i4, arrayList5);
                gh0Var.N0(gh0Var2);
                return;
            }
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((ByteString) arrayList4.get(i15 - 1)).j(i8) != ((ByteString) arrayList4.get(i15)).j(i8)) {
                i14++;
            }
        }
        long j6 = 4;
        long j7 = (gh0Var.b / j6) + j2 + ((long) 2) + ((long) (i14 * 2));
        gh0Var.a1(i14);
        gh0Var.a1(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int iJ = ((ByteString) arrayList4.get(i16)).j(i8);
            if (i16 == i5 || iJ != ((ByteString) arrayList4.get(i16 - 1)).j(i8)) {
                gh0Var.a1(iJ & 255);
            }
        }
        gh0 gh0Var3 = new gh0();
        int i17 = i5;
        while (i17 < i4) {
            byte bJ = ((ByteString) arrayList4.get(i17)).j(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (bJ != ((ByteString) arrayList4.get(i19)).j(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((ByteString) arrayList4.get(i17)).e()) {
                gh0Var.a1(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j7;
                i7 = i19;
            } else {
                gh0Var.a1(((int) ((gh0Var3.b / j6) + j7)) * (-1));
                arrayList3 = arrayList5;
                j3 = j7;
                i7 = i19;
                M(j3, gh0Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j7 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        gh0Var.N0(gh0Var3);
    }

    public static final boolean N(ah6 ah6Var) {
        return (ah6Var.b() || ah6Var.h || !ah6Var.d) ? false : true;
    }

    public static final boolean O(ah6 ah6Var) {
        return !ah6Var.h && ah6Var.d;
    }

    public static final boolean P(ah6 ah6Var) {
        return (ah6Var.b() || !ah6Var.h || ah6Var.d) ? false : true;
    }

    public static final boolean Q(ah6 ah6Var) {
        return ah6Var.h && !ah6Var.d;
    }

    public static float R(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int S(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static Object U(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(rm7.n(i2, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
    }

    public static final ij5 Y(View view) {
        js3.p(view, "view");
        oc2 oc2Var = new oc2(mo7.v(mo7.s(new i25(27), view), new i25(28)));
        ij5 ij5Var = (ij5) (!oc2Var.hasNext() ? null : oc2Var.next());
        if (ij5Var != null) {
            return ij5Var;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final Object Z(wl7 wl7Var, long j2, qp2 qp2Var) {
        while (true) {
            if (wl7Var.c >= j2 && !wl7Var.c()) {
                return wl7Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a11.a;
            Object obj = atomicReferenceFieldUpdater.get(wl7Var);
            mu3 mu3Var = l;
            if (obj == mu3Var) {
                return mu3Var;
            }
            wl7 wl7Var2 = (wl7) ((a11) obj);
            if (wl7Var2 == null) {
                wl7Var2 = (wl7) qp2Var.invoke(Long.valueOf(wl7Var.c + 1), wl7Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(wl7Var, null, wl7Var2)) {
                    if (atomicReferenceFieldUpdater.get(wl7Var) != null) {
                        break;
                    }
                }
                if (wl7Var.c()) {
                    wl7Var.e();
                }
            }
            wl7Var = wl7Var2;
        }
    }

    public static Object a0(Context context) {
        ComponentCallbacks2 componentCallbacks2O = m91.o(context.getApplicationContext());
        boolean z2 = componentCallbacks2O instanceof br2;
        Class<?> cls = componentCallbacks2O.getClass();
        if (z2) {
            return ((br2) componentCallbacks2O).e();
        }
        throw new IllegalArgumentException(bl4.v("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: ", cls));
    }

    public static final lf7 c0(ComponentCallbacks componentCallbacks) {
        js3.p(componentCallbacks, "<this>");
        if (componentCallbacks instanceof rh) {
            return ((rh) componentCallbacks).b();
        }
        if (componentCallbacks instanceof pz3) {
            return (lf7) ((pz3) componentCallbacks).getKoin().c.e;
        }
        mz3 mz3Var = eq.B;
        if (mz3Var != null) {
            return (lf7) mz3Var.c.e;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static SharedPreferences d0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final boolean e0(ah6 ah6Var, long j2, long j3) {
        int i2 = ah6Var.i == 1 ? 1 : 0;
        long j4 = ah6Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static int f0(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static int g0(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    public static mz3 getKoin() {
        mz3 mz3Var = eq.B;
        if (mz3Var != null) {
            return mz3Var;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tv5 h0(okio.ByteString... r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at2.h0(okio.ByteString[]):tv5");
    }

    public static final long i0(ah6 ah6Var, boolean z2) {
        long jF = nr5.f(ah6Var.c, ah6Var.g);
        if (z2 || !ah6Var.b()) {
            return jF;
        }
        return 0L;
    }

    public static int j0(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iB0 = y97.b0(obj);
        int i5 = iB0 & i2;
        int iK0 = k0(i5, obj3);
        if (iK0 != 0) {
            int i6 = ~i2;
            int i7 = iB0 & i6;
            int i8 = -1;
            while (true) {
                i3 = iK0 - 1;
                i4 = iArr[i3];
                if ((i4 & i6) == i7 && s7.l(obj, objArr[i3]) && (objArr2 == null || s7.l(obj2, objArr2[i3]))) {
                    break;
                }
                int i9 = i4 & i2;
                if (i9 == 0) {
                    break;
                }
                i8 = i3;
                iK0 = i9;
            }
            int i10 = i4 & i2;
            if (i8 == -1) {
                l0(i5, i10, obj3);
                return i3;
            }
            iArr[i8] = f0(iArr[i8], i10, i2);
            return i3;
        }
        return -1;
    }

    public static int k0(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void l0(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final h85 m0(l85 l85Var) {
        js3.p(l85Var, "<this>");
        return new h85(l85Var.c, l85Var.d, l85Var.e, l85Var.a, l85Var.b);
    }

    public static final Object n0(Object obj) {
        gm3 gm3Var;
        hm3 hm3Var = obj instanceof hm3 ? (hm3) obj : null;
        return (hm3Var == null || (gm3Var = hm3Var.a) == null) ? obj : gm3Var;
    }

    @Override // defpackage.q12
    public void A(long j2) {
        W(Long.valueOf(j2));
    }

    @Override // defpackage.uz0
    public q12 B(vj6 vj6Var, int i2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        return m(vj6Var.h(i2));
    }

    @Override // defpackage.q12
    public void C(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        W(str);
    }

    @Override // defpackage.q12
    public uz0 D(no7 no7Var, int i2) {
        js3.p(no7Var, "descriptor");
        return c(no7Var);
    }

    public abstract List T(String str, List list);

    public void V(no7 no7Var, int i2) {
        js3.p(no7Var, "descriptor");
    }

    public void W(Object obj) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new SerializationException("Non-serializable " + g27.a(obj.getClass()) + " is not supported by " + g27.a(getClass()) + " encoder");
    }

    public abstract aj0 X(x47 x47Var, Map map);

    @Override // defpackage.uz0
    public void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
    }

    public abstract void b0(us7 us7Var, float f2, float f3);

    @Override // defpackage.q12
    public uz0 c(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this;
    }

    @Override // defpackage.uz0
    public void d(vj6 vj6Var, int i2, double d2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        h(d2);
    }

    @Override // defpackage.q12
    public void e() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // defpackage.uz0
    public boolean f(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return true;
    }

    @Override // defpackage.q12
    public void g(px3 px3Var, Object obj) {
        js3.p(px3Var, "serializer");
        px3Var.serialize(this, obj);
    }

    @Override // defpackage.q12
    public void h(double d2) {
        W(Double.valueOf(d2));
    }

    @Override // defpackage.q12
    public void i(short s2) {
        W(Short.valueOf(s2));
    }

    @Override // defpackage.uz0
    public void j(no7 no7Var, int i2, long j2) {
        js3.p(no7Var, "descriptor");
        V(no7Var, i2);
        A(j2);
    }

    @Override // defpackage.q12
    public void k(byte b2) {
        W(Byte.valueOf(b2));
    }

    @Override // defpackage.q12
    public void l(boolean z2) {
        W(Boolean.valueOf(z2));
    }

    @Override // defpackage.q12
    public q12 m(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this;
    }

    @Override // defpackage.uz0
    public void n(no7 no7Var, int i2, boolean z2) {
        js3.p(no7Var, "descriptor");
        V(no7Var, i2);
        l(z2);
    }

    @Override // defpackage.uz0
    public void o(no7 no7Var, int i2, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "serializer");
        V(no7Var, i2);
        g(px3Var, obj);
    }

    @Override // defpackage.q12
    public void p(float f2) {
        W(Float.valueOf(f2));
    }

    @Override // defpackage.uz0
    public void q(vj6 vj6Var, int i2, byte b2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        k(b2);
    }

    @Override // defpackage.q12
    public void r(char c2) {
        W(Character.valueOf(c2));
    }

    @Override // defpackage.uz0
    public void s(vj6 vj6Var, int i2, float f2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        p(f2);
    }

    @Override // defpackage.q12
    public void t(no7 no7Var, int i2) {
        js3.p(no7Var, "enumDescriptor");
        W(Integer.valueOf(i2));
    }

    @Override // defpackage.uz0
    public void u(vj6 vj6Var, int i2, short s2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        i(s2);
    }

    @Override // defpackage.uz0
    public void v(int i2, int i3, no7 no7Var) {
        js3.p(no7Var, "descriptor");
        V(no7Var, i2);
        y(i3);
    }

    @Override // defpackage.uz0
    public void w(no7 no7Var, int i2, String str) {
        js3.p(no7Var, "descriptor");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        V(no7Var, i2);
        C(str);
    }

    @Override // defpackage.uz0
    public void x(vj6 vj6Var, int i2, char c2) {
        js3.p(vj6Var, "descriptor");
        V(vj6Var, i2);
        r(c2);
    }

    @Override // defpackage.q12
    public void y(int i2) {
        W(Integer.valueOf(i2));
    }

    @Override // defpackage.uz0
    public void z(no7 no7Var, int i2, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "serializer");
        V(no7Var, i2);
        dw1.a(this, px3Var, obj);
    }
}
