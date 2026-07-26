package androidx.compose.foundation.gestures;

import defpackage.bt2;
import defpackage.e49;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends AdaptedFunctionReference implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((e49) obj).a;
        n nVar = (n) this.a;
        bt2.G(nVar.K.c(), null, null, new ScrollableNode$onWheelScrollStopped$1(nVar, j, null), 3);
        return tx8.a;
    }
}
