package androidx.compose.animation.core;

import defpackage.dl;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qk;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tv8;
import defpackage.tx8;
import defpackage.xe8;
import defpackage.xk;
import defpackage.zi;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
final class Animatable$runAnimation$2 extends SuspendLambda implements dp2 {
    public xk a;
    public Ref$BooleanRef b;
    public int c;
    public final /* synthetic */ a d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xe8 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ dp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(a aVar, Object obj, xe8 xe8Var, long j, dp2 dp2Var, g51 g51Var) {
        super(1, g51Var);
        this.d = aVar;
        this.e = obj;
        this.f = xe8Var;
        this.g = j;
        this.h = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new Animatable$runAnimation$2(this.d, this.e, this.f, this.g, this.h, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xk xkVar;
        Ref$BooleanRef ref$BooleanRef;
        xe8 xe8Var = this.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        a aVar = this.d;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                aVar.c.c = (dl) aVar.a.b().invoke(this.e);
                ((s08) aVar.e).setValue(xe8Var.c);
                ((s08) aVar.d).setValue(Boolean.TRUE);
                xk xkVar2 = aVar.c;
                xk xkVar3 = new xk(xkVar2.a, ((s08) xkVar2.b).getValue(), tv8.k(xkVar2.c), xkVar2.d, Long.MIN_VALUE, xkVar2.f);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                long j = this.g;
                zi ziVar = new zi(aVar, xkVar3, this.h, ref$BooleanRef2, 0);
                this.a = xkVar3;
                this.b = ref$BooleanRef2;
                this.c = 1;
                if (f.b(xkVar3, xe8Var, j, ziVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                xkVar = xkVar3;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = this.b;
                xkVar = this.a;
                kotlin.b.b(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.a ? AnimationEndReason.a : AnimationEndReason.b;
            a.a(aVar);
            return new qk(xkVar, animationEndReason);
        } catch (CancellationException e) {
            a.a(aVar);
            throw e;
        }
    }
}
