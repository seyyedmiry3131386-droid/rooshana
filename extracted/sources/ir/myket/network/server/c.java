package ir.myket.network.server;

import android.content.Context;
import defpackage.a27;
import defpackage.ap7;
import defpackage.bt2;
import defpackage.cp7;
import defpackage.e51;
import defpackage.e71;
import defpackage.h11;
import defpackage.ja1;
import defpackage.js3;
import defpackage.kf1;
import defpackage.s7;
import defpackage.ub8;
import defpackage.ug1;
import defpackage.up1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final Context a;
    public final a b;
    public final e71 c;
    public final HashMap d;
    public final l e;
    public final h11 f;

    public c(Context context, a aVar) {
        ub8 ub8VarA = a27.a();
        ug1 ug1Var = up1.a;
        e51 e51VarA = js3.a(bt2.L(ub8VarA, kf1.c));
        this.a = context;
        this.b = aVar;
        this.c = e51VarA;
        this.d = new HashMap();
        l lVarB = ja1.b(new HashMap());
        this.e = lVarB;
        bt2.G(e51VarA, null, null, new ServerMonitor$registerAppServersCollector$1(this, null), 3);
        this.f = new h11(lVarB, 1);
    }

    public final cp7 a(ap7 ap7Var, String str) {
        ArrayList arrayList = new ArrayList(ap7Var.c.size());
        for (String str2 : ap7Var.c) {
            HashMap map = this.d;
            b bVar = (b) map.get(str2);
            if (bVar == null) {
                bVar = new b(str2);
                map.put(str2, bVar);
            }
            arrayList.add(bVar);
        }
        return new cp7(this.b, ap7Var.a, arrayList, ap7Var.b, str);
    }

    public final String b(String str) {
        js3.p(str, "serviceName");
        if (!((Map) this.e.getValue()).containsKey(str)) {
            str = null;
        }
        return str == null ? "default" : str;
    }

    public final void c(int i, String str) {
        b bVar;
        if (s7.G(this.a) && (bVar = (b) this.d.get(str)) != null) {
            bt2.G(this.c, null, null, new ServerMonitor$signalNetworkFailureImpl$1$1(i, bVar, null), 3);
        }
    }

    public final void d(String str, boolean z) {
        js3.p(str, "baseUrl");
        b bVar = (b) this.d.get(str);
        if (bVar != null) {
            bt2.G(this.c, null, null, new ServerMonitor$signalNetworkSuccess$1$1(z, bVar, null), 3);
        }
    }
}
