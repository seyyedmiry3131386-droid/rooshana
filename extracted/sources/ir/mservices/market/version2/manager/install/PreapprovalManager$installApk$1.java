package ir.mservices.market.version2.manager.install;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.PreapprovalManager$installApk$1", f = "PreapprovalManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class PreapprovalManager$installApk$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PendingInstall b;
    public final /* synthetic */ AppDownloadInfo c;
    public final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreapprovalManager$installApk$1(PendingInstall pendingInstall, AppDownloadInfo appDownloadInfo, f fVar, g51 g51Var) {
        super(2, g51Var);
        this.b = pendingInstall;
        this.c = appDownloadInfo;
        this.d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PreapprovalManager$installApk$1 preapprovalManager$installApk$1 = new PreapprovalManager$installApk$1(this.b, this.c, this.d, g51Var);
        preapprovalManager$installApk$1.a = obj;
        return preapprovalManager$installApk$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PreapprovalManager$installApk$1 preapprovalManager$installApk$1 = (PreapprovalManager$installApk$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        preapprovalManager$installApk$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.PreapprovalManager$installApk$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
