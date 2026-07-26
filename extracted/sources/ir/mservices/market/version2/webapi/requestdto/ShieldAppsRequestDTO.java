package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShieldAppsRequestDTO implements RequestDTO {
    private final List<ShieldAppDTO> apps;

    public ShieldAppsRequestDTO(List<ShieldAppDTO> list) {
        js3.p(list, "apps");
        this.apps = list;
    }

    public final List<ShieldAppDTO> getApps() {
        return this.apps;
    }
}
