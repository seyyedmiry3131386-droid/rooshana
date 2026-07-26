package ir.mservices.market.social.profile.list;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s45;
import defpackage.sr;
import defpackage.sz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.profile.list.ProfileListViewModel;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationsListDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMoviesListDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$doRequest$1", f = "ProfileListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ProfileListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ProfileListViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$doRequest$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((ProfileListViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListViewModel$doRequest$1(ProfileListViewModel profileListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = profileListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileListViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sz5 sz5VarX;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        final ProfileListViewModel profileListViewModel = this.a;
        final String str = profileListViewModel.V;
        js3.p(str, "accountKey");
        final int i = 0;
        if (profileListViewModel.B) {
            final sr srVar = profileListViewModel.w;
            srVar.getClass();
            sz5VarX = gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.social.profile.list.app.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.a(new AppProfileListRepositoryImpl$getAppLists$1$1(srVar, str, profileListViewModel, null), null);
                }
            }).a, new dp2() { // from class: nl6
                @Override // defpackage.dp2
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            return ProfileListViewModel.getData$lambda$0(profileListViewModel, (ProfileApplicationsListDto) obj2);
                        default:
                            return ProfileListViewModel.getData$lambda$1(profileListViewModel, (ProfileMoviesListDto) obj2);
                    }
                }
            });
        } else {
            final s45 s45Var = profileListViewModel.z;
            s45Var.getClass();
            final int i2 = 1;
            sz5VarX = gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.social.profile.list.movie.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.a(new MovieProfileListRepositoryImpl$getMovieLists$1$1(s45Var, str, profileListViewModel, null), null);
                }
            }).a, new dp2() { // from class: nl6
                @Override // defpackage.dp2
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            return ProfileListViewModel.getData$lambda$0(profileListViewModel, (ProfileApplicationsListDto) obj2);
                        default:
                            return ProfileListViewModel.getData$lambda$1(profileListViewModel, (ProfileMoviesListDto) obj2);
                    }
                }
            });
        }
        return new bz6(e.b(sz5VarX, y97.G(profileListViewModel)), null, new AnonymousClass1(2, profileListViewModel, ProfileListViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
