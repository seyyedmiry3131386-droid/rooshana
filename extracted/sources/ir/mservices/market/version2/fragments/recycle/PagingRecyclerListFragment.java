package ir.mservices.market.version2.fragments.recycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.aw0;
import defpackage.cd;
import defpackage.cz6;
import defpackage.d16;
import defpackage.d67;
import defpackage.dv2;
import defpackage.e65;
import defpackage.ee;
import defpackage.ez6;
import defpackage.f88;
import defpackage.fa1;
import defpackage.ga4;
import defpackage.gp;
import defpackage.gz6;
import defpackage.h69;
import defpackage.ha4;
import defpackage.ia4;
import defpackage.iz6;
import defpackage.j04;
import defpackage.ja1;
import defpackage.ja4;
import defpackage.js3;
import defpackage.js6;
import defpackage.lo4;
import defpackage.m;
import defpackage.m06;
import defpackage.nw7;
import defpackage.p52;
import defpackage.pq6;
import defpackage.q69;
import defpackage.qj8;
import defpackage.qs6;
import defpackage.qz6;
import defpackage.r06;
import defpackage.re5;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t32;
import defpackage.to1;
import defpackage.u01;
import defpackage.w91;
import defpackage.yz5;
import defpackage.z45;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment;
import ir.mservices.market.app.detail.update.InAppFragment;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.TryAgainView;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PagingRecyclerListFragment extends BaseNavigationFragment implements m06, d67, to1 {
    public static final /* synthetic */ int U0 = 0;
    public dv2 K0;
    public cz6 L0;
    public ez6 M0;
    public iz6 N0;
    public gz6 O0;
    public a P0;
    public View Q0;
    public Boolean R0;
    public lo4 S0;
    public final l T0 = ja1.b(Boolean.FALSE);

    public abstract a D0();

    public abstract c E0();

    public View F0(ViewGroup viewGroup) {
        View view = fa1.c(LayoutInflater.from(F()), js6.main_app_empty_view, viewGroup, false).l;
        js3.o(view, "getRoot(...)");
        ((TextView) view.findViewById(rr6.empty_message)).setText(rs6.no_item_in_review_list);
        return view;
    }

    public final dv2 G0() {
        dv2 dv2Var = this.K0;
        if (dv2Var != null) {
            return dv2Var;
        }
        js3.V("graphicUtils");
        throw null;
    }

    public d16 H0() {
        return new d16(0, K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding), 0, K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding) / 4, I0(), false, this.F0.f());
    }

    public abstract int I0();

    public final RecyclerView J0() {
        cz6 cz6Var = this.L0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            RecyclerView recyclerView = cz6Var.y;
            js3.o(recyclerView, "recyclerView");
            return recyclerView;
        }
        ez6 ez6Var = this.M0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            RecyclerView recyclerView2 = ez6Var.y;
            js3.o(recyclerView2, "recyclerView");
            return recyclerView2;
        }
        iz6 iz6Var = this.N0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            RecyclerView recyclerView3 = iz6Var.x;
            js3.o(recyclerView3, "recyclerView");
            return recyclerView3;
        }
        gz6 gz6Var = this.O0;
        js3.m(gz6Var);
        RecyclerView recyclerView4 = gz6Var.y;
        js3.o(recyclerView4, "recyclerView");
        return recyclerView4;
    }

    public final View K0() {
        cz6 cz6Var = this.L0;
        if (cz6Var != null) {
            if (cz6Var != null) {
                return cz6Var.l;
            }
            return null;
        }
        ez6 ez6Var = this.M0;
        if (ez6Var != null) {
            if (ez6Var != null) {
                return ez6Var.l;
            }
            return null;
        }
        iz6 iz6Var = this.N0;
        if (iz6Var != null) {
            if (iz6Var != null) {
                return iz6Var.l;
            }
            return null;
        }
        gz6 gz6Var = this.O0;
        if (gz6Var != null) {
            return gz6Var.l;
        }
        return null;
    }

    public abstract String L0();

    public final View M0() {
        cz6 cz6Var = this.L0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            View view = cz6Var.z;
            js3.o(view, "shadow");
            return view;
        }
        ez6 ez6Var = this.M0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            View view2 = ez6Var.z;
            js3.o(view2, "shadow");
            return view2;
        }
        iz6 iz6Var = this.N0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            View view3 = iz6Var.y;
            js3.o(view3, "shadow");
            return view3;
        }
        gz6 gz6Var = this.O0;
        js3.m(gz6Var);
        View view4 = gz6Var.z;
        js3.o(view4, "shadow");
        return view4;
    }

    public final TryAgainView N0() {
        cz6 cz6Var = this.L0;
        if (cz6Var != null) {
            if (cz6Var != null) {
                return cz6Var.B;
            }
            return null;
        }
        ez6 ez6Var = this.M0;
        if (ez6Var == null || ez6Var == null) {
            return null;
        }
        return ez6Var.A;
    }

    public boolean O0() {
        return !(this instanceof AppDetailRecommendationFragment);
    }

    public boolean P0() {
        return !(this instanceof InAppFragment);
    }

    public void Q0(View view) {
        js3.p(view, "emptyView");
        view.setVisibility(0);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_result);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(rs6.app_not_found);
        }
        String strL0 = L0();
        Bundle bundle = new Bundle();
        ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
        if (strL0 != null && !f88.n0(strL0)) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, strL0);
        }
        eeVar.getClass();
        eeVar.a(bundle, "empty_list");
    }

    public void R0(aw0 aw0Var) {
        ErrorDTO errorDTO;
        js3.p(aw0Var, "it");
        ja4 ja4Var = aw0Var.a;
        if (ja4Var instanceof ha4) {
            TryAgainView tryAgainViewN0 = N0();
            if (tryAgainViewN0 != null) {
                tryAgainViewN0.t();
                return;
            }
            return;
        }
        if (!(ja4Var instanceof ga4)) {
            if (!(ja4Var instanceof ia4)) {
                throw new NoWhenBranchMatchedException();
            }
            TryAgainView tryAgainViewN02 = N0();
            if (tryAgainViewN02 != null) {
                tryAgainViewN02.v();
                return;
            }
            return;
        }
        TryAgainView tryAgainViewN03 = N0();
        if (tryAgainViewN03 != null) {
            Throwable th = ((ga4) ja4Var).b;
            String string = null;
            MyketPagingError myketPagingError = th instanceof MyketPagingError ? (MyketPagingError) th : null;
            if (myketPagingError != null && (errorDTO = myketPagingError.a) != null) {
                string = errorDTO.getTranslatedMessage();
            }
            if (string == null || f88.n0(string)) {
                string = K().getString(rs6.error_dto_default_message);
                js3.o(string, "getString(...)");
            }
            tryAgainViewN03.u(string);
        }
    }

    public boolean S0() {
        return !(this instanceof AppDetailRecommendationFragment);
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = 0;
        if (O0()) {
            int i2 = ez6.B;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            this.M0 = (ez6) fa1.c(layoutInflater, js6.recycler_list_no_refresh, viewGroup, false);
        } else {
            int i3 = gz6.A;
            DataBinderMapperImpl dataBinderMapperImpl2 = fa1.a;
            this.O0 = (gz6) fa1.c(layoutInflater, js6.recycler_list_no_refresh_no_try, viewGroup, false);
        }
        TryAgainView tryAgainViewN0 = N0();
        int i4 = 8;
        if (tryAgainViewN0 != null) {
            int i5 = TryAgainView.t;
            p52 p52Var = new p52(i, i4, tryAgainViewN0);
            WeakHashMap weakHashMap = q69.a;
            h69.m(tryAgainViewN0, p52Var);
            tryAgainViewN0.setPrimaryColor(sj8.b().c, sj8.b().d);
            tryAgainViewN0.setOnTryAgainListener(new r06(this));
            tryAgainViewN0.setOnSettingListener(new cd(19, this));
        }
        View viewK0 = K0();
        View view = null;
        View viewF0 = F0(viewK0 instanceof ViewGroup ? (ViewGroup) viewK0 : null);
        if (viewF0 != null) {
            viewF0.setVisibility(8);
            view = viewF0;
        }
        this.Q0 = view;
        if (view != null) {
            View viewK02 = K0();
            js3.n(viewK02, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ((ConstraintLayout) viewK02).addView(this.Q0);
        }
        return K0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() {
        super.b0();
        t32.b().o(this);
        RecyclerView recyclerViewJ0 = J0();
        recyclerViewJ0.removeCallbacks(this.S0);
        recyclerViewJ0.setAdapter(null);
        this.P0 = null;
        this.Q0 = null;
        this.S0 = null;
        this.L0 = null;
        this.N0 = null;
        this.M0 = null;
        this.O0 = null;
    }

    @Override // androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        t32.b().l(this, false);
        TryAgainView tryAgainViewN0 = N0();
        if (tryAgainViewN0 != null) {
            tryAgainViewN0.t();
        }
        RecyclerView recyclerViewJ0 = J0();
        recyclerViewJ0.setHasFixedSize(recyclerViewJ0.t);
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(I0());
        myketGridLayoutManager.Q = new PaddingLayoutManager$Padding(0, 0, 0, 0);
        myketGridLayoutManager.K = new e65(2, this);
        recyclerViewJ0.setLayoutManager(myketGridLayoutManager);
        qz6 itemAnimator = recyclerViewJ0.getItemAnimator();
        js3.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((nw7) itemAnimator).g = false;
        recyclerViewJ0.i(H0());
        recyclerViewJ0.setLayoutDirection(this.F0.f() ? 1 : 0);
        recyclerViewJ0.j(new gp(13, this));
        M0().setVisibility(S0() ? 0 : 8);
        a aVarD0 = D0();
        aVarD0.y(new z45(17, this));
        aVarD0.i = this;
        aVarD0.j = this;
        aVarD0.v(RecyclerView$Adapter$StateRestorationPolicy.b);
        RecyclerView recyclerViewJ02 = J0();
        re5 re5Var = new re5(new PagingRecyclerListFragment$getLoadStateAdapter$1(0, aVarD0, a.class, "retry", "retry()V", 0), sj8.b().c, sj8.b().d);
        aVarD0.y(new m(re5Var, aVarD0, 7));
        recyclerViewJ02.setAdapter(new u01(aVarD0, re5Var));
        this.P0 = aVarD0;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListFragment$onViewCreated$9(this, null));
        Boolean bool = this.R0;
        if (bool != null) {
            l(bool.booleanValue());
        }
        if (P0()) {
            RecyclerView recyclerViewJ03 = J0();
            r06 r06Var = new r06(this);
            WeakHashMap weakHashMap = q69.a;
            h69.m(recyclerViewJ03, r06Var);
        }
    }

    @Override // defpackage.d67
    public final void l(boolean z) {
        if (this.U.d == Lifecycle$State.b) {
            this.R0 = Boolean.valueOf(z);
        } else {
            E0().l(z);
            this.R0 = null;
        }
    }

    public final void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        J0().setAdapter(J0().getAdapter());
    }

    @Override // defpackage.to1
    public final void t(boolean z) {
        J0().requestDisallowInterceptTouchEvent(z);
    }

    @Override // defpackage.m06
    public final void u(yz5 yz5Var) {
        if (!J0().R()) {
            E0().g(yz5Var);
            return;
        }
        lo4 lo4Var = new lo4(this, yz5Var, 21);
        J0().post(lo4Var);
        this.S0 = lo4Var;
    }

    public final void onEvent(j04 j04Var) {
        js3.p(j04Var, "event");
        Boolean bool = Boolean.TRUE;
        l lVar = this.T0;
        lVar.getClass();
        lVar.p(null, bool);
    }
}
