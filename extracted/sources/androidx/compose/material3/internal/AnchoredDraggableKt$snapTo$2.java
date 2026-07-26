package androidx.compose.material3.internal;

import defpackage.dh4;
import defpackage.g51;
import defpackage.je;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements sp2 {
    public /* synthetic */ je a;
    public /* synthetic */ dh4 b;
    public /* synthetic */ Object c;

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(4, (g51) obj4);
        anchoredDraggableKt$snapTo$2.a = (je) obj;
        anchoredDraggableKt$snapTo$2.b = (dh4) obj2;
        anchoredDraggableKt$snapTo$2.c = obj3;
        tx8 tx8Var = tx8.a;
        anchoredDraggableKt$snapTo$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        je jeVar = this.a;
        float fD = this.b.d(this.c);
        if (!Float.isNaN(fD)) {
            jeVar.a(fD, 0.0f);
        }
        return tx8.a;
    }
}
