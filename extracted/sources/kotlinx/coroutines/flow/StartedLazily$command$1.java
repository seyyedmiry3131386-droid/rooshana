package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.ia8;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
final class StartedLazily$command$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ia8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(ia8 ia8Var, g51 g51Var) {
        super(2, g51Var);
        this.c = ia8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.c, g51Var);
        startedLazily$command$1.b = obj;
        return startedLazily$command$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((StartedLazily$command$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        f fVar = new f(new Ref$BooleanRef(), (ze2) this.b);
        this.a = 1;
        this.c.a(fVar, this);
        return coroutineSingletons;
    }
}
