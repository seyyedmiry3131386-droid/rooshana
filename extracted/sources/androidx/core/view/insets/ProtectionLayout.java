package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.an6;
import defpackage.bn6;
import defpackage.jv0;
import defpackage.kb8;
import defpackage.no3;
import defpackage.rm7;
import defpackage.sd8;
import defpackage.xr6;
import defpackage.zm6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public an6 b;

    public ProtectionLayout(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    private sd8 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(xr6.tag_system_bar_state_monitor);
        if (tag instanceof sd8) {
            return (sd8) tag;
        }
        sd8 sd8Var = new sd8(viewGroup);
        viewGroup.setTag(xr6.tag_system_bar_state_monitor, sd8Var);
        return sd8Var;
    }

    public final void a() {
        int i;
        int i2;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new an6(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.b.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            jv0 jv0Var = (jv0) this.b.a.get(i3);
            Context context = getContext();
            int i4 = i3 + childCount;
            zm6 zm6Var = jv0Var.b;
            int i5 = jv0Var.a;
            if (i5 == 2) {
                i = zm6Var.a;
                i2 = 48;
            } else {
                if (i5 != 8) {
                    throw new IllegalArgumentException(rm7.n(i5, "Unexpected side: "));
                }
                i = zm6Var.a;
                i2 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i, i2);
            no3 no3Var = zm6Var.b;
            layoutParams.leftMargin = no3Var.a;
            layoutParams.topMargin = no3Var.b;
            layoutParams.rightMargin = no3Var.c;
            layoutParams.bottomMargin = no3Var.d;
            View view = new View(context);
            view.setTag(c);
            view.setTranslationX(zm6Var.e);
            view.setTranslationY(zm6Var.f);
            view.setAlpha(zm6Var.g);
            view.setVisibility(zm6Var.c ? 0 : 4);
            view.setBackground(zm6Var.d);
            bn6 bn6Var = new bn6(layoutParams, view, 0);
            if (zm6Var.h != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            zm6Var.h = bn6Var;
            addView(view, i4, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            an6 an6Var = this.b;
            int childCount = getChildCount() - (an6Var != null ? an6Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            for (int i = 0; i < size; i++) {
                ((jv0) this.b.a.get(i)).b.h = null;
            }
            an6 an6Var = this.b;
            ArrayList arrayList = an6Var.a;
            if (!an6Var.f) {
                an6Var.f = true;
                an6Var.b.b.remove(an6Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((jv0) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(xr6.tag_system_bar_state_monitor);
        if (tag instanceof sd8) {
            sd8 sd8Var = (sd8) tag;
            if (sd8Var.b.isEmpty()) {
                sd8Var.a.post(new kb8(2, sd8Var));
                viewGroup.setTag(xr6.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<jv0> list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = new ArrayList();
    }
}
