package ir.mservices.market.movie.streamers.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.MovieDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerMoviesDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("movies")
    private final List<MovieDto> movies;

    public StreamerMoviesDto(List<MovieDto> list, boolean z) {
        js3.p(list, "movies");
        this.movies = list;
        this.eol = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamerMoviesDto copy$default(StreamerMoviesDto streamerMoviesDto, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamerMoviesDto.movies;
        }
        if ((i & 2) != 0) {
            z = streamerMoviesDto.eol;
        }
        return streamerMoviesDto.copy(list, z);
    }

    public final List<MovieDto> component1() {
        return this.movies;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final StreamerMoviesDto copy(List<MovieDto> list, boolean z) {
        js3.p(list, "movies");
        return new StreamerMoviesDto(list, z);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamerMoviesDto)) {
            return false;
        }
        StreamerMoviesDto streamerMoviesDto = (StreamerMoviesDto) obj;
        return js3.i(this.movies, streamerMoviesDto.movies) && this.eol == streamerMoviesDto.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<MovieDto> getMovies() {
        return this.movies;
    }

    public int hashCode() {
        return (this.movies.hashCode() * 31) + (this.eol ? 1231 : 1237);
    }

    public String toString() {
        return "StreamerMoviesDto(movies=" + this.movies + ", eol=" + this.eol + ")";
    }
}
