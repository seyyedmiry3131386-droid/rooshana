package ir.mservices.market.movie.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import defpackage.bi5;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.p40;
import defpackage.rl3;
import defpackage.rr6;
import defpackage.wi7;
import defpackage.yw6;
import ir.mservices.market.movie.ui.search.result.MovieSearchRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchMovieFragment extends Hilt_SearchMovieFragment {
    public final bi5 M0 = new bi5(g27.a(wi7.class), new yw6(12, this));

    @Override // androidx.fragment.app.d
    public final void T(Bundle bundle) {
        this.H = true;
        d dVarF = G().F(rr6.content);
        if (dVarF instanceof MovieSearchRecyclerListFragment) {
            ((MovieSearchRecyclerListFragment) dVarF).l(true);
            return;
        }
        bi5 bi5Var = this.M0;
        MovieSearchRecyclerListFragment movieSearchRecyclerListFragmentA = rl3.A(((wi7) bi5Var.getValue()).a, ((wi7) bi5Var.getValue()).b, "MOVIE_movie");
        movieSearchRecyclerListFragmentA.l(true);
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(rr6.content, movieSearchRecyclerListFragmentA, null);
        p40Var.e();
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        return layoutInflater.inflate(js6.content_fragment, viewGroup, false);
    }
}
