package defpackage;

import com.j256.ormlite.dao.Dao;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends x {
    public final /* synthetic */ y n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, gb8 gb8Var, h32 h32Var, Object obj) {
        super(yVar, gb8Var, h32Var, false, obj);
        this.n = yVar;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) {
        return Integer.valueOf(((Dao) this.n.a).deleteBuilder().delete());
    }
}
