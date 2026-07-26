package ir.mservices.market.app.home;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import defpackage.at2;
import defpackage.ba7;
import defpackage.dw1;
import defpackage.i30;
import defpackage.js3;
import defpackage.mz3;
import defpackage.pq6;
import defpackage.pz3;
import defpackage.rs6;
import defpackage.sq4;
import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.views.SearchView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class GameHomeFragment extends HomeFragment implements ba7, pz3 {
    public static final /* synthetic */ int A1 = 0;
    public final Object z1 = a.b(LazyThreadSafetyMode.a, new i30(this, 6));

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_main_game);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", "game");
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
        return i == 1;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return true;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
        actionBarEventBuilder.b("action_bar_game_dynamic_btn");
        actionBarEventBuilder.a();
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
        dw1.y("search_box_game");
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
        dw1.y("search_speech_game");
    }

    @Override // ir.mservices.market.app.home.HomeFragment
    public final String f2() {
        return HomeDto.GAME;
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
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new GameHomeFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        super.l0(bundle);
        SearchView searchView = this.l1;
        if (searchView != null) {
            searchView.setDynamicViewVisibility(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, 0, 0, ((sq4) this.z1.getValue()).g.a.getValue() != null ? K().getDimensionPixelSize(pq6.space_84) : 0);
    }
}
