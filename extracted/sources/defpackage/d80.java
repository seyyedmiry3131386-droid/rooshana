package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.a;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.movie.ui.search.result.recycler.BaseMovieSearchMovieData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d80 extends qg5 {
    public final MovieWatchProgressBackgroundView A;
    public final MovieLabelView B;
    public final ScreenshotView C;
    public final MyketTextView D;
    public final MyketTextView E;
    public final MyketTextView F;
    public final ImageView G;
    public final og5 w;
    public d x;
    public final SeriesBackground y;
    public final ProgressBar z;

    public d80(View view, og5 og5Var) {
        super(view);
        this.w = og5Var;
        this.y = (SeriesBackground) view.findViewById(rr6.series_background);
        this.z = (ProgressBar) view.findViewById(rr6.watchProgress);
        this.A = (MovieWatchProgressBackgroundView) view.findViewById(rr6.watchProgressBackground);
        this.B = (MovieLabelView) view.findViewById(rr6.label);
        this.C = (ScreenshotView) view.findViewById(rr6.banner);
        this.D = (MyketTextView) view.findViewById(rr6.title);
        this.E = (MyketTextView) view.findViewById(rr6.secondary_title);
        this.F = (MyketTextView) view.findViewById(rr6.imdb_rate);
        this.G = (ImageView) view.findViewById(rr6.imdb_icon);
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(BaseMovieSearchMovieData baseMovieSearchMovieData) {
        int i;
        String imdbIconUrl;
        f57 f57VarH;
        js3.p(baseMovieSearchMovieData, "data");
        this.y.setVisibility(8);
        ProgressBar progressBar = this.z;
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_4);
        MovieWatchProgressBackgroundView movieWatchProgressBackgroundView = this.A;
        movieWatchProgressBackgroundView.setBackgroundRadius(dimensionPixelSize2);
        float f = dimensionPixelSize;
        float f2 = 1 + f;
        movieWatchProgressBackgroundView.setElevation(f2);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        progressBar.setProgressDrawable(ml9.r(context));
        progressBar.setElevation(f2);
        MovieLabelView movieLabelView = this.B;
        movieLabelView.setElevation(f2);
        View rootView = view.getRootView();
        js3.o(rootView, "getRootView(...)");
        qg5.v(rootView, this.w, this, baseMovieSearchMovieData);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.movie_search_poster_width);
        ScreenshotView screenshotView = this.C;
        screenshotView.setElevation(f);
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize, dimensionPixelSize2));
        screenshotView.setSize(dimensionPixelSize3, view.getResources().getDimensionPixelSize(pq6.movie_search_poster_height));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize2), null, 5, null);
        screenshotView.setOnLoad(new c80(baseMovieSearchMovieData, this, dimensionPixelSize3, 0));
        SearchMovieDto searchMovieDto = baseMovieSearchMovieData.a;
        screenshotView.c("", searchMovieDto.getPosterUrl());
        String title = searchMovieDto.getTitle();
        MyketTextView myketTextView = this.D;
        myketTextView.setText(title);
        myketTextView.setVisibility(f88.n0(searchMovieDto.getTitle()) ? 8 : 0);
        String secondaryTitle = searchMovieDto.getSecondaryTitle();
        MyketTextView myketTextView2 = this.E;
        myketTextView2.setText(secondaryTitle);
        String secondaryTitle2 = searchMovieDto.getSecondaryTitle();
        myketTextView2.setVisibility((secondaryTitle2 == null || secondaryTitle2.length() == 0) ? 8 : 0);
        MyketTextView myketTextView3 = this.F;
        js3.o(myketTextView3, "imdbRate");
        MyketTextView.setTextFromHtml$default(myketTextView3, searchMovieDto.getImdbRate(), 2, null, null, false, 28, null);
        String imdbRate = searchMovieDto.getImdbRate();
        myketTextView3.setVisibility((imdbRate == null || imdbRate.length() == 0) ? 8 : 0);
        String imdbRate2 = searchMovieDto.getImdbRate();
        ImageView imageView = this.G;
        if (imdbRate2 == null || imdbRate2.length() == 0 || (imdbIconUrl = searchMovieDto.getImdbIconUrl()) == null || imdbIconUrl.length() == 0) {
            s57 s57VarF = a.f(view);
            s57VarF.getClass();
            s57VarF.o(new q57(imageView));
            i = 8;
        } else {
            String imdbIconUrl2 = searchMovieDto.getImdbIconUrl();
            if (imdbIconUrl2 == null || f88.n0(imdbIconUrl2)) {
                lw.g(null, "url is empty", null);
                imdbIconUrl2 = "empty_url";
            }
            try {
                f57VarH = a.f(view).q(new ne5(imdbIconUrl2, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(imdbIconUrl2, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            f57 f57Var = (f57) f57VarH.m();
            js3.o(imageView, "imdbIcon");
            f57Var.Q(new av0(imageView, Integer.valueOf(sj8.b().n)), f57Var);
            i = 0;
        }
        imageView.setVisibility(i);
        movieLabelView.setData(searchMovieDto.getLabel());
        d dVar = this.x;
        if (dVar == null) {
            js3.V("movieProgressManager");
            throw null;
        }
        x45 x45VarA = dVar.a(searchMovieDto.getId());
        boolean z = x45VarA instanceof w45;
        movieWatchProgressBackgroundView.setVisibility(z ? 0 : 8);
        progressBar.setProgress(x45VarA.a());
        progressBar.setVisibility(z ? 0 : 8);
    }
}
