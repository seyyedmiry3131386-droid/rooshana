package ir.mservices.market.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bt2;
import defpackage.c26;
import defpackage.cc7;
import defpackage.cf5;
import defpackage.d04;
import defpackage.fa1;
import defpackage.fx6;
import defpackage.gx6;
import defpackage.hx6;
import defpackage.ja1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.ok4;
import defpackage.ps1;
import defpackage.qj;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.s5;
import defpackage.sj8;
import defpackage.uy6;
import defpackage.xb5;
import defpackage.yl5;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketRecentDownloadView extends Hilt_MyketRecentDownloadView {
    public static final /* synthetic */ int D = 0;
    public c26 A;
    public final ArrayList B;
    public boolean C;
    public lw8 s;
    public yl5 t;
    public ps1 u;
    public d04 v;
    public ir.mservices.market.version2.manager.a w;
    public ValueAnimator x;
    public final cf5 y;
    public final l z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketRecentDownloadView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public static final void t(MyketRecentDownloadView myketRecentDownloadView, int i) {
        int i2;
        MyketTextView myketTextView = myketRecentDownloadView.y.v;
        js3.m(myketTextView);
        if (!(i == 1 && js3.i(myketRecentDownloadView.A, gx6.v)) && i > 0) {
            lw8 uiUtils = myketRecentDownloadView.getUiUtils();
            String string = i > 9 ? myketTextView.getResources().getString(rs6.plus_9) : String.valueOf(i);
            boolean zF = myketRecentDownloadView.getLanguageHelper().f();
            uiUtils.getClass();
            myketTextView.setText(lw8.d(string, zF));
            i2 = 0;
        } else {
            i2 = 8;
        }
        myketTextView.setVisibility(i2);
    }

    public static final void u(MyketRecentDownloadView myketRecentDownloadView, int i, int i2) {
        if (js3.i(myketRecentDownloadView.A, gx6.v)) {
            int iT = (i == 0 || i2 == 0) ? 0 : ok4.t(ok4.T(((double) i) / ((double) i2)), 0, 100);
            cf5 cf5Var = myketRecentDownloadView.y;
            int i3 = iT * 100;
            if (myketRecentDownloadView.C) {
                cf5Var.w.setProgress(i3);
                myketRecentDownloadView.C = false;
                return;
            }
            ValueAnimator valueAnimator = myketRecentDownloadView.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(cf5Var.w.getProgress(), i3);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.addUpdateListener(new qj(13, myketRecentDownloadView));
            valueAnimatorOfInt.start();
            myketRecentDownloadView.x = valueAnimatorOfInt;
        }
    }

    public static final void v(MyketRecentDownloadView myketRecentDownloadView) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        l lVar = myketRecentDownloadView.z;
        cf5 cf5Var = myketRecentDownloadView.y;
        LottieAnimationView lottieAnimationView = cf5Var.y;
        MyketTextView myketTextView = cf5Var.v;
        AppCompatImageView appCompatImageView = cf5Var.x;
        LoadingView loadingView = cf5Var.w;
        AppCompatImageView appCompatImageView2 = cf5Var.z;
        js3.o(lottieAnimationView, "statusChangeAnimation");
        lottieAnimationView.setVisibility(8);
        c26 c26Var = myketRecentDownloadView.A;
        if (js3.i(c26Var, gx6.v)) {
            do {
                value4 = lVar.getValue();
                ((Boolean) value4).getClass();
            } while (!lVar.n(value4, Boolean.TRUE));
            js3.o(appCompatImageView2, "tickOutlineIcon");
            appCompatImageView2.setVisibility(8);
            js3.o(loadingView, "download");
            loadingView.setVisibility(0);
            js3.o(appCompatImageView, "pointerIcon");
            appCompatImageView.setVisibility(0);
            return;
        }
        if (js3.i(c26Var, hx6.v)) {
            do {
                value3 = lVar.getValue();
                ((Boolean) value3).getClass();
            } while (!lVar.n(value3, Boolean.TRUE));
            js3.o(loadingView, "download");
            loadingView.setVisibility(8);
            js3.o(appCompatImageView, "pointerIcon");
            appCompatImageView.setVisibility(8);
            js3.o(appCompatImageView2, "tickOutlineIcon");
            appCompatImageView2.setVisibility(0);
            js3.o(myketTextView, "badge");
            myketTextView.setVisibility(0);
            return;
        }
        if (js3.i(c26Var, fx6.v)) {
            do {
                value2 = lVar.getValue();
                ((Boolean) value2).getClass();
            } while (!lVar.n(value2, Boolean.TRUE));
            js3.o(loadingView, "download");
            loadingView.setVisibility(8);
            js3.o(appCompatImageView, "pointerIcon");
            appCompatImageView.setVisibility(8);
            appCompatImageView2.setAlpha(0.0f);
            appCompatImageView2.setVisibility(0);
            js3.m(lottieAnimationView);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation(qs6.recent_download_status_change);
            lottieAnimationView.f();
            lottieAnimationView.h.b.addListener(new s5(12, cf5Var));
            return;
        }
        if (c26Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        js3.o(loadingView, "download");
        loadingView.setVisibility(8);
        js3.o(appCompatImageView, "pointerIcon");
        appCompatImageView.setVisibility(8);
        js3.o(lottieAnimationView, "statusChangeAnimation");
        lottieAnimationView.setVisibility(8);
        js3.o(appCompatImageView2, "tickOutlineIcon");
        appCompatImageView2.setVisibility(8);
        js3.o(myketTextView, "badge");
        myketTextView.setVisibility(8);
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.FALSE));
    }

    public final ir.mservices.market.version2.manager.a getAppManager() {
        ir.mservices.market.version2.manager.a aVar = this.w;
        if (aVar != null) {
            return aVar;
        }
        js3.V("appManager");
        throw null;
    }

    public final cf5 getBinding() {
        return this.y;
    }

    public final ps1 getDownloadManager() {
        ps1 ps1Var = this.u;
        if (ps1Var != null) {
            return ps1Var;
        }
        js3.V("downloadManager");
        throw null;
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.v;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final yl5 getNeneDownloadRepository() {
        yl5 yl5Var = this.t;
        if (yl5Var != null) {
            return yl5Var;
        }
        js3.V("neneDownloadRepository");
        throw null;
    }

    public final xb5 getOnStateChangedFlow() {
        return this.z;
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.s;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = true;
    }

    public final void setAppManager(ir.mservices.market.version2.manager.a aVar) {
        js3.p(aVar, "<set-?>");
        this.w = aVar;
    }

    public final void setDownloadManager(ps1 ps1Var) {
        js3.p(ps1Var, "<set-?>");
        this.u = ps1Var;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.v = d04Var;
    }

    public final void setNeneDownloadRepository(yl5 yl5Var) {
        js3.p(yl5Var, "<set-?>");
        this.t = yl5Var;
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.s = lw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketRecentDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketRecentDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = cf5.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        cf5 cf5Var = (cf5) fa1.c(layoutInflaterFrom, js6.myket_recent_download_view, this, true);
        js3.o(cf5Var, "inflate(...)");
        this.y = cf5Var;
        this.z = ja1.b(Boolean.FALSE);
        this.B = new ArrayList();
        this.C = true;
        uy6.n(sj8.b().O.c, this);
        LoadingView loadingView = cf5Var.w;
        loadingView.setIndicatorColor(sj8.b().c);
        loadingView.setTrackColor(sj8.b().e);
        loadingView.setMax(10000);
        loadingView.setIndeterminate(false);
        AppCompatImageView appCompatImageView = cf5Var.x;
        int i3 = sj8.b().c;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        appCompatImageView.setColorFilter(new PorterDuffColorFilter(i3, mode));
        cf5Var.z.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        cf5Var.v.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().D, mode));
        bt2.G(cc7.q(this), null, null, new MyketRecentDownloadView$observeDownloadFlows$1(this, null), 3);
        bt2.G(cc7.q(this), null, null, new MyketRecentDownloadView$observeDownloadFlows$2(this, null), 3);
    }

    public /* synthetic */ MyketRecentDownloadView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
