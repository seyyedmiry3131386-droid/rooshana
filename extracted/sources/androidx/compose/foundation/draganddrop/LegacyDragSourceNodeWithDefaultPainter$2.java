package androidx.compose.foundation.draganddrop;

import defpackage.bl4;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", l = {96}, m = "invokeSuspend", v = 1)
final class LegacyDragSourceNodeWithDefaultPainter$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        LegacyDragSourceNodeWithDefaultPainter$2 legacyDragSourceNodeWithDefaultPainter$2 = new LegacyDragSourceNodeWithDefaultPainter$2(2, g51Var);
        legacyDragSourceNodeWithDefaultPainter$2.a = obj;
        return legacyDragSourceNodeWithDefaultPainter$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((LegacyDragSourceNodeWithDefaultPainter$2) create(null, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        throw bl4.n(this.a);
    }
}
