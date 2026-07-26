package androidx.navigation3.ui;

import androidx.compose.runtime.g;
import defpackage.cj5;
import defpackage.e71;
import defpackage.e9;
import defpackage.g51;
import defpackage.hb5;
import defpackage.jr8;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.y08;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1", f = "NavDisplay.kt", l = {577}, m = "invokeSuspend", v = 1)
final class NavDisplayKt__NavDisplayKt$NavDisplay$12$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ jr8 b;
    public final /* synthetic */ y08 c;
    public final /* synthetic */ hb5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDisplayKt__NavDisplayKt$NavDisplay$12$1(jr8 jr8Var, y08 y08Var, hb5 hb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = jr8Var;
        this.c = y08Var;
        this.d = hb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NavDisplayKt__NavDisplayKt$NavDisplay$12$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavDisplayKt__NavDisplayKt$NavDisplay$12$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        jr8 jr8Var = this.b;
        vb7 vb7VarL = g.l(new cj5(jr8Var, 0));
        e9 e9Var = new e9(jr8Var, this.c, this.d, 6);
        this.a = 1;
        Object objA = vb7VarL.a(new pt1(e9Var, 25), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
