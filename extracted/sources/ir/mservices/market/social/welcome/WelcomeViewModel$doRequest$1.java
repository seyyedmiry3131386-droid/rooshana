package ir.mservices.market.social.welcome;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g39;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.or7;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vr3;
import defpackage.xe2;
import defpackage.y97;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.welcome.WelcomeViewModel$doRequest$1", f = "WelcomeViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class WelcomeViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ WelcomeViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeViewModel$doRequest$1(WelcomeViewModel welcomeViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = welcomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new WelcomeViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WelcomeViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        WelcomeViewModel welcomeViewModel = this.a;
        vr3 vr3Var = welcomeViewModel.v;
        rv6 rv6Var = welcomeViewModel.C;
        rv6 rv6Var2 = welcomeViewModel.E;
        rv6 rv6Var3 = welcomeViewModel.F;
        rv6 rv6Var4 = welcomeViewModel.D;
        rv6 rv6Var5 = welcomeViewModel.G;
        i iVar = welcomeViewModel.R;
        l lVar = welcomeViewModel.M;
        vr3Var.getClass();
        js3.p(rv6Var, "nameFlow");
        js3.p(rv6Var2, "currentAvatarFlow");
        js3.p(rv6Var3, "uploadAvatarPathFlow");
        js3.p(rv6Var4, "birthdayFlow");
        js3.p(rv6Var5, "genderFlow");
        js3.p(iVar, "avatarProgressStateFlow");
        js3.p(lVar, "nameErrorFlow");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new or7(rv6Var, rv6Var2, rv6Var3, rv6Var4, rv6Var5, iVar, lVar)).a, new g39(6)), y97.G(welcomeViewModel)), null, null, null, 14);
    }
}
