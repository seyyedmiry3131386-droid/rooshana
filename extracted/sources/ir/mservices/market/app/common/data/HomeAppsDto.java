package ir.mservices.market.app.common.data;

import defpackage.f88;
import defpackage.vo7;
import defpackage.wp1;
import defpackage.yd1;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HomeAppsDto extends HomeItemDTO implements Serializable, DisplayMode {

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDTO;

    @vo7("apps")
    private final List<ApplicationDTO> apps;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("packageKey")
    private final String packageKey;

    @vo7("title")
    private final String title;

    public HomeAppsDto(String str, String str2, List<ApplicationDTO> list, List<String> list2, AdInfoDto adInfoDto, boolean z, String str3) {
        this.title = str;
        this.packageKey = str2;
        this.apps = list;
        this.ignoreConditions = list2;
        this.adInfoDTO = adInfoDto;
        this.eol = z;
        this.displayMode = str3;
    }

    public final AdInfoDto getAdInfoDTO() {
        return this.adInfoDTO;
    }

    public final List<ApplicationDTO> getApps() {
        return this.apps;
    }

    public final boolean getEol() {
        return this.eol;
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
        String str = this.displayMode;
        if (str == null) {
            return "Vertical";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "Vertical" : str;
    }

    public final String getPackageKey() {
        return this.packageKey;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isDigested() {
        return wp1.b(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isMulti() {
        return wp1.c(this);
    }

    public /* synthetic */ HomeAppsDto(String str, String str2, List list, List list2, AdInfoDto adInfoDto, boolean z, String str3, int i, yd1 yd1Var) {
        this(str, str2, list, list2, adInfoDto, (i & 32) != 0 ? false : z, str3);
    }
}
