package androidx.compose.foundation.text.input.internal;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.li1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ wt3 b;
        public final /* synthetic */ c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wt3 wt3Var, c cVar, g51 g51Var) {
            super(2, g51Var);
            this.b = wt3Var;
            this.c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (kotlinx.coroutines.a.d(r13, r12) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        
            if (kotlinx.coroutines.a.e(500, r12) != r2) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001b, B:33:0x006c, B:27:0x0057, B:30:0x0060, B:14:0x0029, B:15:0x002d, B:16:0x0035, B:23:0x004a, B:25:0x0051), top: B:37:0x0011 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0069 -> B:33:0x006c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                androidx.compose.foundation.text.input.internal.c r0 = r12.c
                l08 r1 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r3 = r12.a
                r4 = 0
                r5 = 500(0x1f4, double:2.47E-321)
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                if (r3 == 0) goto L3a
                if (r3 == r11) goto L36
                if (r3 == r10) goto L2d
                if (r3 == r9) goto L29
                if (r3 != r8) goto L21
                kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L1f
                goto L6c
            L1f:
                r13 = move-exception
                goto L70
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L29:
                kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L1f
                goto L60
            L2d:
                kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L1f
                kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
                r13.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r13     // Catch: java.lang.Throwable -> L1f
            L36:
                kotlin.b.b(r13)
                goto L4a
            L3a:
                kotlin.b.b(r13)
                wt3 r13 = r12.b
                if (r13 == 0) goto L4a
                r12.a = r11
                java.lang.Object r13 = kotlinx.coroutines.a.d(r13, r12)
                if (r13 != r2) goto L4a
                goto L6b
            L4a:
                r1.i(r7)     // Catch: java.lang.Throwable -> L1f
                boolean r13 = r0.a     // Catch: java.lang.Throwable -> L1f
                if (r13 != 0) goto L57
                r12.a = r10     // Catch: java.lang.Throwable -> L1f
                kotlinx.coroutines.a.b(r12)     // Catch: java.lang.Throwable -> L1f
                return r2
            L57:
                r12.a = r9     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r13 = kotlinx.coroutines.a.e(r5, r12)     // Catch: java.lang.Throwable -> L1f
                if (r13 != r2) goto L60
                goto L6b
            L60:
                r1.i(r4)     // Catch: java.lang.Throwable -> L1f
                r12.a = r8     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r13 = kotlinx.coroutines.a.e(r5, r12)     // Catch: java.lang.Throwable -> L1f
                if (r13 != r2) goto L6c
            L6b:
                return r2
            L6c:
                r1.i(r7)     // Catch: java.lang.Throwable -> L1f
                goto L57
            L70:
                r1.i(r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.b, g51Var);
        cursorAnimationState$snapToVisibleAndAnimate$2.a = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.a;
        c cVar = this.b;
        AtomicReference atomicReference = cVar.b;
        li1 li1VarG = bt2.G(e71Var, null, null, new AnonymousClass1((wt3) atomicReference.getAndSet(null), cVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, li1VarG)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
