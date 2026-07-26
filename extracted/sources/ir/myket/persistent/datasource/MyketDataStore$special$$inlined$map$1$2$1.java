package ir.myket.persistent.datasource;

import defpackage.g51;
import defpackage.pt1;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.datasource.MyketDataStore$special$$inlined$map$1$2", f = "MyketDataStore.kt", l = {50}, m = "emit", v = 1)
public final class MyketDataStore$special$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pt1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketDataStore$special$$inlined$map$1$2$1(pt1 pt1Var, g51 g51Var) {
        super(g51Var);
        this.c = pt1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
