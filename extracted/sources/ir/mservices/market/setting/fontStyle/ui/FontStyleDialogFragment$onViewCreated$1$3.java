package ir.mservices.market.setting.fontStyle.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xi2;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment$onViewCreated$1$3", f = "FontStyleDialogFragment.kt", l = {120}, m = "invokeSuspend", v = 1)
final class FontStyleDialogFragment$onViewCreated$1$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ FontStyleDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontStyleDialogFragment$onViewCreated$1$3(FontStyleDialogFragment fontStyleDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = fontStyleDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FontStyleDialogFragment$onViewCreated$1$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((FontStyleDialogFragment$onViewCreated$1$3) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            FontStyleDialogFragment fontStyleDialogFragment = this.b;
            rv6 rv6Var = ((FontStyleViewModel) fontStyleDialogFragment.k1.getValue()).e;
            xi2 xi2Var = new xi2(fontStyleDialogFragment, 1);
            this.a = 1;
            if (rv6Var.a.a(xi2Var, this) == coroutineSingletons) {
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
