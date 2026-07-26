package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {579}, m = "invokeSuspend", v = 1)
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ long b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(n nVar, g51 g51Var) {
        super(2, g51Var);
        this.c = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.c, g51Var);
        scrollableNode$setScrollSemanticsActions$2.b = ((nr5) obj).a;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((nr5) obj).a;
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.c, (g51) obj2);
        scrollableNode$setScrollSemanticsActions$2.b = j;
        return scrollableNode$setScrollSemanticsActions$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        long j = this.b;
        o oVar = this.c.N;
        this.a = 1;
        Object objA = h.a(oVar, j, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
