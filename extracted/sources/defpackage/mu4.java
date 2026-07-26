package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mu4 implements v26, lv2 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final lu4 e;

    public mu4(lu4 lu4Var) {
        this.e = lu4Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            v26 v26Var = (v26) arrayList.get(size);
            if (v26Var instanceof y31) {
                y31 y31Var = (y31) v26Var;
                ArrayList arrayList2 = (ArrayList) y31Var.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathM = ((v26) arrayList2.get(size2)).m();
                    Matrix matrixE = y31Var.d;
                    kq8 kq8Var = y31Var.l;
                    if (kq8Var != null) {
                        matrixE = kq8Var.e();
                    } else {
                        matrixE.reset();
                    }
                    pathM.transform(matrixE);
                    path.addPath(pathM);
                }
            } else {
                path.addPath(v26Var.m());
            }
        }
        int i = 0;
        v26 v26Var2 = (v26) arrayList.get(0);
        if (v26Var2 instanceof y31) {
            y31 y31Var2 = (y31) v26Var2;
            List listE = y31Var2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathM2 = ((v26) arrayList3.get(i)).m();
                Matrix matrixE2 = y31Var2.d;
                kq8 kq8Var2 = y31Var2.l;
                if (kq8Var2 != null) {
                    matrixE2 = kq8Var2.e();
                } else {
                    matrixE2.reset();
                }
                pathM2.transform(matrixE2);
                path2.addPath(pathM2);
                i++;
            }
        } else {
            path2.set(v26Var2.m());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((v26) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.lv2
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            r31 r31Var = (r31) listIterator.previous();
            if (r31Var instanceof v26) {
                this.d.add((v26) r31Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.v26
    public final Path m() {
        Path path = this.c;
        path.reset();
        lu4 lu4Var = this.e;
        if (!lu4Var.b) {
            int iOrdinal = lu4Var.a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((v26) arrayList.get(i)).m());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
