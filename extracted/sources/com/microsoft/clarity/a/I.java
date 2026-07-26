package com.microsoft.clarity.a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.SessionStartedCallback;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.i.C0093o;
import com.microsoft.clarity.k.EnumC0099e;
import com.microsoft.clarity.k.InterfaceC0098d;
import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.f88;
import defpackage.ii;
import defpackage.js3;
import defpackage.uq3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class I {
    public static com.microsoft.clarity.i.t a;
    public static boolean b;
    public static ClarityConfig c;
    public static String f;
    public static String g;
    public static String j;
    public static SessionStartedCallback k;
    public static boolean l;
    public static SessionStartedCallback m;
    public static boolean n;
    public static ConsentStatus o;
    public static final ArrayList d = new ArrayList();
    public static final ArrayList e = new ArrayList();
    public static final LinkedHashMap h = new LinkedHashMap();
    public static final ArrayList i = new ArrayList();
    public static final Object p = new Object();

    public static boolean a(String str) {
        js3.p(str, "customUserId");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.d("Setting custom user id to " + str + '.');
        if (f88.n0(str)) {
            com.microsoft.clarity.q.l.c("Custom user id cannot be blank.");
            return false;
        }
        if (str.length() <= 255) {
            return com.microsoft.clarity.q.g.a((bp2) new y(str), (dp2) z.a, (C0093o) null, 26);
        }
        com.microsoft.clarity.q.l.c("Custom user id length cannot exceed 255 characters.");
        return false;
    }

    public static final boolean a() {
        uq3 uq3Var = new uq3(29, 36, 1);
        int i2 = Build.VERSION.SDK_INT;
        return 29 <= i2 && i2 <= uq3Var.b;
    }

    public static void a(Application application, ClarityConfig clarityConfig, Activity activity2) {
        c = clarityConfig;
        InterfaceC0098d interfaceC0098dA = com.microsoft.clarity.b.a.a(application, clarityConfig);
        if (activity2 != null) {
            com.microsoft.clarity.k.l lVar = (com.microsoft.clarity.k.l) interfaceC0098dA;
            lVar.getClass();
            lVar.c.put(Integer.valueOf(activity2.hashCode()), EnumC0099e.ON_RESUME);
            lVar.d = new WeakReference(activity2);
        }
        new Thread(new ii(application, clarityConfig, interfaceC0098dA, 10)).start();
    }

    public static final void a(Application application, ClarityConfig clarityConfig, InterfaceC0098d interfaceC0098d) {
        js3.p(application, "$context");
        js3.p(clarityConfig, "$config");
        js3.p(interfaceC0098d, "$lifecycleObserver");
        com.microsoft.clarity.q.g.a(new C0052k(application, clarityConfig, interfaceC0098d), C0053l.a, (bp2) null, 10);
    }

    public static final void a(Exception exc, ErrorType errorType) {
        com.microsoft.clarity.i.t tVar = a;
        if (tVar != null) {
            js3.p(exc, "exception");
            js3.p(errorType, "errorType");
            tVar.c.a(exc, errorType, tVar.b.a());
        } else {
            h0 h0Var = com.microsoft.clarity.b.a.d;
            if (h0Var != null) {
                h0Var.a(exc, errorType, null);
            }
            if (h0Var == null) {
                com.microsoft.clarity.q.l.c(exc.toString());
            }
        }
    }
}
