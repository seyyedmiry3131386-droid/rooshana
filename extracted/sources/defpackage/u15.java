package defpackage;

import android.content.Context;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.views.BigMovieOvalButton;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class u15 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    public /* synthetic */ u15(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, int i) {
        this.a = i;
        this.b = movieDetailRecyclerListFragment;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [c24, java.lang.Object] */
    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                MovieFullDto movieFullDto = (MovieFullDto) obj;
                String playId = movieFullDto.getPlayId();
                String buttonAction = movieFullDto.getButtonAction();
                int i2 = MovieDetailRecyclerListFragment.H1;
                movieDetailRecyclerListFragment.g2(playId, buttonAction);
                return tx8Var;
            case 1:
                MyketProgressState myketProgressStateQ1 = MovieDetailRecyclerListFragment.Q1(movieDetailRecyclerListFragment, (Pair) obj, (dq4) ((sq4) movieDetailRecyclerListFragment.n1.getValue()).e.a.getValue());
                d25 d25Var = movieDetailRecyclerListFragment.r1;
                if (d25Var == null) {
                    js3.V("toolbarBinding");
                    throw null;
                }
                d25Var.w.setState(myketProgressStateQ1);
                z15 z15Var = movieDetailRecyclerListFragment.A1;
                js3.m(z15Var);
                BigMovieOvalButton bigMovieOvalButton = z15Var.x;
                if (bigMovieOvalButton != null) {
                    bigMovieOvalButton.setState(myketProgressStateQ1);
                }
                return tx8Var;
            default:
                n99 n99Var = (n99) obj;
                int i3 = MovieDetailRecyclerListFragment.H1;
                movieDetailRecyclerListFragment.F0();
                if (n99Var instanceof l99) {
                    Context contextH = movieDetailRecyclerListFragment.H();
                    Boolean bool = (Boolean) ((l99) n99Var).a;
                    hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(bool.booleanValue() ? rs6.toast_add_bookmark : rs6.toast_remove_bookmark) : null);
                    hh2Var.F(qs6.bookmark_toast);
                    hh2.H(hh2Var);
                    MovieDetailRecyclerListFragment.T1(movieDetailRecyclerListFragment, bool.booleanValue());
                } else if (n99Var instanceof h99) {
                    ((h99) n99Var).a.assertToastMessage(movieDetailRecyclerListFragment.F());
                }
                return tx8Var;
        }
    }
}
