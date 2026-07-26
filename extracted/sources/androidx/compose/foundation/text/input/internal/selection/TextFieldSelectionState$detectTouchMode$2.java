package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.e;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sy7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vg6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", l = {566}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionState$detectTouchMode$2 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(2, g51Var);
        textFieldSelectionState$detectTouchMode$2.c = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((TextFieldSelectionState$detectTouchMode$2) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            e eVar = (e) this.c;
            PointerEventPass pointerEventPass = PointerEventPass.a;
            this.c = eVar;
            this.b = 1;
            obj = eVar.a(pointerEventPass, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        sy7.k((vg6) obj);
        throw null;
    }
}
