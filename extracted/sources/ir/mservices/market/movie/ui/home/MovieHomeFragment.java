package ir.mservices.market.movie.ui.home;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.at2;
import defpackage.ba7;
import defpackage.d16;
import defpackage.dg5;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eg5;
import defpackage.hh2;
import defpackage.i30;
import defpackage.js3;
import defpackage.js8;
import defpackage.lu7;
import defpackage.lw;
import defpackage.mz3;
import defpackage.pq6;
import defpackage.pz3;
import defpackage.r40;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sq4;
import defpackage.yq2;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeFragment extends Hilt_MovieHomeFragment implements ba7, pz3 {
    public static final /* synthetic */ int F1 = 0;
    public eg5 D1;
    public final Object E1 = a.b(LazyThreadSafetyMode.a, new i30(this, 12));

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        boolean zQ;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase("MovieHomeFragment_" + this.H0)) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_MYKET_UPDATE".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("mus_update_clientDialogMain");
                clickEventBuilder.a();
                FragmentActivity fragmentActivityF = F();
                String strF = k2().d.f(lu7.x, "myket://details?id=ir.mservices.market");
                if (strF != null) {
                    Uri uri = Uri.parse(strF);
                    js3.o(uri, "parse(...)");
                    zQ = js8.q(fragmentActivityF, uri, NearbyRepository.SERVICE_ID, null);
                } else {
                    zQ = false;
                }
                if (zQ) {
                    return;
                }
                hh2.H(new hh2(F(), M(rs6.market_is_not_installed, L(rs6.market_name))));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_movie_home);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", "");
        bundle.putString("sourceType", CommonDataKt.MOVIE_TYPE_MOVIE);
        bundle.putBoolean("BUNDLE_KEY_OPEN_STATE", false);
        searchFragment.u0(bundle);
        return searchFragment;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final String U1() {
        String string = K().getString(rs6.search_movie_hint);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean W1(int i) {
        return i == 2;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final yq2 Y1() {
        return r40.g;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
        actionBarEventBuilder.b("action_bar_movie_dynamic_btn");
        actionBarEventBuilder.a();
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
        dw1.y("search_box_movie");
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
        dw1.y("search_speech_Movie");
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final String f2() {
        return "main";
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final boolean h2() {
        return true;
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final boolean i2() {
        return true;
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment, ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        if (this.w1 != null) {
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieHomeFragment$onViewCreated$2(this, null));
        } else {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
    }

    public final eg5 k2() {
        eg5 eg5Var = this.D1;
        if (eg5Var != null) {
            return eg5Var;
        }
        js3.V("myketUpdateManager");
        throw null;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        super.l0(bundle);
        lu7 lu7Var = this.w1;
        if (lu7Var == null) {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
        boolean zB = lu7Var.b(lu7.y, false);
        if (((Boolean) S1().B.a.getValue()).booleanValue() || zB || k2().j() <= 0) {
            return;
        }
        k2().k();
    }

    public final void onEvent(dg5 dg5Var) {
        js3.p(dg5Var, "event");
        if (k2().j() <= 0) {
            lw.g(null, "Received event (OnMyketUpdateAvailable) but server version older than current version!", null);
            return;
        }
        lu7 lu7Var = this.w1;
        if (lu7Var == null) {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
        boolean zB = lu7Var.b(lu7.y, false);
        if (((Boolean) S1().B.a.getValue()).booleanValue() || zB) {
            return;
        }
        k2().k();
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_m), 0, 0, 0, v1(), false, this.F0.f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, 0, 0, ((sq4) this.E1.getValue()).g.a.getValue() != null ? K().getDimensionPixelSize(pq6.space_84) : 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int w1() {
        return sj8.b().j;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int x1() {
        return sj8.b().k;
    }
}
