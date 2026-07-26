package com.microsoft.clarity.g;

import defpackage.js3;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public final long i;

    public j0(String str, int i, String str2, String str3, String str4, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, long j) {
        js3.p(str, "hash");
        js3.p(linkedHashSet, "digitGlyphIds");
        js3.p(linkedHashSet2, "spaceGlyphId");
        js3.p(linkedHashSet3, "atSignGlyphId");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = linkedHashSet;
        this.g = linkedHashSet2;
        this.h = linkedHashSet3;
        this.i = j;
    }
}
