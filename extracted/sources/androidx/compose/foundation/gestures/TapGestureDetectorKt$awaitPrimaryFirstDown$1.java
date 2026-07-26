package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {304}, m = "awaitPrimaryFirstDown", v = 1)
final class TapGestureDetectorKt$awaitPrimaryFirstDown$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public PointerEventPass b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return p.d(null, null, this);
    }
}
