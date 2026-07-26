package defpackage;

import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.TogoViewModel;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ProfileInfoDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bn8 implements gb8, h32 {
    public final /* synthetic */ TogoViewModel a;
    public final /* synthetic */ TogoAction.GetAccountInfoAction b;

    public /* synthetic */ bn8(TogoViewModel togoViewModel, TogoAction.GetAccountInfoAction getAccountInfoAction) {
        this.a = togoViewModel;
        this.b = getAccountInfoAction;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        TogoViewModel.onGetAccountInfoAction$lambda$1(this.a, this.b, (ErrorDTO) serializable);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        TogoViewModel.onGetAccountInfoAction$lambda$0(this.a, this.b, (ProfileInfoDto) obj);
    }
}
