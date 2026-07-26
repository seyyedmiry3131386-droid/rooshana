package ir.mservices.market.setting.fontStyle.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.gv;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x2;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel$doRequest$1", f = "FontStyleViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class FontStyleViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ FontStyleViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontStyleViewModel$doRequest$1(FontStyleViewModel fontStyleViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = fontStyleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FontStyleViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FontStyleViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        FontStyleViewModel fontStyleViewModel = this.a;
        gv gvVar = fontStyleViewModel.v;
        l lVar = fontStyleViewModel.w;
        gvVar.getClass();
        js3.p(lVar, "selectedFont");
        xe2 xe2Var = (xe2) new m(gu9.o(false), new x2(24, lVar)).a;
        js3.p(xe2Var, "<this>");
        return new bz6(e.b(new o4(xe2Var, 18), y97.G(fontStyleViewModel)), null, null, null, 14);
    }
}
