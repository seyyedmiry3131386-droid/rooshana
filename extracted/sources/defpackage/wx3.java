package defpackage;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wx3 {
    public final HashMap a;

    public wx3(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap(3);
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public float a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public void b(Class cls, bd0 bd0Var) {
        this.a.put(cls, bd0Var);
    }
}
