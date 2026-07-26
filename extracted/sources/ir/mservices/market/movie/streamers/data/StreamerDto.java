package ir.mservices.market.movie.streamers.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerDto implements Serializable {

    @vo7("avatarImageUrl")
    private final String avatarImageUrl;

    @vo7("backgroundImageUrl")
    private final String backgroundImageUrl;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("id")
    private final String id;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    public StreamerDto(String str, String str2, String str3, String str4, String str5, String str6) {
        js3.p(str, "id");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        js3.p(str4, "secondaryTitle");
        js3.p(str5, "avatarImageUrl");
        js3.p(str6, "backgroundImageUrl");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.secondaryTitle = str4;
        this.avatarImageUrl = str5;
        this.backgroundImageUrl = str6;
    }

    public static /* synthetic */ StreamerDto copy$default(StreamerDto streamerDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamerDto.id;
        }
        if ((i & 2) != 0) {
            str2 = streamerDto.name;
        }
        if ((i & 4) != 0) {
            str3 = streamerDto.description;
        }
        if ((i & 8) != 0) {
            str4 = streamerDto.secondaryTitle;
        }
        if ((i & 16) != 0) {
            str5 = streamerDto.avatarImageUrl;
        }
        if ((i & 32) != 0) {
            str6 = streamerDto.backgroundImageUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return streamerDto.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.id;
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

    public final StreamerDto copy(String str, String str2, String str3, String str4, String str5, String str6) {
        js3.p(str, "id");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        js3.p(str4, "secondaryTitle");
        js3.p(str5, "avatarImageUrl");
        js3.p(str6, "backgroundImageUrl");
        return new StreamerDto(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamerDto)) {
            return false;
        }
        StreamerDto streamerDto = (StreamerDto) obj;
        return js3.i(this.id, streamerDto.id) && js3.i(this.name, streamerDto.name) && js3.i(this.description, streamerDto.description) && js3.i(this.secondaryTitle, streamerDto.secondaryTitle) && js3.i(this.avatarImageUrl, streamerDto.avatarImageUrl) && js3.i(this.backgroundImageUrl, streamerDto.backgroundImageUrl);
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

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public int hashCode() {
        return this.backgroundImageUrl.hashCode() + rm7.k(this.avatarImageUrl, rm7.k(this.secondaryTitle, rm7.k(this.description, rm7.k(this.name, this.id.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.secondaryTitle;
        String str5 = this.avatarImageUrl;
        String str6 = this.backgroundImageUrl;
        StringBuilder sbT = rm7.t("StreamerDto(id=", str, ", name=", str2, ", description=");
        o40.I(str3, ", secondaryTitle=", str4, ", avatarImageUrl=", sbT);
        return dw1.p(str5, ", backgroundImageUrl=", str6, ")", sbT);
    }
}
