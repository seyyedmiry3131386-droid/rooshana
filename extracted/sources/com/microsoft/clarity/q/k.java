package com.microsoft.clarity.q;

import com.microsoft.clarity.models.LogLevel;
import defpackage.dp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.ry7;
import defpackage.zp0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static HttpURLConnection a(String str, String str2, Map map) throws IOException {
        js3.p(str, "url");
        js3.p(str2, "requestMethod");
        js3.p(map, "requestProperties");
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        js3.n(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setRequestProperty("SDK-Version", f88.F0("3.8.0", '-'));
        httpURLConnection.setRequestProperty("SDK-Framework", "android");
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        LogLevel logLevel = l.a;
        l.b("Creating connection: " + httpURLConnection.getRequestMethod() + ' ' + httpURLConnection.getURL() + '.');
        return httpURLConnection;
    }

    public static boolean b(HttpURLConnection httpURLConnection) throws IOException {
        String strG0;
        js3.p(httpURLConnection, "urlConnection");
        int responseCode = httpURLConnection.getResponseCode();
        boolean z = 200 <= responseCode && responseCode < 300;
        String string = "Request response code (" + httpURLConnection.getURL() + "): " + httpURLConnection.getResponseCode() + '.';
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(' ');
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, zp0.a), 8192);
                try {
                    String strR = ry7.r(bufferedReader);
                    strG0 = f88.G0(f88.D0(strR, "\"detail\":\"", strR), "\"");
                    bufferedReader.close();
                } finally {
                }
            } else {
                strG0 = "";
            }
            sb.append(strG0);
            string = sb.toString();
        }
        l.b(string);
        return z;
    }

    public static long a(HttpURLConnection httpURLConnection, boolean z, dp2 dp2Var) throws IOException {
        js3.p(httpURLConnection, "urlConnection");
        js3.p(dp2Var, "writer");
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        js3.o(outputStream, "urlConnection.outputStream");
        b bVar = new b(outputStream);
        OutputStream gZIPOutputStream = z ? new GZIPOutputStream(bVar) : bVar;
        try {
            dp2Var.invoke(gZIPOutputStream);
            gZIPOutputStream.flush();
            bVar.close();
            gZIPOutputStream.close();
            return bVar.b;
        } finally {
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws com.microsoft.clarity.c.b, IOException {
        js3.p(httpURLConnection, "urlConnection");
        if (b(httpURLConnection)) {
            InputStream inputStream = httpURLConnection.getInputStream();
            js3.o(inputStream, "urlConnection.inputStream");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, zp0.a), 8192);
            try {
                String strR = ry7.r(bufferedReader);
                bufferedReader.close();
                return strR;
            } finally {
            }
        } else {
            throw new com.microsoft.clarity.c.b("Unsuccessful request: " + httpURLConnection.getResponseMessage());
        }
    }
}
