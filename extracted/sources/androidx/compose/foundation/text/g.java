package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.p;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.ab5;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.tx8;
import defpackage.u8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class g implements PointerInputEventHandler {
    public final /* synthetic */ e71 a;
    public final /* synthetic */ wb5 b;
    public final /* synthetic */ ab5 c;
    public final /* synthetic */ wb5 d;

    public g(e71 e71Var, wb5 wb5Var, ab5 ab5Var, wb5 wb5Var2) {
        this.a = e71Var;
        this.b = wb5Var;
        this.c = ab5Var;
        this.d = wb5Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        Object objE = p.e(eh6Var, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.a, this.b, this.c, null), new u8(this.d, 9), g51Var);
        return objE == CoroutineSingletons.a ? objE : tx8.a;
    }
}
