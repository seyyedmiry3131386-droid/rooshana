package ir.mservices.market.app.schedule.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.og6;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ye7;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment$onViewCreated$1", f = "ScheduleUpdateRecyclerListFragment.kt", l = {67}, m = "invokeSuspend", v = 1)
final class ScheduleUpdateRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ScheduleUpdateRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleUpdateRecyclerListFragment$onViewCreated$1(ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = scheduleUpdateRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ScheduleUpdateRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ScheduleUpdateRecyclerListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = ScheduleUpdateRecyclerListFragment.k1;
        ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.b;
        pv6 pv6Var = scheduleUpdateRecyclerListFragment.R1().z;
        ye7 ye7Var = new ye7(scheduleUpdateRecyclerListFragment);
        this.a = 1;
        Object objA = pv6Var.a.a(new og6(ye7Var, 18), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
