package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.eg8;
import defpackage.eh6;
import defpackage.g51;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ eg8 a;

    public a(eg8 eg8Var) {
        this.a = eg8Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objB = androidx.compose.foundation.text.contextmenu.gestures.a.b(eh6Var, new TextContextMenuGestureNode$1$1(1, this.a, eg8.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), g51Var);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }
}
