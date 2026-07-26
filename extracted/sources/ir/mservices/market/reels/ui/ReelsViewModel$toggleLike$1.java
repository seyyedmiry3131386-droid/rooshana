package ir.mservices.market.reels.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsViewModel$toggleLike$1", f = "ReelsViewModel.kt", l = {67, 70}, m = "invokeSuspend", v = 1)
final class ReelsViewModel$toggleLike$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReelsViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsViewModel$toggleLike$1(ReelsViewModel reelsViewModel, String str, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = reelsViewModel;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelsViewModel$toggleLike$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelsViewModel$toggleLike$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (ir.mservices.market.reels.ui.ReelsViewModel.r(r6, r1, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (ir.mservices.market.reels.ui.ReelsViewModel.s(r6, r1, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.b.b(r6)
            goto L5c
        L19:
            kotlin.b.b(r6)
            ir.mservices.market.reels.ui.ReelsViewModel r6 = r5.b
            kotlinx.coroutines.flow.l r1 = r6.A
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = r5.c
            java.lang.Object r1 = r1.get(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L35
            boolean r1 = r1.booleanValue()
            goto L37
        L35:
            boolean r1 = r5.d
        L37:
            if (r1 == 0) goto L4b
            r1 = 0
            r6.t(r4, r1)
            ir.mservices.market.reels.data.ReelLikeRequestDto r1 = new ir.mservices.market.reels.data.ReelLikeRequestDto
            r1.<init>(r4)
            r5.a = r3
            java.lang.Object r6 = ir.mservices.market.reels.ui.ReelsViewModel.r(r6, r1, r5)
            if (r6 != r0) goto L5c
            goto L5b
        L4b:
            r6.t(r4, r3)
            ir.mservices.market.reels.data.ReelLikeRequestDto r1 = new ir.mservices.market.reels.data.ReelLikeRequestDto
            r1.<init>(r4)
            r5.a = r2
            java.lang.Object r6 = ir.mservices.market.reels.ui.ReelsViewModel.s(r6, r1, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.ui.ReelsViewModel$toggleLike$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
