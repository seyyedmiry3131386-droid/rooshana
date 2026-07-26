package ir.mservices.market.social.profile.own;

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
import defpackage.hk3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o79;
import defpackage.og5;
import defpackage.ox5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.x79;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;
import ir.mservices.market.social.profile.own.OwnProfileHeaderFragment;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileActionData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import ir.mservices.market.social.profile.own.recycler.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnProfileHeaderFragment extends Hilt_OwnProfileHeaderFragment implements mm2 {
    public static final /* synthetic */ int Z0 = 0;
    public final o79 Y0;

    public OwnProfileHeaderFragment() {
        final hk3 hk3Var = new hk3(26, this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) hk3Var.invoke();
            }
        });
        this.Y0 = new o79(g27.a(OwnProfileHeaderViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$special$$inlined$viewModels$default$3
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
            if ("DIALOG_KEY_REFRESH".equals(str2) && dialogDataModel.d == DialogResult.a) {
                ir.mservices.market.version2.core.utils.a.c(this, 0L, new OwnProfileHeaderFragment$onFragmentResult$1(this, null));
            } else if ("DIALOG_KEY_FORCE_UPDATE".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.b) {
                this.J0.q();
            }
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        final int i = 0;
        ox5 ox5Var = new ox5(I0(), i);
        ox5Var.m = new og5(this) { // from class: vx5
            public final /* synthetic */ OwnProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                OwnProfileHeaderFragment ownProfileHeaderFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((OwnProfileActionData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.MyAccount(new uc5(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                    case 1:
                        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) obj;
                        int i4 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(ownProfileActionData, "data");
                        ownProfileHeaderFragment.V0().r(new OwnProfileHeaderAction.UnreadMessageAction(false));
                        Context contextH = ownProfileHeaderFragment.H();
                        String intent = ownProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 2:
                        OwnProfileTipData ownProfileTipData = (OwnProfileTipData) obj;
                        int i5 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((zx5) qg5Var, "<unused var>");
                        js3.p(ownProfileTipData, "data");
                        Context contextH2 = ownProfileHeaderFragment.H();
                        String action = ownProfileTipData.a.getAction();
                        if (action != null) {
                            t61.v(action, "parse(...)", contextH2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        int i6 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((eh2) qg5Var, "<unused var>");
                        js3.p((FollowRequestData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.RequestList(new o57(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                }
            }
        };
        final int i2 = 1;
        ox5Var.n = new og5(this) { // from class: vx5
            public final /* synthetic */ OwnProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                OwnProfileHeaderFragment ownProfileHeaderFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((OwnProfileActionData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.MyAccount(new uc5(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                    case 1:
                        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) obj;
                        int i4 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(ownProfileActionData, "data");
                        ownProfileHeaderFragment.V0().r(new OwnProfileHeaderAction.UnreadMessageAction(false));
                        Context contextH = ownProfileHeaderFragment.H();
                        String intent = ownProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 2:
                        OwnProfileTipData ownProfileTipData = (OwnProfileTipData) obj;
                        int i5 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((zx5) qg5Var, "<unused var>");
                        js3.p(ownProfileTipData, "data");
                        Context contextH2 = ownProfileHeaderFragment.H();
                        String action = ownProfileTipData.a.getAction();
                        if (action != null) {
                            t61.v(action, "parse(...)", contextH2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        int i6 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((eh2) qg5Var, "<unused var>");
                        js3.p((FollowRequestData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.RequestList(new o57(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                }
            }
        };
        final int i3 = 2;
        ox5Var.p = new og5(this) { // from class: vx5
            public final /* synthetic */ OwnProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                OwnProfileHeaderFragment ownProfileHeaderFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((OwnProfileActionData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.MyAccount(new uc5(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                    case 1:
                        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) obj;
                        int i4 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(ownProfileActionData, "data");
                        ownProfileHeaderFragment.V0().r(new OwnProfileHeaderAction.UnreadMessageAction(false));
                        Context contextH = ownProfileHeaderFragment.H();
                        String intent = ownProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 2:
                        OwnProfileTipData ownProfileTipData = (OwnProfileTipData) obj;
                        int i5 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((zx5) qg5Var, "<unused var>");
                        js3.p(ownProfileTipData, "data");
                        Context contextH2 = ownProfileHeaderFragment.H();
                        String action = ownProfileTipData.a.getAction();
                        if (action != null) {
                            t61.v(action, "parse(...)", contextH2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        int i6 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((eh2) qg5Var, "<unused var>");
                        js3.p((FollowRequestData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.RequestList(new o57(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                }
            }
        };
        final int i4 = 3;
        ox5Var.o = new og5(this) { // from class: vx5
            public final /* synthetic */ OwnProfileHeaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                OwnProfileHeaderFragment ownProfileHeaderFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((OwnProfileActionData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.MyAccount(new uc5(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                    case 1:
                        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) obj;
                        int i42 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(ownProfileActionData, "data");
                        ownProfileHeaderFragment.V0().r(new OwnProfileHeaderAction.UnreadMessageAction(false));
                        Context contextH = ownProfileHeaderFragment.H();
                        String intent = ownProfileActionData.a.getIntent();
                        if (intent != null) {
                            t61.v(intent, "parse(...)", contextH, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 2:
                        OwnProfileTipData ownProfileTipData = (OwnProfileTipData) obj;
                        int i5 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((zx5) qg5Var, "<unused var>");
                        js3.p(ownProfileTipData, "data");
                        Context contextH2 = ownProfileHeaderFragment.H();
                        String action = ownProfileTipData.a.getAction();
                        if (action != null) {
                            t61.v(action, "parse(...)", contextH2, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    default:
                        int i6 = OwnProfileHeaderFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((eh2) qg5Var, "<unused var>");
                        js3.p((FollowRequestData) obj, "<unused var>");
                        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.RequestList(new o57(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        break;
                }
            }
        };
        return ox5Var;
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
        return dw1.n("OwnProfileHeaderFragment_", this.H0);
    }

    public final OwnProfileHeaderViewModel V0() {
        return (OwnProfileHeaderViewModel) this.Y0.getValue();
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
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new OwnProfileHeaderFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new OwnProfileHeaderFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new OwnProfileHeaderFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new OwnProfileHeaderFragment$onViewCreated$4(this, null));
    }
}
