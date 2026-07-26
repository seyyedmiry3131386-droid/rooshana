package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class zf1 implements Closeable {
    public final HttpURLConnection a;

    public zf1(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public static String d(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    public final String b() {
        HttpURLConnection httpURLConnection = this.a;
        boolean z = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z = true;
                }
            } catch (NullPointerException e) {
                e = e;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + d(httpURLConnection);
        } catch (IOException e2) {
            e = e2;
        }
        qd4.c("get error failed ", e);
        return e.getMessage();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }
}
