package ir.mservices.market.social.users.following;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bp2;
import defpackage.c24;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountFollowingFragment extends Hilt_AccountFollowingFragment {
    public final o79 m1;
    public final UserProfileRefId n1;

    public AccountFollowingFragment() {
        final AccountFollowingFragment$special$$inlined$viewModels$default$1 accountFollowingFragment$special$$inlined$viewModels$default$1 = new AccountFollowingFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.users.following.AccountFollowingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) accountFollowingFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.m1 = new o79(g27.a(AccountFollowingViewModel.class), new bp2() { // from class: ir.mservices.market.social.users.following.AccountFollowingFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.users.following.AccountFollowingFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.social.users.following.AccountFollowingFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        this.n1 = UserProfileRefId.f;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_following);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersFragment
    public final BaseAccountUsersViewModel Q1() {
        return (AccountFollowingViewModel) this.m1.getValue();
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersFragment
    public final int S1() {
        return rs6.no_item_in_own_user_following_list;
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersFragment
    public final UserProfileRefId T1() {
        return this.n1;
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersFragment
    public final String U1() {
        String strL = L(rs6.profile_header_following);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AccountFollowingFragment$onViewCreated$1(this, null));
    }
}
