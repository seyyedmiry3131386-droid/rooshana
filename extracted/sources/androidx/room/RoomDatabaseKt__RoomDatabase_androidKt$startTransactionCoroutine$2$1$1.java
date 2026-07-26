package androidx.room;

import defpackage.bt2;
import defpackage.cq8;
import defpackage.e71;
import defpackage.eq;
import defpackage.g51;
import defpackage.i51;
import defpackage.js3;
import defpackage.om0;
import defpackage.qp2;
import defpackage.s;
import defpackage.sk8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u61;
import defpackage.w61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
final class RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public final /* synthetic */ om0 d;
    public final /* synthetic */ qp2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(d dVar, om0 om0Var, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = dVar;
        this.d = om0Var;
        this.e = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1 = new RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(this.c, this.d, this.e, g51Var);
        roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1.b = obj;
        return roomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        g51 g51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            u61 u61VarR0 = ((e71) this.b).getCoroutineContext().r0(eq.u);
            js3.m(u61VarR0);
            i51 i51Var = (i51) u61VarR0;
            w61 w61VarL = bt2.L((s) i51Var, new cq8(i51Var));
            w61 w61VarL0 = w61VarL.l0(new sk8(w61VarL, this.c.h));
            om0 om0Var = this.d;
            this.b = om0Var;
            this.a = 1;
            obj = bt2.Z(w61VarL0, this.e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            g51Var = om0Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g51Var = (g51) this.b;
            kotlin.b.b(obj);
        }
        g51Var.resumeWith(obj);
        return tx8.a;
    }
}
