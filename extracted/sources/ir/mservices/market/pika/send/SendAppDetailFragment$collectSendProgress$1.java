package ir.mservices.market.pika.send;

import android.content.res.Resources;
import defpackage.d04;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.qp2;
import defpackage.rm2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.PikaEventBuilder;
import ir.mservices.market.pika.common.model.PayloadState;
import ir.mservices.market.views.PikaReceiveView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1", f = "SendAppDetailFragment.kt", l = {197, 197}, m = "invokeSuspend", v = 1)
final class SendAppDetailFragment$collectSendProgress$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SendAppDetailFragment b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1$1", f = "SendAppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ SendAppDetailFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendAppDetailFragment sendAppDetailFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = sendAppDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((PayloadState) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            PayloadState payloadState = (PayloadState) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            SendAppDetailFragment sendAppDetailFragment = this.b;
            rm2 rm2Var = sendAppDetailFragment.V0;
            if (rm2Var == null) {
                js3.V("binding");
                throw null;
            }
            PikaReceiveView pikaReceiveView = rm2Var.y;
            js3.o(pikaReceiveView, "install");
            boolean z = payloadState instanceof PayloadState.InProgress;
            pikaReceiveView.setVisibility((!z || ((PayloadState.InProgress) payloadState).getProgress() == 100) ? 8 : 0);
            if (payloadState instanceof PayloadState.Success) {
                rm2 rm2Var2 = sendAppDetailFragment.V0;
                if (rm2Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                rm2Var2.A.setEnabled(true);
                String string2 = sendAppDetailFragment.K().getString(rs6.send_app_complete);
                js3.o(string2, "getString(...)");
                SendAppDetailFragment.k1(sendAppDetailFragment, string2, false, true);
                PikaEventBuilder pikaEventBuilder = new PikaEventBuilder();
                pikaEventBuilder.c.putString("on", "send");
                pikaEventBuilder.a();
            } else if (payloadState instanceof PayloadState.Canceled) {
                rm2 rm2Var3 = sendAppDetailFragment.V0;
                if (rm2Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                rm2Var3.A.setEnabled(true);
                String string3 = sendAppDetailFragment.K().getString(rs6.send_app_paused);
                js3.o(string3, "getString(...)");
                SendAppDetailFragment.k1(sendAppDetailFragment, string3, true, false);
            } else if (z) {
                rm2 rm2Var4 = sendAppDetailFragment.V0;
                if (rm2Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                rm2Var4.A.setEnabled(false);
                if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - sendAppDetailFragment.Z0) > 0.3d || ((PayloadState.InProgress) payloadState).getProgress() == 100) {
                    d04 d04Var = sendAppDetailFragment.b1;
                    if (d04Var == null) {
                        js3.V("languageHelper");
                        throw null;
                    }
                    if (d04Var.f()) {
                        Resources resourcesK = sendAppDetailFragment.K();
                        int i = rs6.active_download_pending;
                        lw8 lw8VarN1 = sendAppDetailFragment.n1();
                        sendAppDetailFragment.n1();
                        PayloadState.InProgress inProgress = (PayloadState.InProgress) payloadState;
                        String strE = lw8.e(lw8VarN1, lw8.h(inProgress.getTotalReceivedData()));
                        lw8 lw8VarN12 = sendAppDetailFragment.n1();
                        sendAppDetailFragment.n1();
                        string = resourcesK.getString(i, strE, lw8.e(lw8VarN12, lw8.h(inProgress.getAllData())));
                    } else {
                        Resources resourcesK2 = sendAppDetailFragment.K();
                        int i2 = rs6.active_download_pending;
                        lw8 lw8VarN13 = sendAppDetailFragment.n1();
                        sendAppDetailFragment.n1();
                        PayloadState.InProgress inProgress2 = (PayloadState.InProgress) payloadState;
                        String strE2 = lw8.e(lw8VarN13, lw8.h(inProgress2.getAllData()));
                        lw8 lw8VarN14 = sendAppDetailFragment.n1();
                        sendAppDetailFragment.n1();
                        string = resourcesK2.getString(i2, strE2, lw8.e(lw8VarN14, lw8.h(inProgress2.getTotalReceivedData())));
                    }
                    js3.m(string);
                    SendAppDetailFragment.k1(sendAppDetailFragment, string, false, false);
                    sendAppDetailFragment.Z0 = System.currentTimeMillis();
                }
            } else if (!(payloadState instanceof PayloadState.Received)) {
                if (!(payloadState instanceof PayloadState.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                rm2 rm2Var5 = sendAppDetailFragment.V0;
                if (rm2Var5 == null) {
                    js3.V("binding");
                    throw null;
                }
                rm2Var5.A.setEnabled(true);
                String string4 = sendAppDetailFragment.K().getString(rs6.send_app_failed);
                js3.o(string4, "getString(...)");
                SendAppDetailFragment.k1(sendAppDetailFragment, string4, true, false);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppDetailFragment$collectSendProgress$1(SendAppDetailFragment sendAppDetailFragment, long j, g51 g51Var) {
        super(1, g51Var);
        this.b = sendAppDetailFragment;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SendAppDetailFragment$collectSendProgress$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SendAppDetailFragment$collectSendProgress$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r9, r1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            ir.mservices.market.pika.send.SendAppDetailFragment r5 = r8.b
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.b.b(r9)
            goto L5c
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.b.b(r9)
            goto L4c
        L1f:
            kotlin.b.b(r9)
            int r9 = ir.mservices.market.pika.send.SendAppDetailFragment.e1
            ir.mservices.market.pika.send.SendAppViewModel r9 = r5.m1()
            long r6 = r8.c
            ir.mservices.market.pika.common.model.NearbyRepository r1 = r9.u
            xe2 r1 = r1.getPayloadFlow(r6)
            ir.mservices.market.pika.send.SendAppViewModel$getShareFileState$1 r6 = new ir.mservices.market.pika.send.SendAppViewModel$getShareFileState$1
            r6.<init>(r9, r2)
            gf2 r9 = new gf2
            r7 = 4
            r9.<init>(r1, r6, r7)
            zn2 r1 = r5.N()
            v54 r1 = androidx.lifecycle.b.a(r1)
            r8.a = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.d.B(r9, r1, r8)
            if (r9 != r0) goto L4c
            goto L5b
        L4c:
            xe2 r9 = (defpackage.xe2) r9
            ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1$1 r1 = new ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1$1
            r1.<init>(r5, r2)
            r8.a = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.d.f(r9, r1, r8)
            if (r9 != r0) goto L5c
        L5b:
            return r0
        L5c:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.send.SendAppDetailFragment$collectSendProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
