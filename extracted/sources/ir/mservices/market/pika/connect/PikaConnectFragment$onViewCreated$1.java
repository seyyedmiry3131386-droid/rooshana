package ir.mservices.market.pika.connect;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.connect.ConnectionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaConnectFragment$onViewCreated$1", f = "PikaConnectFragment.kt", l = {114}, m = "invokeSuspend", v = 1)
final class PikaConnectFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PikaConnectFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.connect.PikaConnectFragment$onViewCreated$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.connect.PikaConnectFragment$onViewCreated$1$2", f = "PikaConnectFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ PikaConnectFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PikaConnectFragment pikaConnectFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = pikaConnectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = PikaConnectFragment.Y0;
            PikaConnectFragment pikaConnectFragment = this.a;
            ConnectionType connectionType = pikaConnectFragment.o1().a;
            if (connectionType instanceof ConnectionType.Advertise) {
                String string = pikaConnectFragment.K().getString(rs6.advertise_time_out);
                js3.o(string, "getString(...)");
                PikaConnectFragment.n1(pikaConnectFragment, string);
            } else {
                if (!(connectionType instanceof ConnectionType.Discover)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string2 = pikaConnectFragment.K().getString(rs6.discover_time_out);
                js3.o(string2, "getString(...)");
                PikaConnectFragment.n1(pikaConnectFragment, string2);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectFragment$onViewCreated$1(PikaConnectFragment pikaConnectFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pikaConnectFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PikaConnectFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PikaConnectFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = PikaConnectFragment.Y0;
            PikaConnectFragment pikaConnectFragment = this.b;
            o4 o4Var = new o4(pikaConnectFragment.q1().z, 21);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(pikaConnectFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
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
