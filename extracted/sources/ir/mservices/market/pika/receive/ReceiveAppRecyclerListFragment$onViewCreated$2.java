package ir.mservices.market.pika.receive;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.mw6;
import defpackage.o4;
import defpackage.od;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sn8;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.AlertDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketTextView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$2", f = "ReceiveAppRecyclerListFragment.kt", l = {145}, m = "invokeSuspend", v = 1)
final class ReceiveAppRecyclerListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ReceiveAppRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$onViewCreated$2$1", f = "ReceiveAppRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ ReceiveAppRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = receiveAppRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
            sn8 sn8Var = receiveAppRecyclerListFragment.l1;
            js3.m(sn8Var);
            MyketTextView myketTextView = sn8Var.x;
            js3.o(myketTextView, "connectionState");
            myketTextView.setVisibility(!z ? 0 : 8);
            if (z) {
                sn8 sn8Var2 = receiveAppRecyclerListFragment.l1;
                js3.m(sn8Var2);
                sn8Var2.A.setText(receiveAppRecyclerListFragment.K().getString(rs6.disconnected_from));
                if (!(receiveAppRecyclerListFragment.J0.g() instanceof AlertDialogFragment)) {
                    String strM = receiveAppRecyclerListFragment.M(rs6.disconnected_from_device, ((mw6) receiveAppRecyclerListFragment.m1.getValue()).a);
                    js3.o(strM, "getString(...)");
                    DialogDataModel dialogDataModel = new DialogDataModel(receiveAppRecyclerListFragment.Q1(), "DIALOG_KEY_NO_RESULT", null, 12);
                    String strL = receiveAppRecyclerListFragment.L(rs6.button_ok);
                    js3.o(strL, "getString(...)");
                    pk5.g(receiveAppRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, null, strM, strL, 0)), -1);
                }
            } else {
                sn8 sn8Var3 = receiveAppRecyclerListFragment.l1;
                js3.m(sn8Var3);
                sn8Var3.x.setText(receiveAppRecyclerListFragment.K().getString(rs6.disconnect));
                sn8 sn8Var4 = receiveAppRecyclerListFragment.l1;
                js3.m(sn8Var4);
                sn8Var4.A.setText(receiveAppRecyclerListFragment.K().getString(rs6.connected_to));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveAppRecyclerListFragment$onViewCreated$2(ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = receiveAppRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ReceiveAppRecyclerListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ReceiveAppRecyclerListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ReceiveAppRecyclerListFragment.p1;
            ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
            o4 o4Var = new o4(receiveAppRecyclerListFragment.R1().F, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(receiveAppRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
