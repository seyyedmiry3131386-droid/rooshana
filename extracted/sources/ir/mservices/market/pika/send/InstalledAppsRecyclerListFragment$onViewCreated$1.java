package ir.mservices.market.pika.send;

import defpackage.dp0;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.od;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sn8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wp3;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketTextView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$onViewCreated$1", f = "InstalledAppsRecyclerListFragment.kt", l = {114}, m = "invokeSuspend", v = 1)
final class InstalledAppsRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ InstalledAppsRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$onViewCreated$1$1", f = "InstalledAppsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ InstalledAppsRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = installedAppsRecyclerListFragment;
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
            InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
            sn8 sn8Var = installedAppsRecyclerListFragment.l1;
            js3.m(sn8Var);
            MyketTextView myketTextView = sn8Var.x;
            js3.o(myketTextView, "connectionState");
            myketTextView.setVisibility(!z ? 0 : 8);
            if (z) {
                sn8 sn8Var2 = installedAppsRecyclerListFragment.l1;
                js3.m(sn8Var2);
                sn8Var2.A.setText(installedAppsRecyclerListFragment.K().getString(rs6.disconnected_from));
                String strM = installedAppsRecyclerListFragment.M(rs6.disconnected_from_device, ((wp3) installedAppsRecyclerListFragment.k1.getValue()).a);
                js3.o(strM, "getString(...)");
                DialogDataModel dialogDataModel = new DialogDataModel(installedAppsRecyclerListFragment.Q1(), "DIALOG_KEY_DISCONNECTED", null, 12);
                String strL = installedAppsRecyclerListFragment.L(rs6.button_ok);
                js3.o(strL, "getString(...)");
                pk5.g(installedAppsRecyclerListFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, null, strM, strL, 0)), -1);
            } else {
                sn8 sn8Var3 = installedAppsRecyclerListFragment.l1;
                js3.m(sn8Var3);
                sn8Var3.x.setText(installedAppsRecyclerListFragment.K().getString(rs6.disconnect));
                sn8 sn8Var4 = installedAppsRecyclerListFragment.l1;
                js3.m(sn8Var4);
                sn8Var4.A.setText(installedAppsRecyclerListFragment.K().getString(rs6.connected_to));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsRecyclerListFragment$onViewCreated$1(InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = installedAppsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new InstalledAppsRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((InstalledAppsRecyclerListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = InstalledAppsRecyclerListFragment.n1;
            InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
            dp0 dp0Var = installedAppsRecyclerListFragment.R1().w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(installedAppsRecyclerListFragment, null);
            this.a = 1;
            if (d.f(dp0Var, anonymousClass1, this) == coroutineSingletons) {
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
