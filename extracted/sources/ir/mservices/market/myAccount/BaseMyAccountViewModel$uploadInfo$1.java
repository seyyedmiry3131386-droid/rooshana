package ir.mservices.market.myAccount;

import defpackage.e71;
import defpackage.g51;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$uploadInfo$1", f = "BaseMyAccountViewModel.kt", l = {134, 135}, m = "invokeSuspend", v = 1)
final class BaseMyAccountViewModel$uploadInfo$1 extends SuspendLambda implements qp2 {
    public Object a;
    public BaseMyAccountViewModel b;
    public MyAccountItemsType c;
    public String d;
    public n99 e;
    public int f;
    public final /* synthetic */ BaseMyAccountViewModel g;
    public final /* synthetic */ MyAccountItemsType h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel$uploadInfo$1(BaseMyAccountViewModel baseMyAccountViewModel, MyAccountItemsType myAccountItemsType, String str, Object obj, g51 g51Var) {
        super(2, g51Var);
        this.g = baseMyAccountViewModel;
        this.h = myAccountItemsType;
        this.i = str;
        this.j = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMyAccountViewModel$uploadInfo$1(this.g, this.h, this.i, this.j, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMyAccountViewModel$uploadInfo$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.BaseMyAccountViewModel$uploadInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
