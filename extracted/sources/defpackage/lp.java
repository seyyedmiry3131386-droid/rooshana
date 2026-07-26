package defpackage;

import ir.mservices.market.app.detail.data.AppDescriptionDto;
import ir.mservices.market.app.detail.data.AppVersionDto;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.app.detail.update.ui.recycler.InAppUpdateAppBarData;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.install.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lp extends c16 {
    public final InAppUpdateData c;
    public final wt d;
    public final yl5 e;
    public final a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(InAppUpdateData inAppUpdateData) {
        super(1);
        js3.p(inAppUpdateData, "app");
        this.c = inAppUpdateData;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.d = (wt) w91Var.z.get();
        this.e = (yl5) w91Var.D0.get();
        this.f = (a) w91Var.x.get();
    }

    @Override // defpackage.c16
    public final Object d() {
        String str;
        ArrayList arrayList = new ArrayList();
        wt wtVar = this.d;
        if (wtVar == null) {
            js3.V("appUpdateRepository");
            throw null;
        }
        InAppUpdateData inAppUpdateData = this.c;
        String str2 = inAppUpdateData.a;
        AppVersionDto appVersionDto = inAppUpdateData.b;
        boolean zD = ((AppUpdateRepositoryImpl) wtVar).d(appVersionDto.getCode(), str2);
        String str3 = inAppUpdateData.c;
        String str4 = inAppUpdateData.d;
        String str5 = inAppUpdateData.a;
        String str6 = inAppUpdateData.e;
        TrafficPriceDto trafficPriceDto = inAppUpdateData.f;
        AppDescriptionDto appDescriptionDto = inAppUpdateData.s;
        arrayList.add(new InAppUpdateAppBarData(new AppBarSampleData(str3, str4, str5, "", str6, trafficPriceDto, null, appDescriptionDto != null ? appDescriptionDto.getText() : null)));
        if ((!m88.T(str2, NearbyRepository.SERVICE_ID, true) || zD) && (str = inAppUpdateData.h) != null) {
            yl5 yl5Var = this.e;
            if (yl5Var == null) {
                js3.V("neneDownloadRepository");
                throw null;
            }
            xe2 xe2VarA = yl5Var.a(str2);
            yl5 yl5Var2 = this.e;
            if (yl5Var2 == null) {
                js3.V("neneDownloadRepository");
                throw null;
            }
            xe2 xe2VarB = yl5Var2.b(str2);
            a aVar = this.f;
            if (aVar == null) {
                js3.V("installQueue");
                throw null;
            }
            arrayList.add(new AppDownloadData((vb7) xe2VarA, (vb7) xe2VarB, aVar.b, inAppUpdateData.i != null, inAppUpdateData.j, inAppUpdateData.k, inAppUpdateData.a, str, inAppUpdateData.l, appVersionDto.getCode(), inAppUpdateData.m, inAppUpdateData.f, ja1.b(0L), vy2.e(0, 7, null), inAppUpdateData.t, false));
        }
        return new kp(arrayList);
    }
}
