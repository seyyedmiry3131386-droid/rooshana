package defpackage;

import ir.mservices.market.version2.webapi.responsedto.VerifyResultDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements gb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ s2(om0 om0Var, int i) {
        this.a = i;
        this.b = om0Var;
    }

    @Override // defpackage.gb8
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                this.b.resumeWith(new l99(obj));
                break;
            default:
                this.b.resumeWith(new l99((VerifyResultDTO) obj));
                break;
        }
    }
}
