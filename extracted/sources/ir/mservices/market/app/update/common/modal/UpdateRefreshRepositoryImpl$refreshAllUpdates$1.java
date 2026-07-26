package ir.mservices.market.app.update.common.modal;

import defpackage.ff5;
import defpackage.iz8;
import defpackage.tb1;
import defpackage.vz8;
import ir.mservices.market.version2.webapi.requestdto.UpdateListDto;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.UpdateRefreshRepositoryImpl", f = "UpdateRefreshRepositoryImpl.kt", l = {94, 104, 106}, m = "refreshAllUpdates", v = 1)
final class UpdateRefreshRepositoryImpl$refreshAllUpdates$1 extends ContinuationImpl {
    public Object a;
    public String b;
    public String c;
    public ff5 d;
    public vz8 e;
    public iz8 f;
    public a g;
    public Iterable h;
    public Iterator i;
    public UpdateListDto j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ a o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRefreshRepositoryImpl$refreshAllUpdates$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, null, null, null, null, this);
    }
}
