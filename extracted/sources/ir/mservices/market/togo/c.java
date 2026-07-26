package ir.mservices.market.togo;

import android.content.Context;
import defpackage.cu2;
import defpackage.f88;
import defpackage.js3;
import ir.mservices.market.togo.TogoAction;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cu2 {
    public final /* synthetic */ TogoViewModel a;
    public final /* synthetic */ TogoAction.GetGoogleAdId b;

    public c(TogoViewModel togoViewModel, TogoAction.GetGoogleAdId getGoogleAdId) {
        this.a = togoViewModel;
        this.b = getGoogleAdId;
    }

    @Override // defpackage.cu2
    public final void s(Context context, String str) {
        js3.p(str, "adId");
        boolean zN0 = f88.n0(str);
        TogoAction.GetGoogleAdId getGoogleAdId = this.b;
        TogoViewModel togoViewModel = this.a;
        if (zN0) {
            togoViewModel.executeCallback(getGoogleAdId.getErrorCallback(), null);
        } else {
            togoViewModel.executeCallback(getGoogleAdId.getSuccessCallback(), str);
        }
    }
}
