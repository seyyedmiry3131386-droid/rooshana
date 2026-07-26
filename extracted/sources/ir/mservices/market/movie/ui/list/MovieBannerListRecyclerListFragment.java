package ir.mservices.market.movie.ui.list;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.recyclerview.widget.h;
import defpackage.a05;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.de;
import defpackage.ds6;
import defpackage.dy4;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.ms6;
import defpackage.o79;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qa3;
import defpackage.qs3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.wh7;
import defpackage.x79;
import defpackage.xf5;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public class MovieBannerListRecyclerListFragment extends Hilt_MovieBannerListRecyclerListFragment {
    public static final /* synthetic */ int m1 = 0;
    public xf5 i1;
    public qa3 j1;
    public final bi5 k1 = new bi5(g27.a(a05.class), new de(29, this));
    public final o79 l1;

    public MovieBannerListRecyclerListFragment() {
        final MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$1 movieBannerListRecyclerListFragment$special$$inlined$viewModels$default$1 = new MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieBannerListRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l1 = new o79(g27.a(MovieBannerListViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_movie_banner_more);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String headerTitle;
        HomeMovieBannerListDto homeMovieBannerListDto = ((a05) this.k1.getValue()).a;
        if (homeMovieBannerListDto == null || (headerTitle = homeMovieBannerListDto.getHeaderTitle()) == null) {
            return "";
        }
        if (f88.n0(headerTitle)) {
            headerTitle = null;
        }
        return headerTitle == null ? "" : headerTitle;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        if (((a05) this.k1.getValue()).b) {
            menuInflater.inflate(ms6.list_search, menu);
            MenuItem menuItemFindItem = menu.findItem(rr6.action_search);
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            }
            xf5 xf5Var = this.i1;
            if (xf5Var == null) {
                js3.V("myketUIUtils");
                throw null;
            }
            xf5.j(xf5Var, this, menuItemFindItem);
        }
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("list_search");
            actionBarEventBuilder.a();
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("movie_list_search_banner_list");
            actionBarEventBuilder2.a();
            pk5.g(this.J0, new NavIntentDirections.MovieSearch(new wh7("", "BannerList")), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        dy4 dy4Var = new dy4(v1(), t61.e(K(), pq6.margin_default_v2, 2, t61.e(K(), pq6.recycler_view_horizontal_padding, 2, p3.g(F()).a) / v1()), 1);
        dy4Var.n = new qs3(13, this);
        return dy4Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (MovieBannerListViewModel) this.l1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, 0, K().getDimensionPixelSize(pq6.margin_default_v2), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.margin_default_v2_double);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding);
        int dimensionPixelSize3 = K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding);
        if (this.F0.f()) {
            dimensionPixelSize2 -= K().getDimensionPixelSize(pq6.margin_default_v2);
        } else {
            dimensionPixelSize3 -= K().getDimensionPixelSize(pq6.margin_default_v2);
        }
        return new PaddingLayoutManager$Padding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.movie_banner_list_item);
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
