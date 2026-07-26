package ir.mservices.market.app.update.common.modal;

import defpackage.rl3;
import defpackage.tb1;
import ir.mservices.market.app.detail.update.b;
import ir.mservices.market.core.notification.PushMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.UpdateRefreshRepositoryImpl", f = "UpdateRefreshRepositoryImpl.kt", l = {143, 146}, m = "refreshAppUpdate", v = 1)
final class UpdateRefreshRepositoryImpl$refreshAppUpdate$1 extends ContinuationImpl {
    public PushMessage a;
    public Object b;
    public String c;
    public String d;
    public b e;
    public rl3 f;
    public String g;
    public String h;
    public int i;
    public int j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRefreshRepositoryImpl$refreshAppUpdate$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, 0, null, null, null, null, null, this);
    }
}
