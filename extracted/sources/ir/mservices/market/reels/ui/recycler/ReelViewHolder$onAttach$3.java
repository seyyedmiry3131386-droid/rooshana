package ir.mservices.market.reels.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$3", f = "Reel.kt", l = {1034, 1034}, m = "invokeSuspend", v = 1)
final class ReelViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ReelData c;
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelViewHolder$onAttach$3(g51 g51Var, ReelData reelData, b bVar) {
        super(2, g51Var);
        this.c = reelData;
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ReelViewHolder$onAttach$3 reelViewHolder$onAttach$3 = new ReelViewHolder$onAttach$3(g51Var, this.c, this.d);
        reelViewHolder$onAttach$3.b = obj;
        return reelViewHolder$onAttach$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((ReelViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (((defpackage.v48) r7).a(r0, r6) == r1) goto L15;
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
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 == r4) goto L19
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.b.b(r7)
            goto L48
        L1d:
            kotlin.b.b(r7)
            goto L33
        L21:
            kotlin.b.b(r7)
            ir.mservices.market.reels.ui.recycler.ReelData r7 = r6.c
            vb7 r7 = r7.f
            r6.b = r3
            r6.a = r5
            java.lang.Object r7 = kotlinx.coroutines.flow.d.B(r7, r0, r6)
            if (r7 != r1) goto L33
            goto L47
        L33:
            v48 r7 = (defpackage.v48) r7
            xk6 r0 = new xk6
            ir.mservices.market.reels.ui.recycler.b r2 = r6.d
            r5 = 6
            r0.<init>(r5, r2)
            r6.b = r3
            r6.a = r4
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r1) goto L48
        L47:
            return r1
        L48:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
