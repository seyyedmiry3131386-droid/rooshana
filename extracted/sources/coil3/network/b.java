package coil3.network;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import coil3.request.CachePolicy;
import defpackage.aw6;
import defpackage.c24;
import defpackage.c26;
import defpackage.f88;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ip1;
import defpackage.js3;
import defpackage.kb2;
import defpackage.m88;
import defpackage.qp2;
import defpackage.rf0;
import defpackage.ri3;
import defpackage.rm5;
import defpackage.s26;
import defpackage.tb2;
import defpackage.tv6;
import defpackage.uv5;
import defpackage.va2;
import defpackage.wu8;
import defpackage.xg5;
import defpackage.xm5;
import defpackage.ym5;
import defpackage.zk8;
import defpackage.zn5;
import defpackage.zv6;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class b implements va2 {
    public final String a;
    public final uv5 b;
    public final c24 c;
    public final c24 d;
    public final c24 e;
    public final ConnectivityChecker f;

    public b(String str, uv5 uv5Var, c24 c24Var, c24 c24Var2, c24 c24Var3, ConnectivityChecker connectivityChecker) {
        this.a = str;
        this.b = uv5Var;
        this.c = c24Var;
        this.d = c24Var2;
        this.e = c24Var3;
        this.f = connectivityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(coil3.network.b r4, defpackage.b28 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gh0 r5 = r0.a
            kotlin.b.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.b.b(r6)
            gh0 r6 = new gh0
            r6.<init>()
            r0.a = r6
            r0.d = r3
            ph0 r5 = r5.a
            r5.e0(r6)
            tx8 r5 = defpackage.tx8.a
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = r6
        L48:
            tb2 r4 = r4.e()
            x18 r6 = new x18
            r0 = 0
            r6.<init>(r5, r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.b.b(coil3.network.b, b28, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [zv6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(coil3.network.b r22, defpackage.zv6 r23, defpackage.ym5 r24, defpackage.ym5 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.b.c(coil3.network.b, zv6, ym5, ym5, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String f(String str, String str2) {
        String strV;
        if ((str2 == null || m88.Z(str2, "text/plain", false)) && (strV = wu8.v(str)) != null) {
            return strV;
        }
        if (str2 != null) {
            return f88.F0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        if (r0 == r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:74:0x017d, B:22:0x0050, B:69:0x0163, B:71:0x0167, B:58:0x011f, B:60:0x0125, B:66:0x014c, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0143, B:64:0x014a), top: B:84:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163 A[Catch: Exception -> 0x003f, PHI: r0 r1
      0x0163: PHI (r0v26 java.lang.Object) = (r0v19 java.lang.Object), (r0v2 java.lang.Object) binds: [B:67:0x0160, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r1v10 kotlin.jvm.internal.Ref$ObjectRef) = (r1v8 kotlin.jvm.internal.Ref$ObjectRef), (r1v16 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:67:0x0160, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:74:0x017d, B:22:0x0050, B:69:0x0163, B:71:0x0167, B:58:0x011f, B:60:0x0125, B:66:0x014c, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0143, B:64:0x014a), top: B:84:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:74:0x017d, B:22:0x0050, B:69:0x0163, B:71:0x0167, B:58:0x011f, B:60:0x0125, B:66:0x014c, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0143, B:64:0x014a), top: B:84:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // defpackage.va2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.g51 r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.b.a(g51):java.lang.Object");
    }

    public final Object d(xm5 xm5Var, qp2 qp2Var, g51 g51Var) {
        if (this.b.i.a && js3.i(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        coil3.network.okhttp.internal.a aVar = (coil3.network.okhttp.internal.a) this.c.getValue();
        return coil3.network.okhttp.internal.a.a(aVar.a, xm5Var, new NetworkFetcher$executeNetworkRequest$2(qp2Var, null), (ContinuationImpl) g51Var);
    }

    public final tb2 e() {
        tb2 tb2Var;
        aw6 aw6Var = (aw6) this.d.getValue();
        return (aw6Var == null || (tb2Var = aw6Var.a) == null) ? this.b.f : tb2Var;
    }

    public final xm5 g() {
        zn5 zn5Var = ri3.b;
        uv5 uv5Var = this.b;
        rm5 rm5Var = (rm5) gu9.r(uv5Var, zn5Var);
        rm5Var.getClass();
        xg5 xg5Var = new xg5(rm5Var);
        CachePolicy cachePolicy = uv5Var.h;
        boolean z = cachePolicy.a;
        boolean z2 = uv5Var.i.a && this.f.a();
        if (!z2 && z) {
            xg5Var.i("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                xg5Var.i("no-cache, only-if-cached");
            }
        } else if (cachePolicy.b) {
            xg5Var.i("no-cache");
        } else {
            xg5Var.i("no-cache, no-store");
        }
        String str = (String) gu9.r(uv5Var, ri3.a);
        rm5 rm5Var2 = new rm5(kotlin.collections.b.T((LinkedHashMap) xg5Var.b));
        if (gu9.r(uv5Var, ri3.c) == null) {
            return new xm5(this.a, str, rm5Var2, uv5Var.j);
        }
        throw new ClassCastException();
    }

    public final kb2 h(zv6 zv6Var) {
        ip1 ip1Var = zv6Var.a;
        if (ip1Var.b) {
            throw new IllegalStateException("snapshot is closed");
        }
        s26 s26Var = (s26) ip1Var.a.c.get(1);
        tb2 tb2VarE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return c26.b(s26Var, tb2VarE, str, zv6Var, 16);
    }

    public final ym5 i(zv6 zv6Var) throws Throwable {
        Throwable th;
        ym5 ym5VarW;
        try {
            tb2 tb2VarE = e();
            ip1 ip1Var = zv6Var.a;
            if (ip1Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            tv6 tv6VarJ = rf0.j(tb2VarE.k0((s26) ip1Var.a.c.get(0)));
            try {
                ym5VarW = zk8.W(tv6VarJ);
                try {
                    tv6VarJ.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    tv6VarJ.close();
                } catch (Throwable th4) {
                    wu8.f(th3, th4);
                }
                th = th3;
                ym5VarW = null;
            }
            if (th == null) {
                return ym5VarW;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
