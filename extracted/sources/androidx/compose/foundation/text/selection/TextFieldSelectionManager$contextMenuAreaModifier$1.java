package androidx.compose.foundation.text.selection;

import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x96;
import defpackage.zi8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(f fVar, g51 g51Var) {
        super(2, g51Var);
        this.b = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.b, g51Var);
        long j = ((nr5) obj).a;
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((nr5) obj).a;
        return new TextFieldSelectionManager$contextMenuAreaModifier$1(this.b, (g51) obj2).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        f fVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (fVar.v(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        Pair pairA = f.a(fVar);
        if (pairA != null) {
            String str = (String) pairA.a;
            long j = ((zi8) pairA.b).a;
            x96 x96Var = fVar.i;
            if (x96Var != null) {
                this.a = 2;
                Object objD = ((a) x96Var).d(str, j, this);
                if (objD != coroutineSingletons) {
                    objD = tx8Var;
                }
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return tx8Var;
    }
}
