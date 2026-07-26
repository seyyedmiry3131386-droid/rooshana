package defpackage;

import android.os.Bundle;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.AppPackageDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lu extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        if (q0Var.g(1024)) {
            q0Var.h(1024);
            q0Var.e = q0Var.b.getExtras();
        }
        Bundle bundle = q0Var.e;
        AppPackageDTO appPackageDTO = bundle != null ? (AppPackageDTO) dt2.s(bundle, "BUNDLE_KEY_APPLICATION_LIST", AppPackageDTO.class) : null;
        if (appPackageDTO == null) {
            return null;
        }
        List<ApplicationDTO> appPlusMetaDataList = appPackageDTO.getAppPlusMetaDataList();
        ApplicationList applicationList = new ApplicationList(appPlusMetaDataList != null ? new ArrayList(appPlusMetaDataList) : new ArrayList());
        String title = appPackageDTO.getTitle();
        List<String> ignoreConditions = appPackageDTO.getIgnoreConditions();
        return new dr3(new NavIntentDirections.ApplicationList(new tq(applicationList, title, ignoreConditions != null ? (String[]) ignoreConditions.toArray(new String[0]) : null)));
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        return "ir.mservices.market.ACTION_APPLICATION_LIST".equalsIgnoreCase(q0Var.b.getAction());
    }
}
