package androidx.compose.ui.platform;

import defpackage.bp2;
import defpackage.ca6;
import defpackage.g51;
import defpackage.lo0;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.y44;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ y44 b;
    public final /* synthetic */ ca6 c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements bp2 {
        @Override // defpackage.bp2
        public final Object invoke() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    @tb1(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ y44 c;
        public final /* synthetic */ ca6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(y44 y44Var, ca6 ca6Var, g51 g51Var) {
            super(2, g51Var);
            this.c = y44Var;
            this.d = ca6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, this.d, g51Var);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            if (obj != null) {
                throw new ClassCastException();
            }
            ((AnonymousClass2) create(null, (g51) obj2)).invokeSuspend(tx8.a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw t61.q(obj);
            }
            kotlin.b.b(obj);
            if (this.b != null) {
                throw new ClassCastException();
            }
            this.a = 1;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(lo0 lo0Var, y44 y44Var, ca6 ca6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = y44Var;
        this.c = ca6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(null, this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create((tx8) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vb7 vb7VarL = androidx.compose.runtime.g.l(new AnonymousClass1(0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(vb7VarL, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
