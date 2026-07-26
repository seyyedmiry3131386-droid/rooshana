package ir.mservices.market.version2.fragments.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.coordinatorlayout.widget.c;
import androidx.fragment.app.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.am2;
import defpackage.cc7;
import defpackage.d87;
import defpackage.dv2;
import defpackage.e87;
import defpackage.ee;
import defpackage.hl5;
import defpackage.if0;
import defpackage.j97;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.m88;
import defpackage.mf9;
import defpackage.nf9;
import defpackage.of9;
import defpackage.pf9;
import defpackage.pq6;
import defpackage.qr6;
import defpackage.s60;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t61;
import defpackage.tx8;
import defpackage.w91;
import defpackage.x57;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.z80;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNewBottomDialogFragment extends Hilt_BaseNewBottomDialogFragment implements z80 {
    public dv2 V0;
    public lw8 W0;
    public x57 X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1 = true;
    public boolean b1 = true;
    public boolean c1 = true;
    public BottomSheetBehavior d1;

    @Override // defpackage.z80
    public final String C() {
        return "dialog:".concat(m88.X(M0(), "DialogFragment", ""));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog C0(Bundle bundle) {
        Object d87Var;
        Dialog dialogC0 = super.C0(bundle);
        if (dialogC0.getWindow() == null) {
            return dialogC0;
        }
        Window window = dialogC0.getWindow();
        if (window != null) {
            j97.d(window, false);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                hl5 hl5Var = new hl5(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new pf9(window, hl5Var) : i2 >= 30 ? new of9(window, hl5Var) : i2 >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).l(O0().a == ThemeMode.a);
                window.setNavigationBarColor(O0().N);
                window.setNavigationBarContrastEnforced(false);
                window.setStatusBarContrastEnforced(false);
                d87Var = new e87(tx8.a);
            } else {
                d87Var = new d87();
            }
            if (!(d87Var instanceof e87) && (d87Var instanceof d87) && i >= 26) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                window.getDecorView().setSystemUiVisibility(O0().a != ThemeMode.b ? systemUiVisibility | 16 : systemUiVisibility & (-17));
                window.setNavigationBarColor(O0().l);
            }
        }
        Window window2 = dialogC0.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        if (this.Z0) {
            dialogC0.setOnShowListener(new s60(this, 1));
            return dialogC0;
        }
        final if0 if0Var = (if0) dialogC0;
        dialogC0.setOnShowListener(new DialogInterface.OnShowListener() { // from class: h80
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BottomSheetBehavior bottomSheetBehaviorF;
                BottomSheetBehavior bottomSheetBehavior;
                BaseNewBottomDialogFragment baseNewBottomDialogFragment = this;
                View view = baseNewBottomDialogFragment.J;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    js3.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    bottomSheetBehaviorF = BottomSheetBehavior.F((ViewGroup) parent);
                } else {
                    js3.n(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    ViewGroup viewGroup = (ViewGroup) ((if0) dialogInterface).findViewById(qr6.design_bottom_sheet);
                    js3.n(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
                    bottomSheetBehaviorF = BottomSheetBehavior.F(viewGroup);
                }
                baseNewBottomDialogFragment.d1 = bottomSheetBehaviorF;
                bottomSheetBehaviorF.K = false;
                bottomSheetBehaviorF.O(3);
                BottomSheetBehavior bottomSheetBehavior2 = baseNewBottomDialogFragment.d1;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.y(new i80(if0Var, baseNewBottomDialogFragment));
                }
                BottomSheetBehavior bottomSheetBehavior3 = baseNewBottomDialogFragment.d1;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.M(true);
                }
                BottomSheetBehavior bottomSheetBehavior4 = baseNewBottomDialogFragment.d1;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.L(true);
                }
                if (baseNewBottomDialogFragment.N0().c() == 2 && (bottomSheetBehavior = baseNewBottomDialogFragment.d1) != null) {
                    bottomSheetBehavior.N(p3.g(baseNewBottomDialogFragment.F()).b);
                }
                baseNewBottomDialogFragment.Q0();
            }
        });
        return dialogC0;
    }

    public final void I0() {
        Dialog dialog = this.L0;
        View currentFocus = dialog != null ? dialog.getCurrentFocus() : null;
        if (this.c1) {
            if (currentFocus != null) {
                P0();
                lw8.a(currentFocus);
            }
            if (F() != null) {
                P0();
                lw8.b(F());
            }
        }
    }

    public final am2 J0() {
        d dVar = this;
        am2 am2Var = null;
        while (dVar != null) {
            if (dVar instanceof am2) {
                am2Var = (am2) dVar;
                dVar = null;
            } else {
                dVar = dVar.y;
            }
        }
        return (am2Var == null && (F() instanceof am2)) ? (am2) F() : am2Var;
    }

    public String K0() {
        return "";
    }

    public abstract DialogDataModel L0();

    public abstract String M0();

    public final dv2 N0() {
        dv2 dv2Var = this.V0;
        if (dv2Var != null) {
            return dv2Var;
        }
        js3.V("graphicUtils");
        throw null;
    }

    public ThemeData O0() {
        return sj8.b();
    }

    public final lw8 P0() {
        lw8 lw8Var = this.W0;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public void Q0() {
    }

    public final void R0(DialogResult dialogResult, Bundle bundle) {
        js3.p(dialogResult, "dialogResult");
        js3.p(bundle, "bundle");
        L0().d = dialogResult;
        bundle.putParcelable("BUNDLE_KEY_DATA", L0());
        bundle.putBoolean("BUNDLE_KEY_DISMISS", this.b1);
        am2 am2VarJ0 = J0();
        if (am2VarJ0 != null) {
            am2VarJ0.k(bundle, L0().a);
        } else {
            lw.g(null, "no fragment navigation fount", null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void T(Bundle bundle) {
        Window window;
        View decorView;
        this.H = true;
        if (!this.a1) {
            Dialog dialog = this.L0;
            View viewFindViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(qr6.touch_outside);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(null);
            }
        }
        View view = this.J;
        Object parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if ((N0().c() == 2 && this.Y0) || yq2.n0(H())) {
            if (view2 != null) {
                view2.setBackgroundColor(sj8.b().N);
            }
            int dimensionPixelSize = K().getDimensionPixelSize(pq6.bottom_dialog_horizontal_margin);
            ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            c cVar = layoutParams instanceof c ? (c) layoutParams : null;
            if (cVar != null) {
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = dimensionPixelSize;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = dimensionPixelSize;
            }
        }
    }

    public final void T0() {
        BottomSheetBehavior bottomSheetBehavior = this.d1;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.O(3);
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        sb7.p("MyketNewBottomDialog", t61.i(C(), " onAttach()"), K0());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            String strC = C();
            Bundle bundle2 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle2.putString("screen_name", strC);
            eeVar.getClass();
            eeVar.a(bundle2, "screen_show");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void b0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.setDismissMessage(null);
        }
        x57 x57Var = this.X0;
        if (x57Var == null) {
            js3.V("requestProxy");
            throw null;
        }
        x57Var.a(this);
        super.b0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void c0() {
        super.c0();
        sb7.p("MyketNewBottomDialog", t61.i(C(), " onDetach()"), K0());
    }

    @Override // androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        view.setBackgroundResource(yq6.bottom_sheet_bg);
        view.getBackground().setColorFilter(new PorterDuffColorFilter(O0().l, PorterDuff.Mode.MULTIPLY));
        cc7.d(view, 0, 0, 10, 3);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        js3.p(dialogInterface, "dialog");
        R0(DialogResult.b, new Bundle());
        I0();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final void z0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            P0();
            lw8.a(dialog.getCurrentFocus());
        }
        try {
            super.z0();
        } catch (IllegalStateException e) {
            lw.g(e, "cannot dismiss dialog", "tag: ".concat(M0()));
        }
        I0();
    }
}
