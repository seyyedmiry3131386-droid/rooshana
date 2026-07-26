package ir.mservices.market.social.profile.list.movie.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.profile.list.data.SocialMessagingDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMovieListDto implements Serializable {

    @vo7("isLiked")
    private final boolean isLiked;

    @vo7("key")
    private final String key;

    @vo7("likeCount")
    private final String likeCount;

    @vo7("messaging")
    private final SocialMessagingDto messaging;

    @vo7("movies")
    private final List<MovieDto> movies;

    @vo7("title")
    private final String title;

    public ProfileMovieListDto(String str, String str2, List<MovieDto> list, SocialMessagingDto socialMessagingDto, String str3, boolean z) {
        js3.p(str, "title");
        js3.p(str2, "key");
        js3.p(list, "movies");
        js3.p(str3, "likeCount");
        this.title = str;
        this.key = str2;
        this.movies = list;
        this.messaging = socialMessagingDto;
        this.likeCount = str3;
        this.isLiked = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileMovieListDto)) {
            return false;
        }
        ProfileMovieListDto profileMovieListDto = (ProfileMovieListDto) obj;
        return js3.i(this.title, profileMovieListDto.title) && js3.i(this.key, profileMovieListDto.key) && js3.i(this.movies, profileMovieListDto.movies);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLikeCount() {
        return this.likeCount;
    }

    public final SocialMessagingDto getMessaging() {
        return this.messaging;
    }

    public final List<MovieDto> getMovies() {
        return this.movies;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.movies.hashCode() + rm7.k(this.key, this.title.hashCode() * 31, 31);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public /* synthetic */ ProfileMovieListDto(String str, String str2, List list, SocialMessagingDto socialMessagingDto, String str3, boolean z, int i, yd1 yd1Var) {
        this(str, str2, list, socialMessagingDto, (i & 16) != 0 ? "0" : str3, (i & 32) != 0 ? false : z);
    }
}
