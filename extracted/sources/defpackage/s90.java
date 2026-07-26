package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.update.BaseUpdateFragment;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.a;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s90 implements hd8, og5, pg5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseUpdateFragment b;

    public /* synthetic */ s90(BaseUpdateFragment baseUpdateFragment, int i) {
        this.a = i;
        this.b = baseUpdateFragment;
    }

    @Override // defpackage.pg5
    public void a(View view, qg5 qg5Var, Object obj) {
        String strL;
        String strL2;
        String strL3;
        a aVar = (a) qg5Var;
        AppUpdateData appUpdateData = (AppUpdateData) obj;
        int i = BaseUpdateFragment.p1;
        js3.p(appUpdateData, "recyclerData");
        o30 o30Var = appUpdateData.c;
        BaseUpdateFragment baseUpdateFragment = this.b;
        wt wtVar = baseUpdateFragment.o1;
        if (wtVar == null) {
            js3.V("appUpdateRepository");
            throw null;
        }
        String str = o30Var.n;
        String str2 = o30Var.n;
        int i2 = o30Var.f;
        if (!((AppUpdateRepositoryImpl) wtVar).d(i2, str)) {
            String str3 = null;
            String str4 = null;
            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(o30Var.i, o30Var.h, str2, null, null, null, null, null, 248, null), str3, str4, 4, null);
            AppIconView appIconView = aVar.G;
            js3.o(appIconView, "<get-appIcon>(...)");
            baseUpdateFragment.X1(startApplicationData, "UpdateList", null, appIconView, new Tracker("updates", null, "verticalList"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str2);
        bundle.putInt("BUNDLE_KEY_VERSION_CODE", i2);
        boolean z = appUpdateData.j;
        bundle.putBoolean("isActive", z);
        if (z) {
            strL3 = baseUpdateFragment.L(rs6.inactive_update_title);
            js3.o(strL3, "getString(...)");
            strL = baseUpdateFragment.L(rs6.inactive_update_desc);
            js3.o(strL, "getString(...)");
            strL2 = baseUpdateFragment.L(rs6.disable_update);
            js3.o(strL2, "getString(...)");
        } else {
            strL = baseUpdateFragment.L(rs6.active_update_desc);
            js3.o(strL, "getString(...)");
            strL2 = baseUpdateFragment.L(rs6.active);
            js3.o(strL2, "getString(...)");
            strL3 = "";
        }
        pk5.g(baseUpdateFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(baseUpdateFragment.S1(), "DIALOG_KEY_ALERT_INACTIVE", bundle, 8), strL3, strL, strL2, baseUpdateFragment.K().getString(rs6.back), true)), -1);
    }

    @Override // defpackage.hd8
    public void b() {
        int i = BaseUpdateFragment.p1;
        this.b.T1().m(true);
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        BaseUpdateFragment baseUpdateFragment = this.b;
        switch (i) {
            case 1:
                a aVar = (a) qg5Var;
                AppUpdateData appUpdateData = (AppUpdateData) obj;
                int i2 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p(aVar, "viewHolder");
                js3.p(appUpdateData, "recyclerData");
                o30 o30Var = appUpdateData.c;
                StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(o30Var.i, o30Var.h, o30Var.n, null, null, null, null, null, 248, null), null, null, 4, null);
                AppIconView appIconView = aVar.G;
                js3.o(appIconView, "<get-appIcon>(...)");
                this.b.X1(startApplicationData, "UpdateList", null, appIconView, new Tracker("updates", null, "verticalList"));
                break;
            case 2:
                AppUpdateData appUpdateData2 = (AppUpdateData) obj;
                int i3 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(appUpdateData2, "recyclerData");
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("update_reviews_stars");
                clickEventBuilder.a();
                baseUpdateFragment.U1(appUpdateData2);
                break;
            case 3:
                AppUpdateData appUpdateData3 = (AppUpdateData) obj;
                int i4 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(appUpdateData3, "recyclerData");
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("update_reviews_write_review");
                clickEventBuilder2.a();
                baseUpdateFragment.U1(appUpdateData3);
                break;
            case 4:
                ir.mservices.market.app.common.recycler.a aVar2 = (ir.mservices.market.app.common.recycler.a) qg5Var;
                AppData appData = (AppData) obj;
                int i5 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p(aVar2, "viewHolder");
                js3.p(appData, "appData");
                ApplicationDTO applicationDTO = appData.c;
                js3.p(applicationDTO, "app");
                String iconPath = applicationDTO.getIconPath();
                js3.o(iconPath, "getIconPath(...)");
                String title = applicationDTO.getTitle();
                js3.o(title, "getTitle(...)");
                String packageName = applicationDTO.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                StartApplicationData startApplicationData2 = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                String refId = applicationDTO.getRefId();
                js3.o(refId, "getRefId(...)");
                this.b.X1(startApplicationData2, refId, applicationDTO.getCallbackUrl(), aVar2.x(), new Tracker("updates", null, "recommendation"));
                break;
            case 5:
                ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                int i6 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((v62) qg5Var, "<unused var>");
                js3.p(extHeaderData, "recyclerData");
                String str = extHeaderData.b;
                String str2 = extHeaderData.c;
                pk5.g(baseUpdateFragment.J0, new NavIntentDirections.UrlReceive(new t09(str, dw1.n("Update ext - ", str2), str2, "Apps")), -1);
                break;
            case 6:
                mr mrVar = (mr) qg5Var;
                AppNestedData appNestedData = (AppNestedData) obj;
                int i7 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p(mrVar, "viewHolder");
                js3.p(appNestedData, "recyclerData");
                ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                clickEventBuilder3.b("update_recom_app");
                clickEventBuilder3.a();
                ApplicationDTO applicationDTO2 = appNestedData.a;
                if (applicationDTO2 != null) {
                    String iconPath2 = applicationDTO2.getIconPath();
                    js3.o(iconPath2, "getIconPath(...)");
                    String title2 = applicationDTO2.getTitle();
                    js3.o(title2, "getTitle(...)");
                    String packageName2 = applicationDTO2.getPackageName();
                    js3.o(packageName2, "getPackageName(...)");
                    StartApplicationData startApplicationData3 = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName2, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                    String refId2 = applicationDTO2.getRefId();
                    js3.o(refId2, "getRefId(...)");
                    String callbackUrl = applicationDTO2.getCallbackUrl();
                    ImageView imageViewX = mrVar.x();
                    this.b.X1(startApplicationData3, refId2, callbackUrl, (AppIconView) imageViewX, new Tracker("updates", null, "recommendation"));
                }
                break;
            case 7:
                bq bqVar = (bq) qg5Var;
                AppNestedData appNestedData2 = (AppNestedData) obj;
                int i8 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p(bqVar, "viewHolder");
                js3.p(appNestedData2, "recyclerData");
                ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                clickEventBuilder4.b("update_recom_app_digested");
                clickEventBuilder4.a();
                ApplicationDTO applicationDTO3 = appNestedData2.a;
                if (applicationDTO3 != null) {
                    String iconPath3 = applicationDTO3.getIconPath();
                    js3.o(iconPath3, "getIconPath(...)");
                    String title3 = applicationDTO3.getTitle();
                    js3.o(title3, "getTitle(...)");
                    String packageName3 = applicationDTO3.getPackageName();
                    js3.o(packageName3, "getPackageName(...)");
                    StartApplicationData startApplicationData4 = new StartApplicationData(new AppBarSampleData(iconPath3, title3, packageName3, null, applicationDTO3.getTagline(), null, null, null, 232, null), applicationDTO3.getInstallCallbackUrl(), applicationDTO3.getClickCallback());
                    String refId3 = applicationDTO3.getRefId();
                    js3.o(refId3, "getRefId(...)");
                    String callbackUrl2 = applicationDTO3.getCallbackUrl();
                    ImageView imageViewX2 = bqVar.x();
                    this.b.X1(startApplicationData4, refId3, callbackUrl2, (AppIconView) imageViewX2, new Tracker("updates", null, "recommendation"));
                }
                break;
            default:
                AppUpdateData appUpdateData4 = (AppUpdateData) obj;
                int i9 = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(appUpdateData4, "recyclerData");
                UpdateViewModel updateViewModelT1 = baseUpdateFragment.T1();
                String str3 = appUpdateData4.c.n;
                boolean z = appUpdateData4.m;
                ArrayList arrayList = updateViewModelT1.G0;
                if (z) {
                    arrayList.add(str3);
                } else {
                    arrayList.remove(str3);
                }
                dw1.y(appUpdateData4.m ? "update_item_arrow_close" : "update_item_arrow_open");
                break;
        }
    }
}
