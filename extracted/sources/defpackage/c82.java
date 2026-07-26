package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.ScrollingTabContainerView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.g;

/* JADX INFO: loaded from: classes.dex */
public final class c82 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c82(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                break;
            case 1:
                y82 y82Var = (y82) obj;
                if (this.b) {
                    this.b = false;
                } else if (((Float) y82Var.z.getAnimatedValue()).floatValue() != 0.0f) {
                    y82Var.A = 2;
                    y82Var.s.invalidate();
                } else {
                    y82Var.A = 0;
                    y82Var.g(0);
                }
                break;
            case 2:
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) obj;
                if (!this.b) {
                    scrollingTabContainerView.setVisibility(0);
                    break;
                }
                break;
            default:
                g gVar = (g) obj;
                EditText editText = gVar.j;
                boolean z = this.b;
                g.a(gVar, z ? 1.0f : 0.0f);
                editText.setAlpha(1.0f);
                SearchBar searchBar = gVar.p;
                if (searchBar != null) {
                    searchBar.getTextView().setAlpha(1.0f);
                }
                editText.setClipBounds(null);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = gVar.c;
                clippableRoundedCornerLayout.a = null;
                clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                clippableRoundedCornerLayout.invalidate();
                if (!z) {
                    gVar.n.l = null;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((ScrollingTabContainerView) this.c).setVisibility(0);
                this.b = false;
                break;
            case 3:
                g.a((g) this.c, this.b ? 0.0f : 1.0f);
                break;
        }
    }

    public c82(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }

    public c82(g gVar, boolean z) {
        this.a = 3;
        this.c = gVar;
        this.b = z;
    }
}
