package ir.mservices.market.app.common.recycler;

import defpackage.b95;
import defpackage.cs1;
import defpackage.e71;
import defpackage.es1;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xf5;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1", f = "MultiAppNestedViewHolder.kt", l = {141, 141}, m = "invokeSuspend", v = 1)
final class MultiAppNestedViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AppNestedData c;
    public final /* synthetic */ c d;

    /* JADX INFO: renamed from: ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1$1", f = "MultiAppNestedViewHolder.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AppNestedData b;
        public final /* synthetic */ c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppNestedData appNestedData, c cVar, g51 g51Var) {
            super(2, g51Var);
            this.b = appNestedData;
            this.c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, g51Var);
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
            ApplicationDTO applicationDTO;
            cs1 cs1Var = (cs1) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            if (((es1) cs1Var.a).f == 140 && (applicationDTO = this.b.a) != null) {
                c cVar = this.c;
                xf5 xf5Var = cVar.B;
                if (xf5Var == null) {
                    js3.V("myketUIUtils");
                    throw null;
                }
                String packageName = applicationDTO.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                int versionCode = applicationDTO.getVersionCode();
                boolean zIsIncompatible = applicationDTO.isIncompatible();
                ForceUpdateDto forceUpdate = applicationDTO.getForceUpdate();
                b95 b95Var = cVar.z;
                if (b95Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = b95Var.w;
                js3.o(myketTextView, "applicationDescription");
                String tagline = applicationDTO.getTagline();
                xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView, (tagline == null || f88.n0(tagline)) ? applicationDTO.getCategoryName() : applicationDTO.getTagline());
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAppNestedViewHolder$onAttach$1(AppNestedData appNestedData, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.c = appNestedData;
        this.d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MultiAppNestedViewHolder$onAttach$1 multiAppNestedViewHolder$onAttach$1 = new MultiAppNestedViewHolder$onAttach$1(this.c, this.d, g51Var);
        multiAppNestedViewHolder$onAttach$1.b = obj;
        return multiAppNestedViewHolder$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiAppNestedViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            ir.mservices.market.app.common.recycler.AppNestedData r3 = r7.c
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
            xe2 r8 = r3.e
            r7.b = r6
            r7.a = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
            if (r8 != r1) goto L33
            goto L46
        L33:
            xe2 r8 = (defpackage.xe2) r8
            ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1$1 r0 = new ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1$1
            ir.mservices.market.app.common.recycler.c r2 = r7.d
            r0.<init>(r3, r2, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.common.recycler.MultiAppNestedViewHolder$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
