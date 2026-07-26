package ir.mservices.market.version2.core.utils;

import androidx.fragment.app.FragmentActivity;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.FragmentExtensionKt$launchOnActivityLifecycle$1", f = "FragmentExtension.kt", l = {47}, m = "invokeSuspend", v = 1)
final class FragmentExtensionKt$launchOnActivityLifecycle$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.fragment.app.d b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentExtensionKt$launchOnActivityLifecycle$1(androidx.fragment.app.d dVar, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
        this.c = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FragmentExtensionKt$launchOnActivityLifecycle$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FragmentExtensionKt$launchOnActivityLifecycle$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            FragmentActivity fragmentActivityF = this.b.F();
            if (fragmentActivityF != null) {
                this.a = 1;
                if (this.c.invoke(fragmentActivityF, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
