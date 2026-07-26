package io.sentry.transport;

import io.sentry.SentryLevel;
import io.sentry.b6;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final io.sentry.internal.debugmeta.c b;
    public final b6 c;
    public final p d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(io.sentry.b6 r5, io.sentry.internal.debugmeta.c r6, io.sentry.transport.p r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.b = r6
            r4.c = r5
            r4.d = r7
            io.sentry.z5 r6 = r5.getProxy()
            if (r6 == 0) goto L3d
            java.lang.String r7 = r6.b
            java.lang.String r6 = r6.a
            if (r7 == 0) goto L3d
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NumberFormatException -> L26
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.NumberFormatException -> L26
            int r2 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L26
            r1.<init>(r6, r2)     // Catch: java.lang.NumberFormatException -> L26
            java.net.Proxy r6 = new java.net.Proxy     // Catch: java.lang.NumberFormatException -> L26
            r6.<init>(r0, r1)     // Catch: java.lang.NumberFormatException -> L26
            goto L3e
        L26:
            r6 = move-exception
            io.sentry.b6 r0 = r4.c
            io.sentry.u0 r0 = r0.getLogger()
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.ERROR
            java.lang.String r2 = "Failed to parse Sentry Proxy port: "
            java.lang.String r3 = ". Proxy is ignored"
            java.lang.String r7 = defpackage.o40.y(r2, r7, r3)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.e(r1, r6, r7, r2)
        L3d:
            r6 = 0
        L3e:
            r4.a = r6
            if (r6 == 0) goto L60
            io.sentry.z5 r6 = r5.getProxy()
            if (r6 == 0) goto L60
            io.sentry.z5 r6 = r5.getProxy()
            java.lang.String r6 = r6.c
            io.sentry.z5 r5 = r5.getProxy()
            java.lang.String r5 = r5.d
            if (r6 == 0) goto L60
            if (r5 == 0) goto L60
            io.sentry.transport.l r7 = new io.sentry.transport.l
            r7.<init>(r6, r5)
            java.net.Authenticator.setDefault(r7)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.e.<init>(io.sentry.b6, io.sentry.internal.debugmeta.c, io.sentry.transport.p):void");
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.net.HttpURLConnection r4) {
        /*
            java.io.InputStream r4 = r4.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r2 = io.sentry.transport.e.e     // Catch: java.lang.Throwable -> L38
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r2 = 1
        L16:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L26
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3a
        L26:
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            goto L16
        L2b:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r1     // Catch: java.lang.Throwable -> L38
        L43:
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r0     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r4 = "Failed to obtain error message while analyzing send failure."
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.e.b(java.net.HttpURLConnection):java.lang.String");
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        b6 b6Var = this.c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return s.c;
                }
                if (responseCode == 413) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                } else {
                    b6Var.getLogger().i(SentryLevel.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                }
                if (b6Var.isDebug()) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "%s", b(httpURLConnection));
                }
                return new r(responseCode);
            } catch (IOException e2) {
                b6Var.getLogger().e(SentryLevel.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new r(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        b6 b6Var = this.c;
        b6Var.getSocketTagger().c();
        io.sentry.internal.debugmeta.c cVar2 = this.b;
        URL url = (URL) cVar2.b;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) cVar2.c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(b6Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(b6Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = b6Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    b6Var.getSerializer().e(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return c(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.net.HttpURLConnection r24, int r25) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.e.e(java.net.HttpURLConnection, int):void");
    }
}
