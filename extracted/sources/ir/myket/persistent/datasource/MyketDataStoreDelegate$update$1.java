package ir.myket.persistent.datasource;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.bj6;
import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.datasource.MyketDataStoreDelegate$update$1", f = "MyketDataStoreDelegate.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
final class MyketDataStoreDelegate$update$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ eb1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ bj6 d;

    /* JADX INFO: renamed from: ir.myket.persistent.datasource.MyketDataStoreDelegate$update$1$1, reason: invalid class name */
    @tb1(c = "ir.myket.persistent.datasource.MyketDataStoreDelegate$update$1$1", f = "MyketDataStoreDelegate.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ bj6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, bj6 bj6Var, g51 g51Var) {
            super(2, g51Var);
            this.b = obj;
            this.c = bj6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((pb5) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pb5 pb5Var = (pb5) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            bj6 bj6Var = this.c;
            Object obj2 = this.b;
            if (obj2 == null) {
                pb5Var.d(bj6Var);
            } else {
                pb5Var.e(bj6Var, obj2);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketDataStoreDelegate$update$1(g51 g51Var, eb1 eb1Var, bj6 bj6Var, Object obj) {
        super(2, g51Var);
        this.b = eb1Var;
        this.c = obj;
        this.d = bj6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Object obj2 = this.c;
        return new MyketDataStoreDelegate$update$1(g51Var, this.b, this.d, obj2);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyketDataStoreDelegate$update$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, null);
            this.a = 1;
            if (androidx.datastore.preferences.core.b.a(this.b, anonymousClass1, this) == coroutineSingletons) {
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
