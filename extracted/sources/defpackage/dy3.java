package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.text.contextmenu.internal.a;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.o;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import com.android.volley.Request$Priority;
import io.sentry.android.core.t0;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.requestdto.UploadImageRequestDto;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import ir.myket.core.utils.EncryptionUtils$EncryptionFailedException;
import ir.myket.player.domain.models.PlayerMovieData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy3 {
    public static Method e = null;
    public static boolean f = false;
    public static final /* synthetic */ int h = 0;
    public static int i = 0;
    public static int j = 0;
    public static boolean k = true;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final mu3 a = new mu3("UNDEFINED", 1);
    public static final mu3 b = new mu3("REUSABLE_CLAIMED", 1);
    public static final mh c = new mh(15);
    public static final Object d = new Object();
    public static final Object g = new Object();

    public static final byte[] A(String str) throws IOException {
        if (str == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        Charset charsetForName = Charset.forName("UTF-8");
        js3.o(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        js3.o(bytes, "getBytes(...)");
        gZIPOutputStream.write(bytes);
        gZIPOutputStream.finish();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static final boolean B(int i2, int i3, long j2) {
        int iJ = h31.j(j2);
        if (i2 > h31.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= h31.g(j2) && h31.i(j2) <= i3;
    }

    public static void C(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static final int D(yu6 yu6Var, uq3 uq3Var) {
        js3.p(yu6Var, "<this>");
        js3.p(uq3Var, "range");
        int i2 = uq3Var.a;
        if (!uq3Var.isEmpty()) {
            int i3 = uq3Var.b;
            return i3 < Integer.MAX_VALUE ? yu6Var.c(i2, i3 + 1) : i2 > Integer.MIN_VALUE ? yu6Var.c(i2 - 1, i3) + 1 : yu6Var.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + uq3Var);
    }

    public static final Object E(o2 o2Var, int i2, Type type, z57 z57Var, RequestDTO requestDTO, Object obj, boolean z, Map map, boolean z2, ff5 ff5Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        int i3 = 0;
        s2 s2Var = new s2(om0Var, i3);
        r2 r2Var = new r2(om0Var, i3);
        xv2 xv2Var = new xv2(i2, z57Var, requestDTO, Request$Priority.b, z, obj, o2Var.createVolleyErrorListener(r2Var), o2Var.createVolleySuccessListener(s2Var, r2Var), z2);
        xv2Var.p = map;
        xv2Var.w = type;
        xv2Var.k = ff5Var;
        xv2Var.u = true;
        o2Var.performRequest(xv2Var, r2Var);
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public static final a F(bp2 bp2Var, qz0 qz0Var, int i2) {
        View view = (View) qz0Var.j(e.f);
        boolean zF = qz0Var.f(view);
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (zF || objM == obj) {
            objM = new a(view, null, bp2Var);
            qz0Var.l0(objM);
        }
        a aVar = (a) objM;
        boolean zH = qz0Var.h(aVar);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj) {
            objM2 = new ei(aVar, 3);
            qz0Var.l0(objM2);
        }
        zk8.d(aVar, (dp2) objM2, qz0Var);
        return aVar;
    }

    public static Object G(o2 o2Var, Type type, z57 z57Var, RequestDTO requestDTO, Object obj, Map map, ff5 ff5Var, g51 g51Var, int i2) {
        Map map2;
        if ((i2 & 16) != 0) {
            Map<String, String> headers = o2Var.getHeaders(new HashMap());
            js3.o(headers, "getHeaders(...)");
            map2 = headers;
        } else {
            map2 = map;
        }
        return E(o2Var, 1, type, z57Var, requestDTO, obj, false, map2, (i2 & 64) == 0, (i2 & 256) != 0 ? ff5.b() : ff5Var, g51Var);
    }

    public static Object H(o2 o2Var, Type type, z57 z57Var, UploadImageRequestDto uploadImageRequestDto, Object obj, Map map, SuspendLambda suspendLambda) {
        om0 om0Var = new om0(1, ok4.I(suspendLambda));
        om0Var.v();
        q2 q2Var = new q2(om0Var);
        p2 p2Var = new p2(om0Var);
        ib2 ib2Var = new ib2(z57Var, uploadImageRequestDto, obj, o2Var.createVolleyErrorListener(p2Var), o2Var.createVolleySuccessListener(q2Var, p2Var));
        ib2Var.p = map;
        ib2Var.w = type;
        o2Var.performRequest(ib2Var, p2Var);
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public static Object I(o2 o2Var, Type type, z57 z57Var, RequestDTO requestDTO, Object obj, Map map, g51 g51Var, int i2) {
        Map map2;
        if ((i2 & 16) != 0) {
            Map<String, String> headers = o2Var.getHeaders(new HashMap());
            js3.o(headers, "getHeaders(...)");
            map2 = headers;
        } else {
            map2 = map;
        }
        return E(o2Var, 2, type, z57Var, requestDTO, obj, false, map2, false, ff5.b(), g51Var);
    }

    public static String J(Context context, Uri uri, String str) {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        l(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    l(cursorQuery);
                    return string;
                } catch (Exception e2) {
                    exc = e2;
                    t0.m("DocumentFile", "Failed query: " + exc);
                    l(cursorQuery);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            th = th2;
        } catch (Exception e3) {
            exc = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
        l(cursorQuery);
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K(defpackage.g51 r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.qp1
            if (r0 == 0) goto Lae
            qp1 r9 = (defpackage.qp1) r9
            y61 r0 = r9.d
            kotlin.coroutines.jvm.internal.ContinuationImpl r1 = r9.e
            java.lang.Throwable r2 = kotlin.Result.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            rx0 r3 = new rx0
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            w61 r2 = r1.getContext()
            boolean r2 = M(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f = r3
            r9.c = r4
            w61 r10 = r1.getContext()
            L(r0, r10, r9)
            return
        L2f:
            g42 r0 = defpackage.tk8.a()
            long r5 = r0.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f = r3
            r9.c = r4
            r0.L0(r9)
            goto La8
        L46:
            r0.R0(r4)
            w61 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            th0 r3 = defpackage.th0.n     // Catch: java.lang.Throwable -> L69
            u61 r2 = r2.r0(r3)     // Catch: java.lang.Throwable -> L69
            wt3 r2 = (defpackage.wt3) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.I()     // Catch: java.lang.Throwable -> L69
            kotlin.Result$Failure r10 = kotlin.b.a(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.g     // Catch: java.lang.Throwable -> L69
            w61 r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.is3.P(r3, r2)     // Catch: java.lang.Throwable -> L69
            mu3 r5 = defpackage.is3.j     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            ox8 r5 = defpackage.ct2.B(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.o0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.is3.H(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.Y0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.H0(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.o0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.is3.H(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.k(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.H0(r4)
            throw r9
        Lae:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy3.K(g51, java.lang.Object):void");
    }

    public static final void L(y61 y61Var, w61 w61Var, Runnable runnable) {
        try {
            y61Var.U(w61Var, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, y61Var, w61Var);
        }
    }

    public static final boolean M(y61 y61Var, w61 w61Var) throws DispatchException {
        try {
            return y61Var.D0(w61Var);
        } catch (Throwable th) {
            throw new DispatchException(th, y61Var, w61Var);
        }
    }

    public static void N(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(rm7.n(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static byte[] O(oj0 oj0Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = oj0Var.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return n(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j2 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (oj0Var.read() == -1) {
            return n(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static boolean P(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.d;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.b;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.a;
        return (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour6 || (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour5 && constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour6)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour6 || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5 && constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour6));
    }

    public static og a(int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        androidx.compose.ui.graphics.colorspace.a aVar = pv0.e;
        Bitmap.Config configV = fz.v(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = aq3.f(i2, i3, i4, aVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configV);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new og(bitmapCreateBitmap);
    }

    public static final void b(hx4 hx4Var, boolean z, xc6 xc6Var, PlayerMovieData playerMovieData, dl5 dl5Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        char c2;
        dv dvVar;
        int i4;
        boolean z2;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-2095903595);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (qz0Var2.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.f(xc6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.h(playerMovieData) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? qz0Var2.f(dl5Var) : qz0Var2.h(dl5Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 131072 : 65536;
        }
        if (qz0Var2.R(i3 & 1, (74899 & i3) != 74898)) {
            hx4 hx4VarD = yh0.D(b.c(hx4Var, 1.0f), 0.0f, ml9.q(hq6.space_16, qz0Var2), 0.0f, ml9.q(hq6.space_20, qz0Var2), 5);
            bb0 bb0Var = eq.n;
            if (z) {
                c2 = ' ';
                qz0Var2.a0(1171047442);
                qz0Var2.q(false);
                dvVar = jv.d;
            } else {
                c2 = ' ';
                qz0Var2.a0(1171082937);
                fv fvVar = jv.a;
                ev evVar = new ev(ml9.q(hq6.space_8, qz0Var2), true, new g8(i5, yh0.h));
                qz0Var2.q(false);
                dvVar = evVar;
            }
            cb7 cb7VarA = bb7.a(dvVar, bb0Var, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i6 = (int) (j2 ^ (j2 >>> c2));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarD);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i6), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            av avVar = jz0.a;
            if (z) {
                qz0Var2.a0(-1007849581);
                String strF = ln2.f(vs6.player_unlock, qz0Var2);
                wy5 wy5Var = ci0.a;
                u58 u58Var = uj8.a;
                Object objJ = qz0Var2.j(u58Var);
                js3.m(objJ);
                long j3 = ((tj8) objJ).J.a;
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                int i7 = i3;
                bi0 bi0VarA = ci0.a(((tj8) objJ2).I.a, j3, 0L, 0L, qz0Var, 12);
                qz0Var2 = qz0Var;
                Integer numValueOf = Integer.valueOf(br6.player_ic_lock);
                boolean z3 = (i7 & 458752) == 131072;
                Object objM = qz0Var2.M();
                if (z3 || objM == avVar) {
                    objM = new ba(13, dp2Var);
                    qz0Var2.l0(objM);
                }
                wu8.a(null, strF, bi0VarA, numValueOf, (bp2) objM, qz0Var2, 0, 1);
                qz0Var2.q(false);
            } else {
                int i8 = i3;
                qz0Var2.a0(-1007442520);
                if (playerMovieData.b()) {
                    qz0Var2.a0(-1007370383);
                    String strF2 = ln2.f(vs6.player_movie_change_episode_title, qz0Var2);
                    wy5 wy5Var2 = ci0.a;
                    u58 u58Var2 = uj8.a;
                    Object objJ3 = qz0Var2.j(u58Var2);
                    js3.m(objJ3);
                    long j4 = ((tj8) objJ3).I.a;
                    Object objJ4 = qz0Var2.j(u58Var2);
                    js3.m(objJ4);
                    i4 = 16384;
                    bi0 bi0VarA2 = ci0.a(((tj8) objJ4).l, j4, 0L, 0L, qz0Var, 12);
                    qz0Var2 = qz0Var;
                    Integer numValueOf2 = Integer.valueOf(br6.player_ic_playlist);
                    boolean zH = qz0Var2.h(playerMovieData) | ((i8 & 57344) == 16384 || ((i8 & 32768) != 0 && qz0Var2.h(dl5Var)));
                    Object objM2 = qz0Var2.M();
                    if (zH || objM2 == avVar) {
                        objM2 = new ty(dl5Var, playerMovieData, 2);
                        qz0Var2.l0(objM2);
                    }
                    wu8.a(null, strF2, bi0VarA2, numValueOf2, (bp2) objM2, qz0Var2, 0, 1);
                    z2 = false;
                } else {
                    i4 = 16384;
                    z2 = false;
                    qz0Var2.a0(-1011933335);
                }
                qz0Var2.q(z2);
                hx4 hx4VarL = b.l(ex4.b, ml9.q(hq6.action_button_width, qz0Var2));
                int i9 = br6.player_ic_menu_dots;
                boolean zH2 = ((i8 & 896) == 256) | ((i8 & 57344) == i4 || ((i8 & 32768) != 0 && qz0Var2.h(dl5Var))) | qz0Var2.h(playerMovieData);
                Object objM3 = qz0Var2.M();
                if (zH2 || objM3 == avVar) {
                    objM3 = new f8(dl5Var, xc6Var, playerMovieData, 17);
                    qz0Var2.l0(objM3);
                }
                tv8.a(hx4VarL, i9, (bp2) objM3, qz0Var2, 0);
                qz0Var2.q(false);
            }
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new b04(hx4Var, z, xc6Var, playerMovieData, dl5Var, dp2Var, i2, 1);
        }
    }

    public static final void c(int i2, qz0 qz0Var, bp2 bp2Var, dp2 dp2Var, hx4 hx4Var, dl5 dl5Var, xc6 xc6Var, wd6 wd6Var, PlayerMovieData playerMovieData) {
        int i3;
        ex4 ex4Var;
        int i4;
        boolean z;
        qz0 qz0Var2;
        qz0 qz0Var3 = qz0Var;
        js3.p(wd6Var, "playerControllerState");
        boolean z2 = wd6Var.g;
        js3.p(xc6Var, "playerConfig");
        js3.p(playerMovieData, "playerMovieData");
        js3.p(bp2Var, "progressBarTimeState");
        js3.p(dl5Var, "navigationStateManager");
        qz0Var3.c0(-2026934655);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var3.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var3.f(wd6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var3.f(xc6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var3.h(playerMovieData) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? qz0Var3.f(dl5Var) : qz0Var3.h(dl5Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var3.h(dp2Var) ? 1048576 : 524288;
        }
        if (qz0Var3.R(i3 & 1, (599187 & i3) != 599186)) {
            hx4 hx4VarC = b.c(hx4Var, 1.0f);
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var3, 0);
            long j2 = qz0Var3.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var3.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var3, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var3.e0();
            if (qz0Var3.S) {
                qz0Var3.k(bp2Var2);
            } else {
                qz0Var3.o0();
            }
            ia7.o(qz0Var3, d.f, vv0VarA);
            ia7.o(qz0Var3, d.e, j56VarL);
            ia7.g(qz0Var3, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var3, d.h);
            ia7.o(qz0Var3, d.d, hx4VarC2);
            boolean z3 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            if (!z3 || z2) {
                qz0Var3.a0(-1120140990);
                ex4Var = ex4Var2;
                i4 = 2;
                z = false;
                yh0.h(yh0.B(ex4Var2, ml9.q(hq6.space_16, qz0Var3), 0.0f, 2), bp2Var, playerMovieData.a.k, dp2Var, 0L, 0L, 0L, 0L, 0.0f, 0.0f, qz0Var3, (i3 >> 9) & 7280);
                qz0Var2 = qz0Var3;
                qz0Var2.q(false);
            } else {
                qz0Var3.a0(-1122757173);
                z = false;
                qz0Var3.q(false);
                qz0Var2 = qz0Var3;
                ex4Var = ex4Var2;
                i4 = 2;
            }
            if (z2) {
                qz0Var3 = qz0Var2;
                qz0Var3.a0(-1119481465);
                z27.a(qz0Var3, b.d(ex4Var, ml9.q(hq6.bottom_bar_height_landscape, qz0Var3)));
                qz0Var3.q(z);
            } else {
                qz0Var2.a0(-1119819179);
                int i6 = i3 & 8064;
                int i7 = i3 >> 3;
                int i8 = (i7 & 458752) | i6 | (57344 & i7);
                qz0Var3 = qz0Var2;
                b(yh0.B(ex4Var, ml9.q(hq6.space_16, qz0Var2), 0.0f, i4), wd6Var.f, xc6Var, playerMovieData, dl5Var, dp2Var, qz0Var3, i8);
                qz0Var3.q(z);
            }
            qz0Var3.q(true);
        } else {
            qz0Var3.U();
        }
        my6 my6VarS = qz0Var3.s();
        if (my6VarS != null) {
            my6VarS.d = new a04(hx4Var, wd6Var, xc6Var, playerMovieData, bp2Var, dl5Var, dp2Var, i2);
        }
    }

    public static final void d(hx4 hx4Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            e(hx4Var, aVar, qz0Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ji(hx4Var, aVar, i2, 0);
        }
    }

    public static final void e(hx4 hx4Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(aVar) ? 256 : 128;
        }
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.g(null, th0.p);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new v8(wb5Var, 2);
                qz0Var.l0(objM2);
            }
            zk8.b(kg8.b.a(F((bp2) objM2, qz0Var, 0)), s7.X(-291176396, new w8(hx4Var, wb5Var, aVar, 3), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ji(hx4Var, aVar, i2, 1);
        }
    }

    public static final int f(int i2, zb5 zb5Var) {
        int i3 = zb5Var.c - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = zb5Var.a;
            int i6 = ((bs3) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((bs3) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static void g(Appendable appendable, char c2) {
        try {
            appendable.append(c2);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static hx4 h(hx4 hx4Var, float f2) {
        return hx4Var.d(new hw(f2, o.a));
    }

    public static final void i(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(dw1.j(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void j(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(dw1.j(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void k(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbB = bl4.B(i2, i3, "fromIndex: ", ", toIndex: ", ", size: ");
            sbB.append(i4);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(dw1.j(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void l(Cursor cursor) {
        if (cursor != null) {
            try {
                o40.G(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void m(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    public static byte[] n(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static Bitmap o(Context context, Uri uri, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        InputStream inputStream = null;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            inputStreamOpenInputStream = null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i3 = 1;
        options2.inJustDecodeBounds = true;
        try {
            inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException unused) {
            inputStreamOpenInputStream2 = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream2;
            m(inputStream);
            throw th;
        }
        m(inputStreamOpenInputStream2);
        i = options2.outWidth;
        j = options2.outHeight;
        while (true) {
            if (options2.outWidth / i3 <= i2 && options2.outHeight / i3 <= i2) {
                options.inSampleSize = i3;
                options.inJustDecodeBounds = false;
                return BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            }
            i3 *= 2;
        }
    }

    public static final String p(ByteArrayInputStream byteArrayInputStream, Charset charset) throws IOException {
        js3.p(charset, "charset");
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream, charset);
        while (true) {
            int i2 = inputStreamReader.read(cArr, 0, 1024);
            if (i2 < 0) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    public static final byte[] q(String str) throws EncryptionUtils$EncryptionFailedException {
        js3.p(str, "data");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(tt3.A("51863A124995CA387F6199A397582D7E"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[16]));
            byte[] bArrDoFinal = cipher.doFinal(tt3.A(str));
            js3.m(bArrDoFinal);
            return bArrDoFinal;
        } catch (Exception e2) {
            throw new EncryptionUtils$EncryptionFailedException(e2);
        }
    }

    public static Object r(o2 o2Var, Type type, z57 z57Var, RequestDTO requestDTO, Object obj, g51 g51Var) {
        Map<String, String> headers = o2Var.getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        return E(o2Var, 3, type, z57Var, requestDTO, obj, false, headers, false, ff5.b(), g51Var);
    }

    public static final byte[] s(String str) throws EncryptionUtils$EncryptionFailedException {
        js3.p(str, "data");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(tt3.A("51863A124995CA387F6199A397582D7E"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[16]));
            byte[] bytes = str.getBytes(zp0.a);
            js3.o(bytes, "getBytes(...)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            js3.o(bArrDoFinal, "doFinal(...)");
            return bArrDoFinal;
        } catch (Exception e2) {
            throw new EncryptionUtils$EncryptionFailedException(e2);
        }
    }

    public static zd9 t(f31 f31Var, int i2, ArrayList arrayList, zd9 zd9Var) {
        int i3;
        int i4 = i2 == 0 ? f31Var.s0 : f31Var.t0;
        if (i4 != -1 && (zd9Var == null || i4 != zd9Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                zd9 zd9Var2 = (zd9) arrayList.get(i5);
                if (zd9Var2.b == i4) {
                    if (zd9Var != null) {
                        zd9Var.c(i2, zd9Var2);
                        arrayList.remove(zd9Var);
                    }
                    zd9Var = zd9Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return zd9Var;
        }
        if (zd9Var == null) {
            if (f31Var instanceof oy2) {
                oy2 oy2Var = (oy2) f31Var;
                int i6 = 0;
                while (true) {
                    if (i6 >= oy2Var.v0) {
                        i3 = -1;
                        break;
                    }
                    f31 f31Var2 = oy2Var.u0[i6];
                    if ((i2 == 0 && (i3 = f31Var2.s0) != -1) || (i2 == 1 && (i3 = f31Var2.t0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        zd9 zd9Var3 = (zd9) arrayList.get(i7);
                        if (zd9Var3.b == i3) {
                            zd9Var = zd9Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (zd9Var == null) {
                zd9Var = new zd9();
                zd9Var.a = new ArrayList();
                zd9Var.d = null;
                zd9Var.e = -1;
                int i8 = zd9.f;
                zd9.f = i8 + 1;
                zd9Var.b = i8;
                zd9Var.c = i2;
            }
            arrayList.add(zd9Var);
        }
        int i9 = zd9Var.b;
        ArrayList arrayList2 = zd9Var.a;
        if (arrayList2.contains(f31Var)) {
            return zd9Var;
        }
        arrayList2.add(f31Var);
        if (f31Var instanceof aw2) {
            aw2 aw2Var = (aw2) f31Var;
            aw2Var.x0.c(aw2Var.y0 == 0 ? 1 : 0, zd9Var, arrayList);
        }
        if (i2 == 0) {
            f31Var.s0 = i9;
            f31Var.J.c(i2, zd9Var, arrayList);
            f31Var.L.c(i2, zd9Var, arrayList);
        } else {
            f31Var.t0 = i9;
            f31Var.K.c(i2, zd9Var, arrayList);
            f31Var.N.c(i2, zd9Var, arrayList);
            f31Var.M.c(i2, zd9Var, arrayList);
        }
        f31Var.Q.c(i2, zd9Var, arrayList);
        return zd9Var;
    }

    public static v15 u(Bundle bundle) {
        if (!t61.B(bundle, "bundle", v15.class, "movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("movieId");
        if (!bundle.containsKey("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("refId");
        if (!bundle.containsKey(CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY)) {
            throw new IllegalArgumentException("Required argument \"play\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean(CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY);
        if (!bundle.containsKey("posterUrl")) {
            throw new IllegalArgumentException("Required argument \"posterUrl\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("posterUrl");
        if (bundle.containsKey("playId")) {
            return new v15(string, string2, z, string3, bundle.getString("playId"));
        }
        throw new IllegalArgumentException("Required argument \"playId\" is missing and does not have an android:defaultValue");
    }

    public static Object v(o2 o2Var, Type type, z57 z57Var, Object obj, g51 g51Var, int i2) {
        Map<String, String> headers = o2Var.getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        return E(o2Var, 0, type, z57Var, null, obj, true, headers, false, ff5.b(), g51Var);
    }

    public static final long w(KeyEvent keyEvent) {
        return ub1.d(keyEvent.getKeyCode());
    }

    public static final mz3 x(ComponentCallbacks componentCallbacks) {
        js3.p(componentCallbacks, "<this>");
        if (componentCallbacks instanceof pz3) {
            return ((pz3) componentCallbacks).getKoin();
        }
        mz3 mz3Var = eq.B;
        if (mz3Var != null) {
            return mz3Var;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static fn5 y(x47 x47Var, List list) {
        bk0 bk0Var = x47Var.l;
        if (bk0Var == null) {
            return new fn5(304, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((qx2) it.next()).a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = bk0Var.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (qx2 qx2Var : bk0Var.h) {
                    if (!treeSet.contains(qx2Var.a)) {
                        arrayList.add(qx2Var);
                    }
                }
            }
        } else if (!bk0Var.g.isEmpty()) {
            for (Map.Entry entry : bk0Var.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new qx2((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new fn5(304, bk0Var.a, true, arrayList);
    }

    public static final int z(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
