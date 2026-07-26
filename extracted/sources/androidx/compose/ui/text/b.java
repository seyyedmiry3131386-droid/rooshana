package androidx.compose.ui.text;

import defpackage.bn6;
import defpackage.c28;
import defpackage.dp2;
import defpackage.i49;
import defpackage.js3;
import defpackage.kl;
import defpackage.n09;
import defpackage.p16;
import defpackage.p74;
import defpackage.q74;
import defpackage.u78;
import defpackage.xd7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        p16 p16Var = null;
        p74Var = null;
        p74 p74Var = null;
        q74Var = null;
        q74 q74Var = null;
        n09Var = null;
        n09 n09Var = null;
        i49Var = null;
        i49 i49Var = null;
        c28Var = null;
        c28 c28Var = null;
        p16Var = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        js3.m(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        js3.m(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        js3.m(num2);
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        js3.m(str);
        switch (annotationType.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                bn6 bn6Var = xd7.g;
                if (!js3.i(obj6, Boolean.FALSE) && obj6 != null) {
                    p16Var = (p16) ((dp2) bn6Var.c).invoke(obj6);
                }
                js3.m(p16Var);
                return new kl(iIntValue, iIntValue2, p16Var, str);
            case 1:
                Object obj7 = list.get(1);
                bn6 bn6Var2 = xd7.h;
                if (!js3.i(obj7, Boolean.FALSE) && obj7 != null) {
                    c28Var = (c28) ((dp2) bn6Var2.c).invoke(obj7);
                }
                js3.m(c28Var);
                return new kl(iIntValue, iIntValue2, c28Var, str);
            case 2:
                Object obj8 = list.get(1);
                bn6 bn6Var3 = xd7.c;
                if (!js3.i(obj8, Boolean.FALSE) && obj8 != null) {
                    i49Var = (i49) ((dp2) bn6Var3.c).invoke(obj8);
                }
                js3.m(i49Var);
                return new kl(iIntValue, iIntValue2, i49Var, str);
            case 3:
                Object obj9 = list.get(1);
                bn6 bn6Var4 = xd7.d;
                if (!js3.i(obj9, Boolean.FALSE) && obj9 != null) {
                    n09Var = (n09) ((dp2) bn6Var4.c).invoke(obj9);
                }
                js3.m(n09Var);
                return new kl(iIntValue, iIntValue2, n09Var, str);
            case 4:
                Object obj10 = list.get(1);
                bn6 bn6Var5 = xd7.e;
                if (!js3.i(obj10, Boolean.FALSE) && obj10 != null) {
                    q74Var = (q74) ((dp2) bn6Var5.c).invoke(obj10);
                }
                js3.m(q74Var);
                return new kl(iIntValue, iIntValue2, q74Var, str);
            case 5:
                Object obj11 = list.get(1);
                bn6 bn6Var6 = xd7.f;
                if (!js3.i(obj11, Boolean.FALSE) && obj11 != null) {
                    p74Var = (p74) ((dp2) bn6Var6.c).invoke(obj11);
                }
                js3.m(p74Var);
                return new kl(iIntValue, iIntValue2, p74Var, str);
            case 6:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                js3.m(str2);
                return new kl(iIntValue, iIntValue2, new u78(str2), str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
