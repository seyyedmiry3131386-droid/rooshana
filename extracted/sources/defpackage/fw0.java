package defpackage;

import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class fw0 {
    public dp3 a;
    public a b;

    public static void c(String str) {
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("review_menu_open".concat(str));
        clickEventBuilder.a();
    }

    public static void e(String str) {
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("review_report".concat(str));
        clickEventBuilder.a();
    }

    public final void a(String str, String str2, boolean z) {
        if (z) {
            if (this.a.G(str2)) {
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("review_dislike" + str + "_installed_developer");
                clickEventBuilder.a();
                return;
            }
            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
            clickEventBuilder2.b("review_dislike" + str + "_not_installed_developer");
            clickEventBuilder2.a();
            return;
        }
        if (this.a.G(str2)) {
            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
            clickEventBuilder3.b("review_dislike" + str + "_installed_user");
            clickEventBuilder3.a();
            return;
        }
        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
        clickEventBuilder4.b("review_dislike" + str + "_not_installed_user");
        clickEventBuilder4.a();
    }

    public final void b(String str, String str2, boolean z) {
        if (z) {
            if (!this.a.G(str2)) {
                dw1.y("review_like_detail_not_installed_developer");
                return;
            }
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("review_like" + str + "_installed_developer");
            clickEventBuilder.a();
            return;
        }
        if (this.a.G(str2)) {
            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
            clickEventBuilder2.b("review_like" + str + "_installed_user");
            clickEventBuilder2.a();
            return;
        }
        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
        clickEventBuilder3.b("review_like" + str + "_not_installed_user");
        clickEventBuilder3.a();
    }

    public final void d(String str, int i, boolean z, ForceUpdateDto forceUpdateDto) {
        AppDownloadFlowStatus appDownloadFlowStatusD = this.b.d(str, i, z, forceUpdateDto);
        if (appDownloadFlowStatusD == AppDownloadFlowStatus.c) {
            dw1.y("review_new_update");
        } else if (appDownloadFlowStatusD == AppDownloadFlowStatus.g) {
            dw1.y("review_new_run");
        }
    }
}
