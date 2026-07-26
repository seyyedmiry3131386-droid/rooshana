package defpackage;

import androidx.lifecycle.Lifecycle$State;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bp4 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Cloneable h;

    public bp4(qd7 qd7Var, o06 o06Var) {
        this.d = qd7Var;
        this.e = o06Var;
        this.f = new ql3();
        this.g = new LinkedHashMap();
        this.c = true;
    }

    public void a() {
        qd7 qd7Var = (qd7) this.d;
        if (qd7Var.D().d != Lifecycle$State.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((o06) this.e).invoke();
        qd7Var.D().a(new bm2(3, this));
        this.a = true;
    }

    public bp4() {
        this.f = ImmutableMap.l();
        this.b = true;
        this.g = ImmutableList.q();
    }
}
