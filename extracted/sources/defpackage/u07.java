package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.reels.ui.recycler.ReelData;
import ir.mservices.market.reels.ui.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final class u07 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ ReelData b;

    public u07(b bVar, ReelData reelData) {
        this.a = bVar;
        this.b = reelData;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        b bVar = this.a;
        og5 og5Var = bVar.C;
        q07 q07Var = bVar.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = q07Var.R;
        js3.o(lottieAnimationView, "smallLike");
        og5Var.m(lottieAnimationView, bVar, this.b);
        q07 q07Var2 = bVar.M;
        if (q07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView2 = q07Var2.w;
        lottieAnimationView2.setAnimation(qs6.big_heart_like);
        lottieAnimationView2.f();
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        b bVar = this.a;
        q07 q07Var = bVar.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        q07Var.K.setUseController(false);
        if (bVar.M != null) {
            bVar.L(!r1.y.l());
            return super.onSingleTapConfirmed(motionEvent);
        }
        js3.V("binding");
        throw null;
    }
}
