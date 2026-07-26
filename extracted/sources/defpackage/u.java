package defpackage;

import com.j256.ormlite.dao.Dao;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends x {
    public final /* synthetic */ Object n;
    public final /* synthetic */ y o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, r79 r79Var, ol3 ol3Var, Object obj, String str) {
        super(yVar, r79Var, ol3Var, true, obj);
        this.o = yVar;
        this.n = str;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) {
        return ((Dao) this.o.a).queryForId(this.n);
    }
}
