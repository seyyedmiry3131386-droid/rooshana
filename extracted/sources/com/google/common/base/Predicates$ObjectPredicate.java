package com.google.common.base;

import defpackage.zi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Predicates$ObjectPredicate implements zi6 {
    public static final /* synthetic */ Predicates$ObjectPredicate[] a = {new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.1
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return true;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.alwaysTrue()";
        }
    }, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.2
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return false;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.alwaysFalse()";
        }
    }, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.3
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return obj == null;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.isNull()";
        }
    }, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.4
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return obj != null;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.notNull()";
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    Predicates$ObjectPredicate EF2;

    public static Predicates$ObjectPredicate valueOf(String str) {
        return (Predicates$ObjectPredicate) Enum.valueOf(Predicates$ObjectPredicate.class, str);
    }

    public static Predicates$ObjectPredicate[] values() {
        return (Predicates$ObjectPredicate[]) a.clone();
    }
}
