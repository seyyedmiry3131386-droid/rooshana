package androidx.compose.foundation.text;

import defpackage.e71;
import defpackage.g51;
import defpackage.gh8;
import defpackage.qp2;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.si8;
import defpackage.sy6;
import defpackage.tb1;
import defpackage.tg8;
import defpackage.tx8;
import defpackage.x44;
import defpackage.zh8;
import defpackage.zi8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {350}, m = "invokeSuspend", v = 1)
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.compose.foundation.relocation.a b;
    public final /* synthetic */ zh8 c;
    public final /* synthetic */ x44 d;
    public final /* synthetic */ si8 e;
    public final /* synthetic */ rr5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(androidx.compose.foundation.relocation.a aVar, zh8 zh8Var, x44 x44Var, si8 si8Var, rr5 rr5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = zh8Var;
        this.d = x44Var;
        this.e = si8Var;
        this.f = rr5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        tg8 tg8Var = this.d.a;
        ri8 ri8Var = this.e.a;
        this.a = 1;
        int iQ = this.f.q(zi8.f(this.c.b));
        Object objA = this.b.a(iQ < ri8Var.a.a.b.length() ? ri8Var.b(iQ) : iQ != 0 ? ri8Var.b(iQ - 1) : new sy6(0.0f, 0.0f, 1.0f, (int) (gh8.a(tg8Var.b, tg8Var.g, tg8Var.h, gh8.a, 1) & 4294967295L)), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
