package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.g;
import ir.mservices.market.app.update.BaseUpdateFragment;
import ir.mservices.market.views.DownloadProgressBar;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object value;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dk dkVar = (dk) obj2;
                sj sjVar = (sj) obj;
                js3.p(valueAnimator, "it");
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr = (float[]) dkVar.a;
                ArrayList arrayList = new ArrayList(fArr.length);
                int length = fArr.length;
                int i3 = 0;
                while (i2 < length) {
                    float f = fArr[i2];
                    arrayList.add(Float.valueOf(((((float[]) dkVar.b)[i3] - f) * animatedFraction) + f));
                    i2++;
                    i3++;
                }
                sjVar.b(a.N0(arrayList));
                return;
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i4 = AppBarLayout.B;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((fk4) obj).r(fFloatValue);
                Drawable drawable = appBarLayout.x;
                if (drawable instanceof fk4) {
                    ((fk4) drawable).r(fFloatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    throw bl4.o(it);
                }
                for (qh7 qh7Var : appBarLayout.s) {
                    float f2 = fFloatValue / appBarLayout.z;
                    SearchBar searchBar = qh7Var.a;
                    ColorStateList colorStateList = searchBar.f;
                    if (colorStateList != null) {
                        searchBar.r.s(ColorStateList.valueOf(m91.y(f2, searchBar.d, colorStateList.getDefaultColor())));
                    }
                }
                return;
            case 2:
                MyketTextView myketTextView = ((xz8) obj2).B;
                BaseUpdateFragment baseUpdateFragment = (BaseUpdateFragment) obj;
                int i5 = BaseUpdateFragment.p1;
                js3.p(valueAnimator, "it");
                float animatedFraction2 = valueAnimator.getAnimatedFraction() * valueAnimator.getDuration();
                if (Math.abs(animatedFraction2 - 20) < 10.0f) {
                    js3.o(myketTextView, "scheduleText");
                    if (myketTextView.getVisibility() != 0) {
                        js3.o(myketTextView, "scheduleText");
                        myketTextView.setVisibility(0);
                        return;
                    }
                }
                if (Math.abs(animatedFraction2 - 2500) < 10.0f) {
                    js3.o(myketTextView, "scheduleText");
                    if (myketTextView.getVisibility() == 0) {
                        js3.o(myketTextView, "scheduleText");
                        myketTextView.setVisibility(8);
                        baseUpdateFragment.k1 = tk.q;
                        return;
                    }
                }
                if (Math.abs(animatedFraction2 - 3500) < 100.0f) {
                    l lVar = baseUpdateFragment.l1;
                    do {
                        value = lVar.getValue();
                    } while (!lVar.n(value, Boolean.TRUE));
                    return;
                }
                return;
            case 3:
                qk1 qk1Var = (qk1) obj2;
                t80 t80Var = (t80) obj;
                qk1Var.getClass();
                if (t80Var.b(true) && t80Var.m != 0 && qk1Var.isVisible()) {
                    qk1Var.invalidateSelf();
                    return;
                }
                return;
            case 4:
                DownloadProgressBar downloadProgressBar = (DownloadProgressBar) obj;
                int i6 = DownloadProgressBar.c;
                int iIntValue = ((Integer) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
                if (!((Boolean) ((bp2) obj2).invoke()).booleanValue() || downloadProgressBar.getProgress() > downloadProgressBar.getMax()) {
                    return;
                }
                downloadProgressBar.setProgress(iIntValue);
                return;
            case 5:
                g gVar = (g) obj2;
                Rect rect = (Rect) obj;
                gVar.getClass();
                rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                gVar.j.setClipBounds(rect);
                return;
            default:
                ((View) ((ge9) ((xg5) obj2).b).t.getParent()).invalidate();
                return;
        }
    }
}
