package ir.mservices.market.social.level;

import android.content.Context;
import defpackage.f88;
import defpackage.g54;
import defpackage.hh2;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pq6;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.level.recycler.AchievementInfoData;
import ir.mservices.market.social.level.recycler.AchievementTitleData;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelViewModel extends ir.mservices.market.viewModel.a {
    public final Context v;
    public final hh2 w;
    public final g54 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelViewModel(jd7 jd7Var, Context context, hh2 hh2Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = context;
        this.w = hh2Var;
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        if (!jd7Var.a("avatarUrl")) {
            throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("avatarUrl");
        if (!jd7Var.a("nickName")) {
            throw new IllegalArgumentException("Required argument \"nickName\" is missing and does not have an android:defaultValue");
        }
        this.x = new g54(str, str2, (String) jd7Var.b("nickName"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setNestedDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null) {
            return null;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        if (myketRecyclerData instanceof AchievementTitleData) {
            DividerData dividerData = new DividerData();
            dividerData.g = pq6.space_s;
            dividerData.b = false;
            return new RecyclerItem(dividerData);
        }
        if (!(myketRecyclerData instanceof AchievementInfoData)) {
            return null;
        }
        if (recyclerItem2 == null) {
            DividerData dividerData2 = new DividerData();
            dividerData2.g = pq6.space_20;
            dividerData2.b = false;
            return new RecyclerItem(dividerData2);
        }
        DividerData dividerData3 = new DividerData();
        dividerData3.d = pq6.space_s;
        dividerData3.b = false;
        return new RecyclerItem(dividerData3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        String str = this.x.a;
        if (str == null || f88.n0(str)) {
            return;
        }
        p(new LevelViewModel$doRequest$1(this, null));
    }
}
