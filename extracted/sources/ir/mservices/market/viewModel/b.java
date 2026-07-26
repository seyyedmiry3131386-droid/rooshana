package ir.mservices.market.viewModel;

import defpackage.ze2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ze2 {
    public final /* synthetic */ ze2 a;
    public final /* synthetic */ c b;

    public b(ze2 ze2Var, c cVar) {
        this.a = ze2Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r9, defpackage.g51 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ir.mservices.market.viewModel.BaseViewModel$special$$inlined$map$1$2$1
            if (r0 == 0) goto L13
            r0 = r10
            ir.mservices.market.viewModel.BaseViewModel$special$$inlined$map$1$2$1 r0 = (ir.mservices.market.viewModel.BaseViewModel$special$$inlined$map$1$2$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ir.mservices.market.viewModel.BaseViewModel$special$$inlined$map$1$2$1 r0 = new ir.mservices.market.viewModel.BaseViewModel$special$$inlined$map$1$2$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r10)
            goto L68
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            kotlin.b.b(r10)
            bz6 r9 = (defpackage.bz6) r9
            r10 = 0
            if (r9 == 0) goto L5d
            xe2 r2 = r9.a
            ir.mservices.market.viewModel.c r4 = r8.b
            kotlinx.coroutines.flow.l r5 = r4.p
            xe2 r5 = kotlinx.coroutines.flow.d.i(r5)
            kotlinx.coroutines.flow.l r4 = r4.q
            xe2 r4 = kotlinx.coroutines.flow.d.i(r4)
            ir.mservices.market.viewModel.BaseViewModel$recyclerItems$1$1$1 r6 = new ir.mservices.market.viewModel.BaseViewModel$recyclerItems$1$1$1
            r7 = 4
            r6.<init>(r7, r10)
            nf2 r10 = kotlinx.coroutines.flow.d.g(r2, r5, r4, r6)
            qp2 r2 = r9.c
            xe2 r4 = r9.d
            ir.mservices.market.common.Filter r9 = r9.b
            bz6 r5 = new bz6
            r5.<init>(r10, r9, r2, r4)
            r10 = r5
        L5d:
            r0.b = r3
            ze2 r9 = r8.a
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.viewModel.b.emit(java.lang.Object, g51):java.lang.Object");
    }
}
