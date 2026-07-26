package androidx.compose.material3;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
final class ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(n nVar, float f, g51 g51Var) {
        super(2, g51Var);
        this.b = nVar;
        this.c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            Object objJ = this.b.d.j(this.c, this);
            if (objJ != coroutineSingletons) {
                objJ = tx8Var;
            }
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8Var;
    }
}
