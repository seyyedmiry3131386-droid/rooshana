package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.common.data.HomeAppsDto;
import ir.mservices.market.app.detail.data.AdInfoDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAppListDto extends HomeAppsDto implements Serializable {

    @vo7("bgColor")
    private final String bgColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAppListDto(String str, String str2, String str3, List<ApplicationDTO> list, List<String> list2, AdInfoDto adInfoDto) {
        super(str2, str3, list, list2, adInfoDto, false, "Vertical");
        js3.p(str3, "packageKey");
        this.bgColor = str;
    }

    public final String getBgColor() {
        return this.bgColor;
    }
}
