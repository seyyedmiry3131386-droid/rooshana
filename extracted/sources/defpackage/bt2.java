package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import androidx.datastore.core.DirectBootUsageException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.b;
import kotlinx.coroutines.c;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bt2 implements dn7 {
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData};
    public static final int[] f = new int[0];
    public static final long[] g = new long[0];
    public static final Object[] h = new Object[0];
    public static final av i = new av(14);
    public static final jh j = new jh(1000);
    public static final jh k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public final /* synthetic */ int a;

    static {
        new jh(1007);
        k = new jh(1008);
        new jh(1002);
    }

    public /* synthetic */ bt2(int i2) {
        this.a = i2;
    }

    public static final int A(no7 no7Var, pu3 pu3Var, String str, String str2) {
        js3.p(no7Var, "<this>");
        js3.p(pu3Var, "json");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "suffix");
        int iZ = z(no7Var, pu3Var, str);
        if (iZ != -3) {
            return iZ;
        }
        throw new SerializationException(no7Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static long B(byte b2, byte b3) {
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        return ((long) i2) * ((long) (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? 10000 << (i5 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    public static final boolean C(pu3 pu3Var, no7 no7Var) {
        js3.p(no7Var, "<this>");
        js3.p(pu3Var, "json");
        if (pu3Var.a.b) {
            return true;
        }
        List annotations = no7Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof sv3) {
                return true;
            }
        }
        return false;
    }

    public static final c24 D(Class cls) {
        return a.b(LazyThreadSafetyMode.a, new hk3(5, cls));
    }

    public static final boolean E(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final li1 F(e71 e71Var, w61 w61Var, CoroutineStart coroutineStart, qp2 qp2Var) {
        li1 li1Var;
        w61 w61VarP = ct2.p(e71Var, w61Var);
        coroutineStart.getClass();
        if (coroutineStart == CoroutineStart.b) {
            li1Var = new g44(w61VarP, qp2Var);
        } else {
            li1Var = new li1(w61VarP, true, 1);
        }
        li1Var.m0(coroutineStart, li1Var, qp2Var);
        return li1Var;
    }

    public static /* synthetic */ li1 G(e71 e71Var, w61 w61Var, CoroutineStart coroutineStart, qp2 qp2Var, int i2) {
        if ((i2 & 1) != 0) {
            w61Var = EmptyCoroutineContext.a;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.a;
        }
        return F(e71Var, w61Var, coroutineStart, qp2Var);
    }

    public static w61 H(u61 u61Var, v61 v61Var) {
        js3.p(v61Var, "key");
        return js3.i(u61Var.getKey(), v61Var) ? EmptyCoroutineContext.a : u61Var;
    }

    public static final void I(pu3 pu3Var, no7 no7Var) {
        js3.p(no7Var, "<this>");
        js3.p(pu3Var, "json");
        js3.i(no7Var.getKind(), g98.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static jx9 J(byte[] bArr) {
        UUID[] uuidArr;
        h26 h26Var = new h26(bArr);
        if (h26Var.c < 32) {
            return null;
        }
        h26Var.J(0);
        int iA = h26Var.a();
        int iJ = h26Var.j();
        if (iJ != iA) {
            wn5.k0("PsshAtomUtil", "Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
            return null;
        }
        int iJ2 = h26Var.j();
        if (iJ2 != 1886614376) {
            o40.E(iJ2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = lg0.e(h26Var.j());
        if (iE > 1) {
            o40.E(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(h26Var.r(), h26Var.r());
        if (iE == 1) {
            int iB = h26Var.B();
            uuidArr = new UUID[iB];
            for (int i2 = 0; i2 < iB; i2++) {
                uuidArr[i2] = new UUID(h26Var.r(), h26Var.r());
            }
        } else {
            uuidArr = null;
        }
        int iB2 = h26Var.B();
        int iA2 = h26Var.a();
        if (iB2 == iA2) {
            ?? r2 = new byte[iB2];
            h26Var.h(r2, 0, iB2);
            return new jx9(uuid, iE, r2, uuidArr);
        }
        wn5.k0("PsshAtomUtil", "Atom data size (" + iB2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] K(UUID uuid, byte[] bArr) {
        jx9 jx9VarJ = J(bArr);
        if (jx9VarJ == null) {
            return null;
        }
        UUID uuid2 = (UUID) jx9VarJ.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) jx9VarJ.c;
        }
        wn5.k0("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static w61 L(u61 u61Var, w61 w61Var) {
        js3.p(w61Var, "context");
        return w61Var == EmptyCoroutineContext.a ? u61Var : (w61) w61Var.J(new sy0(4), u61Var);
    }

    public static int O(ao0 ao0Var, int i2, int i3, int i4) {
        vy2.j(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        dt2.f(dt2.f(i5, i6), 1 << i4);
        if (ao0Var.b() < i2) {
            return -1;
        }
        int i7 = ao0Var.i(i2);
        if (i7 == i5) {
            if (ao0Var.b() < i3) {
                return -1;
            }
            int i8 = ao0Var.i(i3);
            i7 += i8;
            if (i8 == i6) {
                if (ao0Var.b() < i4) {
                    return -1;
                }
                return ao0Var.i(i4) + i7;
            }
        }
        return i7;
    }

    public static int P(int i2, h26 h26Var) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return h26Var.x() + 1;
            case 7:
                return h26Var.D() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static final Object Q(w61 w61Var, qp2 qp2Var) throws Throwable {
        g42 g42VarA;
        w61 w61VarI;
        long jU0;
        Thread threadCurrentThread = Thread.currentThread();
        v61 v61Var = eq.u;
        i51 i51Var = (i51) w61Var.r0(v61Var);
        if (i51Var == null) {
            g42VarA = tk8.a();
            w61VarI = ct2.i(EmptyCoroutineContext.a, w61Var.l0(g42VarA), true);
            ug1 ug1Var = up1.a;
            if (w61VarI != ug1Var && w61VarI.r0(v61Var) == null) {
                w61VarI = w61VarI.l0(ug1Var);
            }
        } else {
            if (i51Var instanceof g42) {
            }
            g42VarA = (g42) tk8.a.get();
            w61VarI = ct2.i(EmptyCoroutineContext.a, w61Var, true);
            ug1 ug1Var2 = up1.a;
            if (w61VarI != ug1Var2 && w61VarI.r0(v61Var) == null) {
                w61VarI = w61VarI.l0(ug1Var2);
            }
        }
        dd0 dd0Var = new dd0(w61VarI, threadCurrentThread, g42VarA);
        dd0Var.m0(CoroutineStart.a, dd0Var, qp2Var);
        g42 g42Var = dd0Var.e;
        if (g42Var != null) {
            int i2 = g42.f;
            g42Var.R0(false);
        }
        while (true) {
            if (g42Var != null) {
                try {
                    jU0 = g42Var.U0();
                } catch (Throwable th) {
                    if (g42Var != null) {
                        int i3 = g42.f;
                        g42Var.H0(false);
                    }
                    throw th;
                }
            } else {
                jU0 = Long.MAX_VALUE;
            }
            if (dd0Var.T()) {
                break;
            }
            LockSupport.parkNanos(dd0Var, jU0);
            if (Thread.interrupted()) {
                dd0Var.t(new InterruptedException());
            }
        }
        if (g42Var != null) {
            int i4 = g42.f;
            g42Var.H0(false);
        }
        Object objN0 = at2.n0(c.a.get(dd0Var));
        rx0 rx0Var = objN0 instanceof rx0 ? (rx0) objN0 : null;
        if (rx0Var == null) {
            return objN0;
        }
        throw rx0Var.a;
    }

    public static final void S(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void T(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static void V(ao0 ao0Var) {
        ao0Var.t(3);
        ao0Var.t(8);
        boolean zH = ao0Var.h();
        boolean zH2 = ao0Var.h();
        if (zH) {
            ao0Var.t(5);
        }
        if (zH2) {
            ao0Var.t(6);
        }
    }

    public static void W(ao0 ao0Var) {
        int i2;
        int i3 = ao0Var.i(2);
        if (i3 == 0) {
            ao0Var.t(6);
            return;
        }
        int iO = O(ao0Var, 5, 8, 16) + 1;
        if (i3 == 1) {
            ao0Var.t(iO * 7);
            return;
        }
        if (i3 == 2) {
            boolean zH = ao0Var.h();
            int i4 = zH ? 1 : 5;
            int i5 = zH ? 7 : 5;
            int i6 = zH ? 8 : 6;
            int i7 = 0;
            while (i7 < iO) {
                if (ao0Var.h()) {
                    ao0Var.t(7);
                    i2 = 0;
                } else {
                    if (ao0Var.i(2) == 3 && ao0Var.i(i5) * i4 != 0) {
                        ao0Var.s();
                    }
                    i2 = ao0Var.i(i6) * i4;
                    if (i2 != 0 && i2 != 180) {
                        ao0Var.s();
                    }
                    ao0Var.s();
                }
                if (i2 != 0 && i2 != 180 && ao0Var.h()) {
                    i7++;
                }
                i7++;
            }
        }
    }

    public static final String X(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final long Y(long j2, long j3) {
        int iE;
        int iG = zi8.g(j2);
        int iF = zi8.f(j2);
        if ((zi8.g(j3) < zi8.f(j2)) && (zi8.g(j2) < zi8.f(j3))) {
            if (zi8.a(j3, j2)) {
                iG = zi8.g(j3);
                iF = iG;
            } else {
                if (zi8.a(j2, j3)) {
                    iE = zi8.e(j3);
                } else {
                    int iG2 = zi8.g(j3);
                    if (iG >= zi8.f(j3) || iG2 > iG) {
                        iF = zi8.g(j3);
                    } else {
                        iG = zi8.g(j3);
                        iE = zi8.e(j3);
                    }
                }
                iF -= iE;
            }
        } else if (iF > zi8.g(j3)) {
            iG -= zi8.e(j3);
            iE = zi8.e(j3);
            iF -= iE;
        }
        return uy6.b(iG, iF);
    }

    public static final Object Z(w61 w61Var, qp2 qp2Var, g51 g51Var) throws Throwable {
        Object objN0;
        w61 context = g51Var.getContext();
        w61 w61VarL0 = !((Boolean) w61Var.J(new sy0(5), Boolean.FALSE)).booleanValue() ? context.l0(w61Var) : ct2.i(context, w61Var, false);
        kotlinx.coroutines.a.f(w61VarL0);
        if (w61VarL0 == context) {
            mf7 mf7Var = new mf7(g51Var, w61VarL0);
            objN0 = b47.u(mf7Var, true, mf7Var, qp2Var);
        } else {
            eq eqVar = eq.u;
            if (js3.i(w61VarL0.r0(eqVar), context.r0(eqVar))) {
                ox8 ox8Var = new ox8(g51Var, w61VarL0);
                w61 w61Var2 = ox8Var.c;
                Object objP = is3.P(w61Var2, null);
                try {
                    Object objU = b47.u(ox8Var, true, ox8Var, qp2Var);
                    is3.H(w61Var2, objP);
                    objN0 = objU;
                } catch (Throwable th) {
                    is3.H(w61Var2, objP);
                    throw th;
                }
            } else {
                b bVar = new b(g51Var, w61VarL0);
                try {
                    dy3.K(ok4.I(ok4.x(bVar, bVar, qp2Var)), tx8.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b.e;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(bVar);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objN0 = at2.n0(c.a.get(bVar));
                            if (objN0 instanceof rx0) {
                                throw ((rx0) objN0).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(bVar, 0, 1)) {
                            objN0 = CoroutineSingletons.a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).a;
                    }
                    bVar.resumeWith(kotlin.b.a(th));
                    throw th;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objN0;
    }

    public static final Exception a0(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean zEquals = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                js3.o(method, "getMethod(...)");
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    js3.o(parcelObtain, "obtain(...)");
                    Process.myUserHandle().writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    i2 = parcelObtain.readInt();
                } catch (Throwable unused) {
                    i2 = 0;
                }
                Object objInvoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
                js3.n(objInvoke, "null cannot be cast to non-null type kotlin.String");
                zEquals = ((String) objInvoke).equals("true");
            } catch (Throwable th) {
                wu8.f(fileNotFoundException, th);
                zEquals = false;
            }
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new DirectBootUsageException(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void b(hx4 hx4Var, qx6 qx6Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        js3.p(qx6Var, "recommendationMovie");
        qz0Var.c0(-2035022101);
        int i3 = i2 | 6 | (qz0Var.h(qx6Var) ? 32 : 16) | (qz0Var.h(dp2Var) ? 256 : 128);
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            float fQ = ml9.q(hq6.movie_card_width, qz0Var);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarL = androidx.compose.foundation.layout.b.l(ex4Var, fQ);
            long j2 = zu0.g;
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            zm0 zm0VarK = rf0.k(j2, ((tj8) objJ).j, qz0Var, 6, 12);
            uc3 uc3Var = tt3.d;
            boolean zH = qz0Var.h(qx6Var) | ((i3 & 896) == 256);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new i05(qx6Var, dp2Var, 0);
                qz0Var.l0(objM);
            }
            m91.a((bp2) objM, hx4VarL, false, uc3Var, zm0VarK, null, s7.X(1993800352, new j05(qx6Var, 0), qz0Var), qz0Var, 100666368);
            hx4Var2 = ex4Var;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new k05(hx4Var2, qx6Var, dp2Var, i2, 0);
        }
    }

    public static final void c(lk5 lk5Var, boolean z, bp2 bp2Var, bp2 bp2Var2, qz0 qz0Var, int i2) {
        bp2 bp2Var3;
        qz0Var.c0(1220469155);
        int i3 = (qz0Var.f(lk5Var) ? 4 : 2) | i2 | (qz0Var.g(z) ? 32 : 16) | 384 | (qz0Var.h(bp2Var2) ? 2048 : 1024);
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = new v7(27);
                qz0Var.l0(objM);
            }
            bp2 bp2Var4 = (bp2) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new v7(27);
                qz0Var.l0(objM2);
            }
            bp2 bp2Var5 = (bp2) objM2;
            Object objM3 = qz0Var.M();
            if (objM3 == avVar) {
                objM3 = new v7(27);
                qz0Var.l0(objM3);
            }
            int i4 = (i3 & 14) | 3504;
            int i5 = i3 << 9;
            e(lk5Var, false, bp2Var5, (bp2) objM3, z, bp2Var4, bp2Var2, qz0Var, (i5 & 3670016) | i4 | (57344 & i5) | 196608);
            bp2Var3 = bp2Var4;
        } else {
            qz0Var.U();
            bp2Var3 = bp2Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new vx2(lk5Var, z, bp2Var3, bp2Var2, i2);
        }
    }

    public static final void e(final lk5 lk5Var, final boolean z, final bp2 bp2Var, final bp2 bp2Var2, final boolean z2, final bp2 bp2Var3, final bp2 bp2Var4, qz0 qz0Var, final int i2) {
        int i3;
        qz0Var.c0(898330592);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(lk5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var.h(bp2Var3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var.h(bp2Var4) ? 1048576 : 524288;
        }
        if (qz0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            dk5 dk5VarA = pc4.a(qz0Var);
            if (dk5VarA == null) {
                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
            }
            Object objA = dk5VarA.a();
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (z3 || objM == obj) {
                objM = new cz0((ik5) ((s08) lk5Var.c).getValue(), new z45(6, lk5Var));
                qz0Var.l0(objM);
            }
            final cz0 cz0Var = (cz0) objM;
            boolean zH = ((i3 & 3670016) == 1048576) | ((57344 & i3) == 16384) | qz0Var.h(cz0Var) | ((458752 & i3) == 131072) | (i4 == 4);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == obj) {
                Object obj2 = new bp2() { // from class: fk5
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        kk5 kk5Var;
                        kk5 kk5Var2;
                        cz0 cz0Var2 = cz0Var;
                        boolean z4 = cz0Var2.f;
                        boolean z5 = z;
                        if (z4 != z5) {
                            cz0Var2.f = z5;
                            ai0 ai0Var = cz0Var2.g;
                            if (ai0Var != null && (kk5Var2 = (kk5) ai0Var.c) != null) {
                                kk5Var2.b();
                            }
                        }
                        cz0Var2.i = bp2Var;
                        cz0Var2.i(z2);
                        cz0Var2.j = bp2Var3;
                        cz0Var2.k = bp2Var4;
                        lk5 lk5Var2 = lk5Var;
                        ik5 ik5Var = (ik5) ((s08) lk5Var2.c).getValue();
                        List list = (List) ((s08) lk5Var2.b).getValue();
                        List list2 = (List) ((s08) lk5Var2.d).getValue();
                        js3.p(ik5Var, "currentInfo");
                        js3.p(list, "backInfo");
                        js3.p(list2, "forwardInfo");
                        cz0Var2.a = ik5Var;
                        cz0Var2.b = list;
                        cz0Var2.c = list2;
                        ai0 ai0Var2 = cz0Var2.g;
                        if (ai0Var2 != null && (kk5Var = (kk5) ai0Var2.c) != null) {
                            kk5Var.d(cz0Var2);
                        }
                        return tx8.a;
                    }
                };
                qz0Var.l0(obj2);
                objM2 = obj2;
            }
            zk8.k((bp2) objM2, qz0Var);
            boolean zH2 = qz0Var.h(cz0Var) | (i4 == 4) | qz0Var.h(objA);
            Object objM3 = qz0Var.M();
            if (zH2 || objM3 == obj) {
                objM3 = new vt(lk5Var, cz0Var, objA, 17);
                qz0Var.l0(objM3);
            }
            zk8.d(lk5Var, (dp2) objM3, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: gk5
                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    bt2.e(lk5Var, z, bp2Var, bp2Var2, z2, bp2Var3, bp2Var4, (qz0) obj3, hs9.W(i2 | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final hx4 f(hx4 hx4Var, iz izVar) {
        return hx4Var.d(new ec(izVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x06f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(defpackage.g31 r39, defpackage.l74 r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt2.g(g31, l74, java.util.ArrayList, int):void");
    }

    public static li1 h(e71 e71Var, w61 w61Var, qp2 qp2Var, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            w61Var = EmptyCoroutineContext.a;
        }
        CoroutineStart coroutineStart = CoroutineStart.a;
        w61 w61VarP = ct2.p(e71Var, w61Var);
        CoroutineStart coroutineStart2 = CoroutineStart.a;
        li1 li1Var = new li1(w61VarP, z, 0);
        li1Var.m0(coroutineStart, li1Var, qp2Var);
        return li1Var;
    }

    public static final int i(int i2, int i3, int[] iArr) {
        js3.p(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int j(int i2, long j2, long[] jArr) {
        js3.p(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static ArrayList k(byte[] bArr) {
        long j2 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static byte[] l(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean p(h26 h26Var, ud2 ud2Var, int i2, sd2 sd2Var) {
        long jZ = h26Var.z();
        long j2 = jZ >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((jZ >> 12) & 15);
        int i4 = (int) ((jZ >> 8) & 15);
        int i5 = (int) ((jZ >> 4) & 15);
        int i6 = (int) ((jZ >> 1) & 7);
        boolean z2 = (jZ & 1) == 1;
        if (i5 <= 7) {
            if (i5 != ud2Var.g - 1) {
                return false;
            }
        } else if (i5 > 10 || ud2Var.g != 2) {
            return false;
        }
        if (!(i6 == 0 || i6 == ud2Var.i) || z2) {
            return false;
        }
        try {
            long jE = h26Var.E();
            if (!z) {
                jE *= (long) ud2Var.b;
            }
            sd2Var.a = jE;
            int iP = P(i3, h26Var);
            if (iP == -1 || iP > ud2Var.b) {
                return false;
            }
            int i7 = ud2Var.e;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != ud2Var.f) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int iD = h26Var.D();
                    if (i4 == 14) {
                        iD *= 10;
                    }
                    if (iD != i7) {
                        return false;
                    }
                } else if (h26Var.x() * 1000 != i7) {
                    return false;
                }
            }
            int iX = h26Var.x();
            int i8 = h26Var.b;
            byte[] bArr = h26Var.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = h26Var.b; i11 < i9; i11++) {
                i10 = j29.l[i10 ^ (bArr[i11] & 255)];
            }
            String str = j29.a;
            return iX == i10;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int q(int i2, Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        int iCheckOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(str, Binder.getCallingUid(), str2);
        if (iCheckOpNoThrow != 0) {
            return iCheckOpNoThrow;
        }
        String strY = te.y(context);
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, strY);
    }

    public static final void r(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(rm7.n(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static int s(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == iMyUid && Objects.equals(context.getPackageName(), packageName)) ? q(iMyUid, context, strPermissionToOp, packageName) : ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static u61 x(u61 u61Var, v61 v61Var) {
        js3.p(v61Var, "key");
        if (js3.i(u61Var.getKey(), v61Var)) {
            return u61Var;
        }
        return null;
    }

    public static final Object y(Class cls) {
        ps0 ps0VarA = g27.a(cls);
        mz3 mz3Var = eq.B;
        if (mz3Var != null) {
            return ((lf7) mz3Var.c.e).b(ps0VarA, null, null);
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final int z(no7 no7Var, pu3 pu3Var, String str) {
        js3.p(no7Var, "<this>");
        js3.p(pu3Var, "json");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        I(pu3Var, no7Var);
        int iD = no7Var.d(str);
        if (iD != -3 || !pu3Var.a.g) {
            return iD;
        }
        ql4 ql4Var = pu3Var.c;
        xv3 xv3Var = new xv3(no7Var, pu3Var, 0);
        ql4Var.getClass();
        av avVar = i;
        Object objD = ql4Var.D(no7Var, avVar);
        if (objD == null) {
            objD = xv3Var.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ql4Var.b;
            Object concurrentHashMap2 = concurrentHashMap.get(no7Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(no7Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(avVar, objD);
        }
        Integer num = (Integer) ((Map) objD).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public abstract void M(o0 o0Var, o0 o0Var2);

    public abstract void N(o0 o0Var, Thread thread);

    public abstract boolean m(com.google.common.util.concurrent.b bVar, d0 d0Var, d0 d0Var2);

    public abstract boolean n(com.google.common.util.concurrent.b bVar, Object obj, Object obj2);

    public abstract boolean o(com.google.common.util.concurrent.b bVar, o0 o0Var, o0 o0Var2);

    public String toString() {
        switch (this.a) {
            case 9:
                return ck4.A(this);
            default:
                return super.toString();
        }
    }

    public abstract d0 v(com.google.common.util.concurrent.b bVar);

    public abstract o0 w(com.google.common.util.concurrent.b bVar);
}
