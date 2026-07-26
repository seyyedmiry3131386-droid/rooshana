package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import defpackage.bo8;
import defpackage.o37;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseSlider a;

    public e(BaseSlider baseSlider) {
        this.a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        int i = BaseSlider.r1;
        BaseSlider baseSlider = this.a;
        ViewGroup viewGroupM = o37.m(baseSlider);
        ViewOverlay overlay = viewGroupM == null ? null : viewGroupM.getOverlay();
        if (overlay == null) {
            return;
        }
        Iterator it = baseSlider.l.iterator();
        while (it.hasNext()) {
            overlay.remove((bo8) it.next());
        }
    }
}
