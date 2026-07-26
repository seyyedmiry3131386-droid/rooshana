package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.intro.recycler.IntroData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class f12 extends a {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f12(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.l) {
            case 0:
                return null;
            default:
                if (i == IntroData.e) {
                    return new l5(9, view);
                }
                return null;
        }
    }
}
