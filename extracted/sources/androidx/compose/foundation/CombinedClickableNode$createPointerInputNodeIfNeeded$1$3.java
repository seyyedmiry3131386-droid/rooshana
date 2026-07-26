package androidx.compose.foundation;

import defpackage.g51;
import defpackage.nr5;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1047}, m = "invokeSuspend", v = 1)
final class CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ androidx.compose.foundation.gestures.j b;
    public /* synthetic */ long c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((nr5) obj2).a;
        CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 combinedClickableNode$createPointerInputNodeIfNeeded$1$3 = new CombinedClickableNode$createPointerInputNodeIfNeeded$1$3(3, (g51) obj3);
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.b = (androidx.compose.foundation.gestures.j) obj;
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.c = j;
        return combinedClickableNode$createPointerInputNodeIfNeeded$1$3.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return tx8.a;
    }
}
