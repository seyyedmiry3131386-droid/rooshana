package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tj7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ tj7(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                boolean z = SearchView.r;
                searchView.e.I.getBackground().setColorFilter(new PorterDuffColorFilter(((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue(), PorterDuff.Mode.SRC_ATOP));
                break;
            case 1:
                boolean z2 = SearchView.r;
                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                uh7 uh7Var = searchView.e;
                ViewGroup.LayoutParams layoutParams = uh7Var.x.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = iIntValue;
                uh7Var.x.requestLayout();
                break;
            case 2:
                boolean z3 = SearchView.r;
                int iIntValue2 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                uh7 uh7Var2 = searchView.e;
                ViewGroup.LayoutParams layoutParams2 = uh7Var2.w.getLayoutParams();
                js3.n(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = searchView.getLanguageHelper().f() ? 0 : iIntValue2;
                if (!searchView.getLanguageHelper().f()) {
                    iIntValue2 = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = iIntValue2;
                uh7Var2.w.requestLayout();
                break;
            default:
                boolean z4 = SearchView.r;
                int iIntValue3 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                uh7 uh7Var3 = searchView.e;
                Drawable background = uh7Var3.I.getBackground();
                js3.n(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setCornerRadius(iIntValue3);
                uh7Var3.I.invalidate();
                break;
        }
    }
}
