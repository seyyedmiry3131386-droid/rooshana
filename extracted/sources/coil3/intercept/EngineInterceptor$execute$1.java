package coil3.intercept;

import defpackage.hy2;
import defpackage.pi3;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
final class EngineInterceptor$execute$1 extends ContinuationImpl {
    public pi3 a;
    public Object b;
    public hy2 c;
    public Ref$ObjectRef d;
    public Ref$ObjectRef e;
    public Ref$ObjectRef f;
    public Ref$ObjectRef g;
    public /* synthetic */ Object h;
    public final /* synthetic */ a i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return a.c(this.i, null, null, null, null, this);
    }
}
