package ir.mservices.market.login.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.n99;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$4", f = "PinLoginDialogFragment.kt", l = {139}, m = "invokeSuspend", v = 1)
final class PinLoginDialogFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PinLoginDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$4$1", f = "PinLoginDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PinLoginDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = pinLoginDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.a
                n99 r0 = (defpackage.n99) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                kotlin.b.b(r4)
                boolean r4 = r0 instanceof defpackage.l99
                ir.mservices.market.login.ui.PinLoginDialogFragment r1 = r3.b
                if (r4 == 0) goto L44
                l99 r0 = (defpackage.l99) r0
                java.lang.Object r4 = r0.a
                java.lang.String r4 = (java.lang.String) r4
                r1.T0()
                r1.I0()
                androidx.fragment.app.FragmentActivity r0 = r1.F()
                if (r4 == 0) goto L2b
                boolean r2 = defpackage.f88.n0(r4)
                if (r2 != 0) goto L28
                goto L29
            L28:
                r4 = 0
            L29:
                if (r4 != 0) goto L36
            L2b:
                int r4 = defpackage.rs6.bind_phone_message_confirmation
                java.lang.String r4 = r1.L(r4)
                java.lang.String r2 = "getString(...)"
                defpackage.js3.o(r4, r2)
            L36:
                hh2 r2 = new hh2
                r2.<init>(r0, r4)
                defpackage.hh2.H(r2)
                ir.mservices.market.version2.fragments.dialog.DialogResult r4 = ir.mservices.market.version2.fragments.dialog.DialogResult.a
                ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment.S0(r1, r4)
                goto L7c
            L44:
                boolean r4 = r0 instanceof defpackage.h99
                if (r4 == 0) goto L7c
                h99 r0 = (defpackage.h99) r0
                ir.mservices.market.version2.webapi.responsedto.ErrorDTO r4 = r0.a
                java.lang.String r0 = r4.getTranslatedMessage()
                r2 = 0
                if (r0 == 0) goto L79
                boolean r0 = defpackage.f88.n0(r0)
                if (r0 == 0) goto L5a
                goto L79
            L5a:
                wn2 r0 = r1.n1
                defpackage.js3.m(r0)
                ir.mservices.market.views.MyketTextView r0 = r0.v
                r0.setVisibility(r2)
                java.lang.String r4 = r4.getTranslatedMessage()
                r0.setText(r4)
                wn2 r4 = r1.n1
                defpackage.js3.m(r4)
                ir.mservices.market.views.MyketInputLayout r4 = r4.w
                r0 = 1
                r4.setErrorEnabled(r0)
                r1.T0()
            L79:
                r1.e1(r2)
            L7c:
                tx8 r4 = defpackage.tx8.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinLoginDialogFragment$onViewCreated$4(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pinLoginDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PinLoginDialogFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PinLoginDialogFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PinLoginDialogFragment pinLoginDialogFragment = this.b;
            rv6 rv6Var = pinLoginDialogFragment.f1().l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pinLoginDialogFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
