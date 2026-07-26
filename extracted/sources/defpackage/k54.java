package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.social.level.recycler.AchievementInfoData;
import ir.mservices.market.social.level.recycler.AchievementTitleData;

/* JADX INFO: loaded from: classes3.dex */
public final class k54 extends l06 {
    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AchievementTitleData.c) {
            return new l5(1, view);
        }
        if (i == AchievementInfoData.c) {
            return new l5(0, view);
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        return null;
    }
}
