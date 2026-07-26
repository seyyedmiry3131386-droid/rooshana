package defpackage;

import androidx.compose.foundation.gestures.p;
import androidx.compose.foundation.text.selection.c;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class c61 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                Object objC = c.c(eh6Var, fVar.z, fVar.y, g51Var);
                if (objC != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                Object objF = p.f(eh6Var, null, null, new tu1(2, (bp2) this.b), g51Var, 7);
                if (objF != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objE = androidx.compose.foundation.text.c.e(eh6Var, (wg8) this.b, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
