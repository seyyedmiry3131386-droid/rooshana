package ir.mservices.market.version2.ui.recycler.holder;

import android.view.View;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.w95;
import defpackage.x95;
import defpackage.z95;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.views.MyketCheckBox;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$1", f = "MultiSelectViewHolder.kt", l = {51}, m = "invokeSuspend", v = 1)
final class MultiSelectViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MultiSelectRecyclerData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$onAttach$1$1", f = "MultiSelectViewHolder.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ a b;
        public final /* synthetic */ MultiSelectRecyclerData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, MultiSelectRecyclerData multiSelectRecyclerData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = multiSelectRecyclerData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
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
            a aVar = this.b;
            z95 z95Var = aVar.w;
            View view = aVar.a;
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            MultiSelectRecyclerData multiSelectRecyclerData = this.c;
            if (z) {
                view.setOnLongClickListener(null);
            } else {
                int i = 0;
                multiSelectRecyclerData.g = false;
                multiSelectRecyclerData.f = false;
                l lVar = multiSelectRecyclerData.d;
                Boolean bool = Boolean.TRUE;
                lVar.getClass();
                lVar.p(null, bool);
                js3.o(view, "itemView");
                if (z95Var != null) {
                    view.setOnLongClickListener(new x95(multiSelectRecyclerData, z95Var, aVar, i));
                }
            }
            MyketCheckBox myketCheckBox = aVar.x;
            if (z95Var != null) {
                myketCheckBox.setOnClickListener(new w95(multiSelectRecyclerData, aVar, z95Var, aVar));
            }
            js3.o(view, "itemView");
            if (z95Var != null) {
                view.setOnClickListener(new w95(multiSelectRecyclerData, aVar, z95Var, aVar));
            }
            aVar.B(multiSelectRecyclerData);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectViewHolder$onAttach$1(g51 g51Var, MultiSelectRecyclerData multiSelectRecyclerData, a aVar) {
        super(2, g51Var);
        this.b = multiSelectRecyclerData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MultiSelectViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiSelectViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MultiSelectRecyclerData multiSelectRecyclerData = this.b;
            v48 v48Var = multiSelectRecyclerData.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, multiSelectRecyclerData, this.c);
            this.a = 1;
            if (d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
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
