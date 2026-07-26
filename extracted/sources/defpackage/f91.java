package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f91 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public f91(g91 g91Var) {
        this.b = new WeakReference(g91Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                g91 g91Var = (g91) this.b.get();
                if (g91Var != null) {
                    ArrayList arrayList = g91Var.b;
                    View view = g91Var.a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = g91Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = g91Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((a) ((ly7) it.next())).l(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(g91Var.c);
                                }
                                g91Var.c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                p99 p99Var = (p99) this.b.get();
                if (p99Var != null) {
                    ArrayList arrayList2 = p99Var.b;
                    View view2 = p99Var.a;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iA3 = p99Var.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iA4 = p99Var.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iA3 > 0 || iA3 == Integer.MIN_VALUE) {
                            if (iA4 > 0 || iA4 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((a) ((ly7) it2.next())).l(iA3, iA4);
                                }
                                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(p99Var.c);
                                }
                                p99Var.c = null;
                                arrayList2.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public f91(p99 p99Var) {
        this.b = new WeakReference(p99Var);
    }
}
