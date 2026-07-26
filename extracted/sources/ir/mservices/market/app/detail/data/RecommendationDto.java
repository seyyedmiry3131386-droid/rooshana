package ir.mservices.market.app.detail.data;

import defpackage.f88;
import defpackage.js3;
import defpackage.vo7;
import defpackage.wp1;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendationDto implements Serializable, DisplayMode {

    @vo7("displayMode")
    private final String _displayMode;

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDto;

    @vo7("applications")
    private final List<ApplicationDTO> applications;

    @vo7("eol")
    private final boolean eol;

    @vo7("extensionUrl")
    private final String extensionUrl;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationDto(String str, String str2, List<? extends ApplicationDTO> list, boolean z, String str3, List<String> list2, String str4, AdInfoDto adInfoDto) {
        js3.p(list, "applications");
        this.type = str;
        this.title = str2;
        this.applications = list;
        this.eol = z;
        this._displayMode = str3;
        this.ignoreConditions = list2;
        this.extensionUrl = str4;
        this.adInfoDto = adInfoDto;
    }

    public final AdInfoDto getAdInfoDto() {
        return this.adInfoDto;
    }

    public final List<ApplicationDTO> getApplications() {
        return this.applications;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getExtensionUrl() {
        return this.extensionUrl;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ int getHorizontalType() {
        return wp1.a(this);
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public String getMode() {
        String str = this._displayMode;
        if (str == null) {
            return "Vertical";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "Vertical" : str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isDigested() {
        return wp1.b(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isMulti() {
        return wp1.c(this);
    }
}
