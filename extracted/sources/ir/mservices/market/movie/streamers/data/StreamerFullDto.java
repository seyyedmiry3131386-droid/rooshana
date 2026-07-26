package ir.mservices.market.movie.streamers.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerFullDto implements Serializable {

    @vo7("avatarImageUrl")
    private final String avatarImageUrl;

    @vo7("backgroundImageUrl")
    private final String backgroundImageUrl;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("followerCount")
    private final String followerCount;

    @vo7("followingStatus")
    private final boolean followingStatus;

    @vo7("id")
    private final String id;

    @vo7("movieCount")
    private final String movieCount;

    @vo7("movies")
    private final StreamerMoviesDto movies;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @vo7("recommendedStreamers")
    private final StreamersDto recommendedStreamers;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    public StreamerFullDto(String str, String str2, String str3, String str4, String str5, String str6, StreamerMoviesDto streamerMoviesDto, StreamersDto streamersDto, String str7, String str8, boolean z) {
        js3.p(str, "id");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        js3.p(str4, "secondaryTitle");
        js3.p(str5, "avatarImageUrl");
        js3.p(str6, "backgroundImageUrl");
        js3.p(str7, "movieCount");
        js3.p(str8, "followerCount");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.secondaryTitle = str4;
        this.avatarImageUrl = str5;
        this.backgroundImageUrl = str6;
        this.movies = streamerMoviesDto;
        this.recommendedStreamers = streamersDto;
        this.movieCount = str7;
        this.followerCount = str8;
        this.followingStatus = z;
    }

    public static /* synthetic */ StreamerFullDto copy$default(StreamerFullDto streamerFullDto, String str, String str2, String str3, String str4, String str5, String str6, StreamerMoviesDto streamerMoviesDto, StreamersDto streamersDto, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamerFullDto.id;
        }
        if ((i & 2) != 0) {
            str2 = streamerFullDto.name;
        }
        if ((i & 4) != 0) {
            str3 = streamerFullDto.description;
        }
        if ((i & 8) != 0) {
            str4 = streamerFullDto.secondaryTitle;
        }
        if ((i & 16) != 0) {
            str5 = streamerFullDto.avatarImageUrl;
        }
        if ((i & 32) != 0) {
            str6 = streamerFullDto.backgroundImageUrl;
        }
        if ((i & 64) != 0) {
            streamerMoviesDto = streamerFullDto.movies;
        }
        if ((i & 128) != 0) {
            streamersDto = streamerFullDto.recommendedStreamers;
        }
        if ((i & 256) != 0) {
            str7 = streamerFullDto.movieCount;
        }
        if ((i & 512) != 0) {
            str8 = streamerFullDto.followerCount;
        }
        if ((i & 1024) != 0) {
            z = streamerFullDto.followingStatus;
        }
        String str9 = str8;
        boolean z2 = z;
        StreamersDto streamersDto2 = streamersDto;
        String str10 = str7;
        String str11 = str6;
        StreamerMoviesDto streamerMoviesDto2 = streamerMoviesDto;
        String str12 = str5;
        String str13 = str3;
        return streamerFullDto.copy(str, str2, str13, str4, str12, str11, streamerMoviesDto2, streamersDto2, str10, str9, z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.followerCount;
    }

    public final boolean component11() {
        return this.followingStatus;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.secondaryTitle;
    }

    public final String component5() {
        return this.avatarImageUrl;
    }

    public final String component6() {
        return this.backgroundImageUrl;
    }

    public final StreamerMoviesDto component7() {
        return this.movies;
    }

    public final StreamersDto component8() {
        return this.recommendedStreamers;
    }

    public final String component9() {
        return this.movieCount;
    }

    public final StreamerFullDto copy(String str, String str2, String str3, String str4, String str5, String str6, StreamerMoviesDto streamerMoviesDto, StreamersDto streamersDto, String str7, String str8, boolean z) {
        js3.p(str, "id");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        js3.p(str4, "secondaryTitle");
        js3.p(str5, "avatarImageUrl");
        js3.p(str6, "backgroundImageUrl");
        js3.p(str7, "movieCount");
        js3.p(str8, "followerCount");
        return new StreamerFullDto(str, str2, str3, str4, str5, str6, streamerMoviesDto, streamersDto, str7, str8, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamerFullDto)) {
            return false;
        }
        StreamerFullDto streamerFullDto = (StreamerFullDto) obj;
        return js3.i(this.id, streamerFullDto.id) && js3.i(this.name, streamerFullDto.name) && js3.i(this.description, streamerFullDto.description) && js3.i(this.secondaryTitle, streamerFullDto.secondaryTitle) && js3.i(this.avatarImageUrl, streamerFullDto.avatarImageUrl) && js3.i(this.backgroundImageUrl, streamerFullDto.backgroundImageUrl) && js3.i(this.movies, streamerFullDto.movies) && js3.i(this.recommendedStreamers, streamerFullDto.recommendedStreamers) && js3.i(this.movieCount, streamerFullDto.movieCount) && js3.i(this.followerCount, streamerFullDto.followerCount) && this.followingStatus == streamerFullDto.followingStatus;
    }

    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFollowerCount() {
        return this.followerCount;
    }

    public final boolean getFollowingStatus() {
        return this.followingStatus;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMovieCount() {
        return this.movieCount;
    }

    public final StreamerMoviesDto getMovies() {
        return this.movies;
    }

    public final String getName() {
        return this.name;
    }

    public final StreamersDto getRecommendedStreamers() {
        return this.recommendedStreamers;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public int hashCode() {
        int iK = rm7.k(this.backgroundImageUrl, rm7.k(this.avatarImageUrl, rm7.k(this.secondaryTitle, rm7.k(this.description, rm7.k(this.name, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
        StreamerMoviesDto streamerMoviesDto = this.movies;
        int iHashCode = (iK + (streamerMoviesDto == null ? 0 : streamerMoviesDto.hashCode())) * 31;
        StreamersDto streamersDto = this.recommendedStreamers;
        return rm7.k(this.followerCount, rm7.k(this.movieCount, (iHashCode + (streamersDto != null ? streamersDto.hashCode() : 0)) * 31, 31), 31) + (this.followingStatus ? 1231 : 1237);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.secondaryTitle;
        String str5 = this.avatarImageUrl;
        String str6 = this.backgroundImageUrl;
        StreamerMoviesDto streamerMoviesDto = this.movies;
        StreamersDto streamersDto = this.recommendedStreamers;
        String str7 = this.movieCount;
        String str8 = this.followerCount;
        boolean z = this.followingStatus;
        StringBuilder sbT = rm7.t("StreamerFullDto(id=", str, ", name=", str2, ", description=");
        o40.I(str3, ", secondaryTitle=", str4, ", avatarImageUrl=", sbT);
        o40.I(str5, ", backgroundImageUrl=", str6, ", movies=", sbT);
        sbT.append(streamerMoviesDto);
        sbT.append(", recommendedStreamers=");
        sbT.append(streamersDto);
        sbT.append(", movieCount=");
        o40.I(str7, ", followerCount=", str8, ", followingStatus=", sbT);
        return t61.l(sbT, z, ")");
    }
}
