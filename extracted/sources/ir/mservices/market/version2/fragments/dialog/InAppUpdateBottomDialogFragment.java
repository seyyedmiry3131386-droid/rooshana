package ir.mservices.market.version2.fragments.dialog;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g;
import defpackage.bi5;
import defpackage.de;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.p3;
import defpackage.p40;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.yk3;
import defpackage.yq6;
import defpackage.zk3;
import ir.mservices.market.app.detail.update.InAppFragment;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateBottomDialogFragment extends BaseNewBottomDialogFragment {
    public final bi5 e1 = new bi5(g27.a(yk3.class), new de(21, this));
    public zk3 f1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return ((yk3) this.e1.getValue()).b.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((yk3) this.e1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "InAppUpdateBottomDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = zk3.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.f1 = (zk3) fa1.c(layoutInflater, js6.in_app_update_dialog, viewGroup, false);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        Drawable drawableMutate = p3.k(resourcesK, yq6.actionbar_logo).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
        zk3 zk3Var = this.f1;
        js3.m(zk3Var);
        zk3Var.x.setImageDrawable(drawableMutate);
        zk3 zk3Var2 = this.f1;
        js3.m(zk3Var2);
        ImageView imageView = zk3Var2.w;
        Resources resourcesK2 = K();
        js3.o(resourcesK2, "getResources(...)");
        imageView.setImageDrawable(p3.k(resourcesK2, yq6.app_icon_gradient).mutate());
        zk3 zk3Var3 = this.f1;
        js3.m(zk3Var3);
        View view = zk3Var3.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        if (G().F(rr6.content) instanceof InAppFragment) {
            return;
        }
        int i = InAppFragment.a1;
        InAppUpdateData inAppUpdateData = ((yk3) this.e1.getValue()).b;
        InAppFragment inAppFragment = new InAppFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("BUNDLE_KEY_DATA", inAppUpdateData);
        inAppFragment.u0(bundle2);
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(rr6.content, inAppFragment, null);
        p40Var.e();
    }
}
