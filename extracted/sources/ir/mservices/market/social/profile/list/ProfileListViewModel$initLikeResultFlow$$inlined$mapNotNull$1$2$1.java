package ir.mservices.market.social.profile.list;

import defpackage.g51;
import defpackage.tb1;
import defpackage.w05;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$initLikeResultFlow$$inlined$mapNotNull$1$2", f = "ProfileListViewModel.kt", l = {52}, m = "emit", v = 1)
public final class ProfileListViewModel$initLikeResultFlow$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ w05 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListViewModel$initLikeResultFlow$$inlined$mapNotNull$1$2$1(w05 w05Var, g51 g51Var) {
        super(g51Var);
        this.c = w05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
