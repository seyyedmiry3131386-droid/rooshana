package androidx.compose.foundation.gestures;

import defpackage.bp2;
import defpackage.np2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero", v = 1)
final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    public np2 a;
    public bp2 b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
