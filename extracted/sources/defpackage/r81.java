package defpackage;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class r81 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r81(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                tb8 tb8Var = (tb8) this.b;
                tb8Var.a = true;
                tb8Var.notifyDataSetChanged();
                break;
            case 1:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.b;
                if (listPopupWindow.z.isShowing()) {
                    listPopupWindow.a();
                }
                break;
            case 2:
                ((TabLayout) this.b).l();
                break;
            default:
                ((ViewPager) this.b).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                tb8 tb8Var = (tb8) this.b;
                tb8Var.a = false;
                tb8Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((ListPopupWindow) this.b).dismiss();
                break;
            case 2:
                ((TabLayout) this.b).l();
                break;
            default:
                ((ViewPager) this.b).f();
                break;
        }
    }
}
