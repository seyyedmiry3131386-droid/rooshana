package ir.mservices.market.social.profile.own;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$onFragmentResult$1", f = "OwnProfileHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class OwnProfileHeaderFragment$onFragmentResult$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ OwnProfileHeaderFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileHeaderFragment$onFragmentResult$1(OwnProfileHeaderFragment ownProfileHeaderFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = ownProfileHeaderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new OwnProfileHeaderFragment$onFragmentResult$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        OwnProfileHeaderFragment$onFragmentResult$1 ownProfileHeaderFragment$onFragmentResult$1 = (OwnProfileHeaderFragment$onFragmentResult$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        ownProfileHeaderFragment$onFragmentResult$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        int i = OwnProfileHeaderFragment.Z0;
        this.a.V0().r(new OwnProfileHeaderAction.RefreshAction(true));
        return tx8.a;
    }
}
