package defpackage;

import android.animation.ValueAnimator;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.airbnb.lottie.AsyncUpdates;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.g;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.movie.download.quality.recycler.b;
import ir.mservices.market.securityShield.recycler.a;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.CircleClipTapView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MultiSelectTitleView;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.PikaReceiveView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sj) obj).c(((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
                return;
            case 1:
                int i2 = BaseContentFragment.R0;
                ((MultiSelectTitleView) obj).setAlpha(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 2:
                CircleClipTapView circleClipTapView = (CircleClipTapView) obj;
                int i3 = CircleClipTapView.p;
                float fFloatValue = ((Float) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                circleClipTapView.i = ((circleClipTapView.k - r0) * fFloatValue) + circleClipTapView.j;
                circleClipTapView.invalidate();
                return;
            case 3:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i4 = DefaultTimeBar.P;
                defaultTimeBar.getClass();
                defaultTimeBar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.a);
                return;
            case 4:
                qk1 qk1Var = (qk1) obj;
                qk1Var.q.e = qk1Var.v.getInterpolation(qk1Var.u.getAnimatedFraction());
                return;
            case 5:
                a aVar = (a) obj;
                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                if (iIntValue == 0) {
                    aVar.y().w.setText("");
                    return;
                }
                if (iIntValue == 1) {
                    aVar.y().w.setText(".");
                    return;
                } else if (iIntValue == 2) {
                    aVar.y().w.setText("..");
                    return;
                } else {
                    if (iIntValue != 3) {
                        return;
                    }
                    aVar.y().w.setText("...");
                    return;
                }
            case 6:
                b bVar = (b) obj;
                js3.p(valueAnimator, "it");
                n73 n73Var = bVar.y;
                if (n73Var == null) {
                    js3.V("binding");
                    throw null;
                }
                int progress = n73Var.w.getProgress();
                n73 n73Var2 = bVar.y;
                if (n73Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                if (progress != n73Var2.w.getMax()) {
                    n73 n73Var3 = bVar.y;
                    if (n73Var3 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    LoadingView loadingView = n73Var3.w;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    loadingView.setProgress(((Integer) animatedValue).intValue());
                    return;
                }
                return;
            case 7:
                ((DrawerLayout) obj).setScrimColor(sv0.e(-1728053248, yk.c(valueAnimator.getAnimatedFraction(), kw1.a, 0)));
                return;
            case 8:
                mx1 mx1Var = (mx1) obj;
                mx1Var.getClass();
                mx1Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                com.airbnb.lottie.b bVar2 = (com.airbnb.lottie.b) obj;
                AsyncUpdates asyncUpdates = bVar2.M;
                if (asyncUpdates == null) {
                    asyncUpdates = AsyncUpdates.a;
                }
                if (asyncUpdates == AsyncUpdates.b) {
                    bVar2.invalidateSelf();
                    return;
                }
                l01 l01Var = bVar2.p;
                if (l01Var != null) {
                    l01Var.r(bVar2.b.d());
                    return;
                }
                return;
            case 10:
                vj4 vj4Var = (vj4) obj;
                vj4Var.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vj4Var.j.setAlpha((int) (255.0f * fFloatValue2));
                vj4Var.x = fFloatValue2;
                return;
            case 11:
                ((ClippableRoundedCornerLayout) obj).a(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom(), (float[]) valueAnimator.getAnimatedValue());
                return;
            case 12:
                ir.mservices.market.download.movie.recycler.a aVar2 = (ir.mservices.market.download.movie.recycler.a) obj;
                js3.p(valueAnimator, "it");
                if (aVar2.z().x.getProgress() != aVar2.z().x.getMax()) {
                    LoadingView loadingView2 = aVar2.z().x;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    loadingView2.setProgress(((Integer) animatedValue2).intValue());
                    return;
                }
                return;
            case 13:
                MyketRecentDownloadView myketRecentDownloadView = (MyketRecentDownloadView) obj;
                int i5 = MyketRecentDownloadView.D;
                js3.p(valueAnimator, "valueAnimator");
                int progress2 = myketRecentDownloadView.y.w.getProgress();
                cf5 cf5Var = myketRecentDownloadView.y;
                if (progress2 != cf5Var.w.getMax()) {
                    LoadingView loadingView3 = cf5Var.w;
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    js3.n(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                    loadingView3.setProgress(((Integer) animatedValue3).intValue());
                    return;
                }
                return;
            case 14:
                PikaReceiveView pikaReceiveView = (PikaReceiveView) obj;
                int i6 = PikaReceiveView.j;
                js3.p(valueAnimator, "it");
                if (pikaReceiveView.c.getProgress() != 100) {
                    ProgressBar progressBar = pikaReceiveView.c;
                    Object animatedValue4 = valueAnimator.getAnimatedValue();
                    js3.n(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                    progressBar.setProgress(((Integer) animatedValue4).intValue());
                    return;
                }
                return;
            case 15:
                ((ew1) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ((l82) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                g gVar = (g) obj;
                gVar.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gVar.p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((dp2) obj).invoke((Float) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float"));
                return;
        }
    }
}
