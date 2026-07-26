package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.i;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.n90;
import defpackage.pt2;
import defpackage.q69;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.x48;
import defpackage.yt6;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    public static final int r = mt6.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final LinkedHashSet l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final int p;
    public HashSet q;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private String getChildrenA11yClassName() {
        return (this.n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            t0.d("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.o);
        q69.q(materialButton, new n90(4, this));
    }

    public final void f(int i, boolean z) {
        if (i == -1) {
            t0.d("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.q);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.q;
        this.q = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.m = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.m = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a(id, zContains2);
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.n || this.q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.q.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.q.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.p;
        if (i != -1) {
            g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) pt2.v(1, getVisibleButtonCount(), this.n ? 1 : 2).b);
    }

    public void setSelectionRequired(boolean z) {
        this.o = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.n != z) {
            this.n = z;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = r;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.l = new LinkedHashSet();
        this.m = false;
        this.q = new HashSet();
        TypedArray typedArrayD = vj8.d(getContext(), attributeSet, yt6.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(yt6.MaterialButtonToggleGroup_singleSelection, false));
        this.p = typedArrayD.getResourceId(yt6.MaterialButtonToggleGroup_checkedButton, -1);
        this.o = typedArrayD.getBoolean(yt6.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f == null) {
            this.f = x48.b(new defpackage.i(0.0f));
        }
        setEnabled(typedArrayD.getBoolean(yt6.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayD.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
