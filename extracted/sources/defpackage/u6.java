package defpackage;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes.dex */
public final class u6 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityChooserView b;

    public /* synthetic */ u6(ActivityChooserView activityChooserView, int i) {
        this.a = i;
        this.b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                super.onChanged();
                this.b.a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                this.b.a.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.a) {
            case 0:
                super.onInvalidated();
                this.b.a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
