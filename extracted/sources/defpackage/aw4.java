package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class aw4 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(ds7 ds7Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = ds7Var.b;
        ArrayList arrayList = ds7Var.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            j81 j81Var = (j81) arrayList.get(i);
            PointF pointF3 = j81Var.a;
            PointF pointF4 = j81Var.b;
            PointF pointF5 = j81Var.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (ds7Var.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return dw1.f(f2, f, f3, f);
    }

    public static void g(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2, ly3 ly3Var) {
        if (jy3Var.a(i, ly3Var.getName())) {
            String name = ly3Var.getName();
            jy3 jy3Var3 = new jy3(jy3Var2);
            jy3Var3.a.add(name);
            jy3 jy3Var4 = new jy3(jy3Var3);
            jy3Var4.b = ly3Var;
            arrayList.add(jy3Var4);
        }
    }
}
