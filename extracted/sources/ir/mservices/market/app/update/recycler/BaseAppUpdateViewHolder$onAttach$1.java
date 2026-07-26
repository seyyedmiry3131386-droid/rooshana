package ir.mservices.market.app.update.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z50;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$1", f = "BaseAppUpdate.kt", l = {445}, m = "invokeSuspend", v = 1)
final class BaseAppUpdateViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppUpdateData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$1$2", f = "BaseAppUpdate.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ AppUpdateData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, AppUpdateData appUpdateData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = appUpdateData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(g51Var, this.c, this.b);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
            AppUpdateData appUpdateData = this.c;
            boolean z = appUpdateData.m;
            ApplicationStateDto applicationStateDto = appUpdateData.l;
            int i = a.X;
            this.b.A(zBooleanValue, z, applicationStateDto);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppUpdateViewHolder$onAttach$1(g51 g51Var, AppUpdateData appUpdateData, a aVar) {
        super(2, g51Var);
        this.b = appUpdateData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseAppUpdateViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAppUpdateViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AppUpdateData appUpdateData = this.b;
            z50 z50Var = new z50(appUpdateData.e, appUpdateData, 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, appUpdateData, this.c);
            this.a = 1;
            if (d.f(z50Var, anonymousClass2, this) == coroutineSingletons) {
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
