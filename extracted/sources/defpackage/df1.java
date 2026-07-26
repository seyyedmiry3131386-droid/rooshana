package defpackage;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class df1 extends p60 {
    public final int e;
    public final int f;
    public final String g;
    public final nc2 h;
    public final nc2 i;
    public db1 j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;

    public df1(String str, int i, int i2, nc2 nc2Var) {
        super(true);
        this.g = str;
        this.e = i;
        this.f = i2;
        this.h = nc2Var;
        this.i = new nc2(7);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    @Override // defpackage.xa1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.db1 r29) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df1.b(db1):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xa1
    public final void close() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    db1 db1Var = this.j;
                    String str = j29.a;
                    throw new HttpDataSource$HttpDataSourceException(e, db1Var, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            t();
            if (this.m) {
                this.m = false;
                o();
            }
            this.k = null;
            this.j = null;
        }
    }

    @Override // defpackage.p60, defpackage.xa1
    public final Map k() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? ImmutableMap.l() : new cf1(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.xa1
    public final Uri p() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        db1 db1Var = this.j;
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
            long r0 = r6.o     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.p     // Catch: java.io.IOException -> L32
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
            java.io.InputStream r0 = r6.l     // Catch: java.io.IOException -> L32
            java.lang.String r1 = defpackage.j29.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.p     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.p = r8     // Catch: java.io.IOException -> L32
            r6.l(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            db1 r8 = r6.j
            java.lang.String r9 = defpackage.j29.a
            r9 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df1.read(byte[], int, int):int");
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                wn5.H("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection u(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        nc2 nc2Var = this.h;
        if (nc2Var != null) {
            map2.putAll(nc2Var.t());
        }
        map2.putAll(this.i.t());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ve3.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(db1.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void v(long j, db1 db1Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.l;
            String str = j29.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), db1Var, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(db1Var, 2008);
            }
            j -= (long) i;
            l(i);
        }
    }
}
