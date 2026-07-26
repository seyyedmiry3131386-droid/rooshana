package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.g;
import defpackage.e71;
import defpackage.fl7;
import defpackage.g51;
import defpackage.mw7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {144}, m = "invokeSuspend", v = 1)
final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(2, g51Var);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.b = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            vb7 vb7VarL = g.l(new mw7(6));
            fl7 fl7Var = new fl7(6);
            this.a = 1;
            if (vb7VarL.a(fl7Var, this) == coroutineSingletons) {
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
