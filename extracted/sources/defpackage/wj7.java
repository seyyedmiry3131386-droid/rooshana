package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ wj7(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qf9 qf9VarI;
        switch (this.a) {
            case 0:
                SearchView searchView = this.b;
                EditText editText = searchView.k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.A && (qf9VarI = q69.i(editText)) != null) {
                    qf9VarI.a.o(8);
                } else {
                    ((InputMethodManager) ContextCompat.getSystemService(editText.getContext(), InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            case 1:
                this.b.l();
                break;
            case 2:
                SearchView searchView2 = this.b;
                EditText editText2 = searchView2.k;
                editText2.clearFocus();
                o37.n(editText2, searchView2.A);
                break;
            default:
                this.b.j();
                break;
        }
    }
}
