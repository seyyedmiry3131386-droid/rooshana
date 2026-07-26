package androidx.lifecycle;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.i64;
import defpackage.qp2;
import defpackage.sg4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i64 c;
    public final /* synthetic */ Lifecycle$State d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @tb1(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public Ref$ObjectRef a;
        public Ref$ObjectRef b;
        public int c;
        public final /* synthetic */ i64 d;
        public final /* synthetic */ Lifecycle$State e;
        public final /* synthetic */ e71 f;
        public final /* synthetic */ SuspendLambda g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(i64 i64Var, Lifecycle$State lifecycle$State, e71 e71Var, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.d = i64Var;
            this.e = lifecycle$State;
            this.f = e71Var;
            this.g = (SuspendLambda) qp2Var;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.d, this.e, this.f, this.g, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r14.c
                r2 = 0
                tx8 r3 = defpackage.tx8.a
                i64 r4 = r14.d
                r5 = 1
                if (r1 == 0) goto L23
                if (r1 != r5) goto L1b
                kotlin.jvm.internal.Ref$ObjectRef r1 = r14.b
                kotlin.jvm.internal.Ref$ObjectRef r5 = r14.a
                kotlin.b.b(r15)     // Catch: java.lang.Throwable -> L17
                goto L8e
            L17:
                r0 = move-exception
                r15 = r0
                goto La4
            L1b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L23:
                kotlin.b.b(r15)
                androidx.lifecycle.Lifecycle$State r15 = r4.d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle$State.a
                if (r15 != r1) goto L2e
                goto La0
            L2e:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r15 = r14.e     // Catch: java.lang.Throwable -> La1
                e71 r9 = r14.f     // Catch: java.lang.Throwable -> La1
                kotlin.coroutines.jvm.internal.SuspendLambda r13 = r14.g     // Catch: java.lang.Throwable -> La1
                r14.a = r8     // Catch: java.lang.Throwable -> La1
                r14.b = r1     // Catch: java.lang.Throwable -> La1
                r14.c = r5     // Catch: java.lang.Throwable -> La1
                om0 r11 = new om0     // Catch: java.lang.Throwable -> La1
                g51 r6 = defpackage.ok4.I(r14)     // Catch: java.lang.Throwable -> La1
                r11.<init>(r5, r6)     // Catch: java.lang.Throwable -> La1
                r11.v()     // Catch: java.lang.Throwable -> La1
                r54 r5 = androidx.lifecycle.Lifecycle$Event.Companion     // Catch: java.lang.Throwable -> La1
                r5.getClass()     // Catch: java.lang.Throwable -> La1
                java.lang.String r5 = "state"
                defpackage.js3.p(r15, r5)     // Catch: java.lang.Throwable -> La1
                int r5 = r15.ordinal()     // Catch: java.lang.Throwable -> La1
                r6 = 2
                if (r5 == r6) goto L70
                r6 = 3
                if (r5 == r6) goto L6d
                r6 = 4
                if (r5 == r6) goto L69
                r7 = r2
                goto L73
            L69:
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle$Event.ON_RESUME     // Catch: java.lang.Throwable -> La1
            L6b:
                r7 = r5
                goto L73
            L6d:
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle$Event.ON_START     // Catch: java.lang.Throwable -> La1
                goto L6b
            L70:
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle$Event.ON_CREATE     // Catch: java.lang.Throwable -> La1
                goto L6b
            L73:
                androidx.lifecycle.Lifecycle$Event r10 = defpackage.r54.a(r15)     // Catch: java.lang.Throwable -> La1
                kotlinx.coroutines.sync.a r12 = new kotlinx.coroutines.sync.a     // Catch: java.lang.Throwable -> La1
                r12.<init>()     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.c r6 = new androidx.lifecycle.c     // Catch: java.lang.Throwable -> La1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La1
                r1.a = r6     // Catch: java.lang.Throwable -> La1
                r4.a(r6)     // Catch: java.lang.Throwable -> La1
                java.lang.Object r15 = r11.u()     // Catch: java.lang.Throwable -> La1
                if (r15 != r0) goto L8d
                return r0
            L8d:
                r5 = r8
            L8e:
                java.lang.Object r15 = r5.a
                wt3 r15 = (defpackage.wt3) r15
                if (r15 == 0) goto L97
                r15.g(r2)
            L97:
                java.lang.Object r15 = r1.a
                b64 r15 = (defpackage.b64) r15
                if (r15 == 0) goto La0
                r4.f(r15)
            La0:
                return r3
            La1:
                r0 = move-exception
                r15 = r0
                r5 = r8
            La4:
                java.lang.Object r0 = r5.a
                wt3 r0 = (defpackage.wt3) r0
                if (r0 == 0) goto Lad
                r0.g(r2)
            Lad:
                java.lang.Object r0 = r1.a
                b64 r0 = (defpackage.b64) r0
                if (r0 == 0) goto Lb6
                r4.f(r0)
            Lb6:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(i64 i64Var, Lifecycle$State lifecycle$State, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = i64Var;
        this.d = lifecycle$State;
        this.e = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.c, this.d, this.e, g51Var);
        repeatOnLifecycleKt$repeatOnLifecycle$3.b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e71 e71Var = (e71) this.b;
            ug1 ug1Var = up1.a;
            kotlinx.coroutines.android.a aVar = sg4.a.f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, e71Var, this.e, null);
            this.a = 1;
            if (bt2.Z(aVar, anonymousClass1, this) == coroutineSingletons) {
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
