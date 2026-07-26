package ir.mservices.market.app.update.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StateAppsRequestDto implements RequestDTO {

    @vo7("packageNames")
    private final List<String> packageNames;

    public StateAppsRequestDto(List<String> list) {
        js3.p(list, "packageNames");
        this.packageNames = list;
    }

    public final List<String> getPackageNames() {
        return this.packageNames;
    }
}
