package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bt2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.ru1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    public androidx.compose.material3.internal.c I;
    public Orientation J;
    public boolean K;
    public rp2 L;
    public rp2 M;

    @Override // androidx.compose.foundation.gestures.e
    public final Object J0(qp2 qp2Var, g51 g51Var) {
        androidx.compose.material3.internal.c cVar = this.I;
        MutatePriority mutatePriority = MutatePriority.a;
        Object objA = cVar.a(new DraggableNode$drag$2(qp2Var, this, null), g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void O0(long j) {
        if (!this.n || js3.i(this.L, f.a)) {
            return;
        }
        bt2.G(o0(), null, CoroutineStart.d, new DraggableNode$onDragStarted$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void P0(ru1 ru1Var) {
        if (!this.n || js3.i(this.M, f.b)) {
            return;
        }
        bt2.G(o0(), null, CoroutineStart.d, new DraggableNode$onDragStopped$1(this, ru1Var, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final boolean U0() {
        return this.K;
    }
}
