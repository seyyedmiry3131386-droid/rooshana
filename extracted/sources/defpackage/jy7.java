package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class jy7 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final ig4 a = new ig4(1);
    public final nc2 b = new nc2(5);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(i29.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = i29.d(config) * i * i2;
        ig4 ig4Var = this.a;
        uh6 uh6VarC = (uh6) ((ArrayDeque) ig4Var.b).poll();
        if (uh6VarC == null) {
            uh6VarC = ig4Var.C();
        }
        iy7 iy7Var = (iy7) uh6VarC;
        iy7Var.b = iD;
        iy7Var.c = config;
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = hy7.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        } else {
            configArr = e;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i3++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                ig4Var.n(iy7Var);
                int iIntValue = num.intValue();
                uh6 uh6VarC2 = (uh6) ((ArrayDeque) ig4Var.b).poll();
                if (uh6VarC2 == null) {
                    uh6VarC2 = ig4Var.C();
                }
                iy7Var = (iy7) uh6VarC2;
                iy7Var.b = iIntValue;
                iy7Var.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.p(iy7Var);
        if (bitmap != null) {
            a(Integer.valueOf(iy7Var.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = i29.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        ig4 ig4Var = this.a;
        uh6 uh6VarC = (uh6) ((ArrayDeque) ig4Var.b).poll();
        if (uh6VarC == null) {
            uh6VarC = ig4Var.C();
        }
        iy7 iy7Var = (iy7) uh6VarC;
        iy7Var.b = iC;
        iy7Var.c = config;
        this.b.z(iy7Var, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(iy7Var.b));
        navigableMapD.put(Integer.valueOf(iy7Var.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbC = bl4.C("SizeConfigStrategy{groupedMap=");
        sbC.append(this.b);
        sbC.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbC.append(entry.getKey());
            sbC.append('[');
            sbC.append(entry.getValue());
            sbC.append("], ");
        }
        if (!map.isEmpty()) {
            sbC.replace(sbC.length() - 2, sbC.length(), "");
        }
        sbC.append(")}");
        return sbC.toString();
    }
}
