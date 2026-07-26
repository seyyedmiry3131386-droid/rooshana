package ir.mservices.market.social.users.common;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.common.BaseAccountUsersViewModel$doRequest$1", f = "BaseAccountUsersViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseAccountUsersViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ BaseAccountUsersViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAccountUsersViewModel$doRequest$1(BaseAccountUsersViewModel baseAccountUsersViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = baseAccountUsersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseAccountUsersViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAccountUsersViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        BaseAccountUsersViewModel baseAccountUsersViewModel = this.a;
        return new bz6(e.b(baseAccountUsersViewModel.s(), y97.G(baseAccountUsersViewModel)), null, null, null, 14);
    }
}
