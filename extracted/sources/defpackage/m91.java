package defpackage;

import android.app.Application;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.h;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle$State;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.StartApplicationData;
import ir.myket.player.domain.models.PlayerMovieData;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
public abstract class m91 {
    public static final g51[] a = new g51[0];
    public static final a b = new a(-329995579, new yf(11), false);
    public static final av c = new av(28);
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final Object e = new Object();
    public static final xl9 f = new xl9("id");
    public static final xl9 g = new xl9("type");
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static volatile boolean j = true;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static final boolean A(String str) {
        js3.p(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final long B(zm3 zm3Var, Orientation orientation, ym3 ym3Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (orientation == null) {
            return zm3Var.c;
        }
        int i2 = ym3Var.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (zm3Var.c >> 32));
        } else {
            if (i2 != 2) {
                return zm3Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (zm3Var.c & 4294967295L));
        }
        if (orientation == Orientation.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & jFloatToRawIntBits);
    }

    public static final long C(zm3 zm3Var, Orientation orientation, ym3 ym3Var) {
        float fIntBitsToFloat;
        long j2 = zm3Var.g;
        if (orientation == null) {
            return j2;
        }
        int i2 = ym3Var.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        } else {
            if (i2 != 2) {
                return j2;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        if (orientation == Orientation.b) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final bl8 D(gx4 gx4Var, dp2 dp2Var) {
        h hVarH = y40.H(gx4Var);
        int i2 = hVarH.b;
        androidx.compose.ui.spatial.a rectManager = m14.a(hVarH).getRectManager();
        cl8 cl8Var = rectManager.b;
        cl8Var.getClass();
        ya5 ya5Var = cl8Var.a;
        bl8 bl8Var = new bl8(cl8Var, i2, gx4Var, dp2Var);
        Object objB = ya5Var.b(i2);
        if (objB == null) {
            ya5Var.h(i2, bl8Var);
            objB = bl8Var;
        }
        bl8 bl8Var2 = (bl8) objB;
        if (bl8Var2 != bl8Var) {
            while (true) {
                bl8 bl8Var3 = bl8Var2.d;
                if (bl8Var3 == null) {
                    break;
                }
                bl8Var2 = bl8Var3;
            }
            bl8Var2.d = bl8Var;
        }
        if (y40.H(gx4Var.a).h) {
            rectManager.a.w(i2, true);
        }
        rectManager.d = true;
        rectManager.i();
        return bl8Var;
    }

    public static final long E(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final void a(bp2 bp2Var, hx4 hx4Var, boolean z, xr7 xr7Var, zm0 zm0Var, b bVar, a aVar, qz0 qz0Var, int i2) {
        boolean z2;
        b bVar2;
        b bVarL;
        int i3;
        qz0Var.c0(2136075085);
        int i4 = i2 | (qz0Var.h(bp2Var) ? 4 : 2) | (qz0Var.f(hx4Var) ? 32 : 16) | 384 | (qz0Var.f(zm0Var) ? 16384 : 8192) | 14221312;
        boolean z3 = true;
        if (qz0Var.R(i4 & 1, (38347923 & i4) != 38347922)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                bVarL = rf0.l();
                i3 = i4 & (-458753);
            } else {
                qz0Var.U();
                i3 = i4 & (-458753);
                z3 = z;
                bVarL = bVar;
            }
            qz0Var.r();
            qz0Var.a0(1577885006);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM;
            qz0Var.q(false);
            pc8.b(bp2Var, hx4Var, z3, xr7Var, z3 ? zm0Var.a : zm0Var.c, z3 ? zm0Var.b : zm0Var.d, ((au1) bVarL.a(z3, ab5Var, qz0Var, 6).getValue()).a, null, ab5Var, s7.X(-1347531112, new cn0(aVar, 1), qz0Var), qz0Var, (i3 & 8190) | 100663296, 64);
            bVar2 = bVarL;
            z2 = z3;
        } else {
            qz0Var.U();
            z2 = z;
            bVar2 = bVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new an0(bp2Var, hx4Var, z2, xr7Var, zm0Var, bVar2, aVar, i2);
        }
    }

    public static final void b(hx4 hx4Var, xr7 xr7Var, zm0 zm0Var, b bVar, a aVar, qz0 qz0Var, int i2) {
        b bVar2;
        int i3;
        b bVarL;
        qz0Var.c0(1359693790);
        int i4 = i2 | (qz0Var.f(hx4Var) ? 4 : 2) | (qz0Var.f(xr7Var) ? 32 : 16) | (qz0Var.f(zm0Var) ? 256 : 128) | 25600;
        if (qz0Var.R(i4 & 1, (74899 & i4) != 74898)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                i3 = i4 & (-7169);
                bVarL = rf0.l();
            } else {
                qz0Var.U();
                i3 = i4 & (-7169);
                bVarL = bVar;
            }
            qz0Var.r();
            pc8.a(hx4Var, xr7Var, zm0Var.a, zm0Var.b, 0.0f, ((au1) bVarL.a(true, null, qz0Var, 54).getValue()).a, s7.X(-97109725, new cn0(aVar, 0), qz0Var), qz0Var, (i3 & 112) | (i3 & 14) | 12582912 | 1572864, 16);
            bVar2 = bVarL;
        } else {
            qz0Var.U();
            bVar2 = bVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new bn0(hx4Var, xr7Var, zm0Var, bVar2, aVar, i2, 0);
        }
    }

    public static final void c(hx4 hx4Var, PlayerMovieData playerMovieData, wd6 wd6Var, xc6 xc6Var, dl5 dl5Var, String str, bp2 bp2Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        ex4 ex4Var;
        boolean z;
        boolean z2;
        boolean z3;
        qz0 qz0Var2 = qz0Var;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(wd6Var, "playerControllerState");
        boolean z4 = wd6Var.g;
        js3.p(xc6Var, "playerConfig");
        js3.p(dl5Var, "navigationStateManager");
        js3.p(str, "topBarTitle");
        js3.p(bp2Var, "progressBarTimeState");
        qz0Var2.c0(-552881927);
        int i3 = i2 | (qz0Var2.h(playerMovieData) ? 32 : 16) | (qz0Var2.f(wd6Var) ? 256 : 128) | (qz0Var2.f(xc6Var) ? 2048 : 1024) | (qz0Var2.f(dl5Var) ? 16384 : 8192) | (qz0Var2.f(str) ? 131072 : 65536) | (qz0Var2.h(bp2Var) ? 1048576 : 524288) | (qz0Var2.h(dp2Var) ? 8388608 : 4194304) | (qz0Var2.h(dp2Var2) ? 67108864 : 33554432);
        if (qz0Var2.R(i3 & 1, (38347923 & i3) != 38347922)) {
            hx4 hx4VarF = rq4.f(hx4Var.d(androidx.compose.foundation.layout.b.c), zu0.g, tt3.d);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarF);
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
            dp2 dp2Var3 = d.h;
            ia7.n(qz0Var2, dp2Var3);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            boolean z5 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            ng0 ng0Var = ng0.a;
            if (!z5 || z4) {
                qz0Var2.a0(-1029544840);
                hx4 hx4VarA = ng0Var.a(androidx.compose.foundation.layout.b.c(ex4Var2, 1.0f), eq.d);
                vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
                long j3 = qz0Var2.T;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                j56 j56VarL2 = qz0Var2.l();
                hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var2);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, qp2Var, vv0VarA);
                ia7.o(qz0Var2, qp2Var2, j56VarL2);
                ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var3);
                ia7.n(qz0Var2, dp2Var3);
                ia7.o(qz0Var2, qp2Var4, hx4VarC2);
                int i6 = i3 >> 15;
                ex4Var = ex4Var2;
                z = true;
                l87.c(null, str, dp2Var, qz0Var, ((i3 >> 12) & 112) | (i6 & 896), 1);
                qz0Var2 = qz0Var;
                if (z4) {
                    z2 = false;
                    qz0Var2.a0(1213000928);
                } else {
                    qz0Var2.a0(-99342589);
                    String str2 = playerMovieData.a.g;
                    if (str2 == null) {
                        qz0Var2.a0(1215347038);
                        z2 = false;
                    } else {
                        z2 = false;
                        qz0Var2.a0(1215347039);
                        tt3.e(null, str2, wd6Var, dp2Var2, qz0Var2, (i3 & 896) | (i6 & 7168));
                    }
                    qz0Var2.q(z2);
                }
                qz0Var2.q(z2);
                qz0Var2.q(true);
                if (z4) {
                    z3 = false;
                    qz0Var2.a0(-1031598001);
                } else {
                    qz0Var2.a0(-1029023141);
                    zk8.j(ng0Var.a(ex4Var, eq.g), wd6Var, dp2Var2, false, qz0Var2, ((i3 >> 3) & 112) | ((i3 >> 18) & 896), 8);
                    z3 = false;
                }
                qz0Var2.q(z3);
                qz0Var2.q(z3);
            } else {
                qz0Var2.a0(-1031598001);
                qz0Var2.q(false);
                ex4Var = ex4Var2;
                z = true;
            }
            int i7 = i3 << 3;
            int i8 = i3 >> 6;
            int i9 = ((i3 >> 3) & 112) | (i7 & 896) | (i3 & 7168) | (57344 & i8) | (i7 & 458752) | (3670016 & i8);
            qz0 qz0Var3 = qz0Var2;
            tt3.d(i9, qz0Var3, bp2Var, dp2Var2, ng0Var.a(ex4Var, eq.j), dl5Var, xc6Var, wd6Var, playerMovieData);
            qz0Var2 = qz0Var3;
            qz0Var2.q(z);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new d00(hx4Var, playerMovieData, wd6Var, xc6Var, dl5Var, str, bp2Var, dp2Var, dp2Var2, i2, 1);
        }
    }

    public static final void d(hl5 hl5Var, zm3 zm3Var, Orientation orientation, ym3 ym3Var, gn3 gn3Var, long j2) {
        float fIntBitsToFloat;
        ArrayList arrayList = gn3Var.b;
        long j3 = zm3Var.c;
        boolean z = zm3Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (zm3Var.c & 4294967295L));
        boolean z2 = zm3Var.h;
        if (!z2 && z) {
            gn3Var.a = 0;
            arrayList.clear();
        }
        if (!e(zm3Var) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i2 = gn3Var.a;
                gn3Var.a = i2 + 1;
                arrayList.set(i2, zm3Var);
            } else {
                arrayList.add(zm3Var);
            }
            if (gn3Var.a == 3) {
                gn3Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((zm3) arrayList.get(i3)).c >> 32))));
            }
            fIntBitsToFloat2 = (float) kotlin.collections.a.f0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((zm3) arrayList.get(i4)).c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) kotlin.collections.a.f0(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (orientation != null) {
            int i5 = ym3Var.a;
            if (i5 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i5 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = orientation == Orientation.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        ((fi1) hl5Var.b).a(zm3Var.b, nr5.g(jFloatToRawIntBits, j2));
    }

    public static final boolean e(zm3 zm3Var) {
        return zm3Var.h && !zm3Var.d;
    }

    public static final void f(m28 m28Var) {
        int i2 = m28Var.d;
        int[] iArr = m28Var.b;
        Object[] objArr = m28Var.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        m28Var.a = false;
        m28Var.d = i3;
    }

    public static final void h(k79 k79Var, bn6 bn6Var, i64 i64Var) {
        js3.p(bn6Var, "registry");
        js3.p(i64Var, "lifecycle");
        kd7 kd7Var = (kd7) k79Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (kd7Var == null || kd7Var.c) {
            return;
        }
        kd7Var.b(bn6Var, i64Var);
        Lifecycle$State lifecycle$State = i64Var.d;
        if (lifecycle$State == Lifecycle$State.b || lifecycle$State.compareTo(Lifecycle$State.d) >= 0) {
            bn6Var.v();
        } else {
            i64Var.a(new vf1(i64Var, bn6Var, 3));
        }
    }

    public static final void i(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    rm7.x(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    wu8.f(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                d1.m((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    public static int j(int i2, int i3) {
        return sv0.e(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static k79 k(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(bl4.v("Cannot create an instance of ", cls));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                js3.m(objNewInstance);
                return (k79) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e4);
        }
    }

    public static final void l(ir.mservices.market.version2.ui.recycler.adapter.a aVar, bp2 bp2Var) {
        js3.p(aVar, "<this>");
        if (aVar.c() > 0) {
            bp2Var.invoke();
        } else {
            aVar.y(new wb(aVar, bp2Var, 0));
        }
    }

    public static hp m(Bundle bundle) {
        if (!t61.B(bundle, "bundle", hp.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("isStartDownload")) {
            throw new IllegalArgumentException("Required argument \"isStartDownload\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("isStartDownload");
        if (!bundle.containsKey("launcherSource")) {
            throw new IllegalArgumentException("Required argument \"launcherSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) bundle.get("launcherSource");
        if (tracker == null) {
            throw new IllegalArgumentException("Argument \"launcherSource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("hasIcon")) {
            throw new IllegalArgumentException("Required argument \"hasIcon\" is missing and does not have an android:defaultValue");
        }
        boolean z2 = bundle.getBoolean("hasIcon");
        if (!bundle.containsKey("q")) {
            throw new IllegalArgumentException("Required argument \"q\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("q");
        if (!bundle.containsKey("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("refId");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("callbackUrl")) {
            throw new IllegalArgumentException("Required argument \"callbackUrl\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("callbackUrl");
        if (!bundle.containsKey("installCallbackUrl")) {
            throw new IllegalArgumentException("Required argument \"installCallbackUrl\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("installCallbackUrl");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(StartApplicationData.class) && !Serializable.class.isAssignableFrom(StartApplicationData.class)) {
            throw new UnsupportedOperationException(StartApplicationData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        StartApplicationData startApplicationData = (StartApplicationData) bundle.get("data");
        if (!bundle.containsKey("utm")) {
            throw new IllegalArgumentException("Required argument \"utm\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Utm.class) && !Serializable.class.isAssignableFrom(Utm.class)) {
            throw new UnsupportedOperationException(Utm.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Utm utm = (Utm) bundle.get("utm");
        if (!bundle.containsKey("caller")) {
            throw new IllegalArgumentException("Required argument \"caller\" is missing and does not have an android:defaultValue");
        }
        String string6 = bundle.getString("caller");
        if (!bundle.containsKey("deepLink")) {
            throw new IllegalArgumentException("Required argument \"deepLink\" is missing and does not have an android:defaultValue");
        }
        String string7 = bundle.getString("deepLink");
        if (bundle.containsKey("clickCallback")) {
            return new hp(string, z, tracker, z2, string2, string3, string4, string5, startApplicationData, utm, string6, string7, bundle.getString("clickCallback"));
        }
        throw new IllegalArgumentException("Required argument \"clickCallback\" is missing and does not have an android:defaultValue");
    }

    public static /* synthetic */ xe2 n(cq2 cq2Var, w61 w61Var, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            w61Var = EmptyCoroutineContext.a;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.a;
        }
        return cq2Var.c(w61Var, i2, bufferOverflow);
    }

    public static Application o(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static int p(int i2, View view) {
        Context context = view.getContext();
        TypedValue typedValueJ = yh0.J(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueJ.resourceId;
        return i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueJ.data;
    }

    public static int q(Context context, int i2, int i3) {
        Integer numR = r(context, i2);
        return numR != null ? numR.intValue() : i3;
    }

    public static Integer r(Context context, int i2) {
        TypedValue typedValueG = yh0.G(context, i2);
        if (typedValueG == null) {
            return null;
        }
        int i3 = typedValueG.resourceId;
        return Integer.valueOf(i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueG.data);
    }

    public static String s(jc0 jc0Var, int i2) {
        js3.p(jc0Var, "context");
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            String resourceName = jc0Var.a.getResources().getResourceName(i2);
            js3.m(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static Drawable t(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (j) {
                return z(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.getDrawable(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            j = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = b77.a;
        return resources.getDrawable(i2, theme);
    }

    public static ho7 u(wi5 wi5Var) {
        js3.p(wi5Var, "<this>");
        return mo7.s(new i25(21), wi5Var);
    }

    public static final boolean v(String str) {
        js3.p(str, "method");
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean w(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = sv0.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static boolean x(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static int y(float f2, int i2, int i3) {
        return sv0.c(sv0.e(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static Drawable z(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            f51 f51Var = new f51(context);
            f51Var.b = theme;
            f51Var.a(theme.getResources().getConfiguration());
            context = f51Var;
        }
        return rf0.v(context, i2);
    }

    public abstract void g(e57 e57Var, Object obj);
}
