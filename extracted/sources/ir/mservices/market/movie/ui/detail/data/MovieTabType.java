package ir.mservices.market.movie.ui.detail.data;

import defpackage.a45;
import defpackage.br9;
import defpackage.g27;
import defpackage.i35;
import defpackage.j35;
import defpackage.k35;
import defpackage.p35;
import defpackage.q35;
import defpackage.r22;
import defpackage.r35;
import defpackage.rs6;
import defpackage.sl3;
import defpackage.u55;
import defpackage.v35;
import defpackage.y35;
import defpackage.y65;
import defpackage.yq6;
import defpackage.z35;
import ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData;
import ir.mservices.market.movie.ui.detail.recycler.MovieSeasonTitleData;
import ir.mservices.market.movie.ui.detail.recycler.c;
import ir.mservices.market.movie.ui.detail.review.MovieReviewTitleData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.movie.ui.home.recycler.a;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MovieTabType {
    public static final sl3 h;
    public static final MovieTabType i;
    public static final MovieTabType j;
    public static final MovieTabType k;
    public static final MovieTabType l;
    public static final MovieTabType m;
    public static final MovieTabType n;
    public static final MovieTabType o;
    public static final MovieTabType p;
    public static final /* synthetic */ MovieTabType[] q;
    public static final /* synthetic */ r22 r;
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final List e;
    public final List f;
    public final Boolean g;

    static {
        MovieTabType movieTabType = new MovieTabType("MOVIES_OVERVIEW", 0, 0, false, rs6.overview_movie_tab_item, yq6.ic_movie_description_tab, br9.B(g27.a(MovieHeaderData.class)), br9.B(g27.a(c.class)), null);
        i = movieTabType;
        MovieTabType movieTabType2 = new MovieTabType("MOVIES_SUGGESTION", 1, 1, false, rs6.suggestion_movie_tab_item, yq6.ic_movie_suggestion_tab, br9.C(g27.a(MovieHomeMoviesRowData.class), g27.a(MovieHomeReelsRowData.class), g27.a(MovieHomeBannersRowData.class)), br9.C(g27.a(a.class), g27.a(r35.class), g27.a(q35.class), g27.a(p35.class), g27.a(v35.class), g27.a(y35.class), g27.a(z35.class), g27.a(a45.class), g27.a(j35.class), g27.a(k35.class), g27.a(i35.class)), null);
        j = movieTabType2;
        MovieTabType movieTabType3 = new MovieTabType("MOVIES_RATE", 2, 2, false, rs6.review_movie_tab_item, yq6.ic_movie_review_tab, br9.B(g27.a(MovieReviewTitleData.class)), br9.B(g27.a(u55.class)), null);
        k = movieTabType3;
        MovieTabType movieTabType4 = new MovieTabType("SERIES_OVERVIEW", 3, 0, true, rs6.overview_movie_tab_item, yq6.ic_movie_description_tab, br9.B(g27.a(MovieHeaderData.class)), br9.B(g27.a(c.class)), null);
        l = movieTabType4;
        MovieTabType movieTabType5 = new MovieTabType("SERIES_EPISODE", 4, 1, true, rs6.episode_movie_tab_item, yq6.ic_movie_episode_tab, br9.B(g27.a(MovieSeasonTitleData.class)), br9.B(g27.a(y65.class)), Boolean.FALSE);
        m = movieTabType5;
        MovieTabType movieTabType6 = new MovieTabType("PODCAST_EPISODE", 5, 1, true, rs6.audio_episode_tab_item, yq6.ic_movie_episode_tab, br9.B(g27.a(MovieSeasonTitleData.class)), br9.B(g27.a(y65.class)), Boolean.TRUE);
        n = movieTabType6;
        MovieTabType movieTabType7 = new MovieTabType("SERIES_SUGGESTION", 6, 2, true, rs6.suggestion_movie_tab_item, yq6.ic_movie_suggestion_tab, br9.C(g27.a(MovieHomeMoviesRowData.class), g27.a(MovieHomeReelsRowData.class), g27.a(MovieHomeBannersRowData.class)), br9.C(g27.a(a.class), g27.a(r35.class), g27.a(q35.class), g27.a(p35.class), g27.a(v35.class), g27.a(y35.class), g27.a(z35.class), g27.a(a45.class), g27.a(j35.class), g27.a(k35.class), g27.a(i35.class)), null);
        o = movieTabType7;
        MovieTabType movieTabType8 = new MovieTabType("SERIES_RATE", 7, 3, true, rs6.review_movie_tab_item, yq6.ic_movie_review_tab, br9.B(g27.a(MovieReviewTitleData.class)), br9.B(g27.a(u55.class)), null);
        p = movieTabType8;
        MovieTabType[] movieTabTypeArr = {movieTabType, movieTabType2, movieTabType3, movieTabType4, movieTabType5, movieTabType6, movieTabType7, movieTabType8};
        q = movieTabTypeArr;
        r = kotlin.enums.a.a(movieTabTypeArr);
        h = new sl3(7);
    }

    public MovieTabType(String str, int i2, int i3, boolean z, int i4, int i5, List list, List list2, Boolean bool) {
        this.a = i3;
        this.b = z;
        this.c = i4;
        this.d = i5;
        this.e = list;
        this.f = list2;
        this.g = bool;
    }

    public static MovieTabType valueOf(String str) {
        return (MovieTabType) Enum.valueOf(MovieTabType.class, str);
    }

    public static MovieTabType[] values() {
        return (MovieTabType[]) q.clone();
    }
}
