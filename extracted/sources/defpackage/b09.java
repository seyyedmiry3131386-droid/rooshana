package defpackage;

import androidx.datastore.core.d;

/* JADX INFO: loaded from: classes.dex */
public final class b09 implements u61 {
    public final b09 a;
    public final d b;

    public b09(b09 b09Var, d dVar) {
        this.a = b09Var;
        this.b = dVar;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final /* bridge */ w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    public final void a(d dVar) {
        if (this.b == dVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        b09 b09Var = this.a;
        if (b09Var != null) {
            b09Var.a(dVar);
        }
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return fz1.t;
    }

    @Override // defpackage.w61
    public final /* bridge */ w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final /* bridge */ u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
