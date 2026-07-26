package ir.mservices.market.social.search;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.lc8;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.t15;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.search.UserSearchResultViewModel$doRequest$1", f = "UserSearchResultViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class UserSearchResultViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ UserSearchResultViewModel a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchResultViewModel$doRequest$1(UserSearchResultViewModel userSearchResultViewModel, String str, String str2, g51 g51Var) {
        super(2, g51Var);
        this.a = userSearchResultViewModel;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UserSearchResultViewModel$doRequest$1(this.a, this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserSearchResultViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final UserSearchResultViewModel userSearchResultViewModel = this.a;
        final t15 t15Var = userSearchResultViewModel.u;
        t15Var.getClass();
        rz5 rz5VarO = gu9.o(false);
        final String str = this.b;
        return new bz6(e.b(gu9.x((xe2) new m(rz5VarO, new bp2() { // from class: ir.mservices.market.social.search.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new UserSearchResultRepositoryImpl$getSearchUsers$1$1(t15Var, str, userSearchResultViewModel, null), null);
            }
        }).a, new lc8(16)), y97.G(userSearchResultViewModel)), null, null, null, 14);
    }
}
