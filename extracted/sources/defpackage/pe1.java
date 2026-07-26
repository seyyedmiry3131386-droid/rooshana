package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements y72 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final do3 f = new do3(new gd1(4));
    public static final do3 g = new do3(new gd1(5));
    public ImmutableList a;
    public int d;
    public av c = new av(13);
    public boolean b = true;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new a3());
                break;
            case 1:
                arrayList.add(new c3());
                break;
            case 2:
                arrayList.add(new uc(0));
                break;
            case 3:
                arrayList.add(new xd());
                break;
            case 4:
                v72 v72VarP = f.p(0);
                if (v72VarP == null) {
                    arrayList.add(new rd2());
                } else {
                    arrayList.add(v72VarP);
                }
                break;
            case 5:
                arrayList.add(new bg2());
                break;
            case 6:
                arrayList.add(new uk4(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new p85(0));
                break;
            case 8:
                arrayList.add(new go2(this.c, this.b ? 0 : 32, null, ImmutableList.q()));
                arrayList.add(new u85(this.c, this.b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new wr5());
                break;
            case 10:
                arrayList.add(new un6());
                break;
            case 11:
                if (this.a == null) {
                    this.a = ImmutableList.q();
                }
                arrayList.add(new dt8(1, !this.b ? 1 : 0, this.c, new hm8(0L), new di1(0, this.a)));
                break;
            case 12:
                nc9 nc9Var = new nc9();
                nc9Var.c = 0;
                nc9Var.d = -1L;
                nc9Var.f = -1;
                nc9Var.g = -1L;
                arrayList.add(nc9Var);
                break;
            case 14:
                arrayList.add(new hg1(this.d));
                break;
            case 15:
                v72 v72VarP2 = g.p(new Object[0]);
                if (v72VarP2 != null) {
                    arrayList.add(v72VarP2);
                }
                break;
            case 16:
                arrayList.add(new y30(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new kd0(1));
                break;
            case 18:
                arrayList.add(new b40(2));
                break;
            case 19:
                arrayList.add(new kd0(0));
                break;
            case 20:
                arrayList.add(new b40(1));
                break;
            case 21:
                arrayList.add(new b40(0));
                break;
        }
    }

    @Override // defpackage.y72
    public final synchronized v72[] e(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iL0 = yq2.l0((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iL0 != -1) {
                a(iL0, arrayList);
            }
            int iM0 = yq2.m0(uri);
            if (iM0 != -1 && iM0 != iL0) {
                a(iM0, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iL0 && i2 != iM0) {
                    a(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (v72[]) arrayList.toArray(new v72[0]);
    }
}
