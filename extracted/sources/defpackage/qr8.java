package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qr8 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public Transition a;
    public ViewGroup b;

    /* JADX WARN: Removed duplicated region for block: B:105:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5 A[EDGE_INSN: B:161:0x01e5->B:88:0x01e5 BREAK  A[LOOP:1: B:19:0x0087->B:87:0x01dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr8.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        rr8.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) rr8.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).E(viewGroup);
            }
        }
        this.a.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
