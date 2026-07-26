package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HarmfulAppsRequestDTO implements RequestDTO {
    private final List<HarmFulAppData> apps;

    /* JADX WARN: Multi-variable type inference failed */
    public HarmfulAppsRequestDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<HarmFulAppData> getApps() {
        return this.apps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HarmfulAppsRequestDTO(List<? extends HarmFulAppData> list) {
        js3.p(list, "apps");
        this.apps = list;
    }

    public /* synthetic */ HarmfulAppsRequestDTO(List list, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
