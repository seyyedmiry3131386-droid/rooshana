package androidx.databinding;

import android.view.View;
import defpackage.a79;
import defpackage.ba1;
import io.sentry.android.core.t0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends ba1 {
    public final HashSet a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.ba1
    public final a79 b(int i, View view) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a79 a79VarB = ((ba1) it.next()).b(i, view);
            if (a79VarB != null) {
                return a79VarB;
            }
        }
        if (f()) {
            return b(i, view);
        }
        return null;
    }

    @Override // defpackage.ba1
    public final a79 c(int i, View[] viewArr) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a79 a79VarC = ((ba1) it.next()).c(i, viewArr);
            if (a79VarC != null) {
                return a79VarC;
            }
        }
        if (f()) {
            return c(i, viewArr);
        }
        return null;
    }

    @Override // defpackage.ba1
    public final int d(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int iD = ((ba1) it.next()).d(str);
            if (iD != 0) {
                return iD;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(ba1 ba1Var) {
        if (this.a.add(ba1Var.getClass())) {
            this.b.add(ba1Var);
            Iterator it = ba1Var.a().iterator();
            while (it.hasNext()) {
                e((ba1) it.next());
            }
        }
    }

    public final boolean f() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.c;
        boolean z = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (ba1.class.isAssignableFrom(cls)) {
                    e((ba1) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                t0.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                t0.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}
