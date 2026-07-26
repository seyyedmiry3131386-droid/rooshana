package coil3.compose;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.compose.RealDrawScopeSizeResolver$size$2", f = "DrawScopeSizeResolver.kt", l = {58}, m = "invokeSuspend")
final class RealDrawScopeSizeResolver$size$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ xe2 c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        RealDrawScopeSizeResolver$size$2 realDrawScopeSizeResolver$size$2 = new RealDrawScopeSizeResolver$size$2(3, (g51) obj3);
        realDrawScopeSizeResolver$size$2.b = (ze2) obj;
        realDrawScopeSizeResolver$size$2.c = (xe2) obj2;
        return realDrawScopeSizeResolver$size$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = this.b;
        xe2 xe2Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (d.m(ze2Var, xe2Var, this) == coroutineSingletons) {
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
