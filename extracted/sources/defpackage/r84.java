package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r84 extends t84 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List list = (List) uy8.c.l(j, obj);
        if (list.isEmpty()) {
            List h44Var = list instanceof i44 ? new h44(i) : ((list instanceof zj6) && (list instanceof rr3)) ? ((rr3) list).g(i) : new ArrayList(i);
            uy8.p(j, obj, h44Var);
            return h44Var;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            uy8.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof cy8) {
            h44 h44Var2 = new h44(list.size() + i);
            h44Var2.addAll((cy8) list);
            uy8.p(j, obj, h44Var2);
            return h44Var2;
        }
        if ((list instanceof zj6) && (list instanceof rr3)) {
            rr3 rr3Var = (rr3) list;
            if (!((z1) rr3Var).a) {
                rr3 rr3VarG = rr3Var.g(list.size() + i);
                uy8.p(j, obj, rr3VarG);
                return rr3VarG;
            }
        }
        return list;
    }

    @Override // defpackage.t84
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) uy8.c.l(j, obj);
        if (list instanceof i44) {
            objUnmodifiableList = ((i44) list).R0();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zj6) && (list instanceof rr3)) {
                z1 z1Var = (z1) ((rr3) list);
                boolean z = z1Var.a;
                if (z && z) {
                    z1Var.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        uy8.p(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.t84
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) uy8.c.l(j, obj2);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        uy8.p(j, obj, list);
    }

    @Override // defpackage.t84
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
