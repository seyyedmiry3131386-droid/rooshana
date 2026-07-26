package androidx.compose.material3;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
final class SliderKt$rangeSliderPressDragModifier$1$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {2438, 2450, 2473}, m = "invokeSuspend")
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ e71 d;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
        @tb1(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {2493}, m = "invokeSuspend")
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                throw null;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e71 e71Var, g51 g51Var) {
            super(2, g51Var);
            this.d = e71Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, g51Var);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            throw null;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r5.b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L3f
                if (r1 == r3) goto L37
                if (r1 == r2) goto L27
                r0 = 3
                if (r1 != r0) goto L1f
                java.lang.Object r0 = r5.c
                wu1 r0 = (defpackage.wu1) r0
                kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L1e
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L1e
                r6.getClass()     // Catch: java.lang.Throwable -> L1d java.util.concurrent.CancellationException -> L1e
                throw r4
            L1d:
                throw r4
            L1e:
                throw r4
            L1f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L27:
                java.lang.Object r0 = r5.c
                androidx.compose.ui.input.pointer.e r0 = (androidx.compose.ui.input.pointer.e) r0
                kotlin.b.b(r6)
                kotlin.Pair r6 = (kotlin.Pair) r6
                r6.getClass()
                r0.c()
                throw r4
            L37:
                java.lang.Object r0 = r5.c
                androidx.compose.ui.input.pointer.e r0 = (androidx.compose.ui.input.pointer.e) r0
                kotlin.b.b(r6)
                goto L51
            L3f:
                kotlin.b.b(r6)
                java.lang.Object r6 = r5.c
                androidx.compose.ui.input.pointer.e r6 = (androidx.compose.ui.input.pointer.e) r6
                r5.c = r6
                r5.b = r3
                java.lang.Object r6 = androidx.compose.foundation.gestures.p.c(r6, r5, r2)
                if (r6 != r0) goto L51
                return r0
            L51:
                ah6 r6 = (defpackage.ah6) r6
                kotlin.jvm.internal.Ref$FloatRef r6 = new kotlin.jvm.internal.Ref$FloatRef
                r6.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
