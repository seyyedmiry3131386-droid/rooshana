package defpackage;

import android.database.DataSetObservable;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public abstract class kz5 {
    public final DataSetObservable a = new DataSetObservable();

    public abstract void a(int i, Object obj);

    public abstract void b();

    public abstract void c(Parcelable parcelable, ClassLoader classLoader);

    public final void d() {
        synchronized (this) {
        }
    }

    public abstract void e(ViewPager viewPager);
}
