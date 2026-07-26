package ir.mservices.market.screenshots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.d;
import com.bumptech.glide.a;
import com.jsibbold.zoomage.ZoomageView;
import defpackage.dt2;
import defpackage.f57;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.q57;
import defpackage.qc;
import defpackage.s57;
import defpackage.uf7;
import defpackage.uv1;
import defpackage.zk8;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotFragment extends d {
    public uf7 A0;

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = uf7.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        uf7 uf7Var = (uf7) fa1.c(layoutInflater, js6.screen_shot_item, viewGroup, false);
        this.A0 = uf7Var;
        js3.m(uf7Var);
        View view = uf7Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.d
    public final void b0() {
        this.H = true;
        this.A0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        uf7 uf7Var = this.A0;
        js3.m(uf7Var);
        uf7Var.w.setZoomable(false);
        ScreenshotData screenshotData = (ScreenshotData) dt2.p(p0(), "screenshot_data", ScreenshotData.class);
        uf7 uf7Var2 = this.A0;
        js3.m(uf7Var2);
        uf7Var2.v.d(true);
        s57 s57VarD = a.b(H()).d(this);
        uf7 uf7Var3 = this.A0;
        js3.m(uf7Var3);
        ZoomageView zoomageView = uf7Var3.w;
        s57VarD.getClass();
        s57VarD.o(new q57(zoomageView));
        if (screenshotData != null) {
            f57 f57VarL = ((f57) zk8.Q(this, screenshotData.a).W(uv1.b()).V(((f57) zk8.Q(this, screenshotData.b).m()).W(uv1.b())).m()).L(new qc(4, this));
            uf7 uf7Var4 = this.A0;
            js3.m(uf7Var4);
            f57VarL.P(uf7Var4.w);
        }
    }
}
