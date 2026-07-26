package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import defpackage.e71;
import defpackage.g51;
import defpackage.jl;
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
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {966}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$cut$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$cut$1(f fVar, g51 g51Var) {
        super(2, g51Var);
        this.b = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TextFieldSelectionManager$cut$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$cut$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        if (zi8.d(fVar.q().b) || !fVar.m()) {
            llVarE = null;
        } else {
            llVarE = lb7.e(fVar.q());
            ll llVarG = lb7.g(fVar.q(), fVar.q().a.b.length());
            ll llVarF = lb7.f(fVar.q(), fVar.q().a.b.length());
            jl jlVar = new jl(llVarG);
            jlVar.a(llVarF);
            ll llVarB = jlVar.b();
            int iG = zi8.g(fVar.q().b);
            fVar.c.invoke(f.g(llVarB, uy6.b(iG, iG)));
            fVar.t(HandleState.a);
            fVar.a.e = true;
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
