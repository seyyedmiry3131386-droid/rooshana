package ir.mservices.market.pika.connect;

import android.os.Bundle;
import defpackage.dp2;
import defpackage.f86;
import defpackage.g51;
import defpackage.gf2;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wp3;
import defpackage.y97;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.ConnectionState;
import ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaConnectFragment$subscribeDiscoverFlow$1", f = "PikaConnectFragment.kt", l = {171}, m = "invokeSuspend", v = 1)
final class PikaConnectFragment$subscribeDiscoverFlow$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PikaConnectFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.connect.PikaConnectFragment$subscribeDiscoverFlow$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.connect.PikaConnectFragment$subscribeDiscoverFlow$1$1", f = "PikaConnectFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PikaConnectFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PikaConnectFragment pikaConnectFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = pikaConnectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ConnectionState) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConnectionState connectionState = (ConnectionState) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = connectionState instanceof ConnectionState.ConnectionInitiatedState;
            PikaConnectFragment pikaConnectFragment = this.b;
            if (z) {
                int i = PikaConnectFragment.Y0;
                ConnectionState.ConnectionInitiatedState connectionInitiatedState = (ConnectionState.ConnectionInitiatedState) connectionState;
                PikaConnectFragment.k1(pikaConnectFragment, pikaConnectFragment.o1().a, connectionInitiatedState.getEndPointId(), connectionInitiatedState.getInfo());
            } else if (connectionState instanceof ConnectionState.EndPointFound) {
                int i2 = PikaConnectFragment.Y0;
                if (!(pikaConnectFragment.J0.g() instanceof PikaSelectDeviceBottomDialog)) {
                    pk5.g(pikaConnectFragment.J0, new NavIntentDirections.PikaSelectEndPoint(new f86(new DialogDataModel(pikaConnectFragment.p1(), "DIALOG_KEY_ACCEPT_CONNECTION", new Bundle(), 8))), -1);
                }
            } else if (connectionState instanceof ConnectionState.Connected) {
                int i3 = PikaConnectFragment.Y0;
                pk5.g(pikaConnectFragment.J0, new NavIntentDirections.InstalledApp(new wp3((String) pikaConnectFragment.q1().w.a.getValue())), -1);
            } else if (connectionState instanceof ConnectionState.PairDeviceUpdateRequire) {
                PikaConnectFragment.m1(pikaConnectFragment);
            } else if (connectionState instanceof ConnectionState.OwnDeviceUpdateRequire) {
                PikaConnectFragment.l1(pikaConnectFragment);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectFragment$subscribeDiscoverFlow$1(PikaConnectFragment pikaConnectFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pikaConnectFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PikaConnectFragment$subscribeDiscoverFlow$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PikaConnectFragment$subscribeDiscoverFlow$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = PikaConnectFragment.Y0;
            PikaConnectFragment pikaConnectFragment = this.b;
            PikaConnectViewModel pikaConnectViewModelQ1 = pikaConnectFragment.q1();
            rv6 rv6VarA = d.A(new gf2(pikaConnectViewModelQ1.t.getConnectionState(), new PikaConnectViewModel$getNearbyConnectionState$1(pikaConnectViewModelQ1, null), 4), y97.G(pikaConnectViewModelQ1), ru7.a, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pikaConnectFragment, null);
            this.a = 1;
            if (d.f(rv6VarA, anonymousClass1, this) == coroutineSingletons) {
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
