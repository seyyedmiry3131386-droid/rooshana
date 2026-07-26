package ir.mservices.market.social.requests;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.d16;
import defpackage.ds6;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o57;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.x79;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.requests.RequestListAction;
import ir.mservices.market.social.requests.RequestListFragment;
import ir.mservices.market.social.requests.data.AccountDto;
import ir.mservices.market.social.requests.recycler.RequestAccountData;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestListFragment extends PagingRecyclerListContentFragment {
    public static final /* synthetic */ int h1 = 0;
    public final o79 f1;
    public final bi5 g1;

    public RequestListFragment() {
        final RequestListFragment$special$$inlined$viewModels$default$1 requestListFragment$special$$inlined$viewModels$default$1 = new RequestListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.requests.RequestListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) requestListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.f1 = new o79(g27.a(RequestViewModel.class), new bp2() { // from class: ir.mservices.market.social.requests.RequestListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.requests.RequestListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.requests.RequestListFragment$special$$inlined$viewModels$default$4
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
        this.g1 = new bi5(g27.a(o57.class), new yw6(4, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_profile_request);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_request);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setVisibility(0);
        textView.setText(rs6.no_item_in_request_list);
    }

    public final RequestViewModel P1() {
        return (RequestViewModel) this.f1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = K().getString(rs6.follow_requests);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(v1(), 5);
        final int i = 0;
        cl1Var.m = new og5(this) { // from class: m57
            public final /* synthetic */ RequestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                RequestListFragment requestListFragment = this.b;
                ir.mservices.market.social.requests.recycler.a aVar = (ir.mservices.market.social.requests.recycler.a) qg5Var;
                RequestAccountData requestAccountData = (RequestAccountData) obj;
                switch (i2) {
                    case 0:
                        int i3 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        FragmentActivity fragmentActivityF = requestListFragment.F();
                        AccountDto accountDto = requestAccountData.a;
                        pk5.e(fragmentActivityF, accountDto.getAccountKey(), accountDto.getNickname(), UserProfileRefId.h);
                        break;
                    case 1:
                        int i4 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.DismissAction(requestAccountData.a.getAccountKey()));
                        break;
                    default:
                        int i5 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.ApproveAction(requestAccountData.a.getAccountKey()));
                        break;
                }
            }
        };
        final int i2 = 1;
        cl1Var.n = new og5(this) { // from class: m57
            public final /* synthetic */ RequestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                RequestListFragment requestListFragment = this.b;
                ir.mservices.market.social.requests.recycler.a aVar = (ir.mservices.market.social.requests.recycler.a) qg5Var;
                RequestAccountData requestAccountData = (RequestAccountData) obj;
                switch (i22) {
                    case 0:
                        int i3 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        FragmentActivity fragmentActivityF = requestListFragment.F();
                        AccountDto accountDto = requestAccountData.a;
                        pk5.e(fragmentActivityF, accountDto.getAccountKey(), accountDto.getNickname(), UserProfileRefId.h);
                        break;
                    case 1:
                        int i4 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.DismissAction(requestAccountData.a.getAccountKey()));
                        break;
                    default:
                        int i5 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.ApproveAction(requestAccountData.a.getAccountKey()));
                        break;
                }
            }
        };
        final int i3 = 2;
        cl1Var.o = new og5(this) { // from class: m57
            public final /* synthetic */ RequestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                RequestListFragment requestListFragment = this.b;
                ir.mservices.market.social.requests.recycler.a aVar = (ir.mservices.market.social.requests.recycler.a) qg5Var;
                RequestAccountData requestAccountData = (RequestAccountData) obj;
                switch (i22) {
                    case 0:
                        int i32 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        FragmentActivity fragmentActivityF = requestListFragment.F();
                        AccountDto accountDto = requestAccountData.a;
                        pk5.e(fragmentActivityF, accountDto.getAccountKey(), accountDto.getNickname(), UserProfileRefId.h);
                        break;
                    case 1:
                        int i4 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.DismissAction(requestAccountData.a.getAccountKey()));
                        break;
                    default:
                        int i5 = RequestListFragment.h1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "<unused var>");
                        js3.p(requestAccountData, "data");
                        requestListFragment.P1().r(new RequestListAction.ApproveAction(requestAccountData.a.getAccountKey()));
                        break;
                }
            }
        };
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RequestListFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RequestListFragment$onViewCreated$2(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return P1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, 0, K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.requests_max_span);
    }
}
