package ir.myket.network.server;

import defpackage.g51;
import defpackage.ps;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tv3;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.AppServersStorage$appServersModelFlow$1", f = "AppServersStorage.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppServersStorage$appServersModelFlow$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppServersStorage$appServersModelFlow$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AppServersStorage$appServersModelFlow$1 appServersStorage$appServersModelFlow$1 = new AppServersStorage$appServersModelFlow$1(this.b, g51Var);
        appServersStorage$appServersModelFlow$1.a = obj;
        return appServersStorage$appServersModelFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppServersStorage$appServersModelFlow$1) create((String) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        a aVar = this.b;
        if (str != null) {
            tv3 tv3Var = aVar.b;
            tv3Var.getClass();
            ps psVar = (ps) tv3Var.a(ps.Companion.serializer(), str);
            if (psVar != null) {
                return psVar;
            }
        }
        return aVar.c;
    }
}
