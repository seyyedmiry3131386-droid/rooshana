package io.sentry;

import defpackage.o40;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 {
    public final ArrayList a;

    public c2() {
        this.a = new ArrayList();
    }

    public x1 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (x1) o40.u(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        x1 x1VarA = a();
        d();
        if (!(a() instanceof a2)) {
            if (!(a() instanceof y1)) {
                return false;
            }
            y1 y1Var = (y1) a();
            if (x1VarA == null || y1Var == null) {
                return false;
            }
            y1Var.a.add(x1VarA.getValue());
            return false;
        }
        a2 a2Var = (a2) a();
        d();
        z1 z1Var = (z1) a();
        if (a2Var == null || x1VarA == null || z1Var == null) {
            return false;
        }
        z1Var.a.put(a2Var.a, x1VarA.getValue());
        return false;
    }

    public boolean c(w1 w1Var) {
        Object objE = w1Var.e();
        if (a() == null && objE != null) {
            this.a.add(new b2(objE));
            return true;
        }
        if (a() instanceof a2) {
            a2 a2Var = (a2) a();
            d();
            ((z1) a()).a.put(a2Var.a, objE);
            return false;
        }
        if (!(a() instanceof y1)) {
            return false;
        }
        ((y1) a()).a.add(objE);
        return false;
    }

    public void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public c2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}
