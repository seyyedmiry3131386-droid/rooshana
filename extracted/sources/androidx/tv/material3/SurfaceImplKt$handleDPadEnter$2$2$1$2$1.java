package androidx.tv.material3;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rj6;
import defpackage.sj6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.tv.material3.SurfaceImplKt$handleDPadEnter$2$2$1$2$1", f = "SurfaceImpl.kt", l = {173}, m = "invokeSuspend")
final class SurfaceImplKt$handleDPadEnter$2$2$1$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ab5 b;
    public final /* synthetic */ rj6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceImplKt$handleDPadEnter$2$2$1$2$1(g51 g51Var, ab5 ab5Var, rj6 rj6Var) {
        super(2, g51Var);
        this.b = ab5Var;
        this.c = rj6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SurfaceImplKt$handleDPadEnter$2$2$1$2$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SurfaceImplKt$handleDPadEnter$2$2$1$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sj6 sj6Var = new sj6(this.c);
            this.a = 1;
            if (this.b.a(sj6Var, this) == coroutineSingletons) {
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
