package ir.mservices.market.app.detail.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$toggleBookmark$1$1", f = "AppDetailViewModel.kt", l = {1156, 1158}, m = "invokeSuspend", v = 1)
final class AppDetailViewModel$toggleBookmark$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppDetailViewModel b;
    public final /* synthetic */ ApplicationFullDto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel$toggleBookmark$1$1(g51 g51Var, ApplicationFullDto applicationFullDto, AppDetailViewModel appDetailViewModel) {
        super(2, g51Var);
        this.b = appDetailViewModel;
        this.c = applicationFullDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailViewModel$toggleBookmark$1$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailViewModel$toggleBookmark$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0.deleteBookmark(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r0.addBookmark(r7, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            ir.mservices.market.app.detail.ui.AppDetailViewModel r0 = r6.b
            c5 r1 = r0.G
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.b.b(r7)
            goto L65
        L1d:
            kotlin.b.b(r7)
            kotlinx.coroutines.flow.l r7 = r0.O
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4f
            ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto r7 = new ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto
            java.lang.String r1 = r1.a()
            java.lang.String r3 = "getAccountId(...)"
            defpackage.js3.o(r1, r3)
            ir.mservices.market.app.detail.data.ApplicationFullDto r3 = r6.c
            java.lang.String r3 = r3.getPackageName()
            java.util.List r3 = defpackage.br9.B(r3)
            r7.<init>(r1, r3)
            r6.a = r5
            java.lang.Object r7 = ir.mservices.market.app.detail.ui.AppDetailViewModel.J(r0, r7, r6)
            if (r7 != r2) goto L65
            goto L64
        L4f:
            ir.mservices.market.version2.webapi.requestdto.BookmarkRequestDTO r7 = new ir.mservices.market.version2.webapi.requestdto.BookmarkRequestDTO
            java.lang.String r1 = r1.a()
            hp r3 = r0.J0
            java.lang.String r3 = r3.a
            r7.<init>(r1, r3)
            r6.a = r4
            java.lang.Object r7 = ir.mservices.market.app.detail.ui.AppDetailViewModel.G(r0, r7, r6)
            if (r7 != r2) goto L65
        L64:
            return r2
        L65:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel$toggleBookmark$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
