package ir.mservices.market.download.recentDownload;

import defpackage.dp2;
import defpackage.g51;
import defpackage.og6;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$onViewCreated$1$3", f = "RecentDownloadBottomDialogFragment.kt", l = {158}, m = "invokeSuspend", v = 1)
final class RecentDownloadBottomDialogFragment$onViewCreated$1$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RecentDownloadBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadBottomDialogFragment$onViewCreated$1$3(RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = recentDownloadBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RecentDownloadBottomDialogFragment$onViewCreated$1$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((RecentDownloadBottomDialogFragment$onViewCreated$1$3) create((g51) obj)).invokeSuspend(tx8.a);
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
        rv6 rv6Var = ((RecentDownloadViewModel) recentDownloadBottomDialogFragment.k1.getValue()).z;
        a aVar = new a(recentDownloadBottomDialogFragment);
        this.a = 1;
        Object objA = rv6Var.a.a(new og6(aVar, 13), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
