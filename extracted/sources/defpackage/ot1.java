package defpackage;

import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.download.app.DownloadViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ot1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ot1(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DownloadViewModel.getExtHeaderApps$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
            default:
                return UpdateViewModel.getHeaderAppsExtension$lambda$0(this.b, this.c, (HomeExtensionAppsDto) obj);
        }
    }
}
