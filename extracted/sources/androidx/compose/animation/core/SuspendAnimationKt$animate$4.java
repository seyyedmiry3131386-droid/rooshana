package androidx.compose.animation.core;

import defpackage.dl;
import defpackage.dp2;
import defpackage.kk;
import defpackage.tb1;
import defpackage.xk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate", v = 1)
final class SuspendAnimationKt$animate$4<T, V extends dl> extends ContinuationImpl {
    public xk a;
    public kk b;
    public dp2 c;
    public Ref$ObjectRef d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return f.b(null, null, 0L, null, this);
    }
}
