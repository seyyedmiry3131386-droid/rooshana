package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.h;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.eh6;
import defpackage.g51;
import defpackage.k98;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ k98 a;

    public a(k98 k98Var) {
        this.a = k98Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objE = h.e(eh6Var, new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.a, null), g51Var);
        return objE == CoroutineSingletons.a ? objE : tx8.a;
    }
}
