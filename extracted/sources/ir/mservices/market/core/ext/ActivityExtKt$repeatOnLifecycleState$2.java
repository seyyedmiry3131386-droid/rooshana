package ir.mservices.market.core.ext;

import androidx.lifecycle.Lifecycle$State;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$2", f = "ActivityExt.kt", l = {95}, m = "invokeSuspend", v = 1)
final class ActivityExtKt$repeatOnLifecycleState$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseNavigationContentActivity b;
    public final /* synthetic */ Lifecycle$State c;
    public final /* synthetic */ dp2 d;

    /* JADX INFO: renamed from: ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$2$1", f = "ActivityExt.kt", l = {96}, m = "invokeSuspend", v = 1)
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
                b.b(obj);
                this.a = 1;
                if (this.b.invoke(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityExtKt$repeatOnLifecycleState$2(BaseNavigationContentActivity baseNavigationContentActivity, Lifecycle$State lifecycle$State, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = baseNavigationContentActivity;
        this.c = lifecycle$State;
        this.d = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ActivityExtKt$repeatOnLifecycleState$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityExtKt$repeatOnLifecycleState$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.d);
            this.a = 1;
            if (androidx.lifecycle.b.b(this.b, this.c, anonymousClass1, this) == coroutineSingletons) {
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
