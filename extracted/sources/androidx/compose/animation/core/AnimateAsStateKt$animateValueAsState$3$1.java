package androidx.compose.animation.core;

import defpackage.cp0;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lh0;
import defpackage.o38;
import defpackage.qp2;
import defpackage.s08;
import defpackage.sk;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend", v = 1)
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cp0 d;
    public final /* synthetic */ a e;
    public final /* synthetic */ wb5 f;
    public final /* synthetic */ wb5 g;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ a c;
        public final /* synthetic */ wb5 d;
        public final /* synthetic */ wb5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, a aVar, wb5 wb5Var, wb5 wb5Var2, g51 g51Var) {
            super(2, g51Var);
            this.b = obj;
            this.c = aVar;
            this.d = wb5Var;
            this.e = wb5Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            a aVar = this.c;
            if (i == 0) {
                kotlin.b.b(obj);
                if (js3.i(this.b, ((s08) aVar.e).getValue())) {
                    return tx8.a;
                }
                o38 o38Var = b.a;
                sk skVar = (sk) this.d.getValue();
                this.a = 1;
                anonymousClass1 = this;
                if (a.b(this.c, this.b, skVar, null, null, anonymousClass1, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                anonymousClass1 = this;
            }
            o38 o38Var2 = b.a;
            dp2 dp2Var = (dp2) anonymousClass1.e.getValue();
            if (dp2Var != null) {
                dp2Var.invoke(aVar.d());
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(cp0 cp0Var, a aVar, wb5 wb5Var, wb5 wb5Var2, g51 g51Var) {
        super(2, g51Var);
        this.d = cp0Var;
        this.e = aVar;
        this.f = wb5Var;
        this.g = wb5Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.d, this.e, this.f, this.g, g51Var);
        animateAsStateKt$animateValueAsState$3$1.c = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r12.b
            cp0 r2 = r12.d
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            lh0 r1 = r12.a
            java.lang.Object r4 = r12.c
            e71 r4 = (defpackage.e71) r4
            kotlin.b.b(r13)
            goto L36
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.b.b(r13)
            java.lang.Object r13 = r12.c
            e71 r13 = (defpackage.e71) r13
            lh0 r1 = r2.iterator()
            r4 = r13
        L29:
            r12.c = r4
            r12.a = r1
            r12.b = r3
            java.lang.Object r13 = r1.d(r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L61
            java.lang.Object r13 = r1.f()
            java.lang.Object r5 = r2.i()
            java.lang.Object r5 = defpackage.jp0.b(r5)
            if (r5 != 0) goto L4e
            r7 = r13
            goto L4f
        L4e:
            r7 = r5
        L4f:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r6 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            wb5 r10 = r12.g
            r11 = 0
            androidx.compose.animation.core.a r8 = r12.e
            wb5 r9 = r12.f
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            r5 = 0
            defpackage.bt2.G(r4, r5, r5, r6, r13)
            goto L29
        L61:
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
