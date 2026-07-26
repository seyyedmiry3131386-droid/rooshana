package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class u02 extends re8 {
    public final /* synthetic */ int a;

    public /* synthetic */ u02(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // defpackage.re8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.vp7 r18, defpackage.rf0 r19, defpackage.u2 r20) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u02.a(vp7, rf0, u2):void");
    }

    @Override // defpackage.re8
    public final Collection b() {
        switch (this.a) {
            case 0:
                return Arrays.asList("i", "em", "cite", "dfn");
            case 1:
                return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
            case 2:
                return Collections.singleton("img");
            case 3:
                return Collections.singleton("a");
            case 4:
                return Arrays.asList("b", "strong");
            case 5:
                return Collections.singleton("sub");
            default:
                return Collections.singleton("sup");
        }
    }

    public u02(fv fvVar) {
        this.a = 2;
    }
}
