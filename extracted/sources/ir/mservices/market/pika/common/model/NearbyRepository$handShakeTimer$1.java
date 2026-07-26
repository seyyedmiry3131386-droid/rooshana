package ir.mservices.market.pika.common.model;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$handShakeTimer$1", f = "NearbyRepository.kt", l = {75}, m = "invokeSuspend", v = 1)
public final class NearbyRepository$handShakeTimer$1 extends SuspendLambda implements qp2 {
    int label;

    public NearbyRepository$handShakeTimer$1(g51<? super NearbyRepository$handShakeTimer$1> g51Var) {
        super(2, g51Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51<tx8> create(Object obj, g51<?> g51Var) {
        return new NearbyRepository$handShakeTimer$1(g51Var);
    }

    public final Object invoke(int i, g51<? super tx8> g51Var) {
        return ((NearbyRepository$handShakeTimer$1) create(Integer.valueOf(i), g51Var)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (a.e(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }

    @Override // defpackage.qp2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (g51<? super tx8>) obj2);
    }
}
