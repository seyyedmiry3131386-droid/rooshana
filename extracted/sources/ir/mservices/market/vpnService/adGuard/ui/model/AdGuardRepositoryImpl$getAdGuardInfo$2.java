package ir.mservices.market.vpnService.adGuard.ui.model;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.vpnService.adGuard.data.AdGuardDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.model.AdGuardRepositoryImpl$getAdGuardInfo$2", f = "AdGuardRepositoryImpl.kt", l = {29, 30, 30, 36}, m = "invokeSuspend", v = 1)
final class AdGuardRepositoryImpl$getAdGuardInfo$2 extends SuspendLambda implements qp2 {
    public AdGuardDto a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardRepositoryImpl$getAdGuardInfo$2(a aVar, Object obj, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AdGuardRepositoryImpl$getAdGuardInfo$2 adGuardRepositoryImpl$getAdGuardInfo$2 = new AdGuardRepositoryImpl$getAdGuardInfo$2(this.d, this.e, g51Var);
        adGuardRepositoryImpl$getAdGuardInfo$2.c = obj;
        return adGuardRepositoryImpl$getAdGuardInfo$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdGuardRepositoryImpl$getAdGuardInfo$2) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0179, code lost:
    
        if (r0.emit(r14, r13) != r7) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.model.AdGuardRepositoryImpl$getAdGuardInfo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
