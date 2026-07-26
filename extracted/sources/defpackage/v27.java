package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v27 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ v27(int i) {
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        c28 c28Var = null;
        ui8Var = null;
        ui8 ui8Var = null;
        ui8Var = null;
        ui8 ui8Var2 = null;
        c28Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                zu3 zu3Var = (zu3) obj;
                js3.p(zu3Var, "$this$Json");
                zu3Var.a = true;
                zu3Var.c = true;
                zu3Var.b = false;
                return tx8.a;
            case 1:
                yg9 yg9Var = (yg9) obj;
                js3.p(yg9Var, "entry");
                s26 s26Var = o67.f;
                return Boolean.valueOf(ol3.e(yg9Var.a));
            case 2:
                js3.p((hb1) obj, "config");
                throw new NotImplementedError();
            case 3:
                return new cd7((Map) obj);
            case 4:
                return obj;
            case 5:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                dp2 dp2Var = (dp2) xd7.h.c;
                Boolean bool = Boolean.FALSE;
                c28 c28Var2 = (js3.i(obj2, bool) || obj2 == null) ? null : (c28) dp2Var.invoke(obj2);
                Object obj3 = list.get(1);
                c28 c28Var3 = (js3.i(obj3, bool) || obj3 == null) ? null : (c28) dp2Var.invoke(obj3);
                Object obj4 = list.get(2);
                c28 c28Var4 = (js3.i(obj4, bool) || obj4 == null) ? null : (c28) dp2Var.invoke(obj4);
                Object obj5 = list.get(3);
                if (!js3.i(obj5, bool) && obj5 != null) {
                    c28Var = (c28) dp2Var.invoke(obj5);
                }
                return new ui8(c28Var2, c28Var3, c28Var4, c28Var);
            case 6:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (js3.i(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((dp2) xd7.a.c).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                js3.m(str);
                return new ll(list3, str);
            case 7:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new qg8(((Integer) obj).intValue());
            case 8:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new ci8(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                kj8[] kj8VarArr = jj8.b;
                dp2 dp2Var2 = xd7.v.b;
                Boolean bool2 = Boolean.FALSE;
                js3.i(obj8, bool2);
                jj8 jj8Var = obj8 != null ? (jj8) dp2Var2.invoke(obj8) : null;
                js3.m(jj8Var);
                long j = jj8Var.a;
                Object obj9 = list5.get(1);
                js3.i(obj9, bool2);
                jj8 jj8Var2 = obj9 != null ? (jj8) dp2Var2.invoke(obj9) : null;
                js3.m(jj8Var2);
                return new di8(j, jj8Var2.a);
            case 10:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new fj2(((Integer) obj).intValue());
            case 11:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Float");
                return new ba0(((Float) obj).floatValue());
            case 12:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                js3.m(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                js3.m(num2);
                return new zi8(uy6.b(iIntValue, num2.intValue()));
            case 13:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = zu0.i;
                Boolean bool3 = Boolean.FALSE;
                js3.i(obj12, bool3);
                zu0 zu0Var = obj12 != null ? js3.i(obj12, Boolean.FALSE) ? new zu0(zu0.h) : new zu0(gu9.d(((Integer) obj12).intValue())) : null;
                js3.m(zu0Var);
                long j2 = zu0Var.a;
                Object obj13 = list7.get(1);
                wd7 wd7Var = xd7.x;
                js3.i(obj13, bool3);
                nr5 nr5Var = obj13 != null ? (nr5) wd7Var.b.invoke(obj13) : null;
                js3.m(nr5Var);
                long j3 = nr5Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                js3.m(f);
                return new ur7(j2, j3, f.floatValue());
            case 14:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new of8(((Integer) obj).intValue());
            case 15:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                js3.m(str2);
                Object obj16 = list8.get(1);
                bn6 bn6Var = xd7.i;
                if (!js3.i(obj16, Boolean.FALSE) && obj16 != null) {
                    ui8Var2 = (ui8) ((dp2) bn6Var.c).invoke(obj16);
                }
                return new q74(str2, ui8Var2);
            case 16:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new ug8(((Integer) obj).intValue());
            case 17:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new af3(((Integer) obj).intValue());
            case 18:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i < size) {
                    Object obj17 = list9.get(i);
                    kl klVar = (js3.i(obj17, Boolean.FALSE) || obj17 == null) ? null : (kl) ((dp2) xd7.b.c).invoke(obj17);
                    js3.m(klVar);
                    arrayList.add(klVar);
                    i++;
                }
                return arrayList;
            case 19:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new si2(((Integer) obj).intValue());
            case 20:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new cj2(((Integer) obj).intValue());
            case 21:
                Boolean bool4 = Boolean.FALSE;
                if (js3.i(obj, bool4)) {
                    return new jj8(jj8.c);
                }
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                js3.m(f2);
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                wd7 wd7Var2 = xd7.w;
                js3.i(obj19, bool4);
                kj8 kj8Var = obj19 != null ? (kj8) wd7Var2.b.invoke(obj19) : null;
                js3.m(kj8Var);
                return new jj8(w07.h(fFloatValue, kj8Var.a));
            case 22:
                return js3.i(obj, 0) ? new kj8(8589934592L) : js3.i(obj, 1) ? new kj8(4294967296L) : new kj8(0L);
            case 23:
                if (js3.i(obj, Boolean.FALSE)) {
                    return new nr5(9205357640488583168L);
                }
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                js3.m(f3);
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                js3.m(f4);
                return new nr5((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 24:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    vc4 vc4Var = (js3.i(obj22, Boolean.FALSE) || obj22 == null) ? null : (vc4) ((dp2) xd7.z.c).invoke(obj22);
                    js3.m(vc4Var);
                    arrayList2.add(vc4Var);
                    i++;
                }
                return new wc4(arrayList2);
            case 25:
                js3.n(obj, "null cannot be cast to non-null type kotlin.String");
                return new vc4(q96.a.f((String) obj));
            case 26:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str3 = obj23 != null ? (String) obj23 : null;
                js3.m(str3);
                Object obj24 = list13.get(1);
                bn6 bn6Var2 = xd7.i;
                if (!js3.i(obj24, Boolean.FALSE) && obj24 != null) {
                    ui8Var = (ui8) ((dp2) bn6Var2.c).invoke(obj24);
                }
                return new p74(str3, ui8Var);
            case 27:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = w64.b;
                wd7 wd7Var3 = xd7.B;
                Boolean bool5 = Boolean.FALSE;
                js3.i(obj25, bool5);
                w64 w64Var = obj25 != null ? (w64) wd7Var3.b.invoke(obj25) : null;
                js3.m(w64Var);
                float f6 = w64Var.a;
                Object obj26 = list14.get(1);
                wd7 wd7Var4 = xd7.C;
                js3.i(obj26, bool5);
                y64 y64Var = obj26 != null ? (y64) wd7Var4.b.invoke(obj26) : null;
                js3.m(y64Var);
                int i3 = y64Var.a;
                Object obj27 = list14.get(2);
                wd7 wd7Var5 = xd7.D;
                js3.i(obj27, bool5);
                x64 x64Var = obj27 != null ? (x64) wd7Var5.b.invoke(obj27) : null;
                js3.m(x64Var);
                return new z64(f6, i3, x64Var.a);
            case 28:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj).floatValue();
                w64.a(fFloatValue3);
                return new w64(fFloatValue3);
            default:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new y64(((Integer) obj).intValue());
        }
    }
}
