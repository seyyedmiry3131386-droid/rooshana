package defpackage;

import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ir.mservices.market.version2.fragments.base.BaseDraggableFragment;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s60 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ s60(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorF;
        BottomSheetBehavior bottomSheetBehavior;
        switch (this.a) {
            case 0:
                BaseDraggableFragment baseDraggableFragment = (BaseDraggableFragment) this.b;
                Dialog dialog = baseDraggableFragment.L0;
                if (dialog != null && dialog.isShowing()) {
                    u60 u60Var = baseDraggableFragment.V0;
                    js3.m(u60Var);
                    double width = u60Var.w.getWidth();
                    js3.m(baseDraggableFragment.V0);
                    float fHypot = (float) Math.hypot(width, r0.w.getHeight());
                    u60 u60Var2 = baseDraggableFragment.V0;
                    js3.m(u60Var2);
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(u60Var2.w, baseDraggableFragment.J0()[0], baseDraggableFragment.J0()[1], 50.0f, fHypot);
                    js3.m(animatorCreateCircularReveal);
                    animatorCreateCircularReveal.addListener(new rj(1, baseDraggableFragment));
                    animatorCreateCircularReveal.setDuration(400L);
                    animatorCreateCircularReveal.start();
                    break;
                }
                break;
            default:
                BaseNewBottomDialogFragment baseNewBottomDialogFragment = (BaseNewBottomDialogFragment) this.b;
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
                bottomSheetBehaviorF.O(3);
                if (baseNewBottomDialogFragment.N0().c() == 2 && (bottomSheetBehavior = baseNewBottomDialogFragment.d1) != null) {
                    bottomSheetBehavior.N(p3.g(baseNewBottomDialogFragment.F()).b);
                }
                baseNewBottomDialogFragment.Q0();
                break;
        }
    }
}
