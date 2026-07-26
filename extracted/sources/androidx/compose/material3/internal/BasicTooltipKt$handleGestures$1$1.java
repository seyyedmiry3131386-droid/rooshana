package androidx.compose.material3.internal;

import androidx.compose.material3.p;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {203}, m = "invokeSuspend")
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eh6 c;
    public final /* synthetic */ p d;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public xb5 b;
        public PointerEventPass c;
        public long d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ e71 g;
        public final /* synthetic */ p h;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
        final class C00091 extends RestrictedSuspendLambda implements qp2 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ PointerEventPass d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(PointerEventPass pointerEventPass, g51 g51Var) {
                super(2, g51Var);
                this.d = pointerEventPass;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00091 c00091 = new C00091(this.d, g51Var);
                c00091.c = obj;
                return c00091;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00091) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.e eVar = (androidx.compose.ui.input.pointer.e) this.c;
                this.b = 1;
                Object objJ = androidx.compose.foundation.gestures.p.j(eVar, this.d, this);
                return objJ == coroutineSingletons ? coroutineSingletons : objJ;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
        @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
        final class AnonymousClass3 extends SuspendLambda implements qp2 {
            public Throwable a;
            public int b;
            public final /* synthetic */ xb5 c;
            public final /* synthetic */ p d;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
            @tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
            final class C00101 extends SuspendLambda implements qp2 {
                public /* synthetic */ boolean a;
                public final /* synthetic */ p b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00101(p pVar, g51 g51Var) {
                    super(2, g51Var);
                    this.b = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    C00101 c00101 = new C00101(this.b, g51Var);
                    c00101.a = ((Boolean) obj).booleanValue();
                    return c00101;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    C00101 c00101 = (C00101) create(bool, (g51) obj2);
                    tx8 tx8Var = tx8.a;
                    c00101.invokeSuspend(tx8Var);
                    return tx8Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    kotlin.b.b(obj);
                    if (!this.a) {
                        this.b.a();
                    }
                    return tx8.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(xb5 xb5Var, p pVar, g51 g51Var) {
                super(2, g51Var);
                this.c = xb5Var;
                this.d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass3(this.c, this.d, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
            
                if (kotlinx.coroutines.flow.d.f(r6, r9, r8) == r0) goto L30;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                    int r1 = r8.b
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    xb5 r6 = r8.c
                    androidx.compose.material3.p r7 = r8.d
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L26
                    if (r1 == r4) goto L22
                    if (r1 == r3) goto L1c
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    java.lang.Throwable r0 = r8.a
                    kotlin.b.b(r9)
                    goto L73
                L22:
                    kotlin.b.b(r9)
                    goto L59
                L26:
                    kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L2a
                    goto L45
                L2a:
                    r9 = move-exception
                    goto L5c
                L2c:
                    kotlin.b.b(r9)
                    java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
                    r1 = r6
                    kotlinx.coroutines.flow.l r1 = (kotlinx.coroutines.flow.l) r1     // Catch: java.lang.Throwable -> L2a
                    r1.getClass()     // Catch: java.lang.Throwable -> L2a
                    r1.p(r2, r9)     // Catch: java.lang.Throwable -> L2a
                    androidx.compose.foundation.MutatePriority r9 = androidx.compose.foundation.MutatePriority.c     // Catch: java.lang.Throwable -> L2a
                    r8.b = r5     // Catch: java.lang.Throwable -> L2a
                    java.lang.Object r9 = r7.c(r9, r8)     // Catch: java.lang.Throwable -> L2a
                    if (r9 != r0) goto L45
                    goto L71
                L45:
                    boolean r9 = r7.b()
                    if (r9 == 0) goto L59
                    androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1 r9 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1
                    r9.<init>(r7, r2)
                    r8.b = r4
                    java.lang.Object r9 = kotlinx.coroutines.flow.d.f(r6, r9, r8)
                    if (r9 != r0) goto L59
                    goto L71
                L59:
                    tx8 r9 = defpackage.tx8.a
                    return r9
                L5c:
                    boolean r1 = r7.b()
                    if (r1 == 0) goto L74
                    androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1 r1 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1
                    r1.<init>(r7, r2)
                    r8.a = r9
                    r8.b = r3
                    java.lang.Object r1 = kotlinx.coroutines.flow.d.f(r6, r1, r8)
                    if (r1 != r0) goto L72
                L71:
                    return r0
                L72:
                    r0 = r9
                L73:
                    r9 = r0
                L74:
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e71 e71Var, p pVar, g51 g51Var) {
            super(2, g51Var);
            this.g = e71Var;
            this.h = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.g, this.h, g51Var);
            anonymousClass1.f = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c3, B:43:0x00c7), top: B:55:0x0014 }] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v11, types: [xb5] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(eh6 eh6Var, p pVar, g51 g51Var) {
        super(2, g51Var);
        this.c = eh6Var;
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.c, this.d, g51Var);
        basicTooltipKt$handleGestures$1$1.b = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((e71) this.b, this.d, null);
            this.a = 1;
            if (androidx.compose.foundation.gestures.h.e(this.c, anonymousClass1, this) == coroutineSingletons) {
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
