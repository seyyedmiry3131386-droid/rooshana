package ir.mservices.market.myMarket.recycler;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a79;
import defpackage.ad5;
import defpackage.js3;
import defpackage.lw;
import defpackage.qs6;
import defpackage.sd5;
import ir.mservices.market.myMarket.recycler.MyMarketData;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends sd5 {
    public ad5 z;

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ad5) {
            this.z = (ad5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.sd5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void t(MyMarketAnimationData myMarketAnimationData) {
        js3.p(myMarketAnimationData, "data");
        super.t(myMarketAnimationData);
        MyMarketData.ItemType itemType = myMarketAnimationData.c;
        MyMarketData.ItemType itemType2 = MyMarketData.ItemType.a;
        ImageView imageView = this.x;
        if (itemType != itemType2 || !myMarketAnimationData.f) {
            ad5 ad5Var = this.z;
            if (ad5Var == null) {
                js3.V("binding");
                throw null;
            }
            ad5Var.v.setVisibility(4);
            imageView.setVisibility(0);
            return;
        }
        ad5 ad5Var2 = this.z;
        if (ad5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = ad5Var2.v;
        lottieAnimationView.setAnimation(qs6.download_icon);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.f();
        imageView.setVisibility(4);
    }
}
