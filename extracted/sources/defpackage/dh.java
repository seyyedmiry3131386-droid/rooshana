package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dh extends b26 {
    public final ta5 c;

    public dh(bp2 bp2Var, ta5 ta5Var) {
        b26 b26Var;
        List list;
        super(2, (bp2Var == null || (b26Var = (b26) bp2Var.invoke()) == null || (list = b26Var.a) == null) ? new ArrayList() : a.Q0(list));
        this.c = ta5Var;
    }

    @Override // defpackage.b26
    public final Object a(int i, ps0 ps0Var) {
        return ps0Var.equals(g27.a(jd7.class)) ? rq4.t(this.c) : super.a(i, ps0Var);
    }

    @Override // defpackage.b26
    public final Object b(ps0 ps0Var) {
        return ps0Var.equals(g27.a(jd7.class)) ? rq4.t(this.c) : super.b(ps0Var);
    }
}
