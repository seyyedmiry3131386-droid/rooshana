package defpackage;

import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.data.AccountPersonalDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 {
    public final wc5 a;

    public f5(wc5 wc5Var, int i) {
        switch (i) {
            case 1:
                js3.p(wc5Var, "myAccountService");
                this.a = wc5Var;
                break;
            case 2:
                js3.p(wc5Var, "myAccountService");
                this.a = wc5Var;
                break;
            default:
                js3.p(wc5Var, "myAccountService");
                this.a = wc5Var;
                break;
        }
    }

    public Object a(String str, Object obj, SuspendLambda suspendLambda) {
        return this.a.i(MyAccountItemsType.c, new AccountPersonalDto(null, null, null, str, null, null, null, null, null, 503, null), obj, suspendLambda);
    }
}
