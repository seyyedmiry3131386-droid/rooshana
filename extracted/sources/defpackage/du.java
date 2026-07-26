package defpackage;

import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class du {
    public final a a;
    public final ps1 b;
    public final dp3 c;

    public du(ps1 ps1Var, dp3 dp3Var, a aVar) {
        js3.p(aVar, "appManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(dp3Var, "installManager");
        this.a = aVar;
        this.b = ps1Var;
        this.c = dp3Var;
    }

    public final void a(r82 r82Var, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4) {
        js3.p(r82Var, "data");
        js3.p(str, "refId");
        String str5 = r82Var.b;
        js3.o(str5, "getPackageName(...)");
        int i = r82Var.f;
        boolean z = r82Var.a;
        ForceUpdateDto forceUpdateDto = r82Var.l;
        a aVar = this.a;
        AppDownloadFlowStatus appDownloadFlowStatusD = aVar.d(str5, i, z, forceUpdateDto);
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        int i2 = r82Var.f;
        String str6 = r82Var.c;
        String str7 = r82Var.j;
        Long lValueOf = forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null;
        long j = r82Var.g;
        boolean z2 = r82Var.h;
        boolean z3 = r82Var.i;
        boolean z4 = r82Var.d;
        DownloadDataModel downloadDataModel = new DownloadDataModel(str5, i2, str, str2, str3, str4, str6, str7, lValueOf, j, z2, z3, z4);
        int iOrdinal = appDownloadFlowStatusD.ordinal();
        ps1 ps1Var = this.b;
        dp3 dp3Var = this.c;
        switch (iOrdinal) {
            case 0:
                clickEventBuilder.b("button_incompatible");
                break;
            case 1:
                aVar.b(fragmentActivity, downloadDataModel, false);
                if (!z4) {
                    clickEventBuilder.b("list_button_purchase");
                } else {
                    clickEventBuilder.b("list_button_download");
                }
                break;
            case 2:
                AppDownloadInfo appDownloadInfoI = ps1Var.i(str5, null);
                Long lValueOf2 = appDownloadInfoI != null ? Long.valueOf(appDownloadInfoI.getLocalSize()) : null;
                if (wq2.l(r82Var.g, lValueOf2 != null ? lValueOf2.longValue() : 0L)) {
                    aVar.b(fragmentActivity, downloadDataModel, false);
                } else {
                    a.e(str6, str7);
                }
                if (forceUpdateDto != null && js3.i(dp3Var.d(str5, i, Long.valueOf(forceUpdateDto.getFileLength())), Boolean.TRUE)) {
                    clickEventBuilder.b("list_button_gift");
                } else {
                    clickEventBuilder.b("list_button_update");
                }
                break;
            case 3:
                clickEventBuilder.b("list_button_pause");
                ps1Var.s(str5);
                break;
            case 4:
                sb7.p("AppUtils", "App Install Click", "PackageName: ".concat(str5));
                dp3Var.C(downloadDataModel);
                clickEventBuilder.b("button_install");
                break;
            case 5:
                clickEventBuilder.b("button_install_in_progress");
                break;
            case 6:
                clickEventBuilder.b("list_button_run");
                if (dp3Var.K(str5)) {
                    dp3.M(str5);
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        clickEventBuilder.a();
    }
}
