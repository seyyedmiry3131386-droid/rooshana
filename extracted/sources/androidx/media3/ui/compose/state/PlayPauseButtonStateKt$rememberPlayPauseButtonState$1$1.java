package androidx.media3.ui.compose.state;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.ui.compose.state.PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1", f = "PlayPauseButtonState.kt", l = {41}, m = "invokeSuspend")
final class PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        this.b.a(this);
        return coroutineSingletons;
    }
}
