package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import defpackage.e71;
import defpackage.g51;
import defpackage.lb7;
import defpackage.ll;
import defpackage.nt0;
import defpackage.pt0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.wu8;
import defpackage.ye;
import defpackage.zi8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {886}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(f fVar, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = fVar;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TextFieldSelectionManager$copy$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$copy$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ll llVarE;
        pt0 pt0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        f fVar = this.b;
        if (zi8.d(fVar.q().b)) {
            llVarE = null;
        } else {
            llVarE = lb7.e(fVar.q());
            if (this.c) {
                int iF = zi8.f(fVar.q().b);
                fVar.c.invoke(f.g(fVar.q().a, uy6.b(iF, iF)));
                fVar.t(HandleState.a);
            }
        }
        if (llVarE != null && (pt0Var = fVar.g) != null) {
            nt0 nt0VarK = wu8.K(llVarE);
            this.a = 1;
            ((ye) pt0Var).a(nt0VarK);
            if (tx8Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8Var;
    }
}
