package ir.mservices.market.version2.fragments;

import defpackage.e71;
import defpackage.g51;
import defpackage.ij5;
import defpackage.js3;
import defpackage.ni5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wi5;
import defpackage.yi5;
import ir.mservices.market.data.NavIntentDirections;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.FragmentNavigationWrapper$pushFragment$1$1", f = "FragmentNavigationWrapper.kt", l = {61}, m = "invokeSuspend", v = 1)
final class FragmentNavigationWrapper$pushFragment$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ij5 c;
    public final /* synthetic */ yi5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigationWrapper$pushFragment$1$1(a aVar, ij5 ij5Var, yi5 yi5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = ij5Var;
        this.d = yi5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FragmentNavigationWrapper$pushFragment$1$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FragmentNavigationWrapper$pushFragment$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        a aVar = this.b;
        if (i == 0) {
            b.b(obj);
            if (aVar.c) {
                NavIntentDirections.NavDialogDirections navDialogDirections = (NavIntentDirections.NavDialogDirections) this.d;
                ij5 ij5Var = this.c;
                js3.p(ij5Var, "<this>");
                js3.p(navDialogDirections, "direction");
                ni5 ni5Var = ij5Var.b;
                wi5 wi5VarF = ni5Var.f();
                if (wi5VarF != null) {
                    if (wi5VarF.d(navDialogDirections.getActionId()) == null || ni5Var.g().l(navDialogDirections.getDestinationId()) == null) {
                        wi5VarF = null;
                    }
                    if (wi5VarF != null) {
                        ij5Var.c(navDialogDirections.getActionId(), navDialogDirections.getArguments(), null);
                    }
                }
                aVar.c = false;
                this.a = 1;
                if (kotlinx.coroutines.a.e(200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tx8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        aVar.c = true;
        return tx8.a;
    }
}
