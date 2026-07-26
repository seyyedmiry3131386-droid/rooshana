package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends js3 {
    public final BreakIterator i;

    public cv2(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.i = characterInstance;
    }

    @Override // defpackage.js3
    public final int H(int i) {
        return this.i.following(i);
    }

    @Override // defpackage.js3
    public final int K(int i) {
        return this.i.preceding(i);
    }
}
