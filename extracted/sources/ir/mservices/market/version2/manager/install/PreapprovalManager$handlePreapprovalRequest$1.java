package ir.mservices.market.version2.manager.install;

import defpackage.tb1;
import ir.mservices.market.version2.download.DownloadDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.PreapprovalManager", f = "PreapprovalManager.kt", l = {192, 261}, m = "handlePreapprovalRequest", v = 1)
final class PreapprovalManager$handlePreapprovalRequest$1 extends ContinuationImpl {
    public DownloadDataModel a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreapprovalManager$handlePreapprovalRequest$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return f.b(this.c, null, this);
    }
}
