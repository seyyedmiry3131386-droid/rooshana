package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import defpackage.aj;
import defpackage.b77;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.fk;
import defpackage.ft6;
import defpackage.gk;
import defpackage.hk;
import defpackage.ja1;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.qr6;
import defpackage.rf0;
import defpackage.s5;
import defpackage.s80;
import defpackage.se;
import defpackage.sk6;
import defpackage.te;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.xq6;
import defpackage.yh0;
import defpackage.yt6;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] A;
    public static final int[][] B;
    public static final int C;
    public static final int y = mt6.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] z = {vp6.state_indeterminate};
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final hk w;
    public final s80 x;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.a;
            return dw1.s(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.a));
        }
    }

    static {
        int i = vp6.state_error;
        A = new int[]{i};
        B = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i = this.r;
        return i == 1 ? getResources().getString(ft6.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(ft6.mtrl_checkbox_state_description_unchecked) : getResources().getString(ft6.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int iP = m91.p(xp6.colorControlActivated, this);
            int iP2 = m91.p(xp6.colorError, this);
            int iP3 = m91.p(vp6.colorSurface, this);
            int iP4 = m91.p(vp6.colorOnSurface, this);
            this.g = new ColorStateList(B, new int[]{m91.y(1.0f, iP3, iP2), m91.y(1.0f, iP3, iP), m91.y(0.54f, iP3, iP4), m91.y(0.38f, iP3, iP4), m91.y(0.38f, iP3, iP4)});
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s5 s5Var;
        this.l = te.d(this.l, this.o, getButtonTintMode());
        this.m = te.d(this.m, this.p, this.q);
        if (this.n) {
            hk hkVar = this.w;
            if (hkVar != null) {
                fk fkVar = hkVar.b;
                Drawable drawable = hkVar.a;
                s80 s80Var = this.x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (s80Var.a == null) {
                        s80Var.a = new aj(s80Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(s80Var.a);
                }
                ArrayList arrayList = hkVar.e;
                if (arrayList != null && s80Var != null) {
                    arrayList.remove(s80Var);
                    if (hkVar.e.size() == 0 && (s5Var = hkVar.d) != null) {
                        fkVar.b.removeListener(s5Var);
                        hkVar.d = null;
                    }
                }
                Drawable drawable2 = hkVar.a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (s80Var.a == null) {
                        s80Var.a = new aj(s80Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(s80Var.a);
                } else if (s80Var != null) {
                    if (hkVar.e == null) {
                        hkVar.e = new ArrayList();
                    }
                    if (!hkVar.e.contains(s80Var)) {
                        hkVar.e.add(s80Var);
                        if (hkVar.d == null) {
                            hkVar.d = new s5(1, hkVar);
                        }
                        fkVar.b.addListener(hkVar.d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && hkVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(qr6.checked, qr6.unchecked, hkVar, false);
                    ((AnimatedStateListDrawable) this.l).addTransition(qr6.indeterminate, qr6.unchecked, hkVar, false);
                }
            }
        }
        Drawable drawable4 = this.l;
        if (drawable4 != null && (colorStateList2 = this.o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.m;
        if (drawable5 != null && (colorStateList = this.p) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(te.c(this.l, this.m, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.s = te.r(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(rf0.v(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(rf0.v(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerC;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw bl4.o(it);
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManagerC = se.c(getContext().getSystemService(se.d()))) != null) {
                autofillManagerC.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) throws Throwable {
        hk hkVar;
        int next;
        super(mk4.a(context, attributeSet, i, y), attributeSet, i);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        Context context2 = getContext();
        int i2 = xq6.mtrl_checkbox_button_checked_unchecked;
        if (Build.VERSION.SDK_INT >= 24) {
            hkVar = new hk(context2, 0);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = b77.a;
            Drawable drawable = resources.getDrawable(i2, theme);
            hkVar.a = drawable;
            drawable.setCallback(hkVar.f);
            new gk(0, hkVar.a.getConstantState());
        } else {
            int i3 = hk.g;
            try {
                XmlResourceParser xml = context2.getResources().getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    hk hkVar2 = new hk(context2, 0);
                    hkVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                    hkVar = hkVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e) {
                t0.e("AnimatedVDCompat", "parser error", e);
                hkVar = null;
            } catch (XmlPullParserException e2) {
                t0.e("AnimatedVDCompat", "parser error", e2);
                hkVar = null;
            }
        }
        this.w = hkVar;
        this.x = new s80(2, this);
        Context context3 = getContext();
        this.l = getButtonDrawable();
        this.o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        sk6 sk6VarE = vj8.e(context3, attributeSet, yt6.MaterialCheckBox, i, y, new int[0]);
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        this.m = sk6VarE.v(yt6.MaterialCheckBox_buttonIcon);
        if (this.l != null && yh0.H(context3, vp6.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(yt6.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArray.getResourceId(yt6.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == C && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.l = rf0.v(context3, xq6.mtrl_checkbox_button);
                this.n = true;
                if (this.m == null) {
                    this.m = rf0.v(context3, xq6.mtrl_checkbox_button_icon);
                }
            }
        }
        this.p = ja1.q(context3, sk6VarE, yt6.MaterialCheckBox_buttonIconTint);
        this.q = o37.t(typedArray.getInt(yt6.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = typedArray.getBoolean(yt6.MaterialCheckBox_useMaterialThemeColors, false);
        this.i = typedArray.getBoolean(yt6.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.j = typedArray.getBoolean(yt6.MaterialCheckBox_errorShown, false);
        this.k = typedArray.getText(yt6.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArray.hasValue(yt6.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArray.getInt(yt6.MaterialCheckBox_checkedState, 0));
        }
        sk6VarE.G();
        a();
    }
}
