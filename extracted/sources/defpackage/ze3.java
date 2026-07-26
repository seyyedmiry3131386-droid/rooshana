package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ze3 extends at2 {
    public static void o0(HttpURLConnection httpURLConnection, x47 x47Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", x47Var.g());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList p0(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new qx2((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void q0(HttpURLConnection httpURLConnection, x47 x47Var) throws IOException {
        int i = x47Var.b;
        if (i == 0) {
            httpURLConnection.setRequestMethod("GET");
            return;
        }
        if (i == 1) {
            httpURLConnection.setRequestMethod("POST");
            byte[] bArrF = x47Var.f();
            if (bArrF != null) {
                o0(httpURLConnection, x47Var, bArrF);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("Unknown method type.");
            }
            httpURLConnection.setRequestMethod("DELETE");
        } else {
            httpURLConnection.setRequestMethod("PUT");
            byte[] bArrF2 = x47Var.f();
            if (bArrF2 != null) {
                o0(httpURLConnection, x47Var, bArrF2);
            }
        }
    }

    @Override // defpackage.at2
    public final aj0 X(x47 x47Var, Map map) throws Throwable {
        Throwable th;
        String str = x47Var.c;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(x47Var.i());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = x47Var.k.a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            q0(httpURLConnection, x47Var);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (x47Var.b == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                aj0 aj0Var = new aj0(responseCode, -1, 4, p0(httpURLConnection.getHeaderFields()), null);
                httpURLConnection.disconnect();
                return aj0Var;
            }
            try {
                return new aj0(responseCode, httpURLConnection.getContentLength(), 4, p0(httpURLConnection.getHeaderFields()), new ye3(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
