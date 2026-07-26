package defpackage;

import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.data.AccountPersonalDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 {
    public final wc5 a;

    public e4(wc5 wc5Var, int i) {
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
        return this.a.i(MyAccountItemsType.g, new AccountPersonalDto(str, null, null, null, null, null, null, null, null, 510, null), obj, suspendLambda);
    }
}
