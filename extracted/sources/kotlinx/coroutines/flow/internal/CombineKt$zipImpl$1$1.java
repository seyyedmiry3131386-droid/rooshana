package kotlinx.coroutines.flow.internal;

import defpackage.e71;
import defpackage.g51;
import defpackage.qk6;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import defpackage.xt3;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements qp2 {
    public xt3 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xe2 d;
    public final /* synthetic */ xe2 e;
    public final /* synthetic */ ze2 f;
    public final /* synthetic */ rp2 g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    @tb1(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ xe2 b;
        public final /* synthetic */ w61 c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ qk6 e;
        public final /* synthetic */ ze2 f;
        public final /* synthetic */ rp2 g;
        public final /* synthetic */ xt3 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(xe2 xe2Var, w61 w61Var, Object obj, qk6 qk6Var, ze2 ze2Var, rp2 rp2Var, xt3 xt3Var, g51 g51Var) {
            super(2, g51Var);
            this.b = xe2Var;
            this.c = w61Var;
            this.d = obj;
            this.e = qk6Var;
            this.f = ze2Var;
            this.g = rp2Var;
            this.h = xt3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tx8) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = new h(this.c, this.d, this.e, this.f, this.g, this.h);
                this.a = 1;
                if (this.b.a(hVar, this) == coroutineSingletons) {
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
    public CombineKt$zipImpl$1$1(xe2 xe2Var, xe2 xe2Var2, ze2 ze2Var, rp2 rp2Var, g51 g51Var) {
        super(2, g51Var);
        this.d = xe2Var;
        this.e = xe2Var2;
        this.f = ze2Var;
        this.g = rp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.d, this.e, this.f, this.g, g51Var);
        combineKt$zipImpl$1$1.c = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:6:0x0015, B:32:0x008a, B:36:0x0092), top: B:39:0x0015 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r1.b
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L27
            if (r2 != r4) goto L1f
            xt3 r2 = r1.a
            java.lang.Object r0 = r1.c
            r4 = r0
            pw6 r4 = (defpackage.pw6) r4
            kotlin.b.b(r19)     // Catch: java.lang.Throwable -> L19 kotlinx.coroutines.flow.internal.AbortFlowException -> L1c
            goto L79
        L19:
            r0 = move-exception
            goto L93
        L1c:
            r0 = move-exception
            goto L8a
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L27:
            kotlin.b.b(r19)
            java.lang.Object r2 = r1.c
            e71 r2 = (defpackage.e71) r2
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            xe2 r7 = r1.d
            r6.<init>(r7, r5)
            r7 = 3
            r8 = 0
            qk6 r13 = kotlinx.coroutines.channels.b.c(r2, r8, r6, r7)
            xt3 r6 = kotlinx.coroutines.a.a()
            ah0 r7 = new ah0
            r8 = 1
            r7.<init>(r8, r6)
            r13.a(r7)
            w61 r11 = r2.getCoroutineContext()     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            java.lang.Object r12 = defpackage.is3.M(r11)     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            w61 r2 = r2.getCoroutineContext()     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            w61 r2 = r2.l0(r6)     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r9 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            xe2 r10 = r1.e     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            ze2 r14 = r1.f     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            rp2 r15 = r1.g     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            r17 = 0
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L86
            r1.c = r13     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            r1.a = r6     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            r1.b = r4     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            java.lang.Object r4 = defpackage.is3.M(r2)     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            java.lang.Object r2 = defpackage.ct2.C(r2, r3, r4, r9, r1)     // Catch: java.lang.Throwable -> L82 kotlinx.coroutines.flow.internal.AbortFlowException -> L84
            if (r2 != r0) goto L78
            return r0
        L78:
            r4 = r13
        L79:
            r4.g(r5)
            return r3
        L7d:
            r4 = r13
            goto L93
        L7f:
            r2 = r6
            r4 = r13
            goto L8a
        L82:
            r0 = move-exception
            goto L7d
        L84:
            r0 = move-exception
            goto L7f
        L86:
            r0 = move-exception
            r6 = r16
            goto L7f
        L8a:
            java.lang.Object r6 = r0.a     // Catch: java.lang.Throwable -> L19
            if (r6 != r2) goto L92
            r4.g(r5)
            return r3
        L92:
            throw r0     // Catch: java.lang.Throwable -> L19
        L93:
            r4.g(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
