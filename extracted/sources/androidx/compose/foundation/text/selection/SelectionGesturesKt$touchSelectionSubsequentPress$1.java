package androidx.compose.foundation.text.selection;

import defpackage.tb1;
import defpackage.wg8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {193, 232}, m = "touchSelectionSubsequentPress", v = 1)
final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public wg8 b;
    public Ref$LongRef c;
    public long d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return c.b(null, null, null, 0, this);
    }
}
