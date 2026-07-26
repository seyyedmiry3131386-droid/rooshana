package ir.mservices.market.reels.ui.recycler;

import defpackage.a17;
import defpackage.bs1;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4", f = "Reel.kt", l = {1039, 1039}, m = "invokeSuspend", v = 1)
final class ReelViewHolder$onAttach$4 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ReelData c;
    public final /* synthetic */ b d;

    /* JADX INFO: renamed from: ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4$1", f = "Reel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((a17) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a17 a17Var = (a17) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            bs1 bs1Var = a17Var != null ? a17Var.a : null;
            int i = b.B0;
            b bVar = this.b;
            bVar.G(bs1Var);
            b.E(bVar, a17Var != null ? a17Var.a : null);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelViewHolder$onAttach$4(g51 g51Var, ReelData reelData, b bVar) {
        super(2, g51Var);
        this.c = reelData;
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ReelViewHolder$onAttach$4 reelViewHolder$onAttach$4 = new ReelViewHolder$onAttach$4(g51Var, this.c, this.d);
        reelViewHolder$onAttach$4.b = obj;
        return reelViewHolder$onAttach$4;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelViewHolder$onAttach$4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r7, r0, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r6.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            kotlin.b.b(r7)
            goto L47
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.b.b(r7)
            goto L33
        L21:
            kotlin.b.b(r7)
            ir.mservices.market.reels.ui.recycler.ReelData r7 = r6.c
            vb7 r7 = r7.e
            r6.b = r5
            r6.a = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.d.B(r7, r0, r6)
            if (r7 != r1) goto L33
            goto L46
        L33:
            xe2 r7 = (defpackage.xe2) r7
            ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4$1 r0 = new ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4$1
            ir.mservices.market.reels.ui.recycler.b r2 = r6.d
            r0.<init>(r2, r5)
            r6.b = r5
            r6.a = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.d.f(r7, r0, r6)
            if (r7 != r1) goto L47
        L46:
            return r1
        L47:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
