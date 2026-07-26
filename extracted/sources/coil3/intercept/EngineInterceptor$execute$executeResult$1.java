package coil3.intercept;

import defpackage.e71;
import defpackage.g51;
import defpackage.hy2;
import defpackage.oy0;
import defpackage.pi3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uv5;
import defpackage.v18;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ pi3 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ hy2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(a aVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, pi3 pi3Var, Object obj, Ref$ObjectRef ref$ObjectRef3, hy2 hy2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = ref$ObjectRef;
        this.d = ref$ObjectRef2;
        this.e = pi3Var;
        this.f = obj;
        this.g = ref$ObjectRef3;
        this.h = hy2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new EngineInterceptor$execute$executeResult$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$execute$executeResult$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        v18 v18Var = (v18) this.c.a;
        oy0 oy0Var = (oy0) this.d.a;
        uv5 uv5Var = (uv5) this.g.a;
        this.a = 1;
        Object objB = a.b(this.b, v18Var, oy0Var, this.e, this.f, uv5Var, this.h, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
