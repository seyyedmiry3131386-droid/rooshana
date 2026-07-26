package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gd7 implements fd7 {
    public final dp2 a;
    public final rb5 b;
    public rb5 c;

    public gd7(Map map, dp2 dp2Var) {
        rb5 rb5Var;
        this.a = dp2Var;
        if (map == null || map.isEmpty()) {
            rb5Var = null;
        } else {
            rb5Var = new rb5(map.size());
            for (Map.Entry entry : map.entrySet()) {
                rb5Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = rb5Var;
    }

    @Override // defpackage.fd7
    public final ed7 a(String str, bp2 bp2Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!js3.F(str.charAt(i))) {
                rb5 rb5Var = this.c;
                if (rb5Var == null) {
                    long[] jArr = ce7.a;
                    rb5Var = new rb5();
                    this.c = rb5Var;
                }
                Object objG = rb5Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    rb5Var.m(str, objG);
                }
                ((List) objG).add(bp2Var);
                return new sk6(rb5Var, str, bp2Var, 6);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // defpackage.fd7
    public final boolean b(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // defpackage.fd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd7.d():java.util.Map");
    }

    @Override // defpackage.fd7
    public final Object e(String str) {
        rb5 rb5Var = this.b;
        List list = rb5Var != null ? (List) rb5Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && rb5Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = rb5Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = rb5Var.c;
            Object obj = objArr[iF];
            rb5Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
