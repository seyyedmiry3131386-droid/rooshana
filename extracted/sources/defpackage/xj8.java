package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.ui.platform.e;
import ir.myket.theme.common.colors.models.UiMode;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class xj8 {
    public final ri2 a;
    public final UiMode b;

    public xj8(ri2 ri2Var, UiMode uiMode) {
        js3.p(ri2Var, "themeStyle");
        js3.p(uiMode, "uiMode");
        this.a = ri2Var;
        this.b = uiMode;
    }

    public final boolean a(qz0 qz0Var) {
        Object d87Var;
        int iOrdinal = this.b.ordinal();
        boolean zBooleanValue = true;
        if (iOrdinal == 0) {
            qz0Var.a0(-442123152);
            qz0Var.q(false);
            return true;
        }
        if (iOrdinal == 1) {
            qz0Var.a0(-442100299);
            qz0Var.q(false);
            return false;
        }
        if (iOrdinal != 2) {
            qz0Var.a0(-152810398);
            qz0Var.q(false);
            throw new NoWhenBranchMatchedException();
        }
        qz0Var.a0(-152807921);
        qz0Var.a0(-644927168);
        if (Build.VERSION.SDK_INT >= 28) {
            d87Var = new e87(Boolean.valueOf((((Configuration) qz0Var.j(e.a)).uiMode & 48) == 32));
        } else {
            d87Var = new d87();
        }
        qz0Var.q(false);
        if (d87Var instanceof d87) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 19);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(11, 6);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            if (calendar.after(calendar3) && calendar.before(calendar2)) {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = ((Boolean) ((e87) d87Var).a).booleanValue();
        }
        qz0Var.q(false);
        return zBooleanValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj8)) {
            return false;
        }
        xj8 xj8Var = (xj8) obj;
        return js3.i(this.a, xj8Var.a) && this.b == xj8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ThemeState(themeStyle=" + this.a + ", uiMode=" + this.b + ")";
    }
}
