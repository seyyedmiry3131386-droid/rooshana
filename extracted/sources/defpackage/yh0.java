package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.myket.movie.common.domain.models.SampleWatch;
import ir.myket.player.domain.models.PlayerMovieData;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class yh0 {
    public static final za0 a = new za0(-1.0f, -1.0f);
    public static final za0 b = new za0(1.0f, -1.0f);
    public static final za0 c = new za0(-1.0f, 0.0f);
    public static final za0 d = new za0(1.0f, 0.0f);
    public static final za0 e = new za0(-1.0f, 1.0f);
    public static final za0 f = new za0(1.0f, 1.0f);
    public static final ya0 g = new ya0(-1.0f);
    public static final ya0 h = new ya0(1.0f);
    public static final a i = new a(-683361454, new yf(10), false);
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] l = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final Object m = new Object();
    public static boolean n;
    public static int o;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;

    public static final hx4 A(hx4 hx4Var, float f2, float f3) {
        return hx4Var.d(new sy5(f2, f3, f2, f3, true, new sm5(10)));
    }

    public static hx4 B(hx4 hx4Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return A(hx4Var, f2, f3);
    }

    public static final hx4 C(hx4 hx4Var, float f2, float f3, float f4, float f5) {
        return hx4Var.d(new sy5(f2, f3, f4, f5, true, new sm5(8)));
    }

    public static hx4 D(hx4 hx4Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return C(hx4Var, f2, f3, f4, f5);
    }

    public static bk0 E(fn5 fn5Var) {
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long jF;
        long j6;
        long j7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = (Map) fn5Var.d;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jF2 = str != null ? F(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j3 = 0;
            j4 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j4 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i2++;
            }
            j2 = 0;
            i2 = 1;
        } else {
            j2 = 0;
            z = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jF3 = str3 != null ? F(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j5 = jCurrentTimeMillis;
            jF = F(str4);
        } else {
            j5 = jCurrentTimeMillis;
            jF = j2;
        }
        String str5 = (String) map.get("ETag");
        if (i2 != 0) {
            long j8 = (j3 * 1000) + j5;
            if (z) {
                j7 = j8;
            } else {
                Long.signum(j4);
                j7 = (j4 * 1000) + j8;
            }
            j6 = j8;
        } else {
            j6 = (jF2 <= j2 || jF3 < jF2) ? j2 : (jF3 - jF2) + j5;
            j7 = j6;
        }
        bk0 bk0Var = new bk0();
        bk0Var.a = (byte[]) fn5Var.c;
        bk0Var.b = str5;
        bk0Var.f = j6;
        bk0Var.e = j7;
        bk0Var.c = jF2;
        bk0Var.d = jF;
        bk0Var.g = map;
        bk0Var.h = (List) fn5Var.e;
        return bk0Var;
    }

    public static long F(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str)) {
                return 0L;
            }
            "-1".equals(str);
            return 0L;
        }
    }

    public static TypedValue G(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean H(Context context, int i2, boolean z) {
        TypedValue typedValueG = G(context, i2);
        return (typedValueG == null || typedValueG.type != 18) ? z : typedValueG.data != 0;
    }

    public static int I(Context context) {
        int i2 = vp6.minTouchTargetSize;
        int i3 = oq6.mtrl_min_touch_target_size;
        TypedValue typedValueG = G(context, i2);
        return (int) ((typedValueG == null || typedValueG.type != 5) ? context.getResources().getDimension(i3) : typedValueG.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue J(int i2, Context context, String str) {
        TypedValue typedValueG = G(context, i2);
        if (typedValueG != null) {
            return typedValueG;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void K(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void L(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void M(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.b18 N(defpackage.w72 r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh0.N(w72, boolean, boolean):b18");
    }

    public static ArrayList O(Collection collection, yp2 yp2Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) yp2Var.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable P(Drawable drawable) {
        if (!(drawable instanceof pg9)) {
            return drawable;
        }
        ((qg9) ((pg9) drawable)).getClass();
        return null;
    }

    public static final void a(hx4 hx4Var, PlayerMovieData playerMovieData, wd6 wd6Var, xc6 xc6Var, dl5 dl5Var, String str, bp2 bp2Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        qz0 qz0Var2;
        int i3;
        long j2;
        boolean z;
        int i4;
        ex4 ex4Var;
        qz0 qz0Var3 = qz0Var;
        cb0 cb0Var = eq.c;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(wd6Var, "playerControllerState");
        boolean z2 = wd6Var.g;
        js3.p(xc6Var, "playerConfig");
        js3.p(dl5Var, "navigationStateManager");
        js3.p(str, "topBarTitle");
        js3.p(bp2Var, "progressBarTimeState");
        qz0Var3.c0(-1916368131);
        int i5 = i2 | (qz0Var3.h(playerMovieData) ? 32 : 16) | (qz0Var3.f(wd6Var) ? 256 : 128) | (qz0Var3.f(xc6Var) ? 2048 : 1024) | (qz0Var3.f(dl5Var) ? 16384 : 8192) | (qz0Var3.f(str) ? 131072 : 65536) | (qz0Var3.h(bp2Var) ? 1048576 : 524288) | (qz0Var3.h(dp2Var) ? 8388608 : 4194304) | (qz0Var3.h(dp2Var2) ? 67108864 : 33554432);
        if (qz0Var3.R(i5 & 1, (38347923 & i5) != 38347922)) {
            hx4 hx4VarD = hx4Var.d(b.c);
            long j3 = zu0.g;
            hx4 hx4VarF = rq4.f(hx4VarD, j3, tt3.d);
            cl4 cl4VarD = bg0.d(cb0Var, false);
            long j4 = qz0Var.T;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarF);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var2);
            } else {
                qz0Var.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var, qp2Var, cl4VarD);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i6);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var, numValueOf, qp2Var3);
            dp2 dp2Var3 = d.h;
            ia7.n(qz0Var, dp2Var3);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var, qp2Var4, hx4VarC);
            boolean z3 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            ng0 ng0Var = ng0.a;
            if (!z3 || z2) {
                qz0Var.a0(1311747549);
                hx4 hx4VarA = ng0Var.a(b.c(ex4Var2, 1.0f), eq.d);
                vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
                long j5 = qz0Var.T;
                int i7 = (int) (j5 ^ (j5 >>> 32));
                j56 j56VarL2 = qz0Var.l();
                hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var, hx4VarA);
                qz0Var.e0();
                if (qz0Var.S) {
                    qz0Var.k(bp2Var2);
                } else {
                    qz0Var.o0();
                }
                ia7.o(qz0Var, qp2Var, vv0VarA);
                ia7.o(qz0Var, qp2Var2, j56VarL2);
                ia7.g(qz0Var, Integer.valueOf(i7), qp2Var3);
                ia7.n(qz0Var, dp2Var3);
                ia7.o(qz0Var, qp2Var4, hx4VarC2);
                int i8 = i5 >> 15;
                l87.c(null, str, dp2Var, qz0Var, ((i5 >> 12) & 112) | (i8 & 896), 1);
                qz0Var2 = qz0Var;
                if (z2) {
                    i3 = i5;
                    j2 = j3;
                    qz0Var2.a0(1807569422);
                } else {
                    qz0Var2.a0(1166772981);
                    String str2 = playerMovieData.a.g;
                    if (str2 == null) {
                        qz0Var2.a0(1810224044);
                        qz0Var2.q(false);
                        i3 = i5;
                        j2 = j3;
                    } else {
                        qz0Var2.a0(1810224045);
                        int i9 = (i5 & 896) | (i8 & 7168);
                        i3 = i5;
                        j2 = j3;
                        tt3.e(null, str2, wd6Var, dp2Var2, qz0Var2, i9);
                        qz0Var2.q(false);
                    }
                }
                qz0Var2.q(false);
                qz0Var2.q(true);
                if (z2) {
                    z = false;
                    i4 = i3;
                    ex4Var = ex4Var2;
                    qz0Var2.a0(1309431167);
                } else {
                    qz0Var2.a0(1312329791);
                    hx4 hx4VarA2 = ng0Var.a(ex4Var2, eq.g);
                    Pair pair = new Pair(Float.valueOf(0.0f), new zu0(j2));
                    Float fValueOf = Float.valueOf(0.3f);
                    u58 u58Var = uj8.a;
                    Object objJ = qz0Var2.j(u58Var);
                    js3.m(objJ);
                    i4 = i3;
                    Pair pair2 = new Pair(fValueOf, new zu0(zu0.b(0.3f, ((tj8) objJ).i)));
                    Float fValueOf2 = Float.valueOf(0.7f);
                    Object objJ2 = qz0Var2.j(u58Var);
                    js3.m(objJ2);
                    Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{pair, pair2, new Pair(fValueOf2, new zu0(zu0.b(0.3f, ((tj8) objJ2).i))), new Pair(Float.valueOf(1.0f), new zu0(j2))}, 4);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                    ArrayList arrayList = new ArrayList(pairArr.length);
                    for (Pair pair3 : pairArr) {
                        arrayList.add(new zu0(((zu0) pair3.b).a));
                    }
                    ArrayList arrayList2 = new ArrayList(pairArr.length);
                    for (Pair pair4 : pairArr) {
                        arrayList2.add(Float.valueOf(((Number) pair4.a).floatValue()));
                    }
                    hx4 hx4VarB = B(rq4.e(hx4VarA2, new g74(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2)), 0.0f, ml9.q(hq6.space_36, qz0Var2), 1);
                    cl4 cl4VarD2 = bg0.d(cb0Var, false);
                    long j6 = qz0Var2.T;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    j56 j56VarL3 = qz0Var2.l();
                    hx4 hx4VarC3 = androidx.compose.ui.b.c(qz0Var2, hx4VarB);
                    hz0.d0.getClass();
                    bp2 bp2Var3 = d.b;
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var3);
                    } else {
                        qz0Var2.o0();
                    }
                    ia7.o(qz0Var2, d.f, cl4VarD2);
                    ia7.o(qz0Var2, d.e, j56VarL3);
                    ia7.g(qz0Var2, Integer.valueOf(i10), d.g);
                    ia7.n(qz0Var2, d.h);
                    ia7.o(qz0Var2, d.d, hx4VarC3);
                    ex4Var = ex4Var2;
                    zk8.j(D(ex4Var2, 0.0f, 0.0f, 0.0f, ml9.q(hq6.space_16, qz0Var2), 7), wd6Var, dp2Var2, true, qz0Var2, ((i4 >> 3) & 112) | 3072 | ((i4 >> 18) & 896), 0);
                    qz0Var2.q(true);
                    z = false;
                }
                qz0Var2.q(z);
                qz0Var2.q(z);
            } else {
                qz0Var.a0(1309431167);
                qz0Var.q(false);
                i4 = i5;
                qz0Var2 = qz0Var;
                ex4Var = ex4Var2;
            }
            int i11 = i4 << 3;
            int i12 = i4;
            int i13 = i12 >> 6;
            qz0 qz0Var4 = qz0Var2;
            gu9.b(ng0Var.a(ex4Var, eq.j), wd6Var, playerMovieData, xc6Var, bp2Var, dl5Var, dp2Var2, dp2Var, qz0Var4, ((i4 >> 3) & 112) | (i11 & 896) | (i12 & 7168) | (57344 & i13) | (i11 & 458752) | (3670016 & i13) | (29360128 & i12));
            qz0Var3 = qz0Var4;
            qz0Var3.q(true);
        } else {
            qz0Var3.U();
        }
        my6 my6VarS = qz0Var3.s();
        if (my6VarS != null) {
            my6VarS.d = new d00(hx4Var, playerMovieData, wd6Var, xc6Var, dl5Var, str, bp2Var, dp2Var, dp2Var2, i2, 0);
        }
    }

    public static final void b(f fVar, a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(fVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            xq2.d(fVar, aVar, qz0Var, i3 & 126);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yw0(fVar, aVar, i2, 1);
        }
    }

    public static tj1 c() {
        return new tj1(1.0f, 1.0f);
    }

    public static wy5 d(float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return new wy5(f2, f3, f2, f3);
    }

    public static final wy5 e(float f2, float f3, float f4, float f5) {
        return new wy5(f2, f3, f4, f5);
    }

    public static wy5 f(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return new wy5(f2, f3, f4, f5);
    }

    public static yg g(String str, gj8 gj8Var, long j2, qj1 qj1Var, oh2 oh2Var, List list, int i2, int i3) {
        if ((i3 & 32) != 0) {
            list = EmptyList.a;
        }
        return new yg(new ch(str, gj8Var, list, EmptyList.a, oh2Var, qj1Var), i2, 1, j2);
    }

    public static final void h(final hx4 hx4Var, final bp2 bp2Var, final SampleWatch sampleWatch, final dp2 dp2Var, long j2, long j3, long j4, long j5, float f2, float f3, qz0 qz0Var, final int i2) {
        final hx4 hx4Var2;
        int i3;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final float f4;
        final float f5;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        final float fQ;
        final float f6;
        Context context;
        float fS;
        js3.p(bp2Var, "progressBarTimeState");
        qz0Var.c0(437918112);
        if ((i2 & 6) == 0) {
            hx4Var2 = hx4Var;
            i3 = (qz0Var.f(hx4Var2) ? 4 : 2) | i2;
        } else {
            hx4Var2 = hx4Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? qz0Var.f(sampleWatch) : qz0Var.h(sampleWatch) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= 268435456;
        }
        if (qz0Var.R(i3 & 1, (306783379 & i3) != 306783378)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                u58 u58Var = uj8.a;
                Object objJ = qz0Var.j(u58Var);
                js3.m(objJ);
                long j14 = ((tj8) objJ).I.d;
                Object objJ2 = qz0Var.j(u58Var);
                js3.m(objJ2);
                long j15 = ((tj8) objJ2).B;
                int iE = gu9.E(j15);
                Object objJ3 = qz0Var.j(u58Var);
                js3.m(objJ3);
                long jD = gu9.d(sv0.b(0.5f, iE, gu9.E(((tj8) objJ3).I.a)));
                float fQ2 = ml9.q(hq6.progress_bar_thumb_radius, qz0Var);
                j10 = j14;
                j11 = j15;
                j12 = j11;
                j13 = jD;
                fQ = ml9.q(hq6.progress_bar_thickness, qz0Var);
                f6 = fQ2;
            } else {
                qz0Var.U();
                j10 = j2;
                j11 = j3;
                j13 = j4;
                j12 = j5;
                f6 = f2;
                fQ = f3;
            }
            qz0Var.r();
            Context context2 = (Context) qz0Var.j(e.b);
            final zl6 zl6Var = (zl6) bp2Var.invoke();
            final Ref$LongRef ref$LongRef = new Ref$LongRef();
            long j16 = zl6Var.a;
            ref$LongRef.a = j16;
            final long j17 = zl6Var.c;
            boolean zE = qz0Var.e(j16) | qz0Var.e(j17);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (zE || objM == avVar) {
                if (j17 > 0) {
                    context = context2;
                    fS = ok4.s(ref$LongRef.a / j17, 0.0f, 1.0f);
                } else {
                    context = context2;
                    fS = 0.0f;
                }
                objM = g.d(fS);
                qz0Var.l0(objM);
            } else {
                context = context2;
            }
            final l08 l08Var = (l08) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = g.h(null);
                qz0Var.l0(objM2);
            }
            final wb5 wb5Var = (wb5) objM2;
            u58 u58Var2 = l.h;
            um umVarA = u58Var2.a(new tj1(((qj1) qz0Var.j(u58Var2)).getDensity(), 1.0f));
            final Context context3 = context;
            zk8.b(umVarA, s7.X(-1535087392, new qp2() { // from class: jf6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    bp2 bp2Var2;
                    wb5 wb5Var2;
                    dp2 dp2Var2;
                    qp2 qp2Var;
                    Context context4;
                    boolean z;
                    final float f7;
                    qz0 qz0Var2;
                    qp2 qp2Var2;
                    qz0 qz0Var3 = (qz0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (qz0Var3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        hx4 hx4VarC = b.c(hx4Var2, 1.0f);
                        cb7 cb7VarA = bb7.a(tt3.a, eq.n, qz0Var3, 54);
                        long j18 = qz0Var3.T;
                        int i4 = (int) (j18 ^ (j18 >>> 32));
                        j56 j56VarL = qz0Var3.l();
                        hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var3, hx4VarC);
                        hz0.d0.getClass();
                        bp2 bp2Var3 = d.b;
                        qz0Var3.e0();
                        if (qz0Var3.S) {
                            qz0Var3.k(bp2Var3);
                        } else {
                            qz0Var3.o0();
                        }
                        qp2 qp2Var3 = d.f;
                        ia7.o(qz0Var3, qp2Var3, cb7VarA);
                        qp2 qp2Var4 = d.e;
                        ia7.o(qz0Var3, qp2Var4, j56VarL);
                        Integer numValueOf = Integer.valueOf(i4);
                        qp2 qp2Var5 = d.g;
                        ia7.g(qz0Var3, numValueOf, qp2Var5);
                        dp2 dp2Var3 = d.h;
                        ia7.n(qz0Var3, dp2Var3);
                        qp2 qp2Var6 = d.d;
                        ia7.o(qz0Var3, qp2Var6, hx4VarC2);
                        wb5 wb5Var3 = wb5Var;
                        Float f8 = (Float) wb5Var3.getValue();
                        float fFloatValue = f8 != null ? f8.floatValue() : l08Var.h();
                        long j19 = j17;
                        long jW = ok4.W(j19 * fFloatValue);
                        String strO0 = zk8.o0(jW);
                        Context context5 = context3;
                        yh0.i(null, xa7.f(context5, strO0), 6, qz0Var3, 0);
                        if (1.0f <= 0.0d) {
                            pn3.a("invalid weight; must be greater than zero");
                        }
                        a24 a24Var = new a24(1.0f, true);
                        Object objM3 = qz0Var3.M();
                        av avVar2 = jz0.a;
                        if (objM3 == avVar2) {
                            objM3 = new v7(27);
                            qz0Var3.l0(objM3);
                        }
                        hx4 hx4VarA = androidx.compose.foundation.f.a(a24Var, null, null, false, null, (bp2) objM3, 28);
                        vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var3, 0);
                        long j20 = qz0Var3.T;
                        int i5 = (int) (j20 ^ (j20 >>> 32));
                        j56 j56VarL2 = qz0Var3.l();
                        hx4 hx4VarC3 = androidx.compose.ui.b.c(qz0Var3, hx4VarA);
                        qz0Var3.e0();
                        if (qz0Var3.S) {
                            bp2Var2 = bp2Var3;
                            qz0Var3.k(bp2Var2);
                        } else {
                            bp2Var2 = bp2Var3;
                            qz0Var3.o0();
                        }
                        ia7.o(qz0Var3, qp2Var3, vv0VarA);
                        ia7.o(qz0Var3, qp2Var4, j56VarL2);
                        ia7.g(qz0Var3, Integer.valueOf(i5), qp2Var5);
                        ia7.n(qz0Var3, dp2Var3);
                        ia7.o(qz0Var3, qp2Var6, hx4VarC3);
                        SampleWatch sampleWatch2 = sampleWatch;
                        float f9 = f6;
                        if (sampleWatch2 == null || j19 <= 0) {
                            wb5Var2 = wb5Var3;
                            dp2Var2 = dp2Var3;
                            qp2Var = qp2Var5;
                            context4 = context5;
                            z = false;
                            f7 = fFloatValue;
                            qz0Var2 = qz0Var3;
                            qp2Var2 = qp2Var6;
                            qz0Var2.a0(-1147646884);
                        } else {
                            qz0Var3.a0(-1141985726);
                            wb5Var2 = wb5Var3;
                            dp2Var2 = dp2Var3;
                            context4 = context5;
                            f7 = fFloatValue;
                            qz0Var2 = qz0Var3;
                            qp2Var2 = qp2Var6;
                            qp2Var = qp2Var5;
                            sy7.d(null, sampleWatch2, j19, f9, qz0Var2, 0);
                            z = false;
                        }
                        qz0Var2.q(z);
                        hx4 hx4VarA2 = bd8.a(b.d(ex4.b, 2 * f9), Long.valueOf(j19), new ir.myket.player.ui.client.controllers.common.b(j19, dp2Var, ref$LongRef, wb5Var2));
                        cl4 cl4VarD = bg0.d(eq.j, false);
                        long j21 = qz0Var2.T;
                        int i6 = (int) (j21 ^ (j21 >>> 32));
                        j56 j56VarL3 = qz0Var2.l();
                        hx4 hx4VarC4 = androidx.compose.ui.b.c(qz0Var2, hx4VarA2);
                        qz0Var2.e0();
                        if (qz0Var2.S) {
                            qz0Var2.k(bp2Var2);
                        } else {
                            qz0Var2.o0();
                        }
                        ia7.o(qz0Var2, qp2Var3, cl4VarD);
                        ia7.o(qz0Var2, qp2Var4, j56VarL3);
                        ia7.g(qz0Var2, Integer.valueOf(i6), qp2Var);
                        ia7.n(qz0Var2, dp2Var2);
                        ia7.o(qz0Var2, qp2Var2, hx4VarC4);
                        boolean zC = qz0Var2.c(f7);
                        Object objM4 = qz0Var2.M();
                        if (zC || objM4 == avVar2) {
                            objM4 = new bp2() { // from class: lf6
                                @Override // defpackage.bp2
                                public final Object invoke() {
                                    return Float.valueOf(f7);
                                }
                            };
                            qz0Var2.l0(objM4);
                        }
                        bp2 bp2Var4 = (bp2) objM4;
                        zl6 zl6Var2 = zl6Var;
                        boolean zH = qz0Var2.h(zl6Var2);
                        Object objM5 = qz0Var2.M();
                        if (zH || objM5 == avVar2) {
                            objM5 = new o06(6, zl6Var2);
                            qz0Var2.l0(objM5);
                        }
                        qz0 qz0Var4 = qz0Var2;
                        yh0.j(bp2Var4, (bp2) objM5, j10, j11, j13, j12, f9, fQ, qz0Var4, 0);
                        qz0Var4.q(true);
                        qz0Var4.q(true);
                        yh0.i(null, xa7.f(context4, zk8.o0(j19 - jW)), 5, qz0Var4, 0);
                        qz0Var4.q(true);
                    } else {
                        qz0Var3.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 56);
            f4 = f6;
            j6 = j10;
            j7 = j11;
            j8 = j13;
            j9 = j12;
            f5 = fQ;
        } else {
            qz0Var.U();
            j6 = j2;
            j7 = j3;
            j8 = j4;
            j9 = j5;
            f4 = f2;
            f5 = f3;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: kf6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(i2 | 1);
                    yh0.h(hx4Var, bp2Var, sampleWatch, dp2Var, j6, j7, j8, j9, f4, f5, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void i(hx4 hx4Var, String str, int i2, qz0 qz0Var, int i3) {
        hx4 hx4Var2;
        qz0Var.c0(-622666627);
        int i4 = i3 | 6 | (qz0Var.f(str) ? 32 : 16) | (qz0Var.d(i2) ? 256 : 128);
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).d;
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA = ix4.a(ex4Var, gj8Var, "00:00:00", qz0Var, 390);
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            mi8.b(str, hx4VarA, ((tj8) objJ).j, 0L, 0L, new of8(i2), 0L, 0, false, 0, 0, null, qz0Var, (i4 >> 3) & 14, (i4 >> 6) & 14, 261112);
            hx4Var2 = ex4Var;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(hx4Var2, str, i2, i3);
        }
    }

    public static final void j(final bp2 bp2Var, final bp2 bp2Var2, final long j2, final long j3, final long j4, final long j5, final float f2, final float f3, qz0 qz0Var, final int i2) {
        int i3;
        qz0Var.c0(-204767531);
        int i4 = i2 | (qz0Var.h(bp2Var) ? 4 : 2) | (qz0Var.h(bp2Var2) ? 32 : 16) | (qz0Var.e(j2) ? 256 : 128) | (qz0Var.e(j3) ? 2048 : 1024) | (qz0Var.e(j4) ? 16384 : 8192) | (qz0Var.e(j5) ? 131072 : 65536) | (qz0Var.c(f2) ? 1048576 : 524288) | (qz0Var.c(f3) ? 8388608 : 4194304);
        if (qz0Var.R(i4 & 1, (i4 & 4793491) != 4793490)) {
            hx4 hx4VarD = D(b.c(ex4.b, 1.0f), 0.0f, 0.0f, 0.0f, f2, 7);
            boolean z = ((i4 & 14) == 4) | ((i4 & 896) == 256) | ((29360128 & i4) == 8388608) | ((57344 & i4) == 16384) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((i4 & 3670016) == 1048576);
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                i3 = 0;
                objM = new dp2() { // from class: mf6
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        hv1 hv1Var = (hv1) obj;
                        js3.p(hv1Var, "$this$Canvas");
                        float fFloatValue = ((Number) bp2Var.invoke()).floatValue();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) / 2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        float f4 = f3;
                        hv1Var.y(j2, jFloatToRawIntBits, jFloatToRawIntBits2, hv1Var.S(f4), (496 & 16) != 0 ? 0 : 1);
                        hv1Var.y(j4, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(((Number) bp2Var2.invoke()).floatValue() * fIntBitsToFloat) << 32), hv1Var.S(f4), (496 & 16) != 0 ? 0 : 1);
                        float f5 = fFloatValue * fIntBitsToFloat;
                        hv1Var.y(j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), hv1Var.S(f4), (496 & 16) != 0 ? 0 : 1);
                        o40.g(hv1Var, j5, hv1Var.S(f2), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), null, 120);
                        return tx8.a;
                    }
                };
                qz0Var.l0(objM);
            } else {
                i3 = 0;
            }
            ml9.c(hx4VarD, (dp2) objM, qz0Var, i3);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(bp2Var2, j2, j3, j4, j5, f2, f3, i2) { // from class: nf6
                public final /* synthetic */ bp2 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yh0.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (qz0) obj, hs9.W(1));
                    return tx8.a;
                }
            };
        }
    }

    public static void k(ws5 ws5Var, g64 g64Var, dp2 dp2Var) {
        js3.p(ws5Var, "<this>");
        ws5Var.a(g64Var, new h40(4, dp2Var, false));
    }

    public static int l(int i2, int i3) {
        return (i2 & 16777215) | (i3 << 24);
    }

    public static String m(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = j;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static final float n(wy5 wy5Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.a ? wy5Var.b(layoutDirection) : wy5Var.a(layoutDirection);
    }

    public static final float o(wy5 wy5Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.a ? wy5Var.a(layoutDirection) : wy5Var.b(layoutDirection);
    }

    public static Parcelable p(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList q(List list, Parcelable.Creator creator) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(p((Parcelable) list.get(i2), creator));
        }
        return arrayList;
    }

    public static Bundle r(String str, boolean z, Tracker tracker, String str2) {
        js3.p(str, "packageName");
        js3.p(str2, "refId");
        return new hp(str, z, tracker, false, null, str2, null, null, null, null, null, null, null).a();
    }

    public static ImmutableList s(yp2 yp2Var, List list) {
        lj3 lj3VarM = ImmutableList.m();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            lj3VarM.O(yp2Var.apply(bundle));
        }
        return lj3VarM.S();
    }

    public static oi5 t(u79 u79Var) {
        z7 z7Var = pi5.a;
        j71 j71Var = j71.b;
        js3.p(z7Var, "factory");
        js3.p(j71Var, "extras");
        o77 o77Var = new o77(u79Var, z7Var, j71Var);
        ps0 ps0VarA = g27.a(oi5.class);
        String strB = ps0VarA.b();
        if (strB != null) {
            return (oi5) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final Class u(zw3 zw3Var) {
        js3.p(zw3Var, "<this>");
        Class clsA = ((os0) zw3Var).a();
        js3.n(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class v(zw3 zw3Var) {
        js3.p(zw3Var, "<this>");
        Class clsA = ((os0) zw3Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static oo2 w(ca7 ca7Var, SQLiteDatabase sQLiteDatabase) {
        js3.p(ca7Var, "refHolder");
        oo2 oo2Var = (oo2) ca7Var.b;
        if (oo2Var != null && oo2Var.a.equals(sQLiteDatabase)) {
            return oo2Var;
        }
        oo2 oo2Var2 = new oo2(sQLiteDatabase);
        ca7Var.b = oo2Var2;
        return oo2Var2;
    }

    public static boolean x(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (l[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final hx4 y(hx4 hx4Var, wy5 wy5Var) {
        return hx4Var.d(new vy5(wy5Var, new sm5(9)));
    }

    public static final hx4 z(hx4 hx4Var, float f2) {
        return hx4Var.d(new sy5(f2, f2, f2, f2, true, new sm5(11)));
    }
}
