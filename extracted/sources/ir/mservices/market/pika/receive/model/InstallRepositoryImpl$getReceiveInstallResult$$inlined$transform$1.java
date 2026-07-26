package ir.mservices.market.pika.receive.model;

import defpackage.g51;
import defpackage.jp3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.model.InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1", f = "InstallRepositoryImpl.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1(xe2 xe2Var, g51 g51Var, long j) {
        super(2, g51Var);
        this.c = xe2Var;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1 installRepositoryImpl$getReceiveInstallResult$$inlined$transform$1 = new InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1(this.c, g51Var, this.d);
        installRepositoryImpl$getReceiveInstallResult$$inlined$transform$1.b = obj;
        return installRepositoryImpl$getReceiveInstallResult$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            jp3 jp3Var = new jp3((ze2) this.b, this.d);
            this.b = null;
            this.a = 1;
            if (this.c.a(jp3Var, this) == coroutineSingletons) {
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
