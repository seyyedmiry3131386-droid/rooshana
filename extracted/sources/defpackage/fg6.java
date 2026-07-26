package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.foundation.gestures.p;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bt2;
import defpackage.dc6;
import defpackage.dp2;
import defpackage.nr5;
import defpackage.qb6;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class fg6 implements PointerInputEventHandler {
    public final /* synthetic */ dp2 a;
    public final /* synthetic */ bp2 b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ ah4 d;
    public final /* synthetic */ e71 e;
    public final /* synthetic */ wb5 f;
    public final /* synthetic */ a g;
    public final /* synthetic */ a h;
    public final /* synthetic */ wb5 i;

    public fg6(dp2 dp2Var, bp2 bp2Var, dp2 dp2Var2, ah4 ah4Var, e71 e71Var, wb5 wb5Var, a aVar, a aVar2, wb5 wb5Var2) {
        this.a = dp2Var;
        this.b = bp2Var;
        this.c = dp2Var2;
        this.d = ah4Var;
        this.e = e71Var;
        this.f = wb5Var;
        this.g = aVar;
        this.h = aVar2;
        this.i = wb5Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ir.myket.player.ui.client.controllers.common.c] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        final dp2 dp2Var = this.a;
        final bp2 bp2Var = this.b;
        final dp2 dp2Var2 = this.c;
        final ah4 ah4Var = this.d;
        final e71 e71Var = this.e;
        final wb5 wb5Var = this.f;
        final a aVar = this.g;
        final a aVar2 = this.h;
        final wb5 wb5Var2 = this.i;
        Object objF = p.f(eh6Var, new dp2() { // from class: ir.myket.player.ui.client.controllers.common.c
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                nr5 nr5Var = (nr5) obj;
                qb6 qb6Var = new qb6(true);
                dp2 dp2Var3 = dp2Var;
                dp2Var3.invoke(qb6Var);
                if (((Boolean) bp2Var.invoke()).booleanValue()) {
                    dp2Var2.invoke(10);
                    dp2Var3.invoke((dc6) ah4Var.d);
                    wb5Var.setValue(new nr5(nr5Var.a));
                    bt2.G(e71Var, null, null, new PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1(aVar, aVar2, wb5Var2, nr5Var, null), 3);
                }
                return tx8.a;
            }
        }, null, new y8(7, dp2Var), g51Var, 6);
        return objF == CoroutineSingletons.a ? objF : tx8.a;
    }
}
