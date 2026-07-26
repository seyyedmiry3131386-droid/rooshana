package defpackage;

import kotlin.io.encoding.Base64$PaddingOption;

/* JADX INFO: loaded from: classes3.dex */
public class n50 {
    public static final m50 c;
    public final boolean a;
    public final boolean b;

    static {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
        c = new m50(false, false, -1);
        new n50(true, false, -1);
        new n50(false, true, 76);
        new n50(false, true, 64);
    }

    public n50(boolean z, boolean z2, int i) {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
        this.a = z;
        this.b = z2;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
