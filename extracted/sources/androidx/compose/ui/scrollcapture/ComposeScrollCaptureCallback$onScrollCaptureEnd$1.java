package androidx.compose.ui.scrollcapture;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {193}, m = "invokeSuspend", v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(a aVar, Runnable runnable, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        a aVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = aVar.f;
            this.a = 1;
            Object objA = bVar.a(0.0f - bVar.c, this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        ((s08) aVar.c.a).setValue(Boolean.FALSE);
        this.c.run();
        return tx8Var;
    }
}
