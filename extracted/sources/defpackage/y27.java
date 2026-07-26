package defpackage;

import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y27 {
    public final hh2 a;
    public final dj b;
    public final k41 c;
    public final hl5 d;
    public final pt2 e;
    public final ay2 f;
    public final dj g;
    public final nc2 h = new nc2(20);
    public final fa4 i = new fa4();
    public final wv8 j;

    public y27() {
        wv8 wv8Var = new wv8(new di6(20), new cv(20), new fv(20), false, 29);
        this.j = wv8Var;
        this.a = new hh2(wv8Var);
        this.b = new dj(1);
        this.c = new k41(1);
        this.d = new hl5(7);
        this.e = new pt2(1);
        this.f = new ay2(2);
        this.g = new dj(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        k41 k41Var = this.c;
        synchronized (k41Var) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(k41Var.a);
                k41Var.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k41Var.a.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        k41Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, r12 r12Var) {
        dj djVar = this.b;
        synchronized (djVar) {
            djVar.a.add(new t12(cls, r12Var));
        }
    }

    public final void b(Class cls, m67 m67Var) {
        hl5 hl5Var = this.d;
        synchronized (hl5Var) {
            ((ArrayList) hl5Var.b).add(new n67(cls, m67Var));
        }
    }

    public final void c(Class cls, Class cls2, bx4 bx4Var) {
        hh2 hh2Var = this.a;
        synchronized (hh2Var) {
            ((vp7) hh2Var.b).r(cls, cls2, bx4Var);
            ((HashMap) ((nm5) hh2Var.c).b).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, j67 j67Var) {
        k41 k41Var = this.c;
        synchronized (k41Var) {
            k41Var.b(str).add(new k67(cls, cls2, j67Var));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.c.c(cls, cls2)) {
            for (Class cls5 : this.f.h(cls4, cls3)) {
                k41 k41Var = this.c;
                synchronized (k41Var) {
                    arrayList = new ArrayList();
                    Iterator it = k41Var.a.iterator();
                    while (it.hasNext()) {
                        List<k67> list = (List) k41Var.b.get((String) it.next());
                        if (list != null) {
                            for (k67 k67Var : list) {
                                if (k67Var.a.isAssignableFrom(cls) && cls4.isAssignableFrom(k67Var.b)) {
                                    arrayList.add(k67Var.c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new yb1(cls, cls4, cls5, arrayList, this.f.f(cls4, cls5), this.j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        dj djVar = this.g;
        synchronized (djVar) {
            arrayList = djVar.a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        hh2 hh2Var = this.a;
        hh2Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (hh2Var) {
            cx4 cx4Var = (cx4) ((HashMap) ((nm5) hh2Var.c).b).get(cls);
            listUnmodifiableList = cx4Var == null ? null : cx4Var.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = DesugarCollections.unmodifiableList(((vp7) hh2Var.b).u(cls));
                if (((cx4) ((HashMap) ((nm5) hh2Var.c).b).put(cls, new cx4(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ax4 ax4Var = (ax4) listUnmodifiableList.get(i);
            if (ax4Var.b(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(ax4Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final ta1 h(Object obj) {
        ta1 ta1VarA;
        pt2 pt2Var = this.e;
        synchronized (pt2Var) {
            try {
                ok4.o(obj);
                sa1 sa1Var = (sa1) ((HashMap) pt2Var.b).get(obj.getClass());
                if (sa1Var == null) {
                    Iterator it = ((HashMap) pt2Var.b).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        sa1 sa1Var2 = (sa1) it.next();
                        if (sa1Var2.getDataClass().isAssignableFrom(obj.getClass())) {
                            sa1Var = sa1Var2;
                            break;
                        }
                    }
                }
                if (sa1Var == null) {
                    sa1Var = pt2.d;
                }
                ta1VarA = sa1Var.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ta1VarA;
    }

    public final void i(sa1 sa1Var) {
        pt2 pt2Var = this.e;
        synchronized (pt2Var) {
            ((HashMap) pt2Var.b).put(sa1Var.getDataClass(), sa1Var);
        }
    }

    public final void j(ei3 ei3Var) {
        dj djVar = this.g;
        synchronized (djVar) {
            djVar.a.add(ei3Var);
        }
    }

    public final void k(Class cls, Class cls2, w67 w67Var) {
        ay2 ay2Var = this.f;
        synchronized (ay2Var) {
            ay2Var.a.add(new eq8(cls, cls2, w67Var));
        }
    }

    public final void l(fb9 fb9Var) {
        hh2 hh2Var = this.a;
        synchronized (hh2Var) {
            Iterator it = ((vp7) hh2Var.b).w0(fb9Var).iterator();
            while (it.hasNext()) {
                ((bx4) it.next()).getClass();
            }
            ((HashMap) ((nm5) hh2Var.c).b).clear();
        }
    }
}
