package ir.mservices.market.togo;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.js8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$openIntent$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$openIntent$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ TogoFragment a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$openIntent$1(TogoFragment togoFragment, boolean z, String str, String str2, g51 g51Var) {
        super(2, g51Var);
        this.a = togoFragment;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$openIntent$1(this.a, this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TogoFragment$MyketInterface$openIntent$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zQ;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        TogoFragment togoFragment = this.a;
        if (togoFragment.F() == null) {
            return Boolean.FALSE;
        }
        if (this.b) {
            togoFragment.J0.q();
        }
        FragmentActivity fragmentActivityF = togoFragment.F();
        String str = this.d;
        if (str == null || f88.n0(str)) {
            str = null;
        }
        String str2 = this.c;
        if (str2 != null) {
            Uri uri = Uri.parse(str2);
            js3.o(uri, "parse(...)");
            zQ = js8.q(fragmentActivityF, uri, str, null);
        } else {
            zQ = false;
        }
        return Boolean.valueOf(zQ);
    }
}
