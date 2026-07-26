package defpackage;

import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final class dy5 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ OwnReviewData c;

    public /* synthetic */ dy5(b bVar, OwnReviewData ownReviewData, int i) {
        this.a = i;
        this.b = bVar;
        this.c = ownReviewData;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        OwnReviewData ownReviewData = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                int i2 = b.E;
                bVar.z(ownReviewData);
                break;
            default:
                int i3 = b.E;
                bVar.z(ownReviewData);
                break;
        }
        return tx8Var;
    }
}
