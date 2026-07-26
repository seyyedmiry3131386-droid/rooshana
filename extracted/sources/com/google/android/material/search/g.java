package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.g;
import defpackage.ak4;
import defpackage.bk4;
import defpackage.c82;
import defpackage.ew1;
import defpackage.f40;
import defpackage.l82;
import defpackage.m82;
import defpackage.o37;
import defpackage.pj;
import defpackage.qj;
import defpackage.r87;
import defpackage.tr0;
import defpackage.tt3;
import defpackage.ty6;
import defpackage.w82;
import defpackage.y45;
import defpackage.yh0;
import defpackage.yk;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final SearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final MaterialToolbar f;
    public final Toolbar g;
    public final LinearLayout h;
    public final TextView i;
    public final EditText j;
    public final ImageButton k;
    public final View l;
    public final TouchObserverFrameLayout m;
    public final bk4 n;
    public AnimatorSet o;
    public SearchBar p;

    public g(SearchView searchView) {
        this.a = searchView;
        this.b = searchView.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.e;
        this.e = searchView.f;
        this.f = searchView.g;
        this.g = searchView.h;
        this.i = searchView.i;
        this.j = searchView.k;
        this.k = searchView.l;
        this.l = searchView.m;
        this.m = searchView.n;
        this.h = searchView.j;
        this.n = new bk4(clippableRoundedCornerLayout);
    }

    public static void a(g gVar, float f) {
        ActionMenuView actionMenuViewX;
        gVar.k.setAlpha(f);
        gVar.l.setAlpha(f);
        gVar.m.setAlpha(f);
        if (!gVar.a.x || (actionMenuViewX = tt3.x(gVar.f)) == null) {
            return;
        }
        actionMenuViewX.setAlpha(f);
    }

    public static AnimatorSet j(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new tr0(new y45(4), new View[]{view}));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(tr0.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(r87.a(z, yk.b));
        return animatorSet;
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton imageButtonY = tt3.y(this.f);
        if (imageButtonY == null) {
            return;
        }
        Drawable drawableP = yh0.P(imageButtonY.getDrawable());
        if (!this.a.w) {
            if (drawableP instanceof ew1) {
                ((ew1) drawableP).setProgress(1.0f);
            }
            if (drawableP instanceof l82) {
                ((l82) drawableP).a(1.0f);
                return;
            }
            return;
        }
        if (drawableP instanceof ew1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new qj(15, (ew1) drawableP));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableP instanceof l82) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new qj(16, (l82) drawableP));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new qj(18, imageButtonY));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    public final void c() {
        SearchBar searchBar = this.p;
        bk4 bk4Var = this.n;
        if (bk4Var.a() != null) {
            AnimatorSet animatorSetB = bk4Var.b(searchBar);
            View view = bk4Var.b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ak4(), clippableRoundedCornerLayout.getCornerRadii(), bk4Var.c());
                valueAnimatorOfObject.addUpdateListener(new qj(11, clippableRoundedCornerLayout));
                animatorSetB.playTogether(valueAnimatorOfObject);
            }
            animatorSetB.setDuration(bk4Var.e);
            animatorSetB.start();
            bk4Var.i = 0.0f;
            bk4Var.j = null;
            bk4Var.k = null;
        }
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.o = null;
    }

    public final void d() {
        long totalDuration = n().getTotalDuration();
        SearchBar searchBar = this.p;
        bk4 bk4Var = this.n;
        AnimatorSet animatorSetB = bk4Var.b(searchBar);
        animatorSetB.setDuration(totalDuration);
        animatorSetB.start();
        bk4Var.i = 0.0f;
        bk4Var.j = null;
        bk4Var.k = null;
        if (this.o != null) {
            e(false).start();
            this.o.resume();
        }
        this.o = null;
    }

    public final AnimatorSet e(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f;
        ImageButton imageButtonY = tt3.y(materialToolbar);
        if (imageButtonY != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(l(tt3.y(this.p), imageButtonY), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new tr0(new y45(4), new View[]{imageButtonY}));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(tr0.a(imageButtonY));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewX = tt3.x(materialToolbar);
        if (actionMenuViewX != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(l(tt3.x(this.p), actionMenuViewX), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new tr0(new y45(4), new View[]{actionMenuViewX}));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(tr0.a(actionMenuViewX));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(r87.a(z, yk.b));
        return animatorSet;
    }

    public final AnimatorSet f(boolean z) {
        EditText editText;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.o == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z ? 300L : 250L);
            animatorSet2.setInterpolator(r87.a(z, yk.b));
            animatorSet.playTogether(animatorSet2, e(z));
        }
        TimeInterpolator timeInterpolator = z ? yk.a : yk.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(r87.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new tr0(new y45(7), new View[]{this.b}));
        bk4 bk4Var = this.n;
        Rect rect = bk4Var.j;
        Rect rectB = bk4Var.k;
        SearchView searchView = this.a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        if (rectB == null) {
            rectB = o37.b(clippableRoundedCornerLayout, this.p);
        }
        final Rect rect2 = new Rect(rectB);
        final float cornerSize = this.p.getCornerSize();
        float[] cornerRadii = clippableRoundedCornerLayout.getCornerRadii();
        float[] fArrC = bk4Var.c();
        int i = 5;
        final float[] fArr = {Math.max(cornerRadii[0], fArrC[0]), Math.max(cornerRadii[1], fArrC[1]), Math.max(cornerRadii[2], fArrC[2]), Math.max(cornerRadii[3], fArrC[3]), Math.max(cornerRadii[4], fArrC[4]), Math.max(cornerRadii[5], fArrC[5]), Math.max(cornerRadii[6], fArrC[6]), Math.max(cornerRadii[7], fArrC[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ty6(rect2), rectB, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lk7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = this.a;
                gVar.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr2 = fArr;
                float f = fArr2[0];
                float f2 = cornerSize;
                float[] fArr3 = {yk.a(f2, f, animatedFraction), yk.a(f2, fArr2[1], animatedFraction), yk.a(f2, fArr2[2], animatedFraction), yk.a(f2, fArr2[3], animatedFraction), yk.a(f2, fArr2[4], animatedFraction), yk.a(f2, fArr2[5], animatedFraction), yk.a(f2, fArr2[6], animatedFraction), yk.a(f2, fArr2[7], animatedFraction)};
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = gVar.c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fArr3);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        w82 w82Var = yk.b;
        valueAnimatorOfObject.setInterpolator(r87.a(z, w82Var));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = yk.a;
        valueAnimatorOfFloat2.setInterpolator(r87.a(z, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new tr0(new y45(7), new View[]{this.k}));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(r87.a(z, linearInterpolator));
        View view = this.l;
        TouchObserverFrameLayout touchObserverFrameLayout = this.m;
        valueAnimatorOfFloat3.addUpdateListener(new tr0(new y45(7), new View[]{view, touchObserverFrameLayout}));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(r87.a(z, w82Var));
        valueAnimatorOfFloat4.addUpdateListener(tr0.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(r87.a(z, w82Var));
        valueAnimatorOfFloat5.addUpdateListener(new tr0(new y45(6), new View[]{touchObserverFrameLayout}));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        View view2 = this.d;
        Animator animatorJ = j(z, view2, g(view2), h());
        Toolbar toolbar = this.g;
        Animator animatorJ2 = j(z, toolbar, g(toolbar), h());
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(r87.a(z, w82Var));
        if (searchView.x) {
            valueAnimatorOfFloat6.addUpdateListener(new m82(tt3.x(toolbar), tt3.x(this.f)));
        }
        EditText editText2 = this.j;
        Animator animatorK = k(editText2, z);
        Animator animatorK2 = k(this.i, z);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (this.p == null || TextUtils.equals(editText2.getText(), this.p.getText())) {
            editText = editText2;
        } else {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
            editText = editText2;
            valueAnimatorOfFloat7.addUpdateListener(new qj(17, this));
            animatorSet4.playTogether(valueAnimatorOfFloat7);
        }
        if (this.p == null || !TextUtils.equals(editText.getText(), this.p.getText())) {
            animator = animatorJ;
        } else {
            animator = animatorJ;
            Rect rect3 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.p.getTextView().getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new pj(this, rect3, i));
            animatorSet4.playTogether(valueAnimatorOfInt);
        }
        animatorSet4.setDuration(z ? 300L : 250L);
        animatorSet4.setInterpolator(r87.a(z, linearInterpolator));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animator, animatorJ2, valueAnimatorOfFloat6, animatorK, animatorK2, animatorSet4);
        animatorSet.addListener(new c82(this, z));
        return animatorSet;
    }

    public final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iM = m(this.p);
        return o37.o(this.p) ? iM - marginEnd : ((this.p.getWidth() + iM) + marginEnd) - this.a.getWidth();
    }

    public final int h() {
        FrameLayout frameLayout = this.e;
        int height = (frameLayout.getHeight() / 2) + frameLayout.getTop();
        SearchBar searchBar = this.p;
        int top = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return ((this.p.getHeight() / 2) + top) - height;
    }

    public final AnimatorSet i(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(tr0.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(r87.a(z, yk.b));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet k(View view, boolean z) {
        TextView placeholderTextView = this.p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z) {
            placeholderTextView = this.p.getTextView();
        }
        return j(z, view, m(placeholderTextView) - (this.h.getLeft() + view.getLeft()), h());
    }

    public final int l(View view, View view2) {
        if (view != null) {
            return m(view) - m(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.p.getPaddingStart();
        int iM = m(this.p);
        return o37.o(this.p) ? (((this.p.getWidth() + iM) + marginStart) - paddingStart) - this.a.getRight() : (iM - marginStart) + paddingStart;
    }

    public final int m(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet n() {
        SearchBar searchBar = this.p;
        SearchView searchView = this.a;
        if (searchBar != null) {
            if (searchView.h()) {
                searchView.f();
            }
            AnimatorSet animatorSetF = f(false);
            animatorSetF.addListener(new d(this));
            animatorSetF.start();
            return animatorSetF;
        }
        if (searchView.h()) {
            searchView.f();
        }
        AnimatorSet animatorSetI = i(false);
        animatorSetI.addListener(new f(this));
        animatorSetI.start();
        return animatorSetI;
    }

    public final void o(f40 f40Var) {
        float f = f40Var.c;
        if (f <= 0.0f) {
            return;
        }
        SearchBar searchBar = this.p;
        float cornerSize = searchBar.getCornerSize();
        bk4 bk4Var = this.n;
        if (bk4Var.f == null) {
            t0.m("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f40 f40Var2 = bk4Var.f;
        bk4Var.f = f40Var;
        if (f40Var2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = f40Var.d == 0;
            float f2 = f40Var.b;
            float f3 = bk4Var.g;
            float interpolation = bk4Var.a.getInterpolation(f);
            View view = bk4Var.b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float fA = yk.a(1.0f, 0.9f, interpolation);
                float fA2 = yk.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f3), interpolation) * (z ? 1 : -1);
                float fMin = Math.min(Math.max(0.0f, ((height - (fA * height)) / 2.0f) - f3), bk4Var.h);
                float f4 = f2 - bk4Var.i;
                float fA3 = yk.a(0.0f, fMin, Math.abs(f4) / height) * Math.signum(f4);
                if (!Float.isNaN(fA) && !Float.isNaN(fA2) && !Float.isNaN(fA3)) {
                    view.setScaleX(fA);
                    view.setScaleY(fA);
                    view.setTranslationX(fA2);
                    view.setTranslationY(fA3);
                    if (view instanceof ClippableRoundedCornerLayout) {
                        float[] fArrC = bk4Var.c();
                        ((ClippableRoundedCornerLayout) view).a(r17.getLeft(), r17.getTop(), r17.getRight(), r17.getBottom(), new float[]{yk.a(fArrC[0], cornerSize, interpolation), yk.a(fArrC[1], cornerSize, interpolation), yk.a(fArrC[2], cornerSize, interpolation), yk.a(fArrC[3], cornerSize, interpolation), yk.a(fArrC[4], cornerSize, interpolation), yk.a(fArrC[5], cornerSize, interpolation), yk.a(fArrC[6], cornerSize, interpolation), yk.a(fArrC[7], cornerSize, interpolation)});
                    }
                }
            }
        }
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        SearchView searchView = this.a;
        if (searchView.h()) {
            searchView.f();
        }
        if (searchView.w) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(r87.a(false, yk.b));
            this.o = animatorSet2;
            animatorSet2.start();
            this.o.pause();
        }
    }
}
