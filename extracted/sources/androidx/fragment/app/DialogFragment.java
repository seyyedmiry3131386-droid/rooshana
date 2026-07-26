package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ac7;
import defpackage.an1;
import defpackage.bb5;
import defpackage.bn1;
import defpackage.cn1;
import defpackage.dn1;
import defpackage.j27;
import defpackage.jy0;
import defpackage.o27;
import defpackage.ok2;
import defpackage.p40;
import defpackage.q6;
import defpackage.rm7;
import defpackage.ul2;
import defpackage.v94;
import defpackage.w94;
import defpackage.x94;
import defpackage.xb7;
import defpackage.y40;
import defpackage.z27;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler A0;
    public boolean J0;
    public Dialog L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public final q6 B0 = new q6(8, this);
    public final an1 C0 = new an1(this);
    public final bn1 D0 = new bn1(this);
    public int E0 = 0;
    public int F0 = 0;
    public boolean G0 = true;
    public boolean H0 = true;
    public int I0 = -1;
    public final cn1 K0 = new cn1(this);
    public boolean P0 = false;

    public final void A0(boolean z, boolean z2) {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        this.O0 = false;
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.L0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.A0.getLooper()) {
                    onDismiss(this.L0);
                } else {
                    this.A0.post(this.B0);
                }
            }
        }
        this.M0 = true;
        if (this.I0 >= 0) {
            g gVarJ = J();
            int i = this.I0;
            if (i < 0) {
                throw new IllegalArgumentException(rm7.n(i, "Bad id: "));
            }
            gVarJ.z(new ul2(gVarJ, null, i), z);
            this.I0 = -1;
            return;
        }
        p40 p40Var = new p40(J());
        p40Var.p = true;
        p40Var.j(this);
        if (z) {
            p40Var.f(true, true);
        } else {
            p40Var.e();
        }
    }

    public int B0() {
        return this.F0;
    }

    public Dialog C0(Bundle bundle) {
        if (g.N(3)) {
            toString();
        }
        return new jy0(q0(), B0());
    }

    public final Dialog D0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void E0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void F0(g gVar, String str) {
        this.N0 = false;
        this.O0 = true;
        gVar.getClass();
        p40 p40Var = new p40(gVar);
        p40Var.p = true;
        p40Var.h(0, this, str, 1);
        p40Var.e();
    }

    @Override // androidx.fragment.app.d
    public void T(Bundle bundle) {
        this.H = true;
    }

    @Override // androidx.fragment.app.d
    public void W(Context context) {
        Object obj;
        super.W(context);
        bb5 bb5Var = this.W;
        bb5Var.getClass();
        bb5.a("observeForever");
        cn1 cn1Var = this.K0;
        v94 v94Var = new v94(bb5Var, cn1Var);
        ac7 ac7Var = bb5Var.b;
        xb7 xb7VarA = ac7Var.a(cn1Var);
        if (xb7VarA != null) {
            obj = xb7VarA.b;
        } else {
            xb7 xb7Var = new xb7(cn1Var, v94Var);
            ac7Var.d++;
            xb7 xb7Var2 = ac7Var.b;
            if (xb7Var2 == null) {
                ac7Var.a = xb7Var;
                ac7Var.b = xb7Var;
            } else {
                xb7Var2.c = xb7Var;
                xb7Var.d = xb7Var2;
                ac7Var.b = xb7Var;
            }
            obj = null;
        }
        x94 x94Var = (x94) obj;
        if (x94Var instanceof w94) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (x94Var == null) {
            v94Var.a(true);
        }
        if (this.O0) {
            return;
        }
        this.N0 = false;
    }

    @Override // androidx.fragment.app.d
    public void X(Bundle bundle) {
        super.X(bundle);
        this.A0 = new Handler();
        this.H0 = this.A == 0;
        if (bundle != null) {
            this.E0 = bundle.getInt("android:style", 0);
            this.F0 = bundle.getInt("android:theme", 0);
            this.G0 = bundle.getBoolean("android:cancelable", true);
            this.H0 = bundle.getBoolean("android:showsDialog", this.H0);
            this.I0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.d
    public void b0() {
        this.H = true;
        Dialog dialog = this.L0;
        if (dialog != null) {
            this.M0 = true;
            dialog.setOnDismissListener(null);
            this.L0.dismiss();
            if (!this.N0) {
                onDismiss(this.L0);
            }
            this.L0 = null;
            this.P0 = false;
        }
    }

    @Override // androidx.fragment.app.d
    public void c0() {
        this.H = true;
        if (!this.O0 && !this.N0) {
            this.N0 = true;
        }
        this.W.g(this.K0);
    }

    @Override // androidx.fragment.app.d
    public LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        boolean z = this.H0;
        if (z && !this.J0) {
            if (z && !this.P0) {
                try {
                    this.J0 = true;
                    Dialog dialogC0 = C0(bundle);
                    this.L0 = dialogC0;
                    if (this.H0) {
                        E0(dialogC0, this.E0);
                        Context contextH = H();
                        if (contextH instanceof Activity) {
                            this.L0.setOwnerActivity((Activity) contextH);
                        }
                        this.L0.setCancelable(this.G0);
                        this.L0.setOnCancelListener(this.C0);
                        this.L0.setOnDismissListener(this.D0);
                        this.P0 = true;
                    } else {
                        this.L0 = null;
                    }
                    this.J0 = false;
                } catch (Throwable th) {
                    this.J0 = false;
                    throw th;
                }
            }
            if (g.N(2)) {
                toString();
            }
            Dialog dialog = this.L0;
            if (dialog != null) {
                return layoutInflaterD0.cloneInContext(dialog.getContext());
            }
        } else if (g.N(2)) {
            toString();
        }
        return layoutInflaterD0;
    }

    @Override // androidx.fragment.app.d
    public void h0(Bundle bundle) {
        Dialog dialog = this.L0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.E0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.F0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.G0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.H0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.I0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.d
    public void i0() {
        this.H = true;
        Dialog dialog = this.L0;
        if (dialog != null) {
            this.M0 = false;
            dialog.show();
            View decorView = this.L0.getWindow().getDecorView();
            j27.k(decorView, this);
            z27.l(decorView, this);
            o27.i(decorView, this);
        }
    }

    @Override // androidx.fragment.app.d
    public void j0() {
        this.H = true;
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.L0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.L0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.d
    public final void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m0(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.L0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.L0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.M0) {
            return;
        }
        if (g.N(3)) {
            toString();
        }
        A0(true, true);
    }

    @Override // androidx.fragment.app.d
    public final y40 w() {
        return new dn1(this, new ok2(this));
    }

    public void z0() {
        A0(false, false);
    }
}
