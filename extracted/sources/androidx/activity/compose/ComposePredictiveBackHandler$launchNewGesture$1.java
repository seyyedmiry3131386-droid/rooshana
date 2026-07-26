package androidx.activity.compose;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {227}, m = "invokeSuspend", v = 1)
final class ComposePredictiveBackHandler$launchNewGesture$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name */
    @tb1(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ComposePredictiveBackHandler$launchNewGesture$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((ComposePredictiveBackHandler$launchNewGesture$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        throw null;
    }
}
