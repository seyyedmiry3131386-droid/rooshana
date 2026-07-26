package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class wa7 {
    public final sc a;
    public final c35 b;
    public final xv6 c;
    public final boolean d;
    public final List e;
    public int f;
    public Object g;
    public final ArrayList h;

    public wa7(sc scVar, c35 c35Var, xv6 xv6Var, boolean z) {
        List listK;
        js3.p(c35Var, "routeDatabase");
        this.a = scVar;
        this.b = c35Var;
        this.c = xv6Var;
        this.d = z;
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.g = emptyList;
        this.h = new ArrayList();
        se3 se3Var = scVar.h;
        z32 z32Var = xv6Var.d;
        z32Var.p(xv6Var, se3Var);
        URI uriI = se3Var.i();
        if (uriI.getHost() == null) {
            listK = ih9.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = scVar.g.select(uriI);
            listK = (listSelect == null || listSelect.isEmpty()) ? ih9.k(new Proxy[]{Proxy.NO_PROXY}) : ih9.j(listSelect);
        }
        this.e = listK;
        this.f = 0;
        z32Var.o(xv6Var, se3Var, listK);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
