package ir.mservices.market.appUsage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.am2;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.de;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.ga4;
import defpackage.h68;
import defpackage.j68;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lm;
import defpackage.o;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.ru;
import defpackage.sj8;
import defpackage.su;
import defpackage.tv8;
import defpackage.x79;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketMultiRadio;
import ir.mservices.market.views.TryAgainView;
import ir.myket.core.utils.StringParcelable;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppsUsageFragment extends Hilt_AppsUsageFragment {
    public static final /* synthetic */ int m1 = 0;
    public final bi5 i1 = new bi5(g27.a(su.class), new de(8, this));
    public final o79 j1;
    public h68 k1;
    public j68 l1;

    public AppsUsageFragment() {
        final AppsUsageFragment$special$$inlined$viewModels$default$1 appsUsageFragment$special$$inlined$viewModels$default$1 = new AppsUsageFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.appUsage.AppsUsageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appsUsageFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(AppsUsageViewModel.class), new bp2() { // from class: ir.mservices.market.appUsage.AppsUsageFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.appUsage.AppsUsageFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.appUsage.AppsUsageFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        Object value;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(R1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_SHOW_SORT".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                MyketMultiRadio.Item item = (MyketMultiRadio.Item) dt2.p(bundle, "ITEM", MyketMultiRadio.Item.class);
                AppsUsageViewModel appsUsageViewModelQ1 = Q1();
                o oVar = (o) SortMode.d;
                oVar.getClass();
                for (Object obj : tv8.C(oVar, new SortMode[0])) {
                    SortMode sortMode = (SortMode) obj;
                    String strName = sortMode.name();
                    Parcelable parcelable = item != null ? item.b : null;
                    StringParcelable stringParcelable = parcelable instanceof StringParcelable ? (StringParcelable) parcelable : null;
                    if (js3.i(strName, stringParcelable != null ? stringParcelable.a : null)) {
                        l lVar = appsUsageViewModelQ1.x;
                        do {
                            value = lVar.getValue();
                        } while (!lVar.n(value, sortMode));
                        return;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_apps_usage);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        ((TextView) view.findViewById(rr6.empty_title)).setText(rs6.no_item_in_apps_usage_list);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void L1(ja4 ja4Var) {
        TryAgainView tryAgainViewC1;
        ErrorDTO errorDTO;
        js3.p(ja4Var, "state");
        if (!(ja4Var instanceof ga4) || (tryAgainViewC1 = C1()) == null) {
            return;
        }
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
        tryAgainViewC1.u(string);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_apps_usage_manager);
        js3.o(string, "getString(...)");
        return string;
    }

    public final AppsUsageViewModel Q1() {
        return (AppsUsageViewModel) this.j1.getValue();
    }

    public final String R1() {
        return dw1.n("AppsUsageFragment_", this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = h68.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        h68 h68Var = (h68) fa1.c(layoutInflater, js6.storage_usage_fixed_header, viewGroup, false);
        js3.o(h68Var, "inflate(...)");
        h68Var.w.setBackgroundColor(sj8.b().l);
        View view = h68Var.l;
        js3.o(view, "getRoot(...)");
        view.setVisibility(8);
        this.k1 = h68Var;
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        if (viewZ == null) {
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewZ;
        h68 h68Var2 = this.k1;
        if (h68Var2 == null) {
            js3.V("headerBinding");
            throw null;
        }
        View view2 = h68Var2.l;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.i = 0;
        constraintLayout.addView(view2, layoutParams);
        return viewZ;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        am2 am2Var = this.J0;
        bi5 bi5Var = this.i1;
        String str = ((su) bi5Var.getValue()).a.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_KEY_DATA", ((su) bi5Var.getValue()).a);
        am2Var.k(bundle, str);
        this.J0.x(R1());
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(1, 3);
        lmVar.m = new ru(this, 1);
        lmVar.n = new ru(this, 2);
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(R1(), this);
        h68 h68Var = this.k1;
        if (h68Var == null) {
            js3.V("headerBinding");
            throw null;
        }
        View view2 = h68Var.l;
        js3.o(view2, "getRoot(...)");
        j68 j68Var = new j68(view2, new ru(this, 0));
        h68 h68Var2 = this.k1;
        if (h68Var2 == null) {
            js3.V("headerBinding");
            throw null;
        }
        j68Var.w(h68Var2);
        this.l1 = j68Var;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppsUsageFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppsUsageFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppsUsageFragment$onViewCreated$5(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.storage_usage_header_height) + K().getDimensionPixelSize(pq6.space_16), 0, K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_4), 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
