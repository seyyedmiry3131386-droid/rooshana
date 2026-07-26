package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.a;
import androidx.compose.material3.m;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.e;
import androidx.core.content.FileProvider;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.j256.ormlite.stmt.query.SimpleComparison;
import ir.myket.callback.domain.models.CallbackUrlType;
import ir.myket.player.domain.models.PlayerMovieData;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class tv8 {
    public static final mu3 b;
    public static final mu3 c;
    public static final mu3 d;
    public static final mu3 e;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final Object[] a = new Object[0];
    public static final byte[] f = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] g = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    static {
        int i2 = 1;
        b = new mu3("REMOVED_TASK", i2);
        c = new mu3("CLOSED_EMPTY", i2);
        d = new mu3("NO_OWNER", i2);
        e = new mu3("ALREADY_LOCKED_BY_OWNER", i2);
    }

    public static final int A(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final Object[] B(Collection collection) {
        js3.p(collection, "collection");
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                js3.o(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                js3.o(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static final Object[] C(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        js3.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        js3.o(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        js3.o(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static Object[] D(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        }
        m(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static final ql0 E(vl0 vl0Var) {
        Object next;
        js3.p(vl0Var, "<this>");
        String str = vl0Var.b;
        String str2 = vl0Var.c;
        Enum r2 = CallbackUrlType.m;
        Iterator<E> it = CallbackUrlType.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m88.T(((Enum) next).name(), str2, true)) {
                break;
            }
        }
        Enum r4 = (Enum) next;
        if (r4 != null) {
            r2 = r4;
        }
        return new ql0(str, (CallbackUrlType) r2, vl0Var.d);
    }

    public static final void F(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            un3.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        un3.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static final void a(hx4 hx4Var, int i2, bp2 bp2Var, qz0 qz0Var, int i3) {
        qz0Var.c0(-477294273);
        int i4 = (qz0Var.f(hx4Var) ? 4 : 2) | i3 | (qz0Var.d(i2) ? 32 : 16) | (qz0Var.h(bp2Var) ? 256 : 128);
        int i5 = 0;
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            hx4 hx4VarD = b.d(ex4.b, ml9.q(hq6.action_button_height, qz0Var)).d(hx4Var);
            ka7 ka7Var = la7.a;
            wy5 wy5Var = ci0.a;
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            long j2 = ((tj8) objJ).I.a;
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            a.a(bp2Var, hx4VarD, false, ka7Var, ci0.a(((tj8) objJ2).l, j2, 0L, 0L, qz0Var, 12), null, null, yh0.d(0.0f, 0.0f, 3), s7.X(972375887, new z5(i2, i5), qz0Var), qz0Var, ((i4 >> 6) & 14) | 817889280, 356);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(hx4Var, i2, bp2Var, i3);
        }
    }

    public static p67 b(int i2, fj2 fj2Var, int i3) {
        if ((i3 & 2) != 0) {
            fj2Var = fj2.e;
        }
        return new p67(i2, fj2Var, new ej2(new dj2[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(ir.myket.theme.common.colors.models.UiMode r115, androidx.compose.runtime.internal.a r116, defpackage.qz0 r117, int r118) {
        /*
            Method dump skipped, instruction units count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv8.c(ir.myket.theme.common.colors.models.UiMode, androidx.compose.runtime.internal.a, qz0, int):void");
    }

    public static final void d(dl5 dl5Var, final ExoPlayer exoPlayer, PlayerMovieData playerMovieData, qz0 qz0Var, int i2) {
        Object d87Var;
        qz0Var.c0(-241549627);
        int i3 = i2 | (qz0Var.f(dl5Var) ? 4 : 2) | (qz0Var.h(exoPlayer) ? 32 : 16) | (qz0Var.h(playerMovieData) ? 256 : 128);
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            a88 a88Var = new a88("VIDEO_PLAYER");
            qz0Var.a0(-1168520582);
            lf7 lf7VarA = oz3.a(qz0Var);
            qz0Var.a0(-1633490746);
            boolean zF = qz0Var.f(a88Var) | qz0Var.f(lf7VarA);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (zF || objM == obj) {
                objM = lf7VarA.b(g27.a(of6.class), null, a88Var);
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            qz0Var.q(false);
            of6 of6Var = (of6) objM;
            qz0Var.a0(-200950183);
            qz0Var.a0(-200950375);
            if (Build.VERSION.SDK_INT >= 24) {
                boolean zH = qz0Var.h(exoPlayer);
                Object objM2 = qz0Var.M();
                if (zH || objM2 == obj) {
                    final int i4 = 0;
                    objM2 = new dp2() { // from class: sc6
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj2) {
                            switch (i4) {
                                case 0:
                                    p64 p64Var = (p64) obj2;
                                    js3.p(p64Var, "$this$LifecycleStartEffect");
                                    return new a9(p64Var, exoPlayer, 2);
                                default:
                                    l64 l64Var = (l64) obj2;
                                    js3.p(l64Var, "$this$LifecycleResumeEffect");
                                    return new b9(l64Var, exoPlayer, 1);
                            }
                        }
                    };
                    qz0Var.l0(objM2);
                }
                at2.I(null, (dp2) objM2, qz0Var, 6);
                d87Var = new e87(tx8.a);
            } else {
                d87Var = new d87();
            }
            qz0Var.q(false);
            if (d87Var instanceof d87) {
                boolean zH2 = qz0Var.h(exoPlayer);
                Object objM3 = qz0Var.M();
                if (zH2 || objM3 == obj) {
                    final int i5 = 1;
                    objM3 = new dp2() { // from class: sc6
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    p64 p64Var = (p64) obj2;
                                    js3.p(p64Var, "$this$LifecycleStartEffect");
                                    return new a9(p64Var, exoPlayer, 2);
                                default:
                                    l64 l64Var = (l64) obj2;
                                    js3.p(l64Var, "$this$LifecycleResumeEffect");
                                    return new b9(l64Var, exoPlayer, 1);
                            }
                        }
                    };
                    qz0Var.l0(objM3);
                }
                at2.G(null, (dp2) objM3, qz0Var, 6);
            }
            qz0Var.q(false);
            int i6 = i3 << 3;
            of6Var.a(b.c, dl5Var, exoPlayer, playerMovieData, qz0Var, (i6 & 112) | 6 | (i6 & 896) | (i6 & 7168));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new kz(dl5Var, exoPlayer, playerMovieData, i2, 1);
        }
    }

    public static final void e(final pg0 pg0Var, hx4 hx4Var, ey6 ey6Var, final dp2 dp2Var, final int i2, qz0 qz0Var, int i3) {
        int i4;
        js3.p(pg0Var, "<this>");
        js3.p(ey6Var, "recommendationViewState");
        qz0Var.c0(-1989178370);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.f(pg0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= qz0Var.h(ey6Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= qz0Var.d(i2) ? 16384 : 8192;
        }
        if (qz0Var.R(i4 & 1, (i4 & 9363) != 9362)) {
            final boolean z = ((Configuration) qz0Var.j(e.a)).orientation == 1;
            za0 za0Var = yh0.b;
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = new sm5(29);
                qz0Var.l0(objM);
            }
            androidx.compose.animation.a.b(ey6Var, hx4Var, (dp2) objM, za0Var, "RecommendationDrawer", null, s7.X(2110800820, new sp2() { // from class: mx6
                @Override // defpackage.sp2
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    ey6 ey6Var2 = (ey6) obj2;
                    qz0 qz0Var2 = (qz0) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    js3.p((mj) obj, "$this$AnimatedContent");
                    js3.p(ey6Var2, "viewState");
                    boolean z2 = ey6Var2 instanceof dy6;
                    dp2 dp2Var2 = dp2Var;
                    int i5 = i2;
                    ex4 ex4Var = ex4.b;
                    if (z2) {
                        qz0Var2.a0(251146187);
                        pg0 pg0Var2 = pg0Var;
                        float fB = pg0Var2.b();
                        qj1 qj1Var = pg0Var2.a;
                        long j2 = pg0Var2.b;
                        ub1.f(b.l(ex4Var, Math.min(d77.c(hq6.recommendation_drawer_width_fraction, qz0Var2) * Math.max(fB, h31.c(j2) ? qj1Var.J(h31.g(j2)) : Float.POSITIVE_INFINITY), d77.c(hq6.recommendation_drawer_max_width_fraction, qz0Var2) * pg0Var2.b())), (dy6) ey6Var2, dp2Var2, i5, qz0Var2, iIntValue & 112, 0);
                        qz0Var2.q(false);
                    } else {
                        if (!(ey6Var2 instanceof cy6)) {
                            qz0Var2.a0(1255025825);
                            qz0Var2.q(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        qz0Var2.a0(251642559);
                        WeakHashMap weakHashMap = rf9.w;
                        s7.a(yh0.D(ix4.b(ex4Var, z, vy2.P(ex4Var, new s64(js8.l(qz0Var2).b, 16))), 0.0f, ml9.q(hq6.space_60, qz0Var2), 0.0f, 0.0f, 13), (cy6) ey6Var2, dp2Var2, i5, qz0Var2, iIntValue & 112);
                        qz0Var2.q(false);
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, ((i4 >> 6) & 14) | 1597824 | (i4 & 112), 32);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new sb(pg0Var, hx4Var, ey6Var, dp2Var, i2, i3);
        }
    }

    public static void f(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(rm7.n(i3, "at index "));
            }
        }
    }

    public static boolean g(w72 w72Var) {
        h26 h26Var = new h26(8);
        int i2 = ca4.a(w72Var, h26Var).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        w72Var.q(h26Var.a, 0, 4);
        h26Var.J(0);
        int iJ = h26Var.j();
        if (iJ == 1463899717) {
            return true;
        }
        wn5.F("WavHeaderReader", "Unsupported form type: " + iJ);
        return false;
    }

    public static final void h(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                wu8.f(th, th2);
            }
        }
    }

    public static void i(xa1 xa1Var) {
        if (xa1Var != null) {
            try {
                xa1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long[] j(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i2 = (int) length;
        wn5.f(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i2));
        long[] jArr3 = new long[i2];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static final dl k(dl dlVar) {
        dl dlVarC = dlVar.c();
        int iB = dlVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            dlVarC.e(i2, dlVar.a(i2));
        }
        return dlVarC;
    }

    public static final long l(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j2 * 1000000;
    }

    public static void m(Collection collection, Object[] objArr) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    public static String n(String str, Object obj, Object obj2) {
        return ((str == null || str.length() <= 0) ? "" : str.concat(" ")) + "expected:<" + obj + "> but was:<" + obj2 + SimpleComparison.GREATER_THAN_OPERATION;
    }

    public static final y61 o(Executor executor) {
        return new v42(executor);
    }

    public static String p(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((dp8) it.next()).a.g.n;
            if (tv4.l(str2)) {
                return "video/mp4";
            }
            if (tv4.i(str2)) {
                z = true;
            } else if (tv4.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static Object q(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object r(yk4 yk4Var) {
        Object objV = yk4Var.v();
        b14 b14Var = objV instanceof b14 ? (b14) objV : null;
        if (b14Var != null) {
            return b14Var.o;
        }
        return null;
    }

    public static final Intent s(r69 r69Var, k68 k68Var, String str) {
        js3.p(k68Var, "storageUtils");
        js3.p(str, "mediaName");
        File file = new File(k68.f(), str);
        Object e87Var = Build.VERSION.SDK_INT >= 24 ? new e87(FileProvider.d(r69Var, file)) : new d87();
        Object objFromFile = e87Var instanceof d87 ? Uri.fromFile(file) : ((e87) e87Var).a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType((Uri) objFromFile, "video/*");
        intent.addFlags(1);
        Intent intentCreateChooser = Intent.createChooser(intent, r69Var.getResources().getString(rs6.movie_download_open_with));
        js3.o(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    public static String t(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return rm7.o(i2, "unknown status code: ", new StringBuilder(String.valueOf(i2).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static int u(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static aj6 v(String str, ut4 ut4Var, dp2 dp2Var, int i2) {
        if ((i2 & 2) != 0) {
            ut4Var = null;
        }
        if ((i2 & 4) != 0) {
            dp2Var = new sm5(23);
        }
        ug1 ug1Var = up1.a;
        kf1 kf1Var = kf1.c;
        ub8 ub8VarA = a27.a();
        kf1Var.getClass();
        e51 e51VarA = js3.a(bt2.L(kf1Var, ub8VarA));
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new aj6(str, ut4Var, dp2Var, e51VarA);
    }

    public static final Object w(d dVar, int i2, dp2 dp2Var) {
        int i3;
        int i4;
        Object objInvoke;
        gx4 gx4VarJ;
        q24 q24VarG0;
        int iMax;
        int size;
        int i5;
        z4 z4Var;
        if (!dVar.a.n) {
            rn3.b("visitAncestors called on an unattached node");
        }
        gx4 gx4Var = dVar.a.e;
        h hVarH = y40.H(dVar);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
            if (hVarH == null) {
                gx4VarJ = null;
                break;
            }
            if ((((gx4) hVarH.H.g).d & 1024) != 0) {
                while (gx4Var != null) {
                    if ((gx4Var.c & 1024) != 0) {
                        gx4VarJ = gx4Var;
                        zb5 zb5Var = null;
                        while (gx4VarJ != null) {
                            if (gx4VarJ instanceof d) {
                                break loop0;
                            }
                            if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                int i6 = 0;
                                for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                    if ((gx4Var2.c & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            gx4VarJ = gx4Var2;
                                        } else {
                                            if (zb5Var == null) {
                                                zb5Var = new zb5(0, new gx4[16]);
                                            }
                                            if (gx4VarJ != null) {
                                                zb5Var.b(gx4VarJ);
                                                gx4VarJ = null;
                                            }
                                            zb5Var.b(gx4Var2);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            gx4VarJ = y40.j(zb5Var);
                        }
                    }
                    gx4Var = gx4Var.e;
                }
            }
            hVarH = hVarH.F();
            gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
        }
        d dVar2 = (d) gx4VarJ;
        if ((dVar2 != null && js3.i(dVar2.G0(), dVar.G0())) || (q24VarG0 = dVar.G0()) == null) {
            return null;
        }
        int i7 = 5;
        if (i2 != 5) {
            i7 = 6;
            if (i2 != 6) {
                i7 = 3;
                if (i2 != 3) {
                    i7 = 4;
                    if (i2 != 4) {
                        if (i2 == 1) {
                            i7 = 2;
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i7 = 1;
                        }
                    }
                }
            }
        }
        if (q24VarG0.o.a.g().n <= 0 || q24VarG0.o.a.g().k.isEmpty() || !q24VarG0.n) {
            return dp2Var.invoke(q24.r);
        }
        if (q24VarG0.D0(i7)) {
            r34 r34Var = q24VarG0.o;
            iMax = Math.min(r34Var.a.g().n - 1, ((w34) kotlin.collections.a.u0(r34Var.a.g().k)).a);
        } else {
            iMax = Math.max(0, q24VarG0.o.a.e.q());
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        qm5 qm5Var = q24VarG0.p;
        qm5Var.getClass();
        m24 m24Var = new m24(iMax, iMax);
        ((zb5) qm5Var.b).b(m24Var);
        ref$ObjectRef.a = m24Var;
        androidx.compose.foundation.lazy.b bVar = q24VarG0.o.a;
        if (bVar.g().k.isEmpty()) {
            i4 = 0;
        } else {
            v34 v34VarG = bVar.g();
            int iG = (int) (v34VarG.o == Orientation.a ? v34VarG.g() & 4294967295L : v34VarG.g() >> 32);
            v34 v34VarG2 = bVar.g();
            List list = v34VarG2.k;
            if (list.isEmpty()) {
                size = 0;
            } else {
                int size2 = list.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    i8 += ((w34) list.get(i9)).k;
                }
                size = (i8 / list.size()) + v34VarG2.q;
            }
            if (size != 0 && (i5 = iG / size) >= 1) {
                i4 = i5;
            }
        }
        int i10 = i4 * 2;
        int i11 = q24VarG0.o.a.g().n;
        if (i10 > i11) {
            i10 = i11;
        }
        while (objInvoke == null && q24VarG0.C0((m24) ref$ObjectRef.a, i7) && i3 < i10) {
            m24 m24Var2 = (m24) ref$ObjectRef.a;
            int i12 = m24Var2.a;
            int i13 = m24Var2.b;
            if (q24VarG0.D0(i7)) {
                i13++;
            } else {
                i12--;
            }
            qm5 qm5Var2 = q24VarG0.p;
            qm5Var2.getClass();
            m24 m24Var3 = new m24(i12, i13);
            ((zb5) qm5Var2.b).b(m24Var3);
            ((zb5) q24VarG0.p.b).k((m24) ref$ObjectRef.a);
            ref$ObjectRef.a = m24Var3;
            i3++;
            y40.H(q24VarG0).l();
            objInvoke = dp2Var.invoke(new p24(q24VarG0, ref$ObjectRef, i7));
        }
        ((zb5) q24VarG0.p.b).k((m24) ref$ObjectRef.a);
        y40.H(q24VarG0).l();
        return objInvoke;
    }

    public static final hx4 x(boolean z, ab5 ab5Var, m mVar, boolean z2, v97 v97Var, bp2 bp2Var) {
        if (mVar != null) {
            return new om7(z, ab5Var, mVar, z2, v97Var, bp2Var);
        }
        if (mVar == null) {
            return new om7(z, ab5Var, null, z2, v97Var, bp2Var);
        }
        ex4 ex4Var = ex4.b;
        return ab5Var != null ? qm3.a(ex4Var, ab5Var, mVar).d(new om7(z, ab5Var, null, z2, v97Var, bp2Var)) : androidx.compose.ui.b.a(ex4Var, new pm7(mVar, z, z2, v97Var, bp2Var));
    }

    public static ca4 y(int i2, w72 w72Var, h26 h26Var) throws ParserException {
        ca4 ca4VarA = ca4.a(w72Var, h26Var);
        while (true) {
            int i3 = ca4VarA.a;
            if (i3 == i2) {
                return ca4VarA;
            }
            o40.E(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j2 = ca4VarA.b;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            w72Var.n((int) j3);
            ca4VarA = ca4.a(w72Var, h26Var);
        }
    }

    public static void z(List list, zi6 zi6Var, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (zi6Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }
}
