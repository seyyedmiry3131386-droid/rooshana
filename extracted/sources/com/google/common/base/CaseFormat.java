package com.google.common.base;

import defpackage.ja1;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class CaseFormat {
    public static final /* synthetic */ CaseFormat[] a = {new AnonymousClass1("LOWER_HYPHEN", 0), new AnonymousClass2("LOWER_UNDERSCORE", 1), new AnonymousClass3("LOWER_CAMEL", 2), new AnonymousClass4("UPPER_CAMEL", 3), new AnonymousClass5("UPPER_UNDERSCORE", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    CaseFormat EF5;

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$1, reason: invalid class name */
    public enum AnonymousClass1 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$2, reason: invalid class name */
    public enum AnonymousClass2 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$3, reason: invalid class name */
    public enum AnonymousClass3 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$4, reason: invalid class name */
    public enum AnonymousClass4 extends CaseFormat {
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$5, reason: invalid class name */
    public enum AnonymousClass5 extends CaseFormat {
    }

    public static final class StringConverter extends ja1 implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // defpackage.yp2
        public final boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // defpackage.ja1
        public final Object n(Object obj) {
            throw null;
        }

        public final String toString() {
            return "null.converterTo(null)";
        }
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) a.clone();
    }
}
