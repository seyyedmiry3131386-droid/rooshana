package ir.mservices.market.movie.ui.detail.seasons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import defpackage.a75;
import defpackage.a79;
import defpackage.aw0;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.d25;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.ec9;
import defpackage.en0;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fn0;
import defpackage.g27;
import defpackage.is3;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lk2;
import defpackage.lm;
import defpackage.n15;
import defpackage.na7;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.r65;
import defpackage.r69;
import defpackage.r7;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.t65;
import defpackage.uv1;
import defpackage.w77;
import defpackage.x79;
import defpackage.z65;
import defpackage.zk8;
import defpackage.zl2;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.analytics.MovieClickEventBuilder;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketTextView;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSeasonsRecyclerListFragment extends Hilt_MovieSeasonsRecyclerListFragment {
    public static final /* synthetic */ int s1 = 0;
    public ec9 i1;
    public final bi5 j1 = new bi5(g27.a(a75.class), new n15(4, this));
    public final o79 k1;
    public final o79 l1;
    public final o79 m1;
    public lk2 n1;
    public d25 o1;
    public zl2 p1;
    public r65 q1;
    public t65 r1;

    public MovieSeasonsRecyclerListFragment() {
        final MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$1 movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$1 = new MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(MovieSeasonsViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$4
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
        final MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$6 movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$6 = new MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.l1 = new o79(g27.a(MovieUriViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        final MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$11 movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$11 = new MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$11(this);
        final c24 c24VarB3 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$11.invoke();
            }
        });
        this.m1 = new o79(g27.a(MovieDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB3.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$special$$inlined$viewModels$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        RestrictionInfo restrictionInfo;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_SHOW_SEASON".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                U1(bundle.getInt("BUNDLE_KEY_SELECTED_ITEM"));
                return;
            }
            if (!"DIALOG_KEY_CONFIRM_MOVIE_URI".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_CHOOSE_QUALITY".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a && (restrictionInfo = (RestrictionInfo) dt2.p(bundle, "MOVIE_RESTRICTION_INFO", RestrictionInfo.class)) != null) {
                    V1(restrictionInfo, true, null);
                    return;
                }
                return;
            }
            RestrictionInfo restrictionInfo2 = (RestrictionInfo) dt2.p(bundle2, "MOVIE_RESTRICTION_INFO", RestrictionInfo.class);
            bundle2.getBoolean("BUNDLE_KEY_IS_DOWNLOAD");
            PlayerMovieData playerMovieData = (PlayerMovieData) dt2.p(bundle2, "MOVIE_PLAYER_MOVIE_DATA", PlayerMovieData.class);
            DialogResult dialogResult = dialogDataModel.d;
            if (dialogResult == DialogResult.a) {
                MovieClickEventBuilder movieClickEventBuilder = new MovieClickEventBuilder();
                movieClickEventBuilder.b("seasons_play_restrict_series_buy");
                movieClickEventBuilder.a();
                S1().u(restrictionInfo2 != null ? restrictionInfo2.d : null, playerMovieData);
                return;
            }
            if (dialogResult == DialogResult.b) {
                if (!bundle.getBoolean("BUNDLE_KEY_CANCEL_TEXT")) {
                    MovieClickEventBuilder movieClickEventBuilder2 = new MovieClickEventBuilder();
                    movieClickEventBuilder2.b("seasons_play_restrict_series_cancel");
                    movieClickEventBuilder2.a();
                } else {
                    MovieClickEventBuilder movieClickEventBuilder3 = new MovieClickEventBuilder();
                    movieClickEventBuilder3.b("seasons_play_restrict_series_secondary");
                    movieClickEventBuilder3.a();
                    S1().u(restrictionInfo2 != null ? restrictionInfo2.e : null, playerMovieData);
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_movie_seasons);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void E1(aw0 aw0Var) {
        ir.mservices.market.version2.ui.recycler.adapter.a aVar;
        js3.p(aw0Var, "combinedLoadStates");
        super.E1(aw0Var);
        if (aw0Var.c.a && (aVar = this.Z0) != null && (!((ArrayList) aVar.D().d).isEmpty())) {
            U1(T1().b);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void N1(int i) {
        fn0 fn0Var = new fn0(this, (r69) H(), 2);
        fn0Var.a = i;
        k layoutManager = y1().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.E0(fn0Var);
        }
    }

    public final String Q1() {
        return dw1.n("MovieSeasonsRecyclerListFragment_", this.H0);
    }

    public final MovieSeasonsViewModel R1() {
        return (MovieSeasonsViewModel) this.k1.getValue();
    }

    public final MovieUriViewModel S1() {
        return (MovieUriViewModel) this.l1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        rn8 rn8Var = (rn8) F();
        if (rn8Var != null) {
            d25 d25Var = this.o1;
            if (d25Var == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            rn8Var.z(d25Var.l);
        }
        rn8 rn8Var2 = (rn8) F();
        if (rn8Var2 != null) {
            ((BaseContentActivity) rn8Var2).a0(sj8.b().N);
        }
    }

    public final a75 T1() {
        return (a75) this.j1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    public final void U1(int i) {
        k layoutManager = y1().getLayoutManager();
        js3.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iR0 = ((LinearLayoutManager) layoutManager).R0();
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.D().d).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                MyketRecyclerData myketRecyclerData = ((RecyclerItem) it.next()).c;
                MovieSeasonFixedTitleData movieSeasonFixedTitleData = myketRecyclerData instanceof MovieSeasonFixedTitleData ? (MovieSeasonFixedTitleData) myketRecyclerData : null;
                if (movieSeasonFixedTitleData != null && movieSeasonFixedTitleData.d == i) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (Math.abs(iIntValue - iR0) > 60) {
                    y1().k0(iIntValue);
                }
                ir.mservices.market.version2.core.utils.a.c(this, 100L, new MovieSeasonsRecyclerListFragment$scrollToSeason$3$1(this, iIntValue, null));
            }
        }
    }

    public final void V1(RestrictionInfo restrictionInfo, boolean z, PlayerMovieData playerMovieData) {
        ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
        viewEventBuilder.b("seasons_play_restrict_series_dialog");
        viewEventBuilder.a();
        pk5.g(this.J0, new NavIntentDirections.Restriction(new w77(new DialogDataModel(Q1(), "DIALOG_KEY_CONFIRM_MOVIE_URI", is3.g(new Pair("MOVIE_RESTRICTION_INFO", restrictionInfo), new Pair("BUNDLE_KEY_IS_DOWNLOAD", Boolean.valueOf(z)), new Pair("MOVIE_PLAYER_MOVIE_DATA", playerMovieData)), 8), restrictionInfo)), -1);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = d25.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        d25 d25Var = (d25) a79.f0(layoutInflaterFrom, js6.movie_detail_toolbar_view, null, false, null);
        js3.o(d25Var, "inflate(...)");
        this.o1 = d25Var;
        d25Var.z.setVisibility(8);
        d25 d25Var2 = this.o1;
        if (d25Var2 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var2.x.setVisibility(8);
        d25 d25Var3 = this.o1;
        if (d25Var3 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var3.w.setVisibility(8);
        d25 d25Var4 = this.o1;
        if (d25Var4 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var4.v.setVisibility(4);
        String str = T1().d.b;
        if (f88.n0(str)) {
            str = null;
        }
        if (str != null) {
            f57 f57VarW = ((f57) zk8.Q(this, str).G(new na7(K().getDimensionPixelSize(pq6.space_4)))).W(uv1.b());
            d25 d25Var5 = this.o1;
            if (d25Var5 == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            f57VarW.P(d25Var5.y);
        }
        d25 d25Var6 = this.o1;
        if (d25Var6 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var6.B.setText(T1().d.a);
        d25 d25Var7 = this.o1;
        if (d25Var7 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        MyketTextView myketTextView = d25Var7.A;
        js3.o(myketTextView, "subtitle");
        String str2 = T1().d.c;
        myketTextView.setVisibility((str2 == null || !(f88.n0(str2) ^ true)) ? 8 : 0);
        d25 d25Var8 = this.o1;
        if (d25Var8 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        MyketTextView myketTextView2 = d25Var8.A;
        js3.o(myketTextView2, "subtitle");
        MyketTextView.setTextFromHtml$default(myketTextView2, T1().d.c, 2, null, null, false, 28, null);
        int i2 = zl2.x;
        zl2 zl2Var = (zl2) fa1.c(layoutInflater, js6.fragment_movie_seasons, viewGroup, false);
        js3.o(zl2Var, "inflate(...)");
        this.p1 = zl2Var;
        int i3 = r65.z;
        r65 r65Var = (r65) fa1.c(layoutInflater, js6.movie_season_fixed_title, viewGroup, false);
        js3.o(r65Var, "inflate(...)");
        View view = r65Var.l;
        js3.o(view, "getRoot(...)");
        view.setVisibility(8);
        this.q1 = r65Var;
        zl2 zl2Var2 = this.p1;
        if (zl2Var2 == null) {
            js3.V("binding");
            throw null;
        }
        zl2Var2.v.addView(viewZ, new ViewGroup.LayoutParams(-1, -1));
        zl2 zl2Var3 = this.p1;
        if (zl2Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = zl2Var3.v;
        r65 r65Var2 = this.q1;
        if (r65Var2 == null) {
            js3.V("headerBinding");
            throw null;
        }
        constraintLayout.addView(r65Var2.l, new ViewGroup.LayoutParams(-1, -2));
        zl2 zl2Var4 = this.p1;
        if (zl2Var4 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = zl2Var4.l;
        js3.o(view2, "getRoot(...)");
        return view2;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        this.J0.x(Q1());
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 6);
        lmVar.m = new z65(this, 1);
        lmVar.n = new z65(this, 2);
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(Q1(), this);
        r65 r65Var = this.q1;
        if (r65Var == null) {
            js3.V("headerBinding");
            throw null;
        }
        View view2 = r65Var.l;
        js3.o(view2, "getRoot(...)");
        t65 t65Var = new t65(view2, new z65(this, 0));
        r65 r65Var2 = this.q1;
        if (r65Var2 == null) {
            js3.V("headerBinding");
            throw null;
        }
        t65Var.w(r65Var2);
        this.r1 = t65Var;
        r65 r65Var3 = this.q1;
        if (r65Var3 == null) {
            js3.V("headerBinding");
            throw null;
        }
        r65Var3.l.addOnLayoutChangeListener(new en0(1, this));
        this.n1 = (lk2) n0(new r7() { // from class: ir.mservices.market.movie.ui.detail.seasons.a
            @Override // defpackage.r7
            public final void g(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = MovieSeasonsRecyclerListFragment.s1;
                js3.p(activityResult, "it");
                if (activityResult.a == -1) {
                    MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = this.a;
                    androidx.lifecycle.b.a(movieSeasonsRecyclerListFragment).a(new MovieSeasonsRecyclerListFragment$onViewCreated$4$1(movieSeasonsRecyclerListFragment, activityResult, null));
                }
            }
        }, new s7(2));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$9(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$10(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$11(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$12(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$13(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$14(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$15(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$16(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieSeasonsRecyclerListFragment$onViewCreated$17(this, null));
        y1().j(new b(this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        r65 r65Var = this.q1;
        if (r65Var != null) {
            return new d16(r65Var.v.getHeight(), 0, 0, 0, 0, 0, v1(), false, this.F0.f());
        }
        js3.V("headerBinding");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.movie_detail_max_span);
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
