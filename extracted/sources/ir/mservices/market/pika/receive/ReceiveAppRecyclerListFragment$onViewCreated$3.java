package ir.mservices.market.pika.receive;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.js8;
import defpackage.lw;
import defpackage.lw8;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.service.ShareAppInstallerService;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$3", f = "ReceiveAppRecyclerListFragment.kt", l = {157}, m = "invokeSuspend", v = 1)
final class ReceiveAppRecyclerListFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ReceiveAppRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$3$1", f = "ReceiveAppRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ReceiveAppRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = receiveAppRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((PackageInstaller.Session) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
            PackageInstaller.Session session = (PackageInstaller.Session) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            try {
                Intent intent = new Intent(receiveAppRecyclerListFragment.H(), (Class<?>) ShareAppInstallerService.class);
                Context contextH = receiveAppRecyclerListFragment.H();
                Object obj2 = lw8.b;
                IntentSender intentSender = PendingIntent.getService(contextH, 0, intent, js8.i(0, true)).getIntentSender();
                js3.o(intentSender, "getIntentSender(...)");
                session.commit(intentSender);
            } catch (Exception e) {
                lw.g(e, "ReceiveAppRecyclerListFragment commit session failed!", null);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveAppRecyclerListFragment$onViewCreated$3(ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = receiveAppRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ReceiveAppRecyclerListFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ReceiveAppRecyclerListFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ReceiveAppRecyclerListFragment.p1;
            ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
            o4 o4Var = new o4(receiveAppRecyclerListFragment.R1().A, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(receiveAppRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
