package ir.mservices.market.version2.core.utils;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingCrudExtKt$replace$$inlined$map$1$2", f = "PagingCrudExt.kt", l = {50}, m = "emit", v = 1)
public final class PagingCrudExtKt$replace$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingCrudExtKt$replace$$inlined$map$1$2$1(b bVar, g51 g51Var) {
        super(g51Var);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
