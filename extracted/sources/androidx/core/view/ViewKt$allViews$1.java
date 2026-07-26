package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uq8;
import defpackage.w0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, g51 g51Var) {
        super(2, g51Var);
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.d, g51Var);
        viewKt$allViews$1.c = obj;
        return viewKt$allViews$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = CoroutineSingletons.a;
        int i = this.b;
        View view = this.d;
        if (i == 0) {
            b.b(obj);
            io7 io7Var = (io7) this.c;
            this.c = io7Var;
            this.b = 1;
            io7Var.b(this, view);
            return obj3;
        }
        Object obj4 = tx8.a;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj4;
        }
        io7 io7Var2 = (io7) this.c;
        b.b(obj);
        if (view instanceof ViewGroup) {
            this.c = null;
            this.b = 2;
            io7Var2.getClass();
            uq8 uq8Var = new uq8(new w0(8, (ViewGroup) view));
            io7Var2.getClass();
            if (uq8Var.hasNext()) {
                io7Var2.c = uq8Var;
                io7Var2.a = 2;
                io7Var2.d = this;
                obj2 = CoroutineSingletons.a;
            } else {
                obj2 = tx8.a;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }
}
