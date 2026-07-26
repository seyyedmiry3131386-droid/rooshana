package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.sentry.android.core.t0;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xr5 implements ig0, ou, z39 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int a;
    public int b;
    public Object c;

    public xr5() {
        this.c = new xr5[256];
        this.a = 0;
        this.b = 0;
    }

    public static void u(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(z67.e(i2));
    }

    @Override // defpackage.x39
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.ou
    public void b(int i, Object obj) {
        ((ou) this.c).b(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.ou
    public void c(Object obj) {
        this.b++;
        ((ou) this.c).c(obj);
    }

    @Override // defpackage.ou
    public void d() {
        ((ou) this.c).d();
    }

    @Override // defpackage.ig0
    public int e() {
        return this.a;
    }

    @Override // defpackage.ou
    public void f(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((ou) this.c).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ou
    public void g(int i, int i2) {
        ((ou) this.c).g(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.c).h(j, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.ig0
    public int i() {
        return this.b;
    }

    @Override // defpackage.ou
    public void j() {
        if (!(this.b > 0)) {
            sz0.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((ou) this.c).j();
    }

    @Override // defpackage.z39
    public int k() {
        return this.b;
    }

    @Override // defpackage.ig0
    public int l() {
        int i = this.a;
        return i == -1 ? ((h26) this.c).B() : i;
    }

    @Override // defpackage.ou
    public void m(int i, Object obj) {
        ((ou) this.c).m(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.ou
    public /* synthetic */ void n() {
    }

    @Override // defpackage.ou
    public void o(qp2 qp2Var, Object obj) {
        ((ou) this.c).o(qp2Var, obj);
    }

    @Override // defpackage.z39
    public int p() {
        return this.a;
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.c).q(j, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.c).h(s(dlVar, dlVar2, dlVar3), dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((long) (p() + k())) * 1000000;
    }

    public void t() {
        tt1 tt1Var = (tt1) this.c;
        int i = this.b + 1;
        this.b = i;
        es1 es1Var = tt1Var.f;
        tt1Var.j();
        tt1Var.e.a(0L);
        long jRound = Math.round((r3.c * 1000.0f) / 3000.0f);
        if (i % 15 == 0) {
            long j = es1Var.i;
        }
        es1Var.k = jRound;
        Iterator it = tt1Var.b.e.a.iterator();
        while (it.hasNext()) {
            ((nr1) it.next()).j(es1Var);
        }
    }

    public synchronized int v() {
        PackageInfo packageInfoC;
        if (this.a == 0) {
            try {
                packageInfoC = sg9.a((Context) this.c).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                t0.m("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfoC = null;
            }
            if (packageInfoC != null) {
                this.a = packageInfoC.versionCode;
            }
        }
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0027, B:14:0x0032, B:16:0x0039, B:18:0x004b, B:26:0x006c, B:21:0x0052, B:23:0x0065, B:29:0x0070, B:33:0x007f), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int w() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.b     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L30
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L30
            k30 r0 = defpackage.sg9.a(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L30
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L30
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L30
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L32
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            io.sentry.android.core.t0.d(r0, r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r5)
            return r3
        L30:
            r0 = move-exception
            goto L83
        L32:
            boolean r0 = defpackage.wn5.R()     // Catch: java.lang.Throwable -> L30
            r2 = 1
            if (r0 != 0) goto L52
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L52
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L52
            goto L6c
        L52:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L30
            r1 = 2
            if (r0 == 0) goto L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L70
            r2 = r1
        L6c:
            r5.b = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r5)
            return r2
        L70:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            io.sentry.android.core.t0.m(r0, r3)     // Catch: java.lang.Throwable -> L30
            boolean r0 = defpackage.wn5.R()     // Catch: java.lang.Throwable -> L30
            if (r2 == r0) goto L7e
            goto L7f
        L7e:
            r2 = r1
        L7f:
            r5.b = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r5)
            return r2
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr5.w():int");
    }

    public xr5(int i, int i2, zy1 zy1Var) {
        this.a = i;
        this.b = i2;
        this.c = new o77(new me2(i, i2, zy1Var));
    }
}
