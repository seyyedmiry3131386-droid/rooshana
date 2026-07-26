package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 {
    public final bi6 a;
    public final List b;
    public final String c;

    public ea4(Class cls, Class cls2, Class cls3, List list, bi6 bi6Var) {
        this.a = bi6Var;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final g67 a(int i, int i2, ta1 ta1Var, do3 do3Var, sv5 sv5Var) {
        bi6 bi6Var = this.a;
        List list = (List) bi6Var.e();
        ok4.p(list, "Argument must not be null");
        try {
            List list2 = this.b;
            int size = list2.size();
            g67 g67VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    g67VarA = ((yb1) list2.get(i3)).a(i, i2, ta1Var, do3Var, sv5Var);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (g67VarA != null) {
                    break;
                }
            }
            if (g67VarA != null) {
                return g67VarA;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            bi6Var.d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
