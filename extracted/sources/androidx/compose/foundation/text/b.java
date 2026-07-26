package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.eh6;
import defpackage.g51;
import defpackage.js3;
import defpackage.tx8;
import defpackage.wg8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ wg8 a;
    public final /* synthetic */ androidx.compose.foundation.text.selection.f b;

    public b(wg8 wg8Var, androidx.compose.foundation.text.selection.f fVar) {
        this.a = wg8Var;
        this.b = fVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objV = js3.v(new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(eh6Var, this.a, this.b, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }
}
