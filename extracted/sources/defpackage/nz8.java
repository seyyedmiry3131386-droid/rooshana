package defpackage;

import com.j256.ormlite.dao.Dao;
import ir.mservices.market.app.update.common.manager.b;
import java.sql.SQLException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nz8 extends x {
    public final /* synthetic */ oz8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz8(oz8 oz8Var, ak3 ak3Var, ak3 ak3Var2, b bVar) {
        super(oz8Var, ak3Var, ak3Var2, true, bVar);
        this.n = oz8Var;
    }

    @Override // defpackage.x
    public final Object f(Object[] objArr) throws SQLException {
        js3.p((Void[]) objArr, "params");
        List listQueryForAll = ((Dao) this.n.a).queryForAll();
        js3.o(listQueryForAll, "queryForAll(...)");
        return listQueryForAll;
    }
}
