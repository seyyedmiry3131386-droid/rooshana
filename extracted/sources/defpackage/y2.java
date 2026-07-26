package defpackage;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y2 {
    public final Dao a;

    public y2(Dao dao) {
        this.a = dao;
    }

    public static Object a(bp2 bp2Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        try {
            om0Var.resumeWith(new w38(bp2Var.invoke()));
        } catch (Exception e) {
            if (e instanceof SQLException) {
                om0Var.resumeWith(new v38((SQLException) e));
            } else if (e instanceof android.database.SQLException) {
                om0Var.resumeWith(new v38(new SQLException("Android (runtime) SQLException")));
            } else {
                om0Var.resumeWith(new v38(new SQLException("Android Exception, detail= " + e)));
            }
        }
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public Object b(ContinuationImpl continuationImpl) {
        return a(new x2(0, this), continuationImpl);
    }
}
