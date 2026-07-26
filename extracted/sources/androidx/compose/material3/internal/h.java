package androidx.compose.material3.internal;

import androidx.compose.material3.p;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.eh6;
import defpackage.g51;
import defpackage.js3;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class h implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objV = js3.v(new BasicTooltipKt$handleGestures$1$1(eh6Var, this.b, null), g51Var);
                if (objV != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objV2 = js3.v(new BasicTooltipKt$handleGestures$2$1(eh6Var, this.b, null), g51Var);
                if (objV2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
