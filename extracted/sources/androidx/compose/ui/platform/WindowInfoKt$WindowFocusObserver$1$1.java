package androidx.compose.ui.platform;

import defpackage.bp2;
import defpackage.dd9;
import defpackage.e71;
import defpackage.g51;
import defpackage.he9;
import defpackage.l44;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {72}, m = "invokeSuspend", v = 1)
final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ he9 b;
    public final /* synthetic */ wb5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(he9 he9Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = he9Var;
        this.c = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            final he9 he9Var = this.b;
            vb7 vb7VarL = androidx.compose.runtime.g.l(new bp2() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    return Boolean.valueOf(((l44) he9Var).a());
                }
            });
            dd9 dd9Var = new dd9(4, this.c);
            this.a = 1;
            if (vb7VarL.a(dd9Var, this) == coroutineSingletons) {
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
