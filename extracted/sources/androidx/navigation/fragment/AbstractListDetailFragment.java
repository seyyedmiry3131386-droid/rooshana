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
import androidx.fragment.app.g;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import defpackage.a1;
import defpackage.b1;
import defpackage.js3;
import defpackage.kr6;
import defpackage.ku6;
import defpackage.mq6;
import defpackage.p40;
import defpackage.ws5;
import defpackage.zn2;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractListDetailFragment extends d {
    public a1 A0;
    public int B0;

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragment;
        Bundle bundle2;
        js3.p(layoutInflater, "inflater");
        if (bundle != null) {
            this.B0 = bundle.getInt("android-support-nav:fragment:graphId");
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(kr6.sliding_pane_layout);
        View viewZ0 = z0();
        if (!js3.i(viewZ0, slidingPaneLayout) && !js3.i(viewZ0.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewZ0);
        }
        Context context = layoutInflater.getContext();
        js3.o(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(kr6.sliding_pane_detail_container);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(layoutInflater.getContext().getResources().getDimensionPixelSize(mq6.sliding_pane_detail_pane_width), -1);
        layoutParams.a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        d dVarF = G().F(kr6.sliding_pane_detail_container);
        if (dVarF != null) {
        } else {
            int i = this.B0;
            if (i != 0) {
                if (i != 0) {
                    bundle2 = new Bundle();
                    bundle2.putInt("android-support-nav:fragment:graphId", i);
                } else {
                    bundle2 = null;
                }
                navHostFragment = new NavHostFragment();
                if (bundle2 != null) {
                    navHostFragment.u0(bundle2);
                }
            } else {
                navHostFragment = new NavHostFragment();
            }
            g gVarG = G();
            js3.o(gVarG, "getChildFragmentManager(...)");
            p40 p40Var = new p40(gVarG);
            p40Var.p = true;
            p40Var.h(kr6.sliding_pane_detail_container, navHostFragment, null, 1);
            p40Var.e();
        }
        this.A0 = new a1(slidingPaneLayout);
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b1(this, slidingPaneLayout));
        } else {
            a1 a1Var = this.A0;
            js3.m(a1Var);
            a1Var.f(slidingPaneLayout.e && slidingPaneLayout.d());
        }
        ws5 ws5VarC = o0().c();
        zn2 zn2VarN = N();
        a1 a1Var2 = this.A0;
        js3.m(a1Var2);
        ws5VarC.a(zn2VarN, a1Var2);
        return slidingPaneLayout;
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
            this.B0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        int i = this.B0;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        js3.m(((SlidingPaneLayout) s0()).getChildAt(0));
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        this.H = true;
        a1 a1Var = this.A0;
        js3.m(a1Var);
        a1Var.f(((SlidingPaneLayout) s0()).e && ((SlidingPaneLayout) s0()).d());
    }

    public abstract View z0();
}
