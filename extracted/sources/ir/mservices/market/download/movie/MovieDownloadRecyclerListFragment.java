package ir.mservices.market.download.movie;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cd;
import defpackage.d16;
import defpackage.g27;
import defpackage.ga4;
import defpackage.hk3;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.jx2;
import defpackage.k68;
import defpackage.lm;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment;
import ir.mservices.market.download.movie.recycler.MovieDownloadData;
import ir.mservices.market.download.movie.recycler.a;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.movie.download.core.DownloadAction;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.TryAgainView;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadRecyclerListFragment extends Hilt_MovieDownloadRecyclerListFragment {
    public static final /* synthetic */ int l1 = 0;
    public k68 i1;
    public final o79 j1;
    public final o79 k1;

    public MovieDownloadRecyclerListFragment() {
        final hk3 hk3Var = new hk3(17, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) hk3Var.invoke();
            }
        });
        this.j1 = new o79(g27.a(MovieRecentDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$3
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
        final MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$5 movieDownloadRecyclerListFragment$special$$inlined$viewModels$default$5 = new MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$5(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieDownloadRecyclerListFragment$special$$inlined$viewModels$default$5.invoke();
            }
        });
        this.k1 = new o79(g27.a(MovieDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$9
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
        }, new bp2() { // from class: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$special$$inlined$viewModels$default$8
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
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        return "";
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean D0() {
        return false;
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
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_downloads);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.any_movies_title);
        TextView textView = (TextView) view.findViewById(rr6.empty_message);
        textView.setVisibility(0);
        textView.setText(rs6.any_apps_txt);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void L1(ja4 ja4Var) {
        TryAgainView tryAgainViewC1;
        js3.p(ja4Var, "state");
        super.L1(ja4Var);
        if ((ja4Var instanceof ga4) && (tryAgainViewC1 = C1()) != null) {
            if (((MyketPagingError) ((ga4) ja4Var).b).a.getCode() == 2) {
                tryAgainViewC1.setSettingTextResource(rs6.open_downloads_folder);
                tryAgainViewC1.setOnSettingListener(new cd(14, this));
                return;
            }
            TryAgainView tryAgainViewC12 = C1();
            if (tryAgainViewC12 != null) {
                tryAgainViewC12.setSettingTextResource(rs6.settings);
                tryAgainViewC12.setOnSettingListener(new cd(18, this));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(1, 5);
        final int i = 0;
        lmVar.m = new og5(this) { // from class: l25
            public final /* synthetic */ MovieDownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        MovieDownloadData movieDownloadData = (MovieDownloadData) obj;
                        int i3 = MovieDownloadRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(movieDownloadData, "recyclerData");
                        MovieDownloadMetaData movieDownloadMetaData = movieDownloadData.a;
                        pk5.g(movieDownloadRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDownloadMetaData.l, movieDownloadMetaData.b, false, movieDownloadData.b, null)), -1);
                        break;
                    default:
                        MovieDownloadData movieDownloadData2 = (MovieDownloadData) obj;
                        int i4 = MovieDownloadRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(movieDownloadData2, "recyclerData");
                        MovieDownloadMetaData movieDownloadMetaData2 = movieDownloadData2.a;
                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) movieDownloadRecyclerListFragment.k1.getValue();
                        u25 u25Var = (u25) movieDownloadData2.e.a.getValue();
                        String str = movieDownloadMetaData2.a;
                        String str2 = movieDownloadMetaData2.b;
                        String str3 = movieDownloadMetaData2.j;
                        String str4 = movieDownloadMetaData2.i;
                        String str5 = movieDownloadMetaData2.g;
                        long j = movieDownloadMetaData2.h;
                        String str6 = movieDownloadMetaData2.e;
                        int i5 = movieDownloadMetaData2.f;
                        String str7 = movieDownloadMetaData2.c;
                        String str8 = movieDownloadMetaData2.d;
                        if (str8 == null) {
                            str8 = "";
                        }
                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str7, str8, str6, i5, str5, j, str4, str3, movieDownloadMetaData2.l)));
                        break;
                }
            }
        };
        final int i2 = 1;
        lmVar.n = new og5(this) { // from class: l25
            public final /* synthetic */ MovieDownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieDownloadData movieDownloadData = (MovieDownloadData) obj;
                        int i3 = MovieDownloadRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(movieDownloadData, "recyclerData");
                        MovieDownloadMetaData movieDownloadMetaData = movieDownloadData.a;
                        pk5.g(movieDownloadRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDownloadMetaData.l, movieDownloadMetaData.b, false, movieDownloadData.b, null)), -1);
                        break;
                    default:
                        MovieDownloadData movieDownloadData2 = (MovieDownloadData) obj;
                        int i4 = MovieDownloadRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(movieDownloadData2, "recyclerData");
                        MovieDownloadMetaData movieDownloadMetaData2 = movieDownloadData2.a;
                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) movieDownloadRecyclerListFragment.k1.getValue();
                        u25 u25Var = (u25) movieDownloadData2.e.a.getValue();
                        String str = movieDownloadMetaData2.a;
                        String str2 = movieDownloadMetaData2.b;
                        String str3 = movieDownloadMetaData2.j;
                        String str4 = movieDownloadMetaData2.i;
                        String str5 = movieDownloadMetaData2.g;
                        long j = movieDownloadMetaData2.h;
                        String str6 = movieDownloadMetaData2.e;
                        int i5 = movieDownloadMetaData2.f;
                        String str7 = movieDownloadMetaData2.c;
                        String str8 = movieDownloadMetaData2.d;
                        if (str8 == null) {
                            str8 = "";
                        }
                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str7, str8, str6, i5, str5, j, str4, str3, movieDownloadMetaData2.l)));
                        break;
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieDownloadRecyclerListFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieDownloadRecyclerListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieDownloadRecyclerListFragment$onViewCreated$3(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (MovieRecentDownloadViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_m), K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.horizontal_space_inner), K().getDimensionPixelSize(pq6.space_4), 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
