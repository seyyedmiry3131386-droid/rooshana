package defpackage;

import ir.mservices.market.app.suggest.detail.recycler.a;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ha6 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ha6(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SmallFillOvalButton smallFillOvalButton = this.b.x().x;
                if (zBooleanValue) {
                    smallFillOvalButton.setTextColor(sj8.d(sj8.f).u);
                    smallFillOvalButton.setState(MyketProgressState.c);
                } else {
                    smallFillOvalButton.setTextColor(sj8.b().d);
                    smallFillOvalButton.setState(MyketProgressState.b);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                SmallFillOvalButton smallFillOvalButton2 = this.b.x().x;
                smallFillOvalButton2.setEnabled(zBooleanValue2);
                smallFillOvalButton2.setTextColor(zBooleanValue2 ? sj8.b().d : sj8.d(sj8.f).u);
                break;
        }
        return tx8.a;
    }
}
