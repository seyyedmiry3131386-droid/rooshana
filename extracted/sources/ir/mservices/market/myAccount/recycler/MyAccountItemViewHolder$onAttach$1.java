package ir.mservices.market.myAccount.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.recycler.MyAccountItemViewHolder$onAttach$1", f = "MyAccountItem.kt", l = {120}, m = "invokeSuspend", v = 1)
final class MyAccountItemViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyAccountItemData b;
    public final /* synthetic */ c c;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.recycler.MyAccountItemViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.recycler.MyAccountItemViewHolder$onAttach$1$1", f = "MyAccountItem.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ c a;
        public final /* synthetic */ MyAccountItemData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, MyAccountItemData myAccountItemData, c cVar) {
            super(2, g51Var);
            this.a = cVar;
            this.b = myAccountItemData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.b, this.a);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            this.a.t(this.b);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountItemViewHolder$onAttach$1(g51 g51Var, MyAccountItemData myAccountItemData, c cVar) {
        super(2, g51Var);
        this.b = myAccountItemData;
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyAccountItemViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyAccountItemViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MyAccountItemData myAccountItemData = this.b;
            o4 o4Var = new o4(myAccountItemData.b, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, myAccountItemData, this.c);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
