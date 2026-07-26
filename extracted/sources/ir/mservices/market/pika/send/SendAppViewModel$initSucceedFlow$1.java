package ir.mservices.market.pika.send;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import defpackage.e71;
import defpackage.fp5;
import defpackage.g51;
import defpackage.js8;
import defpackage.lw8;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.core.notification.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1", f = "SendAppViewModel.kt", l = {93, 93}, m = "invokeSuspend", v = 1)
final class SendAppViewModel$initSucceedFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SendAppViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1$1", f = "SendAppViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ SendAppViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendAppViewModel sendAppViewModel, g51 g51Var) {
            super(2, g51Var);
            this.a = sendAppViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tx8) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            a aVar = this.a.y;
            aVar.getClass();
            Context context = aVar.i;
            Intent flags = new Intent(context, (Class<?>) LaunchContentActivity.class).setFlags(4194304);
            Object obj2 = lw8.b;
            PendingIntent activity2 = PendingIntent.getActivity(context, 108, flags, js8.i(402653184, false));
            fp5 fp5Var = new fp5(context, "myket_channel_id");
            a.o(fp5Var, context.getResources().getString(rs6.notif_pika_sent_title), context.getResources().getString(rs6.notif_pika_click_to_send_more_apps));
            aVar.g(fp5Var, activity2);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel$initSucceedFlow$1(SendAppViewModel sendAppViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = sendAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SendAppViewModel$initSucceedFlow$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SendAppViewModel$initSucceedFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r6, r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            ir.mservices.market.pika.send.SendAppViewModel r4 = r5.b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.b.b(r6)
            goto L34
        L1e:
            kotlin.b.b(r6)
            ir.mservices.market.pika.common.model.NearbyRepository r6 = r4.u
            xe2 r6 = r6.getFinishedPayloads()
            fu0 r1 = defpackage.y97.G(r4)
            r5.a = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.d.B(r6, r1, r5)
            if (r6 != r0) goto L34
            goto L44
        L34:
            xe2 r6 = (defpackage.xe2) r6
            ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1$1 r1 = new ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1$1
            r3 = 0
            r1.<init>(r4, r3)
            r5.a = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.d.f(r6, r1, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.send.SendAppViewModel$initSucceedFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
