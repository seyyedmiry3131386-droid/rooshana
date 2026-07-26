package defpackage;

import android.view.View;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerApplicationData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerHeaderData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReviewData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerSingleAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class cv7 extends qg5 {
    public final /* synthetic */ int w;
    public final int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv7(View view, int i, int i2) {
        super(view);
        this.w = i2;
        this.x = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                js3.p((ShimmerApplicationData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                break;
            case 1:
                js3.p((ShimmerHeaderData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                break;
            case 2:
                js3.p((ShimmerReviewData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                break;
            default:
                js3.p((ShimmerSingleAppData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                break;
        }
    }
}
