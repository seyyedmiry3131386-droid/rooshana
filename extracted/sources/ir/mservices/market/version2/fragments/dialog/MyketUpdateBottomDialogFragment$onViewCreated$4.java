package ir.mservices.market.version2.fragments.dialog;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.dialog.MyketUpdateBottomDialogFragment$onViewCreated$4", f = "MyketUpdateBottomDialogFragment.kt", l = {72}, m = "invokeSuspend", v = 1)
final class MyketUpdateBottomDialogFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MyketUpdateBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketUpdateBottomDialogFragment$onViewCreated$4(MyketUpdateBottomDialogFragment myketUpdateBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = myketUpdateBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MyketUpdateBottomDialogFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MyketUpdateBottomDialogFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(200L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        BottomSheetBehavior bottomSheetBehavior = this.b.d1;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.O(3);
        }
        return tx8.a;
    }
}
