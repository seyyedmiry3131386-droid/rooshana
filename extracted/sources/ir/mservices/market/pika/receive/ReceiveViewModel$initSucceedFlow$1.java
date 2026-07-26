package ir.mservices.market.pika.receive;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import defpackage.e71;
import defpackage.fp5;
import defpackage.g51;
import defpackage.js8;
import defpackage.lw8;
import defpackage.ng6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.LaunchContentActivity;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$initSucceedFlow$1", f = "ReceiveViewModel.kt", l = {73}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$initSucceedFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceiveViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$initSucceedFlow$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$initSucceedFlow$1$2", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ReceiveViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReceiveViewModel receiveViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = receiveViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Map) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map = (Map) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            ir.mservices.market.core.notification.a aVar = this.b.w;
            int size = map.keySet().size();
            aVar.getClass();
            Context context = aVar.i;
            Intent flags = new Intent(context, (Class<?>) LaunchContentActivity.class).setFlags(4194304);
            Object obj2 = lw8.b;
            PendingIntent activity2 = PendingIntent.getActivity(context, 108, flags, js8.i(402653184, false));
            fp5 fp5Var = new fp5(context, "myket_channel_id");
            ir.mservices.market.core.notification.a.o(fp5Var, context.getResources().getString(rs6.notif_pika_received_title, Integer.valueOf(size)), context.getResources().getString(rs6.notif_pika_click_to_install));
            aVar.g(fp5Var, activity2);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$initSucceedFlow$1(ReceiveViewModel receiveViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = receiveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$initSucceedFlow$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$initSucceedFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ReceiveViewModel receiveViewModel = this.b;
            ng6 ng6Var = new ng6(1, new rv6(receiveViewModel.u.d));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(receiveViewModel, null);
            this.a = 1;
            if (d.f(ng6Var, anonymousClass2, this) == coroutineSingletons) {
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
}
