package androidx.datastore.core;

import defpackage.tb1;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {385, 386, 388, 389, 396, ErrorDTO.CODE_ACCESS_DENIED}, m = "readDataOrHandleCorruption", v = 1)
final class DataStoreImpl$readDataOrHandleCorruption$1 extends ContinuationImpl {
    public boolean a;
    public Object b;
    public Ref$ObjectRef c;
    public Serializable d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ d g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return d.h(this.g, false, this);
    }
}
