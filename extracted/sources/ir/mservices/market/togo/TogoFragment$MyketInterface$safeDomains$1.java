package ir.mservices.market.togo;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import defpackage.an2;
import defpackage.ew;
import defpackage.fg5;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.togo.TogoAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$safeDomains$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$safeDomains$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ TogoFragment a;
    public final /* synthetic */ String[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$safeDomains$1(TogoFragment togoFragment, String[] strArr, g51 g51Var) {
        super(2, g51Var);
        this.a = togoFragment;
        this.b = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$safeDomains$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$safeDomains$1 togoFragment$MyketInterface$safeDomains$1 = (TogoFragment$MyketInterface$safeDomains$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$safeDomains$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        TogoFragment togoFragment = this.a;
        an2 an2Var = togoFragment.f1;
        js3.m(an2Var);
        String url = an2Var.y.getUrl();
        Uri uri = url != null ? Uri.parse(url) : null;
        tx8 tx8Var = tx8.a;
        if (uri != null && fg5.c(uri)) {
            togoFragment.n1().r(new TogoAction.SafeDomainAction(ew.X0(this.b)));
        }
        return tx8Var;
    }
}
