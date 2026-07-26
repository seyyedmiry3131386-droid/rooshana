package defpackage;

import android.widget.AbsListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class i94 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListPopupWindow a;

    public i94(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ListPopupWindow listPopupWindow = this.a;
        h94 h94Var = listPopupWindow.r;
        PopupWindow popupWindow = listPopupWindow.z;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        listPopupWindow.v.removeCallbacks(h94Var);
        h94Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
