package ir.mservices.market.movie.ui.detail.restriction;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.bumptech.glide.a;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.ne5;
import defpackage.sj8;
import defpackage.t61;
import defpackage.t77;
import defpackage.uv1;
import defpackage.w77;
import defpackage.yw6;
import ir.mservices.market.movie.ui.detail.restriction.RestrictionDialogFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.DialogButtonComponentVertical;
import ir.mservices.market.views.MyketTextView;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictionDialogFragment extends BaseNewBottomDialogFragment {
    public t77 e1;
    public final bi5 f1 = new bi5(g27.a(w77.class), new yw6(5, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((w77) this.f1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "RestrictionDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Z0 = true;
        this.a1 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = t77.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        t77 t77Var = (t77) fa1.c(layoutInflater, js6.restriction_dialog, viewGroup, false);
        this.e1 = t77Var;
        js3.m(t77Var);
        View view = t77Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        String str;
        f57 f57VarH;
        js3.p(view, "view");
        super.k0(view, bundle);
        t77 t77Var = this.e1;
        js3.m(t77Var);
        ImageView imageView = t77Var.x;
        RestrictionInfo restrictionInfo = ((w77) this.f1.getValue()).b;
        String str2 = restrictionInfo.a;
        String str3 = restrictionInfo.b;
        if (str2 != null && !f88.n0(str2)) {
            if (str2 == null || f88.n0(str2)) {
                lw.g(null, "url is empty", null);
                str = "empty_url";
            } else {
                str = str2;
            }
            try {
                f57VarH = a.f(view).q(new ne5(str, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            ((f57) f57VarH.W(uv1.b()).c()).P(imageView);
        }
        js3.m(imageView);
        int i = 8;
        imageView.setVisibility((str2 == null || f88.n0(str2)) ? 8 : 0);
        imageView.setColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY);
        MyketTextView myketTextView = t77Var.z;
        js3.m(myketTextView);
        if (str3 != null && !f88.n0(str3)) {
            i = 0;
        }
        myketTextView.setVisibility(i);
        myketTextView.setText(str3);
        t77Var.v.setText(restrictionInfo.c);
        t77 t77Var2 = this.e1;
        js3.m(t77Var2);
        DialogButtonComponentVertical dialogButtonComponentVertical = t77Var2.w;
        dialogButtonComponentVertical.setPrimaryColor(sj8.b().j, sj8.b().k);
        RestrictionButton restrictionButton = restrictionInfo.d;
        String str4 = restrictionButton != null ? restrictionButton.a : null;
        RestrictionButton restrictionButton2 = restrictionInfo.e;
        dialogButtonComponentVertical.setTitles(str4, restrictionButton2 != null ? restrictionButton2.a : null);
        final int i2 = 0;
        dialogButtonComponentVertical.setOnCommitClickListener(new bp2(this) { // from class: v77
            public final /* synthetic */ RestrictionDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        this.b.R0(DialogResult.a, new Bundle());
                        break;
                    default:
                        RestrictionDialogFragment restrictionDialogFragment = this.b;
                        t77 t77Var3 = restrictionDialogFragment.e1;
                        js3.m(t77Var3);
                        t77Var3.w.setCancelButtonEnable(false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                        restrictionDialogFragment.R0(DialogResult.b, bundle2);
                        break;
                }
                return tx8.a;
            }
        });
        final int i3 = 1;
        dialogButtonComponentVertical.setOnCancelClickListener(new bp2(this) { // from class: v77
            public final /* synthetic */ RestrictionDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        this.b.R0(DialogResult.a, new Bundle());
                        break;
                    default:
                        RestrictionDialogFragment restrictionDialogFragment = this.b;
                        t77 t77Var3 = restrictionDialogFragment.e1;
                        js3.m(t77Var3);
                        t77Var3.w.setCancelButtonEnable(false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                        restrictionDialogFragment.R0(DialogResult.b, bundle2);
                        break;
                }
                return tx8.a;
            }
        });
    }
}
