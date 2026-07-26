package defpackage;

import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.movie.ui.detail.review.a;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jx1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jx1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [ir.mservices.market.version2.fragments.base.BaseNavigationFragment, to1] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ir.mservices.market.version2.fragments.base.BaseNavigationFragment, to1] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ?? r7;
        Layout layout;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mx1 mx1Var = (mx1) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - mx1Var.o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        mx1Var.m = false;
                    }
                    mx1Var.t();
                    mx1Var.m = true;
                    mx1Var.o = SystemClock.uptimeMillis();
                }
                break;
            case 1:
                a aVar = (a) obj;
                ?? r72 = aVar.v;
                if (r72 != 0) {
                    r72.t(true);
                }
                if (motionEvent.getAction() == 1 && (r7 = aVar.v) != 0) {
                    r7.t(false);
                }
                break;
            case 2:
                ((MyketSwitch) obj).setClickable(false);
                break;
            case 3:
                MyketTextView myketTextView = (MyketTextView) obj;
                int i2 = MyketTextView.k;
                int action = motionEvent.getAction();
                if ((action == 0 || action == 1) && (layout = myketTextView.getLayout()) != null) {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((motionEvent.getY() - myketTextView.getTotalPaddingTop()) + myketTextView.getScrollY())), (int) ((motionEvent.getX() - myketTextView.getTotalPaddingLeft()) + myketTextView.getScrollX()));
                    CharSequence text = myketTextView.getText();
                    Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                    ClickableSpan[] clickableSpanArr = spannable != null ? (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class) : null;
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        if (action == 1) {
                            clickableSpanArr[0].onClick(myketTextView);
                        }
                    }
                }
                break;
            case 4:
                if (!((GestureDetector) obj).onTouchEvent(motionEvent) && motionEvent.getActionMasked() != 0) {
                    break;
                }
                break;
            case 5:
                SearchView searchView = (SearchView) obj;
                searchView.e.D.setAlpha(0.0f);
                searchView.e.C.setAlpha(0.0f);
                if (motionEvent.getAction() == 1 && searchView.k) {
                    searchView.c(false);
                }
                break;
            case 6:
                com.google.android.material.search.SearchView searchView2 = (com.google.android.material.search.SearchView) obj;
                int i3 = com.google.android.material.search.SearchView.E;
                if (searchView2.h()) {
                    searchView2.f();
                }
                break;
            default:
                gw0 gw0Var = ((SubmitCommentFragment) obj).b1;
                js3.m(gw0Var);
                if (gw0Var.w.hasFocus()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 8) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                break;
        }
        return false;
    }
}
