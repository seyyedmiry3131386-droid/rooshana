package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class is5 extends p60 {
    public final cl0 e;
    public final nc2 f;
    public final String g;
    public final nc2 h;
    public db1 i;
    public g77 j;
    public InputStream k;
    public boolean l;
    public long m;
    public long n;

    static {
        lp4.a("media3.datasource.okhttp");
    }

    public is5(cl0 cl0Var, String str, nc2 nc2Var) {
        super(true);
        cl0Var.getClass();
        this.e = cl0Var;
        this.g = str;
        this.h = nc2Var;
        this.f = new nc2(7);
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) throws HttpDataSource$HttpDataSourceException {
        se3 se3VarB;
        a57 a57VarM;
        this.i = db1Var;
        this.n = 0L;
        this.m = 0L;
        r();
        long j = db1Var.f;
        int i = db1Var.c;
        long j2 = db1Var.g;
        String string = db1Var.a.toString();
        js3.p(string, "<this>");
        try {
            re3 re3Var = new re3(0);
            re3Var.e(null, string);
            se3VarB = re3Var.b();
        } catch (IllegalArgumentException unused) {
            se3VarB = null;
        }
        if (se3VarB == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", db1Var, 1004);
        }
        rb4 rb4Var = new rb4(15);
        rb4Var.b = se3VarB;
        HashMap map = new HashMap();
        nc2 nc2Var = this.h;
        if (nc2Var != null) {
            map.putAll(nc2Var.t());
        }
        map.putAll(this.f.t());
        map.putAll(db1Var.e);
        for (Map.Entry entry : map.entrySet()) {
            rb4Var.B((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ve3.a(j, j2);
        if (strA != null) {
            rb4Var.j("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            rb4Var.j("User-Agent", str);
        }
        if ((db1Var.i & 1) != 1) {
            rb4Var.j("Accept-Encoding", "identity");
        }
        byte[] bArr = db1Var.d;
        int i2 = 2;
        if (bArr != null) {
            int i3 = b57.a;
            a57VarM = ol3.m(bArr, null, 0, 7);
        } else if (i == 2) {
            byte[] bArr2 = j29.b;
            int i4 = b57.a;
            js3.p(bArr2, "<this>");
            a57VarM = ol3.m(bArr2, null, 0, 7);
        } else {
            a57VarM = null;
        }
        rb4Var.F(db1.b(i), a57VarM);
        xv6 xv6VarB = ((hs5) this.e).b(new w47(rb4Var));
        try {
            rq7 rq7Var = new rq7();
            xv6VarB.c(new xg5(i2, rq7Var));
            try {
                g77 g77Var = (g77) rq7Var.get();
                this.j = g77Var;
                j77 j77Var = g77Var.g;
                j77Var.getClass();
                this.k = j77Var.d1().n1();
                int i5 = g77Var.d;
                if (g77Var.q) {
                    j77Var.g();
                    long j3 = (i5 != 200 || j == 0) ? 0L : j;
                    if (j2 != -1) {
                        this.m = j2;
                    } else {
                        long jD = j77Var.d();
                        this.m = jD != -1 ? jD - j3 : -1L;
                    }
                    this.l = true;
                    s(db1Var);
                    try {
                        u(j3, db1Var);
                        return this.m;
                    } catch (HttpDataSource$HttpDataSourceException e) {
                        t();
                        throw e;
                    }
                }
                if (i5 == 416 && j == ve3.b(g77Var.f.a("Content-Range"))) {
                    this.l = true;
                    s(db1Var);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                try {
                    InputStream inputStream = this.k;
                    inputStream.getClass();
                    pj0.b(inputStream);
                } catch (IOException unused2) {
                    String str2 = j29.a;
                }
                TreeMap treeMapE = g77Var.f.e();
                t();
                throw new HttpDataSource$InvalidResponseCodeException(i5, i5 == 416 ? new DataSourceException(2008) : null, treeMapE, db1Var);
            } catch (InterruptedException unused3) {
                xv6VarB.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw HttpDataSource$HttpDataSourceException.a(e3, db1Var, 1);
        }
    }

    @Override // defpackage.xa1
    public final void close() {
        if (this.l) {
            this.l = false;
            o();
            t();
        }
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.p60, defpackage.xa1
    public final Map k() {
        g77 g77Var = this.j;
        return g77Var == null ? Collections.EMPTY_MAP : g77Var.f.e();
    }

    @Override // defpackage.xa1
    public final Uri p() {
        g77 g77Var = this.j;
        if (g77Var != null) {
            return Uri.parse(g77Var.a.a.i);
        }
        db1 db1Var = this.i;
        if (db1Var != null) {
            return db1Var.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.ra1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.m     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.n     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.k     // Catch: java.io.IOException -> L32
            java.lang.String r1 = defpackage.j29.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.n     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.n = r8     // Catch: java.io.IOException -> L32
            r6.l(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            db1 r8 = r6.i
            java.lang.String r9 = defpackage.j29.a
            r9 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is5.read(byte[], int, int):int");
    }

    public final void t() {
        g77 g77Var = this.j;
        if (g77Var != null) {
            j77 j77Var = g77Var.g;
            j77Var.getClass();
            j77Var.close();
        }
        this.k = null;
    }

    public final void u(long j, db1 db1Var) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096);
                InputStream inputStream = this.k;
                String str = j29.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource$HttpDataSourceException(db1Var, 2008);
                }
                j -= (long) i;
                l(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(db1Var, 2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }
}
