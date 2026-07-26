package defpackage;

import android.view.ViewGroup;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class rr8 {
    public static final AutoTransition a = new AutoTransition();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = a;
        }
        Transition transitionClone = transition.clone();
        c(viewGroup, transitionClone);
        viewGroup.setTag(nr6.transition_current_scene, null);
        qr8 qr8Var = new qr8();
        qr8Var.a = transitionClone;
        qr8Var.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(qr8Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(qr8Var);
    }

    public static wv b() {
        wv wvVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (wvVar = (wv) weakReference.get()) != null) {
            return wvVar;
        }
        wv wvVar2 = new wv(0);
        threadLocal.set(new WeakReference(wvVar2));
        return wvVar2;
    }

    public static void c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).A(viewGroup);
            }
        }
        if (transition != null) {
            transition.h(viewGroup, true);
        }
        if (viewGroup.getTag(nr6.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
