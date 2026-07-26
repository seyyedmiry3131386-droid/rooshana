package ir.mservices.market.reels.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelAdDto implements Serializable {

    @vo7("app")
    private final AdAppInfoDto appInfo;

    @vo7("content")
    private final AdContentDto content;

    @vo7(CommonDataKt.AD_LINK)
    private final AdLinkInfoDto linkInfo;

    @vo7("target")
    private final String type;

    public ReelAdDto(AdContentDto adContentDto, String str, AdAppInfoDto adAppInfoDto, AdLinkInfoDto adLinkInfoDto) {
        js3.p(adContentDto, "content");
        js3.p(str, "type");
        this.content = adContentDto;
        this.type = str;
        this.appInfo = adAppInfoDto;
        this.linkInfo = adLinkInfoDto;
    }

    public static /* synthetic */ ReelAdDto copy$default(ReelAdDto reelAdDto, AdContentDto adContentDto, String str, AdAppInfoDto adAppInfoDto, AdLinkInfoDto adLinkInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            adContentDto = reelAdDto.content;
        }
        if ((i & 2) != 0) {
            str = reelAdDto.type;
        }
        if ((i & 4) != 0) {
            adAppInfoDto = reelAdDto.appInfo;
        }
        if ((i & 8) != 0) {
            adLinkInfoDto = reelAdDto.linkInfo;
        }
        return reelAdDto.copy(adContentDto, str, adAppInfoDto, adLinkInfoDto);
    }

    public final AdContentDto component1() {
        return this.content;
    }

    public final String component2() {
        return this.type;
    }

    public final AdAppInfoDto component3() {
        return this.appInfo;
    }

    public final AdLinkInfoDto component4() {
        return this.linkInfo;
    }

    public final ReelAdDto copy(AdContentDto adContentDto, String str, AdAppInfoDto adAppInfoDto, AdLinkInfoDto adLinkInfoDto) {
        js3.p(adContentDto, "content");
        js3.p(str, "type");
        return new ReelAdDto(adContentDto, str, adAppInfoDto, adLinkInfoDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelAdDto)) {
            return false;
        }
        ReelAdDto reelAdDto = (ReelAdDto) obj;
        return js3.i(this.content, reelAdDto.content) && js3.i(this.type, reelAdDto.type) && js3.i(this.appInfo, reelAdDto.appInfo) && js3.i(this.linkInfo, reelAdDto.linkInfo);
    }

    public final AdAppInfoDto getAppInfo() {
        return this.appInfo;
    }

    public final AdContentDto getContent() {
        return this.content;
    }

    public final AdLinkInfoDto getLinkInfo() {
        return this.linkInfo;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iK = rm7.k(this.type, this.content.hashCode() * 31, 31);
        AdAppInfoDto adAppInfoDto = this.appInfo;
        int iHashCode = (iK + (adAppInfoDto == null ? 0 : adAppInfoDto.hashCode())) * 31;
        AdLinkInfoDto adLinkInfoDto = this.linkInfo;
        return iHashCode + (adLinkInfoDto != null ? adLinkInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "ReelAdDto(content=" + this.content + ", type=" + this.type + ", appInfo=" + this.appInfo + ", linkInfo=" + this.linkInfo + ")";
    }
}
