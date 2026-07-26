package defpackage;

import com.j256.ormlite.dao.Dao;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends x {
    public final /* synthetic */ y n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, gb8 gb8Var, h32 h32Var, Object obj) {
        super(yVar, gb8Var, h32Var, true, obj);
        this.n = yVar;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) {
        return ((Dao) this.n.a).queryForAll();
    }
}
