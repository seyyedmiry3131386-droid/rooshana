package ir.mservices.market.app.schedule.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.f8;
import defpackage.g51;
import defpackage.gu9;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.sk6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vd7;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.schedule.ui.recycler.ManageUpdateScheduleData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.schedule.ui.ScheduleUpdateViewModel$doRequest$1", f = "ScheduleUpdateViewModel.kt", l = {48}, m = "invokeSuspend", v = 1)
final class ScheduleUpdateViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ScheduleUpdateViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.app.schedule.ui.ScheduleUpdateViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((ScheduleUpdateViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null || !(recyclerItem.c instanceof ManageUpdateScheduleData) || !(recyclerItem2.c instanceof ScheduleTimeData)) {
                return null;
            }
            DividerData dividerData = new DividerData();
            dividerData.e = pq6.horizontal_space_outer;
            dividerData.c = pq6.horizontal_space_inner;
            return new RecyclerItem(dividerData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleUpdateViewModel$doRequest$1(ScheduleUpdateViewModel scheduleUpdateViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = scheduleUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScheduleUpdateViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduleUpdateViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        ScheduleUpdateViewModel scheduleUpdateViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            sk6 sk6Var = scheduleUpdateViewModel.v;
            l lVar = scheduleUpdateViewModel.x;
            String[] strArr = scheduleUpdateViewModel.w;
            this.a = 1;
            sk6Var.getClass();
            obj = (xe2) new m(gu9.B(), new f8(lVar, strArr, sk6Var, 18)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new vd7(12)), y97.G(scheduleUpdateViewModel)), null, new AnonymousClass2(2, scheduleUpdateViewModel, ScheduleUpdateViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
