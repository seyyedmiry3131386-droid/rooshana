package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.firebase.concurrent.b;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;
import defpackage.ad2;
import defpackage.b58;
import defpackage.c30;
import defpackage.cf8;
import defpackage.d24;
import defpackage.ky0;
import defpackage.l57;
import defpackage.nc2;
import defpackage.o20;
import defpackage.o29;
import defpackage.ox9;
import defpackage.ql3;
import defpackage.qn6;
import defpackage.qq4;
import defpackage.rq4;
import defpackage.uh3;
import defpackage.ur2;
import defpackage.w20;
import defpackage.x20;
import defpackage.xc2;
import defpackage.xr2;
import defpackage.yc2;
import defpackage.z67;
import defpackage.zc2;
import defpackage.zu6;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ad2 {
    public static final Object m = new Object();
    public final xc2 a;
    public final yc2 b;
    public final nc2 c;
    public final o29 d;
    public final d24 e;
    public final zu6 f;
    public final Object g;
    public final ExecutorService h;
    public final b i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public a(xc2 xc2Var, qn6 qn6Var, ExecutorService executorService, b bVar) {
        xc2Var.a();
        yc2 yc2Var = new yc2(xc2Var.a, qn6Var);
        nc2 nc2Var = new nc2(xc2Var);
        if (ql3.b == null) {
            ql3.b = new ql3();
        }
        ql3 ql3Var = ql3.b;
        if (o29.d == null) {
            o29.d = new o29(ql3Var);
        }
        o29 o29Var = o29.d;
        d24 d24Var = new d24(new ky0(2, xc2Var));
        zu6 zu6Var = new zu6();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = xc2Var;
        this.b = yc2Var;
        this.c = nc2Var;
        this.d = o29Var;
        this.e = d24Var;
        this.f = zu6Var;
        this.h = executorService;
        this.i = bVar;
    }

    public final void a(b58 b58Var) {
        synchronized (this.g) {
            this.l.add(b58Var);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        x20 x20VarB;
        synchronized (m) {
            try {
                xc2 xc2Var = this.a;
                xc2Var.a();
                qq4 qq4VarD = qq4.d(xc2Var.a);
                try {
                    x20VarB = this.c.B();
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = x20VarB.b;
                    if (persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.b || persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.a) {
                        String strH = h(x20VarB);
                        nc2 nc2Var = this.c;
                        w20 w20VarA = x20VarB.a();
                        w20VarA.a = strH;
                        w20VarA.b = PersistedInstallation$RegistrationStatus.c;
                        x20VarB = w20VarA.a();
                        nc2Var.v(x20VarB);
                    }
                    if (qq4VarD != null) {
                        qq4VarD.A();
                    }
                } catch (Throwable th) {
                    if (qq4VarD != null) {
                        qq4VarD.A();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(x20VarB);
        this.i.execute(new zc2(this, 1));
    }

    public final x20 c(x20 x20Var) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        c30 c30Var;
        c30 c30VarF;
        xc2 xc2Var = this.a;
        xc2Var.a();
        String str = xc2Var.c.a;
        String str2 = x20Var.a;
        xc2Var.a();
        String str3 = xc2Var.c.g;
        String str4 = x20Var.d;
        yc2 yc2Var = this.b;
        l57 l57Var = yc2Var.c;
        if (!l57Var.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = yc2.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = yc2Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    yc2.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    l57Var.d(responseCode);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                }
            } catch (IOException | AssertionError unused) {
                httpURLConnection = httpURLConnectionC;
            }
            if (responseCode >= 200 && responseCode < 300) {
                c30VarF = yc2.f(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                yc2.b(httpURLConnectionC, null, str, str3);
                httpURLConnection = httpURLConnectionC;
                try {
                    if (responseCode == 401 || responseCode == 404) {
                        byte b = (byte) (0 | 1);
                        TokenResult$ResponseCode tokenResult$ResponseCode = TokenResult$ResponseCode.c;
                        if (b != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        c30Var = new c30(null, 0L, tokenResult$ResponseCode);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c30VarF = c30Var;
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            t0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            byte b2 = (byte) (0 | 1);
                            TokenResult$ResponseCode tokenResult$ResponseCode2 = TokenResult$ResponseCode.b;
                            if (b2 != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            c30Var = new c30(null, 0L, tokenResult$ResponseCode2);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            c30VarF = c30Var;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            int iOrdinal = c30VarF.c.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    w20 w20VarA = x20Var.a();
                    w20VarA.g = "BAD CONFIG";
                    w20VarA.b = PersistedInstallation$RegistrationStatus.e;
                    return w20VarA.a();
                }
                if (iOrdinal != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                l(null);
                w20 w20VarA2 = x20Var.a();
                w20VarA2.b = PersistedInstallation$RegistrationStatus.b;
                return w20VarA2.a();
            }
            String str5 = c30VarF.a;
            long j = c30VarF.b;
            o29 o29Var = this.d;
            o29Var.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o29Var.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            w20 w20VarA3 = x20Var.a();
            w20VarA3.c = str5;
            w20VarA3.e = j;
            byte b3 = (byte) (w20VarA3.h | 1);
            w20VarA3.f = seconds;
            w20VarA3.h = (byte) (b3 | 2);
            return w20VarA3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ox9 d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return z67.g(str);
        }
        cf8 cf8Var = new cf8();
        a(new xr2(cf8Var));
        ox9 ox9Var = cf8Var.a;
        this.h.execute(new zc2(this, 0));
        return ox9Var;
    }

    public final ox9 e() {
        g();
        cf8 cf8Var = new cf8();
        a(new ur2(this.d, cf8Var));
        this.h.execute(new zc2(this, 2));
        return cf8Var.a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(x20 x20Var) {
        synchronized (m) {
            try {
                xc2 xc2Var = this.a;
                xc2Var.a();
                qq4 qq4VarD = qq4.d(xc2Var.a);
                try {
                    this.c.v(x20Var);
                    if (qq4VarD != null) {
                        qq4VarD.A();
                    }
                } catch (Throwable th) {
                    if (qq4VarD != null) {
                        qq4VarD.A();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        xc2 xc2Var = this.a;
        xc2Var.a();
        rq4.l(xc2Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xc2Var.a();
        rq4.l(xc2Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xc2Var.a();
        rq4.l(xc2Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xc2Var.a();
        String str = xc2Var.c.b;
        Pattern pattern = o29.c;
        rq4.h("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        xc2Var.a();
        rq4.h("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", o29.c.matcher(xc2Var.c.a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(defpackage.x20 r3) {
        /*
            r2 = this;
            xc2 r0 = r2.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            xc2 r0 = r2.a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L51
        L1e:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r3.b
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus.a
            if (r3 != r0) goto L51
            d24 r3 = r2.e
            java.lang.Object r3 = r3.get()
            uh3 r3 = (defpackage.uh3) r3
            android.content.SharedPreferences r0 = r3.a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r3 = move-exception
            goto L4f
        L39:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
        L3e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4e
            zu6 r3 = r2.f
            r3.getClass()
            java.lang.String r3 = defpackage.zu6.a()
            return r3
        L4e:
            return r1
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        L51:
            zu6 r3 = r2.f
            r3.getClass()
            java.lang.String r3 = defpackage.zu6.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.h(x20):java.lang.String");
    }

    public final x20 i(x20 x20Var) throws FirebaseInstallationsException {
        int responseCode;
        o20 o20VarE;
        String str = x20Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            uh3 uh3Var = (uh3) this.e.get();
            synchronized (uh3Var.a) {
                try {
                    String[] strArr = uh3.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = uh3Var.a.getString("|T|" + uh3Var.b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        yc2 yc2Var = this.b;
        xc2 xc2Var = this.a;
        xc2Var.a();
        String str3 = xc2Var.c.a;
        String str4 = x20Var.a;
        xc2 xc2Var2 = this.a;
        xc2Var2.a();
        String str5 = xc2Var2.c.g;
        xc2 xc2Var3 = this.a;
        xc2Var3.a();
        String str6 = xc2Var3.c.b;
        l57 l57Var = yc2Var.c;
        if (!l57Var.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = yc2.a("projects/" + str5 + "/installations");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = yc2Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    yc2.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    l57Var.d(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                o20VarE = yc2.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                yc2.b(httpURLConnectionC, str6, str3, str5);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    t0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    o20 o20Var = new o20(null, null, null, null, InstallationResponse$ResponseCode.b);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    o20VarE = o20Var;
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int iOrdinal = o20VarE.e.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                w20 w20VarA = x20Var.a();
                w20VarA.g = "BAD CONFIG";
                w20VarA.b = PersistedInstallation$RegistrationStatus.e;
                return w20VarA.a();
            }
            String str7 = o20VarE.b;
            String str8 = o20VarE.c;
            o29 o29Var = this.d;
            o29Var.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o29Var.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            c30 c30Var = o20VarE.d;
            String str9 = c30Var.a;
            long j = c30Var.b;
            w20 w20VarA2 = x20Var.a();
            w20VarA2.a = str7;
            w20VarA2.b = PersistedInstallation$RegistrationStatus.d;
            w20VarA2.c = str9;
            w20VarA2.d = str8;
            w20VarA2.e = j;
            byte b = (byte) (w20VarA2.h | 1);
            w20VarA2.f = seconds;
            w20VarA2.h = (byte) (b | 2);
            return w20VarA2.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((b58) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(x20 x20Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((b58) it.next()).b(x20Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(x20 x20Var, x20 x20Var2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(x20Var.a, x20Var2.a)) {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
