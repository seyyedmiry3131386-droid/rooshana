package ir.mservices.market.movie.download;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.qs6;
import defpackage.sj8;
import defpackage.y79;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.views.LoadingView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadButton extends FrameLayout {
    public final y79 a;
    public MovieDownloadButtonState b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = y79.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        y79 y79Var = (y79) fa1.c(layoutInflaterFrom, js6.view_movie_download_button, this, true);
        js3.o(y79Var, "inflate(...)");
        this.a = y79Var;
        this.b = MovieDownloadButtonState.b;
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.i = sj8.b().j;
        ea7Var.c(context.getResources().getDimensionPixelSize(pq6.big_button_height) / 2);
        setBackground(ea7Var.a());
        LottieAnimationView lottieAnimationView = y79Var.v;
        lottieAnimationView.setAnimation(qs6.download_icon);
        lottieAnimationView.setRepeatCount(-1);
        y79Var.w.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
        y79Var.x.d(false);
    }

    public final void a(MovieDownloadButtonState movieDownloadButtonState) {
        int iOrdinal = movieDownloadButtonState.ordinal();
        y79 y79Var = this.a;
        if (iOrdinal == 0) {
            LottieAnimationView lottieAnimationView = y79Var.v;
            js3.m(lottieAnimationView);
            lottieAnimationView.setVisibility(8);
            lottieAnimationView.l = false;
            lottieAnimationView.h.l();
            ImageView imageView = y79Var.w;
            js3.o(imageView, "download");
            imageView.setVisibility(8);
            LoadingView loadingView = y79Var.x;
            js3.m(loadingView);
            loadingView.setVisibility(0);
            loadingView.d(true);
            return;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        LottieAnimationView lottieAnimationView2 = y79Var.v;
        js3.m(lottieAnimationView2);
        lottieAnimationView2.setVisibility(this.c ? 0 : 8);
        if (this.c) {
            a.j(lottieAnimationView2, sj8.b().j);
            lottieAnimationView2.f();
        } else {
            lottieAnimationView2.l = false;
            lottieAnimationView2.h.l();
        }
        ImageView imageView2 = y79Var.w;
        js3.o(imageView2, "download");
        imageView2.setVisibility(!this.c ? 0 : 8);
        LoadingView loadingView2 = y79Var.x;
        js3.m(loadingView2);
        loadingView2.setVisibility(8);
        loadingView2.d(false);
    }

    public final MovieDownloadButtonState getState() {
        return this.b;
    }

    public final void setDownloading(boolean z) {
        this.c = z;
        a(this.b);
    }

    public final void setState(MovieDownloadButtonState movieDownloadButtonState) {
        js3.p(movieDownloadButtonState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.b = movieDownloadButtonState;
        a(movieDownloadButtonState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieDownloadButton(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
