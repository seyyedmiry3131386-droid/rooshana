package ir.mservices.market.social.profile.list;

import android.os.Bundle;
import defpackage.dp2;
import defpackage.em;
import defpackage.g51;
import defpackage.ih6;
import defpackage.jh6;
import defpackage.kh6;
import defpackage.kl6;
import defpackage.lh6;
import defpackage.mh6;
import defpackage.o4;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xz4;
import defpackage.yi5;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.list.ProfileListAction;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$3", f = "ProfileListFragment.kt", l = {290}, m = "invokeSuspend", v = 1)
final class ProfileListFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$3$1", f = "ProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ProfileListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProfileListFragment profileListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = profileListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((mh6) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yi5 movieAddProfileList;
            yi5 profileListTitle;
            mh6 mh6Var = (mh6) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            boolean z = mh6Var instanceof ih6;
            ProfileListFragment profileListFragment = this.b;
            if (z) {
                int i = ProfileListFragment.Z0;
                String strU0 = profileListFragment.U0();
                Bundle bundle = new Bundle();
                bundle.putSerializable("BUNDLE_KEY_POLICY", ((ih6) mh6Var).a);
                profileListTitle = new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(strU0, "DIALOG_KEY_TITLE_APP", bundle, 8), ""));
            } else if (mh6Var instanceof jh6) {
                int i2 = ProfileListFragment.Z0;
                String strU02 = profileListFragment.U0();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("BUNDLE_KEY_POLICY", ((jh6) mh6Var).a);
                profileListTitle = new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(strU02, "DIALOG_KEY_TITLE_MOVIE", bundle2, 8), ""));
            } else {
                if (mh6Var instanceof kh6) {
                    int i3 = ProfileListFragment.Z0;
                    profileListFragment.V0().r(ProfileListAction.ClearAll.INSTANCE);
                    kh6 kh6Var = (kh6) mh6Var;
                    ProfileApplicationListDto profileApplicationListDto = kh6Var.b;
                    movieAddProfileList = new NavIntentDirections.AppAddProfileList(new em(profileApplicationListDto.getTitle(), kh6Var.a, profileApplicationListDto, new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12)));
                } else {
                    if (!(mh6Var instanceof lh6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i4 = ProfileListFragment.Z0;
                    profileListFragment.V0().r(ProfileListAction.ClearAll.INSTANCE);
                    lh6 lh6Var = (lh6) mh6Var;
                    ProfileMovieListDto profileMovieListDto = lh6Var.b;
                    movieAddProfileList = new NavIntentDirections.MovieAddProfileList(new xz4(profileMovieListDto.getTitle(), lh6Var.a, profileMovieListDto, new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12)));
                }
                profileListTitle = movieAddProfileList;
            }
            pk5.g(profileListFragment.J0, profileListTitle, -1);
            profileListFragment.V0().r(new ProfileListAction.PoliciesMetAction(null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListFragment$onViewCreated$3(ProfileListFragment profileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileListFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileListFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = ProfileListFragment.Z0;
            ProfileListFragment profileListFragment = this.b;
            o4 o4Var = new o4(profileListFragment.V0().I, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
