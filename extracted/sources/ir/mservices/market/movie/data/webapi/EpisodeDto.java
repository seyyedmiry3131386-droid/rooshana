package ir.mservices.market.movie.data.webapi;

import android.content.res.Resources;
import defpackage.f88;
import defpackage.js3;
import defpackage.rm7;
import defpackage.rs6;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class EpisodeDto implements Serializable {

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bannerType")
    private final String bannerType;

    @vo7("bannerUrl")
    private final String bannerUrl;

    @vo7("buttonText")
    private final String buttonText;

    @vo7("id")
    private final String id;

    @vo7("playId")
    private final String playId;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("showNewBadge")
    private final Boolean showNewBadge;

    @vo7("title")
    private final String title;

    public EpisodeDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        js3.p(str, "id");
        js3.p(str2, "playId");
        js3.p(str3, "title");
        this.id = str;
        this.playId = str2;
        this.title = str3;
        this.buttonText = str4;
        this.bannerUrl = str5;
        this.bannerType = str6;
        this.secondaryTitle = str7;
        this.analyticsName = str8;
        this.showNewBadge = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EpisodeDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.EpisodeDto");
        EpisodeDto episodeDto = (EpisodeDto) obj;
        return js3.i(this.id, episodeDto.id) && js3.i(this.playId, episodeDto.playId) && js3.i(this.title, episodeDto.title) && js3.i(this.bannerUrl, episodeDto.bannerUrl);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final Boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iK = rm7.k(this.title, rm7.k(this.playId, this.id.hashCode() * 31, 31), 31);
        String str = this.secondaryTitle;
        int iHashCode = (iK + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.bannerUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String getButtonText(Resources resources) {
        js3.p(resources, "resources");
        String str = this.buttonText;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = resources.getString(rs6.movie_play);
        js3.o(string, "getString(...)");
        return string;
    }
}
