package ir.mservices.market.app.common.recycler;

import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.k84;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xf5;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2", f = "AppViewHolder.kt", l = {144, 144}, m = "invokeSuspend", v = 1)
final class AppViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AppData c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2$2", f = "AppViewHolder.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ a a;
        public final /* synthetic */ AppData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, AppData appData, a aVar) {
            super(2, g51Var);
            this.a = aVar;
            this.b = appData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(g51Var, this.b, this.a);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            a aVar = this.a;
            xf5 xf5Var = aVar.A;
            if (xf5Var == null) {
                js3.V("myketUIUtils");
                throw null;
            }
            AppData appData = this.b;
            ApplicationDTO applicationDTO = appData.c;
            ApplicationDTO applicationDTO2 = appData.c;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            int versionCode = applicationDTO2.getVersionCode();
            boolean zIsIncompatible = applicationDTO2.isIncompatible();
            ForceUpdateDto forceUpdate = applicationDTO2.getForceUpdate();
            k84 k84Var = aVar.z;
            if (k84Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = k84Var.y;
            js3.o(myketTextView, PackageListMetaDataDTO.KEY_DESCRIPTION);
            String tagline = applicationDTO2.getTagline();
            xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView, (tagline == null || f88.n0(tagline)) ? applicationDTO2.getCategoryName() : applicationDTO2.getTagline());
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewHolder$onAttach$2(g51 g51Var, AppData appData, a aVar) {
        super(2, g51Var);
        this.c = appData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AppViewHolder$onAttach$2 appViewHolder$onAttach$2 = new AppViewHolder$onAttach$2(g51Var, this.c, this.d);
        appViewHolder$onAttach$2.b = obj;
        return appViewHolder$onAttach$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (kotlinx.coroutines.flow.d.f(r0, r8, r7) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r7.a
            ir.mservices.market.app.common.recycler.AppData r3 = r7.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.b.b(r8)
            goto L4d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.b.b(r8)
            goto L33
        L23:
            kotlin.b.b(r8)
            fu7 r8 = r3.b
            r7.b = r6
            r7.a = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
            if (r8 != r1) goto L33
            goto L4c
        L33:
            xe2 r8 = (defpackage.xe2) r8
            xp r0 = new xp
            r2 = 2
            r0.<init>(r8, r3, r2)
            ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2$2 r8 = new ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2$2
            ir.mservices.market.app.common.recycler.a r2 = r7.d
            r8.<init>(r6, r3, r2)
            r7.b = r6
            r7.a = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r0, r8, r7)
            if (r8 != r1) goto L4d
        L4c:
            return r1
        L4d:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.common.recycler.AppViewHolder$onAttach$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
