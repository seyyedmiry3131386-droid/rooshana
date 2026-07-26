package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends z12 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final cd i;
    public final xs0 j;
    public final lx1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [lx1] */
    public mx1(y12 y12Var) {
        super(y12Var);
        this.i = new cd(9, this);
        this.j = new xs0(2, this);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: lx1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                mx1 mx1Var = this.a;
                AutoCompleteTextView autoCompleteTextView = mx1Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                mx1Var.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = ub1.G(y12Var.getContext(), vp6.motionDurationShort3, 67);
        this.e = ub1.G(y12Var.getContext(), vp6.motionDurationShort3, 50);
        this.g = ub1.H(y12Var.getContext(), vp6.motionEasingLinearInterpolator, yk.a);
    }

    @Override // defpackage.z12
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new b7(22, this));
    }

    @Override // defpackage.z12
    public final int c() {
        return ft6.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.z12
    public final int d() {
        return xq6.mtrl_dropdown_arrow;
    }

    @Override // defpackage.z12
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.z12
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.z12
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.z12
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.z12
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.z12
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new jx1(0, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kx1
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                mx1 mx1Var = this.a;
                mx1Var.m = true;
                mx1Var.o = SystemClock.uptimeMillis();
                mx1Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.z12
    public final void m(t3 t3Var) {
        if (this.h.getInputType() == 0) {
            t3Var.m(Spinner.class.getName());
        }
        if (t3Var.h()) {
            t3Var.s(null);
        }
    }

    @Override // defpackage.z12
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // defpackage.z12
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 8;
        valueAnimatorOfFloat.addUpdateListener(new qj(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new qj(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new s5(3, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.z12
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
