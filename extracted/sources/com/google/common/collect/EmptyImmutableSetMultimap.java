package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    public static final EmptyImmutableSetMultimap i = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(RegularImmutableMap.g);
    }

    private Object readResolve() {
        return i;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.n1, defpackage.fa5
    public final Map h() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: l */
    public final ImmutableMap h() {
        return this.f;
    }
}
