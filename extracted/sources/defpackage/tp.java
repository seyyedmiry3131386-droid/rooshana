package defpackage;

import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExtensionPointDto b;
    public final /* synthetic */ AppDetailViewModel c;

    public /* synthetic */ tp(ExtensionPointDto extensionPointDto, AppDetailViewModel appDetailViewModel, int i) {
        this.a = i;
        this.b = extensionPointDto;
        this.c = appDetailViewModel;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AppDetailViewModel.getUpdateExtensionApps$lambda$0(this.b, this.c, (ApplicationStateListDto) obj);
            default:
                return AppDetailViewModel.getExtensionApps$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
        }
    }
}
