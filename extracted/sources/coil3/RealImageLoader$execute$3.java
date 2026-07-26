package coil3;

import defpackage.h57;
import defpackage.hy2;
import defpackage.pi3;
import defpackage.tb1;
import defpackage.wh3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
final class RealImageLoader$execute$3 extends ContinuationImpl {
    public h57 a;
    public pi3 b;
    public hy2 c;
    public wh3 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ a g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        int i = a.e;
        return this.g.a(null, 0, this);
    }
}
