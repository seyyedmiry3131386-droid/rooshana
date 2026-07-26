package defpackage;

import android.content.Context;
import androidx.compose.ui.unit.LayoutDirection;
import ir.myket.analytics.spix.domain.usecase.a;
import ir.myket.network.server.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ae implements qp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ae(int i) {
        this.a = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                lf7 lf7Var = (lf7) obj;
                js3.p(lf7Var, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                Object objA = ((k87) lf7Var.b(g27.a(k87.class), null, new a88("SPIX"))).a(x28.class);
                js3.o(objA, "create(...)");
                return (x28) objA;
            case 1:
                lf7 lf7Var2 = (lf7) obj;
                js3.p(lf7Var2, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                hs5 hs5Var = (hs5) lf7Var2.b(g27.a(hs5.class), null, new a88("DEFAULT_OK_HTTP"));
                m87 m87Var = (m87) lf7Var2.b(g27.a(m87.class), null, null);
                k51 k51Var = (k51) lf7Var2.b(g27.a(k51.class), null, null);
                o77 o77Var = new o77(1);
                o77Var.i("https://spix.myket.ir");
                o77Var.a = hs5Var;
                ((ArrayList) o77Var.d).add(m87Var);
                ((ArrayList) o77Var.c).add(k51Var);
                return o77Var.j();
            case 2:
                lf7 lf7Var3 = (lf7) obj;
                js3.p(lf7Var3, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new z28((x28) lf7Var3.b(g27.a(x28.class), null, null), (j10) lf7Var3.b(g27.a(j10.class), null, null));
            case 3:
                lf7 lf7Var4 = (lf7) obj;
                js3.p(lf7Var4, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new a((y28) lf7Var4.b(g27.a(y28.class), null, null));
            case 4:
                return Integer.valueOf(Math.round((1 + (((LayoutDirection) obj2) != LayoutDirection.a ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 5:
                return Integer.valueOf(Math.round((1 + 0.0f) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 6:
                return Integer.valueOf(Math.round((1 + 1.0f) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 7:
                lf7 lf7Var5 = (lf7) obj;
                js3.p(lf7Var5, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new h10(0, (j10) lf7Var5.b(g27.a(j10.class), null, null));
            case 8:
                lf7 lf7Var6 = (lf7) obj;
                js3.p(lf7Var6, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new a10((Context) lf7Var6.b(g27.a(Context.class), null, null), (v00) lf7Var6.b(g27.a(v00.class), null, null), (j10) lf7Var6.b(g27.a(j10.class), null, null), (c) lf7Var6.b(g27.a(c.class), null, null));
            case 9:
                lf7 lf7Var7 = (lf7) obj;
                js3.p(lf7Var7, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new j10((ir.myket.persistent.datasource.a) lf7Var7.b(g27.a(ir.myket.persistent.datasource.a.class), null, null));
            case 10:
                lf7 lf7Var8 = (lf7) obj;
                Object objA2 = ((k87) lf7Var8.b(t61.f(lf7Var8, "$this$single", (b26) obj2, "<unused var>", k87.class), null, null)).a(v00.class);
                js3.o(objA2, "create(...)");
                return (v00) objA2;
            case 11:
                lf7 lf7Var9 = (lf7) obj;
                js3.p(lf7Var9, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new w27((Context) lf7Var9.b(g27.a(Context.class), null, null), (vo) lf7Var9.b(g27.a(vo.class), null, null), (j10) lf7Var9.b(g27.a(j10.class), null, null), (hs5) lf7Var9.b(g27.a(hs5.class), null, null));
            case 12:
                lf7 lf7Var10 = (lf7) obj;
                js3.p(lf7Var10, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new tr2();
            case 13:
                lf7 lf7Var11 = (lf7) obj;
                js3.p(lf7Var11, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new gt3();
            case 14:
                lf7 lf7Var12 = (lf7) obj;
                js3.p(lf7Var12, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new ht3();
            case 15:
                lf7 lf7Var13 = (lf7) obj;
                js3.p(lf7Var13, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new hq7((z00) lf7Var13.b(g27.a(z00.class), null, null));
            case 16:
                lf7 lf7Var14 = (lf7) obj;
                js3.p(lf7Var14, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new mq7();
            case 17:
                lf7 lf7Var15 = (lf7) obj;
                js3.p(lf7Var15, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new kn8((j10) lf7Var15.b(g27.a(j10.class), null, null), (w27) lf7Var15.b(g27.a(w27.class), null, null));
            case 18:
                lf7 lf7Var16 = (lf7) obj;
                js3.p(lf7Var16, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new xl0((rl0) lf7Var16.b(g27.a(rl0.class), null, null), (ul0) lf7Var16.b(g27.a(ul0.class), null, null));
            case 19:
                lf7 lf7Var17 = (lf7) obj;
                Object objA3 = ((k87) lf7Var17.b(t61.f(lf7Var17, "$this$single", (b26) obj2, "<unused var>", k87.class), null, null)).a(rl0.class);
                js3.o(objA3, "create(...)");
                return (rl0) objA3;
            case 20:
                lf7 lf7Var18 = (lf7) obj;
                js3.p(lf7Var18, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new fj1((wl0) lf7Var18.b(g27.a(wl0.class), null, null));
            case 21:
                lf7 lf7Var19 = (lf7) obj;
                js3.p(lf7Var19, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new rr2((wl0) lf7Var19.b(g27.a(wl0.class), null, null));
            case 22:
                lf7 lf7Var20 = (lf7) obj;
                js3.p(lf7Var20, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new im3((wl0) lf7Var20.b(g27.a(wl0.class), null, null));
            case 23:
                lf7 lf7Var21 = (lf7) obj;
                js3.p(lf7Var21, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new ko3((wl0) lf7Var21.b(g27.a(wl0.class), null, null));
            case 24:
                lf7 lf7Var22 = (lf7) obj;
                js3.p(lf7Var22, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new vn7((wl0) lf7Var22.b(g27.a(wl0.class), null, null));
            case 25:
                lf7 lf7Var23 = (lf7) obj;
                js3.p(lf7Var23, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new ir.myket.callback.manager.a((a) lf7Var23.b(g27.a(a.class), null, null), (vn7) lf7Var23.b(g27.a(vn7.class), null, null), (ko3) lf7Var23.b(g27.a(ko3.class), null, null), (rr2) lf7Var23.b(g27.a(rr2.class), null, null), (fj1) lf7Var23.b(g27.a(fj1.class), null, null), (im3) lf7Var23.b(g27.a(im3.class), null, null));
            case 26:
                js3.p((lf7) obj, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new wz();
            case 27:
                js3.p((lf7) obj, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new mt0();
            case 28:
                String str = (String) obj;
                u61 u61Var = (u61) obj2;
                js3.p(str, "acc");
                js3.p(u61Var, "element");
                if (str.length() == 0) {
                    return u61Var.toString();
                }
                return str + ", " + u61Var;
            default:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir.myket.player.ui.client.ad.components.a.a(new i8(4, new m8("com.digikala.firebolt", "سوپرمارکت فوری دیجی\u200cکالا", "خرید", "https://assets.myket.ir/icons/large/16f0391c-a2c6-42e8-ace1-0dc4132bb579.png", "https://srvtest.magnet.ir/api/appstore/v1/conversion/get?actType=11&cid=RUZDRUYxMTg3OUE1MjM5RThFRkVEQUNBRThFNUYwOTQjMCMwIzAjYmVhMzRhMTUtMWMzMC00NzQ5LWE3NjYtMDMxZTdhMWRkYWNiI2Q3MGZjYzA1LWVjYzMtNDk3MC05ZWU3LWEwNDc5MjliMzQxMyM4IzEjMjAyNS0xMS0wMlQxNjozNTowNSMwIzAjMCMwIzExIzIjIyMjIyMwIzAjMCMjIzAjIzAjIyMtMQ2&tpid=Test&rurl=", "https://trc.myket.ir/magnet/redirect/?packageName=com.digikala.firebolt&guid=f4b7ee83-dd0b-48bf-9817-b02c5e534119&downloadedCb=https%3a%2f%2fsrvtest.magnet.ir%2fapi%2fappstore%2fv1%2fconversion%2fget%3factType%3d12%26cid%3dRUZDRUYxMTg3OUE1MjM5RThFRkVEQUNBRThFNUYwOTQjMCMwIzAjYmVhMzRhMTUtMWMzMC00NzQ5LWE3NjYtMDMxZTdhMWRkYWNiI2Q3MGZjYzA1LWVjYzMtNDk3MC05ZWU3LWEwNDc5MjliMzQxMyM4IzEjMjAyNS0xMS0wMlQxNjozNTowNSMwIzAjMCMwIzEyIzIjIyMjIyMwIzAjMCMjIzAjIzAjIyMtMQ2%26tpid%3dTest&installedCb=https%3a%2f%2fsrvtest.magnet.ir%2fapi%2fappstore%2fv1%2fconversion%2fget%3factType%3d13%26cid%3dRUZDRUYxMTg3OUE1MjM5RThFRkVEQUNBRThFNUYwOTQjMCMwIzAjYmVhMzRhMTUtMWMzMC00NzQ5LWE3NjYtMDMxZTdhMWRkYWNiI2Q3MGZjYzA1LWVjYzMtNDk3MC05ZWU3LWEwNDc5MjliMzQxMyM4IzEjMjAyNS0xMS0wMlQxNjozNTowNSMwIzAjMCMwIzEzIzIjIyMjIyMwIzAjMCMjIzAjIzAjIyMtMQ2%26tpid%3dTest")), qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                return tx8.a;
        }
    }

    public /* synthetic */ ae(int i, Object obj) {
        this.a = i;
    }
}
