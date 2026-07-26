package ir.mservices.market.download.app;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.pk5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.s37;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$2", f = "DownloadRecyclerListFragment.kt", l = {111}, m = "invokeSuspend", v = 1)
final class DownloadRecyclerListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$2$1", f = "DownloadRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ DownloadRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadRecyclerListFragment downloadRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = downloadRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = DownloadRecyclerListFragment.j1;
            DownloadRecyclerListFragment downloadRecyclerListFragment = this.a;
            DialogDataModel dialogDataModel = new DialogDataModel(downloadRecyclerListFragment.Q1(), "DIALOG_KEY_DELETE_FILES", null, 12);
            String strL = downloadRecyclerListFragment.L(rs6.are_you_sure_all);
            js3.o(strL, "getString(...)");
            pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.RemoveDownload(new s37(dialogDataModel, strL)), -1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRecyclerListFragment$onViewCreated$2(DownloadRecyclerListFragment downloadRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = downloadRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadRecyclerListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadRecyclerListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadRecyclerListFragment.j1;
            DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
            pv6 pv6Var = downloadRecyclerListFragment.R1().y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadRecyclerListFragment, null);
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
