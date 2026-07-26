package ir.mservices.market.version2.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import defpackage.b77;
import defpackage.bp2;
import defpackage.cd;
import defpackage.dv2;
import defpackage.fa1;
import defpackage.g27;
import defpackage.h69;
import defpackage.js3;
import defpackage.js6;
import defpackage.k6;
import defpackage.ld6;
import defpackage.o79;
import defpackage.p58;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q40;
import defpackage.q69;
import defpackage.sj8;
import defpackage.vy2;
import defpackage.w90;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.z49;
import ir.mservices.market.movie.ui.player.BaseMovieAction;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.version2.manager.player.IbexController;
import ir.mservices.market.views.LoadingView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePlayerVideoFragment extends Hilt_BasePlayerVideoFragment implements z49 {
    public static final /* synthetic */ int a1 = 0;
    public ld6 V0;
    public dv2 W0;
    public IbexController X0;
    public w90 Y0;
    public final o79 Z0 = new o79(g27.a(BaseMovieViewModel.class), new bp2() { // from class: ir.mservices.market.version2.fragments.BasePlayerVideoFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            return this.g.o0().m();
        }
    }, new bp2() { // from class: ir.mservices.market.version2.fragments.BasePlayerVideoFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            return this.g.o0().h();
        }
    }, new bp2() { // from class: ir.mservices.market.version2.fragments.BasePlayerVideoFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            return this.g.o0().i();
        }
    });

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable drawable;
        Resources resources;
        js3.p(layoutInflater, "inflater");
        int i = w90.I;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        w90 w90Var = (w90) fa1.c(layoutInflater, js6.base_video_fragment, viewGroup, false);
        this.Y0 = w90Var;
        js3.m(w90Var);
        w90Var.D.setBackgroundColor(sj8.c(sj8.f).J.e);
        View view = w90Var.H;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        view.setBackground(new GradientDrawable(orientation, new int[]{sj8.c(sj8.f).J.e, sj8.c(sj8.f).N}));
        Drawable drawable2 = w90Var.v.getDrawable();
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(sj8.b().I.a, PorterDuff.Mode.MULTIPLY));
        }
        FrameLayout frameLayout = w90Var.w;
        if (frameLayout != null) {
            p58 p58Var = new p58(29);
            WeakHashMap weakHashMap = q69.a;
            h69.m(frameLayout, p58Var);
        }
        frameLayout.setOnClickListener(new cd(5, this));
        frameLayout.setVisibility(0);
        if (yq2.o0(frameLayout.getContext())) {
            Context context = frameLayout.getContext();
            frameLayout.setBackground(vy2.g(context, (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(pq6.tv_round_drawable_border_radius), sj8.c(sj8.f)));
            frameLayout.setForeground(null);
            frameLayout.setFocusableInTouchMode(true);
        }
        View view2 = w90Var.x;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{sj8.b().J.c, sj8.b().N});
        gradientDrawable.setShape(0);
        view2.setBackground(gradientDrawable);
        View view3 = w90Var.G;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{sj8.b().J.c, sj8.b().N});
        gradientDrawable2.setShape(0);
        view3.setBackground(gradientDrawable2);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        int i2 = yq6.ic_retry;
        try {
            drawable = q39.a(resourcesK, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resourcesK.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resourcesK.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(l1(), PorterDuff.Mode.MULTIPLY));
        dv2 dv2Var = this.W0;
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        int iA = (int) dv2Var.a(20.0f);
        drawableMutate.setBounds(0, 0, iA, iA);
        w90Var.E.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        o1();
        w90 w90Var2 = this.Y0;
        js3.m(w90Var2);
        FrameLayout frameLayout2 = w90Var2.y;
        LayoutInflater layoutInflaterD0 = this.Q;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Q = layoutInflaterD0;
        }
        js3.o(layoutInflaterD0, "getLayoutInflater(...)");
        frameLayout2.addView(k1(layoutInflaterD0));
        w90 w90Var3 = this.Y0;
        js3.m(w90Var3);
        return w90Var3.l;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        Handler handler;
        p1(false);
        IbexController ibexController = (IbexController) m1();
        if (ibexController.g != null && (handler = ibexController.f) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.G0.a(this);
        this.Y0 = null;
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public yq2 e1() {
        return q40.g;
    }

    @Override // defpackage.z49
    public void f() {
        o79 o79Var = this.Z0;
        ((BaseMovieViewModel) o79Var.getValue()).r(new BaseMovieAction.ScreenOrientationChangeAction(((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue() == 1 ? 2 : 1));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            fragmentActivityF.setRequestedOrientation(((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue() == 1 ? 7 : 6);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.F0.a();
    }

    public abstract View k1(LayoutInflater layoutInflater);

    public int l1() {
        return sj8.c(sj8.f).j;
    }

    public final k6 m1() {
        IbexController ibexController = this.X0;
        if (ibexController != null) {
            return ibexController;
        }
        js3.V("videoController");
        throw null;
    }

    public final void n1(boolean z) {
        Window window;
        Window window2;
        if (z) {
            FragmentActivity fragmentActivityF = F();
            if (fragmentActivityF == null || (window2 = fragmentActivityF.getWindow()) == null) {
                return;
            }
            window2.addFlags(128);
            return;
        }
        FragmentActivity fragmentActivityF2 = F();
        if (fragmentActivityF2 == null || (window = fragmentActivityF2.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    public void o1() {
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        w90Var.B.setIndicatorColor(l1());
    }

    public final void p1(boolean z) {
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        Group group = w90Var.D;
        js3.o(group, "progressGroup");
        group.setVisibility(z ? 0 : 8);
        w90 w90Var2 = this.Y0;
        js3.m(w90Var2);
        LoadingView loadingView = w90Var2.B;
        loadingView.setIndicatorSize(loadingView.getResources().getDimensionPixelSize(pq6.small_button_progress_size));
        loadingView.d(z);
    }

    public final void q1(boolean z) {
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        w90Var.E.setVisibility(z ? 0 : 8);
    }
}
