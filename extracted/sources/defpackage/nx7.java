package defpackage;

import android.os.Bundle;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketMultiRadio;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nx7 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final MyketMultiRadio.Item[] c;
    public final int d;
    public final ThemeData e;

    public nx7(DialogDataModel dialogDataModel, String str, MyketMultiRadio.Item[] itemArr, int i, ThemeData themeData) {
        js3.p(itemArr, "checkBoxItems");
        this.a = dialogDataModel;
        this.b = str;
        this.c = itemArr;
        this.d = i;
        this.e = themeData;
    }

    public static final nx7 fromBundle(Bundle bundle) {
        return mx7.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx7)) {
            return false;
        }
        nx7 nx7Var = (nx7) obj;
        return js3.i(this.a, nx7Var.a) && js3.i(this.b, nx7Var.b) && js3.i(this.c, nx7Var.c) && this.d == nx7Var.d && js3.i(this.e, nx7Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        StringBuilder sbD = bl4.D("SingleSelectBottomDialogFragmentArgs(data=", this.a, ", title=", this.b, ", checkBoxItems=");
        sbD.append(string);
        sbD.append(", checkedItem=");
        sbD.append(this.d);
        sbD.append(", theme=");
        sbD.append(this.e);
        sbD.append(")");
        return sbD.toString();
    }
}
