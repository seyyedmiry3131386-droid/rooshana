package androidx.compose.ui.platform;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {138}, m = "invokeSuspend", v = 1)
final class WrappedComposition$setContent$1$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$1$1$1(t tVar, g51 g51Var) {
        super(2, g51Var);
        this.b = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new WrappedComposition$setContent$1$1$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WrappedComposition$setContent$1$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        AndroidComposeView androidComposeView = this.b.a;
        this.a = 1;
        Object objL = androidComposeView.y.l(this);
        if (objL != coroutineSingletons) {
            objL = tx8Var;
        }
        return objL == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
