package kotlin.io.path;

import defpackage.g51;
import defpackage.io7;
import defpackage.ov;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197}, m = "invokeSuspend", v = 2)
final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements qp2 {
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(2, g51Var);
        pathTreeWalk$bfsIterator$1.b = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PathTreeWalk$bfsIterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        new ov();
        throw null;
    }
}
