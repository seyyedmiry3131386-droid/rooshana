package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class bv2 extends js3 {
    public final CharSequence i;
    public final TextPaint j;

    public bv2(CharSequence charSequence, TextPaint textPaint) {
        this.i = charSequence;
        this.j = textPaint;
    }

    @Override // defpackage.js3
    public final int H(int i) {
        CharSequence charSequence = this.i;
        return this.j.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.js3
    public final int K(int i) {
        CharSequence charSequence = this.i;
        return this.j.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
