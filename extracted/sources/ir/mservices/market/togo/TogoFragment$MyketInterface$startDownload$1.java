package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.a77;
import defpackage.b56;
import defpackage.d56;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.k68;
import defpackage.qp2;
import defpackage.rf7;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.togo.TogoAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$startDownload$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$startDownload$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ TogoFragment b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$startDownload$1(g51 g51Var, TogoFragment togoFragment, String str, String str2) {
        super(2, g51Var);
        this.b = togoFragment;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$startDownload$1 togoFragment$MyketInterface$startDownload$1 = new TogoFragment$MyketInterface$startDownload$1(g51Var, this.b, this.c, this.d);
        togoFragment$MyketInterface$startDownload$1.a = obj;
        return togoFragment$MyketInterface$startDownload$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$startDownload$1 togoFragment$MyketInterface$startDownload$1 = (TogoFragment$MyketInterface$startDownload$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$startDownload$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strG;
        FragmentActivity fragmentActivity = (FragmentActivity) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        TogoFragment togoFragment = this.b;
        if (togoFragment.Y0 == null) {
            js3.V("permissionFactory");
            throw null;
        }
        Permission permissionA = b56.a(togoFragment.K(), 1, PermissionReasonId.a, Quality.MANDATORY);
        d56 d56Var = togoFragment.X0;
        if (d56Var == null) {
            js3.V("permissionHelper");
            throw null;
        }
        String str = permissionA.b;
        js3.o(str, "getManifestId(...)");
        if (!d56.c(fragmentActivity, str)) {
            d56Var = null;
        }
        String str2 = this.c;
        if (d56Var != null) {
            String str3 = k68.e;
            strG = a77.g(str2);
        } else {
            strG = null;
        }
        if (togoFragment.Z0 == null) {
            js3.V("screenQualityHelper");
            throw null;
        }
        int iA = rf7.a(fragmentActivity);
        TogoViewModel togoViewModelN1 = togoFragment.n1();
        String str4 = this.d;
        if (str4 == null || f88.n0(str4)) {
            str4 = "Togo";
        }
        togoViewModelN1.r(new TogoAction.GetAppDetailAction(str2, str4, strG, iA));
        return tx8.a;
    }
}
