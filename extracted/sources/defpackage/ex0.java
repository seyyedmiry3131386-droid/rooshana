package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (dp2 dp2Var : (dp2[]) obj3) {
                    int iT = bt2.t((Comparable) dp2Var.invoke(obj), (Comparable) dp2Var.invoke(obj2));
                    if (iT != 0) {
                        return iT;
                    }
                }
                return 0;
            case 1:
                return ((Number) ((sy0) obj3).invoke(obj, obj2)).intValue();
            case 2:
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i2 = MaterialButtonGroup.k;
                materialButtonGroup.getClass();
                int iCompareTo = Boolean.valueOf(materialButton.o).compareTo(Boolean.valueOf(materialButton2.o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
            case 3:
                xm4 xm4Var = (xm4) obj3;
                return xm4Var.c(obj2) - xm4Var.c(obj);
            default:
                return ((Number) ((qp2) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
