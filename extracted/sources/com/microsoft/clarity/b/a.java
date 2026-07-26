package com.microsoft.clarity.b;

import android.app.Application;
import android.content.Context;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.g.A;
import com.microsoft.clarity.g.C0077y;
import com.microsoft.clarity.g.E;
import com.microsoft.clarity.g.I;
import com.microsoft.clarity.g.L;
import com.microsoft.clarity.g.a0;
import com.microsoft.clarity.g.b0;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.g.k0;
import com.microsoft.clarity.i.P;
import com.microsoft.clarity.i.q;
import com.microsoft.clarity.i.t;
import com.microsoft.clarity.k.C0096b;
import com.microsoft.clarity.k.C0097c;
import com.microsoft.clarity.k.G;
import com.microsoft.clarity.k.InterfaceC0098d;
import com.microsoft.clarity.k.l;
import com.microsoft.clarity.k.s;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.n.b;
import com.microsoft.clarity.n.c;
import com.microsoft.clarity.n.d;
import com.microsoft.clarity.n.g;
import com.microsoft.clarity.o.f;
import com.microsoft.clarity.o.i;
import com.microsoft.clarity.q.e;
import defpackage.ew;
import defpackage.js3;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static l b;
    public static C0096b c;
    public static h0 d;
    public static f e;
    public static L f;
    public static i g;
    public static d h;
    public static a0 j;
    public static DynamicConfig k;
    public static b0 l;
    public static com.microsoft.clarity.h.a m;
    public static final Object a = new Object();
    public static final HashMap i = new HashMap();

    public static t a(Context context, ClarityConfig clarityConfig) {
        C0096b c0096b;
        js3.p(context, "context");
        js3.p(clarityConfig, "config");
        Application application = (Application) context;
        DynamicConfig dynamicConfigA = a(context);
        js3.m(dynamicConfigA);
        d = b(context, clarityConfig.getProjectId());
        InterfaceC0098d interfaceC0098dA = a(application, clarityConfig);
        js3.p(interfaceC0098dA, "lifecycleObserver");
        synchronized (a) {
            try {
                if (c == null) {
                    c = new C0096b(application);
                }
                c0096b = c;
                js3.m(c0096b);
            } catch (Throwable th) {
                throw th;
            }
        }
        s sVar = new s();
        C0097c c0097c = new C0097c();
        G g2 = !dynamicConfigA.getDisableWebViewCapture() ? new G(context, dynamicConfigA) : null;
        b0 b0VarA = a();
        k0 k0Var = new k0();
        h0 h0Var = d;
        js3.m(h0Var);
        I i2 = new I(context, b0VarA, h0Var);
        A a2 = new A(context, b0VarA);
        h0 h0Var2 = d;
        js3.m(h0Var2);
        com.microsoft.clarity.h.a aVarA = a(context, dynamicConfigA, h0Var2);
        E e2 = new E(b0VarA);
        com.microsoft.clarity.m.s sVar2 = new com.microsoft.clarity.m.s(k0Var, d(context));
        c cVarB = b(application, 1);
        h0 h0Var3 = d;
        js3.m(h0Var3);
        d(application);
        P p = new P(application, clarityConfig, dynamicConfigA, aVarA, cVarB, a(application, dynamicConfigA.getNetworkMaxDailyDataInMB()), i2, a2, h0Var3);
        C0077y c0077y = new C0077y(context, new e());
        h0 h0Var4 = d;
        js3.m(h0Var4);
        q qVar = new q(application, clarityConfig, dynamicConfigA, sVar2, interfaceC0098dA, sVar, c0097c, g2, c0096b, h0Var4, k0Var, e2, c0077y);
        h0 h0Var5 = d;
        js3.m(h0Var5);
        return new t(context, qVar, p, h0Var5, interfaceC0098dA);
    }

    public static h0 b(Context context, String str) {
        h0 h0Var;
        js3.p(context, "context");
        js3.p(str, "projectId");
        b0 b0VarA = a();
        i iVarC = c(context);
        synchronized (a) {
            try {
                if (d == null) {
                    d = new h0(str, b0VarA, iVarC);
                }
                h0Var = d;
                js3.m(h0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }

    public static i c(Context context) {
        i iVar;
        synchronized (a) {
            try {
                if (g == null) {
                    g = new i(context);
                }
                iVar = g;
                js3.m(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static com.microsoft.clarity.p.e d(Context context) {
        return a(context, ew.O0(62, String.valueOf(File.separatorChar), new String[]{"assets", "typefaces"}));
    }

    public static c b(Context context, int i2) {
        c cVar;
        js3.p(context, "context");
        synchronized (a) {
            try {
                HashMap map = i;
                if (!map.containsKey(Integer.valueOf(i2))) {
                    map.put(Integer.valueOf(i2), a(context, i2));
                }
                Object obj = map.get(Integer.valueOf(i2));
                js3.m(obj);
                cVar = (c) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static b b(Context context) {
        d dVar;
        js3.p(context, "context");
        synchronized (a) {
            try {
                if (h == null) {
                    h = new d(a(context, "metadata"));
                }
                dVar = h;
                js3.m(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static InterfaceC0098d a(Application application, ClarityConfig clarityConfig) {
        l lVar;
        js3.p(application, "app");
        js3.p(clarityConfig, "config");
        synchronized (a) {
            try {
                if (b == null) {
                    b = new l(application, clarityConfig);
                }
                lVar = b;
                js3.m(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public static DynamicConfig a(Context context) {
        DynamicConfig dynamicConfig;
        js3.p(context, "context");
        synchronized (a) {
            try {
                if (k == null && DynamicConfig.Companion.isFetched(context)) {
                    k = new DynamicConfig(context);
                }
                dynamicConfig = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dynamicConfig;
    }

    public static com.microsoft.clarity.o.a a(Context context, h0 h0Var, L l2) {
        f fVar;
        js3.p(context, "context");
        js3.p(h0Var, "telemetryTracker");
        synchronized (a) {
            try {
                if (e == null) {
                    e = new f(context, h0Var, l2);
                }
                fVar = e;
                js3.m(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static L a(Context context, Long l2) {
        L l3;
        js3.p(context, "context");
        synchronized (a) {
            try {
                if (f == null) {
                    f = new L(context, l2);
                }
                l3 = f;
                js3.m(l3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return l3;
    }

    public static com.microsoft.clarity.p.e a(Context context, String str) {
        js3.p(context, "context");
        js3.p(str, "directory");
        return new com.microsoft.clarity.p.e(context, str, null);
    }

    public static b0 a() {
        b0 b0Var;
        synchronized (a) {
            try {
                if (l == null) {
                    l = new b0();
                }
                b0Var = l;
                js3.m(b0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    public static com.microsoft.clarity.h.a a(Context context, DynamicConfig dynamicConfig, h0 h0Var) {
        com.microsoft.clarity.h.a aVar;
        js3.p(context, "context");
        js3.p(dynamicConfig, "dynamicConfig");
        synchronized (a) {
            try {
                if (m == null) {
                    m = new com.microsoft.clarity.h.a(context, dynamicConfig, h0Var);
                }
                aVar = m;
                js3.m(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static g a(Context context, int i2) throws com.microsoft.clarity.c.e {
        if (i2 == 1) {
            b bVarB = b(context);
            com.microsoft.clarity.p.e eVarA = a(context, "frames");
            com.microsoft.clarity.p.e eVarA2 = a(context, "events");
            char c2 = File.separatorChar;
            return new g(bVarB, eVarA, eVarA2, a(context, ew.O0(62, String.valueOf(c2), new String[]{"assets", "images"})), d(context), a(context, ew.O0(62, String.valueOf(c2), new String[]{"assets", "web"})));
        }
        throw new com.microsoft.clarity.c.e(i2);
    }
}
