package ir.mservices.market.pika.common.model;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1", f = "NearbyRepository.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class NearbyRepository$getFinishedPayloads$$inlined$transform$1 extends SuspendLambda implements qp2 {
    final /* synthetic */ xe2 $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NearbyRepository this$0;

    /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements ze2 {
        final /* synthetic */ ze2 $$this$flow;
        final /* synthetic */ NearbyRepository this$0;

        /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1", f = "NearbyRepository.kt", l = {60}, m = "emit", v = 1)
        public static final class C00241 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            /* synthetic */ Object result;

            public C00241(g51 g51Var) {
                super(g51Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(ze2 ze2Var, NearbyRepository nearbyRepository) {
            this.this$0 = nearbyRepository;
            this.$$this$flow = ze2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.ze2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r9, defpackage.g51<? super defpackage.tx8> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1.AnonymousClass1.C00241
                if (r0 == 0) goto L13
                r0 = r10
                ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1$1 r0 = (ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1.AnonymousClass1.C00241) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1$1 r0 = new ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1$1$1
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r0.label
                tx8 r3 = defpackage.tx8.a
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 != r4) goto L3a
                java.lang.Object r9 = r0.L$4
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r9 = r0.L$3
                ze2 r9 = (defpackage.ze2) r9
                java.lang.Object r9 = r0.L$2
                java.util.Map r9 = (java.util.Map) r9
                java.lang.Object r9 = r0.L$1
                g51 r9 = (defpackage.g51) r9
                kotlin.b.b(r10)
                goto Lc2
            L3a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L42:
                kotlin.b.b(r10)
                ze2 r10 = r8.$$this$flow
                java.util.Map r9 = (java.util.Map) r9
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            L56:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L84
                java.lang.Object r5 = r9.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                ir.mservices.market.pika.common.model.NearbyRepository r6 = r8.this$0
                java.util.Map r6 = ir.mservices.market.pika.common.model.NearbyRepository.access$getFileSentPayloads$p(r6)
                java.lang.Object r7 = r5.getKey()
                java.lang.Object r6 = r6.get(r7)
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                boolean r6 = defpackage.js3.i(r6, r7)
                if (r6 == 0) goto L56
                java.lang.Object r6 = r5.getKey()
                java.lang.Object r5 = r5.getValue()
                r2.put(r6, r5)
                goto L56
            L84:
                java.util.Collection r9 = r2.values()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r9 = r9.iterator()
            L93:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto La5
                java.lang.Object r5 = r9.next()
                boolean r6 = r5 instanceof ir.mservices.market.pika.common.model.PayloadState.Success
                if (r6 == 0) goto L93
                r2.add(r5)
                goto L93
            La5:
                boolean r9 = r2.isEmpty()
                if (r9 != 0) goto Lc2
                r9 = 0
                r0.L$0 = r9
                r0.L$1 = r9
                r0.L$2 = r9
                r0.L$3 = r9
                r0.L$4 = r9
                r9 = 0
                r0.I$0 = r9
                r0.label = r4
                java.lang.Object r9 = r10.emit(r3, r0)
                if (r9 != r1) goto Lc2
                return r1
            Lc2:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.common.model.NearbyRepository$getFinishedPayloads$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, g51):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyRepository$getFinishedPayloads$$inlined$transform$1(xe2 xe2Var, g51 g51Var, NearbyRepository nearbyRepository) {
        super(2, g51Var);
        this.$this_transform = xe2Var;
        this.this$0 = nearbyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51<tx8> create(Object obj, g51<?> g51Var) {
        NearbyRepository$getFinishedPayloads$$inlined$transform$1 nearbyRepository$getFinishedPayloads$$inlined$transform$1 = new NearbyRepository$getFinishedPayloads$$inlined$transform$1(this.$this_transform, g51Var, this.this$0);
        nearbyRepository$getFinishedPayloads$$inlined$transform$1.L$0 = obj;
        return nearbyRepository$getFinishedPayloads$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(ze2 ze2Var, g51<? super tx8> g51Var) {
        return ((NearbyRepository$getFinishedPayloads$$inlined$transform$1) create(ze2Var, g51Var)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ze2 ze2Var = (ze2) this.L$0;
            xe2 xe2Var = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ze2Var, this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (xe2Var.a(anonymousClass1, this) == coroutineSingletons) {
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
