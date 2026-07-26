package ir.mservices.market.social.level.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.level.data.LevelInfoDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AchievementInfoData implements MyketRecyclerData, g32 {
    public static final int c = js6.achievement_item;
    public final LevelInfoDto a;
    public final String b;

    public AchievementInfoData(LevelInfoDto levelInfoDto) {
        js3.p(levelInfoDto, "levelInfo");
        this.a = levelInfoDto;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AchievementInfoData) {
            return js3.i(this.a, ((AchievementInfoData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
