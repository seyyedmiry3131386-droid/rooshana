package androidx.compose.foundation.text;

import defpackage.a61;
import defpackage.cj3;
import defpackage.e71;
import defpackage.g51;
import defpackage.ii8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v8;
import defpackage.vb7;
import defpackage.wb5;
import defpackage.x44;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {367}, m = "invokeSuspend", v = 1)
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ x44 b;
    public final /* synthetic */ wb5 c;
    public final /* synthetic */ ii8 d;
    public final /* synthetic */ androidx.compose.foundation.text.selection.f e;
    public final /* synthetic */ cj3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(x44 x44Var, wb5 wb5Var, ii8 ii8Var, androidx.compose.foundation.text.selection.f fVar, cj3 cj3Var, g51 g51Var) {
        super(2, g51Var);
        this.b = x44Var;
        this.c = wb5Var;
        this.d = ii8Var;
        this.e = fVar;
        this.f = cj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        x44 x44Var = this.b;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                vb7 vb7VarL = androidx.compose.runtime.g.l(new v8(this.c, 4));
                a61 a61Var = new a61(x44Var, this.d, this.e, this.f, 0);
                this.a = 1;
                if (vb7VarL.a(a61Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            c.f(x44Var);
            return tx8.a;
        } catch (Throwable th) {
            c.f(x44Var);
            throw th;
        }
    }
}
