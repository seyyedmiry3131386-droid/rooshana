package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class eh7 extends BaseAdapter {
    public final /* synthetic */ ScrollingTabContainerView a;

    public eh7(ScrollingTabContainerView scrollingTabContainerView) {
        this.a = scrollingTabContainerView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ((fh7) this.a.b.getChildAt(i)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i);
            throw null;
        }
        getItem(i);
        ScrollingTabContainerView scrollingTabContainerView = this.a;
        new fh7(scrollingTabContainerView, scrollingTabContainerView.getContext());
        throw null;
    }
}
