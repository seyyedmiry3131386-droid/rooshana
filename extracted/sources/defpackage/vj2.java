package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vj2 extends tb2 {
    public final tb2 c;

    public vj2(tb2 tb2Var) {
        js3.p(tb2Var, "delegate");
        this.c = tb2Var;
    }

    @Override // defpackage.tb2
    public final List I(s26 s26Var) {
        List<s26> listI = this.c.I(s26Var);
        ArrayList arrayList = new ArrayList();
        for (s26 s26Var2 : listI) {
            js3.p(s26Var2, "path");
            arrayList.add(s26Var2);
        }
        yu0.X(arrayList);
        return arrayList;
    }

    @Override // defpackage.tb2
    public final List J(s26 s26Var) {
        js3.p(s26Var, "dir");
        List<s26> listJ = this.c.J(s26Var);
        if (listJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (s26 s26Var2 : listJ) {
            js3.p(s26Var2, "path");
            arrayList.add(s26Var2);
        }
        yu0.X(arrayList);
        return arrayList;
    }

    @Override // defpackage.tb2
    public final xj1 P(s26 s26Var) {
        js3.p(s26Var, "path");
        xj1 xj1VarP = this.c.P(s26Var);
        if (xj1VarP == null) {
            return null;
        }
        s26 s26Var2 = (s26) xj1VarP.d;
        if (s26Var2 == null) {
            return xj1VarP;
        }
        boolean z = xj1VarP.b;
        boolean z2 = xj1VarP.c;
        Long l = (Long) xj1VarP.e;
        Long l2 = (Long) xj1VarP.f;
        Long l3 = (Long) xj1VarP.g;
        Long l4 = (Long) xj1VarP.h;
        Map map = (Map) xj1VarP.i;
        js3.p(map, "extras");
        return new xj1(z, z2, s26Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.tb2
    public final vw3 R(s26 s26Var) {
        return this.c.R(s26Var);
    }

    @Override // defpackage.tb2
    public by7 U(s26 s26Var, boolean z) {
        js3.p(s26Var, "file");
        return this.c.U(s26Var, z);
    }

    @Override // defpackage.tb2
    public final by7 b(s26 s26Var) {
        js3.p(s26Var, "file");
        return this.c.b(s26Var);
    }

    @Override // defpackage.tb2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.tb2
    public final void d(s26 s26Var, s26 s26Var2) {
        js3.p(s26Var, "source");
        js3.p(s26Var2, "target");
        this.c.d(s26Var, s26Var2);
    }

    @Override // defpackage.tb2
    public final void k(s26 s26Var) {
        js3.p(s26Var, "dir");
        this.c.k(s26Var);
    }

    @Override // defpackage.tb2
    public final t18 k0(s26 s26Var) {
        js3.p(s26Var, "file");
        return this.c.k0(s26Var);
    }

    public final String toString() {
        return g27.a(getClass()).d() + '(' + this.c + ')';
    }

    @Override // defpackage.tb2
    public final void u(s26 s26Var) {
        js3.p(s26Var, "path");
        this.c.u(s26Var);
    }
}
