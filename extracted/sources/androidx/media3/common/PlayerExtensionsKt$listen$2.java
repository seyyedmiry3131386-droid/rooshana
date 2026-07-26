package androidx.media3.common;

import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.common.PlayerExtensionsKt$listen$2", f = "PlayerExtensions.kt", l = {50}, m = "invokeSuspend")
final class PlayerExtensionsKt$listen$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ gb6 b;
    public final /* synthetic */ qp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerExtensionsKt$listen$2(gb6 gb6Var, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = gb6Var;
        this.c = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerExtensionsKt$listen$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((PlayerExtensionsKt$listen$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        this.a = 1;
        c.b(this.b, this.c, this);
        return coroutineSingletons;
    }
}
