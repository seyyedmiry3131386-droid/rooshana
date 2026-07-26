package ir.mservices.market.appDetail;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.kh2;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.tw7;
import defpackage.y97;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleActionToolbarView extends Hilt_SingleActionToolbarView {
    public final tw7 s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleActionToolbarView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void setBackClickListener(View.OnClickListener onClickListener) {
        js3.p(onClickListener, "listener");
        this.s.w.setOnClickListener(onClickListener);
    }

    public final void setBackIconDrawable(Drawable drawable) {
        js3.p(drawable, "drawable");
        tw7 tw7Var = this.s;
        tw7Var.w.setImageDrawable(drawable);
        ImageView imageView = tw7Var.w;
        imageView.setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
        imageView.setBackground(y97.x());
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        js3.p(onClickListener, "listener");
        this.s.x.setOnClickListener(onClickListener);
    }

    public final void setButtonEnabled(boolean z) {
        this.s.x.setEnabled(z);
    }

    public final void setButtonState(MyketProgressState myketProgressState) {
        js3.p(myketProgressState, "state");
        this.s.x.setState(myketProgressState);
    }

    public final void setButtonText(String str) {
        this.s.x.setText(str);
    }

    public final void setButtonVisibility(boolean z) {
        SmallFillOvalButton smallFillOvalButton = this.s.x;
        js3.o(smallFillOvalButton, "button");
        smallFillOvalButton.setVisibility(z ? 0 : 8);
    }

    public final void setPageTitle(String str) {
        js3.p(str, "pageTitle");
        MyketTextView myketTextView = this.s.v;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.c.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        myketTextView.setText(spannableString);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleActionToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleActionToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = tw7.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        tw7 tw7Var = (tw7) fa1.c(layoutInflaterFrom, js6.single_action_toolbar_view, this, true);
        js3.o(tw7Var, "inflate(...)");
        this.s = tw7Var;
        ImageView imageView = tw7Var.w;
        imageView.setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
        imageView.setBackground(y97.x());
    }

    public /* synthetic */ SingleActionToolbarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
