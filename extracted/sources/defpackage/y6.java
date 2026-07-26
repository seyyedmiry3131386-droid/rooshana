package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ ActivityChooserView a;

    public y6(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        x6 x6Var = activityChooserView.a;
        if (view == activityChooserView.f) {
            activityChooserView.a();
            x6Var.getClass();
            throw null;
        }
        if (view != activityChooserView.d) {
            throw new IllegalArgumentException();
        }
        x6Var.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        b bVar;
        ot4 ot4Var;
        ActivityChooserView activityChooserView = this.a;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        l6 l6Var = activityChooserView.g;
        if (l6Var == null || (bVar = l6Var.a) == null || (ot4Var = bVar.c) == null) {
            return;
        }
        ot4Var.c(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((x6) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.a;
        activityChooserView.a();
        activityChooserView.a.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        if (view != activityChooserView.f) {
            throw new IllegalArgumentException();
        }
        activityChooserView.a.getClass();
        throw null;
    }
}
