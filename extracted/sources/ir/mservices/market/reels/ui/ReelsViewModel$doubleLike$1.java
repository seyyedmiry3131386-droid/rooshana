package ir.mservices.market.reels.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.reels.data.ReelLikeRequestDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsViewModel$doubleLike$1", f = "ReelsViewModel.kt", l = {78}, m = "invokeSuspend", v = 1)
final class ReelsViewModel$doubleLike$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReelsViewModel b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsViewModel$doubleLike$1(ReelsViewModel reelsViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = reelsViewModel;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelsViewModel$doubleLike$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelsViewModel$doubleLike$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ReelsViewModel reelsViewModel = this.b;
            String str = this.c;
            reelsViewModel.t(str, true);
            ReelLikeRequestDto reelLikeRequestDto = new ReelLikeRequestDto(str);
            this.a = 1;
            if (ReelsViewModel.s(reelsViewModel, reelLikeRequestDto, this) == coroutineSingletons) {
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
