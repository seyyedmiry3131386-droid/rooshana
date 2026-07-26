package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import defpackage.as7;
import defpackage.ca7;
import defpackage.ex0;
import defpackage.hl5;
import defpackage.i;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.r61;
import defpackage.r70;
import defpackage.re3;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.x48;
import defpackage.y48;
import defpackage.yt6;
import defpackage.z48;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonGroup extends LinearLayout {
    public static final int k = mt6.Widget_Material3_MaterialButtonGroup;
    public final ArrayList a;
    public final ArrayList b;
    public final ca7 c;
    public final ex0 d;
    public Integer[] e;
    public x48 f;
    public y48 g;
    public int h;
    public z48 i;
    public boolean j;

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.h <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.h - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            t0.d("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.j = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                if (c(i) && this.i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    z48 z48Var = this.i;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < z48Var.a; i3++) {
                        r70 r70Var = (r70) z48Var.d[i3].b;
                        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = (StateListSizeChange$SizeChangeType) r70Var.c;
                        float f = r70Var.b;
                        if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.b) {
                            fMax = Math.max(i2, f);
                        } else if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.a) {
                            fMax = Math.max(i2, width * f);
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i4 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i4 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i4)) {
                                materialButton2 = (MaterialButton) getChildAt(i4);
                                break;
                            }
                            i4--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i5 = i + 1;
                    while (true) {
                        if (i5 >= childCount) {
                            break;
                        }
                        if (c(i5)) {
                            materialButton = (MaterialButton) getChildAt(i5);
                            break;
                        }
                        i5++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i6 = firstVisibleChildIndex;
        while (i6 <= lastVisibleChildIndex) {
            if (c(i6)) {
                ((MaterialButton) getChildAt(i6)).setSizeChange(this.i);
                ((MaterialButton) getChildAt(i6)).setWidthChangeMax((i6 == firstVisibleChildIndex || i6 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i6++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.v;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.v = null;
                materialButton.s = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [as7[], java.io.Serializable] */
    public final void e() {
        re3 re3Var;
        int i;
        if (!(this.f == null && this.g == null) && this.j) {
            this.j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    y48 y48Var = this.g;
                    if (y48Var == null || (!z && !z2)) {
                        y48Var = (y48) this.b.get(i2);
                    }
                    if (y48Var == null) {
                        re3Var = new re3((as7) this.a.get(i2));
                    } else {
                        re3 re3Var2 = new re3(1);
                        int i3 = y48Var.a;
                        re3Var2.b = i3;
                        re3Var2.c = y48Var.b;
                        int[][] iArr = y48Var.c;
                        ?? r14 = new int[iArr.length][];
                        re3Var2.d = r14;
                        as7[] as7VarArr = y48Var.d;
                        re3Var2.e = new as7[as7VarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(as7VarArr, 0, (as7[]) re3Var2.e, 0, re3Var2.b);
                        re3Var2.f = y48Var.e;
                        re3Var2.g = y48Var.f;
                        re3Var2.h = y48Var.g;
                        re3Var2.i = y48Var.h;
                        re3Var = re3Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    x48 x48Var = this.f;
                    if ((i4 | 1) == i4) {
                        re3Var.f = x48Var;
                    }
                    if ((i4 | 2) == i4) {
                        re3Var.g = x48Var;
                    }
                    if ((i4 | 4) == i4) {
                        re3Var.h = x48Var;
                    }
                    if ((i4 | 8) == i4) {
                        re3Var.i = x48Var;
                    }
                    y48 y48Var2 = re3Var.b == 0 ? null : new y48(re3Var);
                    if (y48Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(y48Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(y48Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public z48 getButtonSizeChange() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        t0.m("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public r61 getInnerCornerSize() {
        return this.f.b;
    }

    public x48 getInnerCornerSizeStateList() {
        return this.f;
    }

    public as7 getShapeAppearance() {
        y48 y48Var = this.g;
        if (y48Var == null) {
            return null;
        }
        return y48Var.c();
    }

    public int getSpacing() {
        return this.h;
    }

    public y48 getStateListShapeAppearance() {
        return this.g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
            this.b.remove(iIndexOfChild);
        }
        this.j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(z48 z48Var) {
        if (this.i != z48Var) {
            this.i = z48Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(r61 r61Var) {
        this.f = x48.b(r61Var);
        this.j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(x48 x48Var) {
        this.f = x48Var;
        this.j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.j = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(as7 as7Var) {
        re3 re3Var = new re3(as7Var);
        this.g = re3Var.b == 0 ? null : new y48(re3Var);
        this.j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y48 y48Var) {
        this.g = y48Var;
        this.j = true;
        e();
        invalidate();
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        x48 x48VarB;
        XmlResourceParser xml;
        int next;
        z48 z48Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        int i2 = k;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ca7(28, this);
        this.d = new ex0(2, this);
        this.j = true;
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.MaterialButtonGroup, i, i2, new int[0]);
        if (typedArrayD.hasValue(yt6.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = typedArrayD.getResourceId(yt6.MaterialButtonGroup_buttonSizeChange, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        z48Var = new z48();
                        z48Var.c = new int[10][];
                        z48Var.d = new hl5[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    z48Var = null;
                }
                if (next2 == 2) {
                    if (xml.getName().equals("selector")) {
                        z48Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    this.i = z48Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } else {
                z48Var = null;
                this.i = z48Var;
            }
        }
        if (typedArrayD.hasValue(yt6.MaterialButtonGroup_shapeAppearance)) {
            y48 y48VarB = y48.b(context2, typedArrayD, yt6.MaterialButtonGroup_shapeAppearance);
            this.g = y48VarB;
            if (y48VarB == null) {
                re3 re3Var = new re3(as7.a(context2, typedArrayD.getResourceId(yt6.MaterialButtonGroup_shapeAppearance, 0), typedArrayD.getResourceId(yt6.MaterialButtonGroup_shapeAppearanceOverlay, 0)).a());
                this.g = re3Var.b != 0 ? new y48(re3Var) : null;
            }
        }
        if (typedArrayD.hasValue(yt6.MaterialButtonGroup_innerCornerSize)) {
            int i3 = yt6.MaterialButtonGroup_innerCornerSize;
            i iVar = new i(0.0f);
            int resourceId2 = typedArrayD.getResourceId(i3, 0);
            if (resourceId2 == 0 || !context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                x48VarB = x48.b(as7.e(typedArrayD, i3, iVar));
            } else {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        x48 x48Var = new x48();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml.getName().equals("selector")) {
                                x48Var.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                            }
                            xml.close();
                            x48VarB = x48Var;
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    x48VarB = x48.b(iVar);
                }
            }
            this.f = x48VarB;
        }
        this.h = typedArrayD.getDimensionPixelSize(yt6.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(yt6.MaterialButtonGroup_android_enabled, true));
        typedArrayD.recycle();
    }
}
