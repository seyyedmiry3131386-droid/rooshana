package androidx.compose.foundation.text.selection;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {340}, m = "awaitDown", v = 1)
final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return c.a(null, this);
    }
}
