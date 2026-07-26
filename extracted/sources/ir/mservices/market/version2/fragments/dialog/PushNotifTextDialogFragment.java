package ir.mservices.market.version2.fragments.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.f57;
import defpackage.fu;
import defpackage.js6;
import defpackage.lo6;
import defpackage.lw;
import defpackage.lw8;
import defpackage.mo6;
import defpackage.nt6;
import defpackage.p3;
import defpackage.pq6;
import defpackage.r69;
import defpackage.rf0;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t15;
import defpackage.t91;
import defpackage.uv1;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public class PushNotifTextDialogFragment extends BaseNewDialogFragment {
    public r69 Y0;
    public boolean Z0 = false;
    public boolean a1 = false;
    public lo6 b1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lo6 lo6Var = this.b1;
        String str = lo6Var.b;
        String str2 = lo6Var.d;
        String str3 = lo6Var.c;
        lw.c(str, null);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.dialog_text_push_notif);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        TextView textView = (TextView) dialog.findViewById(rr6.textTitle);
        MyketTextView myketTextView = (MyketTextView) dialog.findViewById(rr6.dialog_text_view);
        myketTextView.setMovementMethod(LinkMovementMethod.getInstance());
        ImageView imageView = (ImageView) dialog.findViewById(rr6.dialogIcon);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) dialog.findViewById(rr6.dialog_button);
        textView.setTextColor(sj8.b().m);
        myketTextView.setTextColor(sj8.b().n);
        dialogButtonComponent.setTitles(L(rs6.button_ok), "");
        dialogButtonComponent.setOnClickListener(new t15(7, this));
        if (TextUtils.isEmpty(str3)) {
            imageView.setImageResource(yq6.app_icon_gradient);
        } else {
            ((f57) zk8.Q(this, str3).k(yq6.icon)).W(uv1.b()).P(imageView);
        }
        textView.setText(str);
        myketTextView.setTextFromHtml(str2, 0);
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.push_notif_dialog_margin);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.margin_default_v2_double);
        GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(F());
        int i = graphicUtils$DimensionG.a;
        int i2 = graphicUtils$DimensionG.b;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = i - dimensionPixelSize;
        layoutParams.height = i2 - dimensionPixelSize2;
        dialog.getWindow().setAttributes(layoutParams);
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
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
        w91 w91Var = ((t91) ((mo6) e())).a;
        this.V0 = (x57) w91Var.G.get();
        this.W0 = (lw8) w91Var.E.get();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String J0() {
        return this.b1.b;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.b1.a;
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
        this.b1 = lo6.fromBundle(p0());
        super.W(context);
        O0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
