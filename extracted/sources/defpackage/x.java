package defpackage;

import ir.myket.core.loggers.SuppressedException;
import java.sql.SQLException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends mx {
    public final gb8 i;
    public final h32 j;
    public final SuppressedException k;
    public final Object l;
    public final /* synthetic */ y m;

    public x(y yVar, gb8 gb8Var, h32 h32Var, boolean z, Object obj) {
        this.m = yVar;
        this.i = gb8Var;
        this.j = h32Var;
        if (z) {
            this.k = new SuppressedException("Exception in a READ-ONLY database query");
        } else {
            this.k = new SuppressedException("Exception in a database query");
        }
        this.l = obj;
    }

    @Override // defpackage.mx
    public final Object a(Object[] objArr) {
        SQLException sQLException;
        try {
            return new lb1(f(objArr), null);
        } catch (android.database.SQLException | SQLException e) {
            SuppressedException suppressedException = this.k;
            suppressedException.initCause(e);
            if (this.j == null) {
                lw.g(suppressedException, null, null);
            }
            if (e instanceof android.database.SQLException) {
                sQLException = new SQLException("Android (runtime) SQLException");
                sQLException.initCause(e);
            } else {
                sQLException = (SQLException) e;
            }
            return new lb1(null, sQLException);
        }
    }

    @Override // defpackage.mx
    public final void c() {
        ((ArrayList) this.m.b).remove(this);
    }

    @Override // defpackage.mx
    public final void d(Object obj) {
        lb1 lb1Var = (lb1) obj;
        ((ArrayList) this.m.b).remove(this);
        SQLException sQLException = lb1Var.b;
        if (sQLException == null) {
            gb8 gb8Var = this.i;
            if (gb8Var != null) {
                gb8Var.onSuccess(lb1Var.a);
                return;
            }
            return;
        }
        h32 h32Var = this.j;
        if (h32Var != null) {
            h32Var.j(sQLException);
        }
    }

    public abstract Object f(Object... objArr);
}
