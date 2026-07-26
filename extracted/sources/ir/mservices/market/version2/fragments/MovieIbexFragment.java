package ir.mservices.market.version2.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.e45;
import defpackage.f45;
import defpackage.fh3;
import defpackage.g27;
import defpackage.js3;
import defpackage.n15;
import defpackage.w90;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.version2.activity.IbexActivity;
import ir.mservices.market.version2.activity.IbexData;
import ir.mservices.market.version2.fragments.MovieIbexFragment;
import ir.mservices.market.views.TrailerFinishedPlayingView;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieIbexFragment extends Hilt_MovieIbexFragment {
    public static final /* synthetic */ int x1 = 0;
    public e45 v1;
    public final bi5 w1 = new bi5(g27.a(f45.class), new n15(1, this));

    @Override // ir.mservices.market.version2.fragments.IbexFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        if (((Number) ((BaseMovieViewModel) this.Z0.getValue()).w.a.getValue()).intValue() != 2) {
            f();
        }
        super.T(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ir.mservices.market.version2.fragments.Hilt_MovieIbexFragment, ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        this.v1 = context instanceof e45 ? (e45) context : null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void g0() {
        super.g0();
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            fragmentActivityF.setRequestedOrientation(6);
        }
    }

    @Override // ir.mservices.market.version2.fragments.IbexFragment, ir.mservices.market.version2.fragments.BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        final int i = 0;
        fh3Var.A.setPlayButtonOnClickListener(new bp2(this) { // from class: d45
            public final /* synthetic */ MovieIbexFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ws5 ws5VarC;
                int i2 = i;
                tx8 tx8Var = tx8.a;
                MovieIbexFragment movieIbexFragment = this.b;
                switch (i2) {
                    case 0:
                        e45 e45Var = movieIbexFragment.v1;
                        if (e45Var != null) {
                            IbexActivity ibexActivity = (IbexActivity) e45Var;
                            ibexActivity.setResult(-1, new Intent().putExtra("BUNDLE_KEY_MOVIE_TRAILER_PLAY_MOVIE", true));
                            ibexActivity.c().b();
                        }
                        break;
                    default:
                        int i3 = MovieIbexFragment.x1;
                        FragmentActivity fragmentActivityF = movieIbexFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                        }
                        break;
                }
                return tx8Var;
            }
        });
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        final int i2 = 1;
        fh3Var2.A.setBackButtonOnClickListener(new bp2(this) { // from class: d45
            public final /* synthetic */ MovieIbexFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ws5 ws5VarC;
                int i22 = i2;
                tx8 tx8Var = tx8.a;
                MovieIbexFragment movieIbexFragment = this.b;
                switch (i22) {
                    case 0:
                        e45 e45Var = movieIbexFragment.v1;
                        if (e45Var != null) {
                            IbexActivity ibexActivity = (IbexActivity) e45Var;
                            ibexActivity.setResult(-1, new Intent().putExtra("BUNDLE_KEY_MOVIE_TRAILER_PLAY_MOVIE", true));
                            ibexActivity.c().b();
                        }
                        break;
                    default:
                        int i3 = MovieIbexFragment.x1;
                        FragmentActivity fragmentActivityF = movieIbexFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                        }
                        break;
                }
                return tx8Var;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.IbexFragment, androidx.fragment.app.d, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        js3.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        s1().d.z.setVisibility(8);
    }

    @Override // ir.mservices.market.version2.fragments.IbexFragment
    public final void u1(int i, boolean z) {
        IbexData ibexData;
        super.u1(i, z);
        if (i != 4 || (ibexData = ((f45) this.w1.getValue()).a) == null) {
            return;
        }
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        ConstraintLayout constraintLayout = fh3Var.x;
        js3.o(constraintLayout, "layout");
        constraintLayout.setVisibility(8);
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        TrailerFinishedPlayingView trailerFinishedPlayingView = fh3Var2.A;
        js3.o(trailerFinishedPlayingView, "trailerFinishedPlayingView");
        trailerFinishedPlayingView.setVisibility(0);
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        w90Var.z.setVisibility(8);
        ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
        viewEventBuilder.b("trailer_ending");
        viewEventBuilder.a();
        fh3 fh3Var3 = this.i1;
        js3.m(fh3Var3);
        fh3Var3.A.setData(ibexData);
    }
}
