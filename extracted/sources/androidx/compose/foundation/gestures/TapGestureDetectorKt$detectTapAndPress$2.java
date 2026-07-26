package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.dp2;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.li1;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eh6 c;
    public final /* synthetic */ SuspendLambda d;
    public final /* synthetic */ dp2 e;
    public final /* synthetic */ j f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public li1 b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ e71 e;
        public final /* synthetic */ SuspendLambda f;
        public final /* synthetic */ dp2 g;
        public final /* synthetic */ j h;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
        final class C00031 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ SuspendLambda b;
            public final /* synthetic */ j c;
            public final /* synthetic */ ah6 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00031(rp2 rp2Var, j jVar, ah6 ah6Var, g51 g51Var) {
                super(2, g51Var);
                this.b = (SuspendLambda) rp2Var;
                this.c = jVar;
                this.d = ah6Var;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00031(this.b, this.c, this.d, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00031) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    nr5 nr5Var = new nr5(this.d.c);
                    this.a = 1;
                    if (this.b.a(this.c, nr5Var, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public final /* synthetic */ j a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(j jVar, g51 g51Var) {
                super(2, g51Var);
                this.a = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass2(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass2.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                this.a.a();
                return tx8.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass3 extends SuspendLambda implements qp2 {
            public final /* synthetic */ j a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(j jVar, g51 g51Var) {
                super(2, g51Var);
                this.a = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass3(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass3.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                this.a.b();
                return tx8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(e71 e71Var, rp2 rp2Var, dp2 dp2Var, j jVar, g51 g51Var) {
            super(2, g51Var);
            this.e = e71Var;
            this.f = (SuspendLambda) rp2Var;
            this.g = dp2Var;
            this.h = jVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.f, this.g, this.h, g51Var);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
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
                e71 r2 = r10.e
                r3 = 2
                r4 = 1
                androidx.compose.foundation.gestures.j r5 = r10.h
                r6 = 0
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r0 = r10.d
                wt3 r0 = (defpackage.wt3) r0
                kotlin.b.b(r11)
                goto L73
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                li1 r1 = r10.b
                java.lang.Object r4 = r10.d
                androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.e) r4
                kotlin.b.b(r11)
                goto L50
            L2b:
                kotlin.b.b(r11)
                java.lang.Object r11 = r10.d
                androidx.compose.ui.input.pointer.e r11 = (androidx.compose.ui.input.pointer.e) r11
                rp2 r1 = androidx.compose.foundation.gestures.p.a
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.d
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                r7.<init>(r5, r6)
                li1 r1 = defpackage.bt2.G(r2, r6, r1, r7, r4)
                r10.d = r11
                r10.b = r1
                r10.c = r4
                r4 = 3
                java.lang.Object r4 = androidx.compose.foundation.gestures.p.c(r11, r10, r4)
                if (r4 != r0) goto L4d
                goto L71
            L4d:
                r9 = r4
                r4 = r11
                r11 = r9
            L50:
                ah6 r11 = (defpackage.ah6) r11
                r11.a()
                rp2 r7 = androidx.compose.foundation.gestures.p.a
                kotlin.coroutines.jvm.internal.SuspendLambda r8 = r10.f
                if (r8 == r7) goto L63
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                r7.<init>(r8, r5, r11, r6)
                androidx.compose.foundation.gestures.p.h(r2, r1, r7)
            L63:
                r10.d = r1
                r10.b = r6
                r10.c = r3
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.b
                java.lang.Object r11 = androidx.compose.foundation.gestures.p.j(r4, r11, r10)
                if (r11 != r0) goto L72
            L71:
                return r0
            L72:
                r0 = r1
            L73:
                ah6 r11 = (defpackage.ah6) r11
                if (r11 != 0) goto L80
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r11 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                r11.<init>(r5, r6)
                androidx.compose.foundation.gestures.p.h(r2, r0, r11)
                goto L97
            L80:
                r11.a()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                r1.<init>(r5, r6)
                androidx.compose.foundation.gestures.p.h(r2, r0, r1)
                long r0 = r11.c
                nr5 r11 = new nr5
                r11.<init>(r0)
                dp2 r0 = r10.g
                r0.invoke(r11)
            L97:
                tx8 r11 = defpackage.tx8.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(eh6 eh6Var, rp2 rp2Var, dp2 dp2Var, j jVar, g51 g51Var) {
        super(2, g51Var);
        this.c = eh6Var;
        this.d = (SuspendLambda) rp2Var;
        this.e = dp2Var;
        this.f = jVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.c, this.d, this.e, this.f, g51Var);
        tapGestureDetectorKt$detectTapAndPress$2.b = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((e71) this.b, this.d, this.e, this.f, null);
            this.a = 1;
            if (h.e(this.c, anonymousClass1, this) == coroutineSingletons) {
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
