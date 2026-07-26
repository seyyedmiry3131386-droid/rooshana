package androidx.compose.foundation.text.selection;

import defpackage.ah6;
import defpackage.tb1;
import defpackage.wg8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {141, 145}, m = "touchSelectionFirstPress", v = 1)
final class SelectionGesturesKt$touchSelectionFirstPress$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public wg8 b;
    public ah6 c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return c.e(null, null, null, this);
    }
}
