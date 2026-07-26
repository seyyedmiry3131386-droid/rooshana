package androidx.compose.foundation.text.selection;

import defpackage.tb1;
import defpackage.wx7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {267, 294}, m = "mouseSelection", v = 1)
final class SelectionGesturesKt$mouseSelection$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public wx7 b;
    public Ref$BooleanRef c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return c.d(null, null, null, null, this);
    }
}
