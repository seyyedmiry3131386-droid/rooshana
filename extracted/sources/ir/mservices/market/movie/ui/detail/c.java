package ir.mservices.market.movie.ui.detail;

import android.content.Context;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.d15;
import defpackage.f57;
import defpackage.f88;
import defpackage.g51;
import defpackage.gd2;
import defpackage.js3;
import defpackage.na7;
import defpackage.pq6;
import defpackage.s15;
import defpackage.tx8;
import defpackage.uv1;
import defpackage.v15;
import defpackage.z15;
import defpackage.ze2;
import defpackage.zk8;
import ir.mservices.market.movie.data.webapi.BookmarkInfo;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import ir.mservices.market.movie.ui.detail.recycler.MovieTabData;
import ir.mservices.market.movie.ui.detail.recycler.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ze2 {
    public final /* synthetic */ MovieDetailRecyclerListFragment a;

    public c(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment) {
        this.a = movieDetailRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        String buttonAction;
        MovieFullDto movieFullDto = (MovieFullDto) obj;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.a;
        e eVar = movieDetailRecyclerListFragment.B1;
        if (eVar == null) {
            js3.V("movieTabViewHolder");
            throw null;
        }
        eVar.t(new MovieTabData(movieDetailRecyclerListFragment.X1().D0, movieDetailRecyclerListFragment.X1().E0, movieDetailRecyclerListFragment.X1().Q));
        boolean z = movieDetailRecyclerListFragment.Z1().c;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!z) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            movieDetailRecyclerListFragment.q1 = new v15(movieDetailRecyclerListFragment.Z1().a, movieDetailRecyclerListFragment.Z1().b, false, movieDetailRecyclerListFragment.Z1().d, movieDetailRecyclerListFragment.Z1().e);
            String playId = movieFullDto.getPlayId();
            if ((playId != null && !f88.n0(playId)) || ((buttonAction = movieFullDto.getButtonAction()) != null && !f88.n0(buttonAction))) {
                movieDetailRecyclerListFragment.g2(movieFullDto.getPlayId(), movieFullDto.getButtonAction());
                movieDetailRecyclerListFragment.i2();
            }
        }
        movieDetailRecyclerListFragment.a2();
        ir.mservices.market.version2.core.utils.a.c(movieDetailRecyclerListFragment, 200L, new MovieDetailRecyclerListFragment$fillMovieFullDto$3(movieDetailRecyclerListFragment, null));
        if (!movieDetailRecyclerListFragment.d2()) {
            d15 d15Var = movieDetailRecyclerListFragment.s1;
            if (d15Var == null) {
                js3.V("collapseBinding");
                throw null;
            }
            ImageView imageView = d15Var.v;
            imageView.setAdjustViewBounds(false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                TypedValue typedValue = new TypedValue();
                imageView.getResources().getValue(pq6.movie_detail_banner_height_percent, typedValue, true);
                d15 d15Var2 = movieDetailRecyclerListFragment.s1;
                if (d15Var2 == null) {
                    js3.V("collapseBinding");
                    throw null;
                }
                d15Var2.w.measure(0, 0);
                if (movieDetailRecyclerListFragment.s1 == null) {
                    js3.V("collapseBinding");
                    throw null;
                }
                marginLayoutParams.height = (int) (typedValue.getFloat() * r0.w.getMeasuredHeight());
            }
        }
        MenuItem menuItem = movieDetailRecyclerListFragment.p1;
        if (menuItem == null) {
            js3.V("shareMenuItem");
            throw null;
        }
        menuItem.setVisible(movieFullDto.getShareModel() != null);
        BookmarkInfo bookmarkInfo = movieFullDto.getBookmarkInfo();
        MovieDetailRecyclerListFragment.T1(movieDetailRecyclerListFragment, bookmarkInfo != null && bookmarkInfo.isBookmarked());
        z15 z15Var = movieDetailRecyclerListFragment.A1;
        js3.m(z15Var);
        ImageView imageView2 = z15Var.v;
        if (imageView2 != null) {
            Context context = imageView2.getContext();
            js3.o(context, "getContext(...)");
            ((f57) zk8.O(context, movieFullDto.getPosterUrl()).W(uv1.b()).J(new gd2(), new na7(imageView2.getResources().getDimensionPixelSize(pq6.space_8)))).P(imageView2);
            imageView2.setOnClickListener(new s15(movieDetailRecyclerListFragment, 2));
        }
        return tx8.a;
    }
}
