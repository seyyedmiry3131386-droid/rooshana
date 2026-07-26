package ir.mservices.market.version2.fragments.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import defpackage.bs1;
import defpackage.du;
import defpackage.es1;
import defpackage.fu;
import defpackage.js6;
import defpackage.lw;
import defpackage.lw8;
import defpackage.mj2;
import defpackage.nj2;
import defpackage.nr1;
import defpackage.nt6;
import defpackage.ps1;
import defpackage.r69;
import defpackage.r82;
import defpackage.rf0;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ForceUpdateDialogFragment;
import ir.mservices.market.views.BigEmptyOvalButton;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.DownloadProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public class ForceUpdateDialogFragment extends BaseNewDialogFragment implements nr1 {
    public r69 Y0;
    public boolean Z0 = false;
    public boolean a1 = false;
    public ps1 b1;
    public du c1;
    public BigFillOvalButton d1;
    public BigEmptyOvalButton e1;
    public DownloadProgressBar f1;
    public mj2 g1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(o0(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.dialog_force_update);
        Drawable background = dialog.findViewById(rr6.layout).getBackground();
        int i = sj8.b().l;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(i, mode);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (dialog.getWindow() != null && dialog.getWindow().getAttributes() != null) {
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        dialog.getWindow().setAttributes(layoutParams);
        dialog.setCancelable(false);
        TextView textView = (TextView) dialog.findViewById(rr6.title);
        TextView textView2 = (TextView) dialog.findViewById(rr6.description);
        textView.setTextColor(sj8.b().m);
        textView2.setTextColor(sj8.b().n);
        this.d1 = (BigFillOvalButton) dialog.findViewById(rr6.high);
        this.e1 = (BigEmptyOvalButton) dialog.findViewById(rr6.low);
        this.f1 = (DownloadProgressBar) dialog.findViewById(rr6.download_progress_bar);
        final r82 r82Var = new r82(false, NearbyRepository.SERVICE_ID, K().getString(rs6.myket), true, null, this.g1.b, 0L, false, false, "", null);
        this.f1.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().e, mode));
        lw.d(null, null, this.g);
        lw.f(null, null, this.g1.b > 0);
        if (Integer.valueOf(this.g1.b) == 1028) {
            lw.g(null, null, null);
        }
        final int i2 = 0;
        this.d1.setOnClickListener(new View.OnClickListener(this) { // from class: lj2
            public final /* synthetic */ ForceUpdateDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ForceUpdateDialogFragment forceUpdateDialogFragment = this.b;
                        if (forceUpdateDialogFragment.F() != null) {
                            forceUpdateDialogFragment.c1.a(r82Var, forceUpdateDialogFragment.F(), "ForceUpdate", null, null, "");
                        }
                        break;
                    default:
                        ForceUpdateDialogFragment forceUpdateDialogFragment2 = this.b;
                        forceUpdateDialogFragment2.b1.s(r82Var.b);
                        forceUpdateDialogFragment2.f1.setVisibility(4);
                        forceUpdateDialogFragment2.e1.setVisibility(4);
                        forceUpdateDialogFragment2.d1.setText(forceUpdateDialogFragment2.L(rs6.update_app));
                        forceUpdateDialogFragment2.d1.setVisibility(0);
                        break;
                }
            }
        });
        final int i3 = 1;
        this.e1.setOnClickListener(new View.OnClickListener(this) { // from class: lj2
            public final /* synthetic */ ForceUpdateDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ForceUpdateDialogFragment forceUpdateDialogFragment = this.b;
                        if (forceUpdateDialogFragment.F() != null) {
                            forceUpdateDialogFragment.c1.a(r82Var, forceUpdateDialogFragment.F(), "ForceUpdate", null, null, "");
                        }
                        break;
                    default:
                        ForceUpdateDialogFragment forceUpdateDialogFragment2 = this.b;
                        forceUpdateDialogFragment2.b1.s(r82Var.b);
                        forceUpdateDialogFragment2.f1.setVisibility(4);
                        forceUpdateDialogFragment2.e1.setVisibility(4);
                        forceUpdateDialogFragment2.d1.setText(forceUpdateDialogFragment2.L(rs6.update_app));
                        forceUpdateDialogFragment2.d1.setVisibility(0);
                        break;
                }
            }
        });
        BaseNewDialogFragment.I0(dialog.getWindow());
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.Z0) {
            return null;
        }
        O0();
        return this.Y0;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment
    public final void H0() {
        if (this.a1) {
            return;
        }
        this.a1 = true;
        w91 w91Var = ((t91) ((nj2) e())).a;
        this.V0 = (x57) w91Var.G.get();
        this.W0 = (lw8) w91Var.E.get();
        this.b1 = (ps1) w91Var.w.get();
        this.c1 = (du) w91Var.B0.get();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.g1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    public final void O0() {
        if (this.Y0 == null) {
            this.Y0 = new r69(super.H(), this);
            this.Z0 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.Y0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        O0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.g1 = mj2.fromBundle(p0());
        super.W(context);
        O0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.b1.u(this);
        this.b1.r();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.d
    public final void a0() {
        this.H = true;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.b1.x(this);
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        if (bs1Var != null) {
            es1 es1Var = (es1) bs1Var;
            if (es1Var.f == 100) {
                this.d1.setVisibility(4);
                this.f1.setVisibility(0);
                this.e1.setText(L(rs6.update_paused));
                this.e1.setVisibility(0);
                long j = es1Var.i;
                long j2 = es1Var.h;
                if (j2 <= 0) {
                    this.f1.a(0);
                } else {
                    this.f1.a((int) ((j * 100) / j2));
                }
            }
        }
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        if (es1Var == null || es1Var.f != 140) {
            return;
        }
        this.f1.setVisibility(4);
        this.e1.setVisibility(4);
        this.d1.setText(L(rs6.update_app));
        this.d1.setVisibility(0);
    }
}
