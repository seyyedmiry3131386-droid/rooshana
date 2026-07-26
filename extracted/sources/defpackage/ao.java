package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class ao extends ListPopupWindow implements bo {
    public CharSequence D;
    public xn E;
    public final Rect F;
    public int G;
    public final /* synthetic */ AppCompatSpinner H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = appCompatSpinner;
        this.F = new Rect();
        this.o = appCompatSpinner;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new yn(0, this);
    }

    @Override // defpackage.bo
    public final CharSequence f() {
        return this.D;
    }

    @Override // defpackage.bo
    public final void h(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // defpackage.bo
    public final void l(int i) {
        this.G = i;
    }

    @Override // defpackage.bo
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.z;
        boolean zIsShowing = popupWindow.isShowing();
        s();
        popupWindow.setInputMethodMode(2);
        a();
        bx1 bx1Var = this.c;
        bx1Var.setChoiceMode(1);
        bx1Var.setTextDirection(i);
        bx1Var.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.H;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        bx1 bx1Var2 = this.c;
        if (popupWindow.isShowing() && bx1Var2 != null) {
            bx1Var2.setListSelectionHidden(false);
            bx1Var2.setSelection(selectedItemPosition);
            if (bx1Var2.getChoiceMode() != 0) {
                bx1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        v6 v6Var = new v6(2, this);
        viewTreeObserver.addOnGlobalLayoutListener(v6Var);
        popupWindow.setOnDismissListener(new zn(this, v6Var));
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, defpackage.bo
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.E = (xn) listAdapter;
    }

    public final void s() {
        int i;
        AppCompatSpinner appCompatSpinner = this.H;
        Rect rect = appCompatSpinner.h;
        PopupWindow popupWindow = this.z;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = ca9.a;
            i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i2 = appCompatSpinner.g;
        if (i2 == -2) {
            int iA = appCompatSpinner.a(this.E, popupWindow.getBackground());
            int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = ca9.a;
        this.f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.G) + i : paddingLeft + this.G + i;
    }
}
