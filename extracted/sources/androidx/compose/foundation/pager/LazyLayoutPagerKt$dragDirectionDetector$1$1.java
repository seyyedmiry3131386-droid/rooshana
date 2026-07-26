package androidx.compose.foundation.pager;

import androidx.compose.ui.input.pointer.e;
import defpackage.ah6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend", v = 1)
final class LazyLayoutPagerKt$dragDirectionDetector$1$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public ah6 b;
        public int c;
        public /* synthetic */ Object d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, g51Var);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        
            if (r11 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r10.c
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L5d
                if (r1 == r4) goto L55
                r4 = 2
                if (r1 != r4) goto L4d
                ah6 r1 = r10.b
                java.lang.Object r5 = r10.d
                androidx.compose.ui.input.pointer.e r5 = (androidx.compose.ui.input.pointer.e) r5
                kotlin.b.b(r11)
            L17:
                vg6 r11 = (defpackage.vg6) r11
                java.util.List r6 = r11.a
                int r7 = r6.size()
                r8 = r3
            L20:
                if (r8 >= r7) goto L32
                java.lang.Object r9 = r6.get(r8)
                ah6 r9 = (defpackage.ah6) r9
                boolean r9 = defpackage.at2.P(r9)
                if (r9 != 0) goto L2f
                goto L3b
            L2f:
                int r8 = r8 + 1
                goto L20
            L32:
                java.util.List r11 = r11.a
                java.lang.Object r11 = r11.get(r3)
                ah6 r11 = (defpackage.ah6) r11
                r1 = r11
            L3b:
                if (r1 != 0) goto L4c
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.a
                r10.d = r5
                r10.b = r1
                r10.c = r4
                java.lang.Object r11 = r5.a(r11, r10)
                if (r11 != r0) goto L17
                goto L70
            L4c:
                throw r2
            L4d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L55:
                java.lang.Object r0 = r10.d
                androidx.compose.ui.input.pointer.e r0 = (androidx.compose.ui.input.pointer.e) r0
                kotlin.b.b(r11)
                goto L71
            L5d:
                kotlin.b.b(r11)
                java.lang.Object r11 = r10.d
                androidx.compose.ui.input.pointer.e r11 = (androidx.compose.ui.input.pointer.e) r11
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.a
                r10.d = r11
                r10.c = r4
                java.lang.Object r11 = androidx.compose.foundation.gestures.p.b(r11, r3, r1, r10)
                if (r11 != r0) goto L71
            L70:
                return r0
            L71:
                ah6 r11 = (defpackage.ah6) r11
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
        b.b(obj);
        throw null;
    }
}
