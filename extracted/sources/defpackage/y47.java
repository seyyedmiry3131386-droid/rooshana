package defpackage;

import ir.mservices.market.social.requests.recycler.a;
import ir.mservices.market.views.MyketProgressState;

/* JADX INFO: loaded from: classes3.dex */
public final class y47 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ y47(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                MyketProgressState myketProgressState = (MyketProgressState) obj;
                x73 x73Var = this.b.z;
                if (x73Var != null) {
                    x73Var.x.setState(myketProgressState);
                    return tx8.a;
                }
                js3.V("binding");
                throw null;
            default:
                MyketProgressState myketProgressState2 = (MyketProgressState) obj;
                x73 x73Var2 = this.b.z;
                if (x73Var2 != null) {
                    x73Var2.v.setState(myketProgressState2);
                    return tx8.a;
                }
                js3.V("binding");
                throw null;
        }
    }
}
