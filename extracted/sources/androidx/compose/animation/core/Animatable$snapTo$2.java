package androidx.compose.animation.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
final class Animatable$snapTo$2 extends SuspendLambda implements dp2 {
    public final /* synthetic */ a a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(a aVar, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.a = aVar;
        this.b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new Animatable$snapTo$2(this.a, this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Animatable$snapTo$2 animatable$snapTo$2 = (Animatable$snapTo$2) create((g51) obj);
        tx8 tx8Var = tx8.a;
        animatable$snapTo$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        a aVar = this.a;
        a.a(aVar);
        Object objC = aVar.c(this.b);
        ((s08) aVar.c.b).setValue(objC);
        ((s08) aVar.e).setValue(objC);
        return tx8.a;
    }
}
