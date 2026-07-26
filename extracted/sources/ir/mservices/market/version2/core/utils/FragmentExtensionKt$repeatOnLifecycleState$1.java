package ir.mservices.market.version2.core.utils;

import androidx.lifecycle.Lifecycle$State;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.FragmentExtensionKt$repeatOnLifecycleState$1", f = "FragmentExtension.kt", l = {17}, m = "invokeSuspend", v = 1)
final class FragmentExtensionKt$repeatOnLifecycleState$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.fragment.app.d b;
    public final /* synthetic */ Lifecycle$State c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX INFO: renamed from: ir.mservices.market.version2.core.utils.FragmentExtensionKt$repeatOnLifecycleState$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.core.utils.FragmentExtensionKt$repeatOnLifecycleState$1$1", f = "FragmentExtension.kt", l = {18}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ SuspendLambda b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(g51 g51Var, dp2 dp2Var) {
            super(2, g51Var);
            this.b = (SuspendLambda) dp2Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (this.b.invoke(this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentExtensionKt$repeatOnLifecycleState$1(androidx.fragment.app.d dVar, Lifecycle$State lifecycle$State, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
        this.c = lifecycle$State;
        this.d = (SuspendLambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FragmentExtensionKt$repeatOnLifecycleState$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FragmentExtensionKt$repeatOnLifecycleState$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.d);
            this.a = 1;
            if (androidx.lifecycle.b.b(this.b, this.c, anonymousClass1, this) == coroutineSingletons) {
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
