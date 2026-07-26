package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.dp2;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eh6 c;
    public final /* synthetic */ rp2 d;
    public final /* synthetic */ dp2 e;
    public final /* synthetic */ dp2 f;
    public final /* synthetic */ dp2 g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends RestrictedSuspendLambda implements qp2 {
        public Object b;
        public Object c;
        public ah6 d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ e71 g;
        public final /* synthetic */ rp2 h;
        public final /* synthetic */ dp2 i;
        public final /* synthetic */ dp2 j;
        public final /* synthetic */ dp2 k;
        public final /* synthetic */ j l;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend", v = 1)
        final class C00041 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ rp2 b;
            public final /* synthetic */ j c;
            public final /* synthetic */ ah6 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(rp2 rp2Var, j jVar, ah6 ah6Var, g51 g51Var) {
                super(2, g51Var);
                this.b = rp2Var;
                this.c = jVar;
                this.d = ah6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00041(this.b, this.c, this.d, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00041) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
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
                this.a.b();
                return tx8.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
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
                this.a.a();
                return tx8.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass4 extends SuspendLambda implements qp2 {
            public final /* synthetic */ j a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(j jVar, g51 g51Var) {
                super(2, g51Var);
                this.a = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass4(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass4.invokeSuspend(tx8Var);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend", v = 1)
        final class AnonymousClass5 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ wt3 b;
            public final /* synthetic */ j c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(wt3 wt3Var, j jVar, g51 g51Var) {
                super(2, g51Var);
                this.b = wt3Var;
                this.c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass5(this.b, this.c, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass5) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
            
                if (r4.c.c(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                    int r1 = r4.a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    kotlin.b.b(r5)
                    goto L35
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    kotlin.b.b(r5)
                    goto L2a
                L1c:
                    kotlin.b.b(r5)
                    r4.a = r3
                    wt3 r5 = r4.b
                    java.lang.Object r5 = r5.D(r4)
                    if (r5 != r0) goto L2a
                    goto L34
                L2a:
                    r4.a = r2
                    androidx.compose.foundation.gestures.j r5 = r4.c
                    java.lang.Object r5 = r5.c(r4)
                    if (r5 != r0) goto L35
                L34:
                    return r0
                L35:
                    tx8 r5 = defpackage.tx8.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend", v = 1)
        final class AnonymousClass6 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ rp2 b;
            public final /* synthetic */ j c;
            public final /* synthetic */ ah6 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(rp2 rp2Var, j jVar, ah6 ah6Var, g51 g51Var) {
                super(2, g51Var);
                this.b = rp2Var;
                this.c = jVar;
                this.d = ah6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass6(this.b, this.c, this.d, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass6) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass7 extends SuspendLambda implements qp2 {
            public final /* synthetic */ j a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(j jVar, g51 g51Var) {
                super(2, g51Var);
                this.a = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass7(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass7 anonymousClass7 = (AnonymousClass7) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass7.invokeSuspend(tx8Var);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        @tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass8 extends SuspendLambda implements qp2 {
            public final /* synthetic */ j a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(j jVar, g51 g51Var) {
                super(2, g51Var);
                this.a = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass8(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass8 anonymousClass8 = (AnonymousClass8) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass8.invokeSuspend(tx8Var);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e71 e71Var, rp2 rp2Var, dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, j jVar, g51 g51Var) {
            super(2, g51Var);
            this.g = e71Var;
            this.h = rp2Var;
            this.i = dp2Var;
            this.j = dp2Var2;
            this.k = dp2Var3;
            this.l = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.g, this.h, this.i, this.j, this.k, this.l, g51Var);
            anonymousClass1.f = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x024f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 648
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(eh6 eh6Var, rp2 rp2Var, dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, g51 g51Var) {
        super(2, g51Var);
        this.c = eh6Var;
        this.d = rp2Var;
        this.e = dp2Var;
        this.f = dp2Var2;
        this.g = dp2Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.c, this.d, this.e, this.f, this.g, g51Var);
        tapGestureDetectorKt$detectTapGestures$2.b = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e71 e71Var = (e71) this.b;
            eh6 eh6Var = this.c;
            j jVar = new j(eh6Var);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(e71Var, this.d, this.e, this.f, this.g, jVar, null);
            this.a = 1;
            if (h.e(eh6Var, anonymousClass1, this) == coroutineSingletons) {
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
