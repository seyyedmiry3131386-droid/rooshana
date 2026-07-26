package defpackage;

import ir.mservices.market.app.detail.developer.data.DeveloperApplicationListDto;
import ir.mservices.market.app.detail.developer.ui.DeveloperViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tl1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeveloperViewModel b;

    public /* synthetic */ tl1(DeveloperViewModel developerViewModel, int i) {
        this.a = i;
        this.b = developerViewModel;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        DeveloperApplicationListDto developerApplicationListDto = (DeveloperApplicationListDto) obj;
        switch (this.a) {
            case 0:
                DeveloperViewModel developerViewModel = this.b;
                developerViewModel.x.o(developerApplicationListDto.getShareText());
                return DeveloperViewModel.r(developerViewModel, developerApplicationListDto);
            default:
                DeveloperViewModel developerViewModel2 = this.b;
                developerViewModel2.x.o(developerApplicationListDto.getShareText());
                return DeveloperViewModel.r(developerViewModel2, developerApplicationListDto);
        }
    }
}
