package androidx.navigation3.ui;

import androidx.compose.animation.core.e;
import defpackage.e71;
import defpackage.ee7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$7$1", f = "NavDisplay.kt", l = {477}, m = "invokeSuspend", v = 1)
final class NavDisplayKt__NavDisplayKt$NavDisplay$7$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ee7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDisplayKt__NavDisplayKt$NavDisplay$7$1(e eVar, float f, ee7 ee7Var, g51 g51Var) {
        super(2, g51Var);
        this.b = eVar;
        this.c = f;
        this.d = ee7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NavDisplayKt__NavDisplayKt$NavDisplay$7$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavDisplayKt__NavDisplayKt$NavDisplay$7$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (this.b.L(this.c, this.d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
