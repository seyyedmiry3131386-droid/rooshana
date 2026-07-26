package ir.mservices.market.pika.connect;

import defpackage.e71;
import defpackage.g51;
import defpackage.gf2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.ConnectionType;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaConnectViewModel$startTimeOutFlow$2", f = "PikaConnectViewModel.kt", l = {92}, m = "invokeSuspend", v = 1)
final class PikaConnectViewModel$startTimeOutFlow$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PikaConnectViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.connect.PikaConnectViewModel$startTimeOutFlow$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.connect.PikaConnectViewModel$startTimeOutFlow$2$1", f = "PikaConnectViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ int b;
        public final /* synthetic */ PikaConnectViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PikaConnectViewModel pikaConnectViewModel, g51 g51Var) {
            super(2, g51Var);
            this.c = pikaConnectViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
            anonymousClass1.b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i2 = this.a;
            if (i2 == 0) {
                b.b(obj);
                if (i == 60) {
                    PikaConnectViewModel pikaConnectViewModel = this.c;
                    NearbyRepository nearbyRepository = pikaConnectViewModel.t;
                    ConnectionType connectionType = pikaConnectViewModel.u.a;
                    if (connectionType instanceof ConnectionType.Advertise) {
                        nearbyRepository.stopAdvertising();
                    } else if (connectionType instanceof ConnectionType.Discover) {
                        nearbyRepository.stopDiscovery();
                    }
                    a aVar = pikaConnectViewModel.y;
                    Boolean bool = Boolean.TRUE;
                    this.b = i;
                    this.a = 1;
                    if (aVar.c(this, bool) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectViewModel$startTimeOutFlow$2(PikaConnectViewModel pikaConnectViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = pikaConnectViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PikaConnectViewModel$startTimeOutFlow$2(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PikaConnectViewModel$startTimeOutFlow$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PikaConnectViewModel pikaConnectViewModel = this.b;
            gf2 gf2Var = pikaConnectViewModel.A;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pikaConnectViewModel, null);
            this.a = 1;
            if (d.f(gf2Var, anonymousClass1, this) == coroutineSingletons) {
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
