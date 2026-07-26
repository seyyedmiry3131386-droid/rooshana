package ir.mservices.market.social.mynet.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetItemsDto implements Serializable {

    @vo7("appBanner")
    private final HomeBannerDto appBanner;

    @vo7("itemType")
    private final String itemType;

    @vo7("movieBanner")
    private final HomeMovieBannerDto movieBanner;

    @vo7("user")
    private final UserDto user;

    @vo7("users")
    private final UsersDto users;

    public MynetItemsDto(String str, UsersDto usersDto, UserDto userDto, HomeBannerDto homeBannerDto, HomeMovieBannerDto homeMovieBannerDto) {
        js3.p(str, "itemType");
        this.itemType = str;
        this.users = usersDto;
        this.user = userDto;
        this.appBanner = homeBannerDto;
        this.movieBanner = homeMovieBannerDto;
    }

    public static /* synthetic */ MynetItemsDto copy$default(MynetItemsDto mynetItemsDto, String str, UsersDto usersDto, UserDto userDto, HomeBannerDto homeBannerDto, HomeMovieBannerDto homeMovieBannerDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mynetItemsDto.itemType;
        }
        if ((i & 2) != 0) {
            usersDto = mynetItemsDto.users;
        }
        if ((i & 4) != 0) {
            userDto = mynetItemsDto.user;
        }
        if ((i & 8) != 0) {
            homeBannerDto = mynetItemsDto.appBanner;
        }
        if ((i & 16) != 0) {
            homeMovieBannerDto = mynetItemsDto.movieBanner;
        }
        HomeMovieBannerDto homeMovieBannerDto2 = homeMovieBannerDto;
        UserDto userDto2 = userDto;
        return mynetItemsDto.copy(str, usersDto, userDto2, homeBannerDto, homeMovieBannerDto2);
    }

    public final String component1() {
        return this.itemType;
    }

    public final UsersDto component2() {
        return this.users;
    }

    public final UserDto component3() {
        return this.user;
    }

    public final HomeBannerDto component4() {
        return this.appBanner;
    }

    public final HomeMovieBannerDto component5() {
        return this.movieBanner;
    }

    public final MynetItemsDto copy(String str, UsersDto usersDto, UserDto userDto, HomeBannerDto homeBannerDto, HomeMovieBannerDto homeMovieBannerDto) {
        js3.p(str, "itemType");
        return new MynetItemsDto(str, usersDto, userDto, homeBannerDto, homeMovieBannerDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MynetItemsDto)) {
            return false;
        }
        MynetItemsDto mynetItemsDto = (MynetItemsDto) obj;
        return js3.i(this.itemType, mynetItemsDto.itemType) && js3.i(this.users, mynetItemsDto.users) && js3.i(this.user, mynetItemsDto.user) && js3.i(this.appBanner, mynetItemsDto.appBanner) && js3.i(this.movieBanner, mynetItemsDto.movieBanner);
    }

    public final HomeBannerDto getAppBanner() {
        return this.appBanner;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final HomeMovieBannerDto getMovieBanner() {
        return this.movieBanner;
    }

    public final UserDto getUser() {
        return this.user;
    }

    public final UsersDto getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iHashCode = this.itemType.hashCode() * 31;
        UsersDto usersDto = this.users;
        int iHashCode2 = (iHashCode + (usersDto == null ? 0 : usersDto.hashCode())) * 31;
        UserDto userDto = this.user;
        int iHashCode3 = (iHashCode2 + (userDto == null ? 0 : userDto.hashCode())) * 31;
        HomeBannerDto homeBannerDto = this.appBanner;
        int iHashCode4 = (iHashCode3 + (homeBannerDto == null ? 0 : homeBannerDto.hashCode())) * 31;
        HomeMovieBannerDto homeMovieBannerDto = this.movieBanner;
        return iHashCode4 + (homeMovieBannerDto != null ? homeMovieBannerDto.hashCode() : 0);
    }

    public String toString() {
        return "MynetItemsDto(itemType=" + this.itemType + ", users=" + this.users + ", user=" + this.user + ", appBanner=" + this.appBanner + ", movieBanner=" + this.movieBanner + ")";
    }
}
