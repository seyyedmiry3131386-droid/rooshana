package defpackage;

import ir.mservices.market.app.detail.data.AppVersionDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.data.MoneyBackSummaryDto;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import ir.mservices.market.app.detail.update.InAppUpdateActivity;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class vk3 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InAppUpdateActivity b;

    public /* synthetic */ vk3(InAppUpdateActivity inAppUpdateActivity, int i) {
        this.a = i;
        this.b = inAppUpdateActivity;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        InAppUpdateActivity inAppUpdateActivity = this.b;
        switch (i) {
            case 0:
                n99 n99Var = (n99) obj;
                if (!(n99Var instanceof l99)) {
                    inAppUpdateActivity.finish();
                } else {
                    ApplicationFullDto applicationFullDto = (ApplicationFullDto) ((l99) n99Var).a;
                    if (applicationFullDto != null) {
                        int i2 = InAppUpdateActivity.T;
                        String packageName = applicationFullDto.getPackageName();
                        AppVersionDto version = applicationFullDto.getVersion();
                        String url = applicationFullDto.getIcon().getUrl();
                        String title = applicationFullDto.getTitle();
                        String tagline = applicationFullDto.getTagline();
                        TrafficPriceDto trafficPrice = applicationFullDto.getTrafficPrice();
                        long length = applicationFullDto.getSize().getLength();
                        String buttonText = applicationFullDto.getButtonText();
                        MoneyBackSummaryDto moneyBackSummary = applicationFullDto.getMoneyBackSummary();
                        boolean zIsIncompatible = applicationFullDto.getVersion().isIncompatible();
                        boolean zIsFree = applicationFullDto.getPrice().isFree();
                        String realPrice = applicationFullDto.getPrice().getRealPrice();
                        ForceUpdateDto forceUpdate = applicationFullDto.getForceUpdate();
                        String callbackUrl = applicationFullDto.getCallbackUrl();
                        String installCallbackUrl = applicationFullDto.getInstallCallbackUrl();
                        boolean z = true;
                        boolean z2 = false;
                        if (applicationFullDto.getAppData() == null || !js3.i(applicationFullDto.getAppData().getHasMain(), Boolean.TRUE)) {
                            z = false;
                        }
                        if (applicationFullDto.getAppData() != null && js3.i(applicationFullDto.getAppData().getHasPatch(), Boolean.TRUE)) {
                            z2 = true;
                        }
                        pk5.g(inAppUpdateActivity, new NavIntentDirections.InAppUpdate(new yk3(new DialogDataModel(inAppUpdateActivity.S(), "DIALOG_KEY_UPDATE", null, 12), new InAppUpdateData(packageName, version, url, title, tagline, trafficPrice, length, buttonText, moneyBackSummary, zIsIncompatible, zIsFree, realPrice, forceUpdate, callbackUrl, installCallbackUrl, z, z2, applicationFullDto.getCategoryName(), applicationFullDto.getWhatsNew(), applicationFullDto.getCheetah()))), -1);
                    }
                }
                break;
            default:
                inAppUpdateActivity.setResult(-1);
                inAppUpdateActivity.finish();
                break;
        }
        return tx8Var;
    }
}
