package ir.mservices.market.common.ext.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wv8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.ext.model.ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1", f = "ExtensionAppsRepositoryImpl.kt", l = {58}, m = "invokeSuspend", v = 1)
final class ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1 extends SuspendLambda implements dp2 {
    public boolean a;
    public int b;
    public final /* synthetic */ wv8 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1(wv8 wv8Var, Object obj, boolean z, g51 g51Var) {
        super(1, g51Var);
        this.c = wv8Var;
        this.d = obj;
        this.e = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            boolean r0 = r7.a
            kotlin.b.b(r8)
            goto L85
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.b.b(r8)
            wv8 r8 = r7.c
            java.lang.Object r1 = r8.c
            wt r1 = (defpackage.wt) r1
            ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl r1 = (ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl) r1
            java.util.ArrayList r1 = r1.a(r3)
            sy0 r4 = new sy0
            r5 = 9
            r4.<init>(r5)
            ex0 r5 = new ex0
            r6 = 1
            r5.<init>(r6, r4)
            kotlin.collections.a.J0(r1, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.wu0.V(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r1.next()
            s30 r5 = (defpackage.s30) r5
            o30 r5 = r5.a
            java.lang.String r5 = r5.n
            r4.add(r5)
            goto L47
        L5b:
            boolean r1 = r4.isEmpty()
            r5 = 0
            if (r1 != 0) goto L63
            goto L64
        L63:
            r4 = r5
        L64:
            if (r4 == 0) goto Lac
            gj4 r1 = kotlin.collections.a.d0(r4)
            ir.mservices.market.app.update.data.StateAppsRequestDto r4 = new ir.mservices.market.app.update.data.StateAppsRequestDto
            r4.<init>(r1)
            java.lang.Object r8 = r8.d
            rn6 r8 = (defpackage.rn6) r8
            boolean r1 = r7.e
            r7.a = r1
            r7.b = r2
            java.lang.String r2 = "ExtUpdate"
            java.lang.Object r5 = r7.d
            java.lang.Object r8 = r8.o(r2, r4, r5, r7)
            if (r8 != r0) goto L84
            return r0
        L84:
            r0 = r1
        L85:
            r5 = r8
            n99 r5 = (defpackage.n99) r5
            boolean r8 = r5 instanceof defpackage.l99
            if (r8 == 0) goto Lac
            r8 = r5
            l99 r8 = (defpackage.l99) r8
            java.lang.Object r8 = r8.a
            if (r0 == 0) goto Lac
            ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto r8 = (ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto) r8
            java.util.List r0 = r8.getItems()
            java.util.List r1 = r8.getItems()
            int r1 = r1.size()
            r2 = 3
            if (r1 <= r2) goto La5
            r1 = r2
        La5:
            java.util.List r0 = r0.subList(r3, r1)
            r8.setItems(r0)
        Lac:
            if (r5 != 0) goto Lbe
            h99 r8 = new h99
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r0 = new ir.mservices.market.version2.webapi.responsedto.ErrorDTO
            java.lang.String r1 = "EmptyList"
            java.lang.String r2 = ""
            r3 = -1
            r0.<init>(r3, r1, r2)
            r8.<init>(r0)
            return r8
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.ext.model.ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
