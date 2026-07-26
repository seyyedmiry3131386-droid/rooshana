package ir.mservices.market.version2.fragments.base;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.cc7;
import defpackage.cd;
import defpackage.ee;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.nt6;
import defpackage.p3;
import defpackage.s60;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t60;
import defpackage.u60;
import defpackage.w91;
import defpackage.z80;
import ir.mservices.market.screenshots.DraggableScreenshotFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.views.ElasticFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDraggableFragment extends Hilt_BaseDraggableFragment implements z80 {
    public u60 V0;
    public final t60 W0 = new t60(this);

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        return new Dialog(q0(), nt6.DraggableFragment);
    }

    public String I0() {
        return null;
    }

    public abstract int[] J0();

    public abstract String K0();

    public abstract ConstraintLayout L0(Context context);

    public void M0(float f) {
        u60 u60Var = this.V0;
        js3.m(u60Var);
        Drawable background = u60Var.w.getBackground();
        if (background != null) {
            background.setAlpha((int) (255 * f));
        }
        u60 u60Var2 = this.V0;
        js3.m(u60Var2);
        u60Var2.v.setAlpha(f);
        u60 u60Var3 = this.V0;
        js3.m(u60Var3);
        u60Var3.z.setAlpha(f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null || bundle.isEmpty()) {
            String strC = ((DraggableScreenshotFragment) this).C();
            Bundle bundle2 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle2.putString("screen_name", strC);
            eeVar.getClass();
            eeVar.a(bundle2, "screen_show");
            sb7.p("DraggableFragment", strC.concat(" onCreate()"), I0());
        }
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        LayoutInflater layoutInflaterD0 = this.Q;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Q = layoutInflaterD0;
        }
        int i = u60.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        u60 u60Var = (u60) fa1.c(layoutInflaterD0, js6.base_draggable_fragment, viewGroup, false);
        this.V0 = u60Var;
        js3.m(u60Var);
        return u60Var.l;
    }

    @Override // androidx.fragment.app.d
    public final void a0() {
        sb7.p("DraggableFragment", ((DraggableScreenshotFragment) this).C().concat(" onDestroy()"), I0());
        this.H = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void b0() {
        super.b0();
        u60 u60Var = this.V0;
        js3.m(u60Var);
        ElasticFrameLayout elasticFrameLayout = u60Var.x;
        elasticFrameLayout.getClass();
        t60 t60Var = this.W0;
        js3.p(t60Var, "listener");
        elasticFrameLayout.h.remove(t60Var);
        this.V0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Window window;
        Window window2;
        js3.p(view, "view");
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ConstraintLayout constraintLayoutL0 = L0(context);
        u60 u60Var = this.V0;
        js3.m(u60Var);
        u60Var.y.addView(constraintLayoutL0);
        u60 u60Var2 = this.V0;
        js3.m(u60Var2);
        u60Var2.z.setText(K0());
        u60 u60Var3 = this.V0;
        js3.m(u60Var3);
        u60Var3.v.setOnClickListener(new cd(3, this));
        u60 u60Var4 = this.V0;
        js3.m(u60Var4);
        u60Var4.w.setBackgroundColor(sj8.b().J.a);
        u60 u60Var5 = this.V0;
        js3.m(u60Var5);
        u60Var5.x.setDragDismissDistance(p3.g(F()).b / 8);
        u60 u60Var6 = this.V0;
        js3.m(u60Var6);
        ElasticFrameLayout elasticFrameLayout = u60Var6.x;
        elasticFrameLayout.getClass();
        t60 t60Var = this.W0;
        js3.p(t60Var, "listener");
        elasticFrameLayout.h.add(t60Var);
        Dialog dialog = this.L0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Dialog dialog2 = this.L0;
            layoutParams.copyFrom((dialog2 == null || (window2 = dialog2.getWindow()) == null) ? null : window2.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            window.setAttributes(layoutParams);
            window.setDimAmount(0.0f);
            window.setWindowAnimations(nt6.dialog_exit_animation);
            window.setStatusBarColor(sj8.b().J.a);
            window.setNavigationBarColor(sj8.b().J.a);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (Build.VERSION.SDK_INT >= 26) {
                systemUiVisibility &= -17;
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        }
        Dialog dialog3 = this.L0;
        if (dialog3 != null) {
            dialog3.setOnShowListener(new s60(this, 0));
        }
        u60 u60Var7 = this.V0;
        js3.m(u60Var7);
        cc7.e(u60Var7.l);
    }
}
