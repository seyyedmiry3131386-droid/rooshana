package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d;
import defpackage.at2;
import defpackage.c24;
import defpackage.hk3;
import defpackage.ij5;
import defpackage.jr6;
import defpackage.js3;
import defpackage.kr6;
import defpackage.ku6;
import defpackage.p40;
import defpackage.qt6;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends d {
    public final c24 A0 = a.a(new hk3(22, this));
    public View B0;
    public int C0;
    public boolean D0;

    @Override // androidx.fragment.app.d
    public final void W(Context context) {
        js3.p(context, "context");
        super.W(context);
        if (this.D0) {
            p40 p40Var = new p40(J());
            p40Var.m(this);
            p40Var.e();
        }
    }

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        z0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.D0 = true;
            p40 p40Var = new p40(J());
            p40Var.m(this);
            p40Var.e();
        }
        super.X(bundle);
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        js3.o(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.z;
        if (i == 0 || i == -1) {
            i = kr6.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.d
    public final void b0() {
        this.H = true;
        View view = this.B0;
        if (view != null && at2.Y(view) == z0()) {
            view.setTag(jr6.nav_controller_view_tag, null);
        }
        this.B0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void e0(Context context, AttributeSet attributeSet, Bundle bundle) {
        js3.p(context, "context");
        js3.p(attributeSet, "attrs");
        super.e0(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ku6.NavHost);
        js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ku6.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.C0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, qt6.NavHostFragment);
        js3.o(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(qt6.NavHostFragment_defaultNavHost, false)) {
            this.D0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        if (this.D0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(jr6.nav_controller_view_tag, z0());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            js3.n(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.B0 = view2;
            if (view2.getId() == this.z) {
                View view3 = this.B0;
                js3.m(view3);
                view3.setTag(jr6.nav_controller_view_tag, z0());
            }
        }
    }

    public final ij5 z0() {
        return (ij5) this.A0.getValue();
    }
}
