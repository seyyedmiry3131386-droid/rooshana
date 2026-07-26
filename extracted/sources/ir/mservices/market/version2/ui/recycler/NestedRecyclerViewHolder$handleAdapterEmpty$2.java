package ir.mservices.market.version2.ui.recycler;

import defpackage.a06;
import defpackage.bz6;
import defpackage.cx;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g32;
import defpackage.g51;
import defpackage.js3;
import defpackage.l06;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.xv3;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$handleAdapterEmpty$2", f = "NestedRecycler.kt", l = {318}, m = "invokeSuspend", v = 1)
final class NestedRecyclerViewHolder$handleAdapterEmpty$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ NestedRecyclerData b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$handleAdapterEmpty$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.ui.recycler.NestedRecyclerViewHolder$handleAdapterEmpty$2$1", f = "NestedRecycler.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ NestedRecyclerData a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NestedRecyclerData nestedRecyclerData, boolean z, a aVar, g51 g51Var) {
            super(2, g51Var);
            this.a = nestedRecyclerData;
            this.b = z;
            this.c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((a06) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            NestedRecyclerData nestedRecyclerData = this.a;
            xe2 xe2Var = ((bz6) nestedRecyclerData.b.a.getValue()).d;
            a aVar = this.c;
            boolean z = this.b;
            if (xe2Var != null && z) {
                int i = a.J;
                aVar.I(nestedRecyclerData);
            }
            if (z) {
                dp2 dp2Var = nestedRecyclerData.a;
                g32 g32Var = nestedRecyclerData instanceof g32 ? (g32) nestedRecyclerData : null;
                String uniqueId = g32Var != null ? g32Var.getUniqueId() : null;
                if (uniqueId == null) {
                    uniqueId = "";
                }
                dp2Var.invoke(uniqueId);
            }
            l06 l06Var = aVar.C;
            if (l06Var != null) {
                xv3 xv3Var = aVar.H;
                if (xv3Var == null) {
                    js3.V("updateListener");
                    throw null;
                }
                cx cxVar = l06Var.e;
                cxVar.getClass();
                androidx.paging.a aVar2 = cxVar.f;
                aVar2.getClass();
                ((CopyOnWriteArrayList) aVar2.f.b).remove(xv3Var);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedRecyclerViewHolder$handleAdapterEmpty$2(NestedRecyclerData nestedRecyclerData, boolean z, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = nestedRecyclerData;
        this.c = z;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NestedRecyclerViewHolder$handleAdapterEmpty$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NestedRecyclerViewHolder$handleAdapterEmpty$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            NestedRecyclerData nestedRecyclerData = this.b;
            xe2 xe2Var = ((bz6) nestedRecyclerData.b.a.getValue()).a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(nestedRecyclerData, this.c, this.d, null);
            this.a = 1;
            if (d.f(xe2Var, anonymousClass1, this) == coroutineSingletons) {
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
