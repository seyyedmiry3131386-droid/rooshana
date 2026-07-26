package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInfoDto implements Serializable {

    @vo7("app")
    private final ApplicationDTO app;

    @vo7("collapseOffset")
    private final Integer collapseOffset;

    public AppInfoDto(Integer num, ApplicationDTO applicationDTO) {
        this.collapseOffset = num;
        this.app = applicationDTO;
    }

    public final ApplicationDTO getApp() {
        return this.app;
    }

    public final Integer getCollapseOffset() {
        return this.collapseOffset;
    }
}
