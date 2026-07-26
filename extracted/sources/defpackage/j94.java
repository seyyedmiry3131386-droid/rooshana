package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class j94 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j94(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        switch (this.a) {
            case 0:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.b;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && (popupWindow = listPopupWindow.z) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.z.getWidth() && y >= 0 && y < listPopupWindow.z.getHeight()) {
                    listPopupWindow.v.postDelayed(listPopupWindow.r, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                listPopupWindow.v.removeCallbacks(listPopupWindow.r);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
