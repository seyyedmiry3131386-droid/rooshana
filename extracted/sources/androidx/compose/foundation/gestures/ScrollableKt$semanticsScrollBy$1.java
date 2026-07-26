package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1118}, m = "semanticsScrollBy-d-4ec7I", v = 1)
final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    public o a;
    public Ref$FloatRef b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return h.a(null, 0L, this);
    }
}
