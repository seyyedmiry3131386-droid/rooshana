package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.xg1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {208}, m = "invokeSuspend", v = 1)
final class DefaultScrollableState$scroll$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MutatePriority c;
    public final /* synthetic */ qp2 d;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {211}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ c c;
        public final /* synthetic */ qp2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.c = cVar;
            this.d = qp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((rg7) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            wb5 wb5Var = this.c.d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    rg7 rg7Var = (rg7) this.b;
                    ((s08) wb5Var).setValue(Boolean.TRUE);
                    qp2 qp2Var = this.d;
                    this.a = 1;
                    if (qp2Var.invoke(rg7Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                wb5Var = (s08) wb5Var;
                wb5Var.setValue(Boolean.FALSE);
                return tx8.a;
            } catch (Throwable th) {
                ((s08) wb5Var).setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(c cVar, MutatePriority mutatePriority, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = cVar;
        this.c = mutatePriority;
        this.d = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DefaultScrollableState$scroll$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultScrollableState$scroll$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.b;
            androidx.compose.foundation.l lVar = cVar.c;
            xg1 xg1Var = cVar.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.d, null);
            this.a = 1;
            if (lVar.c(xg1Var, this.c, anonymousClass1, this) == coroutineSingletons) {
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
