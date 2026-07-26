package coil3;

import defpackage.e71;
import defpackage.g51;
import defpackage.pi3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ pi3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(a aVar, pi3 pi3Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = pi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RealImageLoader$execute$2$job$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2$job$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        this.a = 1;
        int i2 = a.e;
        Object objA = this.b.a(this.c, 1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
