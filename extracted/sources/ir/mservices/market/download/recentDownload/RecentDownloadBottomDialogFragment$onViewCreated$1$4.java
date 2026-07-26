package ir.mservices.market.download.recentDownload;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xw6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$onViewCreated$1$4", f = "RecentDownloadBottomDialogFragment.kt", l = {164}, m = "invokeSuspend", v = 1)
final class RecentDownloadBottomDialogFragment$onViewCreated$1$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RecentDownloadBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadBottomDialogFragment$onViewCreated$1$4(RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = recentDownloadBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RecentDownloadBottomDialogFragment$onViewCreated$1$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((RecentDownloadBottomDialogFragment$onViewCreated$1$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = this.b;
        pv6 pv6Var = ((RecentDownloadViewModel) recentDownloadBottomDialogFragment.k1.getValue()).i;
        xw6 xw6Var = new xw6(recentDownloadBottomDialogFragment, 2);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(xw6Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
