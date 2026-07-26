package ir.mservices.market.setting.themeStyle;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vr3;
import defpackage.xe2;
import defpackage.xv3;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.themeStyle.ThemeStyleViewModel$doRequest$1", f = "ThemeStyleViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ThemeStyleViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ThemeStyleViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeStyleViewModel$doRequest$1(ThemeStyleViewModel themeStyleViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = themeStyleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ThemeStyleViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeStyleViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ThemeStyleViewModel themeStyleViewModel = this.a;
        vr3 vr3Var = themeStyleViewModel.v;
        l lVar = themeStyleViewModel.x;
        vr3Var.getClass();
        js3.p(lVar, "selectedTheme");
        xe2 xe2Var = (xe2) new m(gu9.o(false), new xv3(vr3Var, lVar, 26)).a;
        js3.p(xe2Var, "<this>");
        return new bz6(e.b(new o4(xe2Var, 18), y97.G(themeStyleViewModel)), null, null, null, 14);
    }
}
