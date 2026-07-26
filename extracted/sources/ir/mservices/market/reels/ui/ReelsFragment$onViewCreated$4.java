package ir.mservices.market.reels.ui;

import defpackage.dp2;
import defpackage.e17;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsFragment$onViewCreated$4", f = "ReelsFragment.kt", l = {335}, m = "invokeSuspend", v = 1)
final class ReelsFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ReelsFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsFragment$onViewCreated$4(ReelsFragment reelsFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = reelsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ReelsFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((ReelsFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ReelsFragment.i1;
            ReelsFragment reelsFragment = this.b;
            pv6 pv6Var = reelsFragment.o1().x;
            e17 e17Var = new e17(reelsFragment, 0);
            this.a = 1;
            if (pv6Var.a.a(e17Var, this) == coroutineSingletons) {
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
