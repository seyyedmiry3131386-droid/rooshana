package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.app.detail.data.AdInfoDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ExtensionHomeAppsDto extends ExtensionDto {
    private AdInfoDto adInfoDto;
    private List<ApplicationDTO> apps;
    private List<String> ignoreConditions;

    public AdInfoDto getAdInfoDto() {
        return this.adInfoDto;
    }

    public List<ApplicationDTO> getApps() {
        return this.apps;
    }

    public List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }
}
