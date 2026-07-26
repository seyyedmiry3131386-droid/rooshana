package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ff4 implements zf4 {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public ff4(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.zf4
    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.g;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    zf4 zf4Var = lottieAnimationView.f;
                    if (zf4Var == null) {
                        zf4Var = LottieAnimationView.q;
                    }
                    zf4Var.onResult(th);
                    break;
                }
                break;
            default:
                gf4 gf4Var = (gf4) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(gf4Var);
                    break;
                }
                break;
        }
    }
}
