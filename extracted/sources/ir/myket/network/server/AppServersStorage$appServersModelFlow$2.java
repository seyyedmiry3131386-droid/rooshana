package ir.myket.network.server;

import defpackage.g51;
import defpackage.lw;
import defpackage.ps;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.AppServersStorage$appServersModelFlow$2", f = "AppServersStorage.kt", l = {33}, m = "invokeSuspend", v = 1)
final class AppServersStorage$appServersModelFlow$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppServersStorage$appServersModelFlow$2(a aVar, g51 g51Var) {
        super(3, g51Var);
        this.d = aVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        AppServersStorage$appServersModelFlow$2 appServersStorage$appServersModelFlow$2 = new AppServersStorage$appServersModelFlow$2(this.d, (g51) obj3);
        appServersStorage$appServersModelFlow$2.b = (ze2) obj;
        appServersStorage$appServersModelFlow$2.c = (Throwable) obj2;
        return appServersStorage$appServersModelFlow$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = this.b;
        Throwable th = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            lw.g(th, null, null);
            ps psVar = this.d.c;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (ze2Var.emit(psVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
