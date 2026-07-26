package coil3.intercept;

import defpackage.hy2;
import defpackage.oy0;
import defpackage.pi3;
import defpackage.tb1;
import defpackage.uv5;
import defpackage.v18;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
final class EngineInterceptor$decode$1 extends ContinuationImpl {
    public v18 a;
    public oy0 b;
    public pi3 c;
    public Object d;
    public uv5 e;
    public hy2 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ a i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return a.b(this.i, null, null, null, null, null, null, this);
    }
}
