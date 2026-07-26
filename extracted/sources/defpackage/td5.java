package defpackage;

import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class td5 implements gb8, h32 {
    public final /* synthetic */ MyMarketViewModel a;

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        MyMarketViewModel.handleFinancialAfterLogin$lambda$1(this.a, (ErrorDTO) serializable);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        MyMarketViewModel.handleFinancialAfterLogin$lambda$0(this.a, (Void) obj);
    }
}
