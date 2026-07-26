package ir.myket.player.ui.audio;

import defpackage.e71;
import defpackage.g51;
import defpackage.n08;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.audio.AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1", f = "AutoRetryAsyncImage.kt", l = {}, m = "invokeSuspend", v = 1)
final class AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ wb5 a;
    public final /* synthetic */ n08 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1(wb5 wb5Var, n08 n08Var, g51 g51Var) {
        super(2, g51Var);
        this.a = wb5Var;
        this.b = n08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1 autoRetryAsyncImageKt$AutoRetryAsyncImage$1$1 = (AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        autoRetryAsyncImageKt$AutoRetryAsyncImage$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (((Boolean) this.a.getValue()).booleanValue()) {
            n08 n08Var = this.b;
            n08Var.i(n08Var.h() + 1);
        }
        return tx8.a;
    }
}
