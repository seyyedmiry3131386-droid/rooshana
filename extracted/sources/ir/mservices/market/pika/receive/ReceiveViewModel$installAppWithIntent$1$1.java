package ir.mservices.market.pika.receive;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$installAppWithIntent$1$1", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$installAppWithIntent$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ReceiveViewModel a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$installAppWithIntent$1$1(ReceiveViewModel receiveViewModel, long j, String str, String str2, g51 g51Var) {
        super(2, g51Var);
        this.a = receiveViewModel;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$installAppWithIntent$1$1(this.a, this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ReceiveViewModel$installAppWithIntent$1$1 receiveViewModel$installAppWithIntent$1$1 = (ReceiveViewModel$installAppWithIntent$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        receiveViewModel$installAppWithIntent$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ir.mservices.market.pika.receive.model.a aVar = this.a.v;
        aVar.getClass();
        String str = this.c;
        js3.p(str, "packageName");
        aVar.d.put(str, Long.valueOf(this.b));
        aVar.a.startActivity(aVar.b.g(this.d).addFlags(268435456));
        return tx8.a;
    }
}
