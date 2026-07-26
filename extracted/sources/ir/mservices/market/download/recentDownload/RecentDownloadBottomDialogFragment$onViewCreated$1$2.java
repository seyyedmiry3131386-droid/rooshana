package ir.mservices.market.download.recentDownload;

import defpackage.dp2;
import defpackage.g51;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xw6;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$onViewCreated$1$2", f = "RecentDownloadBottomDialogFragment.kt", l = {151}, m = "invokeSuspend", v = 1)
final class RecentDownloadBottomDialogFragment$onViewCreated$1$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RecentDownloadBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadBottomDialogFragment$onViewCreated$1$2(RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = recentDownloadBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RecentDownloadBottomDialogFragment$onViewCreated$1$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((RecentDownloadBottomDialogFragment$onViewCreated$1$2) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = this.b;
            rv6 rv6Var = ((RecentDownloadViewModel) recentDownloadBottomDialogFragment.k1.getValue()).e;
            xw6 xw6Var = new xw6(recentDownloadBottomDialogFragment, 1);
            this.a = 1;
            if (rv6Var.a.a(xw6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
