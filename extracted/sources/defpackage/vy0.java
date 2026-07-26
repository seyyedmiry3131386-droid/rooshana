package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vy0 implements qp2 {
    public static final vy0 b = new vy0(0);
    public static final vy0 c = new vy0(1);
    public static final vy0 d = new vy0(2);
    public static final vy0 e = new vy0(3);
    public static final vy0 f = new vy0(4);
    public static final vy0 g = new vy0(5);
    public static final vy0 h = new vy0(6);
    public static final vy0 i = new vy0(7);
    public static final vy0 j = new vy0(8);
    public static final vy0 k = new vy0(9);
    public static final vy0 l = new vy0(10);
    public static final vy0 m = new vy0(11);
    public static final vy0 n = new vy0(12);
    public static final vy0 o = new vy0(13);
    public static final vy0 p = new vy0(14);
    public static final vy0 q = new vy0(15);
    public static final vy0 r = new vy0(16);
    public static final vy0 s = new vy0(17);
    public static final vy0 t = new vy0(18);
    public final /* synthetic */ int a;

    public /* synthetic */ vy0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qz0Var.U();
                }
                return tx8.a;
            case 1:
                qz0 qz0Var2 = (qz0) obj;
                ((Number) obj2).intValue();
                qz0Var2.a0(-511854661);
                float f2 = ff0.a;
                WeakHashMap weakHashMap = rf9.w;
                s64 s64Var = new s64(js8.l(qz0Var2).l, 48);
                qz0Var2.q(false);
                return s64Var;
            case 2:
                h84 h84Var = (h84) obj2;
                js3.p(h84Var, "b");
                return Boolean.valueOf(js3.i(obj, h84Var.a));
            case 3:
                h84 h84Var2 = (h84) obj2;
                js3.p(h84Var2, "b");
                return Boolean.valueOf(js3.i(obj, h84Var2.a));
            case 4:
                return Boolean.valueOf(js3.i(obj, obj2));
            case 5:
                return Boolean.valueOf(js3.i(obj, obj2));
            case 6:
                return Boolean.valueOf(js3.i(obj, obj2));
            case 7:
                return Boolean.valueOf(js3.i(obj, obj2));
            case 8:
                h84 h84Var3 = (h84) obj2;
                js3.p(h84Var3, "b");
                return Boolean.valueOf(js3.i(obj, h84Var3.a));
            case 9:
                h84 h84Var4 = (h84) obj2;
                js3.p(h84Var4, "b");
                return Boolean.valueOf(js3.i(obj, h84Var4.a));
            case 10:
                h84 h84Var5 = (h84) obj;
                h84 h84Var6 = (h84) obj2;
                js3.p(h84Var5, "a");
                js3.p(h84Var6, "b");
                return Boolean.valueOf(js3.i(h84Var5.a, h84Var6.a));
            case 11:
                h84 h84Var7 = (h84) obj;
                h84 h84Var8 = (h84) obj2;
                js3.p(h84Var7, "a");
                js3.p(h84Var8, "b");
                return Boolean.valueOf(js3.i(h84Var7.a, h84Var8.a));
            case 12:
                h84 h84Var9 = (h84) obj;
                js3.p(h84Var9, "a");
                return Boolean.valueOf(js3.i(h84Var9.a, obj2));
            case 13:
                h84 h84Var10 = (h84) obj;
                js3.p(h84Var10, "a");
                return Boolean.valueOf(js3.i(h84Var10.a, obj2));
            case 14:
                h84 h84Var11 = (h84) obj;
                h84 h84Var12 = (h84) obj2;
                js3.p(h84Var11, "a");
                js3.p(h84Var12, "b");
                return Boolean.valueOf(js3.i(h84Var11.a, h84Var12.a));
            case 15:
                h84 h84Var13 = (h84) obj;
                h84 h84Var14 = (h84) obj2;
                js3.p(h84Var13, "a");
                js3.p(h84Var14, "b");
                return Boolean.valueOf(js3.i(h84Var13.a, h84Var14.a));
            case 16:
                h84 h84Var15 = (h84) obj;
                js3.p(h84Var15, "a");
                return Boolean.valueOf(js3.i(h84Var15.a, obj2));
            case 17:
                h84 h84Var16 = (h84) obj;
                js3.p(h84Var16, "a");
                return Boolean.valueOf(js3.i(h84Var16.a, obj2));
            default:
                long j2 = ((zu0) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(gu9.E(j2));
        }
    }
}
