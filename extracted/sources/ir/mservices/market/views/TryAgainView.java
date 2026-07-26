package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.loadingindicator.LoadingIndicator;
import defpackage.a79;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.qn2;
import defpackage.qs6;
import defpackage.sj8;
import defpackage.ue7;
import defpackage.vt5;
import ir.mservices.market.core.analytics.ClickEventBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class TryAgainView extends ConstraintLayout implements View.OnClickListener {
    public static final /* synthetic */ int t = 0;
    public final qn2 q;
    public vt5 r;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryAgainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = qn2.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qn2 qn2Var = (qn2) a79.f0(layoutInflaterFrom, js6.fragment_try_again, this, true, null);
        js3.o(qn2Var, "inflate(...)");
        this.q = qn2Var;
        BigFillOvalButton bigFillOvalButton = qn2Var.z;
        bigFillOvalButton.setPadding(bigFillOvalButton.getResources().getDimensionPixelSize(pq6.space_24));
        bigFillOvalButton.setOnClickListener(this);
        setColors(sj8.b().l);
        Group group = qn2Var.A;
        js3.o(group, "tryAgainGroup");
        group.setVisibility(8);
        qn2Var.y.setPadding(getResources().getDimensionPixelSize(pq6.space_24));
        LottieAnimationView lottieAnimationView = qn2Var.w;
        js3.o(lottieAnimationView, "image");
        ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.no_connection);
        LoadingIndicator loadingIndicator = qn2Var.x;
        js3.m(loadingIndicator);
        loadingIndicator.setVisibility(8);
        loadingIndicator.setIndicatorSize(context.getResources().getDimensionPixelSize(pq6.loading_fill_indicator_size));
    }

    public final vt5 getOnTryAgainListener() {
        return this.r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("empty_state_full_try_again");
        clickEventBuilder.a();
        t();
        vt5 vt5Var = this.r;
        if (vt5Var != null) {
            vt5Var.f();
        }
    }

    public final void setColors(int i) {
        qn2 qn2Var = this.q;
        qn2Var.l.setBackgroundColor(i);
        qn2Var.g0();
    }

    public final void setOnSettingListener(View.OnClickListener onClickListener) {
        this.q.y.setOnClickListener(new ue7(7, onClickListener));
    }

    public final void setOnTryAgainListener(vt5 vt5Var) {
        this.r = vt5Var;
    }

    public final void setPrimaryColor(int i, int i2) {
        qn2 qn2Var = this.q;
        qn2Var.x.setIndicatorColor(i);
        BigFillOvalButton bigFillOvalButton = qn2Var.z;
        bigFillOvalButton.setBgColor(i);
        bigFillOvalButton.setButtonTextColor(i2);
        BigEmptyOvalButton bigEmptyOvalButton = qn2Var.y;
        bigEmptyOvalButton.setColor(i);
        bigEmptyOvalButton.setButtonTextColor(i);
    }

    public final void setSettingTextResource(int i) {
        this.q.y.setText(getContext().getString(i));
    }

    public final void t() {
        this.s = true;
        setVisibility(0);
        qn2 qn2Var = this.q;
        Group group = qn2Var.A;
        js3.o(group, "tryAgainGroup");
        group.setVisibility(8);
        LoadingIndicator loadingIndicator = qn2Var.x;
        js3.m(loadingIndicator);
        loadingIndicator.setVisibility(0);
        loadingIndicator.setAlpha(0.0f);
        loadingIndicator.animate().alpha(1.0f).setStartDelay(400L).setDuration(500L).start();
    }

    public final void u(String str) {
        this.s = false;
        setVisibility(0);
        qn2 qn2Var = this.q;
        Group group = qn2Var.A;
        js3.o(group, "tryAgainGroup");
        group.setVisibility(0);
        LoadingIndicator loadingIndicator = qn2Var.x;
        js3.o(loadingIndicator, "progressLoading");
        loadingIndicator.setVisibility(8);
        qn2Var.v.setText(str);
    }

    public final void v() {
        this.s = false;
        setVisibility(8);
        qn2 qn2Var = this.q;
        Group group = qn2Var.A;
        js3.o(group, "tryAgainGroup");
        group.setVisibility(8);
        LoadingIndicator loadingIndicator = qn2Var.x;
        js3.o(loadingIndicator, "progressLoading");
        loadingIndicator.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TryAgainView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
