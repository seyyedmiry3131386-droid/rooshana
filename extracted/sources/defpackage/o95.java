package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o95 implements la1, ka1 {
    public final ArrayList a;
    public final bi6 b;
    public int c;
    public Priority d;
    public ka1 e;
    public List f;
    public boolean g;

    public o95(ArrayList arrayList, bi6 bi6Var) {
        this.b = bi6Var;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.ka1
    public final void a(Exception exc) {
        List list = this.f;
        ok4.p(list, "Argument must not be null");
        list.add(exc);
        b();
    }

    public final void b() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            e(this.d, this.e);
        } else {
            ok4.o(this.f);
            this.e.a(new GlideException("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.la1
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.d(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((la1) it.next()).c();
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((la1) it.next()).cancel();
        }
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return ((la1) this.a.get(0)).d();
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        this.d = priority;
        this.e = ka1Var;
        this.f = (List) this.b.e();
        ((la1) this.a.get(this.c)).e(priority, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.ka1
    public final void f(Object obj) {
        if (obj != null) {
            this.e.f(obj);
        } else {
            b();
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        return ((la1) this.a.get(0)).getDataClass();
    }
}
