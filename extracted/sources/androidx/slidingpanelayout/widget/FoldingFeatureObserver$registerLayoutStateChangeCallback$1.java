package androidx.slidingpanelayout.widget;

import android.app.Activity;
import defpackage.dh2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.xp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ dh2 b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(dh2 dh2Var, Activity activity2, g51 g51Var) {
        super(2, g51Var);
        this.b = dh2Var;
        this.c = activity2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            dh2 dh2Var = this.b;
            xe2 xe2VarK = d.k(new xp(dh2Var.a.a(this.c), dh2Var, 10));
            r4 r4Var = new r4(29, dh2Var);
            this.a = 1;
            if (xe2VarK.a(r4Var, this) == coroutineSingletons) {
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
