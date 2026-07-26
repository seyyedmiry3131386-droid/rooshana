package ir.mservices.market.app.home;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import defpackage.at2;
import defpackage.ba7;
import defpackage.dg5;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eg5;
import defpackage.eq0;
import defpackage.f88;
import defpackage.fa1;
import defpackage.hp;
import defpackage.i30;
import defpackage.ja;
import defpackage.js3;
import defpackage.js6;
import defpackage.kb9;
import defpackage.kp4;
import defpackage.lu7;
import defpackage.lw;
import defpackage.m88;
import defpackage.mz3;
import defpackage.nb9;
import defpackage.p90;
import defpackage.pb9;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.pz3;
import defpackage.q40;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sq4;
import defpackage.tb9;
import defpackage.ub9;
import defpackage.w50;
import defpackage.xz7;
import defpackage.yf5;
import defpackage.yq2;
import defpackage.z0;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.vpnService.VpnServiceType;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MainHomeFragment extends Hilt_MainHomeFragment implements ba7, pz3 {
    public static final /* synthetic */ int H1 = 0;
    public eg5 C1;
    public lu7 D1;
    public kb9 E1;
    public final Object F1 = a.b(LazyThreadSafetyMode.a, new i30(this, 7));
    public xz7 G1;

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(m2())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_MYKET_UPDATE".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("mus_update_myketDialogMain");
                clickEventBuilder.a();
                pk5.g(this.J0, new NavIntentDirections.AppDetail(new hp(NearbyRepository.SERVICE_ID, true, new Tracker("feature", "myketDialogMain", "updateSnackbar"), false, null, "myketDialogMain", null, null, null, new Utm("myketDialogMain", 30), null, null, null)), -1);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_main);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", "all");
        bundle.putString("sourceType", "app");
        bundle.putBoolean("BUNDLE_KEY_OPEN_STATE", false);
        searchFragment.u0(bundle);
        return searchFragment;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final String U1() {
        String strL = L(rs6.search_home_hint);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean W1(int i) {
        return i == 0;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return true;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final yq2 Y1() {
        return q40.g;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
        actionBarEventBuilder.b("action_bar_main_dynamic_btn");
        actionBarEventBuilder.a();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean a1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
        dw1.y("search_box_home");
    }

    @Override // ir.mservices.market.app.home.HomeFragment, ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.G1 = null;
        this.J0.x(m2());
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
        dw1.y("search_speech_home");
    }

    @Override // ir.mservices.market.app.home.HomeFragment, ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        super.f0();
        xz7 xz7Var = this.G1;
        if (xz7Var != null) {
            xz7Var.a(3);
        }
    }

    @Override // ir.mservices.market.app.home.HomeFragment
    public final String f2() {
        return HomeDto.MAIN;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void g0() {
        super.g0();
        p2();
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    @Override // ir.mservices.market.app.home.HomeFragment
    public final boolean i2() {
        return true;
    }

    @Override // ir.mservices.market.app.home.HomeFragment, ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Object next;
        Object adGuard;
        js3.p(view, "view");
        super.k0(view, bundle);
        if (this.E1 == null) {
            js3.V("vpnController");
            throw null;
        }
        String strA = ((tb9) ub9.b.a.getValue()).a();
        Enum r1 = VpnServiceType.b;
        Iterator it = ((z0) VpnServiceType.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (m88.T(((Enum) next).name(), strA, true)) {
                    break;
                }
            }
        }
        Enum r3 = (Enum) next;
        if (r3 != null) {
            r1 = r3;
        }
        VpnServiceType vpnServiceType = (VpnServiceType) r1;
        int iOrdinal = vpnServiceType.ordinal();
        if (iOrdinal == 0) {
            adGuard = new NavIntentDirections.AdGuard(new ja(false));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            adGuard = new NavIntentDirections.Cheetah(new eq0(null, null, false));
        }
        LayoutInflater layoutInflaterD0 = this.Q;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Q = layoutInflaterD0;
        }
        int i = nb9.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        nb9 nb9Var = (nb9) fa1.c(layoutInflaterD0, js6.vpn_service_snackbar, null, false);
        nb9Var.x.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        nb9Var.y.setText(K().getString(vpnServiceType.a));
        nb9Var.v.setOnClickListener(new w50(this, adGuard, 4));
        xz7 xz7VarI = xz7.i(view);
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = xz7VarI.i;
        xz7VarI.l = true;
        FragmentActivity fragmentActivityF = F();
        View viewFindViewById = fragmentActivityF != null ? fragmentActivityF.findViewById(rr6.myket_navigation_menu) : null;
        if (viewFindViewById instanceof BottomNavigationView) {
            p90 p90Var = xz7VarI.m;
            if (p90Var != null) {
                p90Var.a();
            }
            p90 p90Var2 = new p90(xz7VarI, (BottomNavigationView) viewFindViewById);
            if (viewFindViewById.isAttachedToWindow()) {
                viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(p90Var2);
            }
            viewFindViewById.addOnAttachStateChangeListener(p90Var2);
            xz7VarI.m = p90Var2;
        }
        if ((baseTransientBottomBar$SnackbarBaseLayout != null ? baseTransientBottomBar$SnackbarBaseLayout : null) != null) {
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            baseTransientBottomBar$SnackbarBaseLayout.setLayoutParams(marginLayoutParams);
        }
        js3.n(baseTransientBottomBar$SnackbarBaseLayout, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) baseTransientBottomBar$SnackbarBaseLayout;
        snackbar$SnackbarLayout.setBackgroundColor(sj8.b().N);
        snackbar$SnackbarLayout.setPadding(0, 0, 0, 0);
        snackbar$SnackbarLayout.removeAllViews();
        snackbar$SnackbarLayout.addView(nb9Var.l);
        this.G1 = xz7VarI;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MainHomeFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MainHomeFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MainHomeFragment$onViewCreated$3(this, null));
        this.J0.d(m2(), this);
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        super.l0(bundle);
        lu7 lu7Var = this.D1;
        if (lu7Var == null) {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
        boolean zB = lu7Var.b(lu7.y, false);
        if (((Boolean) S1().B.a.getValue()).booleanValue() || zB || n2().j() <= 0 || n2().k()) {
            return;
        }
        o2();
    }

    public final String m2() {
        return dw1.n("MainHomeFragment_", this.H0);
    }

    public final eg5 n2() {
        eg5 eg5Var = this.C1;
        if (eg5Var != null) {
            return eg5Var;
        }
        js3.V("myketUpdateManager");
        throw null;
    }

    public final void o2() {
        DialogDataModel dialogDataModel = new DialogDataModel(m2(), "DIALOG_KEY_MYKET_UPDATE", null, 12);
        eg5 eg5VarN2 = n2();
        String strF = eg5VarN2.d.f(lu7.w, eg5VarN2.g.getResources().getString(rs6.update_myket_title));
        eg5 eg5VarN22 = n2();
        pk5.g(this.J0, new NavIntentDirections.MyketUpdateDialog(new yf5(dialogDataModel, strF, eg5VarN22.d.f(lu7.v, eg5VarN22.g.getResources().getString(rs6.update_myket_message)))), -1);
        lu7 lu7Var = this.D1;
        if (lu7Var != null) {
            lu7Var.j(lu7.y, true);
        } else {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
    }

    public final void onEvent(dg5 dg5Var) {
        js3.p(dg5Var, "event");
        if (n2().j() <= 0) {
            lw.g(null, "Received event (OnMyketUpdateAvailable) but server version older than current version!", null);
            return;
        }
        lu7 lu7Var = this.D1;
        if (lu7Var == null) {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
        boolean zB = lu7Var.b(lu7.y, false);
        if (((Boolean) S1().B.a.getValue()).booleanValue() || zB || n2().k()) {
            return;
        }
        o2();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [c24, java.lang.Object] */
    public final void p2() {
        xz7 xz7Var = this.G1;
        if (xz7Var == null || xz7Var.h()) {
            return;
        }
        if (this.E1 == null) {
            js3.V("vpnController");
            throw null;
        }
        if (!(ub9.b.a.getValue() instanceof pb9) || ((Boolean) S1().B.a.getValue()).booleanValue()) {
            return;
        }
        kp4 kp4Var = (kp4) ((sq4) this.F1.getValue()).g.a.getValue();
        String str = kp4Var != null ? kp4Var.a : null;
        if (str == null || f88.n0(str)) {
            xz7Var.j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, 0, 0, ((sq4) this.F1.getValue()).g.a.getValue() != null ? K().getDimensionPixelSize(pq6.space_84) : 0);
    }
}
