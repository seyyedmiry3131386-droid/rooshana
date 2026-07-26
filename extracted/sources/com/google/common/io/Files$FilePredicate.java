package com.google.common.io;

import defpackage.zi6;
import java.io.File;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Files$FilePredicate implements zi6 {
    public static final /* synthetic */ Files$FilePredicate[] a = {new Files$FilePredicate() { // from class: com.google.common.io.Files$FilePredicate.1
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return ((File) obj).isDirectory();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Files.isDirectory()";
        }
    }, new Files$FilePredicate() { // from class: com.google.common.io.Files$FilePredicate.2
        @Override // defpackage.zi6
        public final boolean apply(Object obj) {
            return ((File) obj).isFile();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Files.isFile()";
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    Files$FilePredicate EF2;

    public static Files$FilePredicate valueOf(String str) {
        return (Files$FilePredicate) Enum.valueOf(Files$FilePredicate.class, str);
    }

    public static Files$FilePredicate[] values() {
        return (Files$FilePredicate[]) a.clone();
    }
}
