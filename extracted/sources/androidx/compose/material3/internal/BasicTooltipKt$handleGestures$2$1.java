package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.p;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
final class BasicTooltipKt$handleGestures$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eh6 c;
    public final /* synthetic */ p d;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public PointerEventPass b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ e71 e;
        public final /* synthetic */ p f;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
        final class C00111 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ p b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00111(p pVar, g51 g51Var) {
                super(2, g51Var);
                this.b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00111(this.b, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00111) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    MutatePriority mutatePriority = MutatePriority.b;
                    this.a = 1;
                    if (this.b.c(mutatePriority, this) == coroutineSingletons) {
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
        public AnonymousClass1(e71 e71Var, p pVar, g51 g51Var) {
            super(2, g51Var);
            this.e = e71Var;
            this.f = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.f, g51Var);
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
                androidx.compose.material3.p r5 = r7.f
                if (r8 != r4) goto L56
                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r8 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                r4 = 0
                r8.<init>(r5, r4)
                r5 = 3
                e71 r6 = r7.e
                defpackage.bt2.G(r6, r4, r4, r8, r5)
                goto L25
            L56:
                r4 = 5
                if (r8 != r4) goto L25
                r5.a()
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$2$1(eh6 eh6Var, p pVar, g51 g51Var) {
        super(2, g51Var);
        this.c = eh6Var;
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BasicTooltipKt$handleGestures$2$1 basicTooltipKt$handleGestures$2$1 = new BasicTooltipKt$handleGestures$2$1(this.c, this.d, g51Var);
        basicTooltipKt$handleGestures$2$1.b = obj;
        return basicTooltipKt$handleGestures$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((e71) this.b, this.d, null);
            this.a = 1;
            if (((androidx.compose.ui.input.pointer.f) this.c).C0(anonymousClass1, this) == coroutineSingletons) {
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
