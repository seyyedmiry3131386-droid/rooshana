package ir.mservices.market.version2.manager;

import defpackage.e9;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.MovieProgressManager$getWatchProgressStatusByPlayId$$inlined$map$1$2", f = "MovieProgressManager.kt", l = {50}, m = "emit", v = 1)
public final class MovieProgressManager$getWatchProgressStatusByPlayId$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieProgressManager$getWatchProgressStatusByPlayId$$inlined$map$1$2$1(e9 e9Var, g51 g51Var) {
        super(g51Var);
        this.c = e9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
