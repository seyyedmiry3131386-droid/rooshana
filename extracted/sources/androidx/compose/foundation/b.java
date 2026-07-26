package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.eh6;
import defpackage.g51;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objE = androidx.compose.foundation.gestures.h.e(eh6Var, new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.a, null), g51Var);
        return objE == CoroutineSingletons.a ? objE : tx8.a;
    }
}
