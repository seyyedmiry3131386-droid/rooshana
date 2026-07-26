package ir.mservices.market.app.url;

import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.url.UrlViewModel$doRequest$1", f = "UrlViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class UrlViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ UrlViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlViewModel$doRequest$1(UrlViewModel urlViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = urlViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UrlViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UrlViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            kotlin.b.b(r8)
            bz6 r8 = new bz6
            r8.<init>()
            ir.mservices.market.app.url.UrlViewModel r0 = r7.a
            wv8 r1 = r0.x
            t09 r2 = r0.z
            java.lang.String r3 = r2.d
            int r4 = r3.hashCode()
            r5 = -1530360837(0xffffffffa4c88bfb, float:-8.697331E-17)
            r6 = 0
            if (r4 == r5) goto L61
            r5 = 2047634(0x1f3e92, float:2.869346E-39)
            if (r4 == r5) goto L58
            r5 = 1327693479(0x4f22fea7, float:2.734598E9)
            if (r4 == r5) goto L27
            goto L69
        L27:
            java.lang.String r4 = "Banners"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L30
            goto L69
        L30:
            nm5 r1 = r0.y
            java.lang.String r2 = r2.a
            r1.getClass()
            java.lang.String r3 = "source"
            defpackage.js3.p(r2, r3)
            androidx.paging.m r3 = new androidx.paging.m
            rz5 r4 = defpackage.gu9.B()
            ir.mservices.market.common.ext.model.movie.a r5 = new ir.mservices.market.common.ext.model.movie.a
            r5.<init>(r1, r2, r0, r6)
            r3.<init>(r4, r5)
            java.lang.Object r1 = r3.a
            xe2 r1 = (defpackage.xe2) r1
            lc8 r2 = new lc8
            r2.<init>(r0)
            sz5 r0 = defpackage.gu9.x(r1, r2)
            goto Laa
        L58:
            java.lang.String r4 = "Apps"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L69
            goto L92
        L61:
            java.lang.String r4 = "Reviews"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L92
        L69:
            r1.getClass()
            androidx.paging.m r2 = new androidx.paging.m
            rz5 r3 = defpackage.gu9.o(r6)
            ir.mservices.market.common.ext.model.b r4 = new ir.mservices.market.common.ext.model.b
            r4.<init>(r1, r0, r6)
            r2.<init>(r3, r4)
            java.lang.Object r1 = r2.a
            xe2 r1 = (defpackage.xe2) r1
            a67 r2 = new a67
            r3 = 25
            r2.<init>(r3, r0)
            sz5 r1 = defpackage.gu9.x(r1, r2)
            fu0 r0 = defpackage.y97.G(r0)
            pv6 r0 = androidx.paging.e.b(r1, r0)
            goto Laa
        L92:
            java.lang.String r2 = r2.a
            xe2 r1 = defpackage.dw1.e(r1, r2, r0, r6)
            nr8 r2 = new nr8
            r3 = 6
            r2.<init>(r0, r8, r3)
            sz5 r1 = defpackage.gu9.x(r1, r2)
            fu0 r0 = defpackage.y97.G(r0)
            pv6 r0 = androidx.paging.e.b(r1, r0)
        Laa:
            r8.a = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.url.UrlViewModel$doRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
