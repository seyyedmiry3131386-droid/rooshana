package ir.mservices.market.movie.uri;

import defpackage.at2;
import defpackage.bt2;
import defpackage.i30;
import defpackage.ja1;
import defpackage.js3;
import defpackage.mz3;
import defpackage.pv6;
import defpackage.pz3;
import defpackage.r79;
import defpackage.rv6;
import defpackage.vp7;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.mservices.market.viewModel.c;
import ir.myket.movie.common.domain.models.PlaySource;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieUriViewModel extends c implements pz3 {
    public final i A;
    public final pv6 B;
    public final i C;
    public final pv6 D;
    public final i E;
    public final pv6 F;
    public final i G;
    public final pv6 H;
    public final l I;
    public final rv6 J;
    public final i K;
    public final l L;
    public final rv6 M;
    public final i N;
    public final pv6 O;
    public boolean P;
    public boolean Q;
    public final vp7 t;
    public final r79 u;
    public final Object v;
    public final i w;
    public final pv6 x;
    public final i y;
    public final pv6 z;

    public MovieUriViewModel(vp7 vp7Var, r79 r79Var) {
        super(false);
        this.t = vp7Var;
        this.u = r79Var;
        this.v = a.b(LazyThreadSafetyMode.a, new i30(this, 16));
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.y = iVarE2;
        this.z = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.A = iVarE3;
        this.B = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.C = iVarE4;
        this.D = new pv6(iVarE4);
        i iVarE5 = vy2.e(0, 7, null);
        this.E = iVarE5;
        this.F = new pv6(iVarE5);
        i iVarE6 = vy2.e(0, 7, null);
        this.G = iVarE6;
        this.H = new pv6(iVarE6);
        l lVarB = ja1.b(null);
        this.I = lVarB;
        this.J = new rv6(lVarB);
        this.K = vy2.e(0, 7, null);
        l lVarB2 = ja1.b(null);
        this.L = lVarB2;
        this.M = new rv6(lVarB2);
        i iVarE7 = vy2.e(0, 7, null);
        this.N = iVarE7;
        this.O = new pv6(iVarE7);
    }

    public static void s(MovieUriViewModel movieUriViewModel, String str, String str2, String str3, PlayerMovieDto playerMovieDto, boolean z, List list, int i) {
        PlaySource[] playSourceArr = PlaySource.a;
        boolean z2 = (i & 128) == 0;
        movieUriViewModel.getClass();
        js3.p(str, "playId");
        if (z) {
            bt2.G(y97.G(movieUriViewModel), null, null, new MovieUriViewModel$getMovieUri$1(movieUriViewModel, null), 3);
            return;
        }
        if (movieUriViewModel.P) {
            return;
        }
        if (str2 != null) {
            l lVar = movieUriViewModel.I;
            Pair pair = new Pair(Boolean.TRUE, str2);
            lVar.getClass();
            lVar.p(null, pair);
        }
        bt2.G(y97.G(movieUriViewModel), null, null, new MovieUriViewModel$getMovieUri$2(movieUriViewModel, str, str3, playerMovieDto, list, z2, str2, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        this.P = false;
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    public final void r(String str, String str2, EpisodeDto episodeDto) {
        js3.p(str, "instanceId");
        js3.p(str2, "playId");
        if (this.Q) {
            return;
        }
        bt2.G(y97.G(this), null, null, new MovieUriViewModel$getDownloadInfo$1(this, str, str2, episodeDto, null), 3);
    }

    public final void t(RestrictionInfo restrictionInfo, RestrictionButton restrictionButton) {
        bt2.G(y97.G(this), null, null, new MovieUriViewModel$handlePlayerResult$1(restrictionButton, this, restrictionInfo, null), 3);
    }

    public final void u(RestrictionButton restrictionButton, PlayerMovieData playerMovieData) {
        String str;
        if (restrictionButton == null || (str = restrictionButton.b) == null) {
            str = "";
        }
        bt2.G(y97.G(this), null, null, new MovieUriViewModel$restrictionButtonClicked$1(str, this, playerMovieData, null), 3);
    }
}
