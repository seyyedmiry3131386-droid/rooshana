package ir.mservices.market.social.profile.user;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.a67;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hl5;
import defpackage.js3;
import defpackage.o19;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$doRequest$1", f = "UserProfileHeaderViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class UserProfileHeaderViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ UserProfileHeaderViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((UserProfileHeaderViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderViewModel$doRequest$1(UserProfileHeaderViewModel userProfileHeaderViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = userProfileHeaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UserProfileHeaderViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileHeaderViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final UserProfileHeaderViewModel userProfileHeaderViewModel = this.a;
        final hl5 hl5Var = userProfileHeaderViewModel.v;
        o19 o19Var = userProfileHeaderViewModel.x;
        final String str = o19Var.a;
        final String str2 = o19Var.c;
        hl5Var.getClass();
        js3.p(str, "accountKey");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.social.profile.user.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new UserProfileRepositoryImpl$getUserProfileInfo$1$1(null, hl5Var, userProfileHeaderViewModel, str, str2));
            }
        }).a, new a67(26, userProfileHeaderViewModel)), y97.G(userProfileHeaderViewModel)), null, new AnonymousClass2(2, userProfileHeaderViewModel, UserProfileHeaderViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
