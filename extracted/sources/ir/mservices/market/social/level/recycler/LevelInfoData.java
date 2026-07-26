package ir.mservices.market.social.level.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.level.data.XpDetailDto;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelInfoData implements MyketRecyclerData, g32 {
    public static final int d = js6.level_info;
    public final String a;
    public final String b;
    public final XpDetailDto c;

    public LevelInfoData(String str, String str2, XpDetailDto xpDetailDto) {
        this.a = str;
        this.b = str2;
        this.c = xpDetailDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LevelInfoData) {
            return js3.i(this.c, ((LevelInfoData) obj).c);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.c.hashCode());
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
