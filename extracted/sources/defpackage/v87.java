package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketNoPaddingTextView;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class v87 extends qg5 {
    public MyketNoPaddingTextView A;
    public ConstraintLayout B;
    public MyketTextView C;
    public final /* synthetic */ int D;
    public a79 E;
    public final og5 w;
    public final ArrayList x;
    public lw8 y;
    public MyketRatingBar z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v87(View view, ap apVar, int i) {
        super(view);
        this.D = i;
        this.w = apVar;
        this.x = new ArrayList();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ReviewHeaderData reviewHeaderData = (ReviewHeaderData) myketRecyclerData;
        js3.p(reviewHeaderData, "data");
        float f = reviewHeaderData.b;
        int i = reviewHeaderData.h;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        MyketRatingBar myketRatingBar = this.z;
        if (myketRatingBar == null) {
            js3.V("ratingBar");
            throw null;
        }
        myketRatingBar.setRating(f);
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.h, true, 0);
        qg5.v(view, this.w, this, reviewHeaderData);
        MyketNoPaddingTextView myketNoPaddingTextView = this.A;
        if (myketNoPaddingTextView == null) {
            js3.V("rate");
            throw null;
        }
        lw8 lw8Var = this.y;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketNoPaddingTextView.setText(lw8Var.f(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1))));
        if (reviewHeaderData.e) {
            ConstraintLayout constraintLayout = this.B;
            if (constraintLayout == null) {
                js3.V("rateLayout");
                throw null;
            }
            constraintLayout.setMaxWidth(view.getResources().getDimensionPixelSize(pq6.header_reviews_info_max_width));
        }
        Object obj = lw8.b;
        String str = new DecimalFormat("#,###.##").format(Integer.valueOf(i));
        js3.o(str, "format(...)");
        MyketTextView myketTextView = this.C;
        if (myketTextView == null) {
            js3.V("rateCount");
            throw null;
        }
        Resources resources = view.getResources();
        int i2 = rs6.comment_count;
        lw8 lw8Var2 = this.y;
        if (lw8Var2 == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(resources.getString(i2, lw8.e(lw8Var2, str)));
        if (i > 0) {
            int i3 = 0;
            for (Object obj2 : this.x) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    br9.P();
                    throw null;
                }
                ProgressBar progressBar = (ProgressBar) obj2;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(sj8.b().p);
                gradientDrawable.setCornerRadius(view.getResources().getDimensionPixelSize(pq6.detail_button_radius));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(sj8.b().w);
                gradientDrawable2.setCornerRadius(view.getResources().getDimensionPixelSize(pq6.detail_button_radius));
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
                layerDrawable.setId(0, R.id.background);
                layerDrawable.setId(1, R.id.secondaryProgress);
                layerDrawable.setId(2, R.id.progress);
                progressBar.setProgressDrawable(layerDrawable);
                progressBar.setProgress(((reviewHeaderData.a[i3] * 100) / i) + 1);
                i3 = i4;
            }
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.D) {
            case 0:
                if (a79Var instanceof wx2) {
                    this.E = (wx2) a79Var;
                } else {
                    lw.g(null, "binding is incompatible", null);
                }
                ProgressBar progressBar = x().v;
                js3.o(progressBar, "progressBar1");
                ArrayList arrayList = this.x;
                arrayList.add(progressBar);
                ProgressBar progressBar2 = x().w;
                js3.o(progressBar2, "progressBar2");
                arrayList.add(progressBar2);
                ProgressBar progressBar3 = x().x;
                js3.o(progressBar3, "progressBar3");
                arrayList.add(progressBar3);
                ProgressBar progressBar4 = x().y;
                js3.o(progressBar4, "progressBar4");
                arrayList.add(progressBar4);
                ProgressBar progressBar5 = x().z;
                js3.o(progressBar5, "progressBar5");
                arrayList.add(progressBar5);
                MyketRatingBar myketRatingBar = x().D;
                js3.o(myketRatingBar, "ratingbar");
                this.z = myketRatingBar;
                MyketNoPaddingTextView myketNoPaddingTextView = x().A;
                js3.o(myketNoPaddingTextView, "rate");
                this.A = myketNoPaddingTextView;
                ConstraintLayout constraintLayout = x().C;
                js3.o(constraintLayout, "rateLayout");
                this.B = constraintLayout;
                MyketTextView myketTextView = x().B;
                js3.o(myketTextView, "rateCount");
                this.C = myketTextView;
                break;
            default:
                if (a79Var instanceof yx2) {
                    this.E = (yx2) a79Var;
                } else {
                    lw.g(null, "binding is incompatible", null);
                }
                ProgressBar progressBar6 = y().v;
                js3.o(progressBar6, "progressBar1");
                ArrayList arrayList2 = this.x;
                arrayList2.add(progressBar6);
                ProgressBar progressBar7 = y().w;
                js3.o(progressBar7, "progressBar2");
                arrayList2.add(progressBar7);
                ProgressBar progressBar8 = y().x;
                js3.o(progressBar8, "progressBar3");
                arrayList2.add(progressBar8);
                ProgressBar progressBar9 = y().y;
                js3.o(progressBar9, "progressBar4");
                arrayList2.add(progressBar9);
                ProgressBar progressBar10 = y().z;
                js3.o(progressBar10, "progressBar5");
                arrayList2.add(progressBar10);
                MyketRatingBar myketRatingBar2 = y().D;
                js3.o(myketRatingBar2, "ratingbar");
                this.z = myketRatingBar2;
                MyketNoPaddingTextView myketNoPaddingTextView2 = y().A;
                js3.o(myketNoPaddingTextView2, "rate");
                this.A = myketNoPaddingTextView2;
                ConstraintLayout constraintLayout2 = y().C;
                js3.o(constraintLayout2, "rateLayout");
                this.B = constraintLayout2;
                MyketTextView myketTextView2 = y().B;
                js3.o(myketTextView2, "rateCount");
                this.C = myketTextView2;
                break;
        }
    }

    public wx2 x() {
        wx2 wx2Var = (wx2) this.E;
        if (wx2Var != null) {
            return wx2Var;
        }
        js3.V("binding");
        throw null;
    }

    public yx2 y() {
        yx2 yx2Var = (yx2) this.E;
        if (yx2Var != null) {
            return yx2Var;
        }
        js3.V("binding");
        throw null;
    }
}
