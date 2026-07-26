package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class be3 implements o42 {
    public static final List g = ih9.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = ih9.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final yv6 a;
    public final cw6 b;
    public final ae3 c;
    public volatile he3 d;
    public final Protocol e;
    public volatile boolean f;

    public be3(hs5 hs5Var, yv6 yv6Var, cw6 cw6Var, ae3 ae3Var) {
        js3.p(ae3Var, "http2Connection");
        this.a = yv6Var;
        this.b = cw6Var;
        this.c = ae3Var;
        List list = hs5Var.s;
        Protocol protocol = Protocol.g;
        this.e = list.contains(protocol) ? protocol : Protocol.f;
    }

    @Override // defpackage.o42
    public final void a() {
        he3 he3Var = this.d;
        js3.m(he3Var);
        he3Var.i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // defpackage.o42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r5 = this;
            he3 r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            fe3 r2 = r0.h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            gh0 r2 = r2.d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.u()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be3.b():boolean");
    }

    @Override // defpackage.o42
    public final long c(g77 g77Var) {
        if (me3.a(g77Var)) {
            return ih9.e(g77Var);
        }
        return 0L;
    }

    @Override // defpackage.o42
    public final void cancel() {
        this.f = true;
        he3 he3Var = this.d;
        if (he3Var != null) {
            he3Var.f(ErrorCode.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // defpackage.o42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f77 d(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be3.d(boolean):f77");
    }

    @Override // defpackage.o42
    public final t18 e(g77 g77Var) {
        he3 he3Var = this.d;
        js3.m(he3Var);
        return he3Var.h;
    }

    @Override // defpackage.o42
    public final void f() {
        this.c.flush();
    }

    @Override // defpackage.o42
    public final c18 g() {
        he3 he3Var = this.d;
        js3.m(he3Var);
        return he3Var;
    }

    @Override // defpackage.o42
    public final by7 h(w47 w47Var, long j) {
        js3.p(w47Var, "request");
        he3 he3Var = this.d;
        js3.m(he3Var);
        return he3Var.i;
    }

    @Override // defpackage.o42
    public final n42 i() {
        return this.a;
    }

    @Override // defpackage.o42
    public final void j(w47 w47Var) throws IOException {
        int i;
        he3 he3Var;
        boolean z;
        js3.p(w47Var, "request");
        if (this.d != null) {
            return;
        }
        boolean z2 = w47Var.d != null;
        by2 by2Var = w47Var.c;
        ArrayList arrayList = new ArrayList(by2Var.size() + 4);
        arrayList.add(new ox2(ox2.f, w47Var.b));
        ByteString byteString = ox2.g;
        se3 se3Var = w47Var.a;
        js3.p(se3Var, "url");
        String strB = se3Var.b();
        String strD = se3Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new ox2(byteString, strB));
        String strA = w47Var.c.a("Host");
        if (strA != null) {
            arrayList.add(new ox2(ox2.i, strA));
        }
        arrayList.add(new ox2(ox2.h, se3Var.a));
        int size = by2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = by2Var.c(i2);
            Locale locale = Locale.US;
            js3.o(locale, "US");
            String lowerCase = strC.toLowerCase(locale);
            js3.o(lowerCase, "toLowerCase(...)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && by2Var.f(i2).equals("trailers"))) {
                arrayList.add(new ox2(lowerCase, by2Var.f(i2)));
            }
        }
        ae3 ae3Var = this.c;
        ae3Var.getClass();
        boolean z3 = !z2;
        synchronized (ae3Var.w) {
            synchronized (ae3Var) {
                try {
                    if (ae3Var.e > 1073741823) {
                        ae3Var.u(ErrorCode.g);
                    }
                    if (ae3Var.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = ae3Var.e;
                    ae3Var.e = i + 2;
                    he3Var = new he3(i, ae3Var, z3, false, null);
                    z = !z2 || ae3Var.t >= ae3Var.u || he3Var.d >= he3Var.e;
                    if (he3Var.i()) {
                        ae3Var.b.put(Integer.valueOf(i), he3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ae3Var.w.u(i, arrayList, z3);
        }
        if (z) {
            ae3Var.w.flush();
        }
        this.d = he3Var;
        if (this.f) {
            he3 he3Var2 = this.d;
            js3.m(he3Var2);
            he3Var2.f(ErrorCode.h);
            throw new IOException("Canceled");
        }
        he3 he3Var3 = this.d;
        js3.m(he3Var3);
        ge3 ge3Var = he3Var3.j;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ge3Var.g(j);
        he3 he3Var4 = this.d;
        js3.m(he3Var4);
        he3Var4.k.g(this.b.h);
    }
}
