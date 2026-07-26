package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.p;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", l = {33}, m = "invokeSuspend", v = 1)
final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(2, g51Var);
        dragAndDropSourceDefaults$DefaultStartDetector$1.b = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(null, (g51) obj2)).invokeSuspend(tx8.a);
        }
        throw new ClassCastException();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            if (this.b != null) {
                throw new ClassCastException();
            }
            sl0 sl0Var = new sl0(9);
            this.a = 1;
            if (p.f(null, null, sl0Var, null, this, 13) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
