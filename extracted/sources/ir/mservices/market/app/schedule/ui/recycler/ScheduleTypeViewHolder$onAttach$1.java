package ir.mservices.market.app.schedule.ui.recycler;

import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import defpackage.e71;
import defpackage.g51;
import defpackage.g83;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.v48;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeViewHolder$onAttach$1", f = "ScheduleType.kt", l = {90}, m = "invokeSuspend", v = 1)
final class ScheduleTypeViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ScheduleTypeData b;
    public final /* synthetic */ d c;

    /* JADX INFO: renamed from: ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeViewHolder$onAttach$1$1", f = "ScheduleType.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, g51 g51Var) {
            super(2, g51Var);
            this.b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
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
            g83 g83Var = this.b.x;
            if (g83Var == null) {
                js3.V("binding");
                throw null;
            }
            FrameLayout frameLayout = g83Var.x;
            frameLayout.setClickable(z);
            Integer num = new Integer(sj8.b().G);
            int i = sj8.b().O.c;
            Float fValueOf = Float.valueOf(0.0f);
            if (z) {
                uy6.p(frameLayout, i, fValueOf);
            } else {
                frameLayout.setForeground(new ColorDrawable(num.intValue()));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleTypeViewHolder$onAttach$1(ScheduleTypeData scheduleTypeData, d dVar, g51 g51Var) {
        super(2, g51Var);
        this.b = scheduleTypeData;
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScheduleTypeViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduleTypeViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v48 v48Var = this.b.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
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
