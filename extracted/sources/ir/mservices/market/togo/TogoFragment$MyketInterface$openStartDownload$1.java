package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.f88;
import defpackage.g51;
import defpackage.hp;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.data.NavIntentDirections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$openStartDownload$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$openStartDownload$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TogoFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$openStartDownload$1(g51 g51Var, TogoFragment togoFragment, String str, String str2) {
        super(2, g51Var);
        this.a = str;
        this.b = str2;
        this.c = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$openStartDownload$1(g51Var, this.c, this.a, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$openStartDownload$1 togoFragment$MyketInterface$openStartDownload$1 = (TogoFragment$MyketInterface$openStartDownload$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$openStartDownload$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = this.b;
        Tracker tracker = new Tracker("togo", str, "download");
        if (str == null || f88.n0(str)) {
            str = "Togo";
        }
        NavIntentDirections.AppDetail appDetail = new NavIntentDirections.AppDetail(new hp(this.a, true, tracker, false, null, str, null, "", null, null, null, null, null));
        int i = TogoFragment.o1;
        pk5.f(this.c.J0, appDetail);
        return tx8.a;
    }
}
