package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.measurement.p0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.j0;
import io.sentry.SentryLevel;
import io.sentry.SentryLogLevel;
import io.sentry.android.core.t0;
import ir.myket.player.domain.models.PlayerMovieData;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs9 {
    public static final a b = new a(636288403, new uy0(0), false);
    public static final a c = new a(-1357803046, new uy0(1), false);
    public static final v27 d = new v27(4);
    public static final sy0 e = new sy0(10);
    public static final Object f = new Object();
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static Method k;
    public static Method l;
    public static boolean m;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ hs9(int i2) {
        this.a = i2;
    }

    public static final eq1 B(xe2 xe2Var, dp2 dp2Var, qp2 qp2Var) {
        if (xe2Var instanceof eq1) {
            eq1 eq1Var = (eq1) xe2Var;
            if (eq1Var.b == dp2Var && eq1Var.c == qp2Var) {
                return eq1Var;
            }
        }
        return new eq1(xe2Var, dp2Var, qp2Var);
    }

    public static void C(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            te.o(canvas, z);
            return;
        }
        if (!m) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    k = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    l = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    k = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    l = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = k;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = l;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            m = true;
        }
        if (z) {
            try {
                Method method4 = k;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = l) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final zw3 D(no7 no7Var) {
        js3.p(no7Var, "<this>");
        if (no7Var instanceof z41) {
            return ((z41) no7Var).b;
        }
        if (no7Var instanceof oo7) {
            return D(((oo7) no7Var).a);
        }
        return null;
    }

    public static int E(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final a58 F(SnapshotStateList snapshotStateList) {
        a58 a58Var = snapshotStateList.a;
        js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (a58) g08.u(a58Var, snapshotStateList);
    }

    public static final int G(SnapshotStateList snapshotStateList) {
        a58 a58Var = snapshotStateList.a;
        js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((a58) g08.h(a58Var)).e;
    }

    public static ImmutableMap H(ImmutableSet immutableSet) {
        j0 j0Var = new j0(immutableSet.size());
        Iterator<E> it = immutableSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            j0Var.c(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return j0Var.a(true);
    }

    public static final boolean L(String str, int i2, int i3) {
        js3.p(str, "<this>");
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && gh9.m(str.charAt(i2 + 1)) != -1 && gh9.m(str.charAt(i4)) != -1;
    }

    public static final boolean M(SnapshotStateList snapshotStateList, dp2 dp2Var) {
        int i2;
        w1 w1Var;
        Object objInvoke;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (f) {
                a58 a58Var = snapshotStateList.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i2 = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            v66 v66VarH = w1Var.h();
            objInvoke = dp2Var.invoke(v66VarH);
            w1 w1VarE = v66VarH.e();
            if (js3.i(w1VarE, w1Var)) {
                break;
            }
            a58 a58Var3 = snapshotStateList.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = r((a58) g08.x(a58Var3, snapshotStateList, c08VarJ), i2, w1VarE, true);
            }
            g08.o(c08VarJ, snapshotStateList);
        } while (!zR);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final hx4 N(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new ft5(dp2Var));
    }

    public static String O(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        js3.p(str, "<this>");
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                gh0 gh0Var = new gh0();
                gh0Var.j1(str, i2, iCharCount);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iM = gh9.m(str.charAt(iCharCount + 1));
                        int iM2 = gh9.m(str.charAt(i5));
                        if (iM == -1 || iM2 == -1) {
                            gh0Var.l1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gh0Var.R0((iM << 4) + iM2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        gh0Var.R0(32);
                        iCharCount++;
                    } else {
                        gh0Var.l1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gh0Var.w0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i2, i3);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void P(gb6 gb6Var, String str, String str2) {
        js3.p(gb6Var, "<this>");
        js3.p(str, "url");
        jp4 jp4VarE = gb6Var.E();
        if (!js3.i(jp4VarE != null ? jp4VarE.a : null, str2) || str2 == null) {
            gb6Var.T(0, z(str));
            gb6Var.c();
        }
    }

    public static Object Q(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static final int S(xa5 xa5Var) {
        int iC;
        int i2 = xa5Var.b;
        int iC2 = xa5Var.c(0);
        while (xa5Var.b != 0 && xa5Var.c(0) == iC2) {
            xa5Var.f(0, xa5Var.d());
            xa5Var.e(xa5Var.b - 1);
            int i3 = xa5Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = xa5Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = xa5Var.c(i7);
                if (i6 >= i3 || (iC = xa5Var.c(i6)) <= iC4) {
                    if (iC4 > iC3) {
                        xa5Var.f(i5, iC4);
                        xa5Var.f(i7, iC3);
                        i5 = i7;
                    }
                } else if (iC > iC3) {
                    xa5Var.f(i5, iC);
                    xa5Var.f(i6, iC3);
                    i5 = i6;
                }
            }
        }
        return iC2;
    }

    public static final List T(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(kotlin.collections.a.o0(list)) : EmptyList.a;
    }

    public static final Map V(Map map) {
        int size = map.size();
        if (size == 0) {
            return b.I();
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) kotlin.collections.a.n0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final int W(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static es9 X() {
        String strQ;
        ClassLoader classLoader = hs9.class.getClassLoader();
        if (es9.class.equals(es9.class)) {
            strQ = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!es9.class.getPackage().equals(hs9.class.getPackage())) {
                throw new IllegalArgumentException(es9.class.getName());
            }
            strQ = rm7.q(es9.class.getPackage().getName(), ".BlazeGenerated", es9.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    dw1.x(Class.forName(strQ, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new hs9[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e6) {
                        Logger.getLogger(p0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(es9.class.getSimpleName()), (Throwable) e6);
                    }
                }
                if (arrayList.size() == 1) {
                    return (es9) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (es9) es9.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final void j(hx4 hx4Var, xc6 xc6Var, PlayerMovieData playerMovieData, dp2 dp2Var, dl5 dl5Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        ex4 ex4Var;
        int i3;
        int i4;
        hx4 hx4Var3;
        i iVar;
        js3.p(xc6Var, "playerConfig");
        js3.p(playerMovieData, "playerMovieData");
        js3.p(dl5Var, "navigationStateManager");
        qz0Var.c0(1786856661);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 |= qz0Var.f(xc6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= qz0Var.h(playerMovieData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= (i2 & 32768) == 0 ? qz0Var.f(dl5Var) : qz0Var.h(dl5Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= qz0Var.h(dp2Var2) ? 131072 : 65536;
        }
        if (qz0Var.R(i5 & 1, (74899 & i5) != 74898)) {
            Context context = (Context) qz0Var.j(e.b);
            i iVar2 = uj8.a;
            Object objJ = qz0Var.j(iVar2);
            js3.m(objJ);
            long j2 = ((tj8) objJ).l;
            ka7 ka7Var = la7.a;
            ex4 ex4Var2 = ex4.b;
            hx4 hx4VarF = rq4.f(ex4Var2, j2, ka7Var);
            cb7 cb7VarA = bb7.a(tt3.a, eq.m, qz0Var, 54);
            long j3 = qz0Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarF);
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
            ia7.g(qz0Var, Integer.valueOf(i6), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            hx4 hx4VarL = androidx.compose.foundation.layout.b.l(ex4Var2, ml9.q(hq6.action_button_width_landscape, qz0Var));
            int i7 = br6.player_ic_share;
            int i8 = i5 & 7168;
            boolean zH = qz0Var.h(playerMovieData) | (i8 == 2048) | qz0Var.h(context);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (zH || objM == obj) {
                objM = new fy(playerMovieData, dp2Var, context, 0);
                qz0Var.l0(objM);
            }
            tv8.a(hx4VarL, i7, (bp2) objM, qz0Var, 0);
            hx4 hx4VarL2 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.d(ex4Var2, ml9.q(hq6.icon_size_small, qz0Var)), ml9.q(hq6.size_1, qz0Var));
            Object objJ2 = qz0Var.j(iVar2);
            js3.m(objJ2);
            tt3.i(hx4VarL2, 0.0f, ((tj8) objJ2).r, qz0Var, 0, 2);
            String strF = ln2.f(vs6.player_playback_speed, qz0Var);
            String strA = wa6.a(((wa6) ((s08) xc6Var.h).getValue()).a, context);
            int i9 = br6.player_ic_speedometer;
            boolean zF = qz0Var.f(strF) | ((57344 & i5) == 16384 || ((i5 & 32768) != 0 && qz0Var.h(dl5Var))) | ((i5 & 112) == 32) | qz0Var.h(context) | qz0Var.f(strA) | ((i5 & 458752) == 131072);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj) {
                ex4Var = ex4Var2;
                i3 = 0;
                i4 = i8;
                hx4Var3 = hx4VarL;
                iVar = iVar2;
                Object gyVar = new gy(dl5Var, strF, xc6Var, context, strA, dp2Var2);
                qz0Var.l0(gyVar);
                objM2 = gyVar;
            } else {
                hx4Var3 = hx4VarL;
                ex4Var = ex4Var2;
                i3 = 0;
                i4 = i8;
                iVar = iVar2;
            }
            tv8.a(hx4Var3, i9, (bp2) objM2, qz0Var, i3);
            hx4 hx4VarL3 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.d(ex4Var, ml9.q(hq6.icon_size_small, qz0Var)), ml9.q(hq6.size_1, qz0Var));
            Object objJ3 = qz0Var.j(iVar);
            js3.m(objJ3);
            tt3.i(hx4VarL3, 0.0f, ((tj8) objJ3).r, qz0Var, 0, 2);
            int i10 = br6.player_ic_lock;
            int i11 = i4 == 2048 ? 1 : i3;
            Object objM3 = qz0Var.M();
            if (i11 != 0 || objM3 == obj) {
                objM3 = new ba(1, dp2Var);
                qz0Var.l0(objM3);
            }
            tv8.a(hx4Var3, i10, (bp2) objM3, qz0Var, i3);
            qz0Var.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new hy(hx4Var2, xc6Var, playerMovieData, dp2Var, dl5Var, dp2Var2, i2);
        }
    }

    public static tv3 l(dp2 dp2Var) {
        ou3 ou3Var = pu3.d;
        js3.p(ou3Var, "from");
        zu3 zu3Var = new zu3();
        bv3 bv3Var = ou3Var.a;
        zu3Var.a = bv3Var.a;
        zu3Var.b = bv3Var.d;
        zu3Var.c = bv3Var.b;
        zu3Var.d = bv3Var.c;
        String str = bv3Var.e;
        String str2 = bv3Var.f;
        ClassDiscriminatorMode classDiscriminatorMode = bv3Var.h;
        boolean z = bv3Var.g;
        rb4 rb4Var = ou3Var.b;
        dp2Var.invoke(zu3Var);
        if (!js3.i(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        bv3 bv3Var2 = new bv3(zu3Var.a, zu3Var.c, zu3Var.d, zu3Var.b, str, str2, z, classDiscriminatorMode);
        js3.p(rb4Var, "module");
        tv3 tv3Var = new tv3(bv3Var2, rb4Var);
        if (!rb4Var.equals(wo7.a)) {
            boolean z2 = classDiscriminatorMode != ClassDiscriminatorMode.a;
            Iterator it = ((Map) rb4Var.b).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            }
            for (Map.Entry entry2 : ((Map) rb4Var.c).entrySet()) {
                zw3 zw3Var = (zw3) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    zw3 zw3Var2 = (zw3) entry3.getKey();
                    px3 px3Var = (px3) entry3.getValue();
                    js3.n(zw3Var, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    js3.n(zw3Var2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    js3.n(px3Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    no7 descriptor = px3Var.getDescriptor();
                    o37 kind = descriptor.getKind();
                    if ((kind instanceof ph6) || js3.i(kind, qo7.b)) {
                        throw new IllegalArgumentException("Serializer for " + ((ps0) zw3Var2).d() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (z2 && (js3.i(kind, g98.c) || js3.i(kind, g98.d) || (kind instanceof yj6) || (kind instanceof ro7))) {
                        throw new IllegalArgumentException("Serializer for " + ((ps0) zw3Var2).d() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (z2) {
                        int iE = descriptor.e();
                        for (int i2 = 0; i2 < iE; i2++) {
                            String strF = descriptor.f(i2);
                            if (js3.i(strF, str2)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + zw3Var2 + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) rb4Var.d).entrySet()) {
                zw3 zw3Var3 = (zw3) entry4.getKey();
                dp2 dp2Var2 = (dp2) entry4.getValue();
                js3.n(zw3Var3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                js3.n(dp2Var2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                wu8.i(1, dp2Var2);
            }
            for (Map.Entry entry5 : ((Map) rb4Var.f).entrySet()) {
                zw3 zw3Var4 = (zw3) entry5.getKey();
                dp2 dp2Var3 = (dp2) entry5.getValue();
                js3.n(zw3Var4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                js3.n(dp2Var3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                wu8.i(1, dp2Var3);
            }
        }
        return tv3Var;
    }

    public static final void m(bp2 bp2Var, hx4 hx4Var, g34 g34Var, u34 u34Var, qz0 qz0Var, int i2) {
        u34 u34Var2;
        g34 g34Var2;
        hx4 hx4Var2;
        qz0Var.c0(1055276397);
        int i3 = (qz0Var.h(bp2Var) ? 4 : 2) | i2 | (qz0Var.f(hx4Var) ? 32 : 16) | (qz0Var.f(g34Var) ? 256 : 128) | (qz0Var.f(u34Var) ? 2048 : 1024);
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            u34Var2 = u34Var;
            z24 z24Var = new z24(g34Var, hx4Var, u34Var2, g.k(bp2Var, qz0Var), 0);
            g34Var2 = g34Var;
            hx4Var2 = hx4Var;
            y40.d(s7.X(-933153643, z24Var, qz0Var), qz0Var, 6);
        } else {
            u34Var2 = u34Var;
            g34Var2 = g34Var;
            hx4Var2 = hx4Var;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ia0(bp2Var, hx4Var2, g34Var2, u34Var2, i2);
        }
    }

    public static hi4 n(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new hi4(entry);
    }

    public static final boolean o(iu1 iu1Var, long j2) {
        if (!iu1Var.a.n) {
            return false;
        }
        androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) y40.H(iu1Var).H.d;
        if (!eVar.V.n) {
            return false;
        }
        long jK = eVar.K(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
        long j3 = iu1Var.q;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final void p(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final void q(xa5 xa5Var, int i2) {
        if (xa5Var.b == 0 || !(xa5Var.c(0) == i2 || xa5Var.c(xa5Var.b - 1) == i2)) {
            int i3 = xa5Var.b;
            xa5Var.a(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int iC = xa5Var.c(i4);
                if (i2 <= iC) {
                    break;
                }
                xa5Var.f(i3, iC);
                i3 = i4;
            }
            xa5Var.f(i3, i2);
        }
    }

    public static final boolean r(a58 a58Var, int i2, w1 w1Var, boolean z) {
        boolean z2;
        synchronized (f) {
            try {
                int i3 = a58Var.d;
                if (i3 == i2) {
                    a58Var.c = w1Var;
                    z2 = true;
                    if (z) {
                        a58Var.e++;
                    }
                    a58Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static String s(int i2, int i3, int i4, String str, String str2) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        boolean z4 = (i4 & 64) == 0;
        js3.p(str, "<this>");
        return t(str, i5, i6, str2, z, z2, z3, z4, 128);
    }

    public static String t(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z5 = (i4 & 8) != 0 ? false : z;
        boolean z6 = (i4 & 16) != 0 ? false : z2;
        boolean z7 = (i4 & 64) == 0 ? z4 : false;
        js3.p(str, "<this>");
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || f88.d0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !L(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                gh0 gh0Var = new gh0();
                gh0Var.j1(str, i5, iCharCount);
                gh0 gh0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        String str3 = Marker.ANY_NON_NULL_MARKER;
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            gh0Var.h1(Marker.ANY_NON_NULL_MARKER);
                        } else if (iCodePointAt2 == 43 && z3) {
                            if (!z5) {
                                str3 = "%2B";
                            }
                            gh0Var.h1(str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z7) || f88.d0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !L(str, iCharCount, length)))))) {
                            if (gh0Var2 == null) {
                                gh0Var2 = new gh0();
                            }
                            gh0Var2.l1(iCodePointAt2);
                            while (!gh0Var2.u()) {
                                byte b2 = gh0Var2.readByte();
                                gh0Var.R0(37);
                                char[] cArr = g;
                                gh0Var.R0(cArr[((b2 & 255) >> 4) & 15]);
                                gh0Var.R0(cArr[b2 & 15]);
                            }
                        } else {
                            gh0Var.l1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 128;
                }
                return gh0Var.w0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i5, length);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int v(int i2) {
        if (i2 < 3) {
            vy2.m(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(((double) i2) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void w(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static bi2 x(Context context) {
        ProviderInfo providerInfo;
        zh2 zh2Var;
        ApplicationInfo applicationInfo;
        av le1Var = Build.VERSION.SDK_INT >= 28 ? new le1(12) : new av(12);
        PackageManager packageManager = context.getPackageManager();
        wu8.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            zh2Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrW = le1Var.w(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrW) {
                    arrayList.add(signature.toByteArray());
                }
                zh2Var = new zh2(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                t0.a("emoji2.text.DefaultEmojiConfig", SentryLevel.ERROR, null, e2);
                t0.b(SentryLogLevel.FATAL, null, e2);
                zh2Var = null;
            }
        }
        if (zh2Var == null) {
            return null;
        }
        return new bi2(new ai2(context, zh2Var));
    }

    public static final jp4 z(String str) {
        qp4 qp4Var = new qp4(new pp4());
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        fp4 fp4Var = null;
        Uri uri = str == null ? null : Uri.parse(str);
        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
        if (uri != null) {
            fp4Var = new fp4(uri, null, ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list, null, immutableListQ, -9223372036854775807L);
        }
        return new jp4("", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4Var, gp4Var);
    }

    /* JADX INFO: renamed from: A */
    public abstract Object Y();

    public String toString() {
        switch (this.a) {
            case 16:
                return Y().toString();
            default:
                return super.toString();
        }
    }
}
