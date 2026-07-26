package defpackage;

import com.j256.ormlite.dao.Dao;

/* JADX INFO: loaded from: classes3.dex */
public final class il3 extends x {
    public final /* synthetic */ jl3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(jl3 jl3Var, nc2 nc2Var, rl3 rl3Var, ul3 ul3Var) {
        super(jl3Var, nc2Var, rl3Var, true, ul3Var);
        this.n = jl3Var;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) {
        return ((Dao) this.n.a).queryBuilder().where().eq("read", Boolean.FALSE).query();
    }
}
