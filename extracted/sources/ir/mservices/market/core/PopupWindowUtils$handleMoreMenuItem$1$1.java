package ir.mservices.market.core;

import android.widget.PopupWindow;
import defpackage.e71;
import defpackage.fu7;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.core.PopupWindowUtils$handleMoreMenuItem$1$1", f = "PopupWindowUtils.kt", l = {110}, m = "invokeSuspend", v = 1)
final class PopupWindowUtils$handleMoreMenuItem$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ fu7 b;
    public final /* synthetic */ PopupWindow c;
    public final /* synthetic */ xb5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupWindowUtils$handleMoreMenuItem$1$1(fu7 fu7Var, PopupWindow popupWindow, xb5 xb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = fu7Var;
        this.c = popupWindow;
        this.d = xb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PopupWindowUtils$handleMoreMenuItem$1$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PopupWindowUtils$handleMoreMenuItem$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            nl nlVar = new nl(this.c, this.d, 27);
            this.a = 1;
            if (this.b.a(nlVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
