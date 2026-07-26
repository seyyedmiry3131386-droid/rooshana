package defpackage;

import android.animation.ValueAnimator;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s07 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ s07(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                js3.p(valueAnimator, "valueAnimator");
                b bVar = this.b;
                q07 q07Var = bVar.M;
                if (q07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                int progress = q07Var.A.getProgress();
                q07 q07Var2 = bVar.M;
                if (q07Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                if (progress != q07Var2.A.getMax()) {
                    q07 q07Var3 = bVar.M;
                    if (q07Var3 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    LoadingView loadingView = q07Var3.A;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    loadingView.setProgress(((Integer) animatedValue).intValue());
                    return;
                }
                return;
            default:
                float fFloatValue = ((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                q07 q07Var4 = this.b.M;
                if (q07Var4 != null) {
                    q07Var4.C.setPosition((long) fFloatValue);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
        }
    }
}
