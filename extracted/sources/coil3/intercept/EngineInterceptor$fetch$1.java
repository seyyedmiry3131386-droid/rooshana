package coil3.intercept;

import defpackage.hy2;
import defpackage.oy0;
import defpackage.pi3;
import defpackage.tb1;
import defpackage.uv5;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
final class EngineInterceptor$fetch$1 extends ContinuationImpl {
    public oy0 a;
    public pi3 b;
    public Object c;
    public uv5 d;
    public hy2 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ a h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, null, null, null, this);
    }
}
