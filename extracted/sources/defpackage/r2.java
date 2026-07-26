package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements h32 {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ r2(om0 om0Var, int i) {
        this.a = i;
        this.b = om0Var;
    }

    @Override // defpackage.h32
    public final void j(Serializable serializable) {
        switch (this.a) {
            case 0:
                ErrorDTO errorDTO = (ErrorDTO) serializable;
                js3.m(errorDTO);
                this.b.resumeWith(new h99(errorDTO));
                break;
            default:
                ErrorDTO errorDTO2 = (ErrorDTO) serializable;
                js3.m(errorDTO2);
                this.b.resumeWith(new h99(errorDTO2));
                break;
        }
    }
}
