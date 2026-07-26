package defpackage;

import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mc3 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeViewModel b;

    public /* synthetic */ mc3(HomeViewModel homeViewModel, int i) {
        this.a = i;
        this.b = homeViewModel;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return HomeViewModel.getExtensionReviews$lambda$0(this.b, (HomeExtensionAppsDto) obj);
            default:
                return this.b.fillHomeData((HomeDto) obj);
        }
    }
}
