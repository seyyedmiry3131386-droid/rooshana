package defpackage;

import android.util.SparseBooleanArray;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class fq4 {
    public static final xp7 e;
    public static final cb6 f;
    public final xp7 a;
    public final cb6 b;
    public final ImmutableList c;
    public final ImmutableList d;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashSet hashSet = new HashSet();
        ImmutableList immutableList = wp7.d;
        for (int i = 0; i < immutableList.size(); i++) {
            hashSet.add(new wp7(((Integer) immutableList.get(i)).intValue()));
        }
        e = new xp7(hashSet);
        HashSet hashSet2 = new HashSet();
        ImmutableList immutableList2 = wp7.e;
        for (int i2 = 0; i2 < immutableList2.size(); i2++) {
            hashSet2.add(new wp7(((Integer) immutableList2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            hashSet2.add(new wp7(((Integer) immutableList.get(i3)).intValue()));
        }
        new xp7(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : ql4.c) {
            vy2.s(!false);
            sparseBooleanArray.append(i4, true);
        }
        vy2.s(!false);
        f = new cb6(new vd2(sparseBooleanArray));
    }

    public fq4(xp7 xp7Var, cb6 cb6Var, ImmutableList immutableList, ImmutableList immutableList2) {
        this.a = xp7Var;
        this.b = cb6Var;
        this.c = immutableList;
        this.d = immutableList2;
    }
}
