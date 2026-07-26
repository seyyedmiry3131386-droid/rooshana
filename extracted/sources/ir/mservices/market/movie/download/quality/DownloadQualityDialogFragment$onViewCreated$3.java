package ir.mservices.market.movie.download.quality;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zs1;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$onViewCreated$3", f = "DownloadQualityDialogFragment.kt", l = {145}, m = "invokeSuspend", v = 1)
final class DownloadQualityDialogFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadQualityDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadQualityDialogFragment$onViewCreated$3(DownloadQualityDialogFragment downloadQualityDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = downloadQualityDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadQualityDialogFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((DownloadQualityDialogFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            DownloadQualityDialogFragment downloadQualityDialogFragment = this.b;
            pv6 pv6Var = ((MovieDownloadViewModel) downloadQualityDialogFragment.k1.getValue()).F;
            zs1 zs1Var = new zs1(downloadQualityDialogFragment, 2);
            this.a = 1;
            if (pv6Var.a.a(zs1Var, this) == coroutineSingletons) {
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
