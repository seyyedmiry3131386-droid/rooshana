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
@tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {186}, m = "invokeSuspend", v = 1)
final class BasicTooltipKt$handleGestures$2$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {190}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public PointerEventPass b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ e71 e;

        /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {195}, m = "invokeSuspend", v = 1)
        final class C00021 extends SuspendLambda implements qp2 {
            public int a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00021(2, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00021 c00021 = (C00021) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00021.invokeSuspend(tx8Var);
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
            ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:12:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
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
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.b
                java.lang.Object r3 = r7.d
                androidx.compose.ui.input.pointer.e r3 = (androidx.compose.ui.input.pointer.e) r3
                kotlin.b.b(r8)
                goto L32
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.b.b(r8)
                java.lang.Object r8 = r7.d
                androidx.compose.ui.input.pointer.e r8 = (androidx.compose.ui.input.pointer.e) r8
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.b
                r3 = r8
            L25:
                r7.d = r3
                r7.b = r1
                r7.c = r2
                java.lang.Object r8 = r3.a(r1, r7)
                if (r8 != r0) goto L32
                return r0
            L32:
                vg6 r8 = (defpackage.vg6) r8
                java.util.List r4 = r8.a
                r5 = 0
                java.lang.Object r4 = r4.get(r5)
                ah6 r4 = (defpackage.ah6) r4
                int r4 = r4.i
                r5 = 2
                if (r4 != r5) goto L25
                int r8 = r8.f
                r4 = 4
                r6 = 0
                if (r8 != r4) goto L54
                androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r8 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                r8.<init>(r5, r6)
                r4 = 3
                e71 r5 = r7.e
                defpackage.bt2.G(r5, r6, r6, r8, r4)
                goto L25
            L54:
                r4 = 5
                if (r8 == r4) goto L58
                goto L25
            L58:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
