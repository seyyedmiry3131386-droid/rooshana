package ir.mservices.market.version2.fragments.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.d;
import defpackage.am2;
import defpackage.ee;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.m88;
import defpackage.nt6;
import defpackage.p3;
import defpackage.pq6;
import defpackage.sb7;
import defpackage.t61;
import defpackage.w91;
import defpackage.x57;
import defpackage.z80;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNewDialogFragment extends Hilt_BaseNewDialogFragment implements z80 {
    public x57 V0;
    public lw8 W0;
    public final boolean X0 = true;

    public static void I0(Window window) {
        WindowManager.LayoutParams attributes;
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.gravity = 80;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int B0() {
        return nt6.MyketDialogTheme;
    }

    @Override // defpackage.z80
    public final String C() {
        return "dialog:".concat(m88.X(L0(), "DialogFragment", ""));
    }

    public String J0() {
        return "";
    }

    public abstract DialogDataModel K0();

    public abstract String L0();

    public final void M0(Dialog dialog) {
        Window window;
        int dimensionPixelSize = p3.g(F()).a - (K().getDimensionPixelSize(pq6.center_dialog_horizontal_margin) * 2);
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(dimensionPixelSize, -2);
    }

    public final void N0(DialogResult dialogResult, Bundle bundle) {
        js3.p(dialogResult, "dialogResult");
        js3.p(bundle, "bundle");
        K0().d = dialogResult;
        bundle.putParcelable("BUNDLE_KEY_DATA", K0());
        bundle.putBoolean("BUNDLE_KEY_DISMISS", this.X0);
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
        if (am2Var == null && (F() instanceof am2)) {
            am2Var = (am2) F();
        }
        if (am2Var != null) {
            am2Var.k(bundle, K0().a);
        } else {
            lw.g(null, "no fragment navigation fount", null);
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        sb7.p("MyketNewCenterBaseDialog", t61.i(C(), " onAttach()"), J0());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null || bundle.isEmpty()) {
            String strC = C();
            Bundle bundle2 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle2.putString("screen_name", strC);
            eeVar.getClass();
            eeVar.a(bundle2, "screen_show");
        }
    }

    @Override // androidx.fragment.app.d
    public void a0() {
        this.H = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void b0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.setDismissMessage(null);
        }
        x57 x57Var = this.V0;
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
        sb7.p("MyketNewCenterBaseDialog", t61.i(C(), " onDetach()"), J0());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        js3.p(dialogInterface, "dialog");
        N0(DialogResult.b, new Bundle());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void z0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            if (this.W0 == null) {
                js3.V("uiUtils");
                throw null;
            }
            lw8.a(dialog.getCurrentFocus());
        }
        try {
            A0(false, false);
        } catch (IllegalStateException e) {
            lw.g(e, "cannot dismiss dialog", "tag: ".concat(L0()));
        }
    }
}
