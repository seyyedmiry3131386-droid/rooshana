package ir.mservices.market.purchaseTransaction.model;

import com.google.gson.reflect.TypeToken;
import defpackage.ck4;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import defpackage.zn6;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionListDTO;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.purchaseTransaction.model.PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1", f = "PurchaseTransactionRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
final class PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ck4 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1(ck4 ck4Var, String str, String str2, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = ck4Var;
        this.e = str;
        this.f = str2;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.f;
        Object obj5 = this.g;
        PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1 purchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1 = new PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1(this.d, this.e, str, obj5, (g51) obj4);
        purchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1.b = iIntValue;
        purchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1.c = iIntValue2;
        return purchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        zn6 zn6Var = (zn6) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        lw.d(null, null, zn6Var.accountManager.a());
        z57 z57VarCreateRequestUrl = zn6Var.createRequestUrl("v1/accounts", "{accountId}/transactions", kotlin.collections.b.O(new Pair("accountId", zn6Var.accountManager.a())), zn6Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)), new Pair("status", this.e), new Pair("filter", this.f))));
        Type type = new TypeToken<PurchaseTransactionListDTO>() { // from class: ir.mservices.market.purchaseTransaction.service.PurchaseTransactionService$getPurchaseTransactions$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(zn6Var, type, z57VarCreateRequestUrl, this.g, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
