package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ry6 implements b64 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ry6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        int iNextIndex;
        View view;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qd7 qd7Var = (qd7) obj2;
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                g64Var.D().f(this);
                Bundle bundleO = qd7Var.o().o("androidx.savedstate.Restarter");
                if (bundleO == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleO.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, ry6.class.getClassLoader()).asSubclass(od7.class);
                        js3.m(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                js3.m(objNewInstance);
                                if (!(qd7Var instanceof x79)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + qd7Var).toString());
                                }
                                u79 u79VarM = ((x79) qd7Var).m();
                                bn6 bn6VarO = qd7Var.o();
                                u79VarM.getClass();
                                LinkedHashMap linkedHashMap = u79VarM.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    js3.p(str2, "key");
                                    k79 k79Var = (k79) linkedHashMap.get(str2);
                                    if (k79Var != null) {
                                        m91.h(k79Var, bn6VarO, qd7Var.D());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    bn6VarO.v();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(dw1.n("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(o40.y("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj2;
                int i2 = ComponentActivity.u;
                if (componentActivity.e == null) {
                    ay0 ay0Var = (ay0) componentActivity.getLastNonConfigurationInstance();
                    if (ay0Var != null) {
                        componentActivity.e = ay0Var.a;
                    }
                    if (componentActivity.e == null) {
                        componentActivity.e = new u79();
                    }
                }
                componentActivity.a.f(this);
                return;
            case 2:
                new HashMap();
                zq2[] zq2VarArr = (zq2[]) obj2;
                if (zq2VarArr.length > 0) {
                    zq2 zq2Var = zq2VarArr[0];
                    throw null;
                }
                if (zq2VarArr.length <= 0) {
                    return;
                }
                zq2 zq2Var2 = zq2VarArr[0];
                throw null;
            case 3:
                hn1 hn1Var = (hn1) obj2;
                int i3 = gn1.a[lifecycle$Event.ordinal()];
                if (i3 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) g64Var;
                    Iterable iterable = (Iterable) hn1Var.b().e.a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (js3.i(((ei5) it.next()).f, dialogFragment.B)) {
                                return;
                            }
                        }
                    }
                    dialogFragment.z0();
                    return;
                }
                if (i3 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) g64Var;
                    for (Object obj3 : (Iterable) hn1Var.b().f.a.getValue()) {
                        if (js3.i(((ei5) obj3).f, dialogFragment2.B)) {
                            obj = obj3;
                        }
                    }
                    ei5 ei5Var = (ei5) obj;
                    if (ei5Var != null) {
                        hn1Var.b().c(ei5Var);
                        return;
                    }
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) g64Var;
                    for (Object obj4 : (Iterable) hn1Var.b().f.a.getValue()) {
                        if (js3.i(((ei5) obj4).f, dialogFragment3.B)) {
                            obj = obj4;
                        }
                    }
                    ei5 ei5Var2 = (ei5) obj;
                    if (ei5Var2 != null) {
                        hn1Var.b().c(ei5Var2);
                    }
                    dialogFragment3.U.f(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) g64Var;
                if (dialogFragment4.D0().isShowing()) {
                    return;
                }
                List list = (List) hn1Var.b().e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (js3.i(((ei5) listIterator.previous()).f, dialogFragment4.B)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                ei5 ei5Var3 = (ei5) a.q0(iNextIndex, list);
                if (!js3.i(a.v0(list), ei5Var3)) {
                    dialogFragment4.toString();
                }
                if (ei5Var3 != null) {
                    hn1Var.l(iNextIndex, ei5Var3, false);
                    return;
                }
                return;
            case 4:
                if (lifecycle$Event != Lifecycle$Event.ON_STOP || (view = ((d) obj2).J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                ((wm2) obj2).e(false);
                return;
            case 6:
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lifecycle$Event).toString());
                }
                g64Var.D().f(this);
                ((md7) obj2).b();
                return;
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    r69 r69Var = (r69) obj2;
                    r69Var.a = null;
                    r69Var.b = null;
                    return;
                }
                return;
        }
    }
}
