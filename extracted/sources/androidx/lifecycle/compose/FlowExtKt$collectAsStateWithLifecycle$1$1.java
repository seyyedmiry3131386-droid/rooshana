package androidx.lifecycle.compose;

import androidx.compose.runtime.h;
import androidx.lifecycle.Lifecycle$State;
import defpackage.cf2;
import defpackage.e71;
import defpackage.g51;
import defpackage.i64;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend", v = 1)
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i64 c;
    public final /* synthetic */ Lifecycle$State d;
    public final /* synthetic */ w61 e;
    public final /* synthetic */ xe2 f;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ w61 b;
        public final /* synthetic */ xe2 c;
        public final /* synthetic */ h d;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        @tb1(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ xe2 b;
            public final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(xe2 xe2Var, h hVar, g51 g51Var) {
                super(2, g51Var);
                this.b = xe2Var;
                this.c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass2(this.b, this.c, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    b.b(obj);
                    cf2 cf2Var = new cf2(this.c, 1);
                    this.a = 1;
                    if (this.b.a(cf2Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return tx8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(w61 w61Var, xe2 xe2Var, h hVar, g51 g51Var) {
            super(2, g51Var);
            this.b = w61Var;
            this.c = xe2Var;
            this.d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.a(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (defpackage.bt2.Z(r1, r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r6.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                kotlin.b.b(r7)
                goto L48
            L19:
                kotlin.b.b(r7)
                kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.a
                w61 r1 = r6.b
                boolean r7 = defpackage.js3.i(r1, r7)
                androidx.compose.runtime.h r4 = r6.d
                xe2 r5 = r6.c
                if (r7 == 0) goto L39
                cf2 r7 = new cf2
                r1 = 0
                r7.<init>(r4, r1)
                r6.a = r3
                java.lang.Object r7 = r5.a(r7, r6)
                if (r7 != r0) goto L48
                goto L47
            L39:
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r7 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                r3 = 0
                r7.<init>(r5, r4, r3)
                r6.a = r2
                java.lang.Object r7 = defpackage.bt2.Z(r1, r7, r6)
                if (r7 != r0) goto L48
            L47:
                return r0
            L48:
                tx8 r7 = defpackage.tx8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(i64 i64Var, Lifecycle$State lifecycle$State, w61 w61Var, xe2 xe2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = i64Var;
        this.d = lifecycle$State;
        this.e = w61Var;
        this.f = xe2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.c, this.d, this.e, this.f, g51Var);
        flowExtKt$collectAsStateWithLifecycle$1$1.b = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create((h) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            h hVar = (h) this.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.f, hVar, null);
            this.a = 1;
            if (androidx.lifecycle.b.c(this.c, this.d, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
