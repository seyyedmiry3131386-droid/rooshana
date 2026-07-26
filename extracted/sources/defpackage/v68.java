package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class v68 extends qg5 {
    public final og5 w;
    public final d x;
    public q93 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v68(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onMovieClickListener");
        this.w = og5Var;
        this.x = (d) ((w91) qg5.r()).A0.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        StreamerMovieData streamerMovieData = (StreamerMovieData) myketRecyclerData;
        js3.p(streamerMovieData, "data");
        MovieDto movieDto = streamerMovieData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_4);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.space_4);
        q93 q93Var = this.y;
        if (q93Var == null) {
            js3.V("binding");
            throw null;
        }
        ProgressBar progressBar = q93Var.A;
        MovieWatchProgressBackgroundView movieWatchProgressBackgroundView = q93Var.B;
        ConstraintLayout constraintLayout = q93Var.v;
        constraintLayout.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        q93Var.z.setText(movieDto.getTitle());
        q93Var.w.setText(movieDto.getSecondaryTitle());
        movieWatchProgressBackgroundView.setBackgroundRadius(dimensionPixelSize2);
        float f = dimensionPixelSize;
        float f2 = 1 + f;
        movieWatchProgressBackgroundView.setElevation(f2);
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        progressBar.setProgressDrawable(ml9.r(context));
        progressBar.setElevation(f2);
        ScreenshotView screenshotView = q93Var.x;
        screenshotView.setElevation(f);
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize, dimensionPixelSize2));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize2), null, 5, null);
        screenshotView.setOnLoad(new vt(streamerMovieData, q93Var, this, 22));
        screenshotView.c("", movieDto.getPosterUrl());
        qg5.v(constraintLayout, this.w, this, streamerMovieData);
        d dVar = this.x;
        if (dVar == null) {
            js3.V("movieProgressManager");
            throw null;
        }
        x45 x45VarA = dVar.a(movieDto.getId());
        boolean z = x45VarA instanceof w45;
        movieWatchProgressBackgroundView.setVisibility(z ? 0 : 8);
        progressBar.setProgress(x45VarA.a());
        progressBar.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q93) {
            this.y = (q93) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
