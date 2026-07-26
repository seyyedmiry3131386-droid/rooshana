package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends y {
    public static j3 e;
    public static j3 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(int i) {
        super(1, false);
        this.c = i;
    }

    public final void G(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    js3.V("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    js3.V("impl");
                    throw null;
                }
        }
    }

    public boolean H(int i) {
        if (i <= 0 || !I(i - 1)) {
            return false;
        }
        return i == o().length() || !I(i);
    }

    public boolean I(int i) {
        if (i < 0 || i >= o().length()) {
            return false;
        }
        return Character.isLetterOrDigit(o().codePointAt(i));
    }

    @Override // defpackage.y
    public final int[] g(int i) {
        switch (this.c) {
            case 0:
                int length = o().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        js3.V("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            js3.V("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return k(i, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        js3.V("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            default:
                if (o().length() <= 0 || i >= o().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!I(i) && (!I(i) || (i != 0 && I(i - 1)))) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        js3.V("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    js3.V("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i);
                if (iFollowing2 == -1 || !H(iFollowing2)) {
                    return null;
                }
                return k(i, iFollowing2);
        }
    }

    @Override // defpackage.y
    public final int[] w(int i) {
        switch (this.c) {
            case 0:
                int length = o().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        js3.V("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.d;
                        if (breakIterator2 == null) {
                            js3.V("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return k(iPreceding, i);
                    }
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        js3.V("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = o().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !I(i - 1) && !H(i)) {
                    BreakIterator breakIterator4 = this.d;
                    if (breakIterator4 == null) {
                        js3.V("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.d;
                if (breakIterator5 == null) {
                    js3.V("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i);
                if (iPreceding2 == -1 || !I(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !I(iPreceding2 - 1)) {
                    return k(iPreceding2, i);
                }
                return null;
        }
    }
}
