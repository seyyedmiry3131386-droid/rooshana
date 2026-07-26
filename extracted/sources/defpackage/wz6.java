package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.o;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wz6 {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            vz6 vz6Var = (vz6) sparseArray.valueAt(i);
            Iterator it = vz6Var.a.iterator();
            while (it.hasNext()) {
                zh6.a(((o) it.next()).a);
            }
            vz6Var.a.clear();
            i++;
        }
    }

    public final vz6 b(int i) {
        SparseArray sparseArray = this.a;
        vz6 vz6Var = (vz6) sparseArray.get(i);
        if (vz6Var != null) {
            return vz6Var;
        }
        vz6 vz6Var2 = new vz6();
        sparseArray.put(i, vz6Var2);
        return vz6Var2;
    }
}
