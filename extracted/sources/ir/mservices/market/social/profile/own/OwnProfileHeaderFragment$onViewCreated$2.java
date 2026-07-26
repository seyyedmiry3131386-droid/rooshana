package ir.mservices.market.social.profile.own;

import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$onViewCreated$2", f = "OwnProfileHeaderFragment.kt", l = {67}, m = "invokeSuspend", v = 1)
final class OwnProfileHeaderFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ OwnProfileHeaderFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$onViewCreated$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderFragment$onViewCreated$2$2", f = "OwnProfileHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ OwnProfileHeaderFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OwnProfileHeaderFragment ownProfileHeaderFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = ownProfileHeaderFragment;
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
            int i = OwnProfileHeaderFragment.Z0;
            OwnProfileHeaderFragment ownProfileHeaderFragment = this.a;
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = ownProfileHeaderFragment.P0;
            if (aVar != null) {
                aVar.A();
            }
            ownProfileHeaderFragment.V0().r(new OwnProfileHeaderAction.RefreshAction(false));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileHeaderFragment$onViewCreated$2(OwnProfileHeaderFragment ownProfileHeaderFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = ownProfileHeaderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new OwnProfileHeaderFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((OwnProfileHeaderFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = OwnProfileHeaderFragment.Z0;
            OwnProfileHeaderFragment ownProfileHeaderFragment = this.b;
            o4 o4Var = new o4(ownProfileHeaderFragment.V0().J, 15);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ownProfileHeaderFragment, null);
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
