package ir.mservices.market.version2.manager.install;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.InstallQueue$setAppInQueue$1", f = "InstallQueue.kt", l = {60}, m = "invokeSuspend", v = 1)
final class InstallQueue$setAppInQueue$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallQueue$setAppInQueue$1(a aVar, String str, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InstallQueue$setAppInQueue$1 installQueue$setAppInQueue$1 = new InstallQueue$setAppInQueue$1(this.c, this.d, g51Var);
        installQueue$setAppInQueue$1.b = obj;
        return installQueue$setAppInQueue$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallQueue$setAppInQueue$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var = (e71) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.c.a;
            this.b = e71Var;
            this.a = 1;
            if (iVar.emit(this.d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        js3.j(e71Var, null);
        return tx8.a;
    }
}
