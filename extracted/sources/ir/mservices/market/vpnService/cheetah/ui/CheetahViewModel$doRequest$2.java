package ir.mservices.market.vpnService.cheetah.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$doRequest$2", f = "CheetahViewModel.kt", l = {141, 152, 154}, m = "invokeSuspend", v = 1)
final class CheetahViewModel$doRequest$2 extends SuspendLambda implements qp2 {
    public Object a;
    public xb5 b;
    public int c;
    public final /* synthetic */ CheetahViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheetahViewModel$doRequest$2(CheetahViewModel cheetahViewModel, g51 g51Var) {
        super(2, g51Var);
        this.d = cheetahViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CheetahViewModel$doRequest$2(this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheetahViewModel$doRequest$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r1.emit(r10, r18) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r1 = r0;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r1.emit(r10, r18) == r6) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$doRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
