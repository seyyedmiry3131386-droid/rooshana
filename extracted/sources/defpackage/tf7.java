package defpackage;

import ir.mservices.market.app.detail.data.ScreenshotDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tf7 {
    public final ScreenshotDto a;
    public final List b;
    public final String c;

    public tf7(ScreenshotDto screenshotDto, List list, String str) {
        js3.p(screenshotDto, "selectedScreenShot");
        this.a = screenshotDto;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf7)) {
            return false;
        }
        tf7 tf7Var = (tf7) obj;
        return js3.i(this.a, tf7Var.a) && js3.i(this.b, tf7Var.b) && js3.i(this.c, tf7Var.c);
    }

    public final int hashCode() {
        int i = rm7.i(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenShotClickData(selectedScreenShot=");
        sb.append(this.a);
        sb.append(", _allScreenShot=");
        sb.append(this.b);
        sb.append(", title=");
        return dw1.s(sb, this.c, ")");
    }
}
