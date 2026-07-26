package androidx.compose.foundation.gestures;

import defpackage.bt2;
import defpackage.ch7;
import defpackage.dh7;
import defpackage.e49;
import defpackage.g51;
import defpackage.qe1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {890}, m = "invokeSuspend", v = 1)
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements qp2 {
    public o a;
    public Ref$LongRef b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ o f;
    public final /* synthetic */ Ref$LongRef g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(o oVar, Ref$LongRef ref$LongRef, long j, g51 g51Var) {
        super(2, g51Var);
        this.f = oVar;
        this.g = ref$LongRef;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f, this.g, this.h, g51Var);
        scrollingLogic$doFlingAnimation$2.e = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((dh7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        o oVar;
        Ref$LongRef ref$LongRef;
        long j;
        o oVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.d;
        if (i == 0) {
            kotlin.b.b(obj);
            dh7 dh7Var = (dh7) this.e;
            oVar = this.f;
            ch7 ch7Var = new ch7(oVar, dh7Var);
            qe1 qe1Var = oVar.c;
            ref$LongRef = this.g;
            long j2 = ref$LongRef.a;
            Orientation orientation = oVar.d;
            Orientation orientation2 = Orientation.b;
            long j3 = this.h;
            float fD = oVar.d(orientation == orientation2 ? e49.b(j3) : e49.c(j3));
            this.e = oVar;
            this.a = oVar;
            this.b = ref$LongRef;
            this.c = j2;
            this.d = 1;
            qe1Var.getClass();
            obj = bt2.Z(h.c, new DefaultFlingBehavior$performFling$2(fD, qe1Var, ch7Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
            oVar2 = oVar;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.c;
            ref$LongRef = this.b;
            oVar = this.a;
            oVar2 = (o) this.e;
            kotlin.b.b(obj);
        }
        float fD2 = oVar2.d(((Number) obj).floatValue());
        ref$LongRef.a = oVar.d == Orientation.b ? e49.a(j, fD2, 0.0f, 2) : e49.a(j, 0.0f, fD2, 1);
        return tx8.a;
    }
}
