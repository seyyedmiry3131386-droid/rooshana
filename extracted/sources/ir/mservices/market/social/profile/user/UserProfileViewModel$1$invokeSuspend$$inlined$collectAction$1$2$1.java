package ir.mservices.market.social.profile.user;

import defpackage.g51;
import defpackage.tb1;
import defpackage.vc8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileViewModel$1$invokeSuspend$$inlined$collectAction$1$2", f = "UserProfileViewModel.kt", l = {50}, m = "emit", v = 1)
public final class UserProfileViewModel$1$invokeSuspend$$inlined$collectAction$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vc8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$1$invokeSuspend$$inlined$collectAction$1$2$1(vc8 vc8Var, g51 g51Var) {
        super(g51Var);
        this.c = vc8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
