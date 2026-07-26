package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class e57 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final se3 b;
    public String c;
    public re3 d;
    public final rb4 e = new rb4(15);
    public final ay2 f;
    public dt4 g;
    public final boolean h;
    public final pa2 i;
    public final nc2 j;
    public b57 k;

    public e57(String str, se3 se3Var, String str2, by2 by2Var, dt4 dt4Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = se3Var;
        this.c = str2;
        this.g = dt4Var;
        this.h = z;
        if (by2Var != null) {
            this.f = by2Var.d();
        } else {
            this.f = new ay2(0);
        }
        if (z2) {
            this.j = new nc2(2);
            return;
        }
        if (z3) {
            pa2 pa2Var = new pa2(21);
            this.i = pa2Var;
            dt4 dt4Var2 = ka5.g;
            js3.p(dt4Var2, "type");
            if (dt4Var2.b.equals("multipart")) {
                pa2Var.b = dt4Var2;
            } else {
                throw new IllegalArgumentException(("multipart != " + dt4Var2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        nc2 nc2Var = this.j;
        if (z) {
            nc2Var.getClass();
            js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            ((ArrayList) nc2Var.b).add(hs9.t(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) nc2Var.c).add(hs9.t(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        nc2Var.getClass();
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        ((ArrayList) nc2Var.b).add(hs9.t(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) nc2Var.c).add(hs9.t(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = dt4.e;
                this.g = ok4.A(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(dw1.n("Malformed content type: ", str2), e);
            }
        }
        ay2 ay2Var = this.f;
        if (z) {
            ay2Var.d(str, str2);
        } else {
            ay2Var.a(str, str2);
        }
    }

    public final void c(by2 by2Var, b57 b57Var) {
        pa2 pa2Var = this.i;
        pa2Var.getClass();
        js3.p(b57Var, "body");
        if (by2Var.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (by2Var.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) pa2Var.d).add(new ja5(by2Var, b57Var));
    }

    public final void d(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            se3 se3Var = this.b;
            re3 re3VarG = se3Var.g(str3);
            this.d = re3VarG;
            if (re3VarG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + se3Var + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            re3 re3Var = this.d;
            re3Var.getClass();
            js3.p(str, "encodedName");
            if (((ArrayList) re3Var.i) == null) {
                re3Var.i = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) re3Var.i;
            js3.m(arrayList);
            arrayList.add(hs9.s(0, 0, 83, str, " \"'<>#&="));
            ArrayList arrayList2 = (ArrayList) re3Var.i;
            js3.m(arrayList2);
            arrayList2.add(str2 != null ? hs9.s(0, 0, 83, str2, " \"'<>#&=") : null);
            return;
        }
        re3 re3Var2 = this.d;
        re3Var2.getClass();
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (((ArrayList) re3Var2.i) == null) {
            re3Var2.i = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) re3Var2.i;
        js3.m(arrayList3);
        arrayList3.add(hs9.s(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = (ArrayList) re3Var2.i;
        js3.m(arrayList4);
        arrayList4.add(str2 != null ? hs9.s(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
