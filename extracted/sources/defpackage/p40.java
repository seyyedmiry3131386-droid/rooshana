package defpackage;

import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import j$.util.Objects;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p40 implements tl2 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public ArrayList q;
    public final g r;
    public boolean s;
    public int t;
    public boolean u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p40(g gVar) {
        this();
        gVar.L();
        tk2 tk2Var = gVar.x;
        if (tk2Var != null) {
            tk2Var.t.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = gVar;
    }

    @Override // defpackage.tl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (g.N(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    public final void b(cn2 cn2Var) {
        this.a.add(cn2Var);
        cn2Var.d = this.b;
        cn2Var.e = this.c;
        cn2Var.f = this.d;
        cn2Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (g.N(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cn2 cn2Var = (cn2) arrayList.get(i2);
                d dVar = cn2Var.b;
                if (dVar != null) {
                    dVar.u += i;
                    if (g.N(2)) {
                        Objects.toString(cn2Var.b);
                        int i3 = cn2Var.b.u;
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            cn2 cn2Var = (cn2) arrayList.get(size);
            if (cn2Var.c) {
                if (cn2Var.a == 8) {
                    cn2Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = cn2Var.b.A;
                    cn2Var.a = 2;
                    cn2Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        cn2 cn2Var2 = (cn2) arrayList.get(i2);
                        if (cn2Var2.c && cn2Var2.b.A == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z, boolean z2) {
        if (this.s) {
            throw new IllegalStateException("commit already called");
        }
        if (g.N(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new nd4());
            i("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        g gVar = this.r;
        if (z3) {
            this.t = gVar.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            gVar.z(this, z);
        }
        return this.t;
    }

    public final void g() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.h = false;
        this.r.C(this, false);
    }

    public final void h(int i, d dVar, String str, int i2) {
        String str2 = dVar.S;
        if (str2 != null) {
            zm2.d(dVar, str2);
        }
        Class<?> cls = dVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = dVar.B;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(dVar);
                sb.append(": was ");
                throw new IllegalStateException(bl4.z(sb, dVar.B, " now ", str));
            }
            dVar.B = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + dVar + " with tag " + str + " to container view with no id");
            }
            int i3 = dVar.z;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + dVar + ": was " + dVar.z + " now " + i);
            }
            dVar.z = i;
            dVar.A = i;
        }
        b(new cn2(i2, dVar));
        dVar.v = this.r;
    }

    public final void i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cn2 cn2Var = (cn2) arrayList.get(i);
            switch (cn2Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + cn2Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cn2Var.b);
            if (z) {
                if (cn2Var.d != 0 || cn2Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cn2Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cn2Var.e));
                }
                if (cn2Var.f != 0 || cn2Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cn2Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cn2Var.g));
                }
            }
        }
    }

    public final void j(d dVar) {
        g gVar = dVar.v;
        if (gVar == null || gVar == this.r) {
            b(new cn2(3, dVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + dVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void k(int i, d dVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        h(i, dVar, str, 2);
    }

    public final void l(d dVar, Lifecycle$State lifecycle$State) {
        g gVar = dVar.v;
        g gVar2 = this.r;
        if (gVar != gVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + gVar2);
        }
        if (lifecycle$State == Lifecycle$State.b && dVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State + " after the Fragment has been created");
        }
        if (lifecycle$State == Lifecycle$State.a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        cn2 cn2Var = new cn2();
        cn2Var.a = 10;
        cn2Var.b = dVar;
        cn2Var.c = false;
        cn2Var.h = dVar.T;
        cn2Var.i = lifecycle$State;
        b(cn2Var);
    }

    public final void m(d dVar) {
        g gVar = dVar.v;
        if (gVar == null || gVar == this.r) {
            b(new cn2(8, dVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + dVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sbA = o40.A(128, "BackStackEntry{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sbA.append(" #");
            sbA.append(this.t);
        }
        if (this.i != null) {
            sbA.append(" ");
            sbA.append(this.i);
        }
        sbA.append("}");
        return sbA.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p40(p40 p40Var) {
        this();
        p40Var.r.L();
        tk2 tk2Var = p40Var.r.x;
        if (tk2Var != null) {
            tk2Var.t.getClassLoader();
        }
        for (cn2 cn2Var : p40Var.a) {
            ArrayList arrayList = this.a;
            cn2 cn2Var2 = new cn2();
            cn2Var2.a = cn2Var.a;
            cn2Var2.b = cn2Var.b;
            cn2Var2.c = cn2Var.c;
            cn2Var2.d = cn2Var.d;
            cn2Var2.e = cn2Var.e;
            cn2Var2.f = cn2Var.f;
            cn2Var2.g = cn2Var.g;
            cn2Var2.h = cn2Var.h;
            cn2Var2.i = cn2Var.i;
            arrayList.add(cn2Var2);
        }
        this.b = p40Var.b;
        this.c = p40Var.c;
        this.d = p40Var.d;
        this.e = p40Var.e;
        this.f = p40Var.f;
        this.g = p40Var.g;
        this.h = p40Var.h;
        this.i = p40Var.i;
        this.l = p40Var.l;
        this.m = p40Var.m;
        this.j = p40Var.j;
        this.k = p40Var.k;
        if (p40Var.n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.n = arrayList2;
            arrayList2.addAll(p40Var.n);
        }
        if (p40Var.o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.o = arrayList3;
            arrayList3.addAll(p40Var.o);
        }
        this.p = p40Var.p;
        this.t = -1;
        this.u = false;
        this.r = p40Var.r;
        this.s = p40Var.s;
        this.t = p40Var.t;
        this.u = p40Var.u;
    }

    public p40() {
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
