package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.sentry.config.a;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nene.downloadmanager.downloader.async.AsyncTaskCanceledException;
import nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkBadResponseException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkException;
import nene.downloadmanager.exceptions.downloadfail.NeneNoCategoryException;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class xl7 extends vl5 {
    public static final Pattern v;
    public final int h;
    public final String i;
    public final tt1 j;
    public final zl7 r;
    public int t;
    public int k = 10;
    public HttpURLConnection l = null;
    public InputStream m = null;
    public BufferedOutputStream n = null;
    public final hq8 o = new hq8();
    public long p = 0;
    public long q = 0;
    public final byte[] s = new byte[1024];
    public long u = 0;

    static {
        eh5.a("SegmentDownloader");
        v = Pattern.compile("\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)");
    }

    public xl7(tt1 tt1Var, zl7 zl7Var) {
        int i = zl7Var.a;
        this.h = i;
        this.j = tt1Var;
        this.r = zl7Var;
        this.i = bl4.q(i, "SegmentDownloader[", "]");
    }

    @Override // defpackage.vl5
    public final Object b(Object[] objArr) {
        zl7 zl7Var = this.r;
        z27.f();
        try {
            long j = zl7Var.e;
            long j2 = zl7Var.c;
            long j3 = zl7Var.d;
            if (j < 0) {
                j = j3;
            }
            if ((j - (zl7Var.g + j2)) + 1 <= 0) {
                p(300);
            } else {
                if (p(100)) {
                    g(1000);
                }
                n();
                this.t = 0;
                this.u = System.currentTimeMillis();
                while (true) {
                    long j4 = zl7Var.e;
                    if (j4 < 0) {
                        j4 = j3;
                    }
                    long j5 = j2;
                    if ((j4 - (j5 + zl7Var.g)) + 1 <= 0) {
                        break;
                    }
                    i();
                    k();
                    o();
                    j2 = j5;
                }
                m();
            }
        } catch (AsyncTaskCanceledException unused) {
            p(500);
        } catch (NeneDownloadFailException e) {
            if (p(ErrorDTO.CODE_ACCESS_DENIED)) {
                l(0, false);
                this.a = e;
            }
        } catch (Exception e2) {
            NeneDownloadFailException neneDownloadFailException = new NeneDownloadFailException(e2, dw1.s(new StringBuilder(), this.i, " Unexpected error"));
            if (p(ErrorDTO.CODE_ACCESS_DENIED)) {
                l(0, false);
                this.a = neneDownloadFailException;
            }
        }
        BufferedOutputStream bufferedOutputStream = this.n;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.flush();
            } catch (IOException | Exception unused2) {
            }
            try {
                BufferedOutputStream bufferedOutputStream2 = this.n;
                int i = am5.a;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
            } catch (IOException | Exception unused3) {
            }
            this.n = null;
        }
        h();
        z27.f();
        return Integer.valueOf(this.k);
    }

    @Override // defpackage.vl5
    public final void d(Object obj) throws Throwable {
        tt1 tt1Var = this.j;
        tt1Var.getClass();
        tt1Var.k(this.h, 500);
    }

    @Override // defpackage.vl5
    public final void e(Object obj) throws Throwable {
        int iIntValue = ((Integer) obj).intValue();
        tt1 tt1Var = this.j;
        if (iIntValue == 300) {
            long j = this.r.g;
            dj djVar = tt1Var.g;
            djVar.getClass();
            int i = this.h;
            if (j > djVar.f(i).a.g) {
                tt1Var.g(this, j);
            }
            tt1Var.k(i, 300);
            return;
        }
        if (iIntValue != 400) {
            tt1Var.f(this, null);
            return;
        }
        NeneDownloadFailException neneDownloadFailException = this.a;
        if (o40.O(neneDownloadFailException)) {
            int[] iArr = NeneDownloadFailException.a;
        } else {
            neneDownloadFailException = new NeneDownloadFailException(neneDownloadFailException, "Exception type is not valid");
        }
        tt1Var.f(this, neneDownloadFailException);
    }

    @Override // defpackage.vl5
    public final void f(Object... objArr) throws Throwable {
        if (this.e.get()) {
            return;
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        int i = this.h;
        tt1 tt1Var = this.j;
        if (iIntValue == 1000) {
            tt1Var.getClass();
            tt1Var.k(i, 100);
            return;
        }
        if (iIntValue != 2000) {
            if (iIntValue != 3000) {
                return;
            }
            tt1Var.g(this, ((Long) objArr[1]).longValue());
            return;
        }
        ((Long) objArr[1]).getClass();
        long jLongValue = ((Long) objArr[2]).longValue();
        long jLongValue2 = ((Long) objArr[3]).longValue();
        Object obj = objArr[4];
        String str = obj == null ? null : (String) obj;
        es1 es1Var = tt1Var.f;
        dj djVar = tt1Var.g;
        djVar.getClass();
        djVar.f(i).a.c(jLongValue);
        if (!TextUtils.isEmpty(str) && tt1Var.l == null) {
            tt1Var.l = str;
        }
        if (es1Var.h < 0) {
            es1Var.h = jLongValue2;
            ArrayList arrayListA = zl7.a(es1Var.b, tt1Var.a.a, jLongValue2, es1Var.c);
            djVar.a.size();
            long j = ((zl7) arrayListA.get(0)).d;
            if (arrayListA.size() > 1) {
                for (int i2 = 1; i2 < arrayListA.size(); i2++) {
                    zl7 zl7Var = (zl7) arrayListA.get(i2);
                    try {
                        String str2 = zl7Var.f;
                        int i3 = am5.a;
                        am5.a(new File(str2));
                        zl7Var.b(0L);
                        zl7Var.b(0L);
                        tt1Var.a(zl7Var, false);
                    } catch (NeneStorageException e) {
                        tt1Var.d(e);
                        return;
                    }
                }
            }
        }
        tt1Var.k(i, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
    }

    public final void h() {
        InputStream inputStream = this.m;
        if (inputStream != null) {
            try {
                int i = am5.a;
                inputStream.close();
            } catch (IOException | Exception unused) {
            }
            this.m = null;
        }
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused2) {
            }
            this.l = null;
        }
        hq8 hq8Var = this.o;
        hq8Var.a.clear();
        hq8Var.b = 0;
        hq8Var.c = 0L;
        hq8Var.d = 0L;
    }

    public final void i() throws AsyncTaskCanceledException, NeneNetworkException, NeneNoCategoryException {
        Object objValueOf;
        String string;
        h16 h16Var;
        Object obj;
        zl7 zl7Var = this.r;
        boolean z = false;
        if (p(100)) {
            g(1000);
        }
        int i = 0;
        while (!z) {
            a();
            h();
            int i2 = i + 1;
            try {
                String str = zl7Var.b;
                TextUtils.isEmpty(str);
                URL url = new URL(str);
                if (!url.getProtocol().equalsIgnoreCase("http") && !url.getProtocol().equalsIgnoreCase("https")) {
                    throw new NeneNoCategoryException("URL protocol is not HTTP(S), URL: " + url);
                }
                int iIntValue = -1;
                try {
                    url.toString();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    this.l = httpURLConnection;
                    httpURLConnection.setConnectTimeout(20000);
                    this.l.setReadTimeout(20000);
                    this.l.setRequestProperty("Accept-Encoding", "identity");
                    StringBuilder sb = new StringBuilder();
                    sb.append("bytes=");
                    sb.append(zl7Var.c + zl7Var.g);
                    sb.append("-");
                    long j = zl7Var.e;
                    if ((j >= 0 ? j : zl7Var.d) == 4611686018427387903L) {
                        objValueOf = "";
                    } else {
                        if (j < 0) {
                            j = zl7Var.d;
                        }
                        objValueOf = Long.valueOf(j);
                    }
                    sb.append(objValueOf);
                    string = sb.toString();
                    this.l.setRequestProperty("Range", string);
                    this.l.connect();
                    HttpURLConnection httpURLConnection2 = this.l;
                    try {
                        h16Var = new h16(Integer.valueOf(httpURLConnection2.getResponseCode()), null);
                    } catch (IOException e) {
                        try {
                            int responseCode = httpURLConnection2.getResponseCode();
                            if (responseCode <= 0) {
                                throw e;
                            }
                            h16Var = new h16(Integer.valueOf(responseCode), e);
                        } catch (Exception unused) {
                            throw e;
                        }
                    }
                    iIntValue = ((Integer) h16Var.a).intValue();
                    obj = h16Var.b;
                } catch (IOException e2) {
                    e = e2;
                    j(i2, e, iIntValue, "Network problem when connecting '" + url + '\'');
                    i = i2;
                }
                if (obj != null) {
                    throw ((IOException) obj);
                }
                this.m = this.l.getInputStream();
                if (iIntValue <= 0) {
                    throw new IOException("Could not connect to '" + url + '\'');
                }
                a();
                if (iIntValue == 206) {
                    z = true;
                    i = i2;
                } else {
                    try {
                        throw new NeneNetworkBadResponseException("HTTP response code is not correct (it must be 206), server does not support resume, Response code: " + iIntValue + " Header Range: '" + string + "', URL: " + url);
                    } catch (IOException e3) {
                        e = e3;
                        z = true;
                        j(i2, e, iIntValue, "Network problem when connecting '" + url + '\'');
                        i = i2;
                    }
                }
            } catch (MalformedURLException e4) {
                StringBuilder sb2 = new StringBuilder("URL is not valid, URL: ");
                String str2 = zl7Var.b;
                TextUtils.isEmpty(str2);
                sb2.append(str2);
                sb2.append(", File: ");
                sb2.append(zl7Var.f);
                throw new NeneNoCategoryException(e4, sb2.toString());
            }
        }
    }

    public final void j(int i, IOException iOException, int i2, String str) throws AsyncTaskCanceledException, NeneNetworkException {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.u;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(this.i);
        sb.append(' ');
        sb.append(str);
        boolean z = false;
        if (eh5.b(0) && i2 <= 0) {
            boolean z2 = true;
            if (i > 0) {
                sb.append(" (Try ");
                sb.append(i);
                z = true;
            }
            if (jCurrentTimeMillis > 100) {
                if (z) {
                    sb.append(", ");
                    z2 = z;
                } else {
                    sb.append(" (");
                }
                sb.append("No network activity for ");
                sb.append(jCurrentTimeMillis / 1000);
                sb.append(" seconds");
                z = z2;
            }
            if (z) {
                sb.append(')');
            }
        }
        Context context = dh5.a;
        int i3 = am5.a;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        sb.append(" [NetworkInfo ");
        if (activeNetworkInfo == null) {
            sb.append("state:<no network>");
        } else {
            sb.append("type:");
            sb.append(activeNetworkInfo.getTypeName());
            if (!TextUtils.isEmpty(activeNetworkInfo.getSubtypeName())) {
                sb.append("-");
                sb.append(activeNetworkInfo.getSubtypeName());
            }
            sb.append(" state:");
            sb.append(activeNetworkInfo.getState());
            sb.append('/');
            sb.append(activeNetworkInfo.getDetailedState());
        }
        sb.append(']');
        String string = sb.toString();
        if (i2 > 0 || (i >= 5 && jCurrentTimeMillis > 100000)) {
            throw NeneNetworkException.c(i2, iOException, string);
        }
        if (i > 0) {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public final void k() throws NeneNetworkBadResponseException {
        String headerField = this.l.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField)) {
            throw new NeneNetworkBadResponseException("No Content-Range header field in response, URL: " + this.l);
        }
        Matcher matcher = v.matcher(headerField);
        if (!matcher.find()) {
            StringBuilder sbN = t61.n("Value of Content-Range header field cannot be parsed: ", headerField, ", URL: ");
            sbN.append(this.l);
            throw new NeneNetworkBadResponseException(sbN.toString());
        }
        try {
            long j = Long.parseLong(matcher.group(1));
            long j2 = Long.parseLong(matcher.group(2));
            long j3 = Long.parseLong(matcher.group(3));
            zl7 zl7Var = this.r;
            if (j == zl7Var.c + zl7Var.g && j2 >= j) {
                long j4 = zl7Var.e;
                if (j4 < 0) {
                    j4 = zl7Var.d;
                }
                if (j2 <= j4 && j3 > j2) {
                    zl7Var.c(j2);
                    this.o.a(0L);
                    String headerField2 = this.l.getHeaderField("Content-MD5");
                    if (TextUtils.isEmpty(headerField2)) {
                        headerField2 = null;
                    }
                    if (p(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR)) {
                        g(2000, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), headerField2);
                        return;
                    }
                    return;
                }
            }
            StringBuilder sbN2 = t61.n("Value of Content-Range is not good: ", headerField, ", SegmentInfo: ");
            sbN2.append(zl7Var.toString());
            throw new NeneNetworkBadResponseException(sbN2.toString());
        } catch (NumberFormatException e) {
            StringBuilder sbN3 = t61.n("Value of Content-Range header field cannot be parsed: ", headerField, ", URL: ");
            sbN3.append(this.l);
            throw new NeneNetworkBadResponseException(e, sbN3.toString());
        }
    }

    public final void l(int i, boolean z) {
        long j = i;
        long j2 = this.q + j;
        this.q = j2;
        if (j2 <= 0) {
            return;
        }
        this.o.a(j);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z || jCurrentTimeMillis >= this.p + 500) {
            this.p = jCurrentTimeMillis;
            this.q = 0L;
            g(3000, Long.valueOf(this.r.g));
        }
    }

    public final void m() throws NeneStorageException {
        BufferedOutputStream bufferedOutputStream = this.n;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.flush();
                this.n.close();
                this.n = null;
            } catch (IOException e) {
                throw new NeneStorageException(e, "Exception when closing file stream, File: " + this.r.f);
            }
        }
        p(300);
    }

    public final void n() throws NeneStorageException, AsyncTaskCanceledException, NeneNoCategoryException {
        a();
        zl7 zl7Var = this.r;
        long j = zl7Var.g;
        String str = zl7Var.f;
        long j2 = zl7Var.e;
        if (j2 < 0) {
            j2 = zl7Var.d;
        }
        if ((j2 - (zl7Var.c + j)) + 1 <= 0) {
            throw new NeneNoCategoryException("Some data about segment range is not correct, " + zl7Var.toString());
        }
        try {
            this.n = new BufferedOutputStream(a.m(new FileOutputStream(str, true), str));
        } catch (FileNotFoundException e) {
            throw new NeneStorageException(e, "Exception when opening segment file: " + str);
        }
    }

    public final void o() throws NeneStorageException, AsyncTaskCanceledException, NeneNetworkException, NeneNoCategoryException {
        byte[] bArr = this.s;
        this.t++;
        int i = 0;
        while (i >= 0) {
            a();
            try {
                int i2 = this.m.read(bArr);
                zl7 zl7Var = this.r;
                if (i2 <= 0) {
                    if (i2 >= 0) {
                        j(this.t, new EOFException("Return value of InputStream.read() was 0, URL: " + this.l), -1, "readCount == 0, Did not expect this to happen");
                        return;
                    }
                    long j = zl7Var.e;
                    if (j < 0) {
                        j = zl7Var.d;
                    }
                    if ((j - (zl7Var.c + zl7Var.g)) + 1 <= 0) {
                        return;
                    }
                    j(this.t, new EOFException("Connection closed early when read from input stream, URL: " + this.l), -1, "Connection closed");
                    return;
                }
                this.t = 0;
                this.u = System.currentTimeMillis();
                long j2 = i2;
                if (zl7Var.g + j2 > (zl7Var.e - zl7Var.c) + 1) {
                    throw new NeneNoCategoryException("File sent by server is larger than expected, URL: " + this.l);
                }
                try {
                    this.n.write(bArr, 0, i2);
                    zl7Var.b(zl7Var.g + j2);
                    l(i2, true);
                    i = i2;
                } catch (IOException e) {
                    throw new NeneStorageException(e, "Exception when writing downloaded data to file: " + zl7Var.f);
                }
            } catch (IOException e2) {
                j(this.t, e2, -1, "Network problem when read from input stream");
                return;
            }
        }
    }

    public final boolean p(int i) {
        if (i == this.k) {
            return false;
        }
        this.k = i;
        return true;
    }
}
