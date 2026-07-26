package defpackage;

import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.reels.ui.recycler.ReelData;

/* JADX INFO: loaded from: classes3.dex */
public final class e17 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReelsFragment b;

    public /* synthetic */ e17(ReelsFragment reelsFragment, int i) {
        this.a = i;
        this.b = reelsFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        String reelId;
        String reelId2;
        switch (this.a) {
            case 0:
                if (((n99) obj) instanceof h99) {
                    ReelsFragment reelsFragment = this.b;
                    ReelData reelDataC = w07.c(reelsFragment.Z0, reelsFragment.m1());
                    if (reelDataC != null && (reelId = reelDataC.b.getReelId()) != null) {
                        reelsFragment.o1().t(reelId, false);
                    }
                }
                break;
            default:
                if (((n99) obj) instanceof h99) {
                    ReelsFragment reelsFragment2 = this.b;
                    ReelData reelDataC2 = w07.c(reelsFragment2.Z0, reelsFragment2.m1());
                    if (reelDataC2 != null && (reelId2 = reelDataC2.b.getReelId()) != null) {
                        reelsFragment2.o1().t(reelId2, true);
                    }
                }
                break;
        }
        return tx8.a;
    }
}
