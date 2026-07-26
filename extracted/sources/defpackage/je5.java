package defpackage;

import android.os.Bundle;
import ir.mservices.market.version2.webapi.responsedto.AppStorageDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class je5 implements gb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ vp7 c;

    public /* synthetic */ je5(dp2 dp2Var, vp7 vp7Var, int i) {
        this.a = i;
        this.b = dp2Var;
        this.c = vp7Var;
    }

    @Override // defpackage.gb8
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 0);
                bundle.putString("RESPONSE_USER_ID", (String) this.c.I().h.j);
                this.b.invoke(bundle);
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 0);
                bundle2.putString("RESPONSE_APP_STORAGE_PAYLOAD", ((AppStorageDto) obj).getPayload());
                bundle2.putString("RESPONSE_USER_ID", (String) this.c.I().h.j);
                this.b.invoke(bundle2);
                break;
        }
    }
}
