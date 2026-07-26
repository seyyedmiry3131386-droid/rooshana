package ir.mservices.market.download.movie.data;

import defpackage.j25;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadInfoData {
    private final j25 movieDownloadInfo;
    private final MovieInfoDto movieInfoDto;

    public MovieDownloadInfoData(j25 j25Var, MovieInfoDto movieInfoDto) {
        js3.p(j25Var, "movieDownloadInfo");
        js3.p(movieInfoDto, "movieInfoDto");
        this.movieDownloadInfo = j25Var;
        this.movieInfoDto = movieInfoDto;
    }

    public static /* synthetic */ MovieDownloadInfoData copy$default(MovieDownloadInfoData movieDownloadInfoData, j25 j25Var, MovieInfoDto movieInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            j25Var = movieDownloadInfoData.movieDownloadInfo;
        }
        if ((i & 2) != 0) {
            movieInfoDto = movieDownloadInfoData.movieInfoDto;
        }
        return movieDownloadInfoData.copy(j25Var, movieInfoDto);
    }

    public final j25 component1() {
        return this.movieDownloadInfo;
    }

    public final MovieInfoDto component2() {
        return this.movieInfoDto;
    }

    public final MovieDownloadInfoData copy(j25 j25Var, MovieInfoDto movieInfoDto) {
        js3.p(j25Var, "movieDownloadInfo");
        js3.p(movieInfoDto, "movieInfoDto");
        return new MovieDownloadInfoData(j25Var, movieInfoDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieDownloadInfoData)) {
            return false;
        }
        MovieDownloadInfoData movieDownloadInfoData = (MovieDownloadInfoData) obj;
        return js3.i(this.movieDownloadInfo, movieDownloadInfoData.movieDownloadInfo) && js3.i(this.movieInfoDto, movieDownloadInfoData.movieInfoDto);
    }

    public final j25 getMovieDownloadInfo() {
        return this.movieDownloadInfo;
    }

    public final MovieInfoDto getMovieInfoDto() {
        return this.movieInfoDto;
    }

    public int hashCode() {
        return this.movieInfoDto.hashCode() + (this.movieDownloadInfo.hashCode() * 31);
    }

    public String toString() {
        return "MovieDownloadInfoData(movieDownloadInfo=" + this.movieDownloadInfo + ", movieInfoDto=" + this.movieInfoDto + ")";
    }
}
