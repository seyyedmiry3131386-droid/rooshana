package ir.mservices.market.app.update.common.modal;

import defpackage.g51;
import defpackage.nl;
import defpackage.o30;
import defpackage.tb1;
import defpackage.ze2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$getUpdateListState$$inlined$transform$1$1", f = "AppUpdateRepositoryImpl.kt", l = {51, 63}, m = "emit", v = 1)
public final class AppUpdateRepositoryImpl$getUpdateListState$$inlined$transform$1$1$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nl c;
    public ze2 d;
    public Collection e;
    public Iterator f;
    public o30 g;
    public int h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateRepositoryImpl$getUpdateListState$$inlined$transform$1$1$1(nl nlVar, g51 g51Var) {
        super(g51Var);
        this.c = nlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
