package defpackage;

import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.recycler.MovieSearchHomeMoviesRowData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.mservices.market.views.AlphaAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class p65 extends a {
    public hi7 K;
    public lw8 L;
    public f65 M;
    public b53 N;

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new o65(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        View view = this.a;
        return view.getResources().getDimensionPixelSize(pq6.recycler_view_horizontal_padding) - view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieSearchHomeMoviesRowData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.search_movie_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        MovieSearchHomeMoviesRowData movieSearchHomeMoviesRowData = (MovieSearchHomeMoviesRowData) nestedRecyclerData;
        js3.p(movieSearchHomeMoviesRowData, "data");
        super.s(movieSearchHomeMoviesRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.MovieSearchMoviesHorizontalListDataAdapter");
        ((o65) l06Var).m = new qs3(16, this);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t(MovieSearchHomeMoviesRowData movieSearchHomeMoviesRowData) {
        js3.p(movieSearchHomeMoviesRowData, "data");
        String str = movieSearchHomeMoviesRowData.g;
        super.t(movieSearchHomeMoviesRowData);
        b53 b53Var = this.N;
        if (b53Var == null) {
            js3.V("binding");
            throw null;
        }
        b53Var.z.setVisibility(8);
        b53 b53Var2 = this.N;
        if (b53Var2 == null) {
            js3.V("binding");
            throw null;
        }
        b53Var2.y.setText(str);
        b53 b53Var3 = this.N;
        if (b53Var3 == null) {
            js3.V("binding");
            throw null;
        }
        b53Var3.y.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
        b53 b53Var4 = this.N;
        if (b53Var4 == null) {
            js3.V("binding");
            throw null;
        }
        b53Var4.y.setTextColor(sj8.b().m);
        b53 b53Var5 = this.N;
        if (b53Var5 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = b53Var5.w;
        View view = this.a;
        constraintLayout.setPadding(view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer), view.getResources().getDimensionPixelSize(pq6.margin_default_v2_triple), view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer), view.getResources().getDimensionPixelSize(pq6.space_m));
        b53 b53Var6 = this.N;
        if (b53Var6 == null) {
            js3.V("binding");
            throw null;
        }
        AlphaAnimationView alphaAnimationView = b53Var6.x;
        js3.o(alphaAnimationView, "headerShimmer");
        alphaAnimationView.setVisibility(8);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieSearchHomeMoviesRowData movieSearchHomeMoviesRowData = (MovieSearchHomeMoviesRowData) myketRecyclerData;
        js3.p(movieSearchHomeMoviesRowData, "data");
        super.s(movieSearchHomeMoviesRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.MovieSearchMoviesHorizontalListDataAdapter");
        ((o65) l06Var).m = new qs3(16, this);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof b53) {
            this.N = (b53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
