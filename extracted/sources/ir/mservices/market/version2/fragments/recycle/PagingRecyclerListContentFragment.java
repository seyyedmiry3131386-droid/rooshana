package ir.mservices.market.version2.fragments.recycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.aw0;
import defpackage.cd;
import defpackage.cx;
import defpackage.cz6;
import defpackage.d16;
import defpackage.d67;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.e65;
import defpackage.ee;
import defpackage.ez6;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fp6;
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
import defpackage.kc2;
import defpackage.kr0;
import defpackage.lo4;
import defpackage.m;
import defpackage.m06;
import defpackage.mg;
import defpackage.mm2;
import defpackage.n06;
import defpackage.nw7;
import defpackage.o06;
import defpackage.p52;
import defpackage.pq6;
import defpackage.q06;
import defpackage.q69;
import defpackage.qj8;
import defpackage.qs6;
import defpackage.qz6;
import defpackage.re5;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.to1;
import defpackage.u01;
import defpackage.w91;
import defpackage.y45;
import defpackage.yz5;
import defpackage.z45;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.search.SearchContentFragment;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.MyketMultiRadio;
import ir.mservices.market.views.TryAgainView;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PagingRecyclerListContentFragment extends BaseContentFragment implements m06, d67, mm2, to1 {
    public static final /* synthetic */ int e1 = 0;
    public dv2 S0;
    public h T0;
    public cz6 U0;
    public ez6 V0;
    public iz6 W0;
    public gz6 X0;
    public boolean Y0;
    public a Z0;
    public View a1;
    public Boolean b1;
    public lo4 c1;
    public final l d1 = ja1.b(Boolean.FALSE);

    public final View A1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            View view = cz6Var.z;
            js3.o(view, "shadow");
            return view;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            View view2 = ez6Var.z;
            js3.o(view2, "shadow");
            return view2;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            View view3 = iz6Var.y;
            js3.o(view3, "shadow");
            return view3;
        }
        gz6 gz6Var = this.X0;
        js3.m(gz6Var);
        View view4 = gz6Var.z;
        js3.o(view4, "shadow");
        return view4;
    }

    public void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(o1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_SHOW_FILTER".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d != DialogResult.a) {
                    DialogResult dialogResult = DialogResult.a;
                } else if (((MyketMultiRadio.Item) dt2.p(bundle, "ITEM", MyketMultiRadio.Item.class)) != null) {
                    Iterator it = L0().iterator();
                    while (it.hasNext()) {
                        ((BaseMultiSelectViewModel) it.next()).s();
                    }
                }
            }
        }
    }

    public final ExtendedSwipeRefreshLayout B1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            if (cz6Var != null) {
                return cz6Var.A;
            }
            return null;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var == null || iz6Var == null) {
            return null;
        }
        return iz6Var.z;
    }

    public final TryAgainView C1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            if (cz6Var != null) {
                return cz6Var.B;
            }
            return null;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var == null || ez6Var == null) {
            return null;
        }
        return ez6Var.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1() {
        /*
            r5 = this;
            android.view.View r0 = r5.a1
            if (r0 == 0) goto L59
            ir.mservices.market.views.TryAgainView r1 = r5.C1()
            r2 = 0
            if (r1 == 0) goto L11
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L59
            ir.mservices.market.views.TryAgainView r1 = r5.C1()
            r3 = 0
            if (r1 == 0) goto L2e
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L22
            goto L2e
        L22:
            ir.mservices.market.version2.ui.recycler.adapter.a r1 = r5.Z0
            if (r1 == 0) goto L2b
            int r1 = r1.c()
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 > 0) goto L43
        L2e:
            ir.mservices.market.views.TryAgainView r1 = r5.C1()
            if (r1 == 0) goto L41
            int r1 = r1.getVisibility()
            r4 = 1
            if (r1 != 0) goto L3d
            r1 = r4
            goto L3e
        L3d:
            r1 = r3
        L3e:
            if (r1 != r4) goto L41
            r3 = r4
        L41:
            if (r3 == 0) goto L56
        L43:
            r1 = 8
            r0.setVisibility(r1)
            int r1 = defpackage.rr6.empty_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L59
            r0.setImageBitmap(r2)
            return
        L56:
            r5.K1(r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment.D1():void");
    }

    public void E1(aw0 aw0Var) {
        js3.p(aw0Var, "combinedLoadStates");
        ja4 ja4Var = aw0Var.a;
        boolean z = q1() != -1;
        boolean z2 = aw0Var.b.a;
        boolean z3 = ja4Var instanceof ia4;
        if (!l1().k && z && z3 && z2) {
            y1().setLayoutAnimation(AnimationUtils.loadLayoutAnimation(F(), q1()));
            l1().k = true;
        }
        L1(ja4Var);
        D1();
    }

    public void F1() {
        l1().e();
    }

    public boolean G1() {
        return !(this instanceof SearchContentFragment);
    }

    public abstract boolean H1();

    public void I1() {
        a aVar = this.Z0;
        if (aVar != null) {
            aVar.C();
        }
    }

    public final void J1(int i, long j) {
        ir.mservices.market.version2.core.utils.a.c(this, j, new PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1(this, i, null));
    }

    public void K1(View view) {
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
        String strN0 = N0();
        Bundle bundle = new Bundle();
        ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
        if (strN0 != null && !f88.n0(strN0)) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, strN0);
        }
        eeVar.getClass();
        eeVar.a(bundle, "empty_list");
    }

    public void L1(ja4 ja4Var) {
        ErrorDTO errorDTO;
        js3.p(ja4Var, "state");
        if (ja4Var instanceof ha4) {
            TryAgainView tryAgainViewC1 = C1();
            if (tryAgainViewC1 != null) {
                tryAgainViewC1.t();
                return;
            }
            return;
        }
        if (!(ja4Var instanceof ga4)) {
            if (!(ja4Var instanceof ia4)) {
                throw new NoWhenBranchMatchedException();
            }
            TryAgainView tryAgainViewC12 = C1();
            if (tryAgainViewC12 != null) {
                tryAgainViewC12.v();
                return;
            }
            return;
        }
        TryAgainView tryAgainViewC13 = C1();
        if (tryAgainViewC13 != null) {
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
            tryAgainViewC13.u(string);
        }
    }

    public boolean M1() {
        return !(this instanceof MovieDetailRecyclerListFragment);
    }

    public void N1(int i) {
        q06 q06Var = new q06(H(), 0);
        q06Var.a = 0;
        k layoutManager = y1().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.E0(q06Var);
        }
    }

    public final void O1() {
        h hVar = this.T0;
        if (hVar != null) {
            y1().f0(hVar);
        }
        h hVarT1 = t1();
        if (hVarT1 != null) {
            y1().i(hVarT1);
        } else {
            hVarT1 = null;
        }
        this.T0 = hVarT1;
    }

    @Override // androidx.fragment.app.d
    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        if (G1()) {
            if (H1()) {
                int i = cz6.C;
                DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
                this.U0 = (cz6) fa1.c(layoutInflater, js6.recycler_list, viewGroup, false);
            } else {
                int i2 = ez6.B;
                DataBinderMapperImpl dataBinderMapperImpl2 = fa1.a;
                this.V0 = (ez6) fa1.c(layoutInflater, js6.recycler_list_no_refresh, viewGroup, false);
            }
        } else if (H1()) {
            int i3 = iz6.A;
            DataBinderMapperImpl dataBinderMapperImpl3 = fa1.a;
            this.W0 = (iz6) fa1.c(layoutInflater, js6.recycler_list_no_try, viewGroup, false);
        } else {
            int i4 = gz6.A;
            DataBinderMapperImpl dataBinderMapperImpl4 = fa1.a;
            this.X0 = (gz6) fa1.c(layoutInflater, js6.recycler_list_no_refresh_no_try, viewGroup, false);
        }
        m1().setBackgroundColor(sj8.b().N);
        TryAgainView tryAgainViewC1 = C1();
        int i5 = 8;
        if (tryAgainViewC1 != null) {
            p52 p52Var = new p52(n1(), i5, tryAgainViewC1);
            WeakHashMap weakHashMap = q69.a;
            h69.m(tryAgainViewC1, p52Var);
            tryAgainViewC1.setPrimaryColor(w1(), x1());
            tryAgainViewC1.setOnTryAgainListener(new n06(this, 2));
        }
        TryAgainView tryAgainViewC12 = C1();
        if (tryAgainViewC12 != null) {
            tryAgainViewC12.setSettingTextResource(rs6.settings);
            tryAgainViewC12.setOnSettingListener(new cd(18, this));
        }
        View viewZ1 = z1();
        View view = null;
        View viewP1 = p1(viewZ1 instanceof ViewGroup ? (ViewGroup) viewZ1 : null);
        if (viewP1 != null) {
            viewP1.setVisibility(8);
            view = viewP1;
        }
        this.a1 = view;
        if (view != null) {
            View viewZ12 = z1();
            js3.n(viewZ12, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ((ConstraintLayout) viewZ12).addView(this.a1);
        }
        return z1();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        super.b0();
        RecyclerView recyclerViewY1 = y1();
        recyclerViewY1.removeCallbacks(this.c1);
        recyclerViewY1.setAdapter(null);
        this.Z0 = null;
        this.a1 = null;
        this.c1 = null;
        this.Y0 = false;
        this.U0 = null;
        this.W0 = null;
        this.V0 = null;
        this.X0 = null;
        this.J0.x(o1());
    }

    public abstract a j1();

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1;
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(o1(), this);
        TryAgainView tryAgainViewC1 = C1();
        if (tryAgainViewC1 != null) {
            tryAgainViewC1.t();
        }
        int i = 0;
        if (H1() && (extendedSwipeRefreshLayoutB1 = B1()) != null) {
            extendedSwipeRefreshLayoutB1.setColorSchemeColors(sj8.b().c);
            extendedSwipeRefreshLayoutB1.setProgressBackgroundColorSchemeColor(sj8.b().l);
            extendedSwipeRefreshLayoutB1.setOnRefreshListener(new n06(this, i));
        }
        RecyclerView recyclerViewY1 = y1();
        recyclerViewY1.setHasFixedSize(false);
        recyclerViewY1.setLayoutManager(k1());
        qz6 itemAnimator = recyclerViewY1.getItemAnimator();
        js3.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((nw7) itemAnimator).g = false;
        O1();
        recyclerViewY1.setLayoutDirection(this.F0.f() ? 1 : 0);
        recyclerViewY1.addOnAttachStateChangeListener(new mg(6, this));
        recyclerViewY1.j(new gp(12, this));
        A1().setVisibility(M1() ? 0 : 8);
        a aVarJ1 = j1();
        aVarJ1.y(new z45(16, this));
        o06 o06Var = new o06(i, this);
        cx cxVar = aVarJ1.e;
        cxVar.getClass();
        ((CopyOnWriteArrayList) cxVar.f.f.b).add(o06Var);
        aVarJ1.t(new kr0(3, this));
        aVarJ1.i = this;
        aVarJ1.j = this;
        aVarJ1.v(RecyclerView$Adapter$StateRestorationPolicy.b);
        RecyclerView recyclerViewY12 = y1();
        re5 re5Var = new re5(new PagingRecyclerListContentFragment$getLoadStateAdapter$1(0, this, PagingRecyclerListContentFragment.class, "retryClicked", "retryClicked()V", 0), w1(), x1());
        aVarJ1.y(new m(re5Var, aVarJ1, 7));
        int i2 = 1;
        recyclerViewY12.setAdapter(new u01(aVarJ1, re5Var));
        this.Z0 = aVarJ1;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$9(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$10(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$11(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$12(this, null));
        Boolean bool = this.b1;
        if (bool != null) {
            l(bool.booleanValue());
        }
        if (this instanceof AppDetailFragment) {
            AppDetailViewModel appDetailViewModelR1 = ((AppDetailFragment) this).R1();
            s1().c();
            appDetailViewModelR1.getClass();
            appDetailViewModelR1.q(true);
        }
        r1().l.setVisibility(8);
        y1().setPadding(0, 0, 0, 0);
        Iterator it = L0().iterator();
        while (it.hasNext()) {
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PagingRecyclerListContentFragment$onViewCreated$15$1((BaseMultiSelectViewModel) it.next(), this, null));
        }
        RecyclerView recyclerViewY13 = y1();
        n06 n06Var = new n06(this, i2);
        WeakHashMap weakHashMap = q69.a;
        h69.m(recyclerViewY13, n06Var);
        h69.m(m1(), new y45(15));
    }

    public k k1() {
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(v1());
        myketGridLayoutManager.Q = u1();
        myketGridLayoutManager.K = new e65(1, this);
        return myketGridLayoutManager;
    }

    @Override // defpackage.d67
    public final void l(boolean z) {
        if (this.U.d == Lifecycle$State.b) {
            this.b1 = Boolean.valueOf(z);
        } else {
            l1().l(z);
            this.b1 = null;
        }
    }

    public abstract c l1();

    public final View m1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            View view = cz6Var.v;
            js3.o(view, "bottomInsetView");
            return view;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            View view2 = ez6Var.v;
            js3.o(view2, "bottomInsetView");
            return view2;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            View view3 = iz6Var.v;
            js3.o(view3, "bottomInsetView");
            return view3;
        }
        gz6 gz6Var = this.X0;
        js3.m(gz6Var);
        View view4 = gz6Var.v;
        js3.o(view4, "bottomInsetView");
        return view4;
    }

    public int n1() {
        return 0;
    }

    public final String o1() {
        return t61.j(getClass().getSimpleName(), "_", this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        y1().setAdapter(y1().getAdapter());
    }

    public View p1(ViewGroup viewGroup) {
        View view = fa1.c(LayoutInflater.from(F()), js6.main_app_empty_view, viewGroup, false).l;
        js3.o(view, "getRoot(...)");
        ((TextView) view.findViewById(rr6.empty_message)).setText(rs6.no_item_in_review_list);
        return view;
    }

    public int q1() {
        return fp6.layout_animation_fall_down;
    }

    public final kc2 r1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            kc2 kc2Var = cz6Var.w;
            js3.o(kc2Var, "filterView");
            return kc2Var;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            kc2 kc2Var2 = ez6Var.w;
            js3.o(kc2Var2, "filterView");
            return kc2Var2;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            kc2 kc2Var3 = iz6Var.w;
            js3.o(kc2Var3, "filterView");
            return kc2Var3;
        }
        gz6 gz6Var = this.X0;
        js3.m(gz6Var);
        kc2 kc2Var4 = gz6Var.w;
        js3.o(kc2Var4, "filterView");
        return kc2Var4;
    }

    public final dv2 s1() {
        dv2 dv2Var = this.S0;
        if (dv2Var != null) {
            return dv2Var;
        }
        js3.V("graphicUtils");
        throw null;
    }

    @Override // defpackage.to1
    public final void t(boolean z) {
        y1().requestDisallowInterceptTouchEvent(z);
    }

    public h t1() {
        return new d16(0, K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding), 0, K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding) / 4, v1(), false, this.F0.f());
    }

    @Override // defpackage.m06
    public final void u(yz5 yz5Var) {
        if (!y1().R()) {
            l1().g(yz5Var);
            return;
        }
        lo4 lo4Var = new lo4(this, yz5Var, 20);
        y1().post(lo4Var);
        this.c1 = lo4Var;
    }

    public PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, 0, 0, 0);
    }

    public abstract int v1();

    public int w1() {
        return sj8.b().c;
    }

    public int x1() {
        return sj8.b().d;
    }

    public final RecyclerView y1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            js3.m(cz6Var);
            RecyclerView recyclerView = cz6Var.y;
            js3.o(recyclerView, "recyclerView");
            return recyclerView;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var != null) {
            js3.m(ez6Var);
            RecyclerView recyclerView2 = ez6Var.y;
            js3.o(recyclerView2, "recyclerView");
            return recyclerView2;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var != null) {
            js3.m(iz6Var);
            RecyclerView recyclerView3 = iz6Var.x;
            js3.o(recyclerView3, "recyclerView");
            return recyclerView3;
        }
        gz6 gz6Var = this.X0;
        js3.m(gz6Var);
        RecyclerView recyclerView4 = gz6Var.y;
        js3.o(recyclerView4, "recyclerView");
        return recyclerView4;
    }

    public final View z1() {
        cz6 cz6Var = this.U0;
        if (cz6Var != null) {
            if (cz6Var != null) {
                return cz6Var.l;
            }
            return null;
        }
        ez6 ez6Var = this.V0;
        if (ez6Var != null) {
            if (ez6Var != null) {
                return ez6Var.l;
            }
            return null;
        }
        iz6 iz6Var = this.W0;
        if (iz6Var != null) {
            if (iz6Var != null) {
                return iz6Var.l;
            }
            return null;
        }
        gz6 gz6Var = this.X0;
        if (gz6Var != null) {
            return gz6Var.l;
        }
        return null;
    }

    public final void onEvent(j04 j04Var) {
        js3.p(j04Var, "event");
        Boolean bool = Boolean.TRUE;
        l lVar = this.d1;
        lVar.getClass();
        lVar.p(null, bool);
    }
}
