package defpackage;

import androidx.compose.ui.node.h;
import androidx.media3.common.b;
import com.google.common.collect.p1;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ mh(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                return js3.r(((hk6) obj2).a, ((hk6) obj).a);
            case 1:
                return ((b) obj2).j - ((b) obj).j;
            case 2:
                return Integer.compare(((yn0) obj2).b, ((yn0) obj).b);
            case 3:
                return js3.r(((vs3) obj).b, ((vs3) obj2).b);
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((sh1) ((List) obj).get(0)).f, ((sh1) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i3 = 10;
                return bx0.g(bi1.c((bi1) Collections.max(list, new mh(9)), (bi1) Collections.max(list2, new mh(9)))).a(list.size(), list2.size()).c((bi1) Collections.max(list, new mh(i3)), (bi1) Collections.max(list2, new mh(i3)), new mh(i3)).f();
            case 7:
                return ((rh1) Collections.max((List) obj)).compareTo((rh1) Collections.max((List) obj2));
            case 8:
                return ((yh1) ((List) obj).get(0)).compareTo((yh1) ((List) obj2).get(0));
            case 9:
                return bi1.c((bi1) obj, (bi1) obj2);
            case 10:
                bi1 bi1Var = (bi1) obj;
                bi1 bi1Var2 = (bi1) obj2;
                boolean z = bi1Var.e;
                int i4 = bi1Var.j;
                p1 p1VarH = (z && bi1Var.h) ? ci1.l : ci1.l.h();
                boolean z2 = bi1Var.f.B;
                dx0 dx0VarC = dx0.a;
                if (z2) {
                    dx0VarC = dx0VarC.c(Integer.valueOf(i4), Integer.valueOf(bi1Var2.j), ci1.l.h());
                }
                return dx0VarC.c(Integer.valueOf(bi1Var.k), Integer.valueOf(bi1Var2.k), p1VarH).c(Integer.valueOf(i4), Integer.valueOf(bi1Var2.j), p1VarH).f();
            case 11:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b = bArr[i5];
                    byte b2 = bArr2[i5];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 12:
                return ((b03) obj).a.compareTo(((b03) obj2).a);
            case 13:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.b).intValue() - ((Number) pair.a).intValue()) - (((Number) pair2.b).intValue() - ((Number) pair2.a).intValue());
            case 14:
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                return hVar.J() == hVar2.J() ? js3.r(hVar.G(), hVar2.G()) : Float.compare(hVar.J(), hVar2.J());
            case 15:
                return js3.r(((w34) obj).a, ((w34) obj2).a);
            case 16:
                qk0 qk0Var = (qk0) obj;
                qk0 qk0Var2 = (qk0) obj2;
                long j = qk0Var.f;
                long j2 = qk0Var2.f;
                return j - j2 == 0 ? qk0Var.compareTo(qk0Var2) : j < j2 ? -1 : 1;
            case 17:
                ec7 ec7Var = (ec7) obj;
                ec7 ec7Var2 = (ec7) obj2;
                int i6 = ec7Var.b;
                int i7 = ec7Var2.b;
                if (i6 >= i7) {
                    if (i6 > i7 || (i = ec7Var.c) < (i2 = ec7Var2.c)) {
                        return 1;
                    }
                    if (i <= i2) {
                        return 0;
                    }
                }
                return -1;
            case 18:
                return ((zy7) obj).a - ((zy7) obj2).a;
            case 19:
                return Float.compare(((zy7) obj).c, ((zy7) obj2).c);
            case 20:
                j28 j28Var = (j28) obj;
                j28 j28Var2 = (j28) obj2;
                int iCompare = Integer.compare(j28Var2.b, j28Var.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = j28Var.c.compareTo(j28Var2.c);
                return iCompareTo != 0 ? iCompareTo : j28Var.d.compareTo(j28Var2.d);
            case 21:
                j28 j28Var3 = (j28) obj;
                j28 j28Var4 = (j28) obj2;
                int iCompare2 = Integer.compare(j28Var4.a, j28Var3.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = j28Var4.c.compareTo(j28Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : j28Var4.d.compareTo(j28Var3.d);
            case 22:
                return UpdateViewModel.updateAllComparator$lambda$0((s30) obj, (s30) obj2);
            case 23:
                return UpdateViewModel.comparator$lambda$0((AppUpdateData) obj, (AppUpdateData) obj2);
            case 24:
                return Integer.compare(((hd9) obj).a.b, ((hd9) obj2).a.b);
            default:
                return Long.compare(((gd9) obj).b, ((gd9) obj2).b);
        }
    }
}
