package ir.mservices.market.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import defpackage.bt2;
import defpackage.c86;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.js3;
import defpackage.js6;
import defpackage.o86;
import defpackage.pq6;
import defpackage.q86;
import defpackage.qj;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.t86;
import defpackage.v48;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaReceiveView extends Hilt_PikaReceiveView {
    public static final /* synthetic */ int j = 0;
    public final ProgressBar c;
    public final MyketProgressButton d;
    public Integer e;
    public Integer f;
    public Integer g;
    public v48 h;
    public boolean i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PikaReceiveView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public static final String a(PikaReceiveView pikaReceiveView, int i) {
        String string = pikaReceiveView.getResources().getString(i);
        js3.o(string, "getString(...)");
        return string;
    }

    public static final void b(PikaReceiveView pikaReceiveView, t86 t86Var) {
        MyketProgressButton myketProgressButton = pikaReceiveView.d;
        if (js3.i(t86Var, o86.a) || (t86Var instanceof q86)) {
            myketProgressButton.setButtonBackground(pikaReceiveView.getBorderBackground());
        } else {
            myketProgressButton.setButtonBackground(pikaReceiveView.getSolidBackground());
        }
    }

    public static final void c(PikaReceiveView pikaReceiveView, t86 t86Var) {
        if (t86Var instanceof q86) {
            return;
        }
        pikaReceiveView.setPercentage(0);
    }

    private final Drawable getBorderBackground() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_height) / 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.border_size);
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.c(dimensionPixelSize);
        ea7Var.d(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.m = dimensionPixelSize2;
        ea7Var.i = sj8.b().c;
        ea7Var.n = sj8.b().t;
        ea7Var.o = false;
        ea7Var.j = false;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        return ea7Var.a();
    }

    private final Drawable getSolidBackground() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_height) / 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.border_size);
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.c(dimensionPixelSize);
        ea7Var.d(dimensionPixelSize);
        Integer num = this.g;
        ea7Var.h = num != null ? num.intValue() : dimensionPixelSize2;
        Integer num2 = this.g;
        if (num2 != null) {
            dimensionPixelSize2 = num2.intValue();
        }
        ea7Var.m = dimensionPixelSize2;
        ea7Var.i = sj8.b().c;
        ea7Var.n = sj8.b().t;
        Integer num3 = this.f;
        ea7Var.b = num3 != null ? num3.intValue() : sj8.b().l;
        ea7Var.k = this.f != null ? sj8.b().t : sj8.b().l;
        ea7Var.j = true;
        ea7Var.o = true;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        return ea7Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPercentage(int i) {
        if (i != -1) {
            boolean z = this.i;
            ProgressBar progressBar = this.c;
            if (z) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(progressBar.getProgress(), i);
                valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfInt.setDuration(1000L);
                valueAnimatorOfInt.addUpdateListener(new qj(14, this));
                valueAnimatorOfInt.start();
            } else {
                progressBar.setProgress(i);
                this.i = true;
            }
            if (progressBar.getVisibility() == 8) {
                progressBar.setVisibility(0);
            }
        }
    }

    public final Integer getBkgColor() {
        return this.f;
    }

    public final Integer getStrokeSize() {
        return this.g;
    }

    public final Integer getTextColor() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bt2.G(cc7.q(this), null, null, new PikaReceiveView$collectShareBtnFlow$1(this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        ProgressBar progressBar = this.c;
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        super.onDetachedFromWindow();
    }

    public final void setBkgColor(Integer num) {
        this.f = num;
    }

    public final void setData(v48 v48Var) {
        js3.p(v48Var, "shareBtnFlow");
        this.h = v48Var;
    }

    public final void setDataAndCollect(v48 v48Var) {
        js3.p(v48Var, "shareBtnFlow");
        this.h = v48Var;
        bt2.G(cc7.q(this), null, null, new PikaReceiveView$collectShareBtnFlow$1(this, null), 3);
    }

    public final void setStrokeSize(Integer num) {
        this.g = num;
    }

    public final void setTextColor(Integer num) {
        this.e = num;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaReceiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((c86) e()).getClass();
        }
        this.i = true;
        View.inflate(context, js6.download_state_view, this);
        View viewFindViewById = findViewById(rr6.btn_download);
        js3.o(viewFindViewById, "findViewById(...)");
        MyketProgressButton myketProgressButton = (MyketProgressButton) viewFindViewById;
        this.d = myketProgressButton;
        myketProgressButton.setProgressSize(myketProgressButton.getResources().getDimensionPixelOffset(pq6.small_rate_size));
        myketProgressButton.setLoadingColor(sj8.b().c);
        Integer num = this.e;
        myketProgressButton.setTextColor(num != null ? num.intValue() : sj8.b().c);
        myketProgressButton.setOutlineProvider(null);
        myketProgressButton.a();
        View viewFindViewById2 = findViewById(rr6.progress_bar);
        js3.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
        ProgressBar progressBar = (ProgressBar) viewFindViewById2;
        this.c = progressBar;
        progressBar.setMax(100);
        progressBar.setProgress(0);
        progressBar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().e, PorterDuff.Mode.MULTIPLY));
    }
}
