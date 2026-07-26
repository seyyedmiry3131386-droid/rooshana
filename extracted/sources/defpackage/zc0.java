package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zc0 extends k {
    public final xc0 a = new xc0();

    public static boolean h(yq1 yq1Var, int i) {
        CharSequence charSequence = yq1Var.a;
        return yq1Var.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // defpackage.k
    public final vc0 d() {
        return this.a;
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        char cCharAt;
        int i = yq1Var.e;
        if (!h(yq1Var, i)) {
            return null;
        }
        int i2 = yq1Var.c + yq1Var.g;
        int i3 = i2 + 1;
        CharSequence charSequence = yq1Var.a;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new wc0(-1, i3, false);
    }
}
