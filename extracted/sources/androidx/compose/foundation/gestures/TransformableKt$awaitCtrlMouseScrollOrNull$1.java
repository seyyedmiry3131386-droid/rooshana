package androidx.compose.foundation.gestures;

import defpackage.ql4;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {312}, m = "awaitCtrlMouseScrollOrNull", v = 1)
final class TransformableKt$awaitCtrlMouseScrollOrNull$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public ql4 b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return h.d(null, null, this);
    }
}
