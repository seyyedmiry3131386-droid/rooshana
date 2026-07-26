package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s84 extends t84 {
    @Override // defpackage.t84
    public final void a(long j, Object obj) {
        z1 z1Var = (z1) ((rr3) uy8.c.l(j, obj));
        if (z1Var.a) {
            z1Var.a = false;
        }
    }

    @Override // defpackage.t84
    public final void b(long j, Object obj, Object obj2) {
        sy8 sy8Var = uy8.c;
        rr3 rr3VarG = (rr3) sy8Var.l(j, obj);
        rr3 rr3Var = (rr3) sy8Var.l(j, obj2);
        int size = rr3VarG.size();
        int size2 = rr3Var.size();
        if (size > 0 && size2 > 0) {
            if (!((z1) rr3VarG).a) {
                rr3VarG = rr3VarG.g(size2 + size);
            }
            rr3VarG.addAll(rr3Var);
        }
        if (size > 0) {
            rr3Var = rr3VarG;
        }
        uy8.p(j, obj, rr3Var);
    }

    @Override // defpackage.t84
    public final List c(long j, Object obj) {
        rr3 rr3Var = (rr3) uy8.c.l(j, obj);
        if (((z1) rr3Var).a) {
            return rr3Var;
        }
        int size = rr3Var.size();
        rr3 rr3VarG = rr3Var.g(size == 0 ? 10 : size * 2);
        uy8.p(j, obj, rr3VarG);
        return rr3VarG;
    }
}
