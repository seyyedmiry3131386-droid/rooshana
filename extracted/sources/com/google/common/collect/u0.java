package com.google.common.collect;

import com.google.common.collect.LinkedHashMultimap;
import defpackage.qq7;
import defpackage.s7;
import defpackage.w74;
import defpackage.y97;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends qq7 implements w74 {
    public final Object a;
    public final /* synthetic */ LinkedHashMultimap g;
    public int c = 0;
    public int d = 0;
    public w74 e = this;
    public w74 f = this;
    public LinkedHashMultimap.ValueEntry[] b = new LinkedHashMultimap.ValueEntry[y97.s(2, 1.0d)];

    public u0(LinkedHashMultimap linkedHashMultimap, Object obj) {
        this.g = linkedHashMultimap;
        this.a = obj;
    }

    @Override // defpackage.w74
    public final void a(w74 w74Var) {
        this.f = w74Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iB0 = y97.b0(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.b;
        int length = (valueEntryArr.length - 1) & iB0;
        LinkedHashMultimap.ValueEntry valueEntry = valueEntryArr[length];
        for (LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.d) {
            if (valueEntry2.c == iB0 && s7.l(valueEntry2.b, obj)) {
                return false;
            }
        }
        LinkedHashMultimap.ValueEntry valueEntry3 = new LinkedHashMultimap.ValueEntry(this.a, obj, iB0, valueEntry);
        w74 w74Var = this.f;
        w74Var.e(valueEntry3);
        valueEntry3.a(w74Var);
        valueEntry3.e(this);
        a(valueEntry3);
        LinkedHashMultimap linkedHashMultimap = this.g;
        LinkedHashMultimap.ValueEntry valueEntry4 = linkedHashMultimap.h.g;
        Objects.requireNonNull(valueEntry4);
        valueEntry4.h = valueEntry3;
        valueEntry3.g = valueEntry4;
        LinkedHashMultimap.ValueEntry valueEntry5 = linkedHashMultimap.h;
        valueEntry3.h = valueEntry5;
        valueEntry5.g = valueEntry3;
        LinkedHashMultimap.ValueEntry[] valueEntryArr2 = this.b;
        valueEntryArr2[length] = valueEntry3;
        int i = this.c + 1;
        this.c = i;
        this.d++;
        int length2 = valueEntryArr2.length;
        if (i > 1.0d * ((double) length2) && length2 < 1073741824) {
            int length3 = valueEntryArr2.length * 2;
            LinkedHashMultimap.ValueEntry[] valueEntryArr3 = new LinkedHashMultimap.ValueEntry[length3];
            this.b = valueEntryArr3;
            int i2 = length3 - 1;
            for (w74 w74VarC = this.e; w74VarC != this; w74VarC = w74VarC.c()) {
                LinkedHashMultimap.ValueEntry valueEntry6 = (LinkedHashMultimap.ValueEntry) w74VarC;
                int i3 = valueEntry6.c & i2;
                valueEntry6.d = valueEntryArr3[i3];
                valueEntryArr3[i3] = valueEntry6;
            }
        }
        return true;
    }

    @Override // defpackage.w74
    public final w74 c() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.b, (Object) null);
        this.c = 0;
        for (w74 w74VarC = this.e; w74VarC != this; w74VarC = w74VarC.c()) {
            LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) w74VarC;
            LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.g;
            Objects.requireNonNull(valueEntry2);
            LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry.h;
            Objects.requireNonNull(valueEntry3);
            valueEntry2.h = valueEntry3;
            valueEntry3.g = valueEntry2;
        }
        e(this);
        a(this);
        this.d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iB0 = y97.b0(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.b;
        for (LinkedHashMultimap.ValueEntry valueEntry = valueEntryArr[(valueEntryArr.length - 1) & iB0]; valueEntry != null; valueEntry = valueEntry.d) {
            if (valueEntry.c == iB0 && s7.l(valueEntry.b, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w74
    public final void e(w74 w74Var) {
        this.e = w74Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB0 = y97.b0(obj);
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.b;
        int length = (valueEntryArr.length - 1) & iB0;
        LinkedHashMultimap.ValueEntry valueEntry = null;
        for (LinkedHashMultimap.ValueEntry valueEntry2 = valueEntryArr[length]; valueEntry2 != null; valueEntry2 = valueEntry2.d) {
            if (valueEntry2.c == iB0 && s7.l(valueEntry2.b, obj)) {
                if (valueEntry == null) {
                    this.b[length] = valueEntry2.d;
                } else {
                    valueEntry.d = valueEntry2.d;
                }
                w74 w74Var = valueEntry2.e;
                Objects.requireNonNull(w74Var);
                w74 w74VarC = valueEntry2.c();
                w74Var.e(w74VarC);
                w74VarC.a(w74Var);
                LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry2.g;
                Objects.requireNonNull(valueEntry3);
                LinkedHashMultimap.ValueEntry valueEntry4 = valueEntry2.h;
                Objects.requireNonNull(valueEntry4);
                valueEntry3.h = valueEntry4;
                valueEntry4.g = valueEntry3;
                this.c--;
                this.d++;
                return true;
            }
            valueEntry = valueEntry2;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
