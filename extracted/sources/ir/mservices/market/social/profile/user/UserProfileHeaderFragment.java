package ir.mservices.market.social.profile.user;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.mm2;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.x79;
import defpackage.yu7;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;
import ir.mservices.market.social.profile.user.UserProfileHeaderFragment;
import ir.mservices.market.social.profile.user.recycler.UserProfileActionData;
import ir.mservices.market.social.profile.user.recycler.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileHeaderFragment extends Hilt_UserProfileHeaderFragment implements mm2 {
    public static final /* synthetic */ int Z0 = 0;
    public final o79 Y0;

    public UserProfileHeaderFragment() {
        final yu7 yu7Var = new yu7(9, this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) yu7Var.invoke();
            }
        });
        this.Y0 = new o79(g27.a(UserProfileHeaderViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$special$$inlined$viewModels$default$3
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
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(U0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_REFRESH".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                ir.mservices.market.version2.core.utils.a.c(this, 0L, new UserProfileHeaderFragment$onFragmentResult$1(this, null));
                return;
            }
            if (!"DIALOG_KEY_NICKNAME".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_UNFOLLOW".equalsIgnoreCase(str2)) {
                    if (dialogDataModel.d == DialogResult.a) {
                        V0().r(UserProfileHeaderAction.UnfollowAction.INSTANCE);
                        return;
                    } else {
                        V0().r(UserProfileHeaderAction.ResetRelation.INSTANCE);
                        return;
                    }
                }
                return;
            }
            DialogResult dialogResult = dialogDataModel.d;
            if (dialogResult == DialogResult.a) {
                V0().r(UserProfileHeaderAction.FollowAction.INSTANCE);
            } else if (dialogResult == DialogResult.b) {
                V0().r(UserProfileHeaderAction.ResetRelation.INSTANCE);
            }
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        lm lmVar = new lm(I0(), 10);
        final int i = 0;
        lmVar.n = new og5(this) { // from class: q19
            public final /* synthetic */ UserProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                UserProfileHeaderFragment userProfileHeaderFragment = this.b;
                a aVar = (a) qg5Var;
                switch (i2) {
                    case 0:
                        UserProfileActionData userProfileActionData = (UserProfileActionData) obj;
                        int i3 = UserProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(userProfileActionData, "data");
                        Context contextH = userProfileHeaderFragment.H();
                        String intent = userProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    default:
                        e37 e37Var = (e37) obj;
                        int i4 = UserProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(e37Var, "state");
                        if (e37Var.equals(b37.a)) {
                            DialogDataModel dialogDataModel = new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            PhoneBindData phoneBindData = new PhoneBindData("");
                            String string = userProfileHeaderFragment.K().getString(rs6.bind_message_follow);
                            String string2 = userProfileHeaderFragment.K().getString(rs6.login_label_user_profile_follow);
                            js3.o(string2, "getString(...)");
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, string, string2, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                            return;
                        }
                        if (e37Var.equals(c37.a)) {
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_NICKNAME", null, 12), userProfileHeaderFragment.L(rs6.nickname_description_follow))), -1);
                            return;
                        }
                        if (e37Var instanceof a37) {
                            userProfileHeaderFragment.V0().r(UserProfileHeaderAction.FollowAction.INSTANCE);
                            return;
                        } else {
                            if (!(e37Var instanceof d37)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String strL = userProfileHeaderFragment.L(rs6.are_you_sure_to_remove_follower);
                            js3.o(strL, "getString(...)");
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_UNFOLLOW", null, 12), null, strL, userProfileHeaderFragment.L(rs6.remove), userProfileHeaderFragment.L(rs6.dismiss), true)), -1);
                            return;
                        }
                }
            }
        };
        final int i2 = 1;
        lmVar.m = new og5(this) { // from class: q19
            public final /* synthetic */ UserProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                UserProfileHeaderFragment userProfileHeaderFragment = this.b;
                a aVar = (a) qg5Var;
                switch (i22) {
                    case 0:
                        UserProfileActionData userProfileActionData = (UserProfileActionData) obj;
                        int i3 = UserProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(userProfileActionData, "data");
                        Context contextH = userProfileHeaderFragment.H();
                        String intent = userProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    default:
                        e37 e37Var = (e37) obj;
                        int i4 = UserProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(e37Var, "state");
                        if (e37Var.equals(b37.a)) {
                            DialogDataModel dialogDataModel = new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            PhoneBindData phoneBindData = new PhoneBindData("");
                            String string = userProfileHeaderFragment.K().getString(rs6.bind_message_follow);
                            String string2 = userProfileHeaderFragment.K().getString(rs6.login_label_user_profile_follow);
                            js3.o(string2, "getString(...)");
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, string, string2, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                            return;
                        }
                        if (e37Var.equals(c37.a)) {
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_NICKNAME", null, 12), userProfileHeaderFragment.L(rs6.nickname_description_follow))), -1);
                            return;
                        }
                        if (e37Var instanceof a37) {
                            userProfileHeaderFragment.V0().r(UserProfileHeaderAction.FollowAction.INSTANCE);
                            return;
                        } else {
                            if (!(e37Var instanceof d37)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String strL = userProfileHeaderFragment.L(rs6.are_you_sure_to_remove_follower);
                            js3.o(strL, "getString(...)");
                            pk5.g(userProfileHeaderFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(userProfileHeaderFragment.U0(), "DIALOG_KEY_UNFOLLOW", null, 12), null, strL, userProfileHeaderFragment.L(rs6.remove), userProfileHeaderFragment.L(rs6.dismiss), true)), -1);
                            return;
                        }
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return V0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.space_2xl), 0, dimensionPixelSize, dimensionPixelSize, 0, 0, I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.social_own_profile_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        return "";
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean P0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean S0() {
        return false;
    }

    public final String U0() {
        return dw1.n("UserProfileHeaderFragment_", this.H0);
    }

    public final UserProfileHeaderViewModel V0() {
        return (UserProfileHeaderViewModel) this.Y0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.J0.x(U0());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(U0(), this);
        J0().setNestedScrollingEnabled(false);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileHeaderFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileHeaderFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new UserProfileHeaderFragment$onViewCreated$3(this, null));
    }
}
