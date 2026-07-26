package defpackage;

import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExtensionPointDto b;
    public final /* synthetic */ String c;

    public /* synthetic */ up(ExtensionPointDto extensionPointDto, String str, int i) {
        this.a = i;
        this.b = extensionPointDto;
        this.c = str;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AppDetailViewModel.getExtHeaderApps$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
            default:
                return HomeViewModel.getExtHeaderAppsData$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
        }
    }
}
