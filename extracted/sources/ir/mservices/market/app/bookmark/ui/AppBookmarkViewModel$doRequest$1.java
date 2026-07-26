package ir.mservices.market.app.bookmark.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.n;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$doRequest$1", f = "AppBookmarkViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppBookmarkViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ AppBookmarkViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBookmarkViewModel$doRequest$1(AppBookmarkViewModel appBookmarkViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = appBookmarkViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppBookmarkViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppBookmarkViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final AppBookmarkViewModel appBookmarkViewModel = this.a;
        final ql4 ql4Var = appBookmarkViewModel.J;
        final String strA = appBookmarkViewModel.G.a();
        js3.o(strA, "getAccountId(...)");
        ql4Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.bookmark.ui.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new AppBookmarkRepositoryImpl$getBookmarks$1$1(null, ql4Var, appBookmarkViewModel, strA), null);
            }
        }).a, new n(7, appBookmarkViewModel)), y97.G(appBookmarkViewModel)), null, null, null, 14);
    }
}
