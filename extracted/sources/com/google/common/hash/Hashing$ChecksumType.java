package com.google.common.hash;

import defpackage.vb8;
import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Hashing$ChecksumType implements vb8 {
    public static final /* synthetic */ Hashing$ChecksumType[] a = {new AnonymousClass1("CRC_32", 0), new AnonymousClass2("ADLER_32", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Hashing$ChecksumType EF5;

    /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$1, reason: invalid class name */
    public enum AnonymousClass1 extends Hashing$ChecksumType {
        @Override // defpackage.vb8
        public final Object get() {
            return new CRC32();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$2, reason: invalid class name */
    public enum AnonymousClass2 extends Hashing$ChecksumType {
        @Override // defpackage.vb8
        public final Object get() {
            return new Adler32();
        }
    }

    public static Hashing$ChecksumType valueOf(String str) {
        return (Hashing$ChecksumType) Enum.valueOf(Hashing$ChecksumType.class, str);
    }

    public static Hashing$ChecksumType[] values() {
        return (Hashing$ChecksumType[]) a.clone();
    }
}
