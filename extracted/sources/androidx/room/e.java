package androidx.room;

import defpackage.bt2;
import defpackage.cq8;
import defpackage.dp2;
import defpackage.g51;
import defpackage.i51;
import defpackage.js3;
import defpackage.ok4;
import defpackage.om0;
import defpackage.sm0;
import defpackage.ym;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Object a(g51 g51Var, dp2 dp2Var, d dVar) {
        ym ymVar;
        if (dVar.g() && dVar.i() && dVar.h()) {
            return dp2Var.invoke(g51Var);
        }
        if (g51Var.getContext().r0(sm0.c) == null) {
            return dp2Var.invoke(g51Var);
        }
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(null, dp2Var);
        cq8 cq8Var = (cq8) g51Var.getContext().r0(cq8.b);
        i51 i51Var = cq8Var != null ? cq8Var.a : null;
        if (i51Var != null) {
            return bt2.Z(i51Var, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, g51Var);
        }
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        try {
            ymVar = dVar.d;
        } catch (RejectedExecutionException e) {
            om0Var.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (ymVar == null) {
            js3.V("internalTransactionExecutor");
            throw null;
        }
        ymVar.execute(new f(om0Var, dVar, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }
}
