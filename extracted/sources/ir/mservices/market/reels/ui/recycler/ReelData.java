package ir.mservices.market.reels.ui.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.p07;
import defpackage.v48;
import defpackage.vb7;
import ir.mservices.market.reels.data.AnalyticsEventDto;
import ir.mservices.market.reels.data.ReelDto;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelData implements BaseReelData {
    public static final int i = js6.reel_item;
    public final v48 a;
    public final ReelDto b;
    public final AnalyticsEventDto c;
    public final vb7 d;
    public final vb7 e;
    public final vb7 f;
    public int g;
    public p07 h;

    public ReelData(l lVar, ReelDto reelDto, AnalyticsEventDto analyticsEventDto, vb7 vb7Var, vb7 vb7Var2, vb7 vb7Var3) {
        js3.p(lVar, "muteFlow");
        this.a = lVar;
        this.b = reelDto;
        this.c = analyticsEventDto;
        this.d = vb7Var;
        this.e = vb7Var2;
        this.f = vb7Var3;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReelData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.reels.ui.recycler.ReelData");
        return js3.i(this.b, ((ReelData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b.getReelId();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
