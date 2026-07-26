package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1", f = "Scrollable2D.kt", l = {378, 381, 384}, m = "invokeSuspend", v = 1)
final class ScrollingLogic2D$onScrollStopped$performFling$1 extends SuspendLambda implements qp2 {
    public long a;
    public int b;
    public /* synthetic */ long c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(2, g51Var);
        scrollingLogic2D$onScrollStopped$performFling$1.c = ((e49) obj).a;
        return scrollingLogic2D$onScrollStopped$performFling$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((e49) obj).a;
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(2, (g51) obj2);
        scrollingLogic2D$onScrollStopped$performFling$1.c = j;
        return scrollingLogic2D$onScrollStopped$performFling$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i == 1) {
            long j = this.c;
            kotlin.b.b(obj);
            long jD = e49.d(j, ((e49) obj).a);
            this.c = j;
            this.a = jD;
            this.b = 2;
            throw null;
        }
        if (i == 2) {
            kotlin.b.b(obj);
            long j2 = ((e49) obj).a;
            throw null;
        }
        if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = this.a;
        long j4 = this.c;
        kotlin.b.b(obj);
        return new e49(e49.d(j4, e49.d(j3, ((e49) obj).a)));
    }
}
