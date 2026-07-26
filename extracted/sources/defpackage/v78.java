package defpackage;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v78 extends gt4 implements ap2 {
    public final String d;
    public final ArrayList e;
    public final Object[] f;

    public v78(String str, Object[] objArr) {
        super((objArr.length + 1) * Native.i);
        this.e = new ArrayList();
        this.f = objArr;
        this.d = str;
        int i = 0;
        while (true) {
            ft4 ft4Var = null;
            if (i >= objArr.length) {
                A(Native.i * objArr.length, null);
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                xh5 xh5Var = new xh5(obj.toString(), str);
                this.e.add(xh5Var);
                ft4Var = xh5Var.a;
            }
            A(Native.i * i, ft4Var);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ap2
    public final void read() {
        ?? wideString;
        ?? r0 = this.f;
        boolean z = r0 instanceof fc9[];
        String str = this.d;
        boolean zEquals = "--WIDE-STRING--".equals(str);
        for (int i = 0; i < r0.length; i++) {
            Pointer pointerG = g(Native.i * i);
            if (pointerG != null) {
                wideString = zEquals ? Native.getWideString(pointerG, pointerG.a, 0L) : pointerG.i(str);
                if (z) {
                    wideString = new fc9(wideString);
                }
            } else {
                wideString = 0;
            }
            r0[i] = wideString;
        }
    }

    @Override // defpackage.gt4, com.sun.jna.Pointer
    public final String toString() {
        StringBuilder sbC = bl4.C("--WIDE-STRING--".equals(this.d) ? "const wchar_t*[]" : "const char*[]");
        sbC.append(Arrays.asList(this.f));
        return sbC.toString();
    }
}
