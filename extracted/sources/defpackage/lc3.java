package defpackage;

import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.home.data.ExtensionHomeAppDto;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lc3 implements dp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ExtensionPointDto b;
    public final /* synthetic */ HomeViewModel c;

    public /* synthetic */ lc3(HomeViewModel homeViewModel, ExtensionPointDto extensionPointDto) {
        this.c = homeViewModel;
        this.b = extensionPointDto;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return HomeViewModel.getExtensionApp$lambda$0(this.c, this.b, (ExtensionHomeAppDto) obj);
            default:
                return HomeViewModel.getExtensionApps$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
        }
    }

    public /* synthetic */ lc3(ExtensionPointDto extensionPointDto, HomeViewModel homeViewModel) {
        this.b = extensionPointDto;
        this.c = homeViewModel;
    }
}
