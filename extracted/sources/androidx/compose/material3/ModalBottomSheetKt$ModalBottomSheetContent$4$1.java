package androidx.compose.material3;

import defpackage.dp2;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ float a;
    public final /* synthetic */ dp2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(g51 g51Var, dp2 dp2Var) {
        super(3, g51Var);
        this.b = dp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1((g51) obj3, this.b);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.a = fFloatValue;
        tx8 tx8Var = tx8.a;
        modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.b.invoke(new Float(this.a));
        return tx8.a;
    }
}
