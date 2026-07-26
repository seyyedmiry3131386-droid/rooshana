package ir.mservices.market.social.users.following;

import defpackage.g51;
import defpackage.n4;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.following.AccountFollowingViewModel$1$invokeSuspend$$inlined$collectAction$1$2", f = "AccountFollowingViewModel.kt", l = {50}, m = "emit", v = 1)
public final class AccountFollowingViewModel$1$invokeSuspend$$inlined$collectAction$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ n4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFollowingViewModel$1$invokeSuspend$$inlined$collectAction$1$2$1(n4 n4Var, g51 g51Var) {
        super(g51Var);
        this.c = n4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
