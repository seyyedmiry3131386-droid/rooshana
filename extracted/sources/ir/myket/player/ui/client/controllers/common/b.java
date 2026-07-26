package ir.myket.player.ui.client.controllers.common;

import androidx.compose.foundation.gestures.h;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.dp2;
import defpackage.eh6;
import defpackage.g51;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ Ref$LongRef c;
    public final /* synthetic */ wb5 d;

    public b(long j, dp2 dp2Var, Ref$LongRef ref$LongRef, wb5 wb5Var) {
        this.a = j;
        this.b = dp2Var;
        this.c = ref$LongRef;
        this.d = wb5Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eh6 eh6Var, g51 g51Var) {
        long j = this.a;
        tx8 tx8Var = tx8.a;
        if (j <= 0) {
            return tx8Var;
        }
        Object objE = h.e(eh6Var, new PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1(this.b, this.c, this.d, j, null), g51Var);
        return objE == CoroutineSingletons.a ? objE : tx8Var;
    }
}
