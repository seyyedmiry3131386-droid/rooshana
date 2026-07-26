package ir.mservices.market.version2.ui.recycler.holder;

import defpackage.e71;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$2", f = "MultiSelectViewHolder.kt", l = {73}, m = "invokeSuspend", v = 1)
final class MultiSelectViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MultiSelectRecyclerData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$2$1", f = "MultiSelectViewHolder.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ a a;
        public final /* synthetic */ MultiSelectRecyclerData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, MultiSelectRecyclerData multiSelectRecyclerData, a aVar) {
            super(2, g51Var);
            this.a = aVar;
            this.b = multiSelectRecyclerData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.b, this.a);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            this.a.B(this.b);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectViewHolder$onAttach$2(g51 g51Var, MultiSelectRecyclerData multiSelectRecyclerData, a aVar) {
        super(2, g51Var);
        this.b = multiSelectRecyclerData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MultiSelectViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiSelectViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MultiSelectRecyclerData multiSelectRecyclerData = this.b;
            o4 o4Var = new o4(multiSelectRecyclerData.e, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, multiSelectRecyclerData, this.c);
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
