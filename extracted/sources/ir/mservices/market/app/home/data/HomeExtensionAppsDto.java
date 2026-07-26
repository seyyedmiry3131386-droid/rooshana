package ir.mservices.market.app.home.data;

import defpackage.bf5;
import defpackage.f88;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ExtensionDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeExtensionAppsDto extends ExtensionDto implements bf5, Serializable {

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDto;

    @vo7("apps")
    private final List<ApplicationDTO> apps;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeExtensionAppsDto(List<ApplicationDTO> list, List<String> list2, AdInfoDto adInfoDto, String str, String str2) {
        super(str, str2);
        js3.p(list, "apps");
        js3.p(str, "title");
        this.apps = list;
        this.ignoreConditions = list2;
        this.adInfoDto = adInfoDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        String nextPageUrl = getNextPageUrl();
        return nextPageUrl == null || f88.n0(nextPageUrl);
    }

    public final AdInfoDto getAdInfoDto() {
        return this.adInfoDto;
    }

    public final List<ApplicationDTO> getApps() {
        return this.apps;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }
}
