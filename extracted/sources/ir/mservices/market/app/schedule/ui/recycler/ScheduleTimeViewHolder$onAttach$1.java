package ir.mservices.market.app.schedule.ui.recycler;

import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import defpackage.e71;
import defpackage.e83;
import defpackage.g51;
import defpackage.js3;
import defpackage.qg5;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.v48;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeViewHolder$onAttach$1", f = "ScheduleTime.kt", l = {108}, m = "invokeSuspend", v = 1)
final class ScheduleTimeViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ScheduleTimeData b;
    public final /* synthetic */ b c;

    /* JADX INFO: renamed from: ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeViewHolder$onAttach$1$1", f = "ScheduleTime.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ b b;
        public final /* synthetic */ ScheduleTimeData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, ScheduleTimeData scheduleTimeData, b bVar) {
            super(2, g51Var);
            this.b = bVar;
            this.c = scheduleTimeData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            b bVar = this.b;
            e83 e83Var = bVar.y;
            if (e83Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = e83Var.y;
            ScheduleTimeData scheduleTimeData = this.c;
            myketTextView.setClickable(((Boolean) scheduleTimeData.c.getValue()).booleanValue());
            MyketTextView myketTextView2 = e83Var.w;
            myketTextView2.setClickable(((Boolean) scheduleTimeData.c.getValue()).booleanValue());
            FrameLayout frameLayout = e83Var.x;
            js3.o(frameLayout, "layoutTime");
            Integer num = new Integer(sj8.b().G);
            int i = sj8.b().O.c;
            Float fValueOf = Float.valueOf(0.0f);
            if (z) {
                uy6.p(frameLayout, i, fValueOf);
            } else {
                frameLayout.setForeground(new ColorDrawable(num.intValue()));
            }
            if (z) {
                qg5.v(myketTextView, bVar.w, bVar, scheduleTimeData);
                qg5.v(myketTextView2, bVar.x, bVar, scheduleTimeData);
            } else {
                myketTextView.setOnClickListener(null);
                myketTextView2.setOnClickListener(null);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleTimeViewHolder$onAttach$1(g51 g51Var, ScheduleTimeData scheduleTimeData, b bVar) {
        super(2, g51Var);
        this.b = scheduleTimeData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScheduleTimeViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduleTimeViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ScheduleTimeData scheduleTimeData = this.b;
            v48 v48Var = scheduleTimeData.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, scheduleTimeData, this.c);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
