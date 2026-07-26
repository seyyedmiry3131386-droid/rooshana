package ir.mservices.market.version2.ui.recycler;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.l06;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$onAttach$3", f = "NestedRecycler.kt", l = {290}, m = "invokeSuspend", v = 1)
final class NestedRecyclerViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ NestedRecyclerData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$onAttach$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$onAttach$3$1", f = "NestedRecycler.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, g51 g51Var) {
            super(2, g51Var);
            this.b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((bz6) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bz6 bz6Var = (bz6) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            a aVar = this.b;
            l06 l06Var = aVar.C;
            if (l06Var != null) {
                l06Var.M(aVar.z, bz6Var);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedRecyclerViewHolder$onAttach$3(NestedRecyclerData nestedRecyclerData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = nestedRecyclerData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NestedRecyclerViewHolder$onAttach$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NestedRecyclerViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            rv6 rv6Var = this.b.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
