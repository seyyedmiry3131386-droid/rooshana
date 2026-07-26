package ir.mservices.market.reels.home.ui;

import defpackage.j17;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.rv6;
import defpackage.wu0;
import defpackage.xg5;
import defpackage.yu6;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.reels.data.ReelHomeDto;
import ir.mservices.market.reels.home.data.ReelsHomeDto;
import ir.mservices.market.reels.home.ui.recycler.ReelHomeData;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsHomeViewModel extends a {
    public final xg5 v;
    public final j17 w;
    public final l x;
    public final rv6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsHomeViewModel(xg5 xg5Var, jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = xg5Var;
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("refId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value");
        }
        this.w = new j17(str);
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> generateReelData(ReelsHomeDto reelsHomeDto) {
        List<ReelHomeDto> reels = reelsHomeDto.getReels();
        ArrayList arrayList = new ArrayList(wu0.V(reels, 10));
        for (ReelHomeDto reelHomeDto : reels) {
            yu6.a.getClass();
            arrayList.add(new RecyclerItem(new ReelHomeData(reelHomeDto, yu6.b.e().nextBoolean())));
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ReelsHomeViewModel$doRequest$1(this, null));
    }
}
