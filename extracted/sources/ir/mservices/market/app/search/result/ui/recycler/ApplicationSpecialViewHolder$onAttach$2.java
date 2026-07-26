package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2", f = "ApplicationSpecialViewHolder.kt", l = {100, 100}, m = "invokeSuspend", v = 1)
final class ApplicationSpecialViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SearchApplicationData c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2$2", f = "ApplicationSpecialViewHolder.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ a a;
        public final /* synthetic */ SearchApplicationData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, a aVar, SearchApplicationData searchApplicationData) {
            super(2, g51Var);
            this.a = aVar;
            this.b = searchApplicationData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(g51Var, this.a, this.b);
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
            ApplicationDTO applicationDTO = this.b.c;
            int i = a.F;
            this.a.z(applicationDTO);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationSpecialViewHolder$onAttach$2(g51 g51Var, a aVar, SearchApplicationData searchApplicationData) {
        super(2, g51Var);
        this.c = searchApplicationData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ApplicationSpecialViewHolder$onAttach$2 applicationSpecialViewHolder$onAttach$2 = new ApplicationSpecialViewHolder$onAttach$2(g51Var, this.d, this.c);
        applicationSpecialViewHolder$onAttach$2.b = obj;
        return applicationSpecialViewHolder$onAttach$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationSpecialViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData r3 = r7.c
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
            r2 = 3
            r0.<init>(r8, r3, r2)
            ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2$2 r8 = new ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2$2
            ir.mservices.market.app.search.result.ui.recycler.a r2 = r7.d
            r8.<init>(r6, r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.search.result.ui.recycler.ApplicationSpecialViewHolder$onAttach$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
