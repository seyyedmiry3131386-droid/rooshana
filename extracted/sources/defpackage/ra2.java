package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ra2 extends k {
    public final qa2 a;
    public String b;
    public final StringBuilder c;

    public ra2(char c, int i, int i2) {
        qa2 qa2Var = new qa2();
        this.a = qa2Var;
        this.c = new StringBuilder();
        qa2Var.f = c;
        qa2Var.g = i;
        qa2Var.h = i2;
    }

    @Override // defpackage.k
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // defpackage.k
    public final void c() {
        String strA = r32.a(this.b.trim());
        qa2 qa2Var = this.a;
        qa2Var.i = strA;
        qa2Var.j = this.c.toString();
    }

    @Override // defpackage.k
    public final vc0 d() {
        return this.a;
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        int i = yq1Var.e;
        int i2 = yq1Var.b;
        CharSequence charSequence = yq1Var.a;
        int i3 = yq1Var.g;
        qa2 qa2Var = this.a;
        if (i3 < 4) {
            char c = qa2Var.f;
            int i4 = qa2Var.g;
            int iM = ub1.M(c, i, charSequence.length(), charSequence) - i;
            if (iM >= i4 && ub1.O(charSequence, i + iM, charSequence.length()) == charSequence.length()) {
                return new wc0(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = qa2Var.h; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return wc0.a(i2);
    }
}
