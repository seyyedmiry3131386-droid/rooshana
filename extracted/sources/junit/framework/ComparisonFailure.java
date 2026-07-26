package junit.framework;

import defpackage.g;
import defpackage.tv8;

/* JADX INFO: loaded from: classes3.dex */
public class ComparisonFailure extends AssertionFailedError {
    private static final long serialVersionUID = 1;
    public String a;
    public String b;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.a;
        String str2 = this.b;
        g gVar = new g();
        gVar.a = str;
        String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return tv8.n(message, str, str2);
        }
        gVar.b = 0;
        int iMin = Math.min(str.length(), str2.length());
        while (true) {
            int i = gVar.b;
            if (i >= iMin || str.charAt(i) != str2.charAt(gVar.b)) {
                break;
            }
            gVar.b++;
        }
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i2 = gVar.b;
            if (length2 < i2 || length < i2 || str.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        gVar.c = str.length() - length;
        return tv8.n(message, gVar.a(str), gVar.a(str2));
    }
}
