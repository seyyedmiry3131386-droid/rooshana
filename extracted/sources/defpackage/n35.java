package defpackage;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.app.search.result.ui.recycler.SearchScrollableScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.c;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.movie.streamers.StreamerProfileFragment;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.a;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryHorizontalTagsData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n35 extends uz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n35(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.uz6
    public final void b(RecyclerView recyclerView, int i, int i2) {
        View childAt;
        int i3 = this.a;
        int dimensionPixelSize = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                a aVar = (a) obj2;
                View view = aVar.a;
                boolean z = aVar.x;
                k layoutManager = recyclerView.getLayoutManager();
                MyketGridLayoutManager myketGridLayoutManager = layoutManager instanceof MyketGridLayoutManager ? (MyketGridLayoutManager) layoutManager : null;
                if (myketGridLayoutManager == null || myketGridLayoutManager.R0() != 0 || (childAt = recyclerView.getChildAt(0)) == null) {
                    return;
                }
                if (recyclerView.N(childAt).b() != 0) {
                    aVar.M().A.setAlpha(0.25f);
                    aVar.M().y.setTranslationX(25.0f * (z ? 1 : -1));
                    return;
                }
                if (z) {
                    if (aVar.U <= 0) {
                        aVar.U = childAt.getRight();
                    }
                    int right = childAt.getRight() - aVar.U;
                    if (right >= 0) {
                        dimensionPixelSize = right;
                    }
                } else if (childAt.getLeft() <= 0) {
                    dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + Math.abs(childAt.getLeft());
                }
                float f = dimensionPixelSize * 0.25f;
                float f2 = f / r11.a.getLayoutParams().width;
                View view2 = aVar.M().A;
                movieHomeMoviesRowData.q = f2;
                view2.setAlpha(f2);
                if (f <= view.getResources().getDimensionPixelSize(pq6.movie_holder_maximum_transition)) {
                    ImageView imageView = aVar.M().y;
                    float f3 = f * (z ? 1 : -1);
                    movieHomeMoviesRowData.r = f3;
                    imageView.setTranslationX(f3);
                    return;
                }
                return;
            case 1:
                SearchScrollableScreenshotAppData searchScrollableScreenshotAppData = (SearchScrollableScreenshotAppData) obj;
                d04 d04Var = ((c) obj2).I;
                if (d04Var != null) {
                    searchScrollableScreenshotAppData.m = d04Var.f() ? Math.abs(searchScrollableScreenshotAppData.m - i) : searchScrollableScreenshotAppData.m + i;
                    return;
                } else {
                    js3.V("languageHelper");
                    throw null;
                }
            case 2:
                SearchHistoryHorizontalTagsData searchHistoryHorizontalTagsData = (SearchHistoryHorizontalTagsData) obj2;
                searchHistoryHorizontalTagsData.g = ((ir.mservices.market.search.history.ui.recycler.a) obj).x ? Math.abs(searchHistoryHorizontalTagsData.g - i) : searchHistoryHorizontalTagsData.g + i;
                return;
            default:
                int[] iArr = (int[]) obj2;
                StreamerProfileFragment streamerProfileFragment = (StreamerProfileFragment) obj;
                View childAt2 = recyclerView.getChildAt(0);
                if (childAt2 == null) {
                    return;
                }
                recyclerView.getLocationOnScreen(iArr);
                o oVarN = recyclerView.N(childAt2);
                int iT = 255;
                if (oVarN instanceof t68) {
                    int bottom = childAt2.getBottom() - (childAt2.getHeight() / 2);
                    int i4 = iArr[1] + bottom;
                    d78 d78Var = streamerProfileFragment.l1;
                    if (d78Var == null) {
                        js3.V("collapseBinding");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = d78Var.x.getLayoutParams();
                    js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                    StreamerProfileFragment.Q1(streamerProfileFragment, false);
                    if (streamerProfileFragment.o1 == -1) {
                        int[] iArr2 = {0, 0};
                        streamerProfileFragment.y1().getLocationOnScreen(iArr2);
                        streamerProfileFragment.o1 = streamerProfileFragment.R1() - iArr2[1];
                    }
                    d78 d78Var2 = streamerProfileFragment.l1;
                    if (d78Var2 == null) {
                        js3.V("collapseBinding");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = d78Var2.x.getLayoutParams();
                    js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    if (((ViewGroup.MarginLayoutParams) layoutParams2).topMargin <= iArr[1]) {
                        streamerProfileFragment.p1 = true;
                    } else {
                        streamerProfileFragment.p1 = false;
                        iT = ok4.t(255 - ((bottom * 255) / streamerProfileFragment.o1), 0, 255);
                    }
                } else if (oVarN instanceof ir.mservices.market.movie.streamers.recycler.a) {
                    StreamerProfileFragment.Q1(streamerProfileFragment, false);
                    d78 d78Var3 = streamerProfileFragment.l1;
                    if (d78Var3 == null) {
                        js3.V("collapseBinding");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = d78Var3.x.getLayoutParams();
                    js3.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                } else {
                    StreamerProfileFragment.Q1(streamerProfileFragment, true);
                    d78 d78Var4 = streamerProfileFragment.l1;
                    if (d78Var4 == null) {
                        js3.V("collapseBinding");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams4 = d78Var4.x.getLayoutParams();
                    js3.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
                }
                d78 d78Var5 = streamerProfileFragment.l1;
                if (d78Var5 == null) {
                    js3.V("collapseBinding");
                    throw null;
                }
                d78Var5.x.requestLayout();
                int color = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(iT & 255), Integer.valueOf(sj8.b().l & 16777215)}, 2)));
                j78 j78Var = streamerProfileFragment.m1;
                if (j78Var == null) {
                    js3.V("toolbarBinding");
                    throw null;
                }
                j78Var.l.setBackgroundColor(color);
                streamerProfileFragment.r1 = color;
                FragmentActivity fragmentActivityF = streamerProfileFragment.F();
                BaseNavigationContentActivity baseNavigationContentActivity = fragmentActivityF instanceof BaseNavigationContentActivity ? (BaseNavigationContentActivity) fragmentActivityF : null;
                if (baseNavigationContentActivity != null) {
                    ir.mservices.market.core.ext.a.i(baseNavigationContentActivity);
                }
                streamerProfileFragment.T1(iT);
                return;
        }
    }
}
