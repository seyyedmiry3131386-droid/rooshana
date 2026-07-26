package ir.mservices.market.setting.themeStyle;

import defpackage.dp2;
import defpackage.fa2;
import defpackage.g51;
import defpackage.ik8;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.themeStyle.ThemeStyleFragment$onViewCreated$6", f = "ThemeStyleFragment.kt", l = {158}, m = "invokeSuspend", v = 1)
final class ThemeStyleFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ThemeStyleFragment b;
    public final /* synthetic */ fa2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeStyleFragment$onViewCreated$6(ThemeStyleFragment themeStyleFragment, fa2 fa2Var, g51 g51Var) {
        super(1, g51Var);
        this.b = themeStyleFragment;
        this.c = fa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ThemeStyleFragment$onViewCreated$6(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((ThemeStyleFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ThemeStyleFragment.Z0;
            ThemeStyleFragment themeStyleFragment = this.b;
            rv6 rv6Var = themeStyleFragment.k1().e;
            ik8 ik8Var = new ik8(themeStyleFragment, this.c, 2);
            this.a = 1;
            if (rv6Var.a.a(ik8Var, this) == coroutineSingletons) {
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
