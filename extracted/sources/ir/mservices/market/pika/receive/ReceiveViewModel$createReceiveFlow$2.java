package ir.mservices.market.pika.receive;

import defpackage.e71;
import defpackage.g51;
import defpackage.kp3;
import defpackage.m86;
import defpackage.mp3;
import defpackage.n86;
import defpackage.np3;
import defpackage.o86;
import defpackage.op3;
import defpackage.pp3;
import defpackage.qp2;
import defpackage.qp3;
import defpackage.r86;
import defpackage.s86;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yq2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2", f = "ReceiveViewModel.kt", l = {182, 182}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$createReceiveFlow$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceiveViewModel b;
    public final /* synthetic */ long c;
    public final /* synthetic */ l d;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2$1", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g51 g51Var) {
            super(2, g51Var);
            this.b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((kp3) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m86Var;
            kp3 kp3Var = (kp3) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            yq2 yq2Var = kp3Var.a;
            if (yq2Var instanceof op3) {
                m86Var = o86.a;
            } else if (yq2Var instanceof np3) {
                m86Var = n86.a;
            } else if (yq2Var instanceof mp3) {
                m86Var = new m86(ReceiveState.c);
            } else if (yq2Var instanceof qp3) {
                m86Var = s86.a;
            } else {
                if (!(yq2Var instanceof pp3)) {
                    throw new NoWhenBranchMatchedException();
                }
                m86Var = r86.a;
            }
            this.b.p(null, m86Var);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$createReceiveFlow$2(ReceiveViewModel receiveViewModel, long j, l lVar, g51 g51Var) {
        super(2, g51Var);
        this.b = receiveViewModel;
        this.c = j;
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$createReceiveFlow$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$createReceiveFlow$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r9, r1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            kotlin.b.b(r9)
            goto L51
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            kotlin.b.b(r9)
            goto L3f
        L1d:
            kotlin.b.b(r9)
            ir.mservices.market.pika.receive.ReceiveViewModel r9 = r8.b
            ir.mservices.market.pika.receive.model.a r1 = r9.v
            kotlinx.coroutines.flow.l r1 = r1.c
            ir.mservices.market.pika.receive.model.InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1 r5 = new ir.mservices.market.pika.receive.model.InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1
            long r6 = r8.c
            r5.<init>(r1, r2, r6)
            vb7 r1 = new vb7
            r1.<init>(r5)
            fu0 r9 = defpackage.y97.G(r9)
            r8.a = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.d.B(r1, r9, r8)
            if (r9 != r0) goto L3f
            goto L50
        L3f:
            xe2 r9 = (defpackage.xe2) r9
            ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2$1 r1 = new ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2$1
            kotlinx.coroutines.flow.l r4 = r8.d
            r1.<init>(r4, r2)
            r8.a = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.d.f(r9, r1, r8)
            if (r9 != r0) goto L51
        L50:
            return r0
        L51:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.receive.ReceiveViewModel$createReceiveFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
