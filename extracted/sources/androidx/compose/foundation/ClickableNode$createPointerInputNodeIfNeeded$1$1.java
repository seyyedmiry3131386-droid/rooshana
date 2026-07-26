package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.ct0;
import defpackage.g51;
import defpackage.js3;
import defpackage.nr5;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", l = {885}, m = "invokeSuspend", v = 1)
final class ClickableNode$createPointerInputNodeIfNeeded$1$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ androidx.compose.foundation.gestures.j b;
    public /* synthetic */ long c;
    public final /* synthetic */ ct0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$createPointerInputNodeIfNeeded$1$1(ct0 ct0Var, g51 g51Var) {
        super(3, g51Var);
        this.d = ct0Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((nr5) obj2).a;
        ClickableNode$createPointerInputNodeIfNeeded$1$1 clickableNode$createPointerInputNodeIfNeeded$1$1 = new ClickableNode$createPointerInputNodeIfNeeded$1$1(this.d, (g51) obj3);
        clickableNode$createPointerInputNodeIfNeeded$1$1.b = (androidx.compose.foundation.gestures.j) obj;
        clickableNode$createPointerInputNodeIfNeeded$1$1.c = j;
        return clickableNode$createPointerInputNodeIfNeeded$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objV;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.gestures.j jVar = this.b;
            long j = this.c;
            ct0 ct0Var = this.d;
            if (ct0Var.v) {
                this.a = 1;
                ab5 ab5Var = ct0Var.q;
                if (ab5Var == null || (objV = js3.v(new AbstractClickableNode$handlePressInteraction$2$1(jVar, j, ab5Var, ct0Var, null), this)) != coroutineSingletons) {
                    objV = tx8Var;
                }
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8Var;
    }
}
