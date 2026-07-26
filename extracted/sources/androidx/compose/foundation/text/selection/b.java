package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.dp2;
import defpackage.eh6;
import defpackage.g51;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ dp2 a;

    public b(dp2 dp2Var) {
        this.a = dp2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objC0 = ((androidx.compose.ui.input.pointer.f) eh6Var).C0(new SelectionGesturesKt$updateSelectionTouchMode$1$1(null, this.a), g51Var);
        return objC0 == CoroutineSingletons.a ? objC0 : tx8.a;
    }
}
