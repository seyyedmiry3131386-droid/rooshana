package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h28 implements Appendable, CharSequence {
    public final ArrayDeque b = new ArrayDeque(8);
    public final StringBuilder a = new StringBuilder((CharSequence) "");

    public h28() {
        b(0, "");
    }

    public static void c(h28 h28Var, Object obj, int i, int i2) {
        if (obj != null) {
            int length = h28Var.a.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            d(h28Var, obj, i, i2);
        }
    }

    public static void d(h28 h28Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                h28Var.b.push(new e28(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                d(h28Var, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.a.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof f28;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.b;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new e28(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    arrayDeque.push(new e28(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<e28> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.a;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.b;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    e28 e28Var = (e28) itDescendingIterator.next();
                    int i4 = e28Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = e28Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(e28Var);
                    }
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (e28 e28Var2 : listUnmodifiableList) {
            int iMax = Math.max(0, e28Var2.b - i);
            spannableStringBuilder.setSpan(e28Var2.a, iMax, Math.min(length2, (e28Var2.c - e28Var2.b) + iMax), e28Var2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.a;
        b(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.a;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
