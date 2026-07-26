package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HarmfulAppsDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("apps")
    private final List<HarmfulAppDto> harmfulApps;

    @vo7("title")
    private final String title;

    public HarmfulAppsDto(List<HarmfulAppDto> list, String str, String str2) {
        js3.p(list, "harmfulApps");
        js3.p(str, "title");
        this.harmfulApps = list;
        this.title = str;
        this.description = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<HarmfulAppDto> getHarmfulApps() {
        return this.harmfulApps;
    }

    public final String getTitle() {
        return this.title;
    }
}
