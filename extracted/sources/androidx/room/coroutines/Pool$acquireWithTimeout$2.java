package androidx.room.coroutines;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
final class Pool$acquireWithTimeout$2 extends SuspendLambda implements qp2 {
    public Ref$ObjectRef a;
    public int b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref$ObjectRef ref$ObjectRef, d dVar, g51 g51Var) {
        super(2, g51Var);
        this.c = ref$ObjectRef;
        this.d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new Pool$acquireWithTimeout$2(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((Pool$acquireWithTimeout$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = this.c;
            this.a = ref$ObjectRef2;
            this.b = 1;
            Object objA = this.d.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = this.a;
            kotlin.b.b(obj);
        }
        ref$ObjectRef.a = obj;
        return tx8.a;
    }
}
