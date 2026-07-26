package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.g76;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.data.AttachImageCallbackData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$attachImage$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$attachImage$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ TogoFragment b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$attachImage$1(TogoFragment togoFragment, String str, String str2, String str3, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = togoFragment;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$attachImage$1 togoFragment$MyketInterface$attachImage$1 = new TogoFragment$MyketInterface$attachImage$1(this.b, this.c, this.d, this.e, this.f, g51Var);
        togoFragment$MyketInterface$attachImage$1.a = obj;
        return togoFragment$MyketInterface$attachImage$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$attachImage$1 togoFragment$MyketInterface$attachImage$1 = (TogoFragment$MyketInterface$attachImage$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$attachImage$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = TogoFragment.o1;
        TogoFragment togoFragment = this.b;
        togoFragment.n1().r(new TogoAction.AttachImageAction(new AttachImageCallbackData(this.c, this.d, this.e, this.f)));
        if (togoFragment.d1 != null) {
            g76.e(fragmentActivity);
            return tx8.a;
        }
        js3.V("photoUtils");
        throw null;
    }
}
