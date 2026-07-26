package androidx.compose.foundation.text.selection;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {208}, m = "invokeSuspend", v = 1)
final class SelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements dp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SelectionManager$contextMenuAreaModifier$2(1, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((SelectionManager$contextMenuAreaModifier$2) create((g51) obj)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
