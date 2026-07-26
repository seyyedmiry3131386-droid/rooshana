package defpackage;

import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class h94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListPopupWindow b;

    public /* synthetic */ h94(ListPopupWindow listPopupWindow, int i) {
        this.a = i;
        this.b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bx1 bx1Var = this.b.c;
                if (bx1Var != null) {
                    bx1Var.setListSelectionHidden(true);
                    bx1Var.requestLayout();
                }
                break;
            default:
                ListPopupWindow listPopupWindow = this.b;
                bx1 bx1Var2 = listPopupWindow.c;
                if (bx1Var2 != null && bx1Var2.isAttachedToWindow() && listPopupWindow.c.getCount() > listPopupWindow.c.getChildCount() && listPopupWindow.c.getChildCount() <= listPopupWindow.m) {
                    listPopupWindow.z.setInputMethodMode(2);
                    listPopupWindow.a();
                    break;
                }
                break;
        }
    }
}
