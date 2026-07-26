package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Looper;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.platform.p;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.paging.LoadType;
import androidx.paging.i;
import coil3.size.Scale;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.views.FastDownloadView;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml9 implements s82 {
    public static ClassLoader a;
    public static Thread b;
    public static final a c = new a(465759914, new yf(3), false);
    public static final a d = new a(-698601725, new yf(4), false);
    public static final a e = new a(1615636106, new sy0(0), false);
    public static final av f;
    public static final long[] g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static ei4 l;
    public static final /* synthetic */ int m = 0;

    static {
        new a(-1361332084, new yf(5), false);
        f = new av(20);
        g = new long[0];
    }

    public static final e66 A(Map map) {
        e66 e66Var = map instanceof e66 ? (e66) map : null;
        if (e66Var != null) {
            return e66Var;
        }
        c66 c66Var = map instanceof c66 ? (c66) map : null;
        e66 e66VarBuild = c66Var != null ? c66Var.build() : null;
        if (e66VarBuild != null) {
            return e66VarBuild;
        }
        h66 h66Var = h66.d;
        js3.n(h66Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
        if (map.isEmpty()) {
            return h66Var;
        }
        i66 i66Var = new i66(h66Var);
        i66Var.putAll(map);
        return i66Var.build();
    }

    public static final v1 B(Iterable iterable) {
        js3.p(iterable, "<this>");
        v1 v1Var = iterable instanceof v1 ? (v1) iterable : null;
        if (v1Var != null) {
            return v1Var;
        }
        b66 b66Var = iterable instanceof b66 ? (b66) iterable : null;
        v1 v1VarE = b66Var != null ? ((u66) b66Var).e() : null;
        if (v1VarE != null) {
            return v1VarE;
        }
        kz7 kz7Var = kz7.b;
        js3.p(kz7Var, "<this>");
        if (!(iterable instanceof Collection)) {
            u66 u66VarC = kz7Var.c();
            kotlin.collections.a.b0(iterable, u66VarC);
            return u66VarC.e();
        }
        Collection collection = (Collection) iterable;
        Object[] objArr = kz7Var.a;
        if (collection.isEmpty()) {
            return kz7Var;
        }
        if (collection.size() + objArr.length > 32) {
            u66 u66VarC2 = kz7Var.c();
            u66VarC2.addAll(collection);
            return u66VarC2.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new kz7(objArrCopyOf);
    }

    public static int C(no1 no1Var, Scale scale) {
        if (no1Var instanceof lo1) {
            return ((lo1) no1Var).a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final hx4 D(hx4 hx4Var, dp2 dp2Var, dp2 dp2Var2) {
        return hx4Var.d(new xd8(dp2Var, dp2Var2));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader E() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml9.E():java.lang.ClassLoader");
    }

    public static final void a(qz4 qz4Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(907064806);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(qz4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = qz4Var.b.ordinal();
            if (iOrdinal == 0) {
                qz0Var.a0(-1566428537);
                i8 i8Var = qz4Var.f;
                if (i8Var == null) {
                    qz0Var.a0(-1566428538);
                } else {
                    qz0Var.a0(-1566428537);
                    ir.myket.player.ui.client.ad.components.a.a(i8Var, qz0Var, 0);
                }
                qz0Var.q(false);
                qz0Var.q(false);
            } else if (iOrdinal == 1) {
                qz0Var.a0(-1566327725);
                wa waVar = qz4Var.g;
                if (waVar == null) {
                    qz0Var.a0(-1566327726);
                } else {
                    qz0Var.a0(-1566327725);
                    rf0.a(waVar, dp2Var, qz0Var, i3 & 112);
                }
                qz0Var.q(false);
                qz0Var.q(false);
            } else {
                if (iOrdinal != 2) {
                    qz0Var.a0(-189079027);
                    qz0Var.q(false);
                    throw new NoWhenBranchMatchedException();
                }
                qz0Var.a0(-1566203942);
                qz0Var.q(false);
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(qz4Var, dp2Var, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(bx bxVar, hx4 hx4Var, dp2 dp2Var, qd qdVar, q41 q41Var, tc0 tc0Var, qz0 qz0Var, int i2, int i3) throws Throwable {
        int i4;
        qd qdVar2;
        tc0 tc0Var2;
        int i5;
        Throwable th;
        pi3 pi3Var;
        coil3.compose.a aVar;
        qz0Var.c0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (qz0Var.f(bxVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= qz0Var.f(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= qz0Var.f(hx4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= qz0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            qdVar2 = qdVar;
            i4 |= qz0Var.f(qdVar2) ? 131072 : 65536;
        } else {
            qdVar2 = qdVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= qz0Var.f(q41Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= qz0Var.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            tc0Var2 = tc0Var;
            i4 |= qz0Var.f(tc0Var2) ? 67108864 : 33554432;
        } else {
            tc0Var2 = tc0Var;
        }
        if ((805306368 & i2) == 0) {
            i4 |= qz0Var.d(1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (qz0Var.g(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (qz0Var.R(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            Object obj = bxVar.a;
            int i6 = q29.b;
            qz0Var.a0(-329318062);
            boolean z = obj instanceof pi3;
            Object obj2 = jz0.a;
            if (z) {
                qz0Var.a0(-1008895720);
                pi3 pi3Var2 = (pi3) obj;
                if (pi3Var2.t.g != null) {
                    qz0Var.a0(-1008855668);
                    qz0Var.q(false);
                    qz0Var.q(false);
                    qz0Var.q(false);
                } else {
                    qz0Var.a0(-1008807494);
                    my7 my7VarA = q29.a(q41Var, qz0Var);
                    boolean zF = qz0Var.f(pi3Var2) | qz0Var.f(my7VarA);
                    Object objM = qz0Var.M();
                    if (zF || objM == obj2) {
                        mi3 mi3VarA = pi3.a(pi3Var2);
                        mi3VarA.m = my7VarA;
                        objM = mi3VarA.a();
                        qz0Var.l0(objM);
                    }
                    pi3Var2 = (pi3) objM;
                    qz0Var.q(false);
                    qz0Var.q(false);
                    qz0Var.q(false);
                }
                pi3Var = pi3Var2;
                th = null;
            } else {
                qz0Var.a0(-1008549326);
                Context context = (Context) qz0Var.j(e.b);
                my7 my7VarA2 = q29.a(q41Var, qz0Var);
                boolean zF2 = qz0Var.f(context) | qz0Var.f(obj) | qz0Var.f(my7VarA2);
                th = null;
                Object objM2 = qz0Var.M();
                if (zF2 || objM2 == obj2) {
                    mi3 mi3Var = new mi3(context);
                    mi3Var.c = obj;
                    mi3Var.m = my7VarA2;
                    objM2 = mi3Var.a();
                    qz0Var.l0(objM2);
                }
                qz0Var.q(false);
                qz0Var.q(false);
                pi3Var = (pi3) objM2;
            }
            Object obj3 = pi3Var.b;
            if (obj3 instanceof mi3) {
                throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            }
            if (obj3 instanceof og) {
                q29.c("ImageBitmap");
                throw th;
            }
            if (obj3 instanceof wi3) {
                q29.c("ImageVector");
                throw th;
            }
            if (obj3 instanceof g16) {
                q29.c("Painter");
                throw th;
            }
            if (pi3Var.c != null) {
                throw new IllegalArgumentException("request.target must be null.");
            }
            if (((i64) gu9.q(pi3Var, si3.e)) != null) {
                throw new IllegalArgumentException("request.lifecycle must be null.");
            }
            hi3 hi3Var = bxVar.c;
            ww wwVar = bxVar.b;
            if (((Boolean) qz0Var.j(p.a)).booleanValue()) {
                qz0Var.a0(2019071620);
                coil3.compose.a aVar2 = (coil3.compose.a) qz0Var.j(pb4.a);
                qz0Var.q(false);
                aVar = aVar2;
            } else {
                qz0Var.a0(2019129125);
                qz0Var.q(false);
                aVar = th;
            }
            hx4 hx4VarD = hx4Var.d(new n41(pi3Var, hi3Var, wwVar, dp2Var, qdVar2, q41Var, tc0Var2, aVar));
            lh lhVar = lh.h;
            int iB = ok4.B(qz0Var);
            hx4 hx4VarC = b.c(qz0Var, hx4VarD);
            j56 j56VarL = qz0Var.l();
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, lhVar);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.o(qz0Var, d.d, hx4VarC);
            qp2 qp2Var = d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new vw(bxVar, hx4Var, dp2Var, qdVar, q41Var, tc0Var, i2, i3);
        }
    }

    public static final void c(hx4 hx4Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (qz0Var.h(dp2Var) ? 32 : 16);
        if (qz0Var.R(i4 & 1, (i4 & 19) != 18)) {
            z27.a(qz0Var, wn5.A(hx4Var, dp2Var));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new xm0(i2, 0, dp2Var, hx4Var);
        }
    }

    public static i d(List list, int i2, int i3, na4 na4Var, na4 na4Var2) {
        js3.p(list, "pages");
        js3.p(na4Var, "sourceLoadStates");
        return new i(LoadType.a, list, i2, i3, na4Var, na4Var2);
    }

    public static final void e(t34 t34Var, Object obj, int i2, Object obj2, qz0 qz0Var, int i3) {
        qz0Var.c0(1439843069);
        int i4 = (qz0Var.f(t34Var) ? 4 : 2) | i3 | (qz0Var.f(obj) ? 32 : 16) | (qz0Var.d(i2) ? 256 : 128) | (qz0Var.f(obj2) ? 2048 : 1024);
        if (qz0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            ((bd7) obj).c(obj2, s7.X(980966366, new y24(i2, t34Var, obj2), qz0Var), qz0Var, 48);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(t34Var, obj, i2, obj2, i3);
        }
    }

    public static final float f(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void g(q12 q12Var) {
        js3.p(q12Var, "<this>");
        if ((q12Var instanceof qv3 ? (qv3) q12Var : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + g27.a(q12Var.getClass()));
    }

    public static final hv3 h(cc1 cc1Var) {
        js3.p(cc1Var, "<this>");
        hv3 hv3Var = cc1Var instanceof hv3 ? (hv3) cc1Var : null;
        if (hv3Var != null) {
            return hv3Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + g27.a(cc1Var.getClass()));
    }

    public static final long k(int i2, int i3, dy7 dy7Var, Scale scale, dy7 dy7Var2) {
        int i4;
        int i5;
        if (!js3.i(dy7Var, dy7.c)) {
            i2 = C(dy7Var.a, scale);
            i3 = C(dy7Var.b, scale);
        }
        no1 no1Var = dy7Var2.a;
        no1 no1Var2 = dy7Var2.b;
        if ((no1Var instanceof lo1) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((lo1) no1Var).a)) {
            i2 = i5;
        }
        if ((no1Var2 instanceof lo1) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((lo1) no1Var2).a)) {
            i3 = i4;
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final double l(int i2, int i3, int i4, int i5, Scale scale) {
        double d2 = ((double) i4) / ((double) i2);
        double d3 = ((double) i5) / ((double) i3);
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d2, d3);
        }
        if (iOrdinal == 1) {
            return Math.min(d2, d3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wb5 m() {
        return g.g(tx8.a, th0.p);
    }

    public static boolean o(Set set, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(r1 r1Var, Map.Entry entry) {
        js3.p(entry, "element");
        V v = r1Var.get(entry.getKey());
        return v != 0 ? v.equals(entry.getValue()) : entry.getValue() == null && r1Var.containsKey(entry.getKey());
    }

    public static final float q(int i2, qz0 qz0Var) {
        return ((Resources) qz0Var.j(e.c)).getDimension(i2) / ((qj1) qz0Var.j(l.h)).getDensity();
    }

    public static LayerDrawable r(Context context) {
        int i2 = sj8.b().u;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        float f2 = 2;
        gradientDrawable.setCornerRadius(context.getResources().getDimension(pq6.movie_horizontal_progress_height) / f2);
        int i3 = sj8.b().j;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(i3);
        gradientDrawable2.setCornerRadius(context.getResources().getDimension(pq6.movie_horizontal_progress_height) / f2);
        ScaleDrawable scaleDrawable = new ScaleDrawable(gradientDrawable2, 3, 1.0f, 0.0f);
        scaleDrawable.setLevel(10000);
        return new LayerDrawable(new Drawable[]{gradientDrawable, scaleDrawable});
    }

    public static final qx4 s(w61 w61Var) {
        qx4 qx4Var = (qx4) w61Var.r0(eq.D);
        if (qx4Var != null) {
            return qx4Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final hx4 t(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new ur5(dp2Var, new y8(4, dp2Var), true));
    }

    public static hx4 u(hx4 hx4Var, float f2) {
        return hx4Var.d(new pr5(0, f2, new sm5(3)));
    }

    public static uo6 w(ExoPlayer exoPlayer, xc6 xc6Var, uo6 uo6Var) {
        Object next;
        zo8 zo8Var;
        yo8 yo8VarA;
        js3.p(exoPlayer, "player");
        js3.p(xc6Var, "playerConfig");
        js3.p(uo6Var, "newSelectedQuality");
        e62 e62Var = (e62) exoPlayer;
        vh1 vh1Var = (vh1) e62Var.V();
        vh1Var.getClass();
        uh1 uh1Var = new uh1(vh1Var);
        ListIterator listIterator = xc6Var.i.listIterator();
        while (true) {
            rz2 rz2Var = (rz2) listIterator;
            if (!rz2Var.hasNext()) {
                next = null;
                break;
            }
            next = rz2Var.next();
            if (((uo6) next).a() == uo6Var.a()) {
                break;
            }
        }
        uo6 uo6Var2 = (uo6) next;
        if (uo6Var2 == null) {
            uo6.e.getClass();
            uo6Var2 = uo6.g;
        }
        uo6.e.getClass();
        if (js3.i(uo6Var2, uo6.g)) {
            uh1Var.d(2);
        } else {
            ei4 ei4Var = l;
            if (ei4Var != null && (zo8Var = ei4Var.c[0]) != null && (yo8VarA = zo8Var.a(uo6Var2.b)) != null) {
                uh1Var.h(new ep8(yo8VarA, ImmutableList.s(Integer.valueOf(uo6Var2.c))));
            }
        }
        e62Var.w(new vh1(uh1Var));
        return uo6Var2;
    }

    public static final boolean x(ja9 ja9Var, ja9 ja9Var2, LoadType loadType) {
        js3.p(ja9Var, "<this>");
        if (ja9Var2 == null || ((ja9Var2 instanceof ia9) && (ja9Var instanceof ha9))) {
            return true;
        }
        if ((ja9Var instanceof ia9) && (ja9Var2 instanceof ha9)) {
            return false;
        }
        return (ja9Var.c == ja9Var2.c && ja9Var.d == ja9Var2.d && ja9Var2.a(loadType) <= ja9Var.a(loadType)) ? false : true;
    }

    public static wv8 y(int i2, f82 f82Var) {
        boolean z = false;
        return new wv8(new di6(i2), f82Var, f, z, 29);
    }

    public static final pj3 z(Iterable iterable) {
        js3.p(iterable, "<this>");
        pj3 pj3Var = iterable instanceof pj3 ? (pj3) iterable : null;
        return pj3Var == null ? B(iterable) : pj3Var;
    }

    public sl i(Context context, Looper looper, on onVar, Object obj, iu2 iu2Var, ju2 ju2Var) {
        return j(context, looper, onVar, obj, (wh9) iu2Var, (wh9) ju2Var);
    }

    public sl j(Context context, Looper looper, on onVar, Object obj, wh9 wh9Var, wh9 wh9Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        v(fastDownloadView, r82Var);
    }

    public abstract void v(FastDownloadView fastDownloadView, r82 r82Var);
}
