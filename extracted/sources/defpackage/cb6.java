package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cb6 {
    public static final cb6 b;
    public static final String c;
    public final vd2 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        vy2.s(!false);
        b = new cb6(new vd2(sparseBooleanArray));
        String str = j29.a;
        c = Integer.toString(0, 36);
    }

    public cb6(vd2 vd2Var) {
        this.a = vd2Var;
    }

    public static cb6 b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            vy2.s(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        vy2.s(!false);
        return new cb6(new vd2(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            vd2 vd2Var = this.a;
            if (i >= vd2Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(vd2Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cb6) {
            return this.a.equals(((cb6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
