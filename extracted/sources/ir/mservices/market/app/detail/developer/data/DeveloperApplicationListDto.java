package ir.mservices.market.app.detail.developer.data;

import defpackage.bf5;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperApplicationListDto implements Serializable, bf5 {

    @vo7("appDeveloperDto")
    private final AppDeveloperDto appDeveloperDto;

    @vo7("applications")
    private final List<ApplicationDTO> applications;

    @vo7("eol")
    private final boolean isEol;

    @vo7("shareText")
    private final String shareText;

    /* JADX WARN: Multi-variable type inference failed */
    public DeveloperApplicationListDto(List<? extends ApplicationDTO> list, boolean z, String str, AppDeveloperDto appDeveloperDto) {
        this.applications = list;
        this.isEol = z;
        this.shareText = str;
        this.appDeveloperDto = appDeveloperDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.isEol;
    }

    public final AppDeveloperDto getAppDeveloperDto() {
        return this.appDeveloperDto;
    }

    public final List<ApplicationDTO> getApplications() {
        return this.applications;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final boolean isEol() {
        return this.isEol;
    }
}
