package ir.mservices.market.securityShield.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.recycler.DeviceScanViewHolder$onAttach$1", f = "DeviceScan.kt", l = {164}, m = "invokeSuspend", v = 1)
final class DeviceScanViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ DeviceScanData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceScanViewHolder$onAttach$1(DeviceScanData deviceScanData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = deviceScanData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DeviceScanViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((DeviceScanViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            v48 v48Var = this.b.a;
            r4 r4Var = new r4(20, this.c);
            this.a = 1;
            if (v48Var.a(r4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
