package defpackage;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends x {
    public final /* synthetic */ Object n;
    public final /* synthetic */ y o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, gb8 gb8Var, h32 h32Var, Object obj, Object obj2) {
        super(yVar, gb8Var, h32Var, false, obj);
        this.o = yVar;
        this.n = obj2;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) throws SQLException {
        ((Dao) this.o.a).createOrUpdate(this.n);
        return Boolean.TRUE;
    }
}
