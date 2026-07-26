package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {162}, m = "invokeSuspend", v = 1)
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {166, 169, 175}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public PointerEventPass b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ e71 e;

        /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {172}, m = "invokeSuspend", v = 1)
        final class C00011 extends SuspendLambda implements qp2 {
            public int a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00011(2, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00011 c00011 = (C00011) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00011.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return tx8.a;
                }
                kotlin.b.b(obj);
                MutatePriority mutatePriority = MutatePriority.a;
                this.a = 1;
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e71 e71Var, g51 g51Var) {
            super(2, g51Var);
            this.e = e71Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, g51Var);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        
            if (r8 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.b.b(r8)
                goto L7e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.b
                java.lang.Object r4 = r7.d
                androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.e) r4
                kotlin.b.b(r8)
                goto L60
            L26:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.b
                java.lang.Object r5 = r7.d
                androidx.compose.ui.input.pointer.e r5 = (androidx.compose.ui.input.pointer.e) r5
                kotlin.b.b(r8)
                goto L49
            L30:
                kotlin.b.b(r8)
                java.lang.Object r8 = r7.d
                androidx.compose.ui.input.pointer.e r8 = (androidx.compose.ui.input.pointer.e) r8
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.a
                r7.d = r8
                r7.b = r1
                r7.c = r4
                java.lang.Object r5 = androidx.compose.foundation.gestures.p.c(r8, r7, r4)
                if (r5 != r0) goto L46
                goto L7d
            L46:
                r6 = r5
                r5 = r8
                r8 = r6
            L49:
                ah6 r8 = (defpackage.ah6) r8
                int r8 = r8.i
                if (r8 != r4) goto L50
                goto L52
            L50:
                if (r8 != r2) goto L95
            L52:
                r7.d = r5
                r7.b = r1
                r7.c = r3
                java.lang.Object r8 = androidx.compose.foundation.gestures.p.i(r5, r1, r7)
                if (r8 != r0) goto L5f
                goto L7d
            L5f:
                r4 = r5
            L60:
                me4 r8 = (defpackage.me4) r8
                boolean r8 = r8 instanceof defpackage.le4
                if (r8 == 0) goto L95
                androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r8 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                r5 = 0
                r8.<init>(r3, r5)
                e71 r3 = r7.e
                defpackage.bt2.G(r3, r5, r5, r8, r2)
                r7.d = r5
                r7.b = r5
                r7.c = r2
                java.lang.Object r8 = r4.a(r1, r7)
                if (r8 != r0) goto L7e
            L7d:
                return r0
            L7e:
                vg6 r8 = (defpackage.vg6) r8
                java.util.List r8 = r8.a
                int r0 = r8.size()
                r1 = 0
            L87:
                if (r1 >= r0) goto L95
                java.lang.Object r2 = r8.get(r1)
                ah6 r2 = (defpackage.ah6) r2
                r2.a()
                int r1 = r1 + 1
                goto L87
            L95:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
