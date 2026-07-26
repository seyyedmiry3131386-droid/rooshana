package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.p;
import androidx.compose.ui.input.pointer.e;
import defpackage.ah6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vg6;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {31, 37}, m = "invokeSuspend", v = 1)
final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(2, g51Var);
        pressDownGestureKt$detectPressDownGesture$2.c = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PressDownGestureKt$detectPressDownGesture$2) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            e eVar = (e) this.c;
            this.c = eVar;
            this.b = 1;
            obj = p.c(eVar, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                List list = ((vg6) obj).a;
                if (list.size() <= 0) {
                    throw null;
                }
                long j = ((ah6) list.get(0)).a;
                throw null;
            }
            b.b(obj);
        }
        long j2 = ((ah6) obj).c;
        throw null;
    }
}
