package defpackage;

import android.os.Bundle;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ie5 implements h32 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;

    public /* synthetic */ ie5(int i, dp2 dp2Var) {
        this.a = i;
        this.b = dp2Var;
    }

    @Override // defpackage.h32
    public final void j(Serializable serializable) {
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        switch (this.a) {
            case 0:
                Objects.toString(errorDTO);
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 3);
                this.b.invoke(bundle);
                break;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 3);
                this.b.invoke(bundle2);
                break;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putInt("RESPONSE_CODE", 3);
                this.b.invoke(bundle3);
                break;
        }
    }
}
