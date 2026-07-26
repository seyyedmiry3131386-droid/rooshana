package androidx.media3.ui.compose.state;

import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.ui.compose.state.PresentationStateKt$rememberPresentationState$1$1", f = "PresentationState.kt", l = {53}, m = "invokeSuspend")
final class PresentationStateKt$rememberPresentationState$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ gb6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationStateKt$rememberPresentationState$1$1(c cVar, gb6 gb6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = cVar;
        this.c = gb6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PresentationStateKt$rememberPresentationState$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PresentationStateKt$rememberPresentationState$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (this.b.c(this.c, this) == coroutineSingletons) {
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
