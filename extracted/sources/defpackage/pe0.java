package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ pe0(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                int i2 = BottomAppBar.y;
                view.requestLayout();
                break;
            case 1:
                view.requestFocus();
                view.post(new pe0(3, view));
                break;
            case 2:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
