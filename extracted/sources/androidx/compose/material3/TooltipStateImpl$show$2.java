package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
final class TooltipStateImpl$show$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ MutatePriority d;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ dp2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, dp2 dp2Var) {
            super(2, g51Var);
            this.b = dp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (((TooltipStateImpl$show$cancellableShow$1) this.b).invoke(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$2(p pVar, dp2 dp2Var, MutatePriority mutatePriority, g51 g51Var) {
        super(1, g51Var);
        this.b = pVar;
        this.c = dp2Var;
        this.d = mutatePriority;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TooltipStateImpl$show$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dp2 dp2Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        MutatePriority mutatePriority = this.d;
        p pVar = this.b;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, dp2Var);
                this.a = 2;
                if (kotlinx.coroutines.a.m(1500L, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            if (mutatePriority != MutatePriority.c) {
                pVar.a();
            }
            return tx8.a;
        } finally {
            if (mutatePriority != MutatePriority.c) {
                pVar.a();
            }
        }
    }
}
