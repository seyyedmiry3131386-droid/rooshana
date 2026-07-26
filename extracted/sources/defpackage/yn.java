package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.ListFragment;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class yn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.a) {
            case 0:
                ao aoVar = (ao) this.b;
                AppCompatSpinner appCompatSpinner = aoVar.H;
                appCompatSpinner.setSelection(i);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i, aoVar.E.getItemId(i));
                }
                aoVar.dismiss();
                break;
            case 1:
                ((ListFragment) this.b).getClass();
                break;
            case 2:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.b;
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.e;
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(i < 0 ? !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedView();
                        i = !listPopupWindow.z.isShowing() ? -1 : listPopupWindow.c.getSelectedItemPosition();
                        j = !listPopupWindow.z.isShowing() ? Long.MIN_VALUE : listPopupWindow.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(listPopupWindow.c, view, i, j);
                }
                listPopupWindow.dismiss();
                break;
            default:
                ((SearchView) this.b).n(i);
                break;
        }
    }
}
