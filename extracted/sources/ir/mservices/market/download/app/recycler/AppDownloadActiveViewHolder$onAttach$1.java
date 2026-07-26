package ir.mservices.market.download.app.recycler;

import defpackage.cs1;
import defpackage.e71;
import defpackage.es1;
import defpackage.g51;
import defpackage.js3;
import defpackage.ps1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1", f = "AppDownload.kt", l = {203, 203}, m = "invokeSuspend", v = 1)
final class AppDownloadActiveViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AppDownloadData c;
    public final /* synthetic */ a d;

    /* JADX INFO: renamed from: ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1$1", f = "AppDownload.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ AppDownloadData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, a aVar, AppDownloadData appDownloadData) {
            super(2, g51Var);
            this.b = aVar;
            this.c = appDownloadData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b, this.c);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((cs1) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cs1 cs1Var = (cs1) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            es1 es1Var = (es1) cs1Var.a;
            boolean z = es1Var.f != 100;
            boolean z2 = es1Var.g != 102;
            if (z || z2) {
                a aVar = this.b;
                ps1 ps1Var = aVar.B;
                if (ps1Var == null) {
                    js3.V("downloadManager");
                    throw null;
                }
                AppDownloadData appDownloadData = this.c;
                AppDownloadInfo appDownloadInfoI = ps1Var.i(appDownloadData.m, null);
                if (appDownloadInfoI != null) {
                    aVar.E(appDownloadData, appDownloadInfoI);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDownloadActiveViewHolder$onAttach$1(g51 g51Var, a aVar, AppDownloadData appDownloadData) {
        super(2, g51Var);
        this.c = appDownloadData;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AppDownloadActiveViewHolder$onAttach$1 appDownloadActiveViewHolder$onAttach$1 = new AppDownloadActiveViewHolder$onAttach$1(g51Var, this.d, this.c);
        appDownloadActiveViewHolder$onAttach$1.b = obj;
        return appDownloadActiveViewHolder$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDownloadActiveViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r0, r7) == r1) goto L15;
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
            ir.mservices.market.download.app.recycler.AppDownloadData r3 = r7.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.b.b(r8)
            goto L47
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
            vb7 r8 = r3.h
            r7.b = r6
            r7.a = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
            if (r8 != r1) goto L33
            goto L46
        L33:
            xe2 r8 = (defpackage.xe2) r8
            ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1$1 r0 = new ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1$1
            ir.mservices.market.download.app.recycler.a r2 = r7.d
            r0.<init>(r6, r2, r3)
            r7.b = r6
            r7.a = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r0, r7)
            if (r8 != r1) goto L47
        L46:
            return r1
        L47:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.recycler.AppDownloadActiveViewHolder$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
