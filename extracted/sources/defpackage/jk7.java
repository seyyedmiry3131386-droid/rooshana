package defpackage;

import android.animation.Animator;
import ir.mservices.market.common.search.a;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class jk7 implements Animator.AnimatorListener {
    public final /* synthetic */ SearchView a;
    public final /* synthetic */ boolean b;

    public jk7(SearchView searchView, boolean z) {
        this.a = searchView;
        this.b = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        js3.p(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        js3.p(animator, "animation");
        SearchView searchView = this.a;
        MyketEditText myketEditText = searchView.getBinding().G;
        boolean z = this.b;
        myketEditText.setLongClickable(!z);
        if (z) {
            searchView.getBinding().G.clearFocus();
            return;
        }
        searchView.f();
        searchView.p = String.valueOf(searchView.getBinding().G.getText());
        hk7 searchCallback = searchView.getSearchCallback();
        if (searchCallback != null) {
            ((a) searchCallback).c(searchView.p);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        js3.p(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        js3.p(animator, "animation");
    }
}
