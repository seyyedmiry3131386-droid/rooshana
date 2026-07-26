package ir.mservices.market.myAccount.dialog.bio;

import android.os.Bundle;
import defpackage.c5;
import defpackage.dp2;
import defpackage.g51;
import defpackage.h4;
import defpackage.h99;
import defpackage.js3;
import defpackage.l99;
import defpackage.lu7;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z4;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$onViewCreated$4", f = "BioBottomDialogFragment.kt", l = {103}, m = "invokeSuspend", v = 1)
final class BioBottomDialogFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BioBottomDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$onViewCreated$4$1", f = "BioBottomDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BioBottomDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BioBottomDialogFragment bioBottomDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = bioBottomDialogFragment;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = n99Var instanceof l99;
            BioBottomDialogFragment bioBottomDialogFragment = this.b;
            if (z) {
                MyketProgressState myketProgressState = MyketProgressState.b;
                h4 h4Var = bioBottomDialogFragment.h1;
                js3.m(h4Var);
                h4Var.v.setStateCommit(myketProgressState);
                h4 h4Var2 = bioBottomDialogFragment.h1;
                js3.m(h4Var2);
                String string = h4Var2.x.getEditableText().toString();
                c5 c5Var = bioBottomDialogFragment.k1;
                if (c5Var == null) {
                    js3.V("accountManager");
                    throw null;
                }
                z4 z4Var = c5Var.h;
                z4Var.d = string;
                z4Var.i(string, lu7.l, true);
                DialogResult dialogResult = DialogResult.a;
                Bundle bundle = new Bundle();
                bundle.putString("BUNDLE_KEY_ACCOUNT_INFO", string);
                bioBottomDialogFragment.R0(dialogResult, bundle);
            } else if (n99Var instanceof h99) {
                h4 h4Var3 = bioBottomDialogFragment.h1;
                js3.m(h4Var3);
                MyketTextView myketTextView = h4Var3.B;
                js3.m(myketTextView);
                myketTextView.setVisibility(0);
                myketTextView.setText(((h99) n99Var).a.getTranslatedMessage());
                h4 h4Var4 = bioBottomDialogFragment.h1;
                js3.m(h4Var4);
                h4Var4.y.setErrorEnabled(true);
                MyketProgressState myketProgressState2 = MyketProgressState.b;
                h4 h4Var5 = bioBottomDialogFragment.h1;
                js3.m(h4Var5);
                h4Var5.v.setStateCommit(myketProgressState2);
            } else {
                MyketProgressState myketProgressState3 = MyketProgressState.c;
                h4 h4Var6 = bioBottomDialogFragment.h1;
                js3.m(h4Var6);
                h4Var6.v.setStateCommit(myketProgressState3);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BioBottomDialogFragment$onViewCreated$4(BioBottomDialogFragment bioBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = bioBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BioBottomDialogFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BioBottomDialogFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BioBottomDialogFragment bioBottomDialogFragment = this.b;
            pv6 pv6Var = ((BioDialogViewModel) bioBottomDialogFragment.j1.getValue()).x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bioBottomDialogFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
