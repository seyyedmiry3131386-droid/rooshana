package coil3;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.li1;
import defpackage.pi3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w61;
import defpackage.we8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
final class RealImageLoader$execute$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ pi3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(a aVar, pi3 pi3Var, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = pi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.c, this.d, g51Var);
        realImageLoader$execute$2.b = obj;
        return realImageLoader$execute$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e71 e71Var = (e71) this.b;
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
        a aVar = this.c;
        w61 w61Var = (w61) aVar.a.c.getValue();
        pi3 pi3Var = this.d;
        li1 li1VarH = bt2.h(e71Var, w61Var, new RealImageLoader$execute$2$job$1(aVar, pi3Var, null), 2);
        we8 we8Var = pi3Var.c;
        this.b = null;
        this.a = 1;
        Object objS = li1VarH.s(this);
        return objS == coroutineSingletons ? coroutineSingletons : objS;
    }
}
