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
@tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1", f = "NearbyRepository.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class NearbyRepository$getPayloadFlow$$inlined$transform$1 extends SuspendLambda implements qp2 {
    final /* synthetic */ long $id$inlined;
    final /* synthetic */ xe2 $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements ze2 {
        final /* synthetic */ ze2 $$this$flow;
        final /* synthetic */ long $id$inlined;

        /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1", f = "NearbyRepository.kt", l = {39}, m = "emit", v = 1)
        public static final class C00251 extends ContinuationImpl {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            /* synthetic */ Object result;

            public C00251(g51 g51Var) {
                super(g51Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(ze2 ze2Var, long j) {
            this.$id$inlined = j;
            this.$$this$flow = ze2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.ze2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, defpackage.g51<? super defpackage.tx8> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1.AnonymousClass1.C00251
                if (r0 == 0) goto L13
                r0 = r8
                ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1$1 r0 = (ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1.AnonymousClass1.C00251) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1$1 r0 = new ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1$1$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r7 = r0.L$4
                ir.mservices.market.pika.common.model.PayloadState r7 = (ir.mservices.market.pika.common.model.PayloadState) r7
                java.lang.Object r7 = r0.L$3
                ze2 r7 = (defpackage.ze2) r7
                java.lang.Object r7 = r0.L$2
                java.util.Map r7 = (java.util.Map) r7
                java.lang.Object r7 = r0.L$1
                g51 r7 = (defpackage.g51) r7
                kotlin.b.b(r8)
                goto L6e
            L37:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3f:
                kotlin.b.b(r8)
                ze2 r8 = r6.$$this$flow
                java.util.Map r7 = (java.util.Map) r7
                long r4 = r6.$id$inlined
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r4)
                java.lang.Object r7 = r7.get(r2)
                ir.mservices.market.pika.common.model.PayloadState r7 = (ir.mservices.market.pika.common.model.PayloadState) r7
                if (r7 == 0) goto L6e
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.L$2 = r2
                r0.L$3 = r2
                r0.L$4 = r2
                r2 = 0
                r0.I$0 = r2
                r0.I$1 = r2
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L6e
                return r1
            L6e:
                tx8 r7 = defpackage.tx8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.common.model.NearbyRepository$getPayloadFlow$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, g51):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyRepository$getPayloadFlow$$inlined$transform$1(xe2 xe2Var, g51 g51Var, long j) {
        super(2, g51Var);
        this.$this_transform = xe2Var;
        this.$id$inlined = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51<tx8> create(Object obj, g51<?> g51Var) {
        NearbyRepository$getPayloadFlow$$inlined$transform$1 nearbyRepository$getPayloadFlow$$inlined$transform$1 = new NearbyRepository$getPayloadFlow$$inlined$transform$1(this.$this_transform, g51Var, this.$id$inlined);
        nearbyRepository$getPayloadFlow$$inlined$transform$1.L$0 = obj;
        return nearbyRepository$getPayloadFlow$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(ze2 ze2Var, g51<? super tx8> g51Var) {
        return ((NearbyRepository$getPayloadFlow$$inlined$transform$1) create(ze2Var, g51Var)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ze2 ze2Var = (ze2) this.L$0;
            xe2 xe2Var = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ze2Var, this.$id$inlined);
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
