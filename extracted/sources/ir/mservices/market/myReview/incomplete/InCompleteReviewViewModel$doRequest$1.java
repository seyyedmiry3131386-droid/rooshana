package ir.mservices.market.myReview.incomplete;

import androidx.paging.e;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.dx4;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vr2;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewResultDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel$doRequest$1", f = "InCompleteReviewViewModel.kt", l = {41}, m = "invokeSuspend", v = 1)
final class InCompleteReviewViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InCompleteReviewViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewViewModel$doRequest$1(InCompleteReviewViewModel inCompleteReviewViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = inCompleteReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InCompleteReviewViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InCompleteReviewViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        final InCompleteReviewViewModel inCompleteReviewViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            ir.mservices.market.myReview.incomplete.model.b bVar = inCompleteReviewViewModel.x;
            dx4 dx4Var = inCompleteReviewViewModel.u;
            String strA = inCompleteReviewViewModel.t.a();
            js3.o(strA, "getAccountId(...)");
            this.a = 1;
            obj = bVar.a(dx4Var, strA, true, inCompleteReviewViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new dp2() { // from class: ir.mservices.market.myReview.incomplete.a
            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                InCompleteReviewResultDTO inCompleteReviewResultDTO = (InCompleteReviewResultDTO) obj2;
                boolean zIsCompleted = inCompleteReviewResultDTO.isCompleted();
                InCompleteReviewViewModel inCompleteReviewViewModel2 = inCompleteReviewViewModel;
                if (zIsCompleted) {
                    bt2.G(y97.G(inCompleteReviewViewModel2), null, null, new InCompleteReviewViewModel$setItem$1(inCompleteReviewViewModel2, inCompleteReviewResultDTO, null), 3);
                    return EmptyList.a;
                }
                List<InCompleteReviewDto> inCompleteReviewDTOS = inCompleteReviewResultDTO.getInCompleteReviewDTOS();
                js3.o(inCompleteReviewDTOS, "getInCompleteReviewDTOS(...)");
                ArrayList arrayList = new ArrayList(wu0.V(inCompleteReviewDTOS, 10));
                for (InCompleteReviewDto inCompleteReviewDto : inCompleteReviewDTOS) {
                    vr2 vr2Var = inCompleteReviewViewModel2.v;
                    String packageName = inCompleteReviewDto.getPackageName();
                    ir.mservices.market.common.model.a aVar = vr2Var.g;
                    arrayList.add(new RecyclerItem(new InCompleteReviewData(inCompleteReviewDto, new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, packageName, aVar)))));
                }
                return arrayList;
            }
        }), y97.G(inCompleteReviewViewModel)), null, null, null, 14);
    }
}
