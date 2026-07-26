package androidx.paging;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lh0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend", v = 1)
final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    @tb1(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {62, 63}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public lh0 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ze2 d;
        public final /* synthetic */ SuspendLambda e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ze2 ze2Var, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.d = ze2Var;
            this.e = (SuspendLambda) qp2Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.e, g51Var);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r8.d.emit(r9, r8) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0072 -> B:7:0x0016). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r8.b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                lh0 r1 = r8.a
                java.lang.Object r5 = r8.c
                wt3 r5 = (defpackage.wt3) r5
                kotlin.b.b(r9)
            L16:
                r9 = r5
                r5 = r1
                goto L49
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                lh0 r1 = r8.a
                java.lang.Object r5 = r8.c
                wt3 r5 = (defpackage.wt3) r5
                kotlin.b.b(r9)
                goto L5a
            L2b:
                kotlin.b.b(r9)
                java.lang.Object r9 = r8.c
                e71 r9 = (defpackage.e71) r9
                r1 = 0
                r5 = 6
                kotlinx.coroutines.channels.a r1 = defpackage.dt2.b(r1, r5, r4)
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r5 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                kotlin.coroutines.jvm.internal.SuspendLambda r6 = r8.e
                r5.<init>(r1, r6, r4)
                r6 = 3
                li1 r9 = defpackage.bt2.G(r9, r4, r4, r5, r6)
                lh0 r5 = new lh0
                r5.<init>(r1)
            L49:
                r8.c = r9
                r8.a = r5
                r8.b = r3
                java.lang.Object r1 = r5.d(r8)
                if (r1 != r0) goto L56
                goto L74
            L56:
                r7 = r5
                r5 = r9
                r9 = r1
                r1 = r7
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L75
                java.lang.Object r9 = r1.f()
                r8.c = r5
                r8.a = r1
                r8.b = r2
                ze2 r6 = r8.d
                java.lang.Object r9 = r6.emit(r9, r8)
                if (r9 != r0) goto L16
            L74:
                return r0
            L75:
                r5.g(r4)
                tx8 r9 = defpackage.tx8.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChannelFlowKt$simpleChannelFlow$1(qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.c, g51Var);
        simpleChannelFlowKt$simpleChannelFlow$1.b = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((ze2) this.b, this.c, null);
            this.a = 1;
            if (js3.v(anonymousClass1, this) == coroutineSingletons) {
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
