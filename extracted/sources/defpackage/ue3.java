package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ue3 implements la1 {
    public final ot2 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public ue3(ot2 ot2Var, int i) {
        this.a = ot2Var;
        this.b = i;
    }

    public final InputStream a(URL url, int i, URL url2, Map map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                try {
                    responseCode = this.c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new g41(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new HttpException(responseCode2, e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException(responseCode, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(responseCode, null, this.c.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(responseCode, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(responseCode, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return a(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(responseCode, e3, dw1.n("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new HttpException(responseCode2, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }

    @Override // defpackage.la1
    public final void c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.la1
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return DataSource.b;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        ot2 ot2Var = this.a;
        int i = md4.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (ot2Var.f == null) {
                    ot2Var.f = new URL(ot2Var.d());
                }
                ka1Var.f(a(ot2Var.f, 0, null, ot2Var.b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                ka1Var.a(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        return InputStream.class;
    }
}
