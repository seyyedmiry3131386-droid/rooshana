package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import io.sentry.android.core.t0;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.app.search.result.ui.SearchResultViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r90 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final BaseTransientBottomBar$SnackbarBaseLayout i;
    public final u41 j;
    public int k;
    public boolean l;
    public p90 m;
    public final m90 n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public ArrayList v;
    public final AccessibilityManager w;
    public final o90 x = new o90(this);
    public static final w82 y = yk.b;
    public static final LinearInterpolator z = yk.a;
    public static final w82 A = yk.d;
    public static final int[] C = {vp6.snackbarStyle};
    public static final String D = r90.class.getSimpleName();
    public static final Handler B = new Handler(Looper.getMainLooper(), new l90(0));

    public r90(Context context, ViewGroup viewGroup, View view, u41 u41Var) {
        int i = 0;
        this.n = new m90(this, i);
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (u41Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = u41Var;
        this.h = context;
        vj8.c(context, vj8.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = (BaseTransientBottomBar$SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? is6.mtrl_layout_snackbar : is6.design_layout_snackbar, viewGroup, false);
        this.i = baseTransientBottomBar$SnackbarBaseLayout;
        baseTransientBottomBar$SnackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = baseTransientBottomBar$SnackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.b.setTextColor(m91.y(actionTextColorAlpha, m91.p(vp6.colorSurface, snackbarContentLayout), snackbarContentLayout.b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(baseTransientBottomBar$SnackbarBaseLayout.getMaxInlineActionWidth());
        }
        baseTransientBottomBar$SnackbarBaseLayout.addView(view);
        baseTransientBottomBar$SnackbarBaseLayout.setAccessibilityLiveRegion(1);
        baseTransientBottomBar$SnackbarBaseLayout.setImportantForAccessibility(1);
        baseTransientBottomBar$SnackbarBaseLayout.setFitsSystemWindows(true);
        ql4 ql4Var = new ql4(8, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(baseTransientBottomBar$SnackbarBaseLayout, ql4Var);
        q69.q(baseTransientBottomBar$SnackbarBaseLayout, new n90(i, this));
        this.w = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = ub1.G(context, vp6.motionDurationLong2, 250);
        this.a = ub1.G(context, vp6.motionDurationLong2, 150);
        this.b = ub1.G(context, vp6.motionDurationMedium1, 75);
        this.d = ub1.H(context, vp6.motionEasingEmphasizedInterpolator, z);
        this.f = ub1.H(context, vp6.motionEasingEmphasizedInterpolator, A);
        this.e = ub1.H(context, vp6.motionEasingEmphasizedInterpolator, y);
    }

    public final void a(int i) {
        o77 o77VarT = o77.t();
        o90 o90Var = this.x;
        synchronized (o77VarT.a) {
            try {
                if (o77VarT.v(o90Var)) {
                    o77VarT.l((yz7) o77VarT.c, i);
                } else {
                    yz7 yz7Var = (yz7) o77VarT.d;
                    if (yz7Var != null && yz7Var.a.get() == o90Var) {
                        o77VarT.l((yz7) o77VarT.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View b() {
        p90 p90Var = this.m;
        if (p90Var == null) {
            return null;
        }
        return (View) p90Var.b.get();
    }

    public final void c() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g();
    }

    public final void d(int i) {
        o77 o77VarT = o77.t();
        o90 o90Var = this.x;
        synchronized (o77VarT.a) {
            try {
                if (o77VarT.v(o90Var)) {
                    o77VarT.c = null;
                    if (((yz7) o77VarT.d) != null) {
                        o77VarT.F();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                is isVar = (is) this.v.get(size);
                isVar.getClass();
                if (i == 0) {
                    AppSearchRecyclerListFragment appSearchRecyclerListFragment = isVar.a;
                    int i2 = AppSearchRecyclerListFragment.e1;
                    SearchResultViewModel searchResultViewModelU0 = appSearchRecyclerListFragment.U0();
                    searchResultViewModelU0.F = false;
                    searchResultViewModelU0.E = Boolean.FALSE;
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void e() {
        o77 o77VarT = o77.t();
        o90 o90Var = this.x;
        synchronized (o77VarT.a) {
            try {
                if (o77VarT.v(o90Var)) {
                    o77VarT.D((yz7) o77VarT.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((is) this.v.get(size)).getClass();
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.i;
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            baseTransientBottomBar$SnackbarBaseLayout.post(new m90(this, 2));
            return;
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.getParent() != null) {
            baseTransientBottomBar$SnackbarBaseLayout.setVisibility(0);
        }
        e();
    }

    public final void g() {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.i;
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = D;
        if (!z2) {
            t0.m(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.j == null) {
            t0.m(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (baseTransientBottomBar$SnackbarBaseLayout.getParent() == null) {
            return;
        }
        int i = b() != null ? this.r : this.o;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = baseTransientBottomBar$SnackbarBaseLayout.j;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.p;
        int i4 = rect.right + this.q;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            baseTransientBottomBar$SnackbarBaseLayout.requestLayout();
        }
        if ((z3 || this.t != this.s) && Build.VERSION.SDK_INT >= 29 && this.s > 0 && !this.l) {
            ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
            if ((layoutParams2 instanceof c) && (((c) layoutParams2).a instanceof SwipeDismissBehavior)) {
                m90 m90Var = this.n;
                baseTransientBottomBar$SnackbarBaseLayout.removeCallbacks(m90Var);
                baseTransientBottomBar$SnackbarBaseLayout.post(m90Var);
            }
        }
    }
}
