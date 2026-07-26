package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ad7 implements m37 {
    public td7 a;
    public fd7 b;
    public String c;
    public Object d;
    public Object[] e;
    public ed7 f;
    public final o06 g = new o06(14, this);

    public ad7(td7 td7Var, fd7 fd7Var, String str, Object obj, Object[] objArr) {
        this.a = td7Var;
        this.b = fd7Var;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.m37
    public final void a() {
        ed7 ed7Var = this.f;
        if (ed7Var != null) {
            ((sk6) ed7Var).K();
        }
    }

    public final void b() throws NoSuchMethodException, ClassNotFoundException, IOException {
        String strL;
        fd7 fd7Var = this.b;
        if (this.f != null) {
            throw new IllegalArgumentException(("entry(" + this.f + ") is not null").toString());
        }
        if (fd7Var != null) {
            o06 o06Var = this.g;
            Object objInvoke = o06Var.invoke();
            if (objInvoke == null || fd7Var.b(objInvoke)) {
                this.f = fd7Var.a(this.c, o06Var);
                return;
            }
            if (objInvoke instanceof q08) {
                q08 q08Var = (q08) objInvoke;
                if (q08Var.e() == th0.p || q08Var.e() == th0.t || q08Var.e() == hy2.r) {
                    strL = "MutableState containing " + q08Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strL = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strL = o37.l(objInvoke);
            }
            throw new IllegalArgumentException(strL);
        }
    }

    @Override // defpackage.m37
    public final void c() {
        ed7 ed7Var = this.f;
        if (ed7Var != null) {
            ((sk6) ed7Var).K();
        }
    }

    @Override // defpackage.m37
    public final void e() throws NoSuchMethodException, ClassNotFoundException, IOException {
        b();
    }
}
