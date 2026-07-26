package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.webview.WebViewFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lk1 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                int i = DetailToolbarView.E;
                break;
            case 1:
                int i2 = MovieDetailRecyclerListFragment.H1;
                break;
            case 2:
                int i3 = SearchView.E;
                break;
            case 3:
                int i4 = TogoFragment.o1;
                int action = motionEvent.getAction();
                if ((action == 0 || action == 1) && !view.hasFocus()) {
                    view.requestFocus();
                }
                break;
            default:
                int i5 = WebViewFragment.c1;
                int action2 = motionEvent.getAction();
                if ((action2 == 0 || action2 == 1) && !view.hasFocus()) {
                    view.requestFocus();
                }
                break;
        }
        return false;
    }
}
