package defpackage;

import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class ro1 extends SimpleFileVisitor {
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        js3.p(gd1.e(obj), "dir");
        js3.p(basicFileAttributes, "attrs");
        basicFileAttributes.fileKey();
        throw null;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        js3.p(gd1.e(obj), "file");
        js3.p(basicFileAttributes, "attrs");
        throw null;
    }
}
