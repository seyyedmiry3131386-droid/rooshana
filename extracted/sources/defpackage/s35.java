package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class s35 extends qg5 {
    public final int A;
    public final int B;
    public final int w;
    public og5 x;
    public final d y;
    public g05 z;

    public s35(int i, View view) {
        super(view);
        this.w = i;
        this.y = (d) ((w91) qg5.r()).A0.get();
        int dimensionPixelSize = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
        this.A = dimensionPixelSize;
        this.B = (int) (((double) dimensionPixelSize) * 1.5d);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProgressBar progressBar;
        int i;
        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) myketRecyclerData;
        js3.p(movieHomeMovieData, "data");
        MovieDto movieDto = movieHomeMovieData.a;
        g05 g05Var = this.z;
        if (g05Var == null) {
            js3.V("binding");
            throw null;
        }
        MovieLabelView movieLabelView = g05Var.x;
        MovieWatchProgressBackgroundView movieWatchProgressBackgroundView = g05Var.D;
        ScreenshotView screenshotView = g05Var.y;
        MyketTextView myketTextView = g05Var.z;
        MyketTextView myketTextView2 = g05Var.B;
        FrameLayout frameLayout = g05Var.v;
        ProgressBar progressBar2 = g05Var.C;
        js3.o(frameLayout, "clickableLayout");
        uy6.q(frameLayout, 0, null, 3);
        boolean zIsEmpty = movieDto.isEmpty();
        int i2 = this.w;
        View view = this.a;
        if (zIsEmpty) {
            frameLayout.setVisibility(4);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer num = movieHomeMovieData.c;
            layoutParams.width = i2 * (num != null ? num.intValue() : 1);
            progressBar = progressBar2;
            i = 0;
        } else {
            frameLayout.setVisibility(0);
            view.getLayoutParams().width = i2;
            progressBar2.setProgress(0);
            progressBar2.setVisibility(8);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
            g05Var.A.setVisibility(8);
            int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
            float f = dimensionPixelSize2;
            screenshotView.setElevation(f);
            movieWatchProgressBackgroundView.setBackgroundRadius(dimensionPixelSize);
            float f2 = f + 1;
            movieWatchProgressBackgroundView.setElevation(f2);
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            progressBar2.setProgressDrawable(ml9.r(context));
            progressBar2.setElevation(f2);
            movieLabelView.setElevation(f2);
            screenshotView.setOutlineProvider(new r45(dimensionPixelSize2, dimensionPixelSize));
            progressBar = progressBar2;
            i = 0;
            ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
            screenshotView.setSize(this.A, this.B);
            screenshotView.setOnLoad(new vt(movieHomeMovieData, g05Var, this, 16));
            screenshotView.c("", movieDto.getPosterUrl());
            qg5.v(frameLayout, this.x, this, movieHomeMovieData);
            myketTextView2.setLines(movieHomeMovieData.d);
            myketTextView2.setText(movieDto.getTitle());
            myketTextView.setTextColor(sj8.b().n);
            myketTextView.setText(movieDto.getSecondaryTitle());
            Object obj = lw8.b;
            String str = movieHomeMovieData.b;
            int color = sj8.b().m;
            try {
                color = Color.parseColor(str);
            } catch (Exception unused) {
            }
            myketTextView2.setTextColor(color);
            String secondaryTitle = movieDto.getSecondaryTitle();
            myketTextView.setVisibility((secondaryTitle == null || f88.n0(secondaryTitle) || !movieHomeMovieData.e) ? 8 : 0);
            movieLabelView.setData(movieDto.getLabel());
        }
        d dVar = this.y;
        if (dVar == null) {
            js3.V("movieProgressManager");
            throw null;
        }
        x45 x45VarA = dVar.a(movieDto.getId());
        js3.o(movieWatchProgressBackgroundView, "watchProgressBackground");
        boolean z = x45VarA instanceof w45;
        movieWatchProgressBackgroundView.setVisibility(z ? i : 8);
        progressBar.setProgress(x45VarA.a());
        progressBar.setVisibility(z ? i : 8);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g05) {
            this.z = (g05) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
