package com.google.common.base;

import defpackage.pg;
import defpackage.sp0;
import defpackage.tp0;
import defpackage.wn5;
import defpackage.xg5;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {
    public String b;
    public final CharSequence c;
    public final sp0 d;
    public int f;
    public final /* synthetic */ xg5 g;
    public AbstractIterator$State a = AbstractIterator$State.b;
    public int e = 0;

    public c(xg5 xg5Var, pg pgVar, CharSequence charSequence) {
        this.g = xg5Var;
        this.d = (sp0) pgVar.c;
        this.f = pgVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractIterator$State abstractIterator$State;
        String string;
        sp0 sp0Var;
        AbstractIterator$State abstractIterator$State2 = this.a;
        AbstractIterator$State abstractIterator$State3 = AbstractIterator$State.d;
        wn5.t(abstractIterator$State2 != abstractIterator$State3);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.a = abstractIterator$State3;
            int i = this.e;
            while (true) {
                int length = this.e;
                abstractIterator$State = AbstractIterator$State.c;
                if (length == -1) {
                    this.a = abstractIterator$State;
                    string = null;
                    break;
                }
                tp0 tp0Var = (tp0) this.g.b;
                CharSequence charSequence = this.c;
                int length2 = charSequence.length();
                wn5.n(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (tp0Var.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.e = -1;
                } else {
                    this.e = length + 1;
                }
                int i2 = this.e;
                if (i2 == i) {
                    int i3 = i2 + 1;
                    this.e = i3;
                    if (i3 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    while (true) {
                        sp0Var = this.d;
                        if (i >= length || !sp0Var.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && sp0Var.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i4 = this.f;
                    if (i4 == 1) {
                        length = charSequence.length();
                        this.e = -1;
                        while (length > i && sp0Var.a(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f = i4 - 1;
                    }
                    string = charSequence.subSequence(i, length).toString();
                }
            }
            this.b = string;
            if (this.a != abstractIterator$State) {
                this.a = AbstractIterator$State.a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = AbstractIterator$State.b;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
