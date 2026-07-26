package defpackage;

import android.content.Context;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.serverUrl.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bp7 {
    public String b;
    public dp7 d;
    public final a f;
    public final HashMap c = new HashMap();
    public final HashMap e = new HashMap();
    public Context g = ((w91) ApplicationLauncher.o.b()).a.a;
    public final int a = 10;

    public bp7(a aVar, t32 t32Var) {
        this.f = aVar;
        t32Var.l(this, false);
        b();
    }

    public final dp7 a(ms msVar, String str) {
        ArrayList arrayList = new ArrayList(msVar.servers.size());
        for (String str2 : msVar.servers) {
            HashMap map = this.c;
            xo7 xo7Var = (xo7) map.get(str2);
            if (xo7Var == null) {
                xo7Var = new xo7(str2);
                map.put(str2, xo7Var);
            }
            arrayList.add(xo7Var);
        }
        return new dp7(this.f, msVar.id, arrayList, msVar.index, this.a, str);
    }

    public final void b() {
        qs qsVar = this.f.a;
        this.c.clear();
        HashMap map = this.e;
        map.clear();
        this.b = qsVar.fallbackServerUrl;
        this.d = a(qsVar.defaultServerList, "DefaultServers");
        List<ns> list = qsVar.serviceServerLists;
        if (list != null) {
            for (ns nsVar : list) {
                lw.d(null, null, nsVar.serviceList);
                lw.b(null, null, nsVar.serviceList.isEmpty());
                dp7 dp7VarA = a(nsVar.serverList, "ServiceServers(" + nsVar.serviceList.get(0) + ")");
                Iterator<String> it = nsVar.serviceList.iterator();
                while (it.hasNext()) {
                    lw.e((dp7) map.put(it.next(), dp7VarA));
                }
            }
        }
        qsVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.z57 r5, com.android.volley.VolleyError r6) {
        /*
            r4 = this;
            boolean r0 = r5.h
            if (r0 != 0) goto L6
            r5 = 0
            goto L10
        L6:
            java.util.HashMap r0 = r4.c
            java.lang.String r5 = r5.a
            java.lang.Object r5 = r0.get(r5)
            xo7 r5 = (defpackage.xo7) r5
        L10:
            if (r5 != 0) goto L13
            goto L6b
        L13:
            android.content.Context r0 = r4.g
            boolean r0 = defpackage.s7.G(r0)
            if (r0 != 0) goto L1c
            goto L6b
        L1c:
            boolean r0 = r6 instanceof com.android.volley.TimeoutError
            r1 = 10
            if (r0 == 0) goto L23
            goto L53
        L23:
            boolean r0 = r6 instanceof com.android.volley.NoConnectionError
            if (r0 == 0) goto L29
            r1 = 4
            goto L53
        L29:
            boolean r0 = r6 instanceof com.android.volley.NetworkError
            if (r0 == 0) goto L2e
            goto L53
        L2e:
            boolean r0 = r6 instanceof com.android.volley.ClientError
            r2 = 0
            if (r0 == 0) goto L35
        L33:
            r1 = r2
            goto L53
        L35:
            boolean r0 = r6 instanceof com.android.volley.ServerError
            r3 = 5
            if (r0 == 0) goto L4e
            r0 = r6
            com.android.volley.ServerError r0 = (com.android.volley.ServerError) r0
            fn5 r0 = r0.a
            if (r0 != 0) goto L42
            goto L53
        L42:
            int r0 = r0.a
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 < r2) goto L53
            r2 = 399(0x18f, float:5.59E-43)
            if (r0 > r2) goto L53
        L4c:
            r1 = r3
            goto L53
        L4e:
            boolean r0 = r6 instanceof com.android.volley.ParseError
            if (r0 == 0) goto L33
            goto L4c
        L53:
            boolean r0 = defpackage.rk1.b()
            if (r0 == 0) goto L66
            r6.getClass()
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L63
            goto L66
        L63:
            r6.getMessage()
        L66:
            if (r1 <= 0) goto L6b
            r5.a(r1)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp7.c(z57, com.android.volley.VolleyError):void");
    }

    public void onEvent(rs rsVar) {
        b();
    }
}
