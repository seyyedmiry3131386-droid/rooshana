package com.google.common.collect;

import defpackage.wn5;

/* JADX INFO: loaded from: classes.dex */
final class Lists$StringAsImmutableList extends ImmutableList<Character> {
    public final String c;

    public Lists$StringAsImmutableList(String str) {
        this.c = str;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String str = this.c;
        wn5.l(i, str.length());
        return Character.valueOf(str.charAt(i));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return this.c.indexOf(((Character) obj).charValue());
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return this.c.lastIndexOf(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.length();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    /* JADX INFO: renamed from: y */
    public final ImmutableList subList(int i, int i2) {
        String str = this.c;
        wn5.o(i, i2, str.length());
        String strSubstring = str.substring(i, i2);
        strSubstring.getClass();
        return new Lists$StringAsImmutableList(strSubstring);
    }
}
